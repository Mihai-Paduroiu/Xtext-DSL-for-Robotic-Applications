/**
 * generated by Xtext 2.36.0-SNAPSHOT
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Walltimer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Walltimer#getReleaseTimes <em>Release Times</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWalltimer()
 * @model
 * @generated
 */
public interface Walltimer extends SystemTimer
{
  /**
   * Returns the value of the '<em><b>Release Times</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Release Times</em>' attribute.
   * @see #setReleaseTimes(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWalltimer_ReleaseTimes()
   * @model
   * @generated
   */
  int getReleaseTimes();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Walltimer#getReleaseTimes <em>Release Times</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Release Times</em>' attribute.
   * @see #getReleaseTimes()
   * @generated
   */
  void setReleaseTimes(int value);

} // Walltimer
