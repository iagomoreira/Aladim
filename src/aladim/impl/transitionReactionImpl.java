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
import aladim.transitionReaction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>transition Reaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aladim.impl.transitionReactionImpl#getTrFrom <em>Tr From</em>}</li>
 *   <li>{@link aladim.impl.transitionReactionImpl#getTrTo <em>Tr To</em>}</li>
 *   <li>{@link aladim.impl.transitionReactionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class transitionReactionImpl extends EObjectImpl implements transitionReaction {
	/**
	 * The cached value of the '{@link #getTrFrom() <em>Tr From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrFrom()
	 * @generated
	 * @ordered
	 */
	protected domainFunction trFrom;

	/**
	 * The cached value of the '{@link #getTrTo() <em>Tr To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrTo()
	 * @generated
	 * @ordered
	 */
	protected interactionSpace trTo;

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
	protected transitionReactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AladimPackage.Literals.TRANSITION_REACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public domainFunction getTrFrom() {
		if (trFrom != null && trFrom.eIsProxy()) {
			InternalEObject oldTrFrom = (InternalEObject)trFrom;
			trFrom = (domainFunction)eResolveProxy(oldTrFrom);
			if (trFrom != oldTrFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AladimPackage.TRANSITION_REACTION__TR_FROM, oldTrFrom, trFrom));
			}
		}
		return trFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public domainFunction basicGetTrFrom() {
		return trFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrFrom(domainFunction newTrFrom) {
		domainFunction oldTrFrom = trFrom;
		trFrom = newTrFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AladimPackage.TRANSITION_REACTION__TR_FROM, oldTrFrom, trFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interactionSpace getTrTo() {
		if (trTo != null && trTo.eIsProxy()) {
			InternalEObject oldTrTo = (InternalEObject)trTo;
			trTo = (interactionSpace)eResolveProxy(oldTrTo);
			if (trTo != oldTrTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AladimPackage.TRANSITION_REACTION__TR_TO, oldTrTo, trTo));
			}
		}
		return trTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interactionSpace basicGetTrTo() {
		return trTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrTo(interactionSpace newTrTo) {
		interactionSpace oldTrTo = trTo;
		trTo = newTrTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AladimPackage.TRANSITION_REACTION__TR_TO, oldTrTo, trTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AladimPackage.TRANSITION_REACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AladimPackage.TRANSITION_REACTION__TR_FROM:
				if (resolve) return getTrFrom();
				return basicGetTrFrom();
			case AladimPackage.TRANSITION_REACTION__TR_TO:
				if (resolve) return getTrTo();
				return basicGetTrTo();
			case AladimPackage.TRANSITION_REACTION__NAME:
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
			case AladimPackage.TRANSITION_REACTION__TR_FROM:
				setTrFrom((domainFunction)newValue);
				return;
			case AladimPackage.TRANSITION_REACTION__TR_TO:
				setTrTo((interactionSpace)newValue);
				return;
			case AladimPackage.TRANSITION_REACTION__NAME:
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
			case AladimPackage.TRANSITION_REACTION__TR_FROM:
				setTrFrom((domainFunction)null);
				return;
			case AladimPackage.TRANSITION_REACTION__TR_TO:
				setTrTo((interactionSpace)null);
				return;
			case AladimPackage.TRANSITION_REACTION__NAME:
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
			case AladimPackage.TRANSITION_REACTION__TR_FROM:
				return trFrom != null;
			case AladimPackage.TRANSITION_REACTION__TR_TO:
				return trTo != null;
			case AladimPackage.TRANSITION_REACTION__NAME:
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

} //transitionReactionImpl
