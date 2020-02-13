/**
 */
package UoL.GenDev.Assignment1.registrationSystem;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Person#getName <em>Name</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Person#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Person#getContactNumber <em>Contact Number</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Person#getLives <em>Lives</em>}</li>
 * </ul>
 *
 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Birth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Birth</em>' attribute.
	 * @see #setDateOfBirth(Date)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getPerson_DateOfBirth()
	 * @model
	 * @generated
	 */
	Date getDateOfBirth();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.Person#getDateOfBirth <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Birth</em>' attribute.
	 * @see #getDateOfBirth()
	 * @generated
	 */
	void setDateOfBirth(Date value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getPerson_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Contact Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Number</em>' attribute.
	 * @see #setContactNumber(String)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getPerson_ContactNumber()
	 * @model
	 * @generated
	 */
	String getContactNumber();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.Person#getContactNumber <em>Contact Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Number</em>' attribute.
	 * @see #getContactNumber()
	 * @generated
	 */
	void setContactNumber(String value);

	/**
	 * Returns the value of the '<em><b>Lives</b></em>' reference list.
	 * The list contents are of type {@link UoL.GenDev.Assignment1.registrationSystem.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lives</em>' reference list.
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getPerson_Lives()
	 * @model required="true"
	 * @generated
	 */
	EList<Address> getLives();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	double getAge();

} // Person
