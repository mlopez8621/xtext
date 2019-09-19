/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.rest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rest.MapName;
import org.xtext.example.mydsl.rest.Metodo;
import org.xtext.example.mydsl.rest.PathParam;
import org.xtext.example.mydsl.rest.RestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rest.impl.MapNameImpl#getMetodo <em>Metodo</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rest.impl.MapNameImpl#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapNameImpl extends MinimalEObjectImpl.Container implements MapName
{
  /**
   * The cached value of the '{@link #getMetodo() <em>Metodo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetodo()
   * @generated
   * @ordered
   */
  protected Metodo metodo;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected PathParam param;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapNameImpl()
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
    return RestPackage.Literals.MAP_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Metodo getMetodo()
  {
    if (metodo != null && metodo.eIsProxy())
    {
      InternalEObject oldMetodo = (InternalEObject)metodo;
      metodo = (Metodo)eResolveProxy(oldMetodo);
      if (metodo != oldMetodo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestPackage.MAP_NAME__METODO, oldMetodo, metodo));
      }
    }
    return metodo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metodo basicGetMetodo()
  {
    return metodo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMetodo(Metodo newMetodo)
  {
    Metodo oldMetodo = metodo;
    metodo = newMetodo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.MAP_NAME__METODO, oldMetodo, metodo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PathParam getParam()
  {
    if (param != null && param.eIsProxy())
    {
      InternalEObject oldParam = (InternalEObject)param;
      param = (PathParam)eResolveProxy(oldParam);
      if (param != oldParam)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestPackage.MAP_NAME__PARAM, oldParam, param));
      }
    }
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathParam basicGetParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParam(PathParam newParam)
  {
    PathParam oldParam = param;
    param = newParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.MAP_NAME__PARAM, oldParam, param));
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
      case RestPackage.MAP_NAME__METODO:
        if (resolve) return getMetodo();
        return basicGetMetodo();
      case RestPackage.MAP_NAME__PARAM:
        if (resolve) return getParam();
        return basicGetParam();
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
      case RestPackage.MAP_NAME__METODO:
        setMetodo((Metodo)newValue);
        return;
      case RestPackage.MAP_NAME__PARAM:
        setParam((PathParam)newValue);
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
      case RestPackage.MAP_NAME__METODO:
        setMetodo((Metodo)null);
        return;
      case RestPackage.MAP_NAME__PARAM:
        setParam((PathParam)null);
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
      case RestPackage.MAP_NAME__METODO:
        return metodo != null;
      case RestPackage.MAP_NAME__PARAM:
        return param != null;
    }
    return super.eIsSet(featureID);
  }

} //MapNameImpl