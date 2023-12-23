package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

import configurations.Configurations;
import configurations.Variables;
import pages.EvaluationsPage;
import pages.LoginFormPage;
import pages.RegisterFormPage;
import pages.TestsPage;
import pages.Utils;
import sharedComponents.Navbar;

public class Tests {
    private WebDriver driver;
    private Utils utils;

    @Before
    public void setUp() {
        Configurations.init();
        this.driver = Configurations.driver;
        this.utils = new Utils(driver, Variables.softestBaseUrl);
    }

    @After
    public void tearDown() {
        Configurations.closeBrowser();
    }

    @Test
    public void testLoginCorrectCredentials() {
        driver.get(Variables.softestBaseUrl);
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        loginFormPage.GoToLoginPage();
        loginFormPage.DoLogin("admin@softest.com", "softest1234");

        // Si el login fue exitoso debería aparecer el botón de logout.
        utils.WaitForElement(Navbar.navbarLogout);
        assertTrue(utils.DoesElementExist(Navbar.navbarLogout));
        utils.Screenshot("testLoginCorrectCredentials");
    }

    @Test
    public void testLoginIncorrectCredentials() {
        String loginUrl = "http://softest.brazilsouth.cloudapp.azure.com/evaluadores/auth/login";
        driver.get(Variables.softestBaseUrl);
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        loginFormPage.GoToLoginPage();
        loginFormPage.DoLogin("admin@softest.com", "passincorrecta");
        // En caso de un login incorrecto la url debe continuar siendo la del login.
        // Por parte de softest no se ha implementado un mensaje de error, si no que redirige a la página principal.
        // Pero la url se mantiene la del login
        assertTrue(loginUrl.equals(driver.getCurrentUrl()));
        utils.Screenshot("testLoginIncorrectCredentials");
    }

    @Test
    public void testLoginIncorrectEmailFormat() throws InterruptedException {
        String loginUrl = "http://softest.brazilsouth.cloudapp.azure.com/evaluadores/auth/login";
        driver.get(Variables.softestBaseUrl);
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        loginFormPage.GoToLoginPage();
        try {
            loginFormPage.DoLogin("asdasdasdasd", "test1234");    
        } catch (Exception e) {
            // En este caso, el login no se realiza, por lo que la url debe seguir siendo la del login.
            // Además de eso, la excepció generada es correcta, ya que intenta hacer click sobre el botón de login,
            // y al ser incorrecto el formato del email, no se puede hacer click sobre el botón ya que está deshabilitado.
            assertTrue(loginUrl.equals(driver.getCurrentUrl()));
        }
        utils.Screenshot("testLoginIncorrectEmailFormat");
    }

    @Test
    public void testLoginAndLogout() {
        driver.get(Variables.softestBaseUrl);
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        loginFormPage.GoToLoginPage();
        loginFormPage.DoLogin("admin@softest.com", "softest1234");
        loginFormPage.Logout();

        // Si el logout salió bien, se debería mostrar el botón de login.
        utils.WaitForElement(Navbar.navbarLogin);
        assertTrue(utils.DoesElementExist(Navbar.navbarLogin));
        utils.Screenshot("testLoginAndLogout");
    }

    @Test
    public void testRegister() {
        String expectedUrl = "http://softest.brazilsouth.cloudapp.azure.com/evaluadores/auth/login";
        driver.get(Variables.softestBaseUrl);
        RegisterFormPage registerFormPage = new RegisterFormPage(driver);
        registerFormPage.GoToRegisterPage();
        registerFormPage.FillForm("test", String.format("test%s@gmail.com", Instant.now().toEpochMilli()), "test1234", "test1234");
        registerFormPage.Click();
        // Si el registro fue exitoso debería redirigir a la página de login.
        assertTrue(expectedUrl.equals(driver.getCurrentUrl()));
        utils.Screenshot("testRegister");
    }

    @Test
    public void testRegisterAndLogin() throws InterruptedException {
        driver.get(Variables.softestBaseUrl);
        RegisterFormPage registerFormPage = new RegisterFormPage(driver);
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        String username = "test";
        String email = String.format("test%s@gmail.com", Instant.now().toEpochMilli());
        String password = "test1234";
        registerFormPage.GoToRegisterPage();
        registerFormPage.FillForm(username, email, password, password);
        registerFormPage.Click();
        Thread.sleep(2000);
        loginFormPage.DoLogin(email, password);
        utils.Screenshot("testRegisterAndLogin");
    }

    @Test
    public void testCreateEvaluation() {
        driver.get(Variables.softestBaseUrl);
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        EvaluationsPage evaluationsPage = new EvaluationsPage(driver);
        loginFormPage.GoToLoginPage();
        loginFormPage.DoLogin("admin@softest.com", "softest1234");
        evaluationsPage.GoToEvaluationsPage();
        evaluationsPage.ClickCreateButton();
        evaluationsPage.FillForm("test", "selenium", "webdriver");
        evaluationsPage.SaveEvaluation();
        utils.Screenshot("testCreateEvaluation");
    }

    @Test
    public void testCreateEmptyEvaluation() {
        driver.get(Variables.softestBaseUrl);
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        EvaluationsPage evaluationsPage = new EvaluationsPage(driver);
        loginFormPage.GoToLoginPage();
        loginFormPage.DoLogin("admin@softest.com", "softest1234");
        evaluationsPage.GoToEvaluationsPage();
        evaluationsPage.ClickCreateButton();
        evaluationsPage.SaveEvaluation();
        utils.Screenshot("testCreateEmptyEvaluation");
    }

    @Test
    public void testCreateTest() {
        driver.get(Variables.softestBaseUrl);
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        TestsPage testsPage = new TestsPage(driver);
        loginFormPage.GoToLoginPage();
        loginFormPage.DoLogin("admin@softest.com", "softest1234");
        testsPage.GoToEvaluationsPage();
        testsPage.ClickCreateButton();
        testsPage.FillForm("test", "selenium", "webdriver", "1;2;3;4;5;6;7;8;9;10");
        testsPage.SaveEvaluation();
        utils.Screenshot("testCreateTest");
    }

    @Test
    public void testCreateEmptyTest() {
        driver.get(Variables.softestBaseUrl);
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        TestsPage testsPage = new TestsPage(driver);
        loginFormPage.GoToLoginPage();
        loginFormPage.DoLogin("admin@softest.com", "softest1234");
        testsPage.GoToEvaluationsPage();
        testsPage.ClickCreateButton();
        testsPage.SaveEvaluation();
        utils.Screenshot("testCreateEmptyTest");
    }
}
