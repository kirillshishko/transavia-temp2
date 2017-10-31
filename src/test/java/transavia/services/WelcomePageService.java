package transavia.services;

import org.openqa.selenium.WebDriver;
import transavia.pages.WelcomePage;


public class WelcomePageService extends AbstractService{

    private WelcomePage welcomPage;

    public WelcomePageService(WebDriver driver) {
        super(driver);
        welcomPage = new WelcomePage(driver);
    }

    public HomePageService navigateToHomePage(){

        welcomPage.clickOtherCountryLink();
        return new HomePageService(driver);
    }
}
