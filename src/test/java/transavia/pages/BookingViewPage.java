package transavia.pages;


import com.epam.mentoring.framework.decorator.CustomWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BookingViewPage extends AbstractPage {

    public BookingViewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[@class='footnote-paragraph']")
    private CustomWebElement bookingNumber;
    @FindBy(xpath = "//p[@class='flight-info_value']/time")
    private CustomWebElement departureDate;
    @FindBy(css = ".panel .icon-left-side")
    private CustomWebElement bookingDetailsButton;

    public CustomWebElement getBookingNumber() {
        return bookingNumber;
    }

    public CustomWebElement getDepartureDate() {
        return departureDate;
}

    public CustomWebElement getBookingDetailsButton() {
        return bookingDetailsButton;
    }

     public String getBookingNumberText(){

            logger.info("get booking number");
            return getBookingNumber().getText();
        }

        public String getDepartureDateText(){

            logger.info("get departure date");
            return getDepartureDate().getText();
        }
    public void clickBookingDetailsButton(){
        wait.forElementIsClickable(getBookingDetailsButton());
        logger.info("click 'Booking details' button");
        getBookingDetailsButton().click();
    }
}
