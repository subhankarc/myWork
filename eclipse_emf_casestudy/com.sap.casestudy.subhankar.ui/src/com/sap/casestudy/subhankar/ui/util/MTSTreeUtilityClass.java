package com.sap.casestudy.subhankar.ui.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;

import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.ui.views.BOTreeNode;
import com.sap.casestudy.subhankar.ui.views.DUTreeNode;
import com.sap.casestudy.subhankar.ui.views.PCTreeNode;

public class MTSTreeUtilityClass {

	private Map<IProject, Object[]> projectDeploymentUnitMap;
	private Map<DeploymentUnit, Object[]> deploymentUnitProcessComponentMap;
	private Map<ProcessComponent, Object[]> processComponentBOMap;

	public MTSTreeUtilityClass(){
	}
	
	public Object[] getDUTreeNodes(IProject project) {
		Object[] deploymentUnitsTreeNodes = getProject_DUMap().get(
				project);
		if (deploymentUnitsTreeNodes == null) {
			deploymentUnitsTreeNodes = new Object[] { new DUTreeNode(
					project) };
			getProject_DUMap()
					.put(project, deploymentUnitsTreeNodes);

		}
		return deploymentUnitsTreeNodes;
	}

	public Object[] getPCTreeNode(DeploymentUnit deploymentUnit) {
		Object[] processComponentsTreeNode = getDU_PCMap()
				.get(deploymentUnit);
		if (processComponentsTreeNode == null) {
			processComponentsTreeNode = new Object[] { new PCTreeNode(
					deploymentUnit) };
			getDU_PCMap().put(deploymentUnit,
					processComponentsTreeNode);
		}
		return processComponentsTreeNode;
	}
	
	public Object[] getBOTreeNode(ProcessComponent processComponent) {
		Object[] bosTreeNode = getPC_BOMap()
				.get(processComponent);
		if (bosTreeNode == null) {
			bosTreeNode = new Object[] { new BOTreeNode(
					processComponent) };
			getPC_BOMap().put(processComponent,
					bosTreeNode);
		}
		return bosTreeNode;
	}
	
	public Map<IProject, Object[]> getProject_DUMap() {
		if (projectDeploymentUnitMap == null) {
			projectDeploymentUnitMap = new HashMap<IProject, Object[]>();
		}
		return projectDeploymentUnitMap;
	}

	private Map<DeploymentUnit, Object[]> getDU_PCMap() {
		if (deploymentUnitProcessComponentMap == null) {
			deploymentUnitProcessComponentMap = new HashMap<DeploymentUnit, Object[]>();

		}
		return deploymentUnitProcessComponentMap;
	}
	
	private Map<ProcessComponent, Object[]> getPC_BOMap() {
		if (processComponentBOMap == null) {
			processComponentBOMap =new HashMap<ProcessComponent, Object[]>();
		}
		return processComponentBOMap;
	}
	
	
}
