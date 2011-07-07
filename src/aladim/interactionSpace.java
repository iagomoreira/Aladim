/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interaction Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aladim.interactionSpace#getName <em>Name</em>}</li>
 *   <li>{@link aladim.interactionSpace#getInteractions <em>Interactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see aladim.AladimPackage#getinteractionSpace()
 * @model
 * @generated
 */
public interface interactionSpace extends EObject {
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
	 * @see aladim.AladimPackage#getinteractionSpace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aladim.interactionSpace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link aladim.Interaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactions</em>' containment reference list.
	 * @see aladim.AladimPackage#getinteractionSpace_Interactions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Interaction> getInteractions();

} // interactionSpace
