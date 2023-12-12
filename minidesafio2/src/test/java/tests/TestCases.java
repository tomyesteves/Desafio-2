package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import configurations.Configurations;
import configurations.Variables;
import pages.ColosseumHomePage;

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
    public void testSurfTheNav() {
        String expectedTitle = "Contactos - El Coliseo";
        driver.get(Variables.theColosseumBaseUrl);
        ColosseumHomePage colosseumHomePage = new ColosseumHomePage(driver);
        colosseumHomePage.RejectCookies();
        colosseumHomePage.SurfTheNav();
        assertTrue(driver.getTitle().equals(expectedTitle));
    }

    private void SwitchTab(int tab) throws InterruptedException {
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        // Redirect to WebAsignatura tab.
        driver.switchTo().window(tabs.get(tab));
    }
}
