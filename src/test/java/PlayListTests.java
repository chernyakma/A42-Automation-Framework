import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PlaylistPage;
import pages.loginPage;
import pages.profilePage;

public class PlaylistTests extends BaseTest{
    pages.loginPage loginPage=new loginPage();
    PlaylistPage playlistPage= new PlaylistPage();
    pages.profilePage profilePage= new profilePage();
    HomePage homePage = new HomePage();


 /* @Test
    public void renamePlaylist(){
        login("chernyakma75@gmail.com", "te$t$tudent");
        choosePlaylist();
        doubleClickPlaylist();
        enterPlaylistName();
        successShow();

    }
    private void choosePlaylist(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='playlist playlist']>a"))).click();
    }
    public void doubleClickPlaylist(){
        WebElement playlist = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='playlist playlist']>a")));
        actions.doubleClick(playlist).perform();
    }
    public void enterPlaylistName ()  {

        WebElement playlistInputField= driver.findElement(By.xpath("//*[@id='playlists']/ul/li[3]/input"));
        playlistInputField.sendKeys((Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE)));
        playlistInputField.sendKeys("SUPER");
        playlistInputField.sendKeys(Keys.ENTER);

    }
    public void successShow(){
        WebElement SuccessShow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".success.show")));
        Assert.assertTrue(SuccessShow.isDisplayed());
    }*/

@Test
    public void deletePlayList() {
        loginPage.login("chernyakma75@gmail.com", "chernyak050675!");
         playlistPage.clickPlaylist();
         playlistPage.deletePlayList();

    Assert.assertTrue(homePage.getSuccessBanner().isDisplayed());
    }
    }
