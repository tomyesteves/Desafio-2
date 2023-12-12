package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import configurations.Configurations;
import pages.ColosseumHomePage;
import pages.SpaceAndBeyondHomePage;

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
    public void testSurfTheNav() {
        String expectedTitle = "Contactos - El Coliseo";
        ColosseumHomePage colosseumHomePage = new ColosseumHomePage(driver);
        colosseumHomePage.RejectCookies();
        colosseumHomePage.SurfTheNav();
        assertTrue(driver.getTitle().equals(expectedTitle));
    }

    @Test
    public void testSpaceAndBeyond() throws InterruptedException {
        SpaceAndBeyondHomePage spaceAndBeyondHomePage = new SpaceAndBeyondHomePage(driver);
        spaceAndBeyondHomePage.Login("tomy", "adminadmin");
        Thread.sleep(2000);
        spaceAndBeyondHomePage.SelectJourney();
        spaceAndBeyondHomePage.Checkout();
    }
}
