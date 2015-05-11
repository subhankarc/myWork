/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.casestudy.subhankar.casestudymodel.impl;

import com.sap.casestudy.subhankar.casestudymodel.CasestudymodelPackage;
import com.sap.casestudy.subhankar.casestudymodel.Documentation;
import com.sap.casestudy.subhankar.casestudymodel.IAdtObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.DocumentationImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.DocumentationImpl#getTechnicalName <em>Technical Name</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.DocumentationImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.DocumentationImpl#getShortText <em>Short Text</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.DocumentationImpl#getLongText <em>Long Text</em>}</li>
 *   <li>{@link com.sap.casestudy.subhankar.casestudymodel.impl.DocumentationImpl#getContainingObject <em>Containing Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentationImpl extends EObjectImpl implements Documentation {
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
	 * The default value of the '{@link #getShortText() <em>Short Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortText()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortText() <em>Short Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortText()
	 * @generated
	 * @ordered
	 */
	protected String shortText = SHORT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongText() <em>Long Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongText()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongText() <em>Long Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongText()
	 * @generated
	 * @ordered
	 */
	protected String longText = LONG_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CasestudymodelPackage.Literals.DOCUMENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DOCUMENTATION__ID, oldId, id, !oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CasestudymodelPackage.DOCUMENTATION__ID, oldId, ID_EDEFAULT, oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DOCUMENTATION__TECHNICAL_NAME, oldTechnicalName, technicalName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CasestudymodelPackage.DOCUMENTATION__DOCUMENTATION, oldDocumentation, documentation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DOCUMENTATION__DOCUMENTATION, oldDocumentation, newDocumentation);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DOCUMENTATION__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortText() {
		return shortText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortText(String newShortText) {
		String oldShortText = shortText;
		shortText = newShortText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DOCUMENTATION__SHORT_TEXT, oldShortText, shortText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongText() {
		return longText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongText(String newLongText) {
		String oldLongText = longText;
		longText = newLongText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DOCUMENTATION__LONG_TEXT, oldLongText, longText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdtObject getContainingObject() {
		if (eContainerFeatureID() != CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT) return null;
		return (IAdtObject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdtObject basicGetContainingObject() {
		if (eContainerFeatureID() != CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT) return null;
		return (IAdtObject)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingObject(IAdtObject newContainingObject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingObject, CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingObject(IAdtObject newContainingObject) {
		if (newContainingObject != eInternalContainer() || (eContainerFeatureID() != CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT && newContainingObject != null)) {
			if (EcoreUtil.isAncestor(this, newContainingObject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingObject != null)
				msgs = ((InternalEObject)newContainingObject).eInverseAdd(this, CasestudymodelPackage.IADT_OBJECT__DOCUMENTATION, IAdtObject.class, msgs);
			msgs = basicSetContainingObject(newContainingObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT, newContainingObject, newContainingObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CasestudymodelPackage.DOCUMENTATION__DOCUMENTATION:
				if (documentation != null)
					msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CasestudymodelPackage.DOCUMENTATION__DOCUMENTATION, null, msgs);
				return basicSetDocumentation((Documentation)otherEnd, msgs);
			case CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingObject((IAdtObject)otherEnd, msgs);
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
			case CasestudymodelPackage.DOCUMENTATION__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT:
				return basicSetContainingObject(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT:
				return eInternalContainer().eInverseRemove(this, CasestudymodelPackage.IADT_OBJECT__DOCUMENTATION, IAdtObject.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CasestudymodelPackage.DOCUMENTATION__ID:
				return getId();
			case CasestudymodelPackage.DOCUMENTATION__TECHNICAL_NAME:
				return getTechnicalName();
			case CasestudymodelPackage.DOCUMENTATION__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
			case CasestudymodelPackage.DOCUMENTATION__SHORT_TEXT:
				return getShortText();
			case CasestudymodelPackage.DOCUMENTATION__LONG_TEXT:
				return getLongText();
			case CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT:
				if (resolve) return getContainingObject();
				return basicGetContainingObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CasestudymodelPackage.DOCUMENTATION__ID:
				setId((String)newValue);
				return;
			case CasestudymodelPackage.DOCUMENTATION__TECHNICAL_NAME:
				setTechnicalName((String)newValue);
				return;
			case CasestudymodelPackage.DOCUMENTATION__DOCUMENTATION:
				setDocumentation((Documentation)newValue);
				return;
			case CasestudymodelPackage.DOCUMENTATION__SHORT_TEXT:
				setShortText((String)newValue);
				return;
			case CasestudymodelPackage.DOCUMENTATION__LONG_TEXT:
				setLongText((String)newValue);
				return;
			case CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT:
				setContainingObject((IAdtObject)newValue);
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
			case CasestudymodelPackage.DOCUMENTATION__ID:
				unsetId();
				return;
			case CasestudymodelPackage.DOCUMENTATION__TECHNICAL_NAME:
				setTechnicalName(TECHNICAL_NAME_EDEFAULT);
				return;
			case CasestudymodelPackage.DOCUMENTATION__DOCUMENTATION:
				setDocumentation((Documentation)null);
				return;
			case CasestudymodelPackage.DOCUMENTATION__SHORT_TEXT:
				setShortText(SHORT_TEXT_EDEFAULT);
				return;
			case CasestudymodelPackage.DOCUMENTATION__LONG_TEXT:
				setLongText(LONG_TEXT_EDEFAULT);
				return;
			case CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT:
				setContainingObject((IAdtObject)null);
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
			case CasestudymodelPackage.DOCUMENTATION__ID:
				return isSetId();
			case CasestudymodelPackage.DOCUMENTATION__TECHNICAL_NAME:
				return TECHNICAL_NAME_EDEFAULT == null ? technicalName != null : !TECHNICAL_NAME_EDEFAULT.equals(technicalName);
			case CasestudymodelPackage.DOCUMENTATION__DOCUMENTATION:
				return documentation != null;
			case CasestudymodelPackage.DOCUMENTATION__SHORT_TEXT:
				return SHORT_TEXT_EDEFAULT == null ? shortText != null : !SHORT_TEXT_EDEFAULT.equals(shortText);
			case CasestudymodelPackage.DOCUMENTATION__LONG_TEXT:
				return LONG_TEXT_EDEFAULT == null ? longText != null : !LONG_TEXT_EDEFAULT.equals(longText);
			case CasestudymodelPackage.DOCUMENTATION__CONTAINING_OBJECT:
				return basicGetContainingObject() != null;
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
		result.append(", shortText: ");
		result.append(shortText);
		result.append(", longText: ");
		result.append(longText);
		result.append(')');
		return result.toString();
	}

} //DocumentationImpl
