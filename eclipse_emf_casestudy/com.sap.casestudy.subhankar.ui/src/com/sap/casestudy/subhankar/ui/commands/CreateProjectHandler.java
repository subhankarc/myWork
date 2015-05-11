package com.sap.casestudy.subhankar.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;

import com.sap.casestudy.subhankar.ui.wizard.NewMTSProjectWizard;

public class CreateProjectHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
						NewMTSProjectWizard projectWizard = new NewMTSProjectWizard();
						WizardDialog wizardDialog = new WizardDialog(Display
								.getCurrent().getActiveShell(), projectWizard);
						wizardDialog.open();
		
		return null;
	}

}
