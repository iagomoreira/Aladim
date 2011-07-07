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
 * A representation of the model object '<em><b>transition Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aladim.transitionNavigation#getName <em>Name</em>}</li>
 *   <li>{@link aladim.transitionNavigation#getTnFrom <em>Tn From</em>}</li>
 *   <li>{@link aladim.transitionNavigation#getTnTo <em>Tn To</em>}</li>
 * </ul>
 * </p>
 *
 * @see aladim.AladimPackage#gettransitionNavigation()
 * @model
 * @generated
 */
public interface transitionNavigation extends EObject {
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
	 * @see aladim.AladimPackage#gettransitionNavigation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aladim.transitionNavigation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tn From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tn From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tn From</em>' reference.
	 * @see #setTnFrom(interactionSpace)
	 * @see aladim.AladimPackage#gettransitionNavigation_TnFrom()
	 * @model required="true"
	 * @generated
	 */
	interactionSpace getTnFrom();

	/**
	 * Sets the value of the '{@link aladim.transitionNavigation#getTnFrom <em>Tn From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tn From</em>' reference.
	 * @see #getTnFrom()
	 * @generated
	 */
	void setTnFrom(interactionSpace value);

	/**
	 * Returns the value of the '<em><b>Tn To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tn To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tn To</em>' reference.
	 * @see #setTnTo(interactionSpace)
	 * @see aladim.AladimPackage#gettransitionNavigation_TnTo()
	 * @model required="true"
	 * @generated
	 */
	interactionSpace getTnTo();

	/**
	 * Sets the value of the '{@link aladim.transitionNavigation#getTnTo <em>Tn To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tn To</em>' reference.
	 * @see #getTnTo()
	 * @generated
	 */
	void setTnTo(interactionSpace value);

} // transitionNavigation
