package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(css = "[type='password']" )
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailInput;

    private By submitBtn = By.cssSelector("button[type='submit']");

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    protected void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(By.cssSelector("[type='password']"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    protected void enterEmail(String email) {
        WebElement emailInput = driver.findElement(By.xpath("//input[@type='email']"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    protected void clickLoginButton() {
        WebElement submitLoginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        submitLoginButton.click();
    }

}
