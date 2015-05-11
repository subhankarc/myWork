package com.sap.casestudy.subhankar.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import com.sap.casestudy.subhankar.ui.IMTSConstants;

public class NewMTSProjectWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private IWorkbench workbench;
	private IStructuredSelection selection;
	private WizardNewProjectCreationPage createProjectPage;
	private IConfigurationElement configurationElement;

	public NewMTSProjectWizard() {
		setWindowTitle("New casestudy Project");
	}

	@Override
	public void addPages() {
		super.addPages();
		createProjectPage = new WizardNewProjectCreationPage("NewMTSProject");
		createProjectPage.setDescription("Create New MTS Poject");
		createProjectPage.setTitle("MTS Project Creation");
		addPage(createProjectPage);

	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;

	}

	@Override
	public boolean performFinish() {

		// Create project description
		IProjectDescription projectDescription = createDesc();
		// Create new project
		IProject project = createProject(projectDescription);

		// Add nature
		addNature(project);

		return true;
	}

	private IProjectDescription createDesc() {
		IProjectDescription projectDescription = ResourcesPlugin.getWorkspace()
				.newProjectDescription(createProjectPage.getProjectName());
		if (!createProjectPage.getLocationPath().equals(Platform.getLocation())) {
			projectDescription.setLocation(createProjectPage.getLocationPath());
		} else {
			projectDescription.setLocation(null);
		}
		return projectDescription;
	}

	private IProject createProject(IProjectDescription projectDescription) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectDescription.getName());

		if (!project.exists()) {
			try {
				project.create(projectDescription, null);

			} catch (CoreException e) {
				e.printStackTrace();
			}
			if (!project.isOpen()) {
				try {
					project.open(null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}

		}
		return project;
	}

	private void addNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = IMTSConstants.MTS_PROJECT_NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		configurationElement = config;
	}

}
