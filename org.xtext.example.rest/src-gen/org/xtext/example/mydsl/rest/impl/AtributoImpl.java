/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.rest.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rest.Atributo;
import org.xtext.example.mydsl.rest.Mock;
import org.xtext.example.mydsl.rest.RestPackage;
import org.xtext.example.mydsl.rest.TipoElemento;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rest.impl.AtributoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rest.impl.AtributoImpl#isArray <em>Array</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rest.impl.AtributoImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rest.impl.AtributoImpl#getMocktype <em>Mocktype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends MinimalEObjectImpl.Container implements Atributo
{
  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected TipoElemento tipo;

  /**
   * The default value of the '{@link #isArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArray()
   * @generated
   * @ordered
   */
  protected static final boolean ARRAY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArray()
   * @generated
   * @ordered
   */
  protected boolean array = ARRAY_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMocktype() <em>Mocktype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMocktype()
   * @generated
   * @ordered
   */
  protected Mock mocktype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtributoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RestPackage.Literals.ATRIBUTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TipoElemento getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipo(TipoElemento newTipo, NotificationChain msgs)
  {
    TipoElemento oldTipo = tipo;
    tipo = newTipo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ATRIBUTO__TIPO, oldTipo, newTipo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTipo(TipoElemento newTipo)
  {
    if (newTipo != tipo)
    {
      NotificationChain msgs = null;
      if (tipo != null)
        msgs = ((InternalEObject)tipo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ATRIBUTO__TIPO, null, msgs);
      if (newTipo != null)
        msgs = ((InternalEObject)newTipo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ATRIBUTO__TIPO, null, msgs);
      msgs = basicSetTipo(newTipo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ATRIBUTO__TIPO, newTipo, newTipo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArray(boolean newArray)
  {
    boolean oldArray = array;
    array = newArray;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ATRIBUTO__ARRAY, oldArray, array));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ATRIBUTO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mock getMocktype()
  {
    return mocktype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMocktype(Mock newMocktype, NotificationChain msgs)
  {
    Mock oldMocktype = mocktype;
    mocktype = newMocktype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ATRIBUTO__MOCKTYPE, oldMocktype, newMocktype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMocktype(Mock newMocktype)
  {
    if (newMocktype != mocktype)
    {
      NotificationChain msgs = null;
      if (mocktype != null)
        msgs = ((InternalEObject)mocktype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ATRIBUTO__MOCKTYPE, null, msgs);
      if (newMocktype != null)
        msgs = ((InternalEObject)newMocktype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ATRIBUTO__MOCKTYPE, null, msgs);
      msgs = basicSetMocktype(newMocktype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ATRIBUTO__MOCKTYPE, newMocktype, newMocktype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RestPackage.ATRIBUTO__TIPO:
        return basicSetTipo(null, msgs);
      case RestPackage.ATRIBUTO__MOCKTYPE:
        return basicSetMocktype(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RestPackage.ATRIBUTO__TIPO:
        return getTipo();
      case RestPackage.ATRIBUTO__ARRAY:
        return isArray();
      case RestPackage.ATRIBUTO__NAME:
        return getName();
      case RestPackage.ATRIBUTO__MOCKTYPE:
        return getMocktype();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RestPackage.ATRIBUTO__TIPO:
        setTipo((TipoElemento)newValue);
        return;
      case RestPackage.ATRIBUTO__ARRAY:
        setArray((Boolean)newValue);
        return;
      case RestPackage.ATRIBUTO__NAME:
        setName((String)newValue);
        return;
      case RestPackage.ATRIBUTO__MOCKTYPE:
        setMocktype((Mock)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RestPackage.ATRIBUTO__TIPO:
        setTipo((TipoElemento)null);
        return;
      case RestPackage.ATRIBUTO__ARRAY:
        setArray(ARRAY_EDEFAULT);
        return;
      case RestPackage.ATRIBUTO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RestPackage.ATRIBUTO__MOCKTYPE:
        setMocktype((Mock)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RestPackage.ATRIBUTO__TIPO:
        return tipo != null;
      case RestPackage.ATRIBUTO__ARRAY:
        return array != ARRAY_EDEFAULT;
      case RestPackage.ATRIBUTO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RestPackage.ATRIBUTO__MOCKTYPE:
        return mocktype != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (array: ");
    result.append(array);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AtributoImpl