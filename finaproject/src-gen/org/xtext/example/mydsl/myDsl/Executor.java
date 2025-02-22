/**
 * generated by Xtext 2.36.0-SNAPSHOT
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Executor#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Executor#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Executor#getExecuted <em>Executed</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExecutor()
 * @model
 * @generated
 */
public interface Executor extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExecutor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Executor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.ExecutorType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.ExecutorType
   * @see #setType(ExecutorType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExecutor_Type()
   * @model
   * @generated
   */
  ExecutorType getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Executor#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.ExecutorType
   * @see #getType()
   * @generated
   */
  void setType(ExecutorType value);

  /**
   * Returns the value of the '<em><b>Executed</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Callback}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Executed</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExecutor_Executed()
   * @model
   * @generated
   */
  EList<Callback> getExecuted();

} // Executor
