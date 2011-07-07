/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>basic Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aladim.basicInteraction#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see aladim.AladimPackage#getbasicInteraction()
 * @model abstract="true"
 * @generated
 */
public interface basicInteraction extends Interaction {
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
	 * @see aladim.AladimPackage#getbasicInteraction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aladim.basicInteraction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // basicInteraction
