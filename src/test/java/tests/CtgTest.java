package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.POSITIVE_INFINITY;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CtgTest extends TestBase {
    @Test(dataProvider = "valuesForCtgTest", groups = {"Trigonometric"})
    public void ctgTest(double a, double expectedResult) {
        double result = calculator.ctg(a);
        int resultOfCompareResults = Double.compare(result, expectedResult);
        assertTrue(resultOfCompareResults == 0, "Invalid result of ctg function");
      }

    @Test (groups = {"Trigonometric"})
    public void ctgOfZeroTest() {
        assertEquals(calculator.ctg(0), POSITIVE_INFINITY, "Invalid cth function of zero");
    }

    //http://old.exponenta.ru/educat/class/test/hyperb/13.asp - table for tanh

    @DataProvider(name = "valuesForCtgTest")
    public Object[][] valuesForCtg() {
        return new Object[][]{
                {1, 0.642093},
                {4, 0.863691},
                {-1.44, -7.601826},
        };
    }
}
