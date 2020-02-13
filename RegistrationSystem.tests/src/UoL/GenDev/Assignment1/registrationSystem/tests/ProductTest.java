/**
 */
package UoL.GenDev.Assignment1.registrationSystem.tests;

import UoL.GenDev.Assignment1.registrationSystem.Product;
import UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductTest extends TestCase {

	/**
	 * The fixture for this Product test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Product fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductTest.class);
	}

	/**
	 * Constructs a new Product test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Product test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Product fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Product test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Product getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RegistrationSystemFactory.eINSTANCE.createProduct());
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

} //ProductTest
