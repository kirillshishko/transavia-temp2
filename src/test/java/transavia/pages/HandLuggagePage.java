package transavia.pages;

import com.epam.mentoring.framework.decorator.CustomWebElement;
import com.epam.mentoring.framework.ui_utils.Scroll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HandLuggagePage extends AbstractPage {

    public HandLuggagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".video iframe")
    private CustomWebElement video;

    @FindBy(css = ".ytp-large-play-button.ytp-button")
    private CustomWebElement playButton;

    @FindBy(css = ".ytp-title-link.yt-uix-sessionlink")
    private CustomWebElement videoLink;

    public CustomWebElement getVideo() {
        return video;
    }

    public CustomWebElement getPlayButton() {
        return playButton;
    }

    public CustomWebElement getVideoLink() {
        return videoLink;
    }

    public void clickVideoLink(){
        wait.forElementIsClickable(getVideo());
        Scroll.scrollToElement(driver,getVideo());
        logger.info("click video link");
        getVideoLink().click();
    }

    public void clickPlayButton(){
        wait.forElementIsClickable(getPlayButton());
        Scroll.scrollToElement(driver,getPlayButton());
        getPlayButton().click();
        logger.info("click play button");
    }
}
