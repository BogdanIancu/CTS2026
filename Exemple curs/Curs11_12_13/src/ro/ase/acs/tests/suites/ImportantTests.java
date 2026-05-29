package ro.ase.acs.tests.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.acs.tests.categories.ImportantTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AllTests.class})
@Categories.IncludeCategory(ImportantTest.class)
public class ImportantTests {
}
