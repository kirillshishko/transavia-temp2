package transavia.pages;

import com.epam.mentoring.framework.decorator.CustomWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AdvancedSearchPage extends AbstractPage {

    public AdvancedSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "countryStationSelection_Origin-input")
    private CustomWebElement countryFromTextbox;
    @FindBy(id = "countryStationSelection_Destination-input")
    private CustomWebElement countryToTextbox;

    
}
