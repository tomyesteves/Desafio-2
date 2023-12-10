package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import configurations.Variables;

public class InternationalPage {
    private WebDriver driver;

    By internationalLink = By.cssSelector("#nav > div > ul > li:nth-child(4) > a");
    By seeAllButton = By.cssSelector("#asociaciones > div > div.col-sm-5.text-center > a");
    By externalPageLink = By.xpath("//*[@id=\"despliegue\"]/div[3]/div[1]/div/p[12]/strong/a");

    public InternationalPage(WebDriver driver) {
        this.driver = driver;
        this.driver.get(Variables.ucuBaseUrl);
    }

    public void visitExternalPage() {
        driver.findElement(internationalLink).click();
        driver.findElement(seeAllButton).click();
        driver.findElement(externalPageLink).click();
    }
}
