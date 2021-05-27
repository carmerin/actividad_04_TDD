package calculadora.tests;

import org.junit.*;
import org.junit.rules.TestName;

public class CalculadoraBaseTest {
	
	/**
	 * Regla de jUnit que guarda el nombre del test actual.
	 */
	public @Rule
	TestName name = new TestName();

	/**
	 * M�todo que ser� invocado antes de ejecutar los test.
	 */
	@BeforeClass
	public static void setUpClass(){
		System.out.println("[ TESTS START ] - Comienzan a ejecutarse los Test Unitarios.");
	}
	
	/**
	 * M�todo que ser� invocados antes de cada test
	 */
	@Before
	public void setUp(){
		System.out.print("***********************************************************************************************************\n");
		System.out.println("[ EJECUTANDO ] " + name.getMethodName());
	}
	
	/**
	 * M�todo que ser� invocados despu�s de cada test
	 */
	@After
	public void tearDown(){
		System.out.println("[ TERMINADO ] " + name.getMethodName());
		System.out.print("***********************************************************************************************************\n");
	}

	/**
	 * M�todo que ser� invocado despu�s de ejecutar los test.
	 */
	@AfterClass
	public static void tearDownClass(){
		System.out.println("[ TESTS FINISH ] -  Terminan de ejecutarse Test Unitarios.");
	}
}