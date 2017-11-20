package transavia.services;

import org.openqa.selenium.WebDriver;
import transavia.pages.HandLuggagePage;
import transavia.pages.YoutubePage;

public class HandLuggageService extends AbstractService {

    private HandLuggagePage handLuggagePage;

    public HandLuggageService(WebDriver driver) {
        super(driver);
        handLuggagePage = new HandLuggagePage(driver);
    }

    public YoutubeService goToVideoByLink(){
            handLuggagePage.clickVideoLink();
        return new YoutubeService(driver);
    }

    public HandLuggageService startVideo(){

        handLuggagePage.clickPlayButton();
        return this;
    }
}
