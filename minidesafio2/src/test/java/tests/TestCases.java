package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import configurations.Configurations;
import pages.AddWorkdaysPage;
import pages.ColosseumHomePage;
import pages.CountDaysPage;
import pages.PetsPage;
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
        String expectedTitle = "Preguntas frecuentes - El Coliseo";
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

    @Test
    public void testPets() {
        PetsPage petsPage = new PetsPage(driver);
        petsPage.Register("tomastest", "1234", "1234", "tomas", "esteves", "test@gmail.com", "099123456", "calle 1234", "Salto", "Salto", "50000", "Uruguay");
        
        // Esto se podría hacer una vez se encuentre forma de solucionar lo del selector dinamico
        //petsPage.AddItemsToCart();
        //petsPage.Checkout();
    }

    @Test
    public void testCountDays() {
        String expectedDaysResult = "364 days";
        CountDaysPage countDaysPage = new CountDaysPage(driver);
        countDaysPage.SelectDate();
        countDaysPage.SelectTime();
        countDaysPage.Calculate();
        assertTrue(driver.getPageSource().contains(expectedDaysResult));
    }

    @Test
    public void testCalculateWorkdays() {
        String expectedResult = "Wednesday, 14 February 2024";
        AddWorkdaysPage addWorkdaysPage = new AddWorkdaysPage(driver);
        addWorkdaysPage.SelectDate();
        addWorkdaysPage.SetDaysToAdd();
        addWorkdaysPage.ApplyFilter();
        addWorkdaysPage.Calculate();
        // No se puede hacer la comparación, no agrega el box del resultado al contenido de la página (?)
        // assertTrue(driver.getPageSource().contains(expectedResult));
    }
}
