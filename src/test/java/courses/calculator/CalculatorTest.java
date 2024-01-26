package courses.calculator;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {
    Calculator c;

    @BeforeClass
    public void setUp() {
        System.out.println("Set up Testing variables");
        c = new Calculator();
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This method runs before each test");
    }

    @DataProvider
    public Object[][] calculatorDataProvider() {
        return new Object[][]{
                // expectedResults a, b, op, delta
                {10, 4, 6, "+", 0},
                {2.25, 1.25, 1.00, "+", 0},
                {-5, -2, -3, "+", 0},
                {3, 9, 6, "-", 0},
                {-8, -14, -6, "-", 0},
                {21, 7, 3, "*", 0},
                {2, 6, 3, "/", 0},
                {2, 4, 0, "SQRT", 0},
                {6, 36, 36, "SQRT", 0},
                {1.4142, 2, 0, "SQRT", 0.002}
        };
    }

    @DataProvider
    public Object[][] exceptionCalculatorDataProvider() {
        return new Object[][]{
                // a,b, op
                {2, 3, "test"},
                {4, 0, "/"},
                {-9, -56, "free radical"}
        };
    }

    @Test(dataProvider = "calculatorDataProvider")
    public void verifyCalculatorTest(double expectedResults, double a, double b, String op, double delta) {
        Assert.assertEquals(expectedResults, c.compute(a, b, op), delta, "The expected result is not the same with the actual result! ");

        if (op == "SQRT") {
            System.out.println("Compute calculator asserts with delta " + delta + " for: " + op + " " + a + " " + b + " = " + expectedResults);
        } else {
            System.out.println("Compute calculator asserts with delta " + delta + " for: " + a + " " + op + " " + b + " = " + expectedResults);
        }

    }

    @Test(dataProvider = "exceptionCalculatorDataProvider", expectedExceptions = IllegalArgumentException.class)
    public void verifyUnsupportedOperationTest(double a, double b, String op) {
        c.compute(a, b, op);
        System.out.println("Method do not return exception as expected");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This method run after each test");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("Clean up Testing variables");
        c = null;
    }
}