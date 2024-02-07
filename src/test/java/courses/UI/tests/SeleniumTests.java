package courses.UI.tests;

import courses.UI.utils.BrowsersUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTests {
    WebDriver driver;
    WebDriverWait wait;
    String browser = "chrome";

    //    @BeforeTest
    public void setUp(String browserName) {
        driver = BrowsersUtils.getDriver(browserName);
//      implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//      explicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @DataProvider
    public Object[][] loginDP() {
        return new Object[][]{
                {"zebra", "zebrapassword", "chrome"},
                {"dingo", "dingo", "edge"},
                {"camel", "camelpassword", "firefox"},
        };
    }


    @Test(dataProvider = "loginDP")
    public void myFirstSeleniumTest(String username, String password, String browserName) {
        System.out.println("Open next browser:" + browserName);
        setUp(browserName);
        System.out.println("Open next url:http://86.121.249.151:4999/#/login");
        driver.get("http://86.121.249.151:4999/#/login");
//      by xpath selection
//      use explicit wait
//        WebElement signInButton = driver.findElement(By.xpath("//a[contains(@href,'/signin')]"));
        System.out.println("Go to login page");
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'/signin')]/h2/i")));
        signInButton.click();
//       by id selection
        WebElement emailInput = driver.findElement(By.id("user"));
        WebElement passwordInput = driver.findElement(By.id("pass"));

        emailInput.clear();
        System.out.println("Enter email:" + username);
        emailInput.sendKeys(username);
        Assert.assertEquals(username, emailInput.getAttribute("value"));
        System.out.println("Enter password:" + password);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        Assert.assertEquals(password, passwordInput.getAttribute("value"));

//       by css selector
//       WebElement button = driver.findElement(By.cssSelector("#svelte > div.container-fluid > div.main.row > div.content > div > div > div > form > button"));
//       by xpath button name
        System.out.println("Click on 'Sign in' button");
        WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        Assert.assertEquals(submitButton.getText(), "Sign in");
        submitButton.click();
    }


    @AfterMethod
    public void closeAtEnd() {
        driver.quit();
    }

    @AfterTest
    public void clean() {
        driver.quit();
    }

}
