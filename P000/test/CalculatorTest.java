import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	int a;
	int b;

	@Test
	public void testAdd() {
		// arrange
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		// act
		int actual = cal.add(a, b);
		
		// assert
		int expected = 9999;
		assertEquals (expected,actual);
	}
	
	@Test
	public void testSubtract() {
		// arrange
		a = 4321;
		b = 1234;
		Calculator cal = new Calculator();
				
		// act
		int actual = cal.subtract(a, b);
		
		// assert
		int expected = 3087;
		assertEquals (expected, actual);
	}
	@Test
	public void testMultiply() {
		// arrange
		a = 4;
		b = 4;
		Calculator cal = new Calculator();
				
		// act
		int actual = cal.multiply(a, b);
		
		// assert
		int expected = 16;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		// arrange
		a = 4;
		b = 4;
		Calculator cal = new Calculator();
				
		// act
		int actual = cal.divide(a, b);
		
		// assert
		int expected = 1;
		assertEquals (expected, actual);
	}

}
