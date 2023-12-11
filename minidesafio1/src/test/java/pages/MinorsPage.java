package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import configurations.Variables;

public class MinorsPage {
    private WebDriver driver;

    String minorResource = "programas/minors";
    String minorToSearch = "Infraestructura y devops";

    By programNameSelect = By.cssSelector("#form-main-38 > div:nth-child(3) > div > div > span > span.selection > span");
    By programName = By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input");
    By formName = By.cssSelector("#contenedor-nombre-1 > input");
    By formLastname = By.cssSelector("#contenedor-apellido-2 > input");
    By formPhoneNumber = By.cssSelector("#form-38-email");
    By formEmail = By.cssSelector("#contenedor-celular-4 > input");
    By formMessage = By.cssSelector("#contenedor-mensaje-5 > textarea");
    By formTermsAndConditions = By.cssSelector("#aceptapoliticas");
    By formSubmit = By.cssSelector("#btnregistro");
    By formErrorMessage = By.cssSelector("#contenedor-email-3 > div:nth-child(5)");

    public MinorsPage(WebDriver driver) {
        this.driver = driver;
        this.driver.get(Variables.ucuBaseUrl + minorResource);
    }

    public void SearchMinor() {
        driver.findElement(programNameSelect).click();
        driver.findElement(programName).sendKeys(minorToSearch);
    }

    public void SelectMinor() {
        driver.findElement(programName).sendKeys(Keys.ENTER);
    }

    public void FillForm(String name, String lastname, String phoneNumber, String email, String message) {
        driver.findElement(formName).sendKeys(name);
        driver.findElement(formLastname).sendKeys(lastname);
        driver.findElement(formPhoneNumber).sendKeys(phoneNumber);
        driver.findElement(formEmail).sendKeys(email);
        driver.findElement(formMessage).sendKeys(message);
        driver.findElement(formTermsAndConditions).click();
        driver.findElement(formSubmit).click();
    }

    public String GetErrorMessage() {
        return driver.findElement(formErrorMessage).getText();
    }
}
