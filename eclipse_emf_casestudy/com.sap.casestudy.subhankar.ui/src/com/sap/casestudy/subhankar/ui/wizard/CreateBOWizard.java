package com.sap.casestudy.subhankar.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.ui.IMTSConstants;
import com.sap.casestudy.subhankar.ui.util.MTSCreateUtilityClass;
import com.sap.casestudy.subhankar.ui.wizard.pages.BusinessObjectWizardPage;

public class CreateBOWizard extends Wizard implements INewWizard {

	private IStructuredSelection selection;
	private IProject project;
	BusinessObjectWizardPage bopage;
	ProcessComponent processComponent;

	private final static String BO_WIZARD_TITLE = "Create Business Object";
	private final static String BO_TITLE = "Business Object";
	private final static String BO_DESCRIPTION = "Create Business Object";

	public CreateBOWizard() {
		setWindowTitle("New casestudy Project");
	}

	public CreateBOWizard(ProcessComponent pc) {
		processComponent = pc;
	}

	@Override
	public void addPages() {
		super.addPages();
		bopage = new BusinessObjectWizardPage(BO_WIZARD_TITLE, BO_TITLE, null, selection);
		bopage.setDescription(BO_DESCRIPTION);
		bopage.setPC(processComponent);
		addPage(bopage);

	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	@Override
	public boolean performFinish() {
		if (bopage.isValid(true)) {
			boolean success;
			this.project = bopage.getProject();
			this.processComponent = bopage.getPC();
			success = MTSCreateUtilityClass.getCreateUtilClass().createBO(
					project, processComponent, bopage.getTechnicalName(),
					bopage.getObjectCategory(), bopage.getProviderInterface(),
					bopage.getProviderClass());
			if (success) {
				return MTSCreateUtilityClass.getCreateUtilClass()
						.refreshWorkspace();
			} else {
				bopage.setErrorMessage(IMTSConstants.MSG_DUPLICATE_TECHNICAL_NAME);
			}
		}
		return false;
	}

}
