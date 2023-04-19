import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
import pages.BasePage;

import java.net.MalformedURLException;

public class BaseTest extends BasePage{
    protected final BasePage basePage = new BasePage();
    public String url = "https://bbb.testpro.io/";



  //  @BeforeSuite
 //   static void setupClass() {
  //      WebDriverManager.chromedriver().setup();
   // }

    @BeforeMethod

    public void setUpBrowser() throws MalformedURLException {
        basePage.initBrowser(url);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        basePage.closeBrowser();
    }

    @DataProvider(name="IncorrectLoginProviders")
    public static Object[][] getDataFromDataproviders(){
        return new Object[][]{
                {"notExisting@mail.com", "notExistingPassword"},
                {"demo@class.com", " "},
                {"", ""},
        };
        }

    public BasePage getBasePage() {
        return basePage;
    }
}
