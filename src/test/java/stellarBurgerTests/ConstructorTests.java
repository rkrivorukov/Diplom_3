package stellarBurgerTests;

import static org.junit.Assert.*;

import io.qameta.allure.Description;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.junit.After;
import page.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Step;

import java.util.concurrent.TimeUnit;

public class ConstructorTests {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    @Description("Check click on the sauce tab")
    public void testClickSauceTabChrome() {
        driver.get("https://stellarburgers.nomoreparties.site");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickSaucesTab();
        assertTrue(objMainPage.getSauceTabClassValue().contains("current"));
    }

    @Test
    @Description("Check click on the ingredients tab")
    public void testClickIngredientsTabChrome() {
        driver.get("https://stellarburgers.nomoreparties.site");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickIngredientsTab();
        assertTrue(objMainPage.getIngredientsTabClassValue().contains("current"));
    }

    @Test
    @Description("Check click on the bun tab")
    public void testClickBunTabChrome() {
        driver.get("https://stellarburgers.nomoreparties.site");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickIngredientsTab();
        objMainPage.clickBunTab();
        assertTrue(objMainPage.getBunTabClassValue().contains("current"));
    }

    @Test
    @Description("Check click on the sauce tab")
    public void testClickSauceTabYandex() {
        driver.get("https://stellarburgers.nomoreparties.site");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickSaucesTab();
        assertTrue(objMainPage.getSauceTabClassValue().contains("current"));
    }

    @Test
    @Description("Check click on the ingredients tab")
    public void testClickIngredientsTabYandex() {
        driver.get("https://stellarburgers.nomoreparties.site");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickIngredientsTab();
        assertTrue(objMainPage.getIngredientsTabClassValue().contains("current"));
    }

    @Test
    @Description("Check click on the bun tab")
    public void testClickBunTabYandex() {
        driver.get("https://stellarburgers.nomoreparties.site");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickIngredientsTab();
        objMainPage.clickBunTab();
        assertTrue(objMainPage.getBunTabClassValue().contains("current"));
    }

    @After
    public void logOut(){
        driver.quit();
    }
}
