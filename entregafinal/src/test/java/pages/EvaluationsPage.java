package pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import configurations.Variables;
import sharedComponents.Navbar;

public class EvaluationsPage {
    private WebDriver driver;
    private Utils utils;

    private By createEvaluationButton = By.xpath("/html/body/app-root/app-evaluators-layout/div/app-evaluations-list-page/div/div/div[1]/div/div/app-evaluation-create-card/div/a");
    private By evaluationInstitution = By.id("institution");
    private By evaluationDescription = By.id("description");
    private By evalautionDate = By.cssSelector("body > app-root > app-evaluators-layout > div > app-evaluation-create-page > app-evaluation-form > div > div > form > div:nth-child(3) > div > input");
    private By evaluationMotive = By.id("reason");
    private By evaluationGradesDropdown = By.cssSelector("body > app-root > app-evaluators-layout > div > app-evaluation-create-page > app-evaluation-form > div > div > form > div:nth-child(5) > div > button");
    private By evaluationGradesDropdownOption1 = By.id("1");
    private By evaluationGradesDropdownOption2 = By.id("2");
    private By evaluationGradesDropdownOption3 = By.id("3");
    private By evaluationGradesDropdownOption4 = By.id("4");
    private By evaluationTestsDropdown = By.cssSelector("body > app-root > app-evaluators-layout > div > app-evaluation-create-page > app-evaluation-form > div > div > form > div:nth-child(6) > div > button");
    private By evaluationTestsDropdownOption1 = By.cssSelector(".show #\\31");
    private By evaluationTestsDropdownOption2 = By.cssSelector(".show #\\32");
    private By evaluationTestsDropdownOption3 = By.cssSelector(".show #\\33");
    private By evaluationSaveButton = By.cssSelector("body > app-root > app-evaluators-layout > div > app-evaluation-create-page > app-evaluation-form > div > div > form > div:nth-child(7) > div > button");


    public EvaluationsPage(WebDriver driver) {
        this.driver = driver;
        this.utils = new Utils(driver, Variables.softestBaseUrl);
    }

    public void GoToEvaluationsPage() {
        utils.WaitForElement(Navbar.navbarEvaluations);
        utils.ClickElement(Navbar.navbarEvaluations);
    }

    public void ClickCreateButton() {
        utils.WaitForElement(createEvaluationButton);
        utils.ClickElement(createEvaluationButton);
    }

    public void FillForm(String institution, String description, String motive) {
        utils.WaitForElement(evaluationInstitution);
        utils.SendTextToElement(evaluationInstitution, institution);
        utils.WaitForElement(evaluationDescription);
        utils.SendTextToElement(evaluationDescription, description);
        utils.WaitForElement(evaluationMotive);
        utils.SendTextToElement(evaluationMotive, motive);
        utils.WaitForElement(evaluationGradesDropdown);
        utils.ClickElement(evaluationGradesDropdown);
        utils.WaitForElement(evaluationGradesDropdownOption1);
        utils.ClickElement(evaluationGradesDropdownOption1);
        utils.WaitForElement(evaluationTestsDropdown);
        utils.ClickElement(evaluationTestsDropdown);
        utils.WaitForElement(evaluationTestsDropdownOption1);
        utils.ClickElement(evaluationTestsDropdownOption1);
    }

    public void SaveEvaluation() {
        utils.WaitForElement(evaluationSaveButton);
        utils.ClickElement(evaluationSaveButton);
    }
}
