package ro.ase.acs.tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.acs.tests.OperationsCorrectTests;
import ro.ase.acs.tests.OperationsRightBicepTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({OperationsCorrectTests.class, OperationsRightBicepTests.class})
public class AllTests {
}
