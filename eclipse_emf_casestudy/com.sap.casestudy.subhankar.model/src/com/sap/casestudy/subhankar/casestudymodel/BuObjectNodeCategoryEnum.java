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
 * A representation of the literals of the enumeration '<em><b>Bu Object Node Category Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#getBuObjectNodeCategoryEnum()
 * @model
 * @generated
 */
public enum BuObjectNodeCategoryEnum implements Enumerator {
	/**
	 * The '<em><b>TRANSFORMATION NODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFORMATION_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFORMATION_NODE(0, "TRANSFORMATION_NODE", "TRANSFORMATION_NODE"),

	/**
	 * The '<em><b>STANDARD NODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_NODE(1, "STANDARD_NODE", "STANDARD_NODE"),

	/**
	 * The '<em><b>TEXT NODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_NODE(2, "TEXT_NODE", "TEXT_NODE");

	/**
	 * The '<em><b>TRANSFORMATION NODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSFORMATION NODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSFORMATION_NODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMATION_NODE_VALUE = 0;

	/**
	 * The '<em><b>STANDARD NODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STANDARD NODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_NODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_NODE_VALUE = 1;

	/**
	 * The '<em><b>TEXT NODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXT NODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT_NODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_NODE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Bu Object Node Category Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BuObjectNodeCategoryEnum[] VALUES_ARRAY =
		new BuObjectNodeCategoryEnum[] {
			TRANSFORMATION_NODE,
			STANDARD_NODE,
			TEXT_NODE,
		};

	/**
	 * A public read-only list of all the '<em><b>Bu Object Node Category Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BuObjectNodeCategoryEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bu Object Node Category Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuObjectNodeCategoryEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BuObjectNodeCategoryEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bu Object Node Category Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuObjectNodeCategoryEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BuObjectNodeCategoryEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bu Object Node Category Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuObjectNodeCategoryEnum get(int value) {
		switch (value) {
			case TRANSFORMATION_NODE_VALUE: return TRANSFORMATION_NODE;
			case STANDARD_NODE_VALUE: return STANDARD_NODE;
			case TEXT_NODE_VALUE: return TEXT_NODE;
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
	private BuObjectNodeCategoryEnum(int value, String name, String literal) {
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
	
} //BuObjectNodeCategoryEnum
