import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.google.GoogleResultsPage;
import pages.google.GoogleStartPage;

public class FirstTest extends BaseTest {

    @Test
    public void firstTest() throws InterruptedException {
        GoogleStartPage startPage = new GoogleStartPage(driver);
        startPage.openHomeURL();
        GoogleResultsPage resultsPage = startPage.search("Selenium");
      //  Assert.assertTrue(resultsPage.getResults().stream().allMatch(x -> x.getText().contains("Selenium")));
         resultsPage.getResults().forEach(x -> Assert.assertTrue(x.getText().matches("(\\w*-*| |/)selenium")));
    }
}
