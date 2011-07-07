/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim.impl;

import aladim.AladimPackage;
import aladim.domainFunction;
import aladim.interactionSpace;
import aladim.transitionAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>transition Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aladim.impl.transitionActionImpl#getTaFrom <em>Ta From</em>}</li>
 *   <li>{@link aladim.impl.transitionActionImpl#getTaTo <em>Ta To</em>}</li>
 *   <li>{@link aladim.impl.transitionActionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class transitionActionImpl extends EObjectImpl implements transitionAction {
	/**
	 * The cached value of the '{@link #getTaFrom() <em>Ta From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaFrom()
	 * @generated
	 * @ordered
	 */
	protected interactionSpace taFrom;

	/**
	 * The cached value of the '{@link #getTaTo() <em>Ta To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaTo()
	 * @generated
	 * @ordered
	 */
	protected domainFunction taTo;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected transitionActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AladimPackage.Literals.TRANSITION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interactionSpace getTaFrom() {
		if (taFrom != null && taFrom.eIsProxy()) {
			InternalEObject oldTaFrom = (InternalEObject)taFrom;
			taFrom = (interactionSpace)eResolveProxy(oldTaFrom);
			if (taFrom != oldTaFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AladimPackage.TRANSITION_ACTION__TA_FROM, oldTaFrom, taFrom));
			}
		}
		return taFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interactionSpace basicGetTaFrom() {
		return taFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaFrom(interactionSpace newTaFrom) {
		interactionSpace oldTaFrom = taFrom;
		taFrom = newTaFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AladimPackage.TRANSITION_ACTION__TA_FROM, oldTaFrom, taFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public domainFunction getTaTo() {
		if (taTo != null && taTo.eIsProxy()) {
			InternalEObject oldTaTo = (InternalEObject)taTo;
			taTo = (domainFunction)eResolveProxy(oldTaTo);
			if (taTo != oldTaTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AladimPackage.TRANSITION_ACTION__TA_TO, oldTaTo, taTo));
			}
		}
		return taTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public domainFunction basicGetTaTo() {
		return taTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaTo(domainFunction newTaTo) {
		domainFunction oldTaTo = taTo;
		taTo = newTaTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AladimPackage.TRANSITION_ACTION__TA_TO, oldTaTo, taTo));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AladimPackage.TRANSITION_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AladimPackage.TRANSITION_ACTION__TA_FROM:
				if (resolve) return getTaFrom();
				return basicGetTaFrom();
			case AladimPackage.TRANSITION_ACTION__TA_TO:
				if (resolve) return getTaTo();
				return basicGetTaTo();
			case AladimPackage.TRANSITION_ACTION__NAME:
				return getName();
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
			case AladimPackage.TRANSITION_ACTION__TA_FROM:
				setTaFrom((interactionSpace)newValue);
				return;
			case AladimPackage.TRANSITION_ACTION__TA_TO:
				setTaTo((domainFunction)newValue);
				return;
			case AladimPackage.TRANSITION_ACTION__NAME:
				setName((String)newValue);
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
			case AladimPackage.TRANSITION_ACTION__TA_FROM:
				setTaFrom((interactionSpace)null);
				return;
			case AladimPackage.TRANSITION_ACTION__TA_TO:
				setTaTo((domainFunction)null);
				return;
			case AladimPackage.TRANSITION_ACTION__NAME:
				setName(NAME_EDEFAULT);
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
			case AladimPackage.TRANSITION_ACTION__TA_FROM:
				return taFrom != null;
			case AladimPackage.TRANSITION_ACTION__TA_TO:
				return taTo != null;
			case AladimPackage.TRANSITION_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //transitionActionImpl
