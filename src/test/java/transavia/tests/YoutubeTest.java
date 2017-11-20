package transavia.tests;

import org.testng.annotations.Test;
import transavia.core.BaseTest;

public class YoutubeTest extends BaseTest {
    String name = "Luggage";
    String owner = "Transavia";
    @Test(description = "check  handluggage  video name and author")
    public void checkhandluggageVideoNameAndAuthor(){
        homePageService.goToHandLaggagePage().goToVideoByLink().checkVideoNameAndOwner(name,owner);
    }
}
