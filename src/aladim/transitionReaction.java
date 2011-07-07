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
 * A representation of the model object '<em><b>transition Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aladim.transitionReaction#getTrFrom <em>Tr From</em>}</li>
 *   <li>{@link aladim.transitionReaction#getTrTo <em>Tr To</em>}</li>
 *   <li>{@link aladim.transitionReaction#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see aladim.AladimPackage#gettransitionReaction()
 * @model abstract="true"
 * @generated
 */
public interface transitionReaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Tr From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tr From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr From</em>' reference.
	 * @see #setTrFrom(domainFunction)
	 * @see aladim.AladimPackage#gettransitionReaction_TrFrom()
	 * @model required="true"
	 * @generated
	 */
	domainFunction getTrFrom();

	/**
	 * Sets the value of the '{@link aladim.transitionReaction#getTrFrom <em>Tr From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tr From</em>' reference.
	 * @see #getTrFrom()
	 * @generated
	 */
	void setTrFrom(domainFunction value);

	/**
	 * Returns the value of the '<em><b>Tr To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tr To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr To</em>' reference.
	 * @see #setTrTo(interactionSpace)
	 * @see aladim.AladimPackage#gettransitionReaction_TrTo()
	 * @model required="true"
	 * @generated
	 */
	interactionSpace getTrTo();

	/**
	 * Sets the value of the '{@link aladim.transitionReaction#getTrTo <em>Tr To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tr To</em>' reference.
	 * @see #getTrTo()
	 * @generated
	 */
	void setTrTo(interactionSpace value);

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
	 * @see aladim.AladimPackage#gettransitionReaction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aladim.transitionReaction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // transitionReaction
