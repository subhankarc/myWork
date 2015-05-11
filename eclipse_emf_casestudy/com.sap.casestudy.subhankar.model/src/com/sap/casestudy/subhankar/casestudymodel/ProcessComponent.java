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
 * A representation of the model object '<em><b>Process Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getDeploymentUnit <em>Deployment Unit</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getCode <em>Code</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getNameKeyName <em>Name Key Name</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getNameKeyNamespace <em>Name Key Namespace</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getCategory <em>Category</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getBusinessObjects <em>Business Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getProcessComponent()
 * @model
 * @generated
 */
public interface ProcessComponent extends IAdtMainObject {
	/**
	 * Returns the value of the '<em><b>Deployment Unit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit#getProcessComponents <em>Process Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Unit</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Unit</em>' container reference.
	 * @see #setDeploymentUnit(DeploymentUnit)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getProcessComponent_DeploymentUnit()
	 * @see com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit#getProcessComponents
	 * @model opposite="processComponents" required="true" transient="false"
	 * @generated
	 */
	DeploymentUnit getDeploymentUnit();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getDeploymentUnit <em>Deployment Unit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Unit</em>' container reference.
	 * @see #getDeploymentUnit()
	 * @generated
	 */
	void setDeploymentUnit(DeploymentUnit value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getProcessComponent_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Key Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Key Name</em>' attribute.
	 * @see #setNameKeyName(String)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getProcessComponent_NameKeyName()
	 * @model
	 * @generated
	 */
	String getNameKeyName();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getNameKeyName <em>Name Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Key Name</em>' attribute.
	 * @see #getNameKeyName()
	 * @generated
	 */
	void setNameKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Name Key Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Key Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Key Namespace</em>' attribute.
	 * @see #setNameKeyNamespace(String)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getProcessComponent_NameKeyNamespace()
	 * @model
	 * @generated
	 */
	String getNameKeyNamespace();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getNameKeyNamespace <em>Name Key Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Key Namespace</em>' attribute.
	 * @see #getNameKeyNamespace()
	 * @generated
	 */
	void setNameKeyNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponentCategoryEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponentCategoryEnum
	 * @see #setCategory(ProcessComponentCategoryEnum)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getProcessComponent_Category()
	 * @model
	 * @generated
	 */
	ProcessComponentCategoryEnum getCategory();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponentCategoryEnum
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(ProcessComponentCategoryEnum value);

	/**
	 * Returns the value of the '<em><b>Business Objects</b></em>' containment reference list.
	 * The list contents are of type {@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject}.
	 * It is bidirectional and its opposite is '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProcessComponent <em>Process Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Objects</em>' containment reference list.
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getProcessComponent_BusinessObjects()
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProcessComponent
	 * @model opposite="processComponent" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<BusinessObject> getBusinessObjects();

} // ProcessComponent
