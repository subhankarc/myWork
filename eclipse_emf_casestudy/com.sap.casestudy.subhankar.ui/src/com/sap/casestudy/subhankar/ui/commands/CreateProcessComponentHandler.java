package com.sap.casestudy.subhankar.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.ui.views.PCTreeNode;
import com.sap.casestudy.subhankar.ui.wizard.CreatePCWizard;

public class CreateProcessComponentHandler extends AbstractHandler {
	DeploymentUnit deploymentUnit;
	private boolean flag = false;

	@SuppressWarnings("unchecked")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event)
				.getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			for (Iterator<Object> iterator = strucSelection.iterator(); iterator
					.hasNext();) {
				Object element = iterator.next();
				if (element != null) {
					if (element instanceof DeploymentUnit) {
						deploymentUnit = (DeploymentUnit) element;
						flag = true;
						CreatePCWizard pcWizard = new CreatePCWizard(
								deploymentUnit);
						WizardDialog wizardDialog = new WizardDialog(Display
								.getCurrent().getActiveShell(), pcWizard);
						wizardDialog.open();
					} else if (element instanceof PCTreeNode) {
						flag = true;
						CreatePCWizard pcWizard = new CreatePCWizard(
								((PCTreeNode) element).getDeploymentUnit());
						WizardDialog wizardDialog = new WizardDialog(Display
								.getCurrent().getActiveShell(), pcWizard);
						wizardDialog.open();
					}
				}
			}
		}
		if (deploymentUnit == null && !flag) {

			WizardDialog wizardDialog = new WizardDialog(Display.getCurrent()
					.getActiveShell(), new CreatePCWizard());
			wizardDialog.open();
		}

		return null;
	}

}
