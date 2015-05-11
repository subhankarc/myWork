package com.sap.casestudy.subhankar.ui.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class MTSProjectNature implements IProjectNature{
	
	
    private IProject project;
	@Override
	public void configure() throws CoreException {
		
		
	}

	@Override
	public void deconfigure() throws CoreException {
		
	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project1) {
		project = project1;
	}

}
