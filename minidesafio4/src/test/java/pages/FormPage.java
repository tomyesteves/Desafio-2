package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import configurations.Variables;

public class FormPage {
    private WebDriver driver;
    private pages.Utils utils;

    By formName = By.id("firstName");
    By formLastname = By.id("lastName");
    By formEmail = By.id("userEmail");
    By formMaleGender = By.id("gender-radio-1");
    By formFemaleGender = By.id("gender-radio-2");
    By formOtherGender = By.id("gender-radio-3");
    By formMobile = By.id("userNumber");
    By formDateOfBirth = By.id("dateOfBirthInput");
    By formSubjects = By.id("subjectsInput");
    By formHobbiesSports = By.id("hobbies-checkbox-1");
    By formHobbiesReading = By.id("hobbies-checkbox-2");
    By formHobbiesMusic = By.id("hobbies-checkbox-3");
    By formUploadPicture = By.id("uploadPicture");
    By formCurrentAddress = By.id("currentAddress");
    By formState = By.id("#state > div > div.css-1hwfws3");
    By formStateOption = By.cssSelector("#state > div > div.css-1hwfws3 > div.css-1uccc91-singleValue");
    By formStateCity = By.id("#stateCity-wrapper > div:nth-child(3)");
    By formStateCityOption = By.cssSelector("#city > div > div.css-1hwfws3 > div.css-1uccc91-singleValue");
    By formSubmit = By.id("submit");

    public FormPage(WebDriver driver) {
        this.driver = driver;
        this.utils = new Utils(this.driver, Variables.demoqaBaseUrl);
    }

    public void FillForm() {
        utils.SendTextToElement(formName, "Tomás");
        utils.SendTextToElement(formLastname, "Esteves");
        utils.SendTextToElement(formEmail, "abc@gmail.com");
        utils.ClickElementByActions(formMaleGender);
        utils.SendTextToElement(formMobile, "0099123456");
        utils.Set50Zoom();
        utils.ClickSubmit(formSubmit);
    }

    public void CrashOnDateDelete() {
        utils.ClearInputByKeys(formDateOfBirth, 11);
    }

    public void SendDateCorrect() {
        utils.ClearInputByKeys(formDateOfBirth, 10);
        utils.SendTextToElement(formDateOfBirth, "7 Sep 2003");
    }

    public void CheckBorderColorOnError() {
        utils.Set50Zoom();
        utils.ClickSubmit(formSubmit);
    }

    public void SendEmptyName() {
        utils.SendTextToElement(formName, " ");
        utils.SendTextToElement(formLastname, " ");
        utils.SendTextToElement(formEmail, "abc@gmail.com");
        utils.ClickElementByActions(formMaleGender);
        utils.SendTextToElement(formMobile, "0099123456");
        utils.Set50Zoom();
        utils.ClickSubmit(formSubmit);
    }

    public void CrashOnSubjectDelete() {
        utils.ClearInputByKeys(formSubjects, 1);
    }

    public void FillFormComplete() {
        utils.SendTextToElement(formName, "Tomás");
        utils.SendTextToElement(formLastname, "Esteves");
        utils.SendTextToElement(formEmail, "abc@gmail.com");
        utils.ClickElementByActions(formMaleGender);
        utils.SendTextToElement(formMobile, "0099123456");
        utils.Set50Zoom();
        utils.ClickElementByActions(formHobbiesSports);
        utils.SendTextToElement(formCurrentAddress, "Misiones 1");
        utils.ClickSubmit(formSubmit);
    }

    public void SendAllHobbies() {
        utils.SendTextToElement(formName, "Tomás");
        utils.SendTextToElement(formLastname, "Esteves");
        utils.SendTextToElement(formEmail, "abc@gmail.com");
        utils.ClickElementByActions(formMaleGender);
        utils.SendTextToElement(formMobile, "0099123456");
        utils.Set50Zoom();
        utils.ClickElementByActions(formHobbiesSports);
        utils.ClickElementByActions(formHobbiesMusic);
        utils.ClickElementByActions(formHobbiesReading);
        utils.SendTextToElement(formCurrentAddress, "Misiones 1");
        utils.ClickSubmit(formSubmit);
    }

    public void SendTextOnMobile() {
        utils.SendTextToElement(formName, "Tomás");
        utils.SendTextToElement(formLastname, "Esteves");
        utils.SendTextToElement(formEmail, "abc@gmail.com");
        utils.ClickElementByActions(formMaleGender);
        utils.SendTextToElement(formMobile, "abcdefghij");
        utils.Set50Zoom();
        utils.ClickSubmit(formSubmit);
    }

    public void SendFile() {
        utils.SendTextToElement(formName, "Tomás");
        utils.SendTextToElement(formLastname, "Esteves");
        utils.SendTextToElement(formEmail, "abc@gmail.com");
        utils.ClickElementByActions(formMaleGender);
        utils.SendTextToElement(formMobile, "0099123456");
        utils.Set50Zoom();
        utils.SendTextToElement(formUploadPicture, Variables.imageRoute);
        utils.ClickSubmit(formSubmit);
    }
}
