package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SongsPage extends BasePage{
    public SongsPage(WebDriver driver) {
        super();
    }

    public static SongsPage songsPage(){

        return new SongsPage(driver);
    }
    private By playControlPanel = By.cssSelector(".player-controls");
    private By playSongBtn = By.cssSelector("[title='Play or resume']");

    private By pauseBtn = By.cssSelector("[class='pause']");


        public void hoverOverPlayControl() {
        new Actions(getDriver())
                .moveToElement(waitUntilVisible(playControlPanel))
                .perform();    }
        public  void playSong (){
            WebElement playBtn = waitUntilVisible(playSongBtn);
            playBtn.click();    }
         public WebElement getPauseButton(){
        return waitUntilVisible(pauseBtn);
    }

}
