import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PlaylistPage;
import pages.LoginPage;
import pages.ProfilePage;

public class RenamePlaylist extends BaseTest{
    LoginPage loginPage=new LoginPage();
    PlaylistPage playlistPage= new PlaylistPage();
    ProfilePage profilePage= new ProfilePage();
    HomePage homePage = new HomePage();

@Test
    public void renamePlaylist(){
    PageFactory.initElements(getDriver(),loginPage);
    loginPage.login("chernyakma75@gmail.com", "chernyak050675!");
    playlistPage.clickPlaylist();
    playlistPage.doubleClickPlaylist();
    playlistPage.enterPlaylistName();
    homePage.getSuccessBanner();

}
}
