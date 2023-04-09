import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SongsPage;
import pages.loginPage;

public class SongsTests extends BaseTest{
    loginPage loginPage=new loginPage();
    SongsPage songsPage=new SongsPage();
   @Test

    public void playSong() throws InterruptedException {

        loginPage.login("chernyakma75@gmail.com","chernyak050675!" );
        songsPage.hoverOverPlayControl();
        songsPage.playSong();
        Assert.assertTrue(songsPage.getPauseButton().isDisplayed());
    }
}
