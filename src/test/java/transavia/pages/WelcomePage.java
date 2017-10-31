package transavia.pages;

import com.epam.mentoring.framework.ui_utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WelcomePage extends AbstractPage {

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".component_language-switch")
    private WebElement countryChoicePanel;

    @FindAll(@FindBy(xpath = "//div[@class='component_language-switch']//a/*"))
    private List<WebElement> countryList;

    @FindBy(xpath = "//div[@class='component_language-switch']//*[contains(text(),'France')]")
    private WebElement france;

    @FindBy(xpath = "//a[@href='/en-EU/home']")
    private WebElement otherCountryLink;

    public void clickOtherCountryLink(){

        actions.contextClick(otherCountryLink);
        Wait.pause(1500);
    }



}
