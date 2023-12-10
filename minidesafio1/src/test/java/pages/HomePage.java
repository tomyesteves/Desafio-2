package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import configurations.Variables;

public class HomePage {
    private WebDriver driver;

    By searchButtonLocator = By.id("search-btn");
    By searchBoxLocator = By.id("busqueda");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.driver.get(Variables.ucuBaseUrl);
    }

    public void search(String text) {
        //driver.findElement(searchButtonLocator).click();
        //driver.findElement(searchBoxLocator).sendKeys(text);
        //driver.findElement(searchButtonLocator).sendKeys(Keys.ENTER);
        driver.findElement(searchButtonLocator).click();
        driver.findElement(searchBoxLocator).click();
        driver.findElement(searchBoxLocator).sendKeys("Ingeniería", Keys.ENTER);
    }
}
