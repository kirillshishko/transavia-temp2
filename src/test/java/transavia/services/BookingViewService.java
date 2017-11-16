package transavia.services;


import org.openqa.selenium.WebDriver;
import transavia.pages.BookingViewPage;

public class BookingViewService extends AbstractService {

    private BookingViewPage bookingViewPage;
    public BookingViewService(WebDriver driver) {
        super(driver);
        bookingViewPage = new BookingViewPage(driver);
    }

    public String getBookingData(){

       return bookingViewPage.getBookingNumberText() + " " + bookingViewPage.getDepartureDateText();
    }

    public  boolean  compareBookingData(String expectedBookingData){
        return  getBookingData().equals(expectedBookingData);
    }

    public BookingDetailsService navigateToBookingDetailsPage(){

        bookingViewPage.clickBookingDetailsButton();

        return new BookingDetailsService(driver);
    }
}
