/**
 */
package UoL.GenDev.Assignment1.registrationSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemFactory
 * @model kind="package"
 * @generated
 */
public interface RegistrationSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "registrationSystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/registrationSystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "registrationSystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegistrationSystemPackage eINSTANCE = UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.PersonImpl
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DATE_OF_BIRTH = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Contact Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONTACT_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Lives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LIVES = 4;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_AGE = 0;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.ProfessionalImpl <em>Professional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.ProfessionalImpl
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getProfessional()
	 * @generated
	 */
	int PROFESSIONAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL__DATE_OF_BIRTH = PERSON__DATE_OF_BIRTH;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL__EMAIL = PERSON__EMAIL;

	/**
	 * The feature id for the '<em><b>Contact Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL__CONTACT_NUMBER = PERSON__CONTACT_NUMBER;

	/**
	 * The feature id for the '<em><b>Lives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL__LIVES = PERSON__LIVES;

	/**
	 * The feature id for the '<em><b>Prof Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL__PROF_ID = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL__PROVIDES = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Of Joining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL__DATE_OF_JOINING = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL__QUALIFICATION = PERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL__DESIGNATION = PERSON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Professional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_FEATURE_COUNT = PERSON_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL___GET_AGE = PERSON___GET_AGE;

	/**
	 * The number of operations of the '<em>Professional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.CustomerImpl
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__DATE_OF_BIRTH = PERSON__DATE_OF_BIRTH;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = PERSON__EMAIL;

	/**
	 * The feature id for the '<em><b>Contact Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CONTACT_NUMBER = PERSON__CONTACT_NUMBER;

	/**
	 * The feature id for the '<em><b>Lives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LIVES = PERSON__LIVES;

	/**
	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMER_ID = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BOOKINGS = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Of Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__DATE_OF_REGISTRATION = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_AGE = PERSON___GET_AGE;

	/**
	 * The operation id for the '<em>Is Registered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___IS_REGISTERED = PERSON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.ServiceImpl
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Fees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__FEES = 2;

	/**
	 * The feature id for the '<em><b>Requires Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REQUIRES_PRODUCTS = 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl <em>Service Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getServiceBooking()
	 * @generated
	 */
	int SERVICE_BOOKING = 4;

	/**
	 * The feature id for the '<em><b>Booking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING__BOOKING_ID = 0;

	/**
	 * The feature id for the '<em><b>Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING__START_DATE_TIME = 1;

	/**
	 * The feature id for the '<em><b>End Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING__END_DATE_TIME = 2;

	/**
	 * The feature id for the '<em><b>For Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING__FOR_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Is Discounted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING__IS_DISCOUNTED = 4;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING__DISCOUNT = 5;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING__CUSTOMER = 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING__STATUS = 7;

	/**
	 * The feature id for the '<em><b>Attended By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING__ATTENDED_BY = 8;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING__COST = 9;

	/**
	 * The number of structural features of the '<em>Service Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Get Duration In Minutes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING___GET_DURATION_IN_MINUTES = 0;

	/**
	 * The operation id for the '<em>Get Total Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING___GET_TOTAL_COST = 1;

	/**
	 * The number of operations of the '<em>Service Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.ProductImpl
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__COST = 1;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_ID = 2;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker <em>IService Booking Tracker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getIServiceBookingTracker()
	 * @generated
	 */
	int ISERVICE_BOOKING_TRACKER = 6;

	/**
	 * The number of structural features of the '<em>IService Booking Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_BOOKING_TRACKER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Service Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_BOOKING_TRACKER___GET_SERVICE_BOOKINGS__STRING = 0;

	/**
	 * The operation id for the '<em>Get Service Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_BOOKING_TRACKER___GET_SERVICE_BOOKINGS__DATE = 1;

	/**
	 * The operation id for the '<em>Get Service Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_BOOKING_TRACKER___GET_SERVICE_BOOKINGS__SERVICESTATUS = 2;

	/**
	 * The operation id for the '<em>Get Service Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_BOOKING_TRACKER___GET_SERVICE_BOOKINGS = 3;

	/**
	 * The number of operations of the '<em>IService Booking Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_BOOKING_TRACKER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.AddressImpl
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 7;

	/**
	 * The feature id for the '<em><b>House Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__HOUSE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Building Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__BUILDING_NAME = 1;

	/**
	 * The feature id for the '<em><b>Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET_NAME = 2;

	/**
	 * The feature id for the '<em><b>Post Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__POST_CODE = 3;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 4;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 5;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS___GET_ADDRESS = 0;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceStatus <em>Service Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceStatus
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getServiceStatus()
	 * @generated
	 */
	int SERVICE_STATUS = 8;

	/**
	 * The meta object id for the '<em>Service Booking List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getServiceBookingList()
	 * @generated
	 */
	int SERVICE_BOOKING_LIST = 9;


	/**
	 * Returns the meta object for class '{@link UoL.GenDev.Assignment1.registrationSystem.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Person#getDateOfBirth <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Birth</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Person#getDateOfBirth()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DateOfBirth();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Person#getContactNumber <em>Contact Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Number</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Person#getContactNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ContactNumber();

	/**
	 * Returns the meta object for the reference list '{@link UoL.GenDev.Assignment1.registrationSystem.Person#getLives <em>Lives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lives</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Person#getLives()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Lives();

	/**
	 * Returns the meta object for the '{@link UoL.GenDev.Assignment1.registrationSystem.Person#getAge() <em>Get Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Age</em>' operation.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Person#getAge()
	 * @generated
	 */
	EOperation getPerson__GetAge();

	/**
	 * Returns the meta object for class '{@link UoL.GenDev.Assignment1.registrationSystem.Professional <em>Professional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professional</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Professional
	 * @generated
	 */
	EClass getProfessional();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getProfId <em>Prof Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prof Id</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Professional#getProfId()
	 * @see #getProfessional()
	 * @generated
	 */
	EAttribute getProfessional_ProfId();

	/**
	 * Returns the meta object for the reference list '{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Professional#getProvides()
	 * @see #getProfessional()
	 * @generated
	 */
	EReference getProfessional_Provides();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getDateOfJoining <em>Date Of Joining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Joining</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Professional#getDateOfJoining()
	 * @see #getProfessional()
	 * @generated
	 */
	EAttribute getProfessional_DateOfJoining();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getQualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualification</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Professional#getQualification()
	 * @see #getProfessional()
	 * @generated
	 */
	EAttribute getProfessional_Qualification();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getDesignation <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Designation</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Professional#getDesignation()
	 * @see #getProfessional()
	 * @generated
	 */
	EAttribute getProfessional_Designation();

	/**
	 * Returns the meta object for class '{@link UoL.GenDev.Assignment1.registrationSystem.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Customer#getCustomerId <em>Customer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Id</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Customer#getCustomerId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CustomerId();

	/**
	 * Returns the meta object for the reference list '{@link UoL.GenDev.Assignment1.registrationSystem.Customer#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bookings</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Customer#getBookings()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Bookings();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Customer#getDateOfRegistration <em>Date Of Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Registration</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Customer#getDateOfRegistration()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_DateOfRegistration();

	/**
	 * Returns the meta object for the '{@link UoL.GenDev.Assignment1.registrationSystem.Customer#isRegistered() <em>Is Registered</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Registered</em>' operation.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Customer#isRegistered()
	 * @generated
	 */
	EOperation getCustomer__IsRegistered();

	/**
	 * Returns the meta object for class '{@link UoL.GenDev.Assignment1.registrationSystem.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Service#getServiceId <em>Service Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Id</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Service#getServiceId()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ServiceId();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Service#getFees <em>Fees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fees</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Service#getFees()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Fees();

	/**
	 * Returns the meta object for the reference list '{@link UoL.GenDev.Assignment1.registrationSystem.Service#getRequiresProducts <em>Requires Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires Products</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Service#getRequiresProducts()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_RequiresProducts();

	/**
	 * Returns the meta object for class '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking <em>Service Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Booking</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking
	 * @generated
	 */
	EClass getServiceBooking();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getBookingId <em>Booking Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Id</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getBookingId()
	 * @see #getServiceBooking()
	 * @generated
	 */
	EAttribute getServiceBooking_BookingId();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getStartDateTime <em>Start Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date Time</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getStartDateTime()
	 * @see #getServiceBooking()
	 * @generated
	 */
	EAttribute getServiceBooking_StartDateTime();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getEndDateTime <em>End Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date Time</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getEndDateTime()
	 * @see #getServiceBooking()
	 * @generated
	 */
	EAttribute getServiceBooking_EndDateTime();

	/**
	 * Returns the meta object for the reference '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getForService <em>For Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Service</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getForService()
	 * @see #getServiceBooking()
	 * @generated
	 */
	EReference getServiceBooking_ForService();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#isIsDiscounted <em>Is Discounted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Discounted</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#isIsDiscounted()
	 * @see #getServiceBooking()
	 * @generated
	 */
	EAttribute getServiceBooking_IsDiscounted();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getDiscount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getDiscount()
	 * @see #getServiceBooking()
	 * @generated
	 */
	EAttribute getServiceBooking_Discount();

	/**
	 * Returns the meta object for the reference '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getCustomer()
	 * @see #getServiceBooking()
	 * @generated
	 */
	EReference getServiceBooking_Customer();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getStatus()
	 * @see #getServiceBooking()
	 * @generated
	 */
	EAttribute getServiceBooking_Status();

	/**
	 * Returns the meta object for the reference '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getAttendedBy <em>Attended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attended By</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getAttendedBy()
	 * @see #getServiceBooking()
	 * @generated
	 */
	EReference getServiceBooking_AttendedBy();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getCost()
	 * @see #getServiceBooking()
	 * @generated
	 */
	EAttribute getServiceBooking_Cost();

	/**
	 * Returns the meta object for the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getDurationInMinutes() <em>Get Duration In Minutes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Duration In Minutes</em>' operation.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getDurationInMinutes()
	 * @generated
	 */
	EOperation getServiceBooking__GetDurationInMinutes();

	/**
	 * Returns the meta object for the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getTotalCost() <em>Get Total Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Total Cost</em>' operation.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceBooking#getTotalCost()
	 * @generated
	 */
	EOperation getServiceBooking__GetTotalCost();

	/**
	 * Returns the meta object for class '{@link UoL.GenDev.Assignment1.registrationSystem.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Product#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Product#getCost()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Cost();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Product#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Id</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Product#getProductId()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductId();

	/**
	 * Returns the meta object for class '{@link UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker <em>IService Booking Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IService Booking Tracker</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker
	 * @generated
	 */
	EClass getIServiceBookingTracker();

	/**
	 * Returns the meta object for the '{@link UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker#getServiceBookings(java.lang.String) <em>Get Service Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Service Bookings</em>' operation.
	 * @see UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker#getServiceBookings(java.lang.String)
	 * @generated
	 */
	EOperation getIServiceBookingTracker__GetServiceBookings__String();

	/**
	 * Returns the meta object for the '{@link UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker#getServiceBookings(java.util.Date) <em>Get Service Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Service Bookings</em>' operation.
	 * @see UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker#getServiceBookings(java.util.Date)
	 * @generated
	 */
	EOperation getIServiceBookingTracker__GetServiceBookings__Date();

	/**
	 * Returns the meta object for the '{@link UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker#getServiceBookings(UoL.GenDev.Assignment1.registrationSystem.ServiceStatus) <em>Get Service Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Service Bookings</em>' operation.
	 * @see UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker#getServiceBookings(UoL.GenDev.Assignment1.registrationSystem.ServiceStatus)
	 * @generated
	 */
	EOperation getIServiceBookingTracker__GetServiceBookings__ServiceStatus();

	/**
	 * Returns the meta object for the '{@link UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker#getServiceBookings() <em>Get Service Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Service Bookings</em>' operation.
	 * @see UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker#getServiceBookings()
	 * @generated
	 */
	EOperation getIServiceBookingTracker__GetServiceBookings();

	/**
	 * Returns the meta object for class '{@link UoL.GenDev.Assignment1.registrationSystem.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Address#getHouseNumber <em>House Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>House Number</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Address#getHouseNumber()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_HouseNumber();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Address#getBuildingName <em>Building Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Name</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Address#getBuildingName()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_BuildingName();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Address#getStreetName <em>Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Name</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Address#getStreetName()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_StreetName();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Address#getPostCode <em>Post Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Code</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Address#getPostCode()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_PostCode();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link UoL.GenDev.Assignment1.registrationSystem.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for the '{@link UoL.GenDev.Assignment1.registrationSystem.Address#getAddress() <em>Get Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Address</em>' operation.
	 * @see UoL.GenDev.Assignment1.registrationSystem.Address#getAddress()
	 * @generated
	 */
	EOperation getAddress__GetAddress();

	/**
	 * Returns the meta object for enum '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceStatus <em>Service Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Status</em>'.
	 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceStatus
	 * @generated
	 */
	EEnum getServiceStatus();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Service Booking List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Booking List</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getServiceBookingList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RegistrationSystemFactory getRegistrationSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.PersonImpl
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Date Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DATE_OF_BIRTH = eINSTANCE.getPerson_DateOfBirth();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Contact Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CONTACT_NUMBER = eINSTANCE.getPerson_ContactNumber();

		/**
		 * The meta object literal for the '<em><b>Lives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__LIVES = eINSTANCE.getPerson_Lives();

		/**
		 * The meta object literal for the '<em><b>Get Age</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___GET_AGE = eINSTANCE.getPerson__GetAge();

		/**
		 * The meta object literal for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.ProfessionalImpl <em>Professional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.ProfessionalImpl
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getProfessional()
		 * @generated
		 */
		EClass PROFESSIONAL = eINSTANCE.getProfessional();

		/**
		 * The meta object literal for the '<em><b>Prof Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSIONAL__PROF_ID = eINSTANCE.getProfessional_ProfId();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSIONAL__PROVIDES = eINSTANCE.getProfessional_Provides();

		/**
		 * The meta object literal for the '<em><b>Date Of Joining</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSIONAL__DATE_OF_JOINING = eINSTANCE.getProfessional_DateOfJoining();

		/**
		 * The meta object literal for the '<em><b>Qualification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSIONAL__QUALIFICATION = eINSTANCE.getProfessional_Qualification();

		/**
		 * The meta object literal for the '<em><b>Designation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSIONAL__DESIGNATION = eINSTANCE.getProfessional_Designation();

		/**
		 * The meta object literal for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.CustomerImpl
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Customer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CUSTOMER_ID = eINSTANCE.getCustomer_CustomerId();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__BOOKINGS = eINSTANCE.getCustomer_Bookings();

		/**
		 * The meta object literal for the '<em><b>Date Of Registration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__DATE_OF_REGISTRATION = eINSTANCE.getCustomer_DateOfRegistration();

		/**
		 * The meta object literal for the '<em><b>Is Registered</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___IS_REGISTERED = eINSTANCE.getCustomer__IsRegistered();

		/**
		 * The meta object literal for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.ServiceImpl
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Service Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SERVICE_ID = eINSTANCE.getService_ServiceId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Fees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__FEES = eINSTANCE.getService_Fees();

		/**
		 * The meta object literal for the '<em><b>Requires Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__REQUIRES_PRODUCTS = eINSTANCE.getService_RequiresProducts();

		/**
		 * The meta object literal for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl <em>Service Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getServiceBooking()
		 * @generated
		 */
		EClass SERVICE_BOOKING = eINSTANCE.getServiceBooking();

		/**
		 * The meta object literal for the '<em><b>Booking Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BOOKING__BOOKING_ID = eINSTANCE.getServiceBooking_BookingId();

		/**
		 * The meta object literal for the '<em><b>Start Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BOOKING__START_DATE_TIME = eINSTANCE.getServiceBooking_StartDateTime();

		/**
		 * The meta object literal for the '<em><b>End Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BOOKING__END_DATE_TIME = eINSTANCE.getServiceBooking_EndDateTime();

		/**
		 * The meta object literal for the '<em><b>For Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BOOKING__FOR_SERVICE = eINSTANCE.getServiceBooking_ForService();

		/**
		 * The meta object literal for the '<em><b>Is Discounted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BOOKING__IS_DISCOUNTED = eINSTANCE.getServiceBooking_IsDiscounted();

		/**
		 * The meta object literal for the '<em><b>Discount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BOOKING__DISCOUNT = eINSTANCE.getServiceBooking_Discount();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BOOKING__CUSTOMER = eINSTANCE.getServiceBooking_Customer();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BOOKING__STATUS = eINSTANCE.getServiceBooking_Status();

		/**
		 * The meta object literal for the '<em><b>Attended By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BOOKING__ATTENDED_BY = eINSTANCE.getServiceBooking_AttendedBy();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BOOKING__COST = eINSTANCE.getServiceBooking_Cost();

		/**
		 * The meta object literal for the '<em><b>Get Duration In Minutes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_BOOKING___GET_DURATION_IN_MINUTES = eINSTANCE.getServiceBooking__GetDurationInMinutes();

		/**
		 * The meta object literal for the '<em><b>Get Total Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_BOOKING___GET_TOTAL_COST = eINSTANCE.getServiceBooking__GetTotalCost();

		/**
		 * The meta object literal for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.ProductImpl
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__COST = eINSTANCE.getProduct_Cost();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_ID = eINSTANCE.getProduct_ProductId();

		/**
		 * The meta object literal for the '{@link UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker <em>IService Booking Tracker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UoL.GenDev.Assignment1.registrationSystem.IServiceBookingTracker
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getIServiceBookingTracker()
		 * @generated
		 */
		EClass ISERVICE_BOOKING_TRACKER = eINSTANCE.getIServiceBookingTracker();

		/**
		 * The meta object literal for the '<em><b>Get Service Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_BOOKING_TRACKER___GET_SERVICE_BOOKINGS__STRING = eINSTANCE.getIServiceBookingTracker__GetServiceBookings__String();

		/**
		 * The meta object literal for the '<em><b>Get Service Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_BOOKING_TRACKER___GET_SERVICE_BOOKINGS__DATE = eINSTANCE.getIServiceBookingTracker__GetServiceBookings__Date();

		/**
		 * The meta object literal for the '<em><b>Get Service Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_BOOKING_TRACKER___GET_SERVICE_BOOKINGS__SERVICESTATUS = eINSTANCE.getIServiceBookingTracker__GetServiceBookings__ServiceStatus();

		/**
		 * The meta object literal for the '<em><b>Get Service Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_BOOKING_TRACKER___GET_SERVICE_BOOKINGS = eINSTANCE.getIServiceBookingTracker__GetServiceBookings();

		/**
		 * The meta object literal for the '{@link UoL.GenDev.Assignment1.registrationSystem.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.AddressImpl
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>House Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__HOUSE_NUMBER = eINSTANCE.getAddress_HouseNumber();

		/**
		 * The meta object literal for the '<em><b>Building Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__BUILDING_NAME = eINSTANCE.getAddress_BuildingName();

		/**
		 * The meta object literal for the '<em><b>Street Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET_NAME = eINSTANCE.getAddress_StreetName();

		/**
		 * The meta object literal for the '<em><b>Post Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__POST_CODE = eINSTANCE.getAddress_PostCode();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Get Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDRESS___GET_ADDRESS = eINSTANCE.getAddress__GetAddress();

		/**
		 * The meta object literal for the '{@link UoL.GenDev.Assignment1.registrationSystem.ServiceStatus <em>Service Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UoL.GenDev.Assignment1.registrationSystem.ServiceStatus
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getServiceStatus()
		 * @generated
		 */
		EEnum SERVICE_STATUS = eINSTANCE.getServiceStatus();

		/**
		 * The meta object literal for the '<em>Service Booking List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see UoL.GenDev.Assignment1.registrationSystem.impl.RegistrationSystemPackageImpl#getServiceBookingList()
		 * @generated
		 */
		EDataType SERVICE_BOOKING_LIST = eINSTANCE.getServiceBookingList();

	}

} //RegistrationSystemPackage
