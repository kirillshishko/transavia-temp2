package transavia.pages;

import com.epam.mentoring.framework.decorator.CustomWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvancedSearchPage extends AbstractPage {

    public AdvancedSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "countryStationSelection_Origin-input")
    private CustomWebElement countryFromInput;
    @FindBy(id = "countryStationSelection_Destination-input")
    private CustomWebElement countryToInput;

    @FindBy(xpath = "//h3[ contains(text(),'What is your budget per person?')]")
    private CustomWebElement budgetDropDownBtn;

    @FindBy(css = ".HV-gc .HV-gu--bp22--25p input")
    private CustomWebElement budgetInput;
    @FindBy(css = " .integer")
    private CustomWebElement searchResult;

    public CustomWebElement getSearchResult() {
        return searchResult;
    }

    public boolean isSearchResultDisplayed() {
        return getSearchResult().isDisplayed();
    }

    public CustomWebElement getCountryFromInput() {
        return countryFromInput;
    }

    public CustomWebElement getBudgetInput() {
        return budgetInput;
    }


    public CustomWebElement getCountryToInput() {
        return countryToInput;
    }

    public CustomWebElement getBudgetDropDownBtn() {
        return budgetDropDownBtn;
    }

    public void typeCountryFrom(String value) {
        getCountryFromInput().clear();
        getCountryFromInput().sendKeys(value);
        getCountryFromInput().submit();
    }

    public void clickBudgetDropDownBtn() {
        getBudgetDropDownBtn().click();
    }

    public void typeBudgetValue(String value) {
        getBudgetInput().clear();
        getBudgetInput().sendKeys(value);
        getBudgetInput().submit();
    }
}
