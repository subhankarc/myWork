package com.sap.casestudy.subhankar.ui.views;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;

import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.ui.IMTSConstants;
import com.sap.casestudy.subhankar.ui.util.ImageUtilityClass;
import com.sap.casestudy.subhankar.ui.util.MTSCreateUtilityClass;

public class DUTreeNode implements ITreeNode {
	private IProject project;
	private final String nodeLabel = IMTSConstants.DEPLOYMENT_UNITS;
	private List<DeploymentUnit> deploymentUnits;
	private static Map<IProject,DUTreeNode> projectDeploymentUnitMap;

	public DUTreeNode(IProject project) {
		this.project = project;
		DUTreeNode.getMap().put(project, this);
	}

	@Override
	public String getNodeLabel() {
		return nodeLabel;
	}

	public Object[] getDeploymentUnits() {
		return getDeploymentUnitList().toArray();
	}

	public boolean isDeploymentUnitExist(DeploymentUnit deploymentUnit) {
		return getDeploymentUnitList().contains(deploymentUnit);
	}

	public void addDeplomentUnit(DeploymentUnit deploymentUnit) {
		if (!getDeploymentUnitList().contains(deploymentUnit))
			getDeploymentUnitList().add(deploymentUnit);
	}

	public IProject getProject() {
		return project;
	}

	@Override
	public Object[] getChildren() {
		return getDeploymentUnits();
	}

	@Override
	public Image getImage() {
		return ImageUtilityClass
				.getImage(ImageUtilityClass.ICON_DEPLOYMENT_UNITS);
	}

	@Override
	public boolean hasChildren() {
		return !(getDeploymentUnitList().size() == 0);
	}

	@Override
	public String toString() {
		return "";
	}

	public List<DeploymentUnit> getDeploymentUnitList() {
		if (deploymentUnits == null) {
			deploymentUnits = MTSCreateUtilityClass.getCreateUtilClass()
					.getDeploymentUnits(project);
		}
		return deploymentUnits;
	}

	public static DUTreeNode getInstance(IProject project2) {
		return DUTreeNode.getMap().get(project2);
	}

	public static Map<IProject,DUTreeNode> getMap() {
		if (projectDeploymentUnitMap == null) {
			projectDeploymentUnitMap = new HashMap<IProject, DUTreeNode>();
		}
		return projectDeploymentUnitMap;
	}

	public void deleteDeploymentUnit(DeploymentUnit du) {
		if(getDeploymentUnitList().contains(du))
		{
			getDeploymentUnitList().remove(du);
		}
		
	}

}
