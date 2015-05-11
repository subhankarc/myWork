/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel.impl;

import com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage;
import com.sap.casestudy.subhankar.casestudymodel.DeploymentUnit;
import com.sap.casestudy.subhankar.casestudymodel.Documentation;
import com.sap.casestudy.subhankar.casestudymodel.FileExtensionEnum;
import com.sap.casestudy.subhankar.casestudymodel.ProcessComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.DeploymentUnitImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.DeploymentUnitImpl#getTechnicalName <em>Technical Name</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.DeploymentUnitImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.DeploymentUnitImpl#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.DeploymentUnitImpl#getAbbreviatonName <em>Abbreviaton Name</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.DeploymentUnitImpl#getSemanticName <em>Semantic Name</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.DeploymentUnitImpl#getProcessComponents <em>Process Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentUnitImpl extends EObjectImpl implements DeploymentUnit {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The default value of the '{@link #getTechnicalName() <em>Technical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalName()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNICAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnicalName() <em>Technical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalName()
	 * @generated
	 * @ordered
	 */
	protected String technicalName = TECHNICAL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected Documentation documentation;

	/**
	 * The default value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected static final FileExtensionEnum FILE_EXTENSION_EDEFAULT = FileExtensionEnum.NAMESPACE_EXTENSION;

	/**
	 * The cached value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected FileExtensionEnum fileExtension = FILE_EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbbreviatonName() <em>Abbreviaton Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviatonName()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBREVIATON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbbreviatonName() <em>Abbreviaton Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviatonName()
	 * @generated
	 * @ordered
	 */
	protected String abbreviatonName = ABBREVIATON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemanticName() <em>Semantic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticName()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticName() <em>Semantic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticName()
	 * @generated
	 * @ordered
	 */
	protected String semanticName = SEMANTIC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessComponents() <em>Process Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessComponent> processComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CasestudymodelPackage.Literals.DEPLOYMENT_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DEPLOYMENT_UNIT__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		String oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CasestudymodelPackage.DEPLOYMENT_UNIT__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnicalName() {
		return technicalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnicalName(String newTechnicalName) {
		String oldTechnicalName = technicalName;
		technicalName = newTechnicalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DEPLOYMENT_UNIT__TECHNICAL_NAME, oldTechnicalName, technicalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation getDocumentation() {
		if (documentation != null && documentation.eIsProxy()) {
			InternalEObject oldDocumentation = (InternalEObject)documentation;
			documentation = (Documentation)eResolveProxy(oldDocumentation);
			if (documentation != oldDocumentation) {
				InternalEObject newDocumentation = (InternalEObject)documentation;
				NotificationChain msgs =  oldDocumentation.eInverseRemove(this, CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT, Documentation.class, null);
				if (newDocumentation.eInternalContainer() == null) {
					msgs =  newDocumentation.eInverseAdd(this, CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT, Documentation.class, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CasestudymodelPackage.DEPLOYMENT_UNIT__DOCUMENTATION, oldDocumentation, documentation));
			}
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation basicGetDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Documentation newDocumentation, NotificationChain msgs) {
		Documentation oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DEPLOYMENT_UNIT__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(Documentation newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT, Documentation.class, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT, Documentation.class, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DEPLOYMENT_UNIT__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileExtensionEnum getFileExtension() {
		return fileExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileExtension(FileExtensionEnum newFileExtension) {
		FileExtensionEnum oldFileExtension = fileExtension;
		fileExtension = newFileExtension == null ? FILE_EXTENSION_EDEFAULT : newFileExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DEPLOYMENT_UNIT__FILE_EXTENSION, oldFileExtension, fileExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbbreviatonName() {
		return abbreviatonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbbreviatonName(String newAbbreviatonName) {
		String oldAbbreviatonName = abbreviatonName;
		abbreviatonName = newAbbreviatonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DEPLOYMENT_UNIT__ABBREVIATON_NAME, oldAbbreviatonName, abbreviatonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemanticName() {
		return semanticName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticName(String newSemanticName) {
		String oldSemanticName = semanticName;
		semanticName = newSemanticName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DEPLOYMENT_UNIT__SEMANTIC_NAME, oldSemanticName, semanticName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessComponent> getProcessComponents() {
		if (processComponents == null) {
			processComponents = new EObjectContainmentWithInverseEList.Resolving<ProcessComponent>(ProcessComponent.class, this, CasestudymodelPackage.DEPLOYMENT_UNIT__PROCESS_COMPONENTS, CasestudymodelPackage.PROCESS_COMPONENT__DEPLOYMENT_UNIT);
		}
		return processComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CasestudymodelPackage.DEPLOYMENT_UNIT__DOCUMENTATION:
				if (documentation != null)
					msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CasestudymodelPackage.DEPLOYMENT_UNIT__DOCUMENTATION, null, msgs);
				return basicSetDocumentation((Documentation)otherEnd, msgs);
			case CasestudymodelPackage.DEPLOYMENT_UNIT__PROCESS_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessComponents()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CasestudymodelPackage.DEPLOYMENT_UNIT__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case CasestudymodelPackage.DEPLOYMENT_UNIT__PROCESS_COMPONENTS:
				return ((InternalEList<?>)getProcessComponents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CasestudymodelPackage.DEPLOYMENT_UNIT__ID:
				return getId();
			case CasestudymodelPackage.DEPLOYMENT_UNIT__TECHNICAL_NAME:
				return getTechnicalName();
			case CasestudymodelPackage.DEPLOYMENT_UNIT__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
			case CasestudymodelPackage.DEPLOYMENT_UNIT__FILE_EXTENSION:
				return getFileExtension();
			case CasestudymodelPackage.DEPLOYMENT_UNIT__ABBREVIATON_NAME:
				return getAbbreviatonName();
			case CasestudymodelPackage.DEPLOYMENT_UNIT__SEMANTIC_NAME:
				return getSemanticName();
			case CasestudymodelPackage.DEPLOYMENT_UNIT__PROCESS_COMPONENTS:
				return getProcessComponents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CasestudymodelPackage.DEPLOYMENT_UNIT__ID:
				setId((String)newValue);
				return;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__TECHNICAL_NAME:
				setTechnicalName((String)newValue);
				return;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__DOCUMENTATION:
				setDocumentation((Documentation)newValue);
				return;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__FILE_EXTENSION:
				setFileExtension((FileExtensionEnum)newValue);
				return;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__ABBREVIATON_NAME:
				setAbbreviatonName((String)newValue);
				return;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__SEMANTIC_NAME:
				setSemanticName((String)newValue);
				return;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__PROCESS_COMPONENTS:
				getProcessComponents().clear();
				getProcessComponents().addAll((Collection<? extends ProcessComponent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CasestudymodelPackage.DEPLOYMENT_UNIT__ID:
				unsetId();
				return;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__TECHNICAL_NAME:
				setTechnicalName(TECHNICAL_NAME_EDEFAULT);
				return;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__DOCUMENTATION:
				setDocumentation((Documentation)null);
				return;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__FILE_EXTENSION:
				setFileExtension(FILE_EXTENSION_EDEFAULT);
				return;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__ABBREVIATON_NAME:
				setAbbreviatonName(ABBREVIATON_NAME_EDEFAULT);
				return;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__SEMANTIC_NAME:
				setSemanticName(SEMANTIC_NAME_EDEFAULT);
				return;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__PROCESS_COMPONENTS:
				getProcessComponents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CasestudymodelPackage.DEPLOYMENT_UNIT__ID:
				return isSetId();
			case CasestudymodelPackage.DEPLOYMENT_UNIT__TECHNICAL_NAME:
				return TECHNICAL_NAME_EDEFAULT == null ? technicalName != null : !TECHNICAL_NAME_EDEFAULT.equals(technicalName);
			case CasestudymodelPackage.DEPLOYMENT_UNIT__DOCUMENTATION:
				return documentation != null;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__FILE_EXTENSION:
				return fileExtension != FILE_EXTENSION_EDEFAULT;
			case CasestudymodelPackage.DEPLOYMENT_UNIT__ABBREVIATON_NAME:
				return ABBREVIATON_NAME_EDEFAULT == null ? abbreviatonName != null : !ABBREVIATON_NAME_EDEFAULT.equals(abbreviatonName);
			case CasestudymodelPackage.DEPLOYMENT_UNIT__SEMANTIC_NAME:
				return SEMANTIC_NAME_EDEFAULT == null ? semanticName != null : !SEMANTIC_NAME_EDEFAULT.equals(semanticName);
			case CasestudymodelPackage.DEPLOYMENT_UNIT__PROCESS_COMPONENTS:
				return processComponents != null && !processComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", technicalName: ");
		result.append(technicalName);
		result.append(", fileExtension: ");
		result.append(fileExtension);
		result.append(", abbreviatonName: ");
		result.append(abbreviatonName);
		result.append(", semanticName: ");
		result.append(semanticName);
		result.append(')');
		return result.toString();
	}

} //DeploymentUnitImpl
