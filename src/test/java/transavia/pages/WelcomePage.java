package transavia.pages;

import com.epam.mentoring.framework.decorator.CustomWebElement;
import com.epam.mentoring.framework.ui_utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WelcomePage extends AbstractPage {

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".component_language-switch")
    private CustomWebElement countryChoicePanel;

    @FindAll(@FindBy(xpath = "//div[@class='component_language-switch']//a/*"))
    private List<CustomWebElement> countryList;

    @FindBy(xpath = "//div[@class='component_language-switch']//*[contains(text(),'France')]")
    private CustomWebElement france;

    @FindBy(xpath = "//a[@href='/en-EU/home']")
    private CustomWebElement otherCountryLink;

    public void clickOtherCountryLink(){

        actions.contextClick(otherCountryLink);
        Wait.pause(1500);
    }



}
