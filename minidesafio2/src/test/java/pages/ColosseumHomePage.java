package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import configurations.Variables;

public class ColosseumHomePage {
    private WebDriver driver;
    private Utils utils;

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

    public ColosseumHomePage(WebDriver driver) {
        this.driver = driver;
        this.utils = new Utils(this.driver, Variables.theColosseumBaseUrl);
    }

    public void RejectCookies() {
        utils.ClickElement(cookiesButton);
    }

    public void SurfTheNav() {
        utils.ClickElement(infoTicketsNav);
        utils.ClickElement(theUndergroundsNav);
        utils.ClickElement(forumNav);
        utils.ClickElement(colosseumNightNav);
        utils.ClickElement(guidedToursNav);
        utils.ClickElement(howToGetToNav);
        utils.ClickElement(christmas2023Nav);
        utils.ClickElement(freeNav);
        utils.ClickElement(exhibitionsNav);
        utils.ClickElement(kidsNav);
        utils.ClickElement(vaticanNav);
        utils.ClickElement(faqNav);
    }
}
