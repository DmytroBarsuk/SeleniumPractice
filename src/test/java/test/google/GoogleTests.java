package test.google;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.google.GoogleResultsPage;
import pages.google.GoogleStartPage;
import test.BaseTest;

public class GoogleTests extends BaseTest {

    @Test
    public void googleSearchTest() throws InterruptedException {
        GoogleStartPage startPage = new GoogleStartPage(driver);
        startPage.openHomeURL();
        GoogleResultsPage resultsPage = startPage.search("Selenium");
      //  Assert.assertTrue(resultsPage.getResults().stream().allMatch(x -> x.getText().contains("Selenium")));
         resultsPage.getResults().forEach(x -> Assert.assertTrue(x.getText().matches("(\\w*-*| |/)selenium")));
    }
}
