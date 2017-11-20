package transavia.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import transavia.core.BaseTest;

public class BookingDetailsTest extends BaseTest{
    private String bookingNumber = "MF8C9R";
    private String lastName = "Kukharau";
    private String flightDate = "9 June 2016";


    @Test(description = "check  ticket price and booking price")
    public  void checkTicketPrice(){
        Assert.assertTrue(homePageService.goToBookingViewPage().fillingBookingData(bookingNumber,lastName,flightDate).goToBookingDetailsPage().isTotalSumEqualsPaymentAmount());
    }

}
