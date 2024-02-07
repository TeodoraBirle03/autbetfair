package courses.UI.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsersUtils {
    public static WebDriver getDriver(String browserName) {
        switch (browserName.toLowerCase()) {
            case ("chrome"): {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
            case ("firefox"): {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }
            case ("edge"): {
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            }
            default: {
                System.out.println("Unsupported browser, will select by default chrome");
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
        }
    }
}