package tests;


import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void beforeClass(){
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown(){
        calculator = null;
    }
}
