package com.sap.casestudy.subhankar.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;
import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.ui.IMTSConstants;
import com.sap.casestudy.subhankar.ui.util.MTSCreateUtilityClass;

public class MTSContentProvider implements IStructuredContentProvider,
ITreeContentProvider {
	
	@Override
public void dispose() {

}

@Override
public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

}

@Override
public Object[] getElements(Object inputElement) {
	IProject[] projects = ((IWorkspace) inputElement).getRoot()
			.getProjects();
	List<IProject> mtsProjects = new ArrayList<IProject>();
	for (IProject project : projects) {
		try {
			if (project
					.getNature(IMTSConstants.MTS_PROJECT_NATURE_ID) != null
					&& project.isAccessible()) {
				mtsProjects.add(project);
			}
		} catch (CoreException e) {

		}
	}
	return mtsProjects.toArray();
}

@Override
public Object[] getChildren(Object parentElement) {
	if (parentElement instanceof IProject) {
		return MTSCreateUtilityClass.getCreateUtilClass().getTreeUtil()
				.getDUTreeNodes((IProject) parentElement);
	} else if (parentElement instanceof ITreeNode) {
		return ((ITreeNode) parentElement).getChildren();
	} else if (parentElement instanceof DeploymentUnit) {
		return MTSCreateUtilityClass
				.getCreateUtilClass()
				.getTreeUtil()
				.getPCTreeNode(
						(DeploymentUnit) parentElement);
	} else if (parentElement instanceof ProcessComponent) {
		return MTSCreateUtilityClass
				.getCreateUtilClass()
				.getTreeUtil()
				.getBOTreeNode(
						(ProcessComponent) parentElement);
	}
	return null;
}

@Override
public Object getParent(Object element) {
	return null;
}

@Override
public boolean hasChildren(Object element) {
	if (element instanceof IProject
			|| (element instanceof IAdtMainObject && !(element instanceof BusinessObject))) {
		return true;
	} else if (element instanceof ITreeNode) {
		return ((ITreeNode) element).hasChildren();
	}
	return false;
}
}
