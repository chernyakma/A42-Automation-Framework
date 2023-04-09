package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SongsPage extends BasePage{
    By playControlPanel = By.cssSelector(".player-controls");
    By playSongBtn = By.cssSelector("[title='Play or resume']");

    By pauseBtn = By.cssSelector("[class='pause']");


        public void hoverOverPlayControl() {
        new Actions(driver)
                .moveToElement(waitUntilVisible(playControlPanel))
                .perform();    }
        public  void playSong (){
            WebElement playBtn = waitUntilVisible(playSongBtn);
            playBtn.click();    }
         public WebElement getPauseButton(){
        return waitUntilVisible(pauseBtn);
    }

}
