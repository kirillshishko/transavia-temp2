package transavia.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import transavia.core.BaseTest;

public class SearchLess200EuroTicketTest extends BaseTest{
    @Test(description = "check Destination with  budget")
    public void checkDestinationWithBudget(){
        Assert.assertTrue(homePageService.goToDestinationPage().serchTicket("Insbruck","200").isSearchResultDisplayed());
    }

}
