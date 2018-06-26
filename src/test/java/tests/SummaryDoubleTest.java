package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SummaryDoubleTest extends TestBase {
    @Test(dataProvider = "valuesForSummaryTest")
    public void summaryDoubleTest(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        assertEquals(result, expectedResult, "Invalid result of double summary");
    }


    @DataProvider(name = "valuesForSummaryTest")
    public Object[][] valueforSummary() {
        return new Object[][]{
                {5, 10, 15},
                {200, 150, 350},
                {0, 0, 0},
                {0, 16, 16},
                {24, 0, 24},
                {-2, 10, 8},
                {12, -2, 10},
                {1.5, 2.8, 4.3},
        };
    }

}
