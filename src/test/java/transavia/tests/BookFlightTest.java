package transavia.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import transavia.core.BaseTest;

public class BookFlightTest extends BaseTest {
    @Test(description = "check total price")
    public void checkBookFlightTotalPrice(){


        Assert.assertTrue(homePageService.fillSearchRaceFormWithoutReturnDate("Amsterdam", "Paris", "18 nov 2017", 2,1 ).selectFirstFlights().compareTicketsPrice());
    }

}
