package transavia.services;

import org.openqa.selenium.WebDriver;
import transavia.pages.AdvancedSearchPage;

public class AdvancedSearchPageService extends AbstractService {

    private AdvancedSearchPage advancedSearchPage;

    public AdvancedSearchPageService(WebDriver driver) {
        super(driver);
        advancedSearchPage = new AdvancedSearchPage(driver);
    }
}
