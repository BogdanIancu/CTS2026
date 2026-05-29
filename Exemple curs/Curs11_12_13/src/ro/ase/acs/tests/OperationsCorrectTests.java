package ro.ase.acs.tests;

import org.junit.*;
import org.junit.experimental.categories.Category;
import ro.ase.acs.classes.Operations;
import ro.ase.acs.exceptions.NullParameterException;
import ro.ase.acs.tests.categories.ImportantTest;

public class OperationsCorrectTests {
    private Operations op;

    @BeforeClass
    public static void setup() {
        System.out.println("Test running started");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("Test running finished");
    }

    @Before
    public void initialize() {
        op = new Operations();
    }

    @After
    public void uninitialize() {
        op = null;
    }

    @Test
    @Category(ImportantTest.class)
    public void givenTwoPositiveValuesWhenSumIsCalledThenResultIsCorrect() {
        // Arrange
        int value1 = 5;
        int value2 = 3;
        // Act
        double result = op.sum(value1, value2);
        // Assert
        Assert.assertEquals("Sum result is not correct", 8, result, 0.00009);
    }

    @Test
    @Category(ImportantTest.class)
    public void operationsConformanceTest() {
        double value1 = 23.3333;
        double value2 = 42.6666;

        double result = 0;
        try {
            result = op.addition(value1, value2);
        } catch (NullParameterException e) {
            Assert.fail(e.getMessage());
        }
        Assert.assertEquals("Addition result is not conform", 66, result, 0.9);
    }

    @Test
    public void operationsOrderingTest() {
        Double[] firstArray = new Double[]{23.3333, 42.6666, 20d};
        Double[] secondArray = new Double[] {20d, 42.6666, 23.3333,};
        double result1 = 0;
        try {
            result1 = op.addition(firstArray);
        } catch (NullParameterException e) {
            Assert.fail(e.getMessage());
        }
        double result2 = 0;
        try {
            result2 = op.addition(secondArray);
        } catch (NullParameterException e) {
            Assert.fail(e.getMessage());
        }
        Assert.assertEquals("Addition is influenced by input order", result1, result2, 0.9);
    }

    @Test
    public void operationsRangeMaxTest() {
        double result = 0;
        try {
            result = op.addition(Double.MAX_VALUE, 5d);
        } catch (NullParameterException e) {
            Assert.fail(e.getMessage());
        }
        Assert.assertEquals("Addition overflows", Operations.MAX_SUM, result, 0.9);
    }

    @Test(expected = NullParameterException.class)
    public void operationsReferenceTest() throws NullParameterException {
        op.addition(null);
    }

    @Test(timeout = 100)
    @Ignore
    public void operationsTimeTest() {
        Double[] values = new Double[1000];
        for (int i = 0; i < values.length; i++) {
            values[i] = (double)i + 1;
        }
        try {
            op.addition(values);
        } catch (NullParameterException e) {
            Assert.fail(e.getMessage());
        }
    }
}
