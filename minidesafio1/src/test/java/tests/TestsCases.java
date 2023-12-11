package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import configurations.Configurations;
import configurations.Variables;
import pages.InternationalPage;
import pages.SaltoCampusPage;
import pages.HomePage;

public class TestsCases extends Configurations {
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
    public void testSearch() {
        String textToSearch = "Ingeniería";
        String expectedTextWhenSearch = "Tecnicatura en Desarrollador de Software";

        driver.get(Variables.ucuBaseUrl);
        HomePage homePage = new HomePage(driver);
        homePage.Search(textToSearch);
        assertTrue(driver.getPageSource().contains(expectedTextWhenSearch));
    }

    @Test
    public void testInternship() throws InterruptedException {
        String expectedUrl = "https://www.fiuc.org/index_es.html";
        driver.get(Variables.ucuBaseUrl);
        InternationalPage internationalPage = new InternationalPage(driver);
        internationalPage.VisitExternalPage();

        // Wait for the external page to open.
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        // Redirect to FIUC tab.
        driver.switchTo().window(tabs.get(1));

        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.equals(expectedUrl));
    }

    @Test
    public void testCampusSalto() throws InterruptedException {
        String expectedCourse = "Desafío II";
        SaltoCampusPage saltoCampusPage = new SaltoCampusPage(driver);
        saltoCampusPage.GoToCampusSalto();

        // Wait for the Campus Salto page to open.
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        // Redirect to Campus Salto tab.
        driver.switchTo().window(tabs.get(1));

        saltoCampusPage.SeeSoftwareDeveloperCourses();
        assertTrue(driver.getPageSource().contains(expectedCourse));
    }
}
