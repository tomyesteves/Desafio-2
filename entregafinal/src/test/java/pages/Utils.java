package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import configurations.Variables;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

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

    public void WaitForElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void Screenshot(String imgName) {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(String.format("%s%s_%s.png", Variables.ssRoute, Instant.now().toEpochMilli(), imgName)));

        } catch (IOException e) {
            System.out.println("EERROORR -> " + e.getMessage());
        }
    }

    public boolean DoesElementExist(By by) {
        try {
            WebElement element = driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
