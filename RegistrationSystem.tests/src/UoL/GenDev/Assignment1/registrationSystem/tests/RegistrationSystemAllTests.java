/**
 */
package UoL.GenDev.Assignment1.registrationSystem.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>RegistrationSystem</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegistrationSystemAllTests extends TestSuite {

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
		TestSuite suite = new RegistrationSystemAllTests("RegistrationSystem Tests");
		suite.addTest(RegistrationSystemTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationSystemAllTests(String name) {
		super(name);
	}

} //RegistrationSystemAllTests
