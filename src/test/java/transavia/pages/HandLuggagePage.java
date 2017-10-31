package transavia.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HandLuggagePage extends AbstractPage {

    public HandLuggagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".content-text-color iframe")
    private WebElement video;

    @FindBy(css = ".ytp-large-play-button")
    private WebElement playButton;

    public String getVideoLink(){
        String coordinats = video.getLocation().toString();
        System.out.println("COORD : " +coordinats);
        String jsScript = "window.scroll" + coordinats;
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript(jsScript);
        wait.waitForElementIsClickable(video);
        logger.info("get link");
        return video.getAttribute("scr");
    }

    public void clickPlayButton(){
        String coordinats = playButton.getLocation().toString();
        String jsScript = "window.scroll" + coordinats;
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript(jsScript);
        wait.waitForElementIsClickable(playButton);
        playButton.click();
        logger.info("click play button");
    }
}
