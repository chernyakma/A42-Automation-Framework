package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.MalformedURLException;

public class PlaylistPage extends BasePage {
    public PlaylistPage(WebDriver driver) {
        super();
    }

    public static PlaylistPage playlistPage(){

        return new PlaylistPage(driver);
    }
    private By myPlayList = By.cssSelector("[class='playlist playlist']>a");
    private By delete = By.cssSelector("button[title='Delete this playlist']");

    public void clickPlaylist(){
        WebElement playListElement = waitUntilClickable(myPlayList);
        playListElement.click();
    }
    public void deletePlayList(){
        WebElement deleteList = waitUntilClickable(delete);
        Actions actions=new Actions(getDriver());
        actions.click(deleteList).perform();
    //    actions.perform();
        //  deleteList.click();
    }
    public void doubleClickPlaylist(){
        WebElement playListElement = waitUntilClickable(myPlayList);
      //  WebElement playlist = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='playlist playlist']>a")));
        Actions actions = new Actions(getDriver());
        actions.doubleClick(playListElement).perform();
    }
    public void enterPlaylistName ()  {

        WebElement playlistInputField= getDriver().findElement(By.xpath("//*[@id='playlists']/ul/li[3]/input"));
        playlistInputField.sendKeys((Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE)));
        playlistInputField.sendKeys("SUPER");
        playlistInputField.sendKeys(Keys.ENTER);

    }


}
