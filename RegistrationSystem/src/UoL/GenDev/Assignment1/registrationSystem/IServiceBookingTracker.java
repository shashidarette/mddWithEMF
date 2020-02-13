/**
 */
package UoL.GenDev.Assignment1.registrationSystem;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IService Booking Tracker</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getIServiceBookingTracker()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IServiceBookingTracker extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="UoL.GenDev.Assignment1.registrationSystem.ServiceBookingList"
	 * @generated
	 */
	Object getServiceBookings(String customerId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="UoL.GenDev.Assignment1.registrationSystem.ServiceBookingList"
	 * @generated
	 */
	Object getServiceBookings(Date dueInDuration);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="UoL.GenDev.Assignment1.registrationSystem.ServiceBookingList"
	 * @generated
	 */
	Object getServiceBookings(ServiceStatus status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getServiceBookings();

} // IServiceBookingTracker
