package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResultsPage {

    private WebDriver driver;
    private List<WebElement> results;

    GoogleResultsPage(WebDriver driver){
        this.driver = driver;
 //       PageFactory.initElements(this.driver, GoogleResultsPage.class);
    }

//    @FindBys(@FindBy(css = "div.r"))


    public List<WebElement> getResults() {
        results = driver.findElements(By.cssSelector("div.rc cite"));
        return results;
    }

    public void openFirstResult(){
        results = driver.findElements(By.cssSelector("div.rc cite"));
        results.get(0).click();
    }

}
