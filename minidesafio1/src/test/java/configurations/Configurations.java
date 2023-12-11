package configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Configurations {
    public static WebDriver driver;

    public static void init() {
        // Driver configuration.
        System.setProperty(Variables.driverKey, Variables.driverPath);
        driver = new EdgeDriver();
        driver.manage().window().maximize();

    }

    public static void closeBrowser() {
        //driver.quit();
    }
}
