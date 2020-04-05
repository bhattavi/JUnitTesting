package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTestPositive {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		double resultPositive = test.divide(10, 2);

		// Positive test cases
		assertEquals(5, resultPositive, 0);
	}

}
