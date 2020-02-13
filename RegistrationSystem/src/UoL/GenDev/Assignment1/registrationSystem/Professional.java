/**
 */
package UoL.GenDev.Assignment1.registrationSystem;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Professional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getProfId <em>Prof Id</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getProvides <em>Provides</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getDateOfJoining <em>Date Of Joining</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getQualification <em>Qualification</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getDesignation <em>Designation</em>}</li>
 * </ul>
 *
 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getProfessional()
 * @model
 * @generated
 */
public interface Professional extends Person {
	/**
	 * Returns the value of the '<em><b>Prof Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prof Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prof Id</em>' attribute.
	 * @see #setProfId(String)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getProfessional_ProfId()
	 * @model id="true"
	 * @generated
	 */
	String getProfId();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getProfId <em>Prof Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prof Id</em>' attribute.
	 * @see #getProfId()
	 * @generated
	 */
	void setProfId(String value);

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference list.
	 * The list contents are of type {@link UoL.GenDev.Assignment1.registrationSystem.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' reference list.
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getProfessional_Provides()
	 * @model keys="serviceId"
	 * @generated
	 */
	EList<Service> getProvides();

	/**
	 * Returns the value of the '<em><b>Date Of Joining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Joining</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Joining</em>' attribute.
	 * @see #setDateOfJoining(Date)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getProfessional_DateOfJoining()
	 * @model
	 * @generated
	 */
	Date getDateOfJoining();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getDateOfJoining <em>Date Of Joining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Joining</em>' attribute.
	 * @see #getDateOfJoining()
	 * @generated
	 */
	void setDateOfJoining(Date value);

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' attribute.
	 * @see #setQualification(String)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getProfessional_Qualification()
	 * @model
	 * @generated
	 */
	String getQualification();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getQualification <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification</em>' attribute.
	 * @see #getQualification()
	 * @generated
	 */
	void setQualification(String value);

	/**
	 * Returns the value of the '<em><b>Designation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation</em>' attribute.
	 * @see #setDesignation(String)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getProfessional_Designation()
	 * @model
	 * @generated
	 */
	String getDesignation();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.Professional#getDesignation <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designation</em>' attribute.
	 * @see #getDesignation()
	 * @generated
	 */
	void setDesignation(String value);

} // Professional
