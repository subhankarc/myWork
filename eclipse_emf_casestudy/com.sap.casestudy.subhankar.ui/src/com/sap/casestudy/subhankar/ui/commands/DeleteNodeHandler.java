package com.sap.casestudy.subhankar.ui.commands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;
import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.persistence.IPersistenceFactory;
import com.sap.casestudy.subhankar.ui.util.MTSCreateUtilityClass;
import com.sap.casestudy.subhankar.ui.views.DUTreeNode;

public class DeleteNodeHandler extends AbstractHandler {

	private IProject project;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event)
				.getActivePage().getSelection();
		IStructuredSelection structSelection = (IStructuredSelection) selection;
		Object selectedNode = structSelection.getFirstElement();

		if (selectedNode instanceof IProject) {
			boolean deleteAction = MessageDialog.openConfirm(Display
					.getCurrent().getActiveShell(), "Confirm",
					"Are you sure you want to delete ?");
			if (deleteAction) {
				project = (IProject) selectedNode;
				try {
					project.delete(true, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}

			}
		}

		else if (selectedNode instanceof IAdtMainObject) {
			boolean deleteAction = MessageDialog.openConfirm(Display
					.getCurrent().getActiveShell(), "Confirm",
					"Are you sure you want to delete ?");
			if (deleteAction) {
				try {
					IAdtMainObject deleteObj = ((IAdtMainObject) selectedNode);

					IAdtMainObject eContainer = null;

					List<IAdtMainObject> itemsToDelete = new ArrayList<IAdtMainObject>();
					itemsToDelete.add(deleteObj);

					if (deleteObj instanceof DeploymentUnit) {
						eContainer = (DeploymentUnit) deleteObj;
						List<ProcessComponent> pcs = ((DeploymentUnit) deleteObj)
								.getProcessComponents();
						Iterator<ProcessComponent> itr = pcs.iterator();
						while (itr.hasNext()) {
							ProcessComponent pc = itr.next();
							itemsToDelete.add(pc);
							itemsToDelete.addAll(pc.getBusinessObjects());
						}

					} else if (deleteObj instanceof ProcessComponent) {
						ProcessComponent pc = (ProcessComponent) deleteObj;

						eContainer = pc.getDeploymentUnit();
						itemsToDelete.addAll(pc.getBusinessObjects());

						// eContainer.eCrossReferences().remove(bu);
					} else if (deleteObj instanceof BusinessObject) {
						BusinessObject bo = (BusinessObject) deleteObj;
						ProcessComponent pc = ((BusinessObject) deleteObj)
								.getProcessComponent();

						eContainer = pc;

					}

					String buFileURI = deleteObj.eResource().getURI()
							.toFileString();
					IPath wsLocation = ResourcesPlugin.getWorkspace().getRoot()
							.getLocation();
					String string = wsLocation.toString();
					String wsPath = buFileURI.substring(string.length());
					IFile wsFile = ResourcesPlugin.getWorkspace().getRoot()
							.getFile(new Path(wsPath));
					project = wsFile.getProject();

					Iterator<IAdtMainObject> itr = itemsToDelete.iterator();

					while (itr.hasNext()) {
						itr.next().eResource().delete(Collections.EMPTY_MAP);
					}

					EcoreUtil.delete(deleteObj, true);

					if (!(deleteObj instanceof DeploymentUnit)) {
						IPath prolocation = project.getLocation();
						String osString = prolocation.toOSString();
						IPath path = project.getFullPath();

						IPersistenceFactory.implinstance.getInstance(osString)
								.save(eContainer, path);
					} else {
						// DUTreeNode deploymentUnitTreeNode = DUTreeNode
						// .getInstance(project);
						//
						// deploymentUnitTreeNode
						// .deleteDeploymentUnit((DeploymentUnit) deleteObj);

						DUTreeNode deployTree = (DUTreeNode) MTSCreateUtilityClass
								.getCreateUtilClass().getTreeUtil()
								.getProject_DUMap().get(project)[0];
						deployTree.getDeploymentUnitList().remove(deleteObj);

					}

					project.refreshLocal(IResource.DEPTH_INFINITE, null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return null;
	}

}
