/**
 * generated by Xtext 2.36.0-SNAPSHOT
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl.myDsl.Callback;
import org.xtext.example.mydsl.myDsl.Executor;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CallbackImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CallbackImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CallbackImpl#getExecutedIn <em>Executed In</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CallbackImpl#getExecutionTime <em>Execution Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallbackImpl extends MinimalEObjectImpl.Container implements Callback
{
  /**
   * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBufferSize()
   * @generated
   * @ordered
   */
  protected static final int BUFFER_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBufferSize()
   * @generated
   * @ordered
   */
  protected int bufferSize = BUFFER_SIZE_EDEFAULT;

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
   * The cached value of the '{@link #getExecutedIn() <em>Executed In</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutedIn()
   * @generated
   * @ordered
   */
  protected EList<Executor> executedIn;

  /**
   * The default value of the '{@link #getExecutionTime() <em>Execution Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutionTime()
   * @generated
   * @ordered
   */
  protected static final int EXECUTION_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getExecutionTime() <em>Execution Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutionTime()
   * @generated
   * @ordered
   */
  protected int executionTime = EXECUTION_TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallbackImpl()
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
    return MyDslPackage.Literals.CALLBACK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getBufferSize()
  {
    return bufferSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBufferSize(int newBufferSize)
  {
    int oldBufferSize = bufferSize;
    bufferSize = newBufferSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CALLBACK__BUFFER_SIZE, oldBufferSize, bufferSize));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CALLBACK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Executor> getExecutedIn()
  {
    if (executedIn == null)
    {
      executedIn = new EObjectResolvingEList<Executor>(Executor.class, this, MyDslPackage.CALLBACK__EXECUTED_IN);
    }
    return executedIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getExecutionTime()
  {
    return executionTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExecutionTime(int newExecutionTime)
  {
    int oldExecutionTime = executionTime;
    executionTime = newExecutionTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CALLBACK__EXECUTION_TIME, oldExecutionTime, executionTime));
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
      case MyDslPackage.CALLBACK__BUFFER_SIZE:
        return getBufferSize();
      case MyDslPackage.CALLBACK__NAME:
        return getName();
      case MyDslPackage.CALLBACK__EXECUTED_IN:
        return getExecutedIn();
      case MyDslPackage.CALLBACK__EXECUTION_TIME:
        return getExecutionTime();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.CALLBACK__BUFFER_SIZE:
        setBufferSize((Integer)newValue);
        return;
      case MyDslPackage.CALLBACK__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.CALLBACK__EXECUTED_IN:
        getExecutedIn().clear();
        getExecutedIn().addAll((Collection<? extends Executor>)newValue);
        return;
      case MyDslPackage.CALLBACK__EXECUTION_TIME:
        setExecutionTime((Integer)newValue);
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
      case MyDslPackage.CALLBACK__BUFFER_SIZE:
        setBufferSize(BUFFER_SIZE_EDEFAULT);
        return;
      case MyDslPackage.CALLBACK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.CALLBACK__EXECUTED_IN:
        getExecutedIn().clear();
        return;
      case MyDslPackage.CALLBACK__EXECUTION_TIME:
        setExecutionTime(EXECUTION_TIME_EDEFAULT);
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
      case MyDslPackage.CALLBACK__BUFFER_SIZE:
        return bufferSize != BUFFER_SIZE_EDEFAULT;
      case MyDslPackage.CALLBACK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.CALLBACK__EXECUTED_IN:
        return executedIn != null && !executedIn.isEmpty();
      case MyDslPackage.CALLBACK__EXECUTION_TIME:
        return executionTime != EXECUTION_TIME_EDEFAULT;
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
    result.append(" (bufferSize: ");
    result.append(bufferSize);
    result.append(", name: ");
    result.append(name);
    result.append(", executionTime: ");
    result.append(executionTime);
    result.append(')');
    return result.toString();
  }

} //CallbackImpl
