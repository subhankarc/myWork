/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel.impl;

import com.sap.casestudy.subhankar.casestudymodel.BuObjectNodeCategoryEnum;
import com.sap.casestudy.subhankar.casestudymodel.BusinessObject;
import com.sap.casestudy.subhankar.casestudymodel.BusinessObjectCategoryEnum;
import com.sap.casestudy.subhankar.casestudymodel.BusinessObjectNode;
import com.sap.casestudy.subhankar.casestudymodel.CasestudymodelFactory;
import com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage;
import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.Documentation;
import com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum;
import com.sap.casestudy.subhankar.casestudymodel.IAdtMainObject;
import com.sap.casestudy.subhankar.casestudymodel.IAdtObject;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponentCategoryEnum;
import com.sap.casestudy.subhankar.casestudymodel.RootBusinessObjectNode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CasestudymodelPackageImpl extends EPackageImpl implements CasestudymodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAdtObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAdtMainObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessObjectNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootBusinessObjectNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fileExtensionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processComponentCategoryEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum businessObjectCategoryEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum buObjectNodeCategoryEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CasestudymodelPackageImpl() {
		super(eNS_URI, CasestudymodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CasestudymodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CasestudymodelPackage init() {
		if (isInited) return (CasestudymodelPackage)EPackage.Registry.INSTANCE.getEPackage(CasestudymodelPackage.eNS_URI);

		// Obtain or create and register package
		CasestudymodelPackageImpl theCasestudymodelPackage = (CasestudymodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CasestudymodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CasestudymodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCasestudymodelPackage.createPackageContents();

		// Initialize created meta-data
		theCasestudymodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCasestudymodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CasestudymodelPackage.eNS_URI, theCasestudymodelPackage);
		return theCasestudymodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAdtObject() {
		return iAdtObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIAdtObject_Id() {
		return (EAttribute)iAdtObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIAdtObject_TechnicalName() {
		return (EAttribute)iAdtObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIAdtObject_Documentation() {
		return (EReference)iAdtObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentation() {
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_ShortText() {
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_LongText() {
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_ContainingObject() {
		return (EReference)documentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAdtMainObject() {
		return iAdtMainObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIAdtMainObject_FileExtension() {
		return (EAttribute)iAdtMainObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessObject() {
		return businessObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObject_ProviderClass() {
		return (EAttribute)businessObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObject_ProviderInterface() {
		return (EAttribute)businessObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObject_ObjectCategory() {
		return (EAttribute)businessObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObject_ProcessComponent() {
		return (EReference)businessObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObject_RootNode() {
		return (EReference)businessObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessComponent() {
		return processComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessComponent_DeploymentUnit() {
		return (EReference)processComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessComponent_Code() {
		return (EAttribute)processComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessComponent_NameKeyName() {
		return (EAttribute)processComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessComponent_NameKeyNamespace() {
		return (EAttribute)processComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessComponent_Category() {
		return (EAttribute)processComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessComponent_BusinessObjects() {
		return (EReference)processComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentUnit() {
		return deploymentUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentUnit_AbbreviatonName() {
		return (EAttribute)deploymentUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentUnit_SemanticName() {
		return (EAttribute)deploymentUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentUnit_ProcessComponents() {
		return (EReference)deploymentUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessObjectNode() {
		return businessObjectNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObjectNode_Category() {
		return (EAttribute)businessObjectNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObjectNode_ChildNodes() {
		return (EReference)businessObjectNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObjectNode_Parent() {
		return (EReference)businessObjectNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootBusinessObjectNode() {
		return rootBusinessObjectNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootBusinessObjectNode_BusinessObject() {
		return (EReference)rootBusinessObjectNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFileExtensionEnum() {
		return fileExtensionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessComponentCategoryEnum() {
		return processComponentCategoryEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBusinessObjectCategoryEnum() {
		return businessObjectCategoryEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuObjectNodeCategoryEnum() {
		return buObjectNodeCategoryEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasestudymodelFactory getCasestudymodelFactory() {
		return (CasestudymodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iAdtObjectEClass = createEClass(IADT_OBJECT);
		createEAttribute(iAdtObjectEClass, IADT_OBJECT__ID);
		createEAttribute(iAdtObjectEClass, IADT_OBJECT__TECHNICAL_NAME);
		createEReference(iAdtObjectEClass, IADT_OBJECT__DOCUMENTATION);

		documentationEClass = createEClass(DOCUMENTATION);
		createEAttribute(documentationEClass, DOCUMENTATION__SHORT_TEXT);
		createEAttribute(documentationEClass, DOCUMENTATION__LONG_TEXT);
		createEReference(documentationEClass, DOCUMENTATION__CONTAINING_OBJECT);

		iAdtMainObjectEClass = createEClass(IADT_MAIN_OBJECT);
		createEAttribute(iAdtMainObjectEClass, IADT_MAIN_OBJECT__FILE_EXTENSION);

		businessObjectEClass = createEClass(BUSINESS_OBJECT);
		createEAttribute(businessObjectEClass, BUSINESS_OBJECT__PROVIDER_CLASS);
		createEAttribute(businessObjectEClass, BUSINESS_OBJECT__PROVIDER_INTERFACE);
		createEAttribute(businessObjectEClass, BUSINESS_OBJECT__OBJECT_CATEGORY);
		createEReference(businessObjectEClass, BUSINESS_OBJECT__PROCESS_COMPONENT);
		createEReference(businessObjectEClass, BUSINESS_OBJECT__ROOT_NODE);

		processComponentEClass = createEClass(PROCESS_COMPONENT);
		createEReference(processComponentEClass, PROCESS_COMPONENT__DEPLOYMENT_UNIT);
		createEAttribute(processComponentEClass, PROCESS_COMPONENT__CODE);
		createEAttribute(processComponentEClass, PROCESS_COMPONENT__NAME_KEY_NAME);
		createEAttribute(processComponentEClass, PROCESS_COMPONENT__NAME_KEY_NAMESPACE);
		createEAttribute(processComponentEClass, PROCESS_COMPONENT__CATEGORY);
		createEReference(processComponentEClass, PROCESS_COMPONENT__BUSINESS_OBJECTS);

		deploymentUnitEClass = createEClass(DEPLOYMENT_UNIT);
		createEAttribute(deploymentUnitEClass, DEPLOYMENT_UNIT__ABBREVIATON_NAME);
		createEAttribute(deploymentUnitEClass, DEPLOYMENT_UNIT__SEMANTIC_NAME);
		createEReference(deploymentUnitEClass, DEPLOYMENT_UNIT__PROCESS_COMPONENTS);

		businessObjectNodeEClass = createEClass(BUSINESS_OBJECT_NODE);
		createEAttribute(businessObjectNodeEClass, BUSINESS_OBJECT_NODE__CATEGORY);
		createEReference(businessObjectNodeEClass, BUSINESS_OBJECT_NODE__CHILD_NODES);
		createEReference(businessObjectNodeEClass, BUSINESS_OBJECT_NODE__PARENT);

		rootBusinessObjectNodeEClass = createEClass(ROOT_BUSINESS_OBJECT_NODE);
		createEReference(rootBusinessObjectNodeEClass, ROOT_BUSINESS_OBJECT_NODE__BUSINESS_OBJECT);

		// Create enums
		fileExtensionEnumEEnum = createEEnum(FILE_EXTENSION_ENUM);
		processComponentCategoryEnumEEnum = createEEnum(PROCESS_COMPONENT_CATEGORY_ENUM);
		businessObjectCategoryEnumEEnum = createEEnum(BUSINESS_OBJECT_CATEGORY_ENUM);
		buObjectNodeCategoryEnumEEnum = createEEnum(BU_OBJECT_NODE_CATEGORY_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		documentationEClass.getESuperTypes().add(this.getIAdtObject());
		iAdtMainObjectEClass.getESuperTypes().add(this.getIAdtObject());
		businessObjectEClass.getESuperTypes().add(this.getIAdtMainObject());
		processComponentEClass.getESuperTypes().add(this.getIAdtMainObject());
		deploymentUnitEClass.getESuperTypes().add(this.getIAdtMainObject());
		businessObjectNodeEClass.getESuperTypes().add(this.getIAdtObject());
		rootBusinessObjectNodeEClass.getESuperTypes().add(this.getBusinessObjectNode());

		// Initialize classes and features; add operations and parameters
		initEClass(iAdtObjectEClass, IAdtObject.class, "IAdtObject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIAdtObject_Id(), ecorePackage.getEString(), "id", null, 0, 1, IAdtObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIAdtObject_TechnicalName(), ecorePackage.getEString(), "technicalName", null, 0, 1, IAdtObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIAdtObject_Documentation(), this.getDocumentation(), this.getDocumentation_ContainingObject(), "documentation", null, 1, 1, IAdtObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentation_ShortText(), ecorePackage.getEString(), "shortText", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_LongText(), ecorePackage.getEString(), "longText", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentation_ContainingObject(), this.getIAdtObject(), this.getIAdtObject_Documentation(), "containingObject", null, 1, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iAdtMainObjectEClass, IAdtMainObject.class, "IAdtMainObject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIAdtMainObject_FileExtension(), this.getFileExtensionEnum(), "fileExtension", null, 0, 1, IAdtMainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessObjectEClass, BusinessObject.class, "BusinessObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessObject_ProviderClass(), ecorePackage.getEString(), "providerClass", null, 0, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessObject_ProviderInterface(), ecorePackage.getEString(), "providerInterface", null, 0, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessObject_ObjectCategory(), this.getBusinessObjectCategoryEnum(), "objectCategory", null, 0, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessObject_ProcessComponent(), this.getProcessComponent(), this.getProcessComponent_BusinessObjects(), "processComponent", null, 1, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessObject_RootNode(), this.getRootBusinessObjectNode(), this.getRootBusinessObjectNode_BusinessObject(), "rootNode", null, 1, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processComponentEClass, ProcessComponent.class, "ProcessComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessComponent_DeploymentUnit(), this.getDeploymentUnit(), this.getDeploymentUnit_ProcessComponents(), "deploymentUnit", null, 1, 1, ProcessComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessComponent_Code(), ecorePackage.getEString(), "code", null, 0, 1, ProcessComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessComponent_NameKeyName(), ecorePackage.getEString(), "nameKeyName", null, 0, 1, ProcessComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessComponent_NameKeyNamespace(), ecorePackage.getEString(), "nameKeyNamespace", null, 0, 1, ProcessComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessComponent_Category(), this.getProcessComponentCategoryEnum(), "category", null, 0, 1, ProcessComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessComponent_BusinessObjects(), this.getBusinessObject(), this.getBusinessObject_ProcessComponent(), "businessObjects", null, 0, -1, ProcessComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentUnitEClass, DeploymentUnit.class, "DeploymentUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentUnit_AbbreviatonName(), ecorePackage.getEString(), "abbreviatonName", null, 0, 1, DeploymentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentUnit_SemanticName(), ecorePackage.getEString(), "semanticName", null, 0, 1, DeploymentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentUnit_ProcessComponents(), this.getProcessComponent(), this.getProcessComponent_DeploymentUnit(), "processComponents", null, 0, -1, DeploymentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessObjectNodeEClass, BusinessObjectNode.class, "BusinessObjectNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessObjectNode_Category(), this.getBuObjectNodeCategoryEnum(), "category", null, 0, 1, BusinessObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessObjectNode_ChildNodes(), this.getBusinessObjectNode(), this.getBusinessObjectNode_Parent(), "childNodes", null, 0, -1, BusinessObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessObjectNode_Parent(), this.getBusinessObjectNode(), this.getBusinessObjectNode_ChildNodes(), "parent", null, 1, 1, BusinessObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootBusinessObjectNodeEClass, RootBusinessObjectNode.class, "RootBusinessObjectNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootBusinessObjectNode_BusinessObject(), this.getBusinessObject(), this.getBusinessObject_RootNode(), "businessObject", null, 1, 1, RootBusinessObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fileExtensionEnumEEnum, FileExtensionEnum.class, "FileExtensionEnum");
		addEEnumLiteral(fileExtensionEnumEEnum, FileExtensionEnum.NAMESPACE_EXTENSION);
		addEEnumLiteral(fileExtensionEnumEEnum, FileExtensionEnum.DEPLOYMENT_UNIT_EXTENSION);
		addEEnumLiteral(fileExtensionEnumEEnum, FileExtensionEnum.PROCESS_COMPONENT_EXTENSION);
		addEEnumLiteral(fileExtensionEnumEEnum, FileExtensionEnum.BUSINESS_OBJECT_EXTENSION);

		initEEnum(processComponentCategoryEnumEEnum, ProcessComponentCategoryEnum.class, "ProcessComponentCategoryEnum");
		addEEnumLiteral(processComponentCategoryEnumEEnum, ProcessComponentCategoryEnum.APPLICATION_PROCESS_COMPONENT);
		addEEnumLiteral(processComponentCategoryEnumEEnum, ProcessComponentCategoryEnum.THIRD_PARTY_PROCESS_COMPONENT);
		addEEnumLiteral(processComponentCategoryEnumEEnum, ProcessComponentCategoryEnum.PROCESS_COMPONENT_AT_BUSINESS_PARTNER);

		initEEnum(businessObjectCategoryEnumEEnum, BusinessObjectCategoryEnum.class, "BusinessObjectCategoryEnum");
		addEEnumLiteral(businessObjectCategoryEnumEEnum, BusinessObjectCategoryEnum.META_OBJECT);
		addEEnumLiteral(businessObjectCategoryEnumEEnum, BusinessObjectCategoryEnum.TECHNICAL_OBJECT);
		addEEnumLiteral(businessObjectCategoryEnumEEnum, BusinessObjectCategoryEnum.MASTER_DATA_OBJECT);
		addEEnumLiteral(businessObjectCategoryEnumEEnum, BusinessObjectCategoryEnum.MASS_DATA_RUN_OBJECT);
		addEEnumLiteral(businessObjectCategoryEnumEEnum, BusinessObjectCategoryEnum.BUSINESS_CONFIGURATION_OBJECT);

		initEEnum(buObjectNodeCategoryEnumEEnum, BuObjectNodeCategoryEnum.class, "BuObjectNodeCategoryEnum");
		addEEnumLiteral(buObjectNodeCategoryEnumEEnum, BuObjectNodeCategoryEnum.TRANSFORMATION_NODE);
		addEEnumLiteral(buObjectNodeCategoryEnumEEnum, BuObjectNodeCategoryEnum.STANDARD_NODE);
		addEEnumLiteral(buObjectNodeCategoryEnumEEnum, BuObjectNodeCategoryEnum.TEXT_NODE);

		// Create resource
		createResource(eNS_URI);
	}

} //CasestudymodelPackageImpl
