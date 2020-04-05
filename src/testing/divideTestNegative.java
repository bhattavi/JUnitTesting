package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTestNegative {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		double resultNegative = test.divide(10, 0);

		// Negative test cases
		assertEquals(0, resultNegative, 0);
	}

}
