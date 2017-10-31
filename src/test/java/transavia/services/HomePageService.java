package transavia.services;

import com.epam.mentoring.framework.ui_utils.Wait;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import transavia.pages.HomePage;

public class HomePageService extends AbstractService {

    private HomePage homePage;

    public HomePageService(WebDriver driver) {
        super(driver);
        homePage = new HomePage(driver);
    }

    public void checkSearchRaceForm() {
        Assert.assertTrue( homePage.isAirportFromInputDisplayed());

        Assert.assertTrue( homePage.isAirportToInputDisplayed());
        Assert.assertTrue( homePage.isDePartureDateInputDisplayed());
        Assert.assertTrue( homePage.isReturnDateInputDisplayed());
        Assert.assertTrue( homePage.isReturnOnCheckboxDisplayed());

        Assert.assertTrue( homePage.isPassengersInputBtnDisplayed());

        homePage.clickPasengersInputBtn();
        Assert.assertTrue(homePage.getReturnDateInputText().isEmpty());
        Wait.pause(300);
        Assert.assertTrue( homePage.isAdultsIncreaseDisplayed());
        Assert.assertTrue( homePage.isAdultsDecreaseBtnDisplayed());
        Assert.assertTrue( homePage.isChildrensIncreaseBtnDisplayed());
        Assert.assertTrue( homePage.isChildrensDecreaseBtnDisplayed());
        Assert.assertTrue( homePage.isSearchBtnDisplayed());

    }

    public void fillSearchRaceFormWithoutReturnDate(String cityFrom, String cityTo, String departureDate, int adaultsNumber, int chilldernsNumber) {
        homePage.chooseAirportFrom(cityFrom);
        homePage.chooseAirportTo(cityTo);
        homePage.sendDepartureDateInput(departureDate);
        homePage.clickReturnOnCheckbox();
        homePage.clickPasengersInputBtn();
        chooseAdaultsNumber(adaultsNumber);
        chooseChildrenNumber(chilldernsNumber);
        homePage.clickSavePassengersCountBtn();
        homePage.clickSearchBtn();
    }



    public void fillSearchRaceFormWithReturnDate(String cityFrom, String cityTo, String departureDate, String returnDate) {

    }

    public void chooseChildrenNumber(int chilldrenNumber) {
        for (int i = 0; i < chilldrenNumber-1; i++) {
            homePage.clickChildrensIncreaseBtn();
        }
    }

    private void chooseAdaultsNumber(int adoultsNumber) {
        for (int i = 0; i < adoultsNumber-1; i++) {
            homePage.clickAdultsIncreaseBtn();
        }
    }


}
