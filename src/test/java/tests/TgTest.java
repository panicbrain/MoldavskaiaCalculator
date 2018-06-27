package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TgTest extends TestBase {
    @Test(dataProvider = "valuesForTgTest")
    public void tgTest(double a, double expectedResult){
        double result = calculator.tg(a);
        assertEquals(result, expectedResult, "Invalid result of tg function");
    }

    @DataProvider(name = "valuesForTgTest")
    public Object[][] valuesForTg() {
        return new Object[][]{
                {1, 0.17},
                {40, 0.839},
                {-1.44, 1.2},
                {0, 0}
        };
    }
}
