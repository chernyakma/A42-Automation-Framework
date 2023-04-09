import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.loginPage;

public class LoginTests extends BaseTest {
    loginPage loginPage=new loginPage();
    HomePage homePage = new HomePage();
    @Test
    public void successfulLoginTest() {
        loginPage.login("demo@class.com", "te$t$tudent");
        WebElement avatar = basePage.waitUntilVisible(By.cssSelector("a .avatar"));
        Assert.assertTrue(avatar.isDisplayed());
    }
    @Test
    public void wrongPasswordLoginTest() {
        loginPage.login("demo@class.com", "te$t$tuden");
        WebElement submitLoginButton = basePage.waitUntilVisible(By.cssSelector("button[type='submit']"));
        Assert.assertTrue(submitLoginButton.isDisplayed());
    }

    @Test
    public void emptyPasswordLoginTest() {
        loginPage.login("demo@class.com", "");
        WebElement submitLoginButton = basePage.waitUntilVisible(By.cssSelector("button[type='submit']"));
        Assert.assertTrue(submitLoginButton.isDisplayed());
    }
    @Test
    public void registrationNovigation() {
        WebElement RegistrationButton = basePage.waitUntilClickable(By.cssSelector("[id='hel']"));
        RegistrationButton.click();
        WebElement RegisterButton = basePage.waitUntilVisible(By.cssSelector("#button"));
        Assert.assertTrue(RegisterButton.isDisplayed());
    }
}