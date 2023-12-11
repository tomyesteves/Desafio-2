package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import configurations.Variables;

public class WebAsignaturaPage {
    private WebDriver driver;

    By studentsLink = By.cssSelector("#topnav > div > ul > li:nth-child(2) > a");
    By webAsignaturaLink = By.cssSelector("#notas_inter > div > div:nth-child(2) > div > a:nth-child(1) > div");
    By webAsignaturaUsername = By.id("username");
    By webAsignaturaPassword = By.id("password");
    By webAsignaturaLoginButton = By.id("loginbtn");

    public WebAsignaturaPage(WebDriver driver) {
        this.driver = driver;
        this.driver.get(Variables.ucuBaseUrl);
    }

    public void GoToWebAsignatura() {
        driver.findElement(studentsLink).click();
        driver.findElement(webAsignaturaLink).click();
    }

    public void FailLoginWebAsignatura(String username, String password) {
        driver.findElement(webAsignaturaUsername).sendKeys(username);
        driver.findElement(webAsignaturaPassword).sendKeys(password);
        driver.findElement(webAsignaturaLoginButton).click();
    }
}
