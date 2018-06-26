package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MultLongTest extends TestBase {
    @Test(dataProvider = "valuesForMultiplicationTest")
    public void multiplicationLongTest(long a, long b, long expectedResult){
        long result = calculator.mult(a, b);
        assertEquals(result, expectedResult, "Invalid result of long multiplication");
    }

    @DataProvider(name = "valuesForMultiplicationTest")
    public Object[][] valuesForMultiplication() {
        return new Object[][]{
                {5, 10, 50},
                {200, 150, 30000},
                {0, 0, 0},
                {0, 16, 0},
                {24, 0, 0},
                {-2, 10, -20},
                {12, -2, -24},
                {15, 28, 420}
        };
    }
}
