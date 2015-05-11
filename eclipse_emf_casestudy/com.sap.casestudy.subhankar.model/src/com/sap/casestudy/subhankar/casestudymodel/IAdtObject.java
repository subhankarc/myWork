/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAdt Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getId <em>Id</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getTechnicalName <em>Technical Name</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getIAdtObject()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IAdtObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(String)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getIAdtObject_Id()
	 * @model unsettable="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Unsets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Technical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technical Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technical Name</em>' attribute.
	 * @see #setTechnicalName(String)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getIAdtObject_TechnicalName()
	 * @model
	 * @generated
	 */
	String getTechnicalName();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getTechnicalName <em>Technical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical Name</em>' attribute.
	 * @see #getTechnicalName()
	 * @generated
	 */
	void setTechnicalName(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.sap.casestudy.subhankar.casestudymodel.Documentation#getContainingObject <em>Containing Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Documentation)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getIAdtObject_Documentation()
	 * @see com.sap.casestudy.subhankar.casestudymodel.Documentation#getContainingObject
	 * @model opposite="containingObject" containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Documentation getDocumentation();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtObject#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Documentation value);

} // IAdtObject
