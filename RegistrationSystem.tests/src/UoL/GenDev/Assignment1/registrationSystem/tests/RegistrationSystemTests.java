/**
 */
package UoL.GenDev.Assignment1.registrationSystem.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>registrationSystem</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegistrationSystemTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new RegistrationSystemTests("registrationSystem Tests");
		suite.addTestSuite(PersonTest.class);
		suite.addTestSuite(ProfessionalTest.class);
		suite.addTestSuite(CustomerTest.class);
		suite.addTestSuite(ServiceBookingTest.class);
		suite.addTestSuite(AddressTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationSystemTests(String name) {
		super(name);
	}

} //RegistrationSystemTests
