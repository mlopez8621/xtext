/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Arc#getFromNet <em>From Net</em>}</li>
 *   <li>{@link petrinet.Arc#getToNet <em>To Net</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getArc()
 * @model abstract="true"
 * @generated
 */
public interface Arc extends Element {
	/**
	 * Returns the value of the '<em><b>From Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Net</em>' reference.
	 * @see #setFromNet(PetriNet)
	 * @see petrinet.PetrinetPackage#getArc_FromNet()
	 * @model required="true"
	 * @generated
	 */
	PetriNet getFromNet();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getFromNet <em>From Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Net</em>' reference.
	 * @see #getFromNet()
	 * @generated
	 */
	void setFromNet(PetriNet value);

	/**
	 * Returns the value of the '<em><b>To Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Net</em>' reference.
	 * @see #setToNet(PetriNet)
	 * @see petrinet.PetrinetPackage#getArc_ToNet()
	 * @model required="true"
	 * @generated
	 */
	PetriNet getToNet();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getToNet <em>To Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Net</em>' reference.
	 * @see #getToNet()
	 * @generated
	 */
	void setToNet(PetriNet value);

} // Arc
