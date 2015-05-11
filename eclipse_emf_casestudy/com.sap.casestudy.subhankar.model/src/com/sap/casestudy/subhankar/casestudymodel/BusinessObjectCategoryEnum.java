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
 * A representation of the literals of the enumeration '<em><b>Business Object Category Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getBusinessObjectCategoryEnum()
 * @model
 * @generated
 */
public enum BusinessObjectCategoryEnum implements Enumerator {
	/**
	 * The '<em><b>META OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #META_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	META_OBJECT(0, "META_OBJECT", "META_OBJECT"),

	/**
	 * The '<em><b>TECHNICAL OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNICAL_OBJECT(1, "TECHNICAL_OBJECT", "TECHNICAL_OBJECT"),

	/**
	 * The '<em><b>MASTER DATA OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_DATA_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER_DATA_OBJECT(2, "MASTER_DATA_OBJECT", "MASTER_DATA_OBJECT"),

	/**
	 * The '<em><b>MASS DATA RUN OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASS_DATA_RUN_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	MASS_DATA_RUN_OBJECT(3, "MASS_DATA_RUN_OBJECT", "MASS_DATA_RUN_OBJECT"),

	/**
	 * The '<em><b>BUSINESS CONFIGURATION OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_CONFIGURATION_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_CONFIGURATION_OBJECT(4, "BUSINESS_CONFIGURATION_OBJECT", "BUSINESS_CONFIGURATION_OBJECT");

	/**
	 * The '<em><b>META OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>META OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #META_OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int META_OBJECT_VALUE = 0;

	/**
	 * The '<em><b>TECHNICAL OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TECHNICAL OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL_OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TECHNICAL_OBJECT_VALUE = 1;

	/**
	 * The '<em><b>MASTER DATA OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MASTER DATA OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASTER_DATA_OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_DATA_OBJECT_VALUE = 2;

	/**
	 * The '<em><b>MASS DATA RUN OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MASS DATA RUN OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASS_DATA_RUN_OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MASS_DATA_RUN_OBJECT_VALUE = 3;

	/**
	 * The '<em><b>BUSINESS CONFIGURATION OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUSINESS CONFIGURATION OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_CONFIGURATION_OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CONFIGURATION_OBJECT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Business Object Category Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BusinessObjectCategoryEnum[] VALUES_ARRAY =
		new BusinessObjectCategoryEnum[] {
			META_OBJECT,
			TECHNICAL_OBJECT,
			MASTER_DATA_OBJECT,
			MASS_DATA_RUN_OBJECT,
			BUSINESS_CONFIGURATION_OBJECT,
		};

	/**
	 * A public read-only list of all the '<em><b>Business Object Category Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BusinessObjectCategoryEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Business Object Category Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BusinessObjectCategoryEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BusinessObjectCategoryEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Business Object Category Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BusinessObjectCategoryEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BusinessObjectCategoryEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Business Object Category Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BusinessObjectCategoryEnum get(int value) {
		switch (value) {
			case META_OBJECT_VALUE: return META_OBJECT;
			case TECHNICAL_OBJECT_VALUE: return TECHNICAL_OBJECT;
			case MASTER_DATA_OBJECT_VALUE: return MASTER_DATA_OBJECT;
			case MASS_DATA_RUN_OBJECT_VALUE: return MASS_DATA_RUN_OBJECT;
			case BUSINESS_CONFIGURATION_OBJECT_VALUE: return BUSINESS_CONFIGURATION_OBJECT;
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
	private BusinessObjectCategoryEnum(int value, String name, String literal) {
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
	
} //BusinessObjectCategoryEnum
