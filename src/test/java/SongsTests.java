import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SongsTests extends BaseTest{
    @Test
    public void playSong() throws InterruptedException {

        login("chernyakma75@gmail.com","te$t$tudent" );

        WebElement hover = driver.findElement(By.cssSelector("[title='Play or resume']"));
        new Actions(driver)
               .moveToElement(hover)
               .perform();
        Thread.sleep(5000);
        hover.click();
        WebElement pause=driver.findElement(By.cssSelector("[class='pause']"));
        Assert.assertTrue(pause.isDisplayed());
    }
}
