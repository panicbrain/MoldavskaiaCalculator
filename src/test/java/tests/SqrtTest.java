package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SqrtTest extends TestBase {
    @Test(dataProvider = "valuesForSqrtTest", groups = {"Double", "Arithmetic"})
    public void sqrtTest(double a, double expectedResult){
        double result = calculator.sqrt(a);
        assertEquals(result, expectedResult, "Invalid result of sqrt action");
    }

    @Test(expectedExceptions = Exception.class)
    public void sqrtOfNegativeNumberTest(){
        double result = calculator.sqrt(-25);
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
