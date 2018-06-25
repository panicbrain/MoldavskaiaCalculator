package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SummaryLongTest extends TestBase {
    @Test(dataProvider = "valuesForSummaryTest", groups = {"Long", "Arithmetic"})
    public void summaryLongTest(long a, long b, long expectedResult){
        long result = calculator.sum(a, b);
        assertEquals(result, expectedResult, "Invalid result of long summary");
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
                {15, 28, 43}
        };
    }
}
