package transavia.services;

import org.openqa.selenium.WebDriver;
import transavia.pages.DestinationPage;

public class DestinationService extends  AbstractService{
    DestinationPage destinationPage;
    public DestinationService(WebDriver driver) {
        super(driver);
        destinationPage = new DestinationPage(driver);
    }

   public AdvancedSearchPageService goToAdvancedSearchPage(){
        destinationPage.clickFindPerfectDestinationBt();
        return new AdvancedSearchPageService(driver);
     }



}
