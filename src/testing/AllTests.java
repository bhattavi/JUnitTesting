package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ countTest.class, divideTestPositive.class, squareTest.class, divideTestNegative.class })
public class AllTests {

}
