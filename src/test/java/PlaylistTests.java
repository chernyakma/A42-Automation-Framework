import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PlaylistPage;
import pages.LoginPage;
import pages.ProfilePage;

import java.util.List;

public class PlaylistTests extends BaseTest{
    LoginPage loginPage=new LoginPage();
    PlaylistPage playlistPage= new PlaylistPage();
    ProfilePage profilePage= new ProfilePage();
    HomePage homePage = new HomePage();



@Test
    public void deletePlayList() {
    PageFactory.initElements(getDriver(),loginPage);
        loginPage.login("chernyakma75@gmail.com", "chernyak050675!");
         playlistPage.clickPlaylist();
         playlistPage.deletePlayList();

    Assert.assertTrue(homePage.getSuccessBanner().isDisplayed());
    }
    @Test
    public void renamePlaylist(){
        PageFactory.initElements(getDriver(),loginPage);
        loginPage.login("chernyakma75@gmail.com", "chernyak050675!");
        playlistPage.clickPlaylist();
        playlistPage.doubleClickPlaylist();
        playlistPage.enterPlaylistName();
        homePage.getSuccessBanner();

    }
    @Test
    public void addPlaylist() throws InterruptedException {
        PageFactory.initElements(getDriver(), loginPage);
        loginPage.login("chernyakma75@gmail.com", "chernyak050675!");
        String plName = "RockStars 15";
        playlistPage.createPlaylist(plName);
        Thread.sleep(2000);
        List<String> playlistNames = playlistPage.getPlaylistNames();
        System.out.println(playlistNames);
        Assert.assertTrue(playlistNames.contains(plName));
    }
    }
