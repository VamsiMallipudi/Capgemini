package junitbasics;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class mMathUtilsTest {
	
	mMathUtils m;
	
	@BeforeAll
	static void BeforeAllinit() {
		System.out.println("This needs to run before all tests");
	}
	
	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up....");
	}
	
	@BeforeEach
	void init() {
		 m = new mMathUtils();
	}
	
	@Tag("Math")
	@Nested
	class TestAdd{
		
		@Test
		@DisplayName("Adding positive numbers")
		void TestaddPositive() {
			assertEquals(2,m.add(1, 1));
		}
		
		@Test
		@DisplayName("Adding negative numbers")
		void TestaddNegative() {
			assertEquals(-2,m.add(-1, -1));
		}
	}
	
	/*@DisplayName("Testing add method")
	@Test
	void test() {
		int expected = 2;
		int actual = m.add(1, 1);
		assertEquals(expected,actual);
	}*/
	
	
	@Tag("Math")
	@Test
	void testDiv()
	{	
		boolean isServerUp=false;
		assumeTrue(isServerUp);
		assertThrows(ArithmeticException.class,()->m.divide(1, 0),"it is not allowd to divide with zero");
	}
	
	@Tag("Circle")
	@Test
	void TestCircle() {
		assertEquals(314.1592653589793,m.computeCircle(10),"should return the area of the circle");
	}
	
	@Tag("Math")
	@Test
	@DisplayName("Multiplying two numbers")
	void testMultiply() {
		assertAll(
				()->assertEquals(4,m.multiply(2, 2)),
				()->assertEquals(0,m.multiply(2, 0)),
				()->assertEquals(-2,m.multiply(2, -1))
				);
	}
	
	/*@DisplayName("TDD method should not run")
	@Disabled
	@Test
	void disableTest() {
		fail("This method should not be disabled");
	}*/

}
