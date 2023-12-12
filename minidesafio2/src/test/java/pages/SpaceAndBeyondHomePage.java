package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import configurations.Variables;

public class SpaceAndBeyondHomePage {
    private WebDriver driver;
    private Utils utils;

    By loginUsername = By.cssSelector("#login > div:nth-child(1) > input");
    By loginPassword = By.cssSelector("#login > div:nth-child(2) > input");
    By loginSubmit = By.cssSelector("#app > div > section.Login__login___3HOEm > div > div.flexboxgrid__col-xs-6___1DhV6.Login__card-box___1pKg0 > div > nav > button.theme__button___1iKuo.LoginButton__button___1Sd3Q.theme__raised___ONZv6.LoginButton__raised___1fUxJ.theme__primary___2NhN1.LoginButton__primary___38GOe");

    By journeyDepartingDate = By.cssSelector("#app > div > section.Hero__hero___1FDXn > div:nth-child(3) > div > div:nth-child(1) > div > div > input");
    By journeyReturningDate = By.cssSelector("#app > div > section.Hero__hero___1FDXn > div:nth-child(3) > div > div:nth-child(2) > div > div > input");

    By departingDate = By.cssSelector("body > div:nth-child(4) > div > div.theme__dialog___1f3Zg.theme__active___3rz6t.theme__dialog___1RQhu > section > div > div > div > span > div > div.theme__days___3kAIy > div:nth-child(27) > span");
    By returningDate = By.cssSelector("null");

    By okButton = By.cssSelector("body > div:nth-child(4) > div > div.theme__dialog___1f3Zg.theme__active___3rz6t.theme__dialog___1RQhu > nav > button:nth-child(2)");

    By adultsSelect = By.cssSelector("#app > div > section.Hero__hero___1FDXn > div:nth-child(3) > div > div:nth-child(3) > div > input");
    By adultsOption = By.cssSelector("#app > div > section.Hero__hero___1FDXn > div:nth-child(3) > div > div.theme__dropdown___co-4M.WhiteDropDown__dropdown___2JJF3.theme__active___31xyK.WhiteDropDown__active___3HcKK.Hero__dropdown-size-2___2eNNl > ul > li:nth-child(3)");

    By selectDestination = By.cssSelector("#app > div > section.Hero__hero___1FDXn > div:nth-child(4) > button");
    By bookDestination = By.cssSelector("#app > div > section:nth-child(4) > div:nth-child(5) > div > div > div:nth-child(6) > div.theme__cardActions___1aHjq.GalleryItem__cardActions___zE_tm > button");

    By checkoutName = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.theme__card___2nWQb.CustomerInfo__customer-info___3e5NH > form > div:nth-child(1) > input");
    By checkoutEmail = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.theme__card___2nWQb.CustomerInfo__customer-info___3e5NH > form > div:nth-child(2) > input");
    By checkoutSecurityNumber = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.theme__card___2nWQb.CustomerInfo__customer-info___3e5NH > form > div:nth-child(3) > input");
    By checkoutPhoneNumber = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.theme__card___2nWQb.CustomerInfo__customer-info___3e5NH > form > div:nth-child(4) > input");
    By checkoutPromoCode = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.Box__box___2XzJ2.OrderSummary__order-summary___1kfwQ > div.OrderSummary__row-4___2JawU.flexboxgrid__row___1y_mg > div.flexboxgrid__col-xs-7___3o2m- > div > input");
    By checkoutPromoCodeApply = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.Box__box___2XzJ2.OrderSummary__order-summary___1kfwQ > div.OrderSummary__row-4___2JawU.flexboxgrid__row___1y_mg > div.flexboxgrid__col-xs-5___1HkK5 > button");
    By checkoutTerms = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.Box__box___2XzJ2.OrderSummary__order-summary___1kfwQ > div:nth-child(6) > div > label > div");

    public SpaceAndBeyondHomePage(WebDriver driver) {
        this.driver = driver;
        this.utils = new Utils(this.driver, Variables.spaceAndBeyondBaseUrl + "login");
    }

    public void Login(String user, String pass) {
        utils.SendTextToElement(loginUsername, user);
        utils.SendTextToElement(loginPassword, pass);
        utils.ClickElement(loginSubmit);
    }

    public void SelectJourney() {
        utils.ClickElement(journeyDepartingDate);
        utils.ClickElement(departingDate);
        utils.ClickElement(okButton);
        utils.ClickElement(adultsSelect);
        utils.ClickElement(adultsOption);
        utils.ClickElement(selectDestination);
        utils.ClickElement(bookDestination);
    }

    public void Checkout() {
        utils.SendTextToElement(checkoutName, "Tomy");
        utils.SendTextToElement(checkoutEmail, "test@gmail.com");
        utils.SendTextToElement(checkoutSecurityNumber, "123-12-1234");
        utils.SendTextToElement(checkoutPhoneNumber, "099123456");
        utils.SendTextToElement(checkoutPromoCode, "123456789");
        utils.ClickElement(checkoutTerms);
        utils.ClickElement(checkoutPromoCodeApply);
    }
}
