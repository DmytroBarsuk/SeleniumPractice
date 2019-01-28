package pages.i_ua.components.home_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.i_ua.LoginPage;
import pages.i_ua.UaMailBox;

public class LoginForm {

    private WebDriver driver;

    public LoginForm(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(name = "login")
    private WebElement loginField;

    @FindBy(name = "pass")
    private WebElement passField;

    @FindBy(css = "input[value='Войти']")
    private WebElement submitButton;

    public LoginForm inputLogin(String login) {
        loginField.sendKeys(login);
        return this;
    }

    public LoginForm inputPassword(String pass) {
        passField.sendKeys(pass);
        return this;
    }

    public UaMailBox submitFormSuccessfully(){
        submitButton.click();
        return new UaMailBox(driver);
    }

    public LoginPage submitFormUnsuccessfuly(){
        submitButton.click();
        return new LoginPage(driver);
    }

    public UaMailBox login(String login, String pass){
        return inputLogin(login)
                .inputPassword(pass)
                .submitFormSuccessfully();
    }
}
