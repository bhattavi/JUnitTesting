package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int result = test.count("haha");
		assertEquals(2, result);
	}

}
