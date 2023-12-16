package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class Utils {
    private WebDriver driver;

    public Utils(WebDriver driver, String url) {
        this.driver = driver;
        this.driver.get(url);
    }

    public void ClickElement(By element) {
        driver.findElement(element).click();;
    }

    public void SendTextToElement(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

    public void SwitchTab(int tab) throws InterruptedException {
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        // Redirect to WebAsignatura tab.
        driver.switchTo().window(tabs.get(tab));
    }

    public void ClickElementByActions(By element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(element)).click().perform();
    }

    public void Set50Zoom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom = '50%'");
    }

    public void ClearInput(By element) {
        driver.findElement(element).sendKeys(Keys.CLEAR);;
    }

    public void ClearInputByKeys(By element, int times) {
        for (int i = 0; i < times; i++) {
            driver.findElement(element).sendKeys(Keys.BACK_SPACE);
        }
    }

    public WebElement GetElement(By element) {
        return driver.findElement(element);
    }

    public void ClickSubmit(By element) {
        WebElement elementToClick = driver.findElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementToClick);
    }
}
