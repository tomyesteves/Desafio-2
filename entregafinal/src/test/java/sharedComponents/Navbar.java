package sharedComponents;

import org.openqa.selenium.By;

public class Navbar {
    public static By navbarMain = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a");
    public static By navbarAboutUs = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a");
    public static By navbarEvaluations = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a");
    public static By navbarAdmin = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a");
    public static By navbarGrades = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a");
    public static By navbarTests = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a");
    public static By navbarLogin = By.xpath("//*[@id=\"navbarSupportedContent\"]/div/app-login-logout/button");
    public static By navbarLogout = By.xpath("//*[@id=\"navbarSupportedContent\"]/div/app-login-logout/button");
    public static By navbarUser = By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a");
}
