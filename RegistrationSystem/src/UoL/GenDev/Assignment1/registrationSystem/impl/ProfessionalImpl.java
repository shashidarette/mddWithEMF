/**
 */
package UoL.GenDev.Assignment1.registrationSystem.impl;

import UoL.GenDev.Assignment1.registrationSystem.Professional;
import UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage;
import UoL.GenDev.Assignment1.registrationSystem.Service;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Professional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ProfessionalImpl#getProfId <em>Prof Id</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ProfessionalImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ProfessionalImpl#getDateOfJoining <em>Date Of Joining</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ProfessionalImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.impl.ProfessionalImpl#getDesignation <em>Designation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfessionalImpl extends PersonImpl implements Professional {
	/**
	 * The default value of the '{@link #getProfId() <em>Prof Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfId() <em>Prof Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfId()
	 * @generated
	 * @ordered
	 */
	protected String profId = PROF_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> provides;

	/**
	 * The default value of the '{@link #getDateOfJoining() <em>Date Of Joining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfJoining()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_JOINING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfJoining() <em>Date Of Joining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfJoining()
	 * @generated
	 * @ordered
	 */
	protected Date dateOfJoining = DATE_OF_JOINING_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected String qualification = QUALIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignation() <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGNATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected String designation = DESIGNATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfessionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegistrationSystemPackage.Literals.PROFESSIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfId() {
		return profId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfId(String newProfId) {
		String oldProfId = profId;
		profId = newProfId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.PROFESSIONAL__PROF_ID, oldProfId, profId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getProvides() {
		if (provides == null) {
			provides = new EObjectResolvingEList<Service>(Service.class, this, RegistrationSystemPackage.PROFESSIONAL__PROVIDES);
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfJoining(Date newDateOfJoining) {
		Date oldDateOfJoining = dateOfJoining;
		dateOfJoining = newDateOfJoining;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.PROFESSIONAL__DATE_OF_JOINING, oldDateOfJoining, dateOfJoining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualification(String newQualification) {
		String oldQualification = qualification;
		qualification = newQualification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.PROFESSIONAL__QUALIFICATION, oldQualification, qualification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignation(String newDesignation) {
		String oldDesignation = designation;
		designation = newDesignation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegistrationSystemPackage.PROFESSIONAL__DESIGNATION, oldDesignation, designation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RegistrationSystemPackage.PROFESSIONAL__PROF_ID:
				return getProfId();
			case RegistrationSystemPackage.PROFESSIONAL__PROVIDES:
				return getProvides();
			case RegistrationSystemPackage.PROFESSIONAL__DATE_OF_JOINING:
				return getDateOfJoining();
			case RegistrationSystemPackage.PROFESSIONAL__QUALIFICATION:
				return getQualification();
			case RegistrationSystemPackage.PROFESSIONAL__DESIGNATION:
				return getDesignation();
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
			case RegistrationSystemPackage.PROFESSIONAL__PROF_ID:
				setProfId((String)newValue);
				return;
			case RegistrationSystemPackage.PROFESSIONAL__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends Service>)newValue);
				return;
			case RegistrationSystemPackage.PROFESSIONAL__DATE_OF_JOINING:
				setDateOfJoining((Date)newValue);
				return;
			case RegistrationSystemPackage.PROFESSIONAL__QUALIFICATION:
				setQualification((String)newValue);
				return;
			case RegistrationSystemPackage.PROFESSIONAL__DESIGNATION:
				setDesignation((String)newValue);
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
			case RegistrationSystemPackage.PROFESSIONAL__PROF_ID:
				setProfId(PROF_ID_EDEFAULT);
				return;
			case RegistrationSystemPackage.PROFESSIONAL__PROVIDES:
				getProvides().clear();
				return;
			case RegistrationSystemPackage.PROFESSIONAL__DATE_OF_JOINING:
				setDateOfJoining(DATE_OF_JOINING_EDEFAULT);
				return;
			case RegistrationSystemPackage.PROFESSIONAL__QUALIFICATION:
				setQualification(QUALIFICATION_EDEFAULT);
				return;
			case RegistrationSystemPackage.PROFESSIONAL__DESIGNATION:
				setDesignation(DESIGNATION_EDEFAULT);
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
			case RegistrationSystemPackage.PROFESSIONAL__PROF_ID:
				return PROF_ID_EDEFAULT == null ? profId != null : !PROF_ID_EDEFAULT.equals(profId);
			case RegistrationSystemPackage.PROFESSIONAL__PROVIDES:
				return provides != null && !provides.isEmpty();
			case RegistrationSystemPackage.PROFESSIONAL__DATE_OF_JOINING:
				return DATE_OF_JOINING_EDEFAULT == null ? dateOfJoining != null : !DATE_OF_JOINING_EDEFAULT.equals(dateOfJoining);
			case RegistrationSystemPackage.PROFESSIONAL__QUALIFICATION:
				return QUALIFICATION_EDEFAULT == null ? qualification != null : !QUALIFICATION_EDEFAULT.equals(qualification);
			case RegistrationSystemPackage.PROFESSIONAL__DESIGNATION:
				return DESIGNATION_EDEFAULT == null ? designation != null : !DESIGNATION_EDEFAULT.equals(designation);
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
		result.append(" (profId: ");
		result.append(profId);
		result.append(", dateOfJoining: ");
		result.append(dateOfJoining);
		result.append(", qualification: ");
		result.append(qualification);
		result.append(", designation: ");
		result.append(designation);
		result.append(')');
		return result.toString();
	}

} //ProfessionalImpl
