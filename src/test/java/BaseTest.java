import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver driver;

    @BeforeTest
    public void initDriver(){
         ChromeDriverManager.chromedriver().arch32().setup();
         driver = new ChromeDriver();
    }

    @AfterTest
    public void closeDriver(){
        driver.close();
    }

}
