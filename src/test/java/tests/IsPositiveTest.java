package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class IsPositiveTest extends TestBase {
    @Test(dataProvider = "valuesForIsPositiveTest", groups = {"Arithmetic"})
    public void isPositiveTest(long a, boolean expectedResult) {
        boolean result = calculator.isPositive(a);
        assertEquals(result, expectedResult, "Invalid result of sign verification");
    }

    @DataProvider(name = "valuesForIsPositiveTest")
    public Object[][] valuesForIsPositive() {
        return new Object[][]{
                {1, true},
                {500, true},
                {-5, false},
                {0, false},
        };
    }
}
