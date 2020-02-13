/**
 */
package UoL.GenDev.Assignment1.registrationSystem.impl;

import UoL.GenDev.Assignment1.registrationSystem.Customer;
import UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage;
import UoL.GenDev.Assignment1.registrationSystem.ServiceBooking;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.CustomerImpl#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.CustomerImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.CustomerImpl#getDateOfRegistration <em>Date Of Registration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends PersonImpl implements Customer {
	/**
	 * The default value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected String customerId = CUSTOMER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBooking> bookings;

	/**
	 * The default value of the '{@link #getDateOfRegistration() <em>Date Of Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_REGISTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfRegistration() <em>Date Of Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfRegistration()
	 * @generated
	 * @ordered
	 */
	protected Date dateOfRegistration = DATE_OF_REGISTRATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegistrationSystemPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerId(String newCustomerId) {
		String oldCustomerId = customerId;
		customerId = newCustomerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.CUSTOMER__CUSTOMER_ID, oldCustomerId, customerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceBooking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectWithInverseResolvingEList<ServiceBooking>(ServiceBooking.class, this, RegistrationSystemPackage.CUSTOMER__BOOKINGS, RegistrationSystemPackage.SERVICE_BOOKING__CUSTOMER);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfRegistration(Date newDateOfRegistration) {
		Date oldDateOfRegistration = dateOfRegistration;
		dateOfRegistration = newDateOfRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.CUSTOMER__DATE_OF_REGISTRATION, oldDateOfRegistration, dateOfRegistration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRegistered() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistrationSystemPackage.CUSTOMER__BOOKINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBookings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistrationSystemPackage.CUSTOMER__BOOKINGS:
				return ((InternalEList<?>)getBookings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RegistrationSystemPackage.CUSTOMER__CUSTOMER_ID:
				return getCustomerId();
			case RegistrationSystemPackage.CUSTOMER__BOOKINGS:
				return getBookings();
			case RegistrationSystemPackage.CUSTOMER__DATE_OF_REGISTRATION:
				return getDateOfRegistration();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RegistrationSystemPackage.CUSTOMER__CUSTOMER_ID:
				setCustomerId((String)newValue);
				return;
			case RegistrationSystemPackage.CUSTOMER__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends ServiceBooking>)newValue);
				return;
			case RegistrationSystemPackage.CUSTOMER__DATE_OF_REGISTRATION:
				setDateOfRegistration((Date)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case RegistrationSystemPackage.CUSTOMER__CUSTOMER_ID:
				setCustomerId(CUSTOMER_ID_EDEFAULT);
				return;
			case RegistrationSystemPackage.CUSTOMER__BOOKINGS:
				getBookings().clear();
				return;
			case RegistrationSystemPackage.CUSTOMER__DATE_OF_REGISTRATION:
				setDateOfRegistration(DATE_OF_REGISTRATION_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RegistrationSystemPackage.CUSTOMER__CUSTOMER_ID:
				return CUSTOMER_ID_EDEFAULT == null ? customerId != null : !CUSTOMER_ID_EDEFAULT.equals(customerId);
			case RegistrationSystemPackage.CUSTOMER__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
			case RegistrationSystemPackage.CUSTOMER__DATE_OF_REGISTRATION:
				return DATE_OF_REGISTRATION_EDEFAULT == null ? dateOfRegistration != null : !DATE_OF_REGISTRATION_EDEFAULT.equals(dateOfRegistration);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RegistrationSystemPackage.CUSTOMER___IS_REGISTERED:
				return isRegistered();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (customerId: ");
		result.append(customerId);
		result.append(", dateOfRegistration: ");
		result.append(dateOfRegistration);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
