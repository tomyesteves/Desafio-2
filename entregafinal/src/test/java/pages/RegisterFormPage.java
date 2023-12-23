package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import configurations.Variables;
import sharedComponents.Navbar;

public class RegisterFormPage {
    private WebDriver driver;
    private Utils utils;
    private LoginFormPage loginFormPage;

    By usernameInput = By.id("username");
    By emailInput = By.id("email");
    By passwordInput = By.id("password");
    By confirmPasswordInput = By.id("confirmPassword");
    By registerButton = By.id("register-button");
    By loginButton = By.xpath("/html/body/app-root/app-layout/div/div/app-register-page/form/div[5]");

    public RegisterFormPage(WebDriver driver) {
        this.driver = driver;
        this.utils = new Utils(driver, Variables.softestBaseUrl);
        this.loginFormPage = new LoginFormPage(driver);
    }

    public void GoToRegisterPage() {
        utils.WaitForElement(Navbar.navbarLogin);
        utils.ClickElement(Navbar.navbarLogin);
        utils.WaitForElement(loginFormPage.registerButton);
        utils.ClickElement(loginFormPage.registerButton);
    }

    public void FillForm(String username, String email, String password, String confirmPassword) {
        utils.WaitForElement(usernameInput);
        utils.SendTextToElement(usernameInput, username);
        utils.WaitForElement(emailInput);
        utils.SendTextToElement(emailInput, email);
        utils.WaitForElement(passwordInput);
        utils.SendTextToElement(passwordInput, password);
        utils.WaitForElement(confirmPasswordInput);
        utils.SendTextToElement(confirmPasswordInput, confirmPassword);
    }

    public void Click() {
        utils.WaitForElement(loginButton);
        utils.ClickElement(loginButton);
    }
}
