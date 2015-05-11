/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAdt Main Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject#getFileExtension <em>File Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getIAdtMainObject()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IAdtMainObject extends IAdtObject {
	/**
	 * Returns the value of the '<em><b>File Extension</b></em>' attribute.
	 * The literals are from the enumeration {@link com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Extension</em>' attribute.
	 * @see com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum
	 * @see #setFileExtension(FileExtensionEnum)
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getIAdtMainObject_FileExtension()
	 * @model
	 * @generated
	 */
	FileExtensionEnum getFileExtension();

	/**
	 * Sets the value of the '{@link com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject#getFileExtension <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Extension</em>' attribute.
	 * @see com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum
	 * @see #getFileExtension()
	 * @generated
	 */
	void setFileExtension(FileExtensionEnum value);

} // IAdtMainObject
