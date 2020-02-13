/**
 */
package UoL.GenDev.Assignment1.registrationSystem;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getBookingId <em>Booking Id</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getEndDateTime <em>End Date Time</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getForService <em>For Service</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#isIsDiscounted <em>Is Discounted</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getDiscount <em>Discount</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getCustomer <em>Customer</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getStatus <em>Status</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getAttendedBy <em>Attended By</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getServiceBooking()
 * @model
 * @generated
 */
public interface ServiceBooking extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Id</em>' attribute.
	 * @see #setBookingId(String)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getServiceBooking_BookingId()
	 * @model id="true"
	 * @generated
	 */
	String getBookingId();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getBookingId <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Id</em>' attribute.
	 * @see #getBookingId()
	 * @generated
	 */
	void setBookingId(String value);

	/**
	 * Returns the value of the '<em><b>Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date Time</em>' attribute.
	 * @see #setStartDateTime(Date)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getServiceBooking_StartDateTime()
	 * @model
	 * @generated
	 */
	Date getStartDateTime();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getStartDateTime <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date Time</em>' attribute.
	 * @see #getStartDateTime()
	 * @generated
	 */
	void setStartDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date Time</em>' attribute.
	 * @see #setEndDateTime(Date)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getServiceBooking_EndDateTime()
	 * @model
	 * @generated
	 */
	Date getEndDateTime();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getEndDateTime <em>End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date Time</em>' attribute.
	 * @see #getEndDateTime()
	 * @generated
	 */
	void setEndDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>For Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Service</em>' reference.
	 * @see #setForService(Service)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getServiceBooking_ForService()
	 * @model keys="serviceId"
	 * @generated
	 */
	Service getForService();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getForService <em>For Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Service</em>' reference.
	 * @see #getForService()
	 * @generated
	 */
	void setForService(Service value);

	/**
	 * Returns the value of the '<em><b>Is Discounted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Discounted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Discounted</em>' attribute.
	 * @see #setIsDiscounted(boolean)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getServiceBooking_IsDiscounted()
	 * @model
	 * @generated
	 */
	boolean isIsDiscounted();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#isIsDiscounted <em>Is Discounted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Discounted</em>' attribute.
	 * @see #isIsDiscounted()
	 * @generated
	 */
	void setIsDiscounted(boolean value);

	/**
	 * Returns the value of the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' attribute.
	 * @see #setDiscount(double)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getServiceBooking_Discount()
	 * @model
	 * @generated
	 */
	double getDiscount();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getDiscount <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' attribute.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(double value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UoL.GenDev.Assignment1.registrationSystem.Customer#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getServiceBooking_Customer()
	 * @see UoL.GenDev.Assignment1.registrationSystem.Customer#getBookings
	 * @model opposite="bookings" keys="customerId" required="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link UoL.GenDev.Assignment1.registrationSystem.ServiceStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceStatus
	 * @see #setStatus(ServiceStatus)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getServiceBooking_Status()
	 * @model
	 * @generated
	 */
	ServiceStatus getStatus();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ServiceStatus value);

	/**
	 * Returns the value of the '<em><b>Attended By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attended By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attended By</em>' reference.
	 * @see #setAttendedBy(Professional)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getServiceBooking_AttendedBy()
	 * @model keys="profId" required="true"
	 * @generated
	 */
	Professional getAttendedBy();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getAttendedBy <em>Attended By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attended By</em>' reference.
	 * @see #getAttendedBy()
	 * @generated
	 */
	void setAttendedBy(Professional value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getServiceBooking_Cost()
	 * @model
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	double getDurationInMinutes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	double getTotalCost();

} // ServiceBooking
