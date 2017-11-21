package transavia.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import transavia.core.BaseTest;

public class BookFlightTest extends BaseTest {
    private String cityFrom = "Dubai";
    private String cityTo = "Agadir";
    private String date = "23 Oct 2017";
    private boolean isReturnOn = false;
    private int adults = 1;
    private int children = 0;

    @Test(description = "check total price")
    public void checkBookFlightTotalPrice() {


        Assert.assertTrue(homePageService.fillSearchRaceFormWithoutReturnDate("Amsterdam", "Paris", "18 nov 2017", 2, 1).selectFirstFlights().compareTicketsPrice());

    }
    @Test
    public void flightFromDubaiToAgadir(){

        Assert.assertTrue(homePageService.fillSearchRaceFormWithoutReturnDate(cityFrom,cityTo,date,adults,children).isErrorMessageContainsText());

    }


}
