import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;

import static org.testng.Assert.assertEquals;

public class ProfileTests extends BaseTest {
    LoginPage loginPage=new LoginPage(getDriver());
    ProfilePage profilePage= new ProfilePage(getDriver());
    HomePage homePage = new HomePage(getDriver());

    @Test
    public void changeProfile() throws InterruptedException {

        loginPage.login("chernyakma75@gmail.com", "chernyak050675!");
        Thread.sleep(5000);
        profilePage.openProfile();
        profilePage.enterCurrentPassword("chernyak050675!");
        profilePage.enterCurrentEmail("chernyakma75@gmail.com");
        String newName = profilePage.generateRandomName();
        System.out.println(newName);
        profilePage.enterNewName(newName);
        profilePage.saveProfile();
        Assert.assertTrue((homePage.getSuccessBanner()).isDisplayed());
    }


}
