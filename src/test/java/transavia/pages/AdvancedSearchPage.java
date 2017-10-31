package transavia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvancedSearchPage extends AbstractPage {

    public AdvancedSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "countryStationSelection_Origin-input")
    private WebElement countryFromTextbox;
    @FindBy(id = "countryStationSelection_Destination-input")
    private WebElement countryToTextbox;

    
}
