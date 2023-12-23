package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import configurations.Variables;
import sharedComponents.Navbar;

public class LoginFormPage {
    private WebDriver driver;
    private Utils utils;

    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("login-button");
    By registerButton = By.xpath("/html/body/app-root/app-layout/div/div/app-login-page/div/a");

    public LoginFormPage(WebDriver driver) {
        this.driver = driver;
        this.utils = new Utils(driver, Variables.softestBaseUrl);
    }

    public void GoToLoginPage() {
        utils.WaitForElement(Navbar.navbarLogin);
        utils.ClickElement(Navbar.navbarLogin);
    }

    public void FillLogin(String email, String password) {
        utils.WaitForElement(emailInput);
        utils.SendTextToElement(emailInput, email);
        utils.WaitForElement(passwordInput);
        utils.SendTextToElement(passwordInput, password);
    }

    public void Click(){
        utils.WaitForElement(loginButton);
        utils.ClickElement(loginButton);
    }

    public void DoLogin(String email, String password) {
        FillLogin(email, password);
        Click();
    }

    public void Logout() {
        utils.WaitForElement(Navbar.navbarLogout);
        utils.ClickElement(Navbar.navbarLogout);
    }
}
