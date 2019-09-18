/**
 */
package petrinet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinet.Arc;
import petrinet.PetriNet;
import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.ArcImpl#getFromNet <em>From Net</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getToNet <em>To Net</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArcImpl extends ElementImpl implements Arc {
	/**
	 * The cached value of the '{@link #getFromNet() <em>From Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromNet()
	 * @generated
	 * @ordered
	 */
	protected PetriNet fromNet;

	/**
	 * The cached value of the '{@link #getToNet() <em>To Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNet()
	 * @generated
	 * @ordered
	 */
	protected PetriNet toNet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetriNet getFromNet() {
		if (fromNet != null && fromNet.eIsProxy()) {
			InternalEObject oldFromNet = (InternalEObject)fromNet;
			fromNet = (PetriNet)eResolveProxy(oldFromNet);
			if (fromNet != oldFromNet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__FROM_NET, oldFromNet, fromNet));
			}
		}
		return fromNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet basicGetFromNet() {
		return fromNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromNet(PetriNet newFromNet) {
		PetriNet oldFromNet = fromNet;
		fromNet = newFromNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__FROM_NET, oldFromNet, fromNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetriNet getToNet() {
		if (toNet != null && toNet.eIsProxy()) {
			InternalEObject oldToNet = (InternalEObject)toNet;
			toNet = (PetriNet)eResolveProxy(oldToNet);
			if (toNet != oldToNet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__TO_NET, oldToNet, toNet));
			}
		}
		return toNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet basicGetToNet() {
		return toNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToNet(PetriNet newToNet) {
		PetriNet oldToNet = toNet;
		toNet = newToNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__TO_NET, oldToNet, toNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetPackage.ARC__FROM_NET:
				if (resolve) return getFromNet();
				return basicGetFromNet();
			case PetrinetPackage.ARC__TO_NET:
				if (resolve) return getToNet();
				return basicGetToNet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetPackage.ARC__FROM_NET:
				setFromNet((PetriNet)newValue);
				return;
			case PetrinetPackage.ARC__TO_NET:
				setToNet((PetriNet)newValue);
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
			case PetrinetPackage.ARC__FROM_NET:
				setFromNet((PetriNet)null);
				return;
			case PetrinetPackage.ARC__TO_NET:
				setToNet((PetriNet)null);
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
			case PetrinetPackage.ARC__FROM_NET:
				return fromNet != null;
			case PetrinetPackage.ARC__TO_NET:
				return toNet != null;
		}
		return super.eIsSet(featureID);
	}

} //ArcImpl
