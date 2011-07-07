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
 * A representation of the model object '<em><b>interface Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aladim.interfaceModel#getApplication <em>Application</em>}</li>
 *   <li>{@link aladim.interfaceModel#getInteractionSpaces <em>Interaction Spaces</em>}</li>
 *   <li>{@link aladim.interfaceModel#getDomainFunctions <em>Domain Functions</em>}</li>
 *   <li>{@link aladim.interfaceModel#getReactions <em>Reactions</em>}</li>
 *   <li>{@link aladim.interfaceModel#getActions <em>Actions</em>}</li>
 *   <li>{@link aladim.interfaceModel#getNavigations <em>Navigations</em>}</li>
 * </ul>
 * </p>
 *
 * @see aladim.AladimPackage#getinterfaceModel()
 * @model
 * @generated
 */
public interface interfaceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see aladim.AladimPackage#getinterfaceModel_Application()
	 * @model
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link aladim.interfaceModel#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Interaction Spaces</b></em>' containment reference list.
	 * The list contents are of type {@link aladim.interactionSpace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Spaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Spaces</em>' containment reference list.
	 * @see aladim.AladimPackage#getinterfaceModel_InteractionSpaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<interactionSpace> getInteractionSpaces();

	/**
	 * Returns the value of the '<em><b>Domain Functions</b></em>' containment reference list.
	 * The list contents are of type {@link aladim.domainFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Functions</em>' containment reference list.
	 * @see aladim.AladimPackage#getinterfaceModel_DomainFunctions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<domainFunction> getDomainFunctions();

	/**
	 * Returns the value of the '<em><b>Reactions</b></em>' containment reference list.
	 * The list contents are of type {@link aladim.transitionReaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactions</em>' containment reference list.
	 * @see aladim.AladimPackage#getinterfaceModel_Reactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<transitionReaction> getReactions();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link aladim.transitionAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see aladim.AladimPackage#getinterfaceModel_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<transitionAction> getActions();

	/**
	 * Returns the value of the '<em><b>Navigations</b></em>' containment reference list.
	 * The list contents are of type {@link aladim.transitionNavigation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigations</em>' containment reference list.
	 * @see aladim.AladimPackage#getinterfaceModel_Navigations()
	 * @model containment="true"
	 * @generated
	 */
	EList<transitionNavigation> getNavigations();

} // interfaceModel
