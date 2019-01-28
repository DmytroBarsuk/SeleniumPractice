package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleStartPage {
    private WebDriver driver;
    private static final String HOME_URL = "https://google.com";

    //    @FindBy(name="q")
    private By searchFieldSelector = By.name("q");
    private WebElement searchField;

    public GoogleStartPage(WebDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(this.driver, GoogleStartPage.class);
    }


    public void openHomeURL() {
        driver.get(HOME_URL);
    }

    public GoogleResultsPage search(String query) {
        searchField = driver.findElement(searchFieldSelector);
        searchField.sendKeys(query);
        searchField.submit();
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div.rc")));

        return new GoogleResultsPage(driver);
    }

}
