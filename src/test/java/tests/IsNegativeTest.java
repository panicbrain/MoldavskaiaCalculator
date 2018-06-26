package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IsNegativeTest extends TestBase {
    @Test(dataProvider = "valuesForIsNegativeTest")
    public void isNegativeTest(long a, boolean expectedResult) {
        boolean result = calculator.isNegative(a);
        assertEquals(result, expectedResult, "Invalid result of sign verification");
    }

    @DataProvider(name = "valuesForIsNegativeTest")
    public Object[][] valuesForIsNegative() {
        return new Object[][]{
                {1, false},
                {500, false},
                {-5, true},
                {0, false},
        };
    }
}
