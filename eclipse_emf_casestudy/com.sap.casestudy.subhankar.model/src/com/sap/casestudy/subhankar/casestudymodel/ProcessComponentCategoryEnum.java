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
 * A representation of the literals of the enumeration '<em><b>Process Component Category Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getProcessComponentCategoryEnum()
 * @model
 * @generated
 */
public enum ProcessComponentCategoryEnum implements Enumerator {
	/**
	 * The '<em><b>APPLICATION PROCESS COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PROCESS_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_PROCESS_COMPONENT(0, "APPLICATION_PROCESS_COMPONENT", "APPLICATION_PROCESS_COMPONENT"),

	/**
	 * The '<em><b>THIRD PARTY PROCESS COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_PARTY_PROCESS_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_PARTY_PROCESS_COMPONENT(1, "THIRD_PARTY_PROCESS_COMPONENT", "THIRD_PARTY_PROCESS_COMPONENT"),

	/**
	 * The '<em><b>PROCESS COMPONENT AT BUSINESS PARTNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_COMPONENT_AT_BUSINESS_PARTNER_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS_COMPONENT_AT_BUSINESS_PARTNER(2, "PROCESS_COMPONENT_AT_BUSINESS_PARTNER", "PROCESS_COMPONENT_AT_BUSINESS_PARTNER");

	/**
	 * The '<em><b>APPLICATION PROCESS COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPLICATION PROCESS COMPONENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PROCESS_COMPONENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_PROCESS_COMPONENT_VALUE = 0;

	/**
	 * The '<em><b>THIRD PARTY PROCESS COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THIRD PARTY PROCESS COMPONENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THIRD_PARTY_PROCESS_COMPONENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_PARTY_PROCESS_COMPONENT_VALUE = 1;

	/**
	 * The '<em><b>PROCESS COMPONENT AT BUSINESS PARTNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROCESS COMPONENT AT BUSINESS PARTNER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESS_COMPONENT_AT_BUSINESS_PARTNER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_COMPONENT_AT_BUSINESS_PARTNER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Process Component Category Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcessComponentCategoryEnum[] VALUES_ARRAY =
		new ProcessComponentCategoryEnum[] {
			APPLICATION_PROCESS_COMPONENT,
			THIRD_PARTY_PROCESS_COMPONENT,
			PROCESS_COMPONENT_AT_BUSINESS_PARTNER,
		};

	/**
	 * A public read-only list of all the '<em><b>Process Component Category Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcessComponentCategoryEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Process Component Category Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessComponentCategoryEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessComponentCategoryEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Process Component Category Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessComponentCategoryEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessComponentCategoryEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Process Component Category Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessComponentCategoryEnum get(int value) {
		switch (value) {
			case APPLICATION_PROCESS_COMPONENT_VALUE: return APPLICATION_PROCESS_COMPONENT;
			case THIRD_PARTY_PROCESS_COMPONENT_VALUE: return THIRD_PARTY_PROCESS_COMPONENT;
			case PROCESS_COMPONENT_AT_BUSINESS_PARTNER_VALUE: return PROCESS_COMPONENT_AT_BUSINESS_PARTNER;
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
	private ProcessComponentCategoryEnum(int value, String name, String literal) {
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
	
} //ProcessComponentCategoryEnum
