package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import configurations.Variables;

public class AddWorkdaysPage {
    private WebDriver driver;
    private Utils utils;

    By workdaysAdd = By.id("datetabs_weekdayadd");
    By startDateCalendarDay = By.id("d1");
    By startDateCalendarMonth = By.id("m1");
    By startDateCalendarDays = By.id("y1");
    By daysToAdd = By.id("ad");
    By datesInResultFilter = By.id("ach");
    By datesInResultFilterValue = By.cssSelector("#ach > option:nth-child(2)");
    By calculateNewDate = By.id("subbut");

    public AddWorkdaysPage(WebDriver driver) {
        this.driver = driver;
        this.utils = new Utils(this.driver, Variables.timeAndDateBaseUrl);
    }

    public void SelectDate() {
        utils.ClickElement(workdaysAdd);
        utils.SendTextToElement(startDateCalendarDay, "27");
        utils.SendTextToElement(startDateCalendarMonth, "09");
        utils.SendTextToElement(startDateCalendarDays, "2023");
    }

    public void SetDaysToAdd() {
        utils.SendTextToElement(daysToAdd, "100");
    }

    public void ApplyFilter() {
        utils.ClickElement(datesInResultFilter);
        utils.ClickElement(datesInResultFilterValue);
    }

    public void Calculate() {
        utils.ClickElement(calculateNewDate);
    }
}
