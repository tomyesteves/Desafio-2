package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import configurations.Variables;

public class PetsPage {
    private WebDriver driver;
    private Utils utils;

    By signInLink = By.cssSelector("#MenuContent > a:nth-child(3)");
    By registerLink = By.cssSelector("#Catalog > a");
    By registerId = By.cssSelector("//*[@id=\"stripes--948558619\"]"); // Es dinamico el valor no funciona
    By registerPass = By.cssSelector("#Catalog > form > table:nth-child(2) > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=text]");
    By registerRepeatPass = By.cssSelector("#Catalog > form > table:nth-child(2) > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=text]");
    By registerName = By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]");
    By registerLastName = By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=text]");
    By registerEmail = By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=text]");
    By registerPhone = By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]");
    By registerAddress = By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=text]");
    By registerCity = By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(7) > td:nth-child(2) > input[type=text]");
    By registerState = By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]");
    By registerZip = By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]");
    By registerCountry = By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]");
    By registerSubmit = By.cssSelector("#Catalog > form > input[type=submit]");

    By loginUser = By.cssSelector("//*[@id=\"stripes--68031331\"]"); // Es dinamico el valor no funciona
    By loginPass = By.cssSelector("#Catalog > form > p:nth-child(2) > input[type=password]:nth-child(4)");
    By loginSubmit = By.cssSelector("#Catalog > form > input[type=submit]");

    By birdsSection = By.cssSelector("#QuickLinks > a:nth-child(9) > img");
    By birdsItem = By.cssSelector("#Catalog > table > tbody > tr:nth-child(2) > td:nth-child(1) > a");
    By addToCartButton = By.cssSelector("#Catalog > table > tbody > tr:nth-child(2) > td:nth-child(5) > a");
    By goToCheckout = By.cssSelector("#Cart > a");
    By confirmCheckout = By.cssSelector("#Catalog > form > input[type=submit]");
    By returnToMainMenu = By.cssSelector("#BackLink > a");

    public PetsPage(WebDriver driver) {
        this.driver = driver;
        this.utils = new Utils(this.driver, Variables.petStoreBaseUrl);
    }

    public void Register(String id, String pass, String repeatPass, String name, String lastname, String email, String phone, String address, String city, String state, String zip, String country) {
        utils.ClickElement(signInLink);
        utils.ClickElement(registerLink);
        //utils.SendTextToElement(registerId, id);
        utils.SendTextToElement(registerPass, pass);
        utils.SendTextToElement(registerRepeatPass, repeatPass);
        utils.SendTextToElement(registerName, name);
        utils.SendTextToElement(registerLastName, lastname);
        utils.SendTextToElement(registerEmail, email);
        utils.SendTextToElement(registerPhone, phone);
        utils.SendTextToElement(registerAddress, address);
        utils.SendTextToElement(registerCity, city);
        utils.SendTextToElement(registerState, state);
        utils.SendTextToElement(registerZip, zip);
        utils.SendTextToElement(registerCountry, country);
        utils.ClickElement(registerSubmit);
    }

    public void Login() {
        utils.SendTextToElement(loginUser, "tomasesteves");
        utils.SendTextToElement(loginPass, "adminadmin");
        utils.ClickElement(loginSubmit);
    }

    public void AddItemsToCart() {
        utils.ClickElement(birdsSection);
        utils.ClickElement(birdsItem);
        utils.ClickElement(addToCartButton);
        utils.ClickElement(goToCheckout);
    }

    public void Checkout() {
        utils.ClickElement(confirmCheckout);
        utils.ClickElement(returnToMainMenu);
    }
}
