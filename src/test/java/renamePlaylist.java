import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class renamePlaylist extends BaseTest{
@Test
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
}
}
