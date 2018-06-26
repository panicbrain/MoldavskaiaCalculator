package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SubtractionDoubleTest extends TestBase{
    @Test(dataProvider = "valuesForSubtractionTest")
    public void subtractionDoubleTest(double a, double b, double expectedResult){
        double result = calculator.sub(a, b);
        int resultOfCompareResults = Double.compare(result, expectedResult);
        assertTrue(resultOfCompareResults == 0, "Invalid result of double subtraction");
     }

    @DataProvider(name = "valuesForSubtractionTest")
    public Object[][] valueforSubtraction() {
        return new Object[][]{
                {5, 10, -5},
                {200, 150, 50},
                {0, 0, 0},
                {0, 16, -16},
                {24, 0, 24},
                {-2, 10, -12},
                {12, -2, 14},
                {1.5, 2.8, -1.3}
        };
    }
}
