package pages.i_ua;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.i_ua.components.home_page.LoginForm;

public class UaHomePage {
    private WebDriver driver;
    private LoginForm loginForm;
    private static final String HOME_URL = "https://i.ua";

    public UaHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void openHomeUrl() {
        driver.get(HOME_URL);
        loginForm = new LoginForm(driver);
        PageFactory.initElements(driver, loginForm);
    }

    public UaMailBox loginToMailBox(String login, String pass){
        return loginForm.login(login,pass);
    }

    public LoginPage loginUnsuccessfully(String invalidLogin, String invalidPass){
        return loginForm.inputLogin(invalidLogin)
                .inputPassword(invalidPass)
                .submitFormUnsuccessfuly();
    }
}
