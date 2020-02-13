/**
 */
package UoL.GenDev.Assignment1.registrationSystem;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Customer#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Customer#getBookings <em>Bookings</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Customer#getDateOfRegistration <em>Date Of Registration</em>}</li>
 * </ul>
 *
 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends Person {
	/**
	 * Returns the value of the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Id</em>' attribute.
	 * @see #setCustomerId(String)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getCustomer_CustomerId()
	 * @model id="true"
	 * @generated
	 */
	String getCustomerId();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.Customer#getCustomerId <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Id</em>' attribute.
	 * @see #getCustomerId()
	 * @generated
	 */
	void setCustomerId(String value);

	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' reference list.
	 * The list contents are of type {@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking}.
	 * It is bidirectional and its opposite is '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' reference list.
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getCustomer_Bookings()
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getCustomer
	 * @model opposite="Customer" keys="bookingId"
	 * @generated
	 */
	EList<ServiceBooking> getBookings();

	/**
	 * Returns the value of the '<em><b>Date Of Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Registration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Registration</em>' attribute.
	 * @see #setDateOfRegistration(Date)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getCustomer_DateOfRegistration()
	 * @model
	 * @generated
	 */
	Date getDateOfRegistration();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.Customer#getDateOfRegistration <em>Date Of Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Registration</em>' attribute.
	 * @see #getDateOfRegistration()
	 * @generated
	 */
	void setDateOfRegistration(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRegistered();

} // Customer
