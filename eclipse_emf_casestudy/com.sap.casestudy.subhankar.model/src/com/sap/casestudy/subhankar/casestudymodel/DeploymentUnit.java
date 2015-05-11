/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit#getAbbreviatonName <em>Abbreviaton Name</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit#getSemanticName <em>Semantic Name</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit#getProcessComponents <em>Process Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getDeploymentUnit()
 * @model
 * @generated
 */
public interface DeploymentUnit extends IAdtMainObject {
	/**
	 * Returns the value of the '<em><b>Abbreviaton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbreviaton Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviaton Name</em>' attribute.
	 * @see #setAbbreviatonName(String)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getDeploymentUnit_AbbreviatonName()
	 * @model
	 * @generated
	 */
	String getAbbreviatonName();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit#getAbbreviatonName <em>Abbreviaton Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviaton Name</em>' attribute.
	 * @see #getAbbreviatonName()
	 * @generated
	 */
	void setAbbreviatonName(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Name</em>' attribute.
	 * @see #setSemanticName(String)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getDeploymentUnit_SemanticName()
	 * @model
	 * @generated
	 */
	String getSemanticName();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit#getSemanticName <em>Semantic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Name</em>' attribute.
	 * @see #getSemanticName()
	 * @generated
	 */
	void setSemanticName(String value);

	/**
	 * Returns the value of the '<em><b>Process Components</b></em>' containment reference list.
	 * The list contents are of type {@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent}.
	 * It is bidirectional and its opposite is '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getDeploymentUnit <em>Deployment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Components</em>' containment reference list.
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getDeploymentUnit_ProcessComponents()
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getDeploymentUnit
	 * @model opposite="deploymentUnit" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ProcessComponent> getProcessComponents();

} // DeploymentUnit
