package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CosTest extends TestBase {
    @Test(dataProvider = "valuesForCosTest", groups = {"Trigonometric"})
    public void CosTest(double a, double expectedResult) {
        double result = calculator.cos(a);
        int resultOfCompareResults = Double.compare(result, expectedResult);
        assertTrue(resultOfCompareResults == 0, "Invalid result of cos function");
    }

    @DataProvider(name = "valuesForCosTest")
    public Object[][] valuesForCos() {
        return new Object[][]{
                {0, 1},
                {1, 0.540302},
                {4, -0.653644},
                {-1.44, -0.130424},
        };
    }
}
