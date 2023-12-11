package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import configurations.Variables;

public class SaltoCampusPage {
    private WebDriver driver;

    By campusSelect = By.xpath("//*[@id=\"newLocation\"]");
    By campusSalto = By.cssSelector("#newLocation > option:nth-child(2)");
    By goToCampus = By.cssSelector("#contenedor_campus_salto > p > a:nth-child(8)");
    By seeCampusCareers = By.cssSelector("#faqs2 > div > div > div > h3 > a");
    By softwareDeveloperCareer = By.cssSelector("#carrera-72 > section > div > div > h2 > a");
    By softwareDeveloperCourses = By.cssSelector("#Obligatorios > span");

    public SaltoCampusPage(WebDriver driver) {
        this.driver = driver;
        this.driver.get(Variables.ucuBaseUrl);
    }

    public void GoToCampusSalto() {
        driver.findElement(campusSelect).click();
        driver.findElement(campusSalto).click();
        driver.findElement(goToCampus).click();

    }

    public void SeeSoftwareDeveloperCourses() {
        driver.findElement(seeCampusCareers).click();
        driver.findElement(softwareDeveloperCareer).click();
        driver.findElement(softwareDeveloperCourses).click();
    }
}
