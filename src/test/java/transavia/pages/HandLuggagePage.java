package transavia.pages;

import com.epam.mentoring.framework.decorator.CustomWebElement;
import com.epam.mentoring.framework.ui_utils.Scroll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HandLuggagePage extends AbstractPage {

    public HandLuggagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".content-text-color iframe")
    private CustomWebElement video;

    @FindBy(css = ".ytp-large-play-button")
    private CustomWebElement playButton;

    public CustomWebElement getVideo() {
        return video;
    }

    public CustomWebElement getPlayButton() {
        return playButton;
    }

    public String getVideoLink(){
        wait.waitForElementIsClickable(getVideo());
        Scroll.scrollToElement(driver,getVideo());
        logger.info("get video link");
        return getVideo().getAttribute("scr");
    }

    public void clickPlayButton(){
        wait.waitForElementIsClickable(getPlayButton());
        Scroll.scrollToElement(driver,getPlayButton());
        getPlayButton().click();
        logger.info("click play button");
    }
}
