package stellarBurgerTests;

import io.qameta.allure.Description;
import org.junit.Before;
import page.LoginPage;
import page.RecoverPasswordPage;
import page.RegistrationPage;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.junit.After;
import page.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Step;
import java.util.concurrent.TimeUnit;

public class LoginTests {
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
    @Description("Login via Personal Account button")
    public void testLoginPersonalAccountButtonChrome(){
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Description("Login via Enter account button")
    public void testLoginEnterAccountButtonChrome(){
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickEnterToAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Description("Login via registration form")
    public void testLoginRegistrationFormChrome(){
        driver.get("https://stellarburgers.nomoreparties.site/register");
        RegistrationPage objRegistrationPage = new RegistrationPage(driver);
        objRegistrationPage.scrollToLoginButton();
        objRegistrationPage.clickLoginButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Description("Login via recover password page")
    public void testLoginRecoverPasswordPageChrome(){
        driver.get("https://stellarburgers.nomoreparties.site/forgot-password");
        RecoverPasswordPage objRecoverPasswordPage = new RecoverPasswordPage(driver);
        objRecoverPasswordPage.scrollToLoginButton();
        objRecoverPasswordPage.clickLoginButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Description("Login via Personal Account button")
    public void testLoginPersonalAccountButtonYandex(){
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickPersonalAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Description("Login via Enter account button")
    public void testLoginEnterAccountButtonYandex(){
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickEnterToAccountButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Description("Login via registration form")
    public void testLoginRegistrationFormYandex(){
        driver.get("https://stellarburgers.nomoreparties.site/register");
        RegistrationPage objRegistrationPage = new RegistrationPage(driver);
        objRegistrationPage.scrollToLoginButton();
        objRegistrationPage.clickLoginButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @Test
    @Description("Login via recover password page")
    public void testLoginRecoverPasswordPageYandex(){
        driver.get("https://stellarburgers.nomoreparties.site/forgot-password");
        RecoverPasswordPage objRecoverPasswordPage = new RecoverPasswordPage(driver);
        objRecoverPasswordPage.scrollToLoginButton();
        objRecoverPasswordPage.clickLoginButton();
        LoginPage objLoginPage = new LoginPage(driver);
        objLoginPage.login(email, password);
        MainPage objMainPage = new MainPage(driver);
        assertNotNull(objMainPage.waitCreateOrderButtonVisible());
    }

    @After
    public void logOut(){
        driver.quit();
    }
}
