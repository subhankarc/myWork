package com.sap.casestudy.subhankar.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.ui.IMTSConstants;
import com.sap.casestudy.subhankar.ui.util.MTSCreateUtilityClass;
import com.sap.casestudy.subhankar.ui.wizard.pages.ProcessComponentWizardPage;

public class CreatePCWizard extends Wizard implements INewWizard {

	private IWorkbench workbench;
	private IStructuredSelection selection;
	private IProject project;
	private DeploymentUnit du;
	ProcessComponentWizardPage pcpage;

	private final static String PC_WIZARD_TITLE = "Create Process Component";
	private final static String PC_TITLE = "Process Component";
	private final static String PC_DESCRIPTION = "Create Process Component";

	public CreatePCWizard() {
		setWindowTitle("New Casestudy Project");
	}

	public CreatePCWizard(IProject project) {
		this.project = project;
	}

	public CreatePCWizard(DeploymentUnit du) {
		this.du = du;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}

	@Override
	public boolean performFinish() {

		if (pcpage.isValid(true)) {
			boolean success;
			this.project = pcpage.getProject();
			this.du = pcpage.getDU();
			success = MTSCreateUtilityClass.getCreateUtilClass().createPC(
					project, du, pcpage.getTechnicalName(), pcpage.getCode(),
					pcpage.getNamekeyName(), pcpage.getNamekeyNamespace(),
					pcpage.getCategory());
			if (success) {
				try {
					project.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
				return success;
			} else {
				pcpage.setErrorMessage(IMTSConstants.MSG_DUPLICATE_TECHNICAL_NAME);
			}
		}
		return false;
	}

	@Override
	public void addPages() {
		super.addPages();
		pcpage = new ProcessComponentWizardPage(PC_WIZARD_TITLE, PC_TITLE, null, selection);
		pcpage.setDescription(PC_DESCRIPTION);
		pcpage.setDU(du);
		addPage(pcpage);
		// pcpage.setPageComplete(false);
	}

}
