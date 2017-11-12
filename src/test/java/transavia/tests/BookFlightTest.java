package transavia.tests;

import org.testng.annotations.Test;
import transavia.core.BaseTest;

public class BookFlightTest extends BaseTest {
    @Test(description = "check total price")
    public void checkBookFlightTotalPrice(){
        homePageService.fillSearchRaceFormWithoutReturnDate("Amsterdam", "Paris", "15 nov 2017", 2,1 ).checkBookingFlightTotalPrice();
    }

}
