import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestCases {

	//Switch which line is commented out in order to test the correct vs broken code
	//TestingFunctions functions = new BlackBoxCorrect();
	//TestingFunctions functions = new BlackBoxIncorrect();
	TestingFunctions functions = new MyFunctions();
	
	/**
	 * This is a simple validity check for the method greatestCommonDivisor. Checks that the method
	 * returns the correct result for a known GCD problem gcd(2,4) = 2
	 */
	@Test
	public void testGCDNeg() {
		assertEquals("Error: should return -1", -1, functions.greatestCommonDivisor(-25, -100));
	}
	@Test
	public void testGCD0() {
		assertEquals("Error: should return 10", 10, functions.greatestCommonDivisor(10, 0));
	}
	
	/**
	 * This is a simple check of the reverseWindow method. Checks if the method will reverse the entire contents
	 * of the passed array correctly.
	 */
	@Test
	public void testReverseWindow() {
		int[] arr = new int[]{1,2,3,4,5};
		int[] expected = new int[]{1,4,3,2,5};
		functions.reverseWindow(arr,1,4);
		assertArrayEquals("Error: should be [1,4,3,2,5]", expected, arr);
	}
	@Test (expected = IndexOutOfBoundsException.class)
	public void testReverseWindowBounds() {
		int[] arr = new int[]{1,2,3,4,5};
		int[] expected = new int[]{1,4,3,2,5};
		functions.reverseWindow(arr,0,-1);
		assertArrayEquals("Error: should be [1,4,3,2,5]", expected, arr);
	}

	//For completion, write additonal tests as described in the lab documentation.
}
