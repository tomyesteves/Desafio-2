package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import configurations.Configurations;
import configurations.Variables;
import pages.HomePage;

public class Tests extends Configurations {
    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void setUp() {
        Configurations.init();
    }

    @Test
    public void testSearch() {
        String textToSearch = "Ingeniería";
        String expectedTextWhenSearch = "Tecnicatura en Desarrollador de Software";

        Configurations.driver.get(Variables.ucuBaseUrl);
        homePage = new HomePage(Configurations.driver);
        homePage.search(textToSearch);
        assertTrue(Configurations.driver.getPageSource().contains(expectedTextWhenSearch));
    }

    @After
    public void tearDown() {
        Configurations.closeBrowser();
    }
}
