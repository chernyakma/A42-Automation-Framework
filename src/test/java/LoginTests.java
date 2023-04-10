import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class LoginTests extends BaseTest {
    LoginPage loginPage=new LoginPage();
    HomePage homePage = new HomePage();




    @Test
    public void successfulLoginTest() {

        PageFactory.initElements(getDriver(),loginPage);
        loginPage.enterEmail("demo@class.com").enterPassword("te$t$tudent").clickLoginButton();
        //WebElement avatar = basePage.waitUntilVisible(By.cssSelector("a .avatar"));
        Assert.assertTrue(homePage.getAvatar().isDisplayed());
    }




    @Test
    public void wrongPasswordLoginTest() {
        PageFactory.initElements(getDriver(),loginPage);
        loginPage.login("demo@class.com", "te$t$tuden");
       // WebElement submitLoginButton = basePage.waitUntilVisible(By.cssSelector("button[type='submit']"));
        Assert.assertTrue(loginPage.getSubmitLoginButton().isDisplayed());
    }

    @Test
    public void emptyPasswordLoginTest() {
        PageFactory.initElements(getDriver(),loginPage);
        loginPage.login("demo@class.com", "");
       // WebElement submitLoginButton = basePage.waitUntilVisible(By.cssSelector("button[type='submit']"));
        Assert.assertTrue(loginPage.getSubmitLoginButton().isDisplayed());
    }
    @Test
    public void registrationNovigation() {
      //  WebElement RegistrationButton = basePage.waitUntilClickable(By.cssSelector("[id='hel']"));
      //  RegistrationButton.click();
        loginPage.clickRegistrationButton();
    //    WebElement RegisterButton = basePage.waitUntilVisible(By.cssSelector("#button"));
        Assert.assertTrue(loginPage.getRegisterButton().isDisplayed());
    }
}