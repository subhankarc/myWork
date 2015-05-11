/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>File Extension Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getFileExtensionEnum()
 * @model
 * @generated
 */
public enum FileExtensionEnum implements Enumerator {
	/**
	 * The '<em><b>NAMESPACE EXTENSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMESPACE_EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	NAMESPACE_EXTENSION(0, "NAMESPACE_EXTENSION", "NAMESPACE_EXTENSION"),

	/**
	 * The '<em><b>DEPLOYMENT UNIT EXTENSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_UNIT_EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT_UNIT_EXTENSION(1, "DEPLOYMENT_UNIT_EXTENSION", "du"),

	/**
	 * The '<em><b>PROCESS COMPONENT EXTENSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_COMPONENT_EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS_COMPONENT_EXTENSION(2, "PROCESS_COMPONENT_EXTENSION", "pc"),

	/**
	 * The '<em><b>BUSINESS OBJECT EXTENSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_OBJECT_EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_OBJECT_EXTENSION(3, "BUSINESS_OBJECT_EXTENSION", "bo");

	/**
	 * The '<em><b>NAMESPACE EXTENSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAMESPACE EXTENSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAMESPACE_EXTENSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAMESPACE_EXTENSION_VALUE = 0;

	/**
	 * The '<em><b>DEPLOYMENT UNIT EXTENSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPLOYMENT UNIT EXTENSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_UNIT_EXTENSION
	 * @model literal="du"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_UNIT_EXTENSION_VALUE = 1;

	/**
	 * The '<em><b>PROCESS COMPONENT EXTENSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROCESS COMPONENT EXTENSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESS_COMPONENT_EXTENSION
	 * @model literal="pc"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_COMPONENT_EXTENSION_VALUE = 2;

	/**
	 * The '<em><b>BUSINESS OBJECT EXTENSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUSINESS OBJECT EXTENSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_OBJECT_EXTENSION
	 * @model literal="bo"
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_OBJECT_EXTENSION_VALUE = 3;

	/**
	 * An array of all the '<em><b>File Extension Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FileExtensionEnum[] VALUES_ARRAY =
		new FileExtensionEnum[] {
			NAMESPACE_EXTENSION,
			DEPLOYMENT_UNIT_EXTENSION,
			PROCESS_COMPONENT_EXTENSION,
			BUSINESS_OBJECT_EXTENSION,
		};

	/**
	 * A public read-only list of all the '<em><b>File Extension Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FileExtensionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>File Extension Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileExtensionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileExtensionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Extension Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileExtensionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileExtensionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Extension Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileExtensionEnum get(int value) {
		switch (value) {
			case NAMESPACE_EXTENSION_VALUE: return NAMESPACE_EXTENSION;
			case DEPLOYMENT_UNIT_EXTENSION_VALUE: return DEPLOYMENT_UNIT_EXTENSION;
			case PROCESS_COMPONENT_EXTENSION_VALUE: return PROCESS_COMPONENT_EXTENSION;
			case BUSINESS_OBJECT_EXTENSION_VALUE: return BUSINESS_OBJECT_EXTENSION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FileExtensionEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FileExtensionEnum
