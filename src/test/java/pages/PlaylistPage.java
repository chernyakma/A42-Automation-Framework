package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlaylistPage extends BasePage {
    private By myPlayList = By.cssSelector("[class='playlist playlist']>a");
    private By delete = By.cssSelector("[title='Delete this playlist']");
    public PlaylistPage(WebDriver driver){
        super();
    }
    public void clickPlaylist(){
        WebElement playListElement = waitUntilClickable(myPlayList);
        playListElement.click();
    }
    public void deletePlayList(){
        WebElement deleteList = waitUntilClickable(delete);
        deleteList.click();
    }
  //  private void choosePlaylist(){
   //     wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='playlist playlist']>a"))).click();
  //  }
    public void doubleClickPlaylist(){
        WebElement playListElement = waitUntilClickable(myPlayList);
      //  WebElement playlist = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='playlist playlist']>a")));
        Actions actions = new Actions(driver);
        actions.doubleClick(playListElement).perform();
    }
    public void enterPlaylistName ()  {

        WebElement playlistInputField= driver.findElement(By.xpath("//*[@id='playlists']/ul/li[3]/input"));
        playlistInputField.sendKeys((Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE)));
        playlistInputField.sendKeys("SUPER");
        playlistInputField.sendKeys(Keys.ENTER);

    }


}
