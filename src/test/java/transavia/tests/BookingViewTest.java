package transavia.tests;

import org.testng.annotations.Test;
import transavia.core.BaseTest;

public class BookingViewTest extends BaseTest {
    private String bookingNumber = "MF8C9R";
    private String lastName = "Kukharau";
    private String flightDate = "9 June 2016";
    private String date = "09-06-2016";
    private String  bookingData = bookingNumber + " " + date;

    @Test(description = "check booking time  ")
    public void checkBookFlightTotalPrice() {
        homePageService.goToBookingViewPage().fillingBookingData(bookingNumber,lastName,flightDate).compareBookingData(bookingData);
    }


}
