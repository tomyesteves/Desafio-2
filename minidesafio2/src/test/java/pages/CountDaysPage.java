package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import configurations.Variables;

public class CountDaysPage {
    private WebDriver driver;
    private Utils utils;

    By startDateDay = By.id("d1");
    By startDateMonth = By.id("m1");
    By startDateYear = By.id("y1");
    By endDateDay = By.id("d2");
    By endDateMonth = By.id("m2");
    By endDateYear = By.id("y2");
    By includeEndDate = By.id("ti");
    By addTimeLink = By.cssSelector("#linktimeduration");
    By startOfDayTime = By.cssSelector("#f > div:nth-child(2) > div:nth-child(1) > p > a:nth-child(2)");
    By nowTime = By.cssSelector("#f > div:nth-child(2) > div:nth-child(3) > p > a:nth-child(1)");
    By calculateDuration = By.id("subbut2");

    public CountDaysPage(WebDriver driver) {
        this.driver = driver;
        this.utils = new Utils(this.driver, Variables.timeAndDateBaseUrl);
    }

    public void SelectDate() {
        utils.SendTextToElement(startDateDay, "01");
        utils.SendTextToElement(startDateMonth, "01");
        utils.SendTextToElement(startDateYear, "2023");
        utils.SendTextToElement(endDateDay, "31");
        utils.SendTextToElement(endDateMonth, "12");
        utils.SendTextToElement(endDateYear, "2023");
        utils.ClickElement(includeEndDate);
    }

    public void SelectTime() {
        utils.ClickElement(addTimeLink);
        utils.ClickElement(startOfDayTime);
        utils.ClickElement(nowTime);
    }

    public void Calculate() {
        utils.ClickElement(calculateDuration);
    }
}
