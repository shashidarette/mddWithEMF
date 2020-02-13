/**
 */
package UoL.GenDev.Assignment1.registrationSystem.impl;

import UoL.GenDev.Assignment1.registrationSystem.Address;
import UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.AddressImpl#getHouseNumber <em>House Number</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.AddressImpl#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.AddressImpl#getStreetName <em>Street Name</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.AddressImpl#getPostCode <em>Post Code</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.AddressImpl#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends MinimalEObjectImpl.Container implements Address {
	/**
	 * The default value of the '{@link #getHouseNumber() <em>House Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseNumber() <em>House Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseNumber()
	 * @generated
	 * @ordered
	 */
	protected String houseNumber = HOUSE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuildingName() <em>Building Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildingName() <em>Building Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingName()
	 * @generated
	 * @ordered
	 */
	protected String buildingName = BUILDING_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreetName() <em>Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetName()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreetName() <em>Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetName()
	 * @generated
	 * @ordered
	 */
	protected String streetName = STREET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostCode() <em>Post Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostCode() <em>Post Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCode()
	 * @generated
	 * @ordered
	 */
	protected String postCode = POST_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegistrationSystemPackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseNumber(String newHouseNumber) {
		String oldHouseNumber = houseNumber;
		houseNumber = newHouseNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.ADDRESS__HOUSE_NUMBER, oldHouseNumber, houseNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuildingName() {
		return buildingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingName(String newBuildingName) {
		String oldBuildingName = buildingName;
		buildingName = newBuildingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.ADDRESS__BUILDING_NAME, oldBuildingName, buildingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetName(String newStreetName) {
		String oldStreetName = streetName;
		streetName = newStreetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.ADDRESS__STREET_NAME, oldStreetName, streetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCode(String newPostCode) {
		String oldPostCode = postCode;
		postCode = newPostCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.ADDRESS__POST_CODE, oldPostCode, postCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.ADDRESS__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.ADDRESS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RegistrationSystemPackage.ADDRESS__HOUSE_NUMBER:
				return getHouseNumber();
			case RegistrationSystemPackage.ADDRESS__BUILDING_NAME:
				return getBuildingName();
			case RegistrationSystemPackage.ADDRESS__STREET_NAME:
				return getStreetName();
			case RegistrationSystemPackage.ADDRESS__POST_CODE:
				return getPostCode();
			case RegistrationSystemPackage.ADDRESS__CITY:
				return getCity();
			case RegistrationSystemPackage.ADDRESS__COUNTRY:
				return getCountry();
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
			case RegistrationSystemPackage.ADDRESS__HOUSE_NUMBER:
				setHouseNumber((String)newValue);
				return;
			case RegistrationSystemPackage.ADDRESS__BUILDING_NAME:
				setBuildingName((String)newValue);
				return;
			case RegistrationSystemPackage.ADDRESS__STREET_NAME:
				setStreetName((String)newValue);
				return;
			case RegistrationSystemPackage.ADDRESS__POST_CODE:
				setPostCode((String)newValue);
				return;
			case RegistrationSystemPackage.ADDRESS__CITY:
				setCity((String)newValue);
				return;
			case RegistrationSystemPackage.ADDRESS__COUNTRY:
				setCountry((String)newValue);
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
			case RegistrationSystemPackage.ADDRESS__HOUSE_NUMBER:
				setHouseNumber(HOUSE_NUMBER_EDEFAULT);
				return;
			case RegistrationSystemPackage.ADDRESS__BUILDING_NAME:
				setBuildingName(BUILDING_NAME_EDEFAULT);
				return;
			case RegistrationSystemPackage.ADDRESS__STREET_NAME:
				setStreetName(STREET_NAME_EDEFAULT);
				return;
			case RegistrationSystemPackage.ADDRESS__POST_CODE:
				setPostCode(POST_CODE_EDEFAULT);
				return;
			case RegistrationSystemPackage.ADDRESS__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case RegistrationSystemPackage.ADDRESS__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
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
			case RegistrationSystemPackage.ADDRESS__HOUSE_NUMBER:
				return HOUSE_NUMBER_EDEFAULT == null ? houseNumber != null : !HOUSE_NUMBER_EDEFAULT.equals(houseNumber);
			case RegistrationSystemPackage.ADDRESS__BUILDING_NAME:
				return BUILDING_NAME_EDEFAULT == null ? buildingName != null : !BUILDING_NAME_EDEFAULT.equals(buildingName);
			case RegistrationSystemPackage.ADDRESS__STREET_NAME:
				return STREET_NAME_EDEFAULT == null ? streetName != null : !STREET_NAME_EDEFAULT.equals(streetName);
			case RegistrationSystemPackage.ADDRESS__POST_CODE:
				return POST_CODE_EDEFAULT == null ? postCode != null : !POST_CODE_EDEFAULT.equals(postCode);
			case RegistrationSystemPackage.ADDRESS__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case RegistrationSystemPackage.ADDRESS__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
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
			case RegistrationSystemPackage.ADDRESS___GET_ADDRESS:
				return getAddress();
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
		result.append(" (houseNumber: ");
		result.append(houseNumber);
		result.append(", buildingName: ");
		result.append(buildingName);
		result.append(", streetName: ");
		result.append(streetName);
		result.append(", postCode: ");
		result.append(postCode);
		result.append(", city: ");
		result.append(city);
		result.append(", country: ");
		result.append(country);
		result.append(')');
		return result.toString();
	}

} //AddressImpl
