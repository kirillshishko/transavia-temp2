package transavia.pages;

import com.epam.mentoring.framework.decorator.CustomWebElement;
import com.epam.mentoring.framework.ui_utils.Scroll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DestinationPage  extends  AbstractPage{
    public DestinationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".button-primary")
    private CustomWebElement findPerfectDestinationBtn;

    public CustomWebElement getFindPerfectDestinationBtn() {
        return findPerfectDestinationBtn;
    }

    public void clickFindPerfectDestinationBt(){
        wait.waitForElementAppearing(getFindPerfectDestinationBtn());
        Scroll.scrollToElement(driver,getFindPerfectDestinationBtn());
        getFindPerfectDestinationBtn().click();
    }
}
