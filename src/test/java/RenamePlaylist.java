import org.testng.annotations.Test;
import pages.HomePage;
import pages.PlaylistPage;
import pages.LoginPage;
import pages.ProfilePage;

public class RenamePlaylist extends BaseTest{
    LoginPage loginPage=new LoginPage(getDriver());
    PlaylistPage playlistPage= new PlaylistPage(getDriver());
    ProfilePage profilePage= new ProfilePage(getDriver());
    HomePage homePage = new HomePage(getDriver());

@Test
    public void renamePlaylist(){
    loginPage.login("chernyakma75@gmail.com", "chernyak050675!");
    playlistPage.clickPlaylist();
    playlistPage.doubleClickPlaylist();
    playlistPage.enterPlaylistName();
    homePage.getSuccessBanner();

}
}
