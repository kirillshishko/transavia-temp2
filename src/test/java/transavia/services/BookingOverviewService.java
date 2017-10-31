package transavia.services;


import org.openqa.selenium.WebDriver;
import transavia.pages.BookingOverviewPage;

public class BookingOverviewService extends AbstractService {

    private BookingOverviewPage bookingOverviewPage;
    public BookingOverviewService(WebDriver driver) {
        super(driver);
        bookingOverviewPage = new BookingOverviewPage(driver);
    }

    public String getBookingData(){

       return bookingOverviewPage.getBookingNumber() + " " + bookingOverviewPage.getDepartureDate();
    }

    public BookingDetailsService navigateToBookingDetailsPage(){

        bookingOverviewPage.clickBookingDetailsButton();

        return new BookingDetailsService(driver);
    }
}
