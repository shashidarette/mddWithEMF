/**
 */
package UoL.GenDev.Assignment1.registrationSystem.impl;

import UoL.GenDev.Assignment1.registrationSystem.Product;
import UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage;
import UoL.GenDev.Assignment1.registrationSystem.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceImpl#getServiceId <em>Service Id</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceImpl#getFees <em>Fees</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ServiceImpl#getRequiresProducts <em>Requires Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The default value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected String serviceId = SERVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFees() <em>Fees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFees()
	 * @generated
	 * @ordered
	 */
	protected static final double FEES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFees() <em>Fees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFees()
	 * @generated
	 * @ordered
	 */
	protected double fees = FEES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiresProducts() <em>Requires Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> requiresProducts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegistrationSystemPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceId(String newServiceId) {
		String oldServiceId = serviceId;
		serviceId = newServiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE__SERVICE_ID, oldServiceId, serviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFees() {
		return fees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFees(double newFees) {
		double oldFees = fees;
		fees = newFees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.SERVICE__FEES, oldFees, fees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getRequiresProducts() {
		if (requiresProducts == null) {
			requiresProducts = new EObjectResolvingEList<Product>(Product.class, this, RegistrationSystemPackage.SERVICE__REQUIRES_PRODUCTS);
		}
		return requiresProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RegistrationSystemPackage.SERVICE__SERVICE_ID:
				return getServiceId();
			case RegistrationSystemPackage.SERVICE__NAME:
				return getName();
			case RegistrationSystemPackage.SERVICE__FEES:
				return getFees();
			case RegistrationSystemPackage.SERVICE__REQUIRES_PRODUCTS:
				return getRequiresProducts();
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
			case RegistrationSystemPackage.SERVICE__SERVICE_ID:
				setServiceId((String)newValue);
				return;
			case RegistrationSystemPackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case RegistrationSystemPackage.SERVICE__FEES:
				setFees((Double)newValue);
				return;
			case RegistrationSystemPackage.SERVICE__REQUIRES_PRODUCTS:
				getRequiresProducts().clear();
				getRequiresProducts().addAll((Collection<? extends Product>)newValue);
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
			case RegistrationSystemPackage.SERVICE__SERVICE_ID:
				setServiceId(SERVICE_ID_EDEFAULT);
				return;
			case RegistrationSystemPackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RegistrationSystemPackage.SERVICE__FEES:
				setFees(FEES_EDEFAULT);
				return;
			case RegistrationSystemPackage.SERVICE__REQUIRES_PRODUCTS:
				getRequiresProducts().clear();
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
			case RegistrationSystemPackage.SERVICE__SERVICE_ID:
				return SERVICE_ID_EDEFAULT == null ? serviceId != null : !SERVICE_ID_EDEFAULT.equals(serviceId);
			case RegistrationSystemPackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RegistrationSystemPackage.SERVICE__FEES:
				return fees != FEES_EDEFAULT;
			case RegistrationSystemPackage.SERVICE__REQUIRES_PRODUCTS:
				return requiresProducts != null && !requiresProducts.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (serviceId: ");
		result.append(serviceId);
		result.append(", name: ");
		result.append(name);
		result.append(", fees: ");
		result.append(fees);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
