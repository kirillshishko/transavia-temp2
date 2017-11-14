package transavia.pages;

import com.epam.mentoring.framework.ui_utils.Scroll;
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
    private List<WebElement> inboundAvailiableFlights;

    @FindBy(css = ".panel-total button[name=\"next_button\"]")
    private WebElement nextBtn;

    @FindBy(css = ".outbound .flight-result-button")
    private List<WebElement> outboundFlightTimeSelectBtn;

    @FindBy(css = ".inbound .flight-result-button")
    private List<WebElement> inboundFlightTimeSelectBtn;

    public String getErrorMessageText() {
        return getErrorMessage().getText();
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getNextBtn() {
        return nextBtn;
    }

    public List<WebElement> getInboundSelectedFlight() {
        return inboundAvailiableFlights;
    }

    public List<WebElement> getInboundFlightTimeSelectBtns(){
        return inboundFlightTimeSelectBtn;
    }

    public  List<WebElement> getOutboundAviliableFlights(){
        return outboundAviliableFlights;
    }

    public List<WebElement> getOutboundFlightTimeSelectBtns(){
        return outboundFlightTimeSelectBtn;
    }

    public List<WebElement> getInboundAvailiableFlights() {
        return inboundAvailiableFlights;
    }

    public void clickFirstOutboundSelectedFlight() {
        wait.waitForElementIsClickable(getOutboundAviliableFlights().get(0));
        logger.info("select first outbound selected flight");
        getOutboundAviliableFlights().get(0).click();
    }


    public void clickFirstInboundAvailableFlight() {
        wait.waitForElementIsClickable(getInboundSelectedFlight().get(0));
        logger.info("select first inbound avaliable flight");
        Scroll.scrollToElement(driver,getInboundAvailiableFlights().get(0));
        getInboundAvailiableFlights().get(0).click();
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
        wait.waitForElementIsClickable(getNextBtn());
        getNextBtn().click();
    }
}
