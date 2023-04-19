package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.time.Duration;

public class LoginStepDefinition extends BasePage {
    WebDriver driver;
    public String url = "https://bbb.testpro.io/";
    LoginPage loginPage = new LoginPage();
    HomePage homePage=new HomePage();

    /* @Given("^I open Login Page$")
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
          options.addArguments("--disable-notifications");
          options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        driver.manage().window().maximize();
        driver.get(url);

    }*/
   @Before
   public void openBrowser() throws MalformedURLException {
     //  String url = "https://bbb.testpro.io/";
       initBrowser(url);
   }


    @After
    public void exitBrowser() {
        closeBrowser();
    }


    @When("I enter email {string}")
    public void EnterEmail(String email) {
       loginPage.enterEmail(email);
    }

    @And("I enter password {string}")
    public void EnterPassword(String password) {
       loginPage.enterPassword(password);
    }

    @And("I submit")
    public void Submit() {
       loginPage.clickLoginButton();
        
    }

    @Then("I am logged in")
    public void iAmLoggedIn() {
        Assert.assertTrue(homePage.getAvatar().isDisplayed());
    }
}
