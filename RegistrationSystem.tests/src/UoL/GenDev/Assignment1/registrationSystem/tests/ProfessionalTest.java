/**
 */
package UoL.GenDev.Assignment1.registrationSystem.tests;

import UoL.GenDev.Assignment1.registrationSystem.Professional;
import UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Professional</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfessionalTest extends PersonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProfessionalTest.class);
	}

	/**
	 * Constructs a new Professional test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfessionalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Professional test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Professional getFixture() {
		return (Professional)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RegistrationSystemFactory.eINSTANCE.createProfessional());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProfessionalTest
