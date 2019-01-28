package test;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver driver;

    @BeforeTest
    public void initDriver(){
         FirefoxDriverManager.firefoxdriver().arch64().setup();
         driver = new FirefoxDriver();
    }

    @AfterTest
    public void closeDriver(){
        driver.close();
    }

}
