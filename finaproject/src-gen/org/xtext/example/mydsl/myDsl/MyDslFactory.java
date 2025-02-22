/**
 * generated by Xtext 2.36.0-SNAPSHOT
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>System Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Model</em>'.
   * @generated
   */
  SystemModel createSystemModel();

  /**
   * Returns a new object of class '<em>System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System</em>'.
   * @generated
   */
  System createSystem();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>Callback</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Callback</em>'.
   * @generated
   */
  Callback createCallback();

  /**
   * Returns a new object of class '<em>Executor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Executor</em>'.
   * @generated
   */
  Executor createExecutor();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Service Request</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Request</em>'.
   * @generated
   */
  ServiceRequest createServiceRequest();

  /**
   * Returns a new object of class '<em>Topic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Topic</em>'.
   * @generated
   */
  Topic createTopic();

  /**
   * Returns a new object of class '<em>Publisher</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Publisher</em>'.
   * @generated
   */
  Publisher createPublisher();

  /**
   * Returns a new object of class '<em>Subscriber Callback</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subscriber Callback</em>'.
   * @generated
   */
  SubscriberCallback createSubscriberCallback();

  /**
   * Returns a new object of class '<em>Service Callback</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Callback</em>'.
   * @generated
   */
  ServiceCallback createServiceCallback();

  /**
   * Returns a new object of class '<em>Client Callback</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Client Callback</em>'.
   * @generated
   */
  ClientCallback createClientCallback();

  /**
   * Returns a new object of class '<em>Timer Callback</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timer Callback</em>'.
   * @generated
   */
  TimerCallback createTimerCallback();

  /**
   * Returns a new object of class '<em>System Timer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Timer</em>'.
   * @generated
   */
  SystemTimer createSystemTimer();

  /**
   * Returns a new object of class '<em>Periodic Timer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Periodic Timer</em>'.
   * @generated
   */
  PeriodicTimer createPeriodicTimer();

  /**
   * Returns a new object of class '<em>Walltimer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Walltimer</em>'.
   * @generated
   */
  Walltimer createWalltimer();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
