package transavia.services;

import com.epam.mentoring.framework.ui_utils.Wait;
import org.openqa.selenium.WebDriver;
import transavia.pages.HandLuggagePage;
import transavia.pages.HomePage;

public class HomePageService extends AbstractService {

    private HomePage homePage;

    public HomePageService(WebDriver driver) {
        super(driver);
        homePage = new HomePage(driver);
    }

    public BookingFlightService fillSearchRaceFormWithoutReturnDate(String cityFrom, String cityTo, String departureDate, int adaultsNumber, int chilldernsNumber) {
        homePage.chooseAirportFrom(cityFrom);
        homePage.chooseAirportTo(cityTo);
        homePage.sendDepartureDateInput(departureDate);
        homePage.clickPasengersInputBtn();
        chooseAdultsNumber(adaultsNumber);
        chooseChildrenNumber(chilldernsNumber);
        homePage.clickSavePassengersCountBtn();
        homePage.clickSearchBtn();
        return  new BookingFlightService(driver);
    }


    public BookingFlightService fillSearchRaceFormWithReturnDate(String cityFrom, String cityTo, String departureDate, String returnDate,  int adultsNumber, int childrenNumber) {
        Wait.waitForPageLoaded(driver,10000);
        homePage.chooseAirportFrom(cityFrom);
        homePage.chooseAirportTo(cityTo);
        homePage.sendDepartureDateInput(departureDate);
        homePage.clickReturnOnCheckbox();
        homePage.sendReturnDateInput(returnDate);
        homePage.clickPasengersInputBtn();
        chooseAdultsNumber(adultsNumber);
        chooseChildrenNumber(childrenNumber);
        homePage.clickSavePassengersCountBtn();
        homePage.clickSearchBtn();
        return  new BookingFlightService(driver);
    }

    public HandLuggageService goToHandLaggagePage(){
        homePage.clickServiceBtn();

        homePage.clickHandLaggageBtn();
        return  new HandLuggageService(driver);
    }

    public LoginService goToBookingViewPage(){
        homePage.clickManageYorBooking();
        homePage.clickViewYourBooking();
        return new LoginService(driver);
    }

    public void chooseChildrenNumber(int childrenNumber) {
        for (int i = 0; i < childrenNumber ; i++) {
            homePage.clickChildrensIncreaseBtn();
        }
    }

    public AdvancedSearchPageService goToDestinationPage(){
        homePage.clickDestinationBtn();
        return new AdvancedSearchPageService(driver);
    }
    private void chooseAdultsNumber(int adultsNumber) {
        for (int i = 0; i < adultsNumber-1 ; i++) {
            homePage.clickAdultsIncreaseBtn();
        }
    }


}
