/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>transition Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aladim.transitionAction#getTaFrom <em>Ta From</em>}</li>
 *   <li>{@link aladim.transitionAction#getTaTo <em>Ta To</em>}</li>
 *   <li>{@link aladim.transitionAction#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see aladim.AladimPackage#gettransitionAction()
 * @model
 * @generated
 */
public interface transitionAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Ta From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ta From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ta From</em>' reference.
	 * @see #setTaFrom(interactionSpace)
	 * @see aladim.AladimPackage#gettransitionAction_TaFrom()
	 * @model required="true"
	 * @generated
	 */
	interactionSpace getTaFrom();

	/**
	 * Sets the value of the '{@link aladim.transitionAction#getTaFrom <em>Ta From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ta From</em>' reference.
	 * @see #getTaFrom()
	 * @generated
	 */
	void setTaFrom(interactionSpace value);

	/**
	 * Returns the value of the '<em><b>Ta To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ta To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ta To</em>' reference.
	 * @see #setTaTo(domainFunction)
	 * @see aladim.AladimPackage#gettransitionAction_TaTo()
	 * @model required="true"
	 * @generated
	 */
	domainFunction getTaTo();

	/**
	 * Sets the value of the '{@link aladim.transitionAction#getTaTo <em>Ta To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ta To</em>' reference.
	 * @see #getTaTo()
	 * @generated
	 */
	void setTaTo(domainFunction value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see aladim.AladimPackage#gettransitionAction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aladim.transitionAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // transitionAction
