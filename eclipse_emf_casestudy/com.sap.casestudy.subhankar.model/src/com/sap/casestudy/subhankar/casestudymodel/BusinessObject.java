/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProviderClass <em>Provider Class</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProviderInterface <em>Provider Interface</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getObjectCategory <em>Object Category</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProcessComponent <em>Process Component</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getRootNode <em>Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getBusinessObject()
 * @model
 * @generated
 */
public interface BusinessObject extends IAdtMainObject {
	/**
	 * Returns the value of the '<em><b>Provider Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Class</em>' attribute.
	 * @see #setProviderClass(String)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getBusinessObject_ProviderClass()
	 * @model
	 * @generated
	 */
	String getProviderClass();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProviderClass <em>Provider Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Class</em>' attribute.
	 * @see #getProviderClass()
	 * @generated
	 */
	void setProviderClass(String value);

	/**
	 * Returns the value of the '<em><b>Provider Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Interface</em>' attribute.
	 * @see #setProviderInterface(String)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getBusinessObject_ProviderInterface()
	 * @model
	 * @generated
	 */
	String getProviderInterface();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProviderInterface <em>Provider Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Interface</em>' attribute.
	 * @see #getProviderInterface()
	 * @generated
	 */
	void setProviderInterface(String value);

	/**
	 * Returns the value of the '<em><b>Object Category</b></em>' attribute.
	 * The literals are from the enumeration {@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Category</em>' attribute.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum
	 * @see #setObjectCategory(BusinessObjectCategoryEnum)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getBusinessObject_ObjectCategory()
	 * @model
	 * @generated
	 */
	BusinessObjectCategoryEnum getObjectCategory();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getObjectCategory <em>Object Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Category</em>' attribute.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum
	 * @see #getObjectCategory()
	 * @generated
	 */
	void setObjectCategory(BusinessObjectCategoryEnum value);

	/**
	 * Returns the value of the '<em><b>Process Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getBusinessObjects <em>Business Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Component</em>' container reference.
	 * @see #setProcessComponent(ProcessComponent)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getBusinessObject_ProcessComponent()
	 * @see com.sap.casestudy.subhankar.casestudymodel.ProcessComponent#getBusinessObjects
	 * @model opposite="businessObjects" required="true" transient="false"
	 * @generated
	 */
	ProcessComponent getProcessComponent();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getProcessComponent <em>Process Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Component</em>' container reference.
	 * @see #getProcessComponent()
	 * @generated
	 */
	void setProcessComponent(ProcessComponent value);

	/**
	 * Returns the value of the '<em><b>Root Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.sap.casestudy.subhankar.casestudymodel.RootBusinessObjectNode#getBusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Node</em>' reference.
	 * @see #setRootNode(RootBusinessObjectNode)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getBusinessObject_RootNode()
	 * @see com.sap.casestudy.subhankar.casestudymodel.RootBusinessObjectNode#getBusinessObject
	 * @model opposite="businessObject" required="true"
	 * @generated
	 */
	RootBusinessObjectNode getRootNode();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getRootNode <em>Root Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Node</em>' reference.
	 * @see #getRootNode()
	 * @generated
	 */
	void setRootNode(RootBusinessObjectNode value);

} // BusinessObject
