package transavia.pages;

import com.epam.mentoring.framework.decorator.CustomWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YoutubePage extends AbstractPage {

    public YoutubePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".title.style-scope.ytd-video-primary-info-renderer")
    private CustomWebElement videoName;

    @FindBy(id = "owner-container")
    private CustomWebElement owner;

    public CustomWebElement getVideoName() {
        return videoName;
    }

    public CustomWebElement getOwner() {
        return owner;
    }

    public String getVideoNameText() {
        return getVideoName().getText();
    }

    public String getOwnerText() {
        return getOwner().getText();
    }
}
