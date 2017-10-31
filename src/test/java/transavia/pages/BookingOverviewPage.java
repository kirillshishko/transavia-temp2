package transavia.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingOverviewPage extends AbstractPage {

    public BookingOverviewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[@class='footnote-paragraph']")
    private WebElement bookingNumber;
    @FindBy(xpath = "//p[@class='flight-info_value']/time")
    private WebElement departureDate;
    @FindBy(css = ".panel .icon-left-side")
    private WebElement bookingDetailsButton;

    public String getBookingNumber(){

        logger.info("get booking number");
        return bookingNumber.getText();
    }

    public String getDepartureDate(){

        logger.info("get departure date");
        return departureDate.getText();
    }

    public void clickBookingDetailsButton(){
        wait.waitForElementIsClickable(bookingDetailsButton);
        logger.info("click 'Booking details' button");
        bookingDetailsButton.click();
    }
}
