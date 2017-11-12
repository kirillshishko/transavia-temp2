package transavia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BookingFlightPage extends AbstractPage {

    public BookingFlightPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'notification-error')]/p")
    private WebElement errorMessage;

    @FindBy(css = ".flight.outbound .day.day-with-availability")
    private List<WebElement> outboundAviliableFlights;

    @FindBy(css = ".flight.inbound .day.day-with-availability")
    private List<WebElement> inboundAviliableFlights;

    @FindBy(name = "next_button")
    private WebElement nextBtn;

    public String getErrorMessageText() {
        return getErrorMessage().getText();
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public List<WebElement> getInboundSelectedFlight() {
        return inboundAviliableFlights;
    }

    public void clickOutboundSelectedFlight() {
        wait.waitForElementIsClickable(getInboundSelectedFlight().get(0));
        getInboundSelectedFlight().get(0).click();
    }


    public List<WebElement> getInboundAviliableFlights() {
        return inboundAviliableFlights;
    }

    public void clickInboundSelectedFlight() {
        wait.waitForElementIsClickable(getInboundAviliableFlights().get(0));
        getInboundAviliableFlights().get(0).click();
    }

    public WebElement getNextBtn() {
        return nextBtn;
    }

    public void clickNextBtn(){
        getNextBtn().click();
    }
}
