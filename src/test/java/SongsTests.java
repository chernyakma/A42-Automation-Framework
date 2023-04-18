import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SongsPage;
import pages.LoginPage;

public class SongsTests extends BaseTest{
    LoginPage loginPage=new LoginPage(getDriver());
    SongsPage songsPage=new SongsPage(getDriver());
   @Test

    public void playSong() throws InterruptedException {
       PageFactory.initElements(getDriver(),songsPage);
        loginPage.login("chernyakma75@gmail.com","chernyak050675!" );
        Thread.sleep(2000);
        songsPage.hoverOverPlayControl();
        songsPage.playSong();
        Assert.assertTrue(songsPage.getPauseButton().isDisplayed());
    }
}
