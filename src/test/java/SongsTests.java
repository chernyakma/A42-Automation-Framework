import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PlaylistPage;
import pages.SongsPage;
import pages.LoginPage;

import java.util.List;

public class SongsTests extends BaseTest{
    LoginPage loginPage=new LoginPage();
    SongsPage songsPage=new SongsPage();
    HomePage homePage=new HomePage();
    PlaylistPage playlistPage=new PlaylistPage();
   @Test

    public void playSong() throws InterruptedException {
       PageFactory.initElements(getDriver(),loginPage);

        loginPage.login("chernyakma75@gmail.com","chernyak050675!" );
        songsPage.hoverOverPlayControl();
        songsPage.playSong();
        Assert.assertTrue(songsPage.getPauseButton().isDisplayed());
    }
    @Test
    public void addSongToPlaylist() {

        String song = "Waiting on a train";
        PageFactory.initElements(getDriver(), loginPage);
        // login
        loginPage.login("chernyakma75@gmail.com", "chernyak050675!");
        // search song
        homePage.search(song);
        // click view all
        homePage.viewAllSearchResults();
        // click on the first song
        homePage.clickFirstSearchResult();
        // click add to playlist
        playlistPage.addSongToPlaylist();
        // create a new playlist
        playlistPage.createNewPlaylistWhileAddingSong("123");
        Assert.assertTrue(homePage.getSuccessBanner().isDisplayed());
    }
    @Test
    public void countSongsInPlaylist(){
       PageFactory.initElements(getDriver(),loginPage);
       loginPage.login("chernyakma75@gmail.com", "chernyak050675!");
      //  WebElement playlist=basePage.waitUntilVisible(By.cssSelector(".playlist:nth-child(4)"));
      //  playlist.click();
        playlistPage.clickPlaylist();
        List<WebElement> songs = basePage.getDriver().findElements(By.cssSelector("#playlistWrapper .song-item"));
        int number = songs.size();
      //playlistPage.getSongsNumber();
        Assert.assertEquals(number, 3);
       // Assert.assertTrue(playlistPage.getSongsNumber().contains(3));
    }

}
