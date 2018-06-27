package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SinusTest extends TestBase {
    @Test(dataProvider = "valuesForSinTest")
    public void SinTest(double a, double expectedResult) {
        double result = calculator.sin(a);
        assertTrue((expectedResult - result) < 0.0001, "Invalid result of sin function");
    }

    @DataProvider(name = "valuesForSinTest")
    public Object[][] valuesForSin() {
        return new Object[][]{
                {0, 0},
                {1, 0.8415},
                {4, -0.7568},
                {-1.44, -0.9915},
        };
    }
}
