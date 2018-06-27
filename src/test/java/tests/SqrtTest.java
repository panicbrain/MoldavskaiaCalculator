package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;
import static org.testng.Assert.assertEquals;

public class SqrtTest extends TestBase {
    @Test(dataProvider = "valuesForSqrtTest")
    public void sqrtTest(double a, double expectedResult){
        double result = calculator.sqrt(a);
        assertEquals(result, expectedResult, "Invalid result of sqrt action");
    }

    @Test(groups = {"IncorrectActionCheck"})
    public void sqrtOfNegativeNumberTest() {
        double result = calculator.sqrt(-25);

        assertEquals(result, NaN, "Invalid result of sqrt action");
    }

    @DataProvider(name = "valuesForSqrtTest")
    public Object[][] valuesForPow() {
        return new Object[][]{
                {25, 5},
                {400, 20},
                {1.44, 1.2},
        };
    }
}
