import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.loginPage;
import pages.profilePage;

import java.util.UUID;

import static org.testng.Assert.assertEquals;

public class ProfileTests extends BaseTest {
    loginPage loginPage=new loginPage();
    profilePage profilePage= new profilePage();
    HomePage homePage = new HomePage();

    @Test
    public void changeProfile() {

        loginPage.login("chernyakma75@gmail.com", "chernyak050675!");
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
