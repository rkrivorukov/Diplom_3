package stellarBurgerTests;

import io.qameta.allure.Description;
import org.junit.Before;
import page.RegistrationPage;
import page.LoginPage;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.junit.After;
import page.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Step;
import java.util.concurrent.TimeUnit;

public class PasswordLengthTests {
    private WebDriver driver;
    private final String shortPassword = "123";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    @Description("Error of short password is visible at Chrome")
    public void testVisibilityErrorOfShortPasswordChrome(){
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickEnterToAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.clickRegistrationButton();
        RegistrationPage objRegistrationPage = new RegistrationPage(driver);
        assertNotNull(objRegistrationPage.waitPasswordErrorVisible(shortPassword));
    }

    @Test
    @Description("Error of short password is visible at Yandex")
    public void testVisibilityErrorOfShortPasswordYandex(){
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickEnterToAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.clickRegistrationButton();
        RegistrationPage objRegistrationPage = new RegistrationPage(driver);
        assertNotNull(objRegistrationPage.waitPasswordErrorVisible(shortPassword));
    }

    @After
    public void logOut(){
        driver.quit();
    }
}
