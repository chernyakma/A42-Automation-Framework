import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PlaylistPage;
import pages.loginPage;
import pages.profilePage;

public class renamePlaylist extends BaseTest{
    pages.loginPage loginPage=new loginPage();
    PlaylistPage playlistPage= new PlaylistPage();
    pages.profilePage profilePage= new profilePage();
    HomePage homePage = new HomePage();

@Test
    public void renamePlaylist(){
    loginPage.login("chernyakma75@gmail.com", "chernyak050675!");
    playlistPage.clickPlaylist();
    playlistPage.doubleClickPlaylist();
    playlistPage.enterPlaylistName();
    homePage.getSuccessBanner();

}
}
