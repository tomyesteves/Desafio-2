package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import configurations.Variables;
import sharedComponents.Navbar;

public class TestsPage {
    private WebDriver driver;
    private Utils utils;

    By createTestButton = By.cssSelector("body > app-root > app-layout > div > app-test-list-page > div > div > div.d-flex.justify-content-between.w-100.mb-4 > div:nth-child(2) > a");
    By testName = By.id("name");
    By testInitials = By.id("initials");
    By testDescription = By.id("description");
    By testReferences = By.id("Referencias");
    By saveTestButton = By.cssSelector("body > app-test-form > div > div > div > form > button");

    public TestsPage(WebDriver driver) {
        this.driver = driver;
        this.utils = new Utils(driver, Variables.softestBaseUrl);
    }

    public void GoToEvaluationsPage() {
        utils.WaitForElement(Navbar.navbarAdmin);
        utils.ClickElement(Navbar.navbarAdmin);
        utils.WaitForElement(Navbar.navbarTests);
        utils.ClickElement(Navbar.navbarTests);
    }

    public void ClickCreateButton() {
        utils.WaitForElement(createTestButton);
        utils.ClickElement(createTestButton);
    }

    public void FillForm(String name, String initials, String description, String references) {
        utils.WaitForElement(testName);
        utils.SendTextToElement(testName, name);
        utils.WaitForElement(testInitials);
        utils.SendTextToElement(testInitials, initials);
        utils.WaitForElement(testDescription);
        utils.SendTextToElement(testDescription, description);
        utils.WaitForElement(testReferences);
        utils.SendTextToElement(testReferences, references);
    }

    public void SaveEvaluation() {
        utils.WaitForElement(saveTestButton);
        utils.ClickElement(saveTestButton);
    }
}
