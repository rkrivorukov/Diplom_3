package page;
import io.qameta.allure.Step;
import org.openqa.selenium.*;

public class RecoverPasswordPage {
    private WebDriver driver;
    private By loginButton = By.className("Auth_link__1fOlj");
    public RecoverPasswordPage(WebDriver driver){
        this.driver = driver;
    }
    @Step
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    @Step
    public void scrollToLoginButton(){
        WebElement element = driver.findElement(loginButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
}
