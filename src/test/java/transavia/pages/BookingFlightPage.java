package transavia.pages;

import com.epam.mentoring.framework.decorator.CustomWebElement;
import com.epam.mentoring.framework.ui_utils.Scroll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class BookingFlightPage extends AbstractPage {

    public BookingFlightPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'notification-error')]/p")
    private CustomWebElement errorMessage;

    @FindBy(css = ".flight.outbound .day.day-with-availability")
    private List<CustomWebElement> outboundAvilableFlights;

    @FindBy(css = ".flight.inbound .day.day-with-availability")
    private List<CustomWebElement> inboundAvailableFlights;

    @FindBy(css = ".display-table .button-primary")
    private CustomWebElement nextBtn;

    @FindBy(css = ".outbound .flight-result-button")
    private List<CustomWebElement> outboundFlightTimeSelectBtn;

    @FindBy(css = ".inbound .flight-result-button")
    private List<CustomWebElement> inboundFlightTimeSelectBtn;

    public String getErrorMessageText() {
        return getErrorMessage().getText();
    }

    public CustomWebElement getErrorMessage() {
        return errorMessage;
    }

    public CustomWebElement getNextBtn() {
        return nextBtn;
    }

    public List<CustomWebElement> getInboundFlightTimeSelectBtns(){
        return inboundFlightTimeSelectBtn;
    }

    public  List<CustomWebElement> getOutboundAvailableFlights(){
        return outboundAvilableFlights;
    }

    public List<CustomWebElement> getOutboundFlightTimeSelectBtns(){
        return outboundFlightTimeSelectBtn;
    }

    public List<CustomWebElement> getInboundAvailableFlights() {
        return inboundAvailableFlights;
    }

    public void clickFirstOutboundSelectedFlight() {
        wait.waitForElementIsClickable(getOutboundAvailableFlights().get(0));
        logger.info("select first outbound selected flight");
        getOutboundAvailableFlights().get(0).click();
    }


    public void clickFirstInboundAvailableFlight() {
        wait.waitForElementIsClickable(getInboundAvailableFlights().get(0));
        logger.info("select first inbound available flight");
        Scroll.scrollToElement(driver, getInboundAvailableFlights().get(0));
        getInboundAvailableFlights().get(0).click();
        wait.pause(2000);
    }

    public void clickFirstInboundFlightTimeSelectBtn(){
        wait.waitForElementIsClickable(getInboundFlightTimeSelectBtns().get(0));
        logger.info("select first  time  of inbound flight");
        Scroll.scrollToElement(driver,getInboundFlightTimeSelectBtns().get(0));
        getInboundFlightTimeSelectBtns().get(0).click();

    }

    public void clickFirstOutboundFlightTimeSelectBtn(){
        wait.waitForElementIsClickable(getOutboundFlightTimeSelectBtns().get(0));
        logger.info("select first  time  of outbound flight");
        getOutboundFlightTimeSelectBtns().get(0).click();
        wait.pause(2000);

    }


    public void clickNextBtn(){
        Actions action = new Actions(driver);
        action.click(getNextBtn()).build().perform();
        //getNextBtn().click();
    }
}
