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
 * A representation of the model object '<em><b>Business Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getCategory <em>Category</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getChildNodes <em>Child Nodes</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getBusinessObjectNode()
 * @model
 * @generated
 */
public interface BusinessObjectNode extends IAdtObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link com.sap.casestudy.subhankar.casestudymodel.BuObjectNodeCategoryEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BuObjectNodeCategoryEnum
	 * @see #setCategory(BuObjectNodeCategoryEnum)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getBusinessObjectNode_Category()
	 * @model
	 * @generated
	 */
	BuObjectNodeCategoryEnum getCategory();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see com.sap.casestudy.subhankar.casestudymodel.BuObjectNodeCategoryEnum
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(BuObjectNodeCategoryEnum value);

	/**
	 * Returns the value of the '<em><b>Child Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode}.
	 * It is bidirectional and its opposite is '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Nodes</em>' containment reference list.
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getBusinessObjectNode_ChildNodes()
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getParent
	 * @model opposite="parent" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<BusinessObjectNode> getChildNodes();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(BusinessObjectNode)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getBusinessObjectNode_Parent()
	 * @see com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getChildNodes
	 * @model opposite="childNodes" required="true" transient="false"
	 * @generated
	 */
	BusinessObjectNode getParent();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(BusinessObjectNode value);

} // BusinessObjectNode
