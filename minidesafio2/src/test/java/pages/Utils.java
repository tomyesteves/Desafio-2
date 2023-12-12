package pages;
import org.openqa.selenium.WebDriver;
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
}
