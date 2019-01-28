package test.i_ua;

import org.testng.annotations.Test;
import pages.i_ua.UaHomePage;
import pages.i_ua.UaMailBox;
import test.BaseTest;

import static data.CredentialsDataProvider.I_UA_VALID_LOGIN;
import static data.CredentialsDataProvider.I_UA_VALID_PASS;

public class LoginTest extends BaseTest{
    @Test
    public void verifyLoginWithCorrectCredentials(){
        UaHomePage homePage = new UaHomePage(driver);
        homePage.openHomeUrl();
        UaMailBox mailBox = homePage.loginToMailBox(I_UA_VALID_LOGIN, I_UA_VALID_PASS);

    }

}
