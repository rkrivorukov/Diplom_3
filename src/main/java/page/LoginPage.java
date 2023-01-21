package page;
import io.qameta.allure.Step;
import org.openqa.selenium.*;

public class LoginPage {
    private WebDriver driver;
    private By registrationButton = By.xpath("//a[@class='Auth_link__1fOlj' and @href='/register']");
    private By recoverPasswordButton = By.xpath("//a[@class='Auth_link__1fOlj' and @href='/forgot-password']");
    private By emailField = By.xpath("//label[text()='Email']/following-sibling::input");
    private By passwordField = By.xpath("//input[@type='password']");
    private By loginButton = By.className("button_button__33qZ0");




    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    @Step
    public void clickRegistrationButton(){
        driver.findElement(registrationButton).click();
    }
    public void clickRecoverPasswordButton(){
        driver.findElement(recoverPasswordButton).click();
    }
    public void enterEmail(String email){

        driver.findElement(emailField).sendKeys(email);
    }
    public void enterPassword(String password){

        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    @Step
    public void login(String email, String password){
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }




}
