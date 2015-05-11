package com.sap.casestudy.subhankar.ui.wizard.pages;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;

public abstract class MTSWizardPage extends WizardPage {

	protected MTSWizardPage(String pageName, String title,
			ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
	}

	public abstract boolean isValid(boolean displayMessage);

}
