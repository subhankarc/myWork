package com.sap.casestudy.subhankar.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

import com.sap.casestudy.subhankar.ui.views.DUTreeNode;
import com.sap.casestudy.subhankar.ui.wizard.CreateDUWizard;

public class CreateDeploymentUnitHandler extends AbstractHandler {
	IProject project = null;
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
					if (element instanceof IProject) {
						project = (IProject) element;
						flag = true;
						CreateDUWizard duWizard = new CreateDUWizard(project);
						WizardDialog wizardDialog = new WizardDialog(Display
								.getCurrent().getActiveShell(), duWizard);
						wizardDialog.open();
					} else if (element instanceof DUTreeNode) {
						flag = true;
						CreateDUWizard duWizard = new CreateDUWizard(
								((DUTreeNode) element).getProject());
						WizardDialog wizardDialog = new WizardDialog(Display
								.getCurrent().getActiveShell(), duWizard);
						wizardDialog.open();
					}
				}
			}
		} 
			if (project == null && !flag) {

				WizardDialog wizardDialog = new WizardDialog(Display
						.getCurrent().getActiveShell(), new CreateDUWizard());
				wizardDialog.open();
			}
		
		return null;
	}

}
