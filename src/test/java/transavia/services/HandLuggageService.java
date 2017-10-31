package transavia.services;

import org.openqa.selenium.WebDriver;
import transavia.pages.HandLuggagePage;

public class HandLuggageService extends AbstractService {

    private HandLuggagePage handLuggagePage;

    public HandLuggageService(WebDriver driver) {
        super(driver);
        handLuggagePage = new HandLuggagePage(driver);
    }

    public String getVideoLink(){

        return handLuggagePage.getVideoLink();
    }

    public HandLuggageService startVideo(){

        handLuggagePage.clickPlayButton();
        return this;
    }
}
