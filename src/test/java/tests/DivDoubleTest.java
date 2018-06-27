package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DivDoubleTest extends TestBase {
    @Test(dataProvider = "valuesForDivisionTest")
    public void divisionDoubleTest(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        assertEquals(result, expectedResult, "Invalid result of double division");
    }

    @Test
    public void divisionNotCompletelyTest(){
        assertEquals(calculator.div(5d,2d), 2.5);
    }


    @Test(expectedExceptions = Exception.class, groups = {"IncorrectActionCheck"})
    public void divisionByZeroTest() throws Exception{
        double result = calculator.div(5d, 0d);
    }


    @DataProvider(name = "valuesForDivisionTest")
    public Object[][] valuesForDivision() {
        return new Object[][]{
                {100, 5, 20},
                {7, 3.5, 2},
                {15, 50, 0.3},
                {40, 10, 4},
                {0, 16, 0},
                {10, -2, -5},
                {-12, 2, -6},
                {15000, 3, 5000}
        };
    }
}
