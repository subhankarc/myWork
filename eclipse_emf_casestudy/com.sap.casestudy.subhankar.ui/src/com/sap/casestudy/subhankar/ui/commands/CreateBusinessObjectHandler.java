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

import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.ui.views.BOTreeNode;
import com.sap.casestudy.subhankar.ui.wizard.CreateBOWizard;

public class CreateBusinessObjectHandler extends AbstractHandler {
	ProcessComponent pc;
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
					if (element instanceof ProcessComponent) {
						pc = (ProcessComponent) element;
						flag = true;
						CreateBOWizard boWizard = new CreateBOWizard(pc);
						WizardDialog wizardDialog = new WizardDialog(Display
								.getCurrent().getActiveShell(), boWizard);
						wizardDialog.open();
					} else if (element instanceof BOTreeNode) {
						flag = true;
						CreateBOWizard boWizard = new CreateBOWizard(
								((BOTreeNode) element).getProcessComponent());
						WizardDialog wizardDialog = new WizardDialog(Display
								.getCurrent().getActiveShell(), boWizard);
						wizardDialog.open();
					}
				}
			}
		}
		if (pc == null && !flag) {

			WizardDialog wizardDialog = new WizardDialog(Display.getCurrent()
					.getActiveShell(), new CreateBOWizard());
			wizardDialog.open();
		}

		return null;
	}

}
