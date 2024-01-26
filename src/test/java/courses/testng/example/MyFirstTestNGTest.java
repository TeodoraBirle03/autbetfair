package courses.testng.example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class MyFirstTestNGTest {

    @BeforeClass
    public void setUp() {
    }

    @Test
    public void test1(){
        System.out.println("Run test1");
    }

    @Test
    public void test2(){
        System.out.println("Run test2");
    }

    protected void helpMethod() {
        System.out.println("Ths is a help method and needs to be protected");
    }
}
