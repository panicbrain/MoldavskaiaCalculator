package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class DivLongTest extends TestBase {
    @Test(dataProvider = "valuesForDivisionTest", groups = {"Long", "Arithmetic"})
    public void divisionLongTest(long a, long b, long expectedResult) {
        long result = calculator.div(a, b);
        assertEquals(result, expectedResult, "Invalid result of long division");
    }
    @Test (groups = {"Long", "Arithmetic"})
    public void divisionDifferentTypeMethodTest(){
        assertEquals((double)calculator.div(5,2), calculator.div(5d,2d));
    }

    @Test (groups = {"Long", "Arithmetic"})
    public void divisionNotCompletelyTest(){
        assertEquals((double)calculator.div(5,2), 2.5);
    }


    @Test(expectedExceptions = NumberFormatException.class, groups = {"Long", "Arithmetic"})
    public void divisionByZeroTest(){
        long result = calculator.div(5, 0);
    }


    @DataProvider(name = "valuesForDivisionTest")
    public Object[][] valuesForDivision() {
        return new Object[][]{
                {100, 5, 20},
                {40, 10, 4},
                {0, 16, 0},
                {10, -2, -5},
                {12, -2, -6},
                {15000, 3, 5000}
        };
    }
}
