package stellarBurgerTests;

import io.qameta.allure.Description;
import page.RegistrationPage;
import page.LoginPage;
import page.PersonalAccountPage;
import static org.junit.Assert.*;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.junit.After;
import page.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Step;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.concurrent.TimeUnit;

public class RegistrationTests {
    private WebDriver driver;
    private String name;
    private String email;
    private final String password = "autotest12345";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Before
    @Step("Create random user data")
    public void createRegistrationData(){
        name = RandomStringUtils.randomAlphabetic(8);
        email = name + "@gmail.com";
    }


    @Test
    @Description("Registration in Chrome")
    public void testRegistrationChrome() throws InterruptedException {

        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickEnterToAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.clickRegistrationButton();
        RegistrationPage objRegistrationPage = new RegistrationPage(driver);
        objRegistrationPage.registration(name, email, password);
        objLoginPage.login(email, password);
        objMainPage.clickPersonalAccountButton();
        PersonalAccountPage objPersonalAccountPage = new PersonalAccountPage(driver);
        String accountName = objPersonalAccountPage.getNameFieldValue();
        String accountEmail = objPersonalAccountPage.getEmailFieldValue();
        assertEquals(name, accountName);
        assertEquals(email.toLowerCase(), accountEmail);
        objPersonalAccountPage.clickLogoutButton();
    }

    @Test
    @Description("Registration in Yandex")
    public void testRegistrationYandex() throws InterruptedException {
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickEnterToAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.clickRegistrationButton();
        RegistrationPage objRegistrationPage = new RegistrationPage(driver);
        objRegistrationPage.registration(name, email, password);
        objLoginPage.login(email, password);
        objMainPage.clickPersonalAccountButton();
        PersonalAccountPage objPersonalAccountPage = new PersonalAccountPage(driver);
        String accountName = objPersonalAccountPage.getNameFieldValue();
        String accountEmail = objPersonalAccountPage.getEmailFieldValue();
        assertEquals(name, accountName);
        assertEquals(email.toLowerCase(), accountEmail);
        objPersonalAccountPage.clickLogoutButton();
    }

    @After
    @Step("Quit browser")
    public void logOut(){
        driver.quit();
    }
}
