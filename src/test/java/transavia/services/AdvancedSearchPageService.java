package transavia.services;

import org.openqa.selenium.WebDriver;
import transavia.pages.AdvancedSearchPage;

public class AdvancedSearchPageService extends AbstractService {

    private AdvancedSearchPage advancedSearchPage;

    public AdvancedSearchPageService(WebDriver driver) {
        super(driver);
        advancedSearchPage = new AdvancedSearchPage(driver);
    }

    public AdvancedSearchPageService serchTicket(String countryFrom, String budget){
        advancedSearchPage.typeCountryFrom(countryFrom);
        advancedSearchPage.clickBudgetDropDownBtn();
        advancedSearchPage.typeBudgetValue(budget);
        return new AdvancedSearchPageService(driver);
    }

    public boolean isSearchResultDisplayed(){

        return isSearchResultDisplayed();
    }
}
