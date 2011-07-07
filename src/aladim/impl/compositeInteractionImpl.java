/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim.impl;

import aladim.AladimPackage;
import aladim.basicInteraction;
import aladim.compositeInteraction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>composite Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aladim.impl.compositeInteractionImpl#getBasicInteractions <em>Basic Interactions</em>}</li>
 *   <li>{@link aladim.impl.compositeInteractionImpl#getComposites <em>Composites</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class compositeInteractionImpl extends InteractionImpl implements compositeInteraction {
	/**
	 * The cached value of the '{@link #getBasicInteractions() <em>Basic Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<basicInteraction> basicInteractions;

	/**
	 * The cached value of the '{@link #getComposites() <em>Composites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposites()
	 * @generated
	 * @ordered
	 */
	protected EList<compositeInteraction> composites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected compositeInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AladimPackage.Literals.COMPOSITE_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<basicInteraction> getBasicInteractions() {
		if (basicInteractions == null) {
			basicInteractions = new EObjectContainmentEList<basicInteraction>(basicInteraction.class, this, AladimPackage.COMPOSITE_INTERACTION__BASIC_INTERACTIONS);
		}
		return basicInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<compositeInteraction> getComposites() {
		if (composites == null) {
			composites = new EObjectContainmentEList<compositeInteraction>(compositeInteraction.class, this, AladimPackage.COMPOSITE_INTERACTION__COMPOSITES);
		}
		return composites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AladimPackage.COMPOSITE_INTERACTION__BASIC_INTERACTIONS:
				return ((InternalEList<?>)getBasicInteractions()).basicRemove(otherEnd, msgs);
			case AladimPackage.COMPOSITE_INTERACTION__COMPOSITES:
				return ((InternalEList<?>)getComposites()).basicRemove(otherEnd, msgs);
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
			case AladimPackage.COMPOSITE_INTERACTION__BASIC_INTERACTIONS:
				return getBasicInteractions();
			case AladimPackage.COMPOSITE_INTERACTION__COMPOSITES:
				return getComposites();
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
			case AladimPackage.COMPOSITE_INTERACTION__BASIC_INTERACTIONS:
				getBasicInteractions().clear();
				getBasicInteractions().addAll((Collection<? extends basicInteraction>)newValue);
				return;
			case AladimPackage.COMPOSITE_INTERACTION__COMPOSITES:
				getComposites().clear();
				getComposites().addAll((Collection<? extends compositeInteraction>)newValue);
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
			case AladimPackage.COMPOSITE_INTERACTION__BASIC_INTERACTIONS:
				getBasicInteractions().clear();
				return;
			case AladimPackage.COMPOSITE_INTERACTION__COMPOSITES:
				getComposites().clear();
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
			case AladimPackage.COMPOSITE_INTERACTION__BASIC_INTERACTIONS:
				return basicInteractions != null && !basicInteractions.isEmpty();
			case AladimPackage.COMPOSITE_INTERACTION__COMPOSITES:
				return composites != null && !composites.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //compositeInteractionImpl
