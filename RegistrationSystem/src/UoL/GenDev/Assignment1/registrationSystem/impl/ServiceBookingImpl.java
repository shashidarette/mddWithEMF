/**
 */
package UoL.GenDev.Assignment1.registrationSystem.impl;

import UoL.GenDev.Assignment1.registrationSystem.Customer;
import UoL.GenDev.Assignment1.registrationSystem.Professional;
import UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage;
import UoL.GenDev.Assignment1.registrationSystem.Service;
import UoL.GenDev.Assignment1.registrationSystem.ServiceBooking;
import UoL.GenDev.Assignment1.registrationSystem.ServiceStatus;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl#getBookingId <em>Booking Id</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl#getEndDateTime <em>End Date Time</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl#getForService <em>For Service</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl#isIsDiscounted <em>Is Discounted</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl#getDiscount <em>Discount</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl#getAttendedBy <em>Attended By</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceBookingImpl#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceBookingImpl extends MinimalEObjectImpl.Container implements ServiceBooking {
	/**
	 * The default value of the '{@link #getBookingId() <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingId() <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected String bookingId = BOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDateTime() <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDateTime() <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date startDateTime = START_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDateTime() <em>End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDateTime() <em>End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date endDateTime = END_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForService() <em>For Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForService()
	 * @generated
	 * @ordered
	 */
	protected Service forService;

	/**
	 * The default value of the '{@link #isIsDiscounted() <em>Is Discounted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDiscounted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISCOUNTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDiscounted() <em>Is Discounted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDiscounted()
	 * @generated
	 * @ordered
	 */
	protected boolean isDiscounted = IS_DISCOUNTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final double DISCOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected double discount = DISCOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceStatus STATUS_EDEFAULT = ServiceStatus.DUE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ServiceStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttendedBy() <em>Attended By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttendedBy()
	 * @generated
	 * @ordered
	 */
	protected Professional attendedBy;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegistrationSystemPackage.Literals.SERVICE_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookingId() {
		return bookingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingId(String newBookingId) {
		String oldBookingId = bookingId;
		bookingId = newBookingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE_BOOKING__BOOKING_ID, oldBookingId, bookingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDateTime() {
		return startDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDateTime(Date newStartDateTime) {
		Date oldStartDateTime = startDateTime;
		startDateTime = newStartDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE_BOOKING__START_DATE_TIME, oldStartDateTime, startDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDateTime() {
		return endDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDateTime(Date newEndDateTime) {
		Date oldEndDateTime = endDateTime;
		endDateTime = newEndDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE_BOOKING__END_DATE_TIME, oldEndDateTime, endDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getForService() {
		if (forService != null && forService.eIsProxy()) {
			InternalEObject oldForService = (InternalEObject)forService;
			forService = (Service)eResolveProxy(oldForService);
			if (forService != oldForService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RegistrationSystemPackage.SERVICE_BOOKING__FOR_SERVICE, oldForService, forService));
			}
		}
		return forService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetForService() {
		return forService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForService(Service newForService) {
		Service oldForService = forService;
		forService = newForService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE_BOOKING__FOR_SERVICE, oldForService, forService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDiscounted() {
		return isDiscounted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDiscounted(boolean newIsDiscounted) {
		boolean oldIsDiscounted = isDiscounted;
		isDiscounted = newIsDiscounted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE_BOOKING__IS_DISCOUNTED, oldIsDiscounted, isDiscounted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscount(double newDiscount) {
		double oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE_BOOKING__DISCOUNT, oldDiscount, discount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RegistrationSystemPackage.SERVICE_BOOKING__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE_BOOKING__CUSTOMER, oldCustomer, newCustomer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject)customer).eInverseRemove(this, RegistrationSystemPackage.CUSTOMER__BOOKINGS, Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, RegistrationSystemPackage.CUSTOMER__BOOKINGS, Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE_BOOKING__CUSTOMER, newCustomer, newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ServiceStatus newStatus) {
		ServiceStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE_BOOKING__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professional getAttendedBy() {
		if (attendedBy != null && attendedBy.eIsProxy()) {
			InternalEObject oldAttendedBy = (InternalEObject)attendedBy;
			attendedBy = (Professional)eResolveProxy(oldAttendedBy);
			if (attendedBy != oldAttendedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RegistrationSystemPackage.SERVICE_BOOKING__ATTENDED_BY, oldAttendedBy, attendedBy));
			}
		}
		return attendedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professional basicGetAttendedBy() {
		return attendedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttendedBy(Professional newAttendedBy) {
		Professional oldAttendedBy = attendedBy;
		attendedBy = newAttendedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE_BOOKING__ATTENDED_BY, oldAttendedBy, attendedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost) {
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE_BOOKING__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDurationInMinutes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalCost() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegistrationSystemPackage.SERVICE_BOOKING__CUSTOMER:
				if (customer != null)
					msgs = ((InternalEObject)customer).eInverseRemove(this, RegistrationSystemPackage.CUSTOMER__BOOKINGS, Customer.class, msgs);
				return basicSetCustomer((Customer)otherEnd, msgs);
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
			case RegistrationSystemPackage.SERVICE_BOOKING__CUSTOMER:
				return basicSetCustomer(null, msgs);
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
			case RegistrationSystemPackage.SERVICE_BOOKING__BOOKING_ID:
				return getBookingId();
			case RegistrationSystemPackage.SERVICE_BOOKING__START_DATE_TIME:
				return getStartDateTime();
			case RegistrationSystemPackage.SERVICE_BOOKING__END_DATE_TIME:
				return getEndDateTime();
			case RegistrationSystemPackage.SERVICE_BOOKING__FOR_SERVICE:
				if (resolve) return getForService();
				return basicGetForService();
			case RegistrationSystemPackage.SERVICE_BOOKING__IS_DISCOUNTED:
				return isIsDiscounted();
			case RegistrationSystemPackage.SERVICE_BOOKING__DISCOUNT:
				return getDiscount();
			case RegistrationSystemPackage.SERVICE_BOOKING__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case RegistrationSystemPackage.SERVICE_BOOKING__STATUS:
				return getStatus();
			case RegistrationSystemPackage.SERVICE_BOOKING__ATTENDED_BY:
				if (resolve) return getAttendedBy();
				return basicGetAttendedBy();
			case RegistrationSystemPackage.SERVICE_BOOKING__COST:
				return getCost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RegistrationSystemPackage.SERVICE_BOOKING__BOOKING_ID:
				setBookingId((String)newValue);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__START_DATE_TIME:
				setStartDateTime((Date)newValue);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__END_DATE_TIME:
				setEndDateTime((Date)newValue);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__FOR_SERVICE:
				setForService((Service)newValue);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__IS_DISCOUNTED:
				setIsDiscounted((Boolean)newValue);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__DISCOUNT:
				setDiscount((Double)newValue);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__STATUS:
				setStatus((ServiceStatus)newValue);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__ATTENDED_BY:
				setAttendedBy((Professional)newValue);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__COST:
				setCost((Double)newValue);
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
			case RegistrationSystemPackage.SERVICE_BOOKING__BOOKING_ID:
				setBookingId(BOOKING_ID_EDEFAULT);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__START_DATE_TIME:
				setStartDateTime(START_DATE_TIME_EDEFAULT);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__END_DATE_TIME:
				setEndDateTime(END_DATE_TIME_EDEFAULT);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__FOR_SERVICE:
				setForService((Service)null);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__IS_DISCOUNTED:
				setIsDiscounted(IS_DISCOUNTED_EDEFAULT);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__DISCOUNT:
				setDiscount(DISCOUNT_EDEFAULT);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__ATTENDED_BY:
				setAttendedBy((Professional)null);
				return;
			case RegistrationSystemPackage.SERVICE_BOOKING__COST:
				setCost(COST_EDEFAULT);
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
			case RegistrationSystemPackage.SERVICE_BOOKING__BOOKING_ID:
				return BOOKING_ID_EDEFAULT == null ? bookingId != null : !BOOKING_ID_EDEFAULT.equals(bookingId);
			case RegistrationSystemPackage.SERVICE_BOOKING__START_DATE_TIME:
				return START_DATE_TIME_EDEFAULT == null ? startDateTime != null : !START_DATE_TIME_EDEFAULT.equals(startDateTime);
			case RegistrationSystemPackage.SERVICE_BOOKING__END_DATE_TIME:
				return END_DATE_TIME_EDEFAULT == null ? endDateTime != null : !END_DATE_TIME_EDEFAULT.equals(endDateTime);
			case RegistrationSystemPackage.SERVICE_BOOKING__FOR_SERVICE:
				return forService != null;
			case RegistrationSystemPackage.SERVICE_BOOKING__IS_DISCOUNTED:
				return isDiscounted != IS_DISCOUNTED_EDEFAULT;
			case RegistrationSystemPackage.SERVICE_BOOKING__DISCOUNT:
				return discount != DISCOUNT_EDEFAULT;
			case RegistrationSystemPackage.SERVICE_BOOKING__CUSTOMER:
				return customer != null;
			case RegistrationSystemPackage.SERVICE_BOOKING__STATUS:
				return status != STATUS_EDEFAULT;
			case RegistrationSystemPackage.SERVICE_BOOKING__ATTENDED_BY:
				return attendedBy != null;
			case RegistrationSystemPackage.SERVICE_BOOKING__COST:
				return cost != COST_EDEFAULT;
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
			case RegistrationSystemPackage.SERVICE_BOOKING___GET_DURATION_IN_MINUTES:
				return getDurationInMinutes();
			case RegistrationSystemPackage.SERVICE_BOOKING___GET_TOTAL_COST:
				return getTotalCost();
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
		result.append(" (bookingId: ");
		result.append(bookingId);
		result.append(", startDateTime: ");
		result.append(startDateTime);
		result.append(", endDateTime: ");
		result.append(endDateTime);
		result.append(", isDiscounted: ");
		result.append(isDiscounted);
		result.append(", discount: ");
		result.append(discount);
		result.append(", status: ");
		result.append(status);
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //ServiceBookingImpl
