package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super();
    }

    public static LoginPage loginPage(){

        return new LoginPage(driver);
    }
    //@FindBy(css = "[type='password']" )
  //  private WebElement passwordInput;
    private By passwordField= By.cssSelector("[type='password']");
   // @FindBy(xpath = "//input[@type='email']")
   // private WebElement emailInput;
   private By emailField = By.xpath( "//input[@type='email']");
    private By submitBtn = By.cssSelector("button[type='submit']");
    private By registrationButton = By.cssSelector("[id='hel']");
    private By registerButton = By.cssSelector("#button");
  //  WebElement RegisterButton = basePage.waitUntilVisible(By.cssSelector("#button"));

 //   WebElement RegistrationButton = basePage.waitUntilClickable(By.cssSelector("[id='hel']"));
     //   RegistrationButton.click();
    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public  LoginPage enterPassword(String password) {
        WebElement passwordInput = getDriver().findElement(passwordField);
      //  WebElement passwordInput = waitUntilVisible(passwordField);
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);
        return this;
    }

    public  LoginPage enterEmail(String email) {
        WebElement emailInput = getDriver().findElement(emailField);
      //  WebElement emailInput = waitUntilVisible(emailField);
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);
        return this;
    }

    public  LoginPage clickLoginButton() {
        WebElement submitLoginButton = waitUntilVisible(submitBtn);
        submitLoginButton.click();
         return this;
    }
    public WebElement getSubmitLoginButton(){
        return waitUntilVisible(submitBtn);}
    public WebElement getRegisterButton(){
        return waitUntilVisible(registerButton);
    }

    public void clickRegistrationButton (){
        WebElement registrationButtonElement= waitUntilClickable(registrationButton);
        registrationButtonElement.click();

    }
}
