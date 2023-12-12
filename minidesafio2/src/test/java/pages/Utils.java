package pages;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;

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

    private void SwitchTab(int tab) throws InterruptedException {
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        // Redirect to WebAsignatura tab.
        driver.switchTo().window(tabs.get(tab));
    }
}
