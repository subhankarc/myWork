/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.Documentation#getShortText <em>Short Text</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.Documentation#getLongText <em>Long Text</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.Documentation#getContainingObject <em>Containing Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getDocumentation()
 * @model
 * @generated
 */
public interface Documentation extends IAdtObject {
	/**
	 * Returns the value of the '<em><b>Short Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Text</em>' attribute.
	 * @see #setShortText(String)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getDocumentation_ShortText()
	 * @model
	 * @generated
	 */
	String getShortText();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.Documentation#getShortText <em>Short Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Text</em>' attribute.
	 * @see #getShortText()
	 * @generated
	 */
	void setShortText(String value);

	/**
	 * Returns the value of the '<em><b>Long Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Text</em>' attribute.
	 * @see #setLongText(String)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getDocumentation_LongText()
	 * @model
	 * @generated
	 */
	String getLongText();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.Documentation#getLongText <em>Long Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Text</em>' attribute.
	 * @see #getLongText()
	 * @generated
	 */
	void setLongText(String value);

	/**
	 * Returns the value of the '<em><b>Containing Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Object</em>' container reference.
	 * @see #setContainingObject(IAdtObject)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getDocumentation_ContainingObject()
	 * @see com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getDocumentation
	 * @model opposite="documentation" required="true" transient="false"
	 * @generated
	 */
	IAdtObject getContainingObject();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.Documentation#getContainingObject <em>Containing Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Object</em>' container reference.
	 * @see #getContainingObject()
	 * @generated
	 */
	void setContainingObject(IAdtObject value);

} // Documentation
