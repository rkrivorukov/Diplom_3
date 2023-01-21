package stellarBurgerTests;

import io.qameta.allure.Description;
import org.junit.Before;
import page.LoginPage;
import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import page.PersonalAccountPage;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.junit.After;
import page.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Step;

public class PersonalAccountTests {
    private WebDriver driver;
    private final String email = "romankrivorukov@yandex.ru";
    private final String password = "roman1234";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    @Description("Check click on the Personal Account button")
    public void testClickPersonalAccountButtonChrome(){
        driver.get("https://stellarburgers.nomoreparties.site/login");
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        assertEquals("https://stellarburgers.nomoreparties.site/account", driver.getCurrentUrl());
    }

    @Test
    @Description("Check click on the Constructor button")
    public void testClickConstructorButtonChrome(){
        driver.get("https://stellarburgers.nomoreparties.site/login");
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        PersonalAccountPage objPersonalAccountPage = new PersonalAccountPage(driver);
        objPersonalAccountPage.clickConstructorButton();
        assertEquals("https://stellarburgers.nomoreparties.site/", driver.getCurrentUrl());
    }

    @Test
    @Description("Check click on the Stellar burger logo")
    public void testClickStellarBurgerLogoChrome(){
        driver.get("https://stellarburgers.nomoreparties.site/login");
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        PersonalAccountPage objPersonalAccountPage = new PersonalAccountPage(driver);
        objPersonalAccountPage.clickStellarBurgersLogo();
        assertEquals("https://stellarburgers.nomoreparties.site/", driver.getCurrentUrl());
    }

    @Test
    @Description("Check click on the Personal Account button")
    public void testClickPersonalAccountButtonYandex(){
        driver.get("https://stellarburgers.nomoreparties.site/login");
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        assertEquals("https://stellarburgers.nomoreparties.site/account", driver.getCurrentUrl());
    }

    @Test
    @Description("Check click on the Constructor button")
    public void testClickConstructorButtonYandex(){
        driver.get("https://stellarburgers.nomoreparties.site/login");
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        PersonalAccountPage objPersonalAccountPage = new PersonalAccountPage(driver);
        objPersonalAccountPage.clickConstructorButton();
        assertEquals("https://stellarburgers.nomoreparties.site/", driver.getCurrentUrl());
    }

    @Test
    @Description("Check click on the Stellar burger logo")
    public void testClickStellarBurgerLogoYandex(){
        driver.get("https://stellarburgers.nomoreparties.site/login");
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        PersonalAccountPage objPersonalAccountPage = new PersonalAccountPage(driver);
        objPersonalAccountPage.clickStellarBurgersLogo();
        assertEquals("https://stellarburgers.nomoreparties.site/", driver.getCurrentUrl());
    }

    @Test
    @Description("Check click on the Logout button")
    public void testClickLogoutButtonChrome() throws InterruptedException {
        driver.get("https://stellarburgers.nomoreparties.site/login");
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        PersonalAccountPage objPersonalAccountPage = new PersonalAccountPage(driver);
        objPersonalAccountPage.clickLogoutButton();
        assertEquals("https://stellarburgers.nomoreparties.site/login", driver.getCurrentUrl());
    }

    @Test
    @Description("Check click on the Logout button")
    public void testClickLogoutButtonYandex() throws InterruptedException {
        driver.get("https://stellarburgers.nomoreparties.site/login");
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        PersonalAccountPage objPersonalAccountPage = new PersonalAccountPage(driver);
        objPersonalAccountPage.clickLogoutButton();
        assertEquals("https://stellarburgers.nomoreparties.site/login", driver.getCurrentUrl());
    }

    @After
    public void logOut(){
        driver.quit();
    }
}
