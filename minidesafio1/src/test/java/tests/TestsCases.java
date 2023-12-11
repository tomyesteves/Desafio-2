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
import pages.MinorsPage;
import pages.SaltoCampusPage;
import pages.WebAsignaturaPage;
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

        // Redirect to FIUC tab.
        SwitchTab(1);

        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.equals(expectedUrl));
    }

    @Test
    public void testCampusSalto() throws InterruptedException {
        String expectedCourse = "Desafío II";
        SaltoCampusPage saltoCampusPage = new SaltoCampusPage(driver);
        saltoCampusPage.GoToCampusSalto();

        // Redirect to Campus Salto tab.
        SwitchTab(1);

        saltoCampusPage.SeeSoftwareDeveloperCourses();
        Thread.sleep(1500);
        assertTrue(driver.getPageSource().contains(expectedCourse));
    }

    @Test
    public void testWebAsignatura() throws InterruptedException {
        String urlResource = "login/index.php";
        String expectedUrlIfFail = Variables.ucuWebAsignaturaUrl + urlResource;
        WebAsignaturaPage webAsignaturaPage = new WebAsignaturaPage(driver);
        webAsignaturaPage.GoToWebAsignatura();

        // Redirect to WebAsignatura tab.
        SwitchTab(1);

        String username = "username";
        String password = "password";
        webAsignaturaPage.FailLoginWebAsignatura(username, password);
        
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.equals(expectedUrlIfFail));
    }

    private void SwitchTab(int tab) throws InterruptedException {
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        // Redirect to WebAsignatura tab.
        driver.switchTo().window(tabs.get(tab));
    }

    @Test
    public void testMinors() throws InterruptedException {
        MinorsPage minorsPage = new MinorsPage(driver);

        minorsPage.SearchMinor();

        // Wait for the search to be done.
        Thread.sleep(4000);

        minorsPage.SelectMinor();
        minorsPage.FillForm("Tomás", "Esteves", "099123456", "email@", "Testeito");
    
        // Wait for the form to be submitted.
        Thread.sleep(3000);
        assertTrue(minorsPage.GetErrorMessage().equals("El valor de Email no tiene formato de mail."));
    }
}
