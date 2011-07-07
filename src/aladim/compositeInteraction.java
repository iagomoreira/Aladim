/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aladim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>composite Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aladim.compositeInteraction#getBasicInteractions <em>Basic Interactions</em>}</li>
 *   <li>{@link aladim.compositeInteraction#getComposites <em>Composites</em>}</li>
 * </ul>
 * </p>
 *
 * @see aladim.AladimPackage#getcompositeInteraction()
 * @model abstract="true"
 * @generated
 */
public interface compositeInteraction extends Interaction {
	/**
	 * Returns the value of the '<em><b>Basic Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link aladim.basicInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Interactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Interactions</em>' containment reference list.
	 * @see aladim.AladimPackage#getcompositeInteraction_BasicInteractions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<basicInteraction> getBasicInteractions();

	/**
	 * Returns the value of the '<em><b>Composites</b></em>' containment reference list.
	 * The list contents are of type {@link aladim.compositeInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composites</em>' containment reference list.
	 * @see aladim.AladimPackage#getcompositeInteraction_Composites()
	 * @model containment="true"
	 * @generated
	 */
	EList<compositeInteraction> getComposites();

} // compositeInteraction
