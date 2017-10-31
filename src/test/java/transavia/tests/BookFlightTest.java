package transavia.tests;

import org.testng.annotations.Test;
import transavia.core.BaseTest;

public class BookFlightTest extends BaseTest {
    @Test(description = "check total price")
    public void checkBookFlightTotalPrice(){
        homePageService.fillSearchRaceFormWithoutReturnDate("Amsterdam", "Paris", "27 oct 2017", 2,1 );
        //bookingFlightService.checkBookingFlightTotalPrice();
    }

}
