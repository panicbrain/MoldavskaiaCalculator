package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PowTest extends TestBase {
    @Test(dataProvider = "valuesForPowTest")
    public void powTest(double a, double b, double expectedResult){
        double result = calculator.pow(a, b);
        assertEquals(result, expectedResult, "Invalid result of pow action");
    }

    @DataProvider(name = "valuesForPowTest")
    public Object[][] valuesForPow() {
        return new Object[][]{
                {10, 5, 100000},
                {40, 2, 1600},
                {0, 16, 0},
                {10, -2, 0.01},
                {14, 0, 1},
                {4, 2.5, 32},
                {1, 5, 1},
                {25, 0.5, 5}
        };
    }

}
