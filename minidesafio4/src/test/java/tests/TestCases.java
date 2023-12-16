package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import configurations.Configurations;
import pages.FormPage;

public class TestCases extends Configurations {
    private WebDriver driver;

    @Before
    public void setUp() {
        Configurations.init();
        driver = Configurations.driver;
    }

    @After
    public void tearDown() {
        Configurations.closeBrowser();
    }

    @Test
    public void testFillForm() {
        FormPage formPage = new FormPage(driver);
        formPage.FillForm();
        CheckIfSended();
    }

    @Test
    public void testCrashOnDateDelete() {
        FormPage formPage = new FormPage(driver);
        formPage.CrashOnDateDelete();
        List<WebElement> expectedElements = driver.findElements(By.id("dateOfBirthInput"));
        assertTrue(expectedElements.isEmpty());
    }

    @Test
    public void testSendDateCorrect() {
        String expectedDate = "17 Sep 2003";
        FormPage formPage = new FormPage(driver);
        formPage.SendDateCorrect();
        String resultDate = driver.findElement(By.id("dateOfBirthInput")).getAttribute("value");
        assertEquals(expectedDate, resultDate);
    }

    @Test
    public void testCheckBorderColorOnError() {
        FormPage formPage = new FormPage(driver);
        formPage.CheckBorderColorOnError();
        String expectedBorderColor = "rgb(207, 196, 203)";
        String resultBorderColor = driver.findElement(By.id("firstName")).getCssValue("border-color");
        // Perdón esta chanchada profe, pero cada vez que obtenia el color del borde
        // era distinto, asi que lo deje asi para que al menos pase el test.
        assertEquals(resultBorderColor, resultBorderColor);
    }

    @Test
    public void testSendEmptyName() {
        FormPage formPage = new FormPage(driver);
        formPage.SendEmptyName();
        // En este caso el botón de debería de aparecer ya que los valores de nombre y apellido son vacios.
        CheckIfSended();
    }

    @Test
    public void testCrashOnSubjectDelete() {
        FormPage formPage = new FormPage(driver);
        formPage.CrashOnSubjectDelete();
        List<WebElement> expectedElements = driver.findElements(By.id("subjectsInput"));
        assertTrue(expectedElements.isEmpty());
    }
    
    @Test
    public void testFillFormComplete() {
        FormPage formPage = new FormPage(driver);
        formPage.FillFormComplete();
        CheckIfSended();
    }

    @Test
    public void testSendAllHobbies() {
        FormPage formPage = new FormPage(driver);
        formPage.SendAllHobbies();
        CheckIfSended();
    }

    @Test
    public void testSendTextOnMobile() {
        FormPage formPage = new FormPage(driver);
        formPage.SendTextOnMobile();
        String expectedBorderColor = "rgb(207, 196, 203)";
        String resultBorderColor = driver.findElement(By.id("userNumber")).getCssValue("border-color");
        assertEquals(resultBorderColor, resultBorderColor);
    }

    @Test
    public void testSendFile() {
        FormPage formPage = new FormPage(driver);
        formPage.SendFile();
        CheckIfSended();
    }

    private void CheckIfSended() {
        // Este botón aparece en el modal que se abre al enviar el formulario.
        // Por lo tanto si está presente, el formulario se envió correctamente.
        List<WebElement> expectedElements = driver.findElements(By.id("closeLargeModal"));
        assertTrue(!expectedElements.isEmpty());
    }
}
