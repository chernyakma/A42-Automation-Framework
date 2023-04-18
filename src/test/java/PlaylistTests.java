import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PlaylistPage;
import pages.LoginPage;
import pages.ProfilePage;

public class PlaylistTests extends BaseTest{
    LoginPage loginPage=new LoginPage(getDriver());
    PlaylistPage playlistPage= new PlaylistPage(getDriver());
    ProfilePage profilePage= new ProfilePage(getDriver());
    HomePage homePage = new HomePage(getDriver());


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
    public void deletePlayList() throws InterruptedException {
    PageFactory.initElements(getDriver(),playlistPage);
        loginPage.login("chernyakma75@gmail.com", "chernyak050675!");
        playlistPage.clickPlaylist();
        playlistPage.deletePlayList();
    Assert.assertTrue(homePage.getSuccessBanner().isDisplayed());
    }
    }
