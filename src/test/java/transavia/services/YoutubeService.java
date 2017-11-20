package transavia.services;

import org.openqa.selenium.WebDriver;
import transavia.pages.YoutubePage;


public class YoutubeService extends AbstractService {
    YoutubePage youtubePage;

    public YoutubeService(WebDriver driver) {
        super(driver);
         youtubePage = new YoutubePage(driver);
    }


    public boolean checkVideoNameAndOwner(String name, String owner){
        return youtubePage.getOwnerText().equals(owner) && youtubePage.getVideoNameText().equals(name);
    }
}
