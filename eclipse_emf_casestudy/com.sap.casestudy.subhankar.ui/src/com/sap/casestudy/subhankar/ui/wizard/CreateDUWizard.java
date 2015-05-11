package com.sap.casestudy.subhankar.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.sap.casestudy.subhankar.ui.IMTSConstants;
import com.sap.casestudy.subhankar.ui.util.MTSCreateUtilityClass;
import com.sap.casestudy.subhankar.ui.wizard.pages.DeploymentUnitWizardPage;

public class CreateDUWizard extends Wizard implements INewWizard {
	
	
	private IProject project;
	private DeploymentUnitWizardPage deploymentUnitPage;
	IWorkbench workbench;
	IStructuredSelection selection;
	private final static String DEPLOYMENT_UNIT_WIZARD_TITLE = "New Deployment Unit";
	private final static String DEPLOYMENT_UNIT_TITLE = "Deployment Unit";
	private final static String DEPLOYMENT_UNIT_DESCRIPTION = "Create Deployment Unit";

	public CreateDUWizard() {
		setWindowTitle("New Casestudy Project");
	}

	public CreateDUWizard(IProject project) {
		setWindowTitle("New MTS Project");
		this.project = project;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		
       this.workbench = workbench;
       this.selection = selection;
       
       
	}

	@Override
	public boolean performFinish() {
		
		

		if (deploymentUnitPage.isValid(true)) {
			boolean success;
			this.project = deploymentUnitPage.getProject();
			success = MTSCreateUtilityClass.getCreateUtilClass().createDU(project,
					deploymentUnitPage.getTechnicalName(),
					deploymentUnitPage.getAbbreviationName(),
					deploymentUnitPage.getSemanticName());
			if (success) {
				try {
					project.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			    return success;
			} else {
				deploymentUnitPage
						.setErrorMessage(IMTSConstants.MSG_DUPLICATE_TECHNICAL_NAME);
			}
		}
		return false;
	}

	@Override
	public void addPages() {
		super.addPages();
		deploymentUnitPage = new DeploymentUnitWizardPage(
				DEPLOYMENT_UNIT_WIZARD_TITLE, DEPLOYMENT_UNIT_TITLE, null,selection);
		deploymentUnitPage.setDescription(DEPLOYMENT_UNIT_DESCRIPTION);
		deploymentUnitPage.setProject(project);
		addPage(deploymentUnitPage);
		
		
		//deploymentUnitPage.setPageComplete(false);

	}


}
