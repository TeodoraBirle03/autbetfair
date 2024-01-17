package courses.calculator;

import org.junit.*;

public class CalculatorTest {
    static Calculator c;

    @BeforeClass
    public static void setUp() {
        System.out.println("Set up Testing variables");
        c = new Calculator();
    }

    @Before
    public void beforeMethod() {
        System.out.println("This method runs before each test");
    }

    @Test
    public void verifyAdditionComputeTest() {
        System.out.println("Verify addition works accordingly");
        Assert.assertEquals(5, c.compute(2, 3, "+"), 3);
        Assert.assertEquals(1, c.compute(-2, 3, "+"), 3);
    }

    @Test
    public void myTestMethod2() {
        System.out.println("Hello world from Testing");
    }

    @Test
    @Ignore
    public void verifyUnsupportedOperation() {
        try {
            c.compute(2, 5.4, "+");
            System.out.println("Method do not return exception as expected");
            Assert.fail();
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        } catch (Exception e) {
            System.out.println("We are expected to received IllegalArgumentException");
            Assert.fail();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyUnsupportedOperation2() {
        c.compute(2, 5.4, "test");
    }

    @After
    public void afterMethod() {
        System.out.println("This method run after each test");
    }

    @AfterClass
    public static void cleanUp() {
        System.out.println("Clean up Testing variables");
        c = null;
    }

}