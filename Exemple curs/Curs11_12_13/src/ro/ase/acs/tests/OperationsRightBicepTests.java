package ro.ase.acs.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.acs.classes.Operations;
import ro.ase.acs.exceptions.NullParameterException;
import ro.ase.acs.tests.categories.ImportantTest;

import java.util.Arrays;

public class OperationsRightBicepTests {
    @Test
    public void operationsBoundaryRightTest() throws NullParameterException {
        Operations op = new Operations();
        double result = op.addition(19_999d, 1d);
        assertEquals("The upper boundary is not correct", 20_000d, result, 0.9);
    }

    @Test
    @Category(ImportantTest.class)
    public void operationInverseRelationshipTest() throws NullParameterException {
        Operations op = new Operations();
        double sum = op.addition(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        double result = sum - 10 - 9 - 8 - 7 - 6 - 5 - 4 - 3 - 2 - 1;
        assertEquals("The inverse relationship doesn't check", 0, result, 0.9);
    }

    @Test
    @Category(ImportantTest.class)
    public void operationsCrossCheckTest() throws NullParameterException {
        Operations op = new Operations();
        Double[] values = new Double[] {500d, 200d, 1000d};
        double actualResult = op.addition(values);
        double expectedResult = Arrays.stream(values).mapToDouble(x -> x).sum();
        assertEquals("The cross check doesn't check", expectedResult, actualResult, 0.9);
    }

    @Test
    public void operationsErrorConditionTest() {
        Operations op = new Operations();
        Assert.assertThrows("Exception not thrown for null input",
                NullParameterException.class, () -> op.addition(null));
    }

    @Test(timeout = 100)
    public void operationsPerformanceTest() {
        Operations op = new Operations();
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
