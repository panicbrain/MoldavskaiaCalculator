package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultDoubleTest extends TestBase {
    @Test(dataProvider = "valuesForMultiplicationTest", groups = {"Double", "Arithmetic"})
    public void multiplicationDoubleTest(double a, double b, double expectedResult) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of double multiplication");
    }

    @DataProvider(name = "valuesForMultiplicationTest")
    public Object[][] valuesForMultiplication() {
        return new Object[][]{
                {5.5, 10, 55},
                {200, 150, 30000},
                {0, 0, 0},
                {0, 16, 0},
                {24, 0, 0},
                {-2, 10, -20},
                {12, -2, -24},
                {15, 28, 420},
                {1.2, 4.7, 5.64},
                {-1.2, 3.6, -4.32},
                {4.1, -8.45, -34.645}
        };
    }
}
