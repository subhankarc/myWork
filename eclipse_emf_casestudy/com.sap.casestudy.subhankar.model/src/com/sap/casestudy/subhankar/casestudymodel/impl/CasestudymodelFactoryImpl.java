/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel.impl;

import com.sap.casestudy.subhankar.casestudymodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CasestudymodelFactoryImpl extends EFactoryImpl implements CasestudymodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasestudymodelFactory init() {
		try {
			CasestudymodelFactory theCasestudymodelFactory = (CasestudymodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://casestudy/subhankar"); 
			if (theCasestudymodelFactory != null) {
				return theCasestudymodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CasestudymodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasestudymodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CasestudymodelPackage.DOCUMENTATION: return createDocumentation();
			case CasestudymodelPackage.BUSINESS_OBJECT: return createBusinessObject();
			case CasestudymodelPackage.PROCESS_COMPONENT: return createProcessComponent();
			case CasestudymodelPackage.DEPLOYMENT_UNIT: return createDeploymentUnit();
			case CasestudymodelPackage.BUSINESS_OBJECT_NODE: return createBusinessObjectNode();
			case CasestudymodelPackage.ROOT_BUSINESS_OBJECT_NODE: return createRootBusinessObjectNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CasestudymodelPackage.FILE_EXTENSION_ENUM:
				return createFileExtensionEnumFromString(eDataType, initialValue);
			case CasestudymodelPackage.PROCESS_COMPONENT_CATEGORY_ENUM:
				return createProcessComponentCategoryEnumFromString(eDataType, initialValue);
			case CasestudymodelPackage.BUSINESS_OBJECT_CATEGORY_ENUM:
				return createBusinessObjectCategoryEnumFromString(eDataType, initialValue);
			case CasestudymodelPackage.BU_OBJECT_NODE_CATEGORY_ENUM:
				return createBuObjectNodeCategoryEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CasestudymodelPackage.FILE_EXTENSION_ENUM:
				return convertFileExtensionEnumToString(eDataType, instanceValue);
			case CasestudymodelPackage.PROCESS_COMPONENT_CATEGORY_ENUM:
				return convertProcessComponentCategoryEnumToString(eDataType, instanceValue);
			case CasestudymodelPackage.BUSINESS_OBJECT_CATEGORY_ENUM:
				return convertBusinessObjectCategoryEnumToString(eDataType, instanceValue);
			case CasestudymodelPackage.BU_OBJECT_NODE_CATEGORY_ENUM:
				return convertBuObjectNodeCategoryEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject createBusinessObject() {
		BusinessObjectImpl businessObject = new BusinessObjectImpl();
		return businessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponent createProcessComponent() {
		ProcessComponentImpl processComponent = new ProcessComponentImpl();
		return processComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentUnit createDeploymentUnit() {
		DeploymentUnitImpl deploymentUnit = new DeploymentUnitImpl();
		return deploymentUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObjectNode createBusinessObjectNode() {
		BusinessObjectNodeImpl businessObjectNode = new BusinessObjectNodeImpl();
		return businessObjectNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootBusinessObjectNode createRootBusinessObjectNode() {
		RootBusinessObjectNodeImpl rootBusinessObjectNode = new RootBusinessObjectNodeImpl();
		return rootBusinessObjectNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileExtensionEnum createFileExtensionEnumFromString(EDataType eDataType, String initialValue) {
		FileExtensionEnum result = FileExtensionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileExtensionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessComponentCategoryEnum createProcessComponentCategoryEnumFromString(EDataType eDataType, String initialValue) {
		ProcessComponentCategoryEnum result = ProcessComponentCategoryEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessComponentCategoryEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObjectCategoryEnum createBusinessObjectCategoryEnumFromString(EDataType eDataType, String initialValue) {
		BusinessObjectCategoryEnum result = BusinessObjectCategoryEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusinessObjectCategoryEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuObjectNodeCategoryEnum createBuObjectNodeCategoryEnumFromString(EDataType eDataType, String initialValue) {
		BuObjectNodeCategoryEnum result = BuObjectNodeCategoryEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuObjectNodeCategoryEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasestudymodelPackage getCasestudymodelPackage() {
		return (CasestudymodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CasestudymodelPackage getPackage() {
		return CasestudymodelPackage.eINSTANCE;
	}

} //CasestudymodelFactoryImpl
