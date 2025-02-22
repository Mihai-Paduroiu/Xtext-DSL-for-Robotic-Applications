/**
 * generated by Xtext 2.36.0-SNAPSHOT
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Service#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Service#getServiceReq <em>Service Req</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Service#getClientCAll <em>Client CAll</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Service#getServiceCAll <em>Service CAll</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getService_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Service#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Service Req</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Req</em>' reference.
   * @see #setServiceReq(ServiceRequest)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getService_ServiceReq()
   * @model
   * @generated
   */
  ServiceRequest getServiceReq();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Service#getServiceReq <em>Service Req</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Req</em>' reference.
   * @see #getServiceReq()
   * @generated
   */
  void setServiceReq(ServiceRequest value);

  /**
   * Returns the value of the '<em><b>Client CAll</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Client CAll</em>' reference.
   * @see #setClientCAll(ClientCallback)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getService_ClientCAll()
   * @model
   * @generated
   */
  ClientCallback getClientCAll();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Service#getClientCAll <em>Client CAll</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Client CAll</em>' reference.
   * @see #getClientCAll()
   * @generated
   */
  void setClientCAll(ClientCallback value);

  /**
   * Returns the value of the '<em><b>Service CAll</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service CAll</em>' reference.
   * @see #setServiceCAll(ServiceCallback)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getService_ServiceCAll()
   * @model
   * @generated
   */
  ServiceCallback getServiceCAll();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Service#getServiceCAll <em>Service CAll</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service CAll</em>' reference.
   * @see #getServiceCAll()
   * @generated
   */
  void setServiceCAll(ServiceCallback value);

} // Service
