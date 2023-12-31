package selenium;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

public class GeneratedTestCases {
    // Generated by Selenium IDE
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testNavbar() {
        driver.get("https://www.il-colosseo.it/es/");
        driver.manage().window().setSize(new Dimension(1696, 1026));
        driver.findElement(By.linkText("Info Boletos")).click();
        driver.findElement(By.linkText("Los subterráneo")).click();
        driver.findElement(By.linkText("Los Foros")).click();
        driver.findElement(By.linkText("El Coliseo de noche")).click();
        driver.findElement(By.linkText("Visitas guiadas")).click();
        driver.findElement(By.linkText("Como llegar")).click();
        driver.findElement(By.linkText("Navidad 2023")).click();
        driver.findElement(By.linkText("Gratis")).click();
        driver.findElement(By.linkText("Exposiciones")).click();
        driver.findElement(By.linkText("Niños")).click();
        driver.findElement(By.linkText("Vaticano")).click();
        driver.findElement(By.linkText("FAQ")).click();
        driver.findElement(By.linkText("Contactos")).click();
    }

    @Test
    public void testSpaceAndBeyond() {
        driver.get("https://demo.testim.io/");
        driver.manage().window().setSize(new Dimension(1696, 1026));
        driver.findElement(By.cssSelector(".NavButton__nav-button___34wHC")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".NavButton__nav-button___34wHC"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".Login__field___2oefU:nth-child(1) > .theme__inputElement___27dyY")).click();
        driver.findElement(By.cssSelector(".Login__field___2oefU > .theme__filled___1UI7Z")).sendKeys("tomy");
        driver.findElement(By.cssSelector(".Login__field___2oefU:nth-child(2) > .theme__inputElement___27dyY")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".LoginButton__raised___1fUxJ"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".Login__field___2oefU:nth-child(2) > .theme__inputElement___27dyY"))
                .sendKeys("adminadmin");
        driver.findElement(By.cssSelector(".LoginButton__raised___1fUxJ")).click();
        {
            WebElement element = driver.findElement(
                    By.cssSelector(".Hero__date-picker-box___RaqVV:nth-child(1) .theme__inputElement___27dyY"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".theme__backdrop___WbaQn"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector(".theme__day___3cb3g:nth-child(28) > span")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".theme__button___3HGWm:nth-child(2)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".theme__button___3HGWm:nth-child(2)")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver
                    .findElement(By.cssSelector(".Box__box___2XzJ2:nth-child(2) .theme__inputElement___27dyY"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".theme__header___1DCA-"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector(".theme__day___3cb3g:nth-child(17) > span")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".theme__button___3HGWm:nth-child(2)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".theme__button___3HGWm:nth-child(2)")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver
                    .findElement(By.cssSelector(".theme__active___31xyK .theme__inputElement___27dyY"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".theme__active___31xyK li:nth-child(2)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".theme__active___31xyK")).click();
        driver.findElement(By.cssSelector(".theme__active___31xyK li:nth-child(4)")).click();
        {
            WebElement element = driver
                    .findElement(By.cssSelector(".theme__active___31xyK .theme__inputElement___27dyY"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".theme__active___31xyK li:nth-child(2)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".theme__active___31xyK")).click();
        driver.findElement(By.cssSelector(".theme__active___31xyK li:nth-child(4)")).click();
        driver.findElement(By.cssSelector(".Hero__cta-button___9VskW")).click();
        driver.findElement(By.cssSelector(".theme__card___2nWQb:nth-child(6) .theme__button___1iKuo")).click();
        driver.findElement(By.cssSelector(".CustomerInfo__input___eFffe:nth-child(1) > .theme__inputElement___27dyY"))
                .click();
        driver.findElement(By.cssSelector(".CustomerInfo__input___eFffe > .theme__filled___1UI7Z")).sendKeys("tomas");
        driver.findElement(By.cssSelector(".CustomerInfo__input___eFffe:nth-child(2) > .theme__inputElement___27dyY"))
                .sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector(".theme__input___qUQeP:nth-child(3) > .theme__inputElement___27dyY"))
                .sendKeys("123-12-1234");
        driver.findElement(By.cssSelector(".theme__input___qUQeP:nth-child(4) > .theme__inputElement___27dyY"))
                .sendKeys("12345");
        driver.findElement(By.name("promo")).click();
        driver.findElement(By.name("promo")).sendKeys("123");
        driver.findElement(By.cssSelector(".theme__check___2B20W")).click();
        driver.findElement(By.cssSelector(".flexboxgrid__row___1y_mg:nth-child(8) > .flexboxgrid__col-xs___1ROHR"))
                .click();
    }

    public void testPets() {
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        driver.manage().window().setSize(new Dimension(1696, 1026));
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.linkText("Register Now!")).click();
        driver.findElement(By.name("password")).click();
        driver.findElement(By.cssSelector("#Catalog > form")).click();
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("repeatedPassword")).sendKeys("admin");
        driver.findElement(By.name("account.address1")).sendKeys("calle 123");
        driver.findElement(By.name("newAccount")).click();
        driver.findElement(By.id("stripes--1140036230")).click();
        driver.findElement(By.id("stripes--1140036230")).sendKeys("tomasesteves");
        driver.findElement(By.name("newAccount")).click();
        driver.findElement(By.cssSelector("a:nth-child(9) > img")).click();
        driver.findElement(By.linkText("AV-CB-01")).click();
        driver.findElement(By.linkText("Add to Cart")).click();
        driver.findElement(By.linkText("Proceed to Checkout")).click();
        driver.findElement(By.name("newOrder")).click();
        driver.findElement(By.linkText("Confirm")).click();
        driver.findElement(By.linkText("Return to Main Menu")).click();
    }

    @Test
    public void testCountDays() {
        driver.get("https://www.timeanddate.com/date/workdays.html");
        driver.manage().window().setSize(new Dimension(825, 1010));
        driver.findElement(By.id("datetabs_duration")).click();
        driver.findElement(By.id("d1")).click();
        driver.findElement(By.id("d1")).sendKeys("01");
        driver.findElement(By.id("m1")).click();
        driver.findElement(By.id("m1")).sendKeys("01");
        driver.findElement(By.id("y1")).click();
        driver.findElement(By.id("y1")).sendKeys("2023");
        {
            WebElement element = driver.findElement(By.linkText("2019"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.id("d2")).click();
        driver.findElement(By.id("d2")).sendKeys("31");
        driver.findElement(By.id("m2")).click();
        driver.findElement(By.id("m2")).sendKeys("12");
        driver.findElement(By.id("y2")).click();
        driver.findElement(By.id("y2")).sendKeys("2023");
        driver.findElement(By.id("ti")).click();
        driver.findElement(By.id("linktimeduration")).click();
        driver.findElement(By.linkText("Start of Day")).click();
        driver.findElement(By.id("h1")).sendKeys("0");
        driver.findElement(By.id("i1")).sendKeys("0");
        driver.findElement(By.id("s1")).sendKeys("0");
        driver.findElement(By.cssSelector(".five:nth-child(3) > .mt5:nth-child(2) > .bigger:nth-child(1)")).click();
        driver.findElement(By.id("h2")).sendKeys("10");
        driver.findElement(By.id("i2")).sendKeys("10");
        driver.findElement(By.id("s2")).sendKeys("56");
        driver.findElement(By.id("subbut2")).click();
    }

    @Test
    public void testAddDays() {
        driver.get("https://www.timeanddate.com/date/workdays.html");
        driver.manage().window().setSize(new Dimension(825, 1010));
        driver.findElement(By.id("datetabs_duration")).click();
        driver.findElement(By.id("d1")).click();
        driver.findElement(By.id("d1")).sendKeys("01");
        driver.findElement(By.id("m1")).click();
        driver.findElement(By.id("m1")).sendKeys("01");
        driver.findElement(By.id("y1")).click();
        driver.findElement(By.id("y1")).sendKeys("2023");
        {
            WebElement element = driver.findElement(By.linkText("2019"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.id("d2")).click();
        driver.findElement(By.id("d2")).sendKeys("31");
        driver.findElement(By.id("m2")).click();
        driver.findElement(By.id("m2")).sendKeys("12");
        driver.findElement(By.id("y2")).click();
        driver.findElement(By.id("y2")).sendKeys("2023");
        driver.findElement(By.id("ti")).click();
        driver.findElement(By.id("linktimeduration")).click();
        driver.findElement(By.linkText("Start of Day")).click();
        driver.findElement(By.id("h1")).sendKeys("0");
        driver.findElement(By.id("i1")).sendKeys("0");
        driver.findElement(By.id("s1")).sendKeys("0");
        driver.findElement(By.cssSelector(".five:nth-child(3) > .mt5:nth-child(2) > .bigger:nth-child(1)")).click();
        driver.findElement(By.id("h2")).sendKeys("10");
        driver.findElement(By.id("i2")).sendKeys("10");
        driver.findElement(By.id("s2")).sendKeys("56");
        driver.findElement(By.id("subbut2")).click();
        driver.findElement(By.cssSelector(".btn-datepicker")).click();
        driver.findElement(By.linkText("enero")).click();
        driver.findElement(By.linkText("jun")).click();
        driver.findElement(By.cssSelector(".btn-datepicker")).click();
        driver.findElement(By.linkText("enero")).click();
        driver.findElement(By.linkText("sep")).click();
        driver.findElement(By.linkText("27")).click();
        driver.findElement(By.id("y1")).sendKeys("2023");
        driver.findElement(By.id("m1")).sendKeys("9");
        driver.findElement(By.id("d1")).sendKeys("27");
        driver.findElement(By.id("ad")).click();
        driver.findElement(By.id("ad")).sendKeys("100");
        driver.findElement(By.id("ach")).click();
        {
            WebElement dropdown = driver.findElement(By.id("ach"));
            dropdown.findElement(By.xpath("//option[. = 'Weekends']")).click();
        }
        driver.findElement(By.id("subbut")).click();
    }
}
