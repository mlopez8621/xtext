/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.NetworkSystem#getPetrinets <em>Petrinets</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getNetworkSystem()
 * @model
 * @generated
 */
public interface NetworkSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Petrinets</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.PetriNet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinets</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getNetworkSystem_Petrinets()
	 * @model containment="true"
	 * @generated
	 */
	EList<PetriNet> getPetrinets();

} // NetworkSystem
