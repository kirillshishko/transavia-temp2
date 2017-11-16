package transavia.services;

import org.openqa.selenium.WebDriver;
import transavia.pages.BookingFlightPage;

public class BookingFlightService extends AbstractService {

    private BookingFlightPage bookingFlightPage;

    public BookingFlightService(WebDriver driver) {
        super(driver);
        bookingFlightPage = new BookingFlightPage(driver);
    }

    private String s = "Unfortunately we do not fly from Dubai, United Arab Emirates to Agadir, Morocco. " +
            "However, we do fly from Dubai, United Arab Emirates to other destinations. " +
            "Please change your destination and try again.";

    public boolean  isErrorMessageContainsText(){

        return bookingFlightPage.getErrorMessageText().contains(s);

    }

    public BookingFareService selectFirstFlights(){
        bookingFlightPage.clickFirstOutboundSelectedFlight();
        bookingFlightPage.clickFirstOutboundFlightTimeSelectBtn();
        bookingFlightPage.clickFirstInboundAvailableFlight();
        bookingFlightPage.clickFirstInboundFlightTimeSelectBtn();
        bookingFlightPage.clickNextBtn();

        return new BookingFareService(driver);
    }
}
