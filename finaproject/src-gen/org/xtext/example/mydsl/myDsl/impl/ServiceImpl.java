/**
 * generated by Xtext 2.36.0-SNAPSHOT
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.ClientCallback;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Service;
import org.xtext.example.mydsl.myDsl.ServiceCallback;
import org.xtext.example.mydsl.myDsl.ServiceRequest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getServiceReq <em>Service Req</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getClientCAll <em>Client CAll</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl#getServiceCAll <em>Service CAll</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service
{
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
   * The cached value of the '{@link #getServiceReq() <em>Service Req</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceReq()
   * @generated
   * @ordered
   */
  protected ServiceRequest serviceReq;

  /**
   * The cached value of the '{@link #getClientCAll() <em>Client CAll</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientCAll()
   * @generated
   * @ordered
   */
  protected ClientCallback clientCAll;

  /**
   * The cached value of the '{@link #getServiceCAll() <em>Service CAll</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceCAll()
   * @generated
   * @ordered
   */
  protected ServiceCallback serviceCAll;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceImpl()
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
    return MyDslPackage.Literals.SERVICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ServiceRequest getServiceReq()
  {
    if (serviceReq != null && serviceReq.eIsProxy())
    {
      InternalEObject oldServiceReq = (InternalEObject)serviceReq;
      serviceReq = (ServiceRequest)eResolveProxy(oldServiceReq);
      if (serviceReq != oldServiceReq)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.SERVICE__SERVICE_REQ, oldServiceReq, serviceReq));
      }
    }
    return serviceReq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceRequest basicGetServiceReq()
  {
    return serviceReq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setServiceReq(ServiceRequest newServiceReq)
  {
    ServiceRequest oldServiceReq = serviceReq;
    serviceReq = newServiceReq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__SERVICE_REQ, oldServiceReq, serviceReq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClientCallback getClientCAll()
  {
    if (clientCAll != null && clientCAll.eIsProxy())
    {
      InternalEObject oldClientCAll = (InternalEObject)clientCAll;
      clientCAll = (ClientCallback)eResolveProxy(oldClientCAll);
      if (clientCAll != oldClientCAll)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.SERVICE__CLIENT_CALL, oldClientCAll, clientCAll));
      }
    }
    return clientCAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClientCallback basicGetClientCAll()
  {
    return clientCAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClientCAll(ClientCallback newClientCAll)
  {
    ClientCallback oldClientCAll = clientCAll;
    clientCAll = newClientCAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__CLIENT_CALL, oldClientCAll, clientCAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ServiceCallback getServiceCAll()
  {
    if (serviceCAll != null && serviceCAll.eIsProxy())
    {
      InternalEObject oldServiceCAll = (InternalEObject)serviceCAll;
      serviceCAll = (ServiceCallback)eResolveProxy(oldServiceCAll);
      if (serviceCAll != oldServiceCAll)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.SERVICE__SERVICE_CALL, oldServiceCAll, serviceCAll));
      }
    }
    return serviceCAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceCallback basicGetServiceCAll()
  {
    return serviceCAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setServiceCAll(ServiceCallback newServiceCAll)
  {
    ServiceCallback oldServiceCAll = serviceCAll;
    serviceCAll = newServiceCAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE__SERVICE_CALL, oldServiceCAll, serviceCAll));
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
      case MyDslPackage.SERVICE__NAME:
        return getName();
      case MyDslPackage.SERVICE__SERVICE_REQ:
        if (resolve) return getServiceReq();
        return basicGetServiceReq();
      case MyDslPackage.SERVICE__CLIENT_CALL:
        if (resolve) return getClientCAll();
        return basicGetClientCAll();
      case MyDslPackage.SERVICE__SERVICE_CALL:
        if (resolve) return getServiceCAll();
        return basicGetServiceCAll();
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
      case MyDslPackage.SERVICE__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.SERVICE__SERVICE_REQ:
        setServiceReq((ServiceRequest)newValue);
        return;
      case MyDslPackage.SERVICE__CLIENT_CALL:
        setClientCAll((ClientCallback)newValue);
        return;
      case MyDslPackage.SERVICE__SERVICE_CALL:
        setServiceCAll((ServiceCallback)newValue);
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
      case MyDslPackage.SERVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.SERVICE__SERVICE_REQ:
        setServiceReq((ServiceRequest)null);
        return;
      case MyDslPackage.SERVICE__CLIENT_CALL:
        setClientCAll((ClientCallback)null);
        return;
      case MyDslPackage.SERVICE__SERVICE_CALL:
        setServiceCAll((ServiceCallback)null);
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
      case MyDslPackage.SERVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.SERVICE__SERVICE_REQ:
        return serviceReq != null;
      case MyDslPackage.SERVICE__CLIENT_CALL:
        return clientCAll != null;
      case MyDslPackage.SERVICE__SERVICE_CALL:
        return serviceCAll != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ServiceImpl
