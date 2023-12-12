package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import configurations.Variables;

public class ColosseumHomePage {
    private WebDriver driver;

    By cookiesButton = By.cssSelector("#iubenda-cs-banner > div > div > div > div.iubenda-cs-opt-group > div.iubenda-cs-opt-group-consent > button.iubenda-cs-reject-btn.iubenda-cs-btn-primary");
    By infoTicketsNav = By.linkText("Info Boletos");
    By theUndergroundsNav = By.linkText("Los subterráneo");
    By forumNav = By.linkText("Los Foros");
    By colosseumNightNav = By.linkText("El Coliseo de noche");
    By guidedToursNav = By.linkText("Visitas guiadas");
    By howToGetToNav = By.linkText("Como llegar");
    By christmas2023Nav = By.linkText("Navidad 2023");
    By freeNav = By.linkText("Gratis");
    By exhibitionsNav = By.linkText("Exposiciones");
    By kidsNav = By.linkText("Niños");
    By vaticanNav = By.linkText("Vaticano");
    By faqNav = By.linkText("FAQ");
    By contactsNav = By.linkText("Contactos");

    public ColosseumHomePage(WebDriver driver) {
        this.driver = driver;
        this.driver.get(Variables.theColosseumBaseUrl);
    }

    public void RejectCookies() {
        driver.findElement(cookiesButton).click();
    }

    public void SurfTheNav() {
        driver.findElement(infoTicketsNav).click();
        driver.findElement(theUndergroundsNav).click();
        driver.findElement(forumNav).click();
        driver.findElement(colosseumNightNav).click();
        driver.findElement(guidedToursNav).click();
        driver.findElement(howToGetToNav).click();
        driver.findElement(christmas2023Nav).click();
        driver.findElement(freeNav).click();
        driver.findElement(exhibitionsNav).click();
        driver.findElement(kidsNav).click();
        driver.findElement(vaticanNav).click();
        driver.findElement(faqNav).click();
        driver.findElement(contactsNav).click();
    }
}
