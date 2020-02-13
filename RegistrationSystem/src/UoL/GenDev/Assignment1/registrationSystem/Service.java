/**
 */
package UoL.GenDev.Assignment1.registrationSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Service#getServiceId <em>Service Id</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Service#getName <em>Name</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Service#getFees <em>Fees</em>}</li>
 *   <li>{@link UoL.GenDev.Assignment1.registrationSystem.Service#getRequiresProducts <em>Requires Products</em>}</li>
 * </ul>
 *
 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Id</em>' attribute.
	 * @see #setServiceId(String)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getService_ServiceId()
	 * @model default="" id="true" ordered="false"
	 * @generated
	 */
	String getServiceId();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.Service#getServiceId <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Id</em>' attribute.
	 * @see #getServiceId()
	 * @generated
	 */
	void setServiceId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fees</em>' attribute.
	 * @see #setFees(double)
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getService_Fees()
	 * @model
	 * @generated
	 */
	double getFees();

	/**
	 * Sets the value of the '{@link UoL.GenDev.Assignment1.registrationSystem.Service#getFees <em>Fees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fees</em>' attribute.
	 * @see #getFees()
	 * @generated
	 */
	void setFees(double value);

	/**
	 * Returns the value of the '<em><b>Requires Products</b></em>' reference list.
	 * The list contents are of type {@link UoL.GenDev.Assignment1.registrationSystem.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Products</em>' reference list.
	 * @see UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemPackage#getService_RequiresProducts()
	 * @model keys="productId"
	 * @generated
	 */
	EList<Product> getRequiresProducts();

} // Service
