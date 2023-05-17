package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class PlaylistPage extends BasePage {
    private By myPlayList = By.cssSelector("[class='playlist playlist']>a");
    private By delete = By.cssSelector("[title='Delete this playlist']");
    By forthPlaylist = By.cssSelector(".playlist:nth-child(3)");

    public void clickPlaylist() {
        WebElement playListElement = waitUntilClickable(myPlayList);
        playListElement.click();
    }

    public void deletePlayList() {
        WebElement deleteList = waitUntilClickable(delete);
        deleteList.click();
    }

    //  private void choosePlaylist(){
    //     wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='playlist playlist']>a"))).click();
    //  }
    public void doubleClickPlaylist() {
        WebElement playListElement = waitUntilClickable(myPlayList);
        //  WebElement playlist = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='playlist playlist']>a")));
        Actions actions = new Actions(driver);
        actions.doubleClick(playListElement).perform();
    }

    public void enterPlaylistName() {

        WebElement playlistInputField = driver.findElement(By.xpath("//*[@id='playlists']/ul/li[3]/input"));
        playlistInputField.sendKeys((Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE)));
        playlistInputField.sendKeys("star");
        playlistInputField.sendKeys(Keys.ENTER);

    }

    public void addSongToPlaylist() {
        WebElement addToBtn = waitUntilVisible(By.cssSelector("[data-test='add-to-btn']"));
        addToBtn.click();
    }

    public void createNewPlaylistWhileAddingSong(String playlistName) {
        List<WebElement> listNameField = driver.findElements(By.cssSelector(".form-save [data-test='new-playlist-name']"));
        listNameField.get(1).click();
        listNameField.get(1).clear();
        listNameField.get(1).sendKeys(playlistName);
        new Actions(driver)
                .keyDown(Keys.ENTER)
                .perform();
    }

    public void createPlaylist(String name) throws InterruptedException {
        WebElement createPlaylistBtn = getDriver().findElement(By.cssSelector("[data-testid='sidebar-create-playlist-btn']"));
        Thread.sleep(2000);
        createPlaylistBtn.click();
        WebElement newPlaylist = getDriver().findElement(By.cssSelector("[data-testid='playlist-context-menu-create-simple']"));
        newPlaylist.click();
        //Thread.sleep(2000);
        WebElement playListNameField = getDriver().findElement(By.cssSelector("input[name='name']"));
      //  Thread.sleep(2000);
        playListNameField.click();
        playListNameField.clear();
        playListNameField.sendKeys(name);
        playListNameField.sendKeys(Keys.ENTER);

        // enter playlist name
    }

    public String getPlaylistName() {
        WebElement playlistElement = waitUntilVisible(forthPlaylist);
        String name = playlistElement.getText();
        return name;
    }

    public List<String> getPlaylistNames() {
        List<WebElement> playlists = getDriver().findElements(By.cssSelector(".playlist.playlist>a"));
        int size = playlists.size(); // get size of the collection
        List<String> playlistNames = new ArrayList<>();

        for (int i = 0; i < (size - 1); i++) {
            String name = playlists.get(i).getText();
            playlistNames.add(name);
        }
        return playlistNames;

    }
      //     public List<Integer> getSongsNumber() {
      //       List<WebElement> songs = getDriver().findElements(By.cssSelector("#playlistWrapper .song-item"));
        //     int number = songs.size();
          //   return number;
         }

