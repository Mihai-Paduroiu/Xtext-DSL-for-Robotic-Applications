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

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Publisher;
import org.xtext.example.mydsl.myDsl.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PublisherImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PublisherImpl#getPublishes <em>Publishes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PublisherImpl#getBufferSize <em>Buffer Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublisherImpl extends MinimalEObjectImpl.Container implements Publisher
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
   * The cached value of the '{@link #getPublishes() <em>Publishes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublishes()
   * @generated
   * @ordered
   */
  protected EList<Topic> publishes;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PublisherImpl()
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
    return MyDslPackage.Literals.PUBLISHER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PUBLISHER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Topic> getPublishes()
  {
    if (publishes == null)
    {
      publishes = new EObjectResolvingEList<Topic>(Topic.class, this, MyDslPackage.PUBLISHER__PUBLISHES);
    }
    return publishes;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PUBLISHER__BUFFER_SIZE, oldBufferSize, bufferSize));
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
      case MyDslPackage.PUBLISHER__NAME:
        return getName();
      case MyDslPackage.PUBLISHER__PUBLISHES:
        return getPublishes();
      case MyDslPackage.PUBLISHER__BUFFER_SIZE:
        return getBufferSize();
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
      case MyDslPackage.PUBLISHER__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.PUBLISHER__PUBLISHES:
        getPublishes().clear();
        getPublishes().addAll((Collection<? extends Topic>)newValue);
        return;
      case MyDslPackage.PUBLISHER__BUFFER_SIZE:
        setBufferSize((Integer)newValue);
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
      case MyDslPackage.PUBLISHER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.PUBLISHER__PUBLISHES:
        getPublishes().clear();
        return;
      case MyDslPackage.PUBLISHER__BUFFER_SIZE:
        setBufferSize(BUFFER_SIZE_EDEFAULT);
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
      case MyDslPackage.PUBLISHER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.PUBLISHER__PUBLISHES:
        return publishes != null && !publishes.isEmpty();
      case MyDslPackage.PUBLISHER__BUFFER_SIZE:
        return bufferSize != BUFFER_SIZE_EDEFAULT;
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
    result.append(", bufferSize: ");
    result.append(bufferSize);
    result.append(')');
    return result.toString();
  }

} //PublisherImpl
