package transavia.tests;

import org.testng.annotations.Test;
import transavia.core.BaseTest;

public class HomePageTest  extends BaseTest {

    @Test(description = "check search Form fields")
    public void checkSearhForm(){
        homePageService.checkSearchRaceForm();
    }

}
