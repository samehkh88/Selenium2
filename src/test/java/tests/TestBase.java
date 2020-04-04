package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

// TestBase should extend from AbstractTestNGCucumberTests to make cucumber work

public class TestBase extends AbstractTestNGCucumberTests {
    public static WebDriver driver;

    @BeforeSuite()
    @Parameters({"browser"})
    public void StartDriver(@Optional("firefox") String browserName) {

        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browserName.equalsIgnoreCase("firefox")) {
             System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
             driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterClass
    public void WaitAfterClass()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void StopDriver()
    {
        driver.quit();
    }
}

