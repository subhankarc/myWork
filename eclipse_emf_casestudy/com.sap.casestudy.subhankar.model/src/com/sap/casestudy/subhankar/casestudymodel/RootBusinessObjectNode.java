/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Business Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.RootBusinessObjectNode#getBusinessObject <em>Business Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getRootBusinessObjectNode()
 * @model
 * @generated
 */
public interface RootBusinessObjectNode extends BusinessObjectNode {
	/**
	 * Returns the value of the '<em><b>Business Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Object</em>' reference.
	 * @see #setBusinessObject(BusinessObject)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getRootBusinessObjectNode_BusinessObject()
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObject#getRootNode
	 * @model opposite="rootNode" required="true"
	 * @generated
	 */
	BusinessObject getBusinessObject();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.RootBusinessObjectNode#getBusinessObject <em>Business Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Object</em>' reference.
	 * @see #getBusinessObject()
	 * @generated
	 */
	void setBusinessObject(BusinessObject value);

} // RootBusinessObjectNode
