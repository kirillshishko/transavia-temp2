package transavia.pages;


import com.epam.mentoring.framework.decorator.CustomWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class LoginPage extends AbstractPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "retrieveBookingByLastname_RecordLocator")
    private CustomWebElement bookingNumberTextbox;
    @FindBy(id = "retrieveBookingByLastname_LastName")
    private CustomWebElement lastNameTextbox;
    @FindBy(id = "retrieveBookingByLastname_FlightDate-datepicker")
    private CustomWebElement flightDateTextbox;
    @FindBy(xpath = "//button[contains(@class,'button-primary')]")
    private CustomWebElement viewBookingButton;

    public CustomWebElement getBookingNumberTextbox() {
        return bookingNumberTextbox;
    }

    public CustomWebElement getLastNameTextbox() {
        return lastNameTextbox;
    }

    public CustomWebElement getFlightDateTextbox() {
        return flightDateTextbox;
    }

    public CustomWebElement getViewBookingButton() {
        return viewBookingButton;
    }

    public void clickFlightDate(){
        getLastNameTextbox().click();
    }


    public void sendBookingNumber(String number){
        wait.waitForPageLoaded(driver, TIMEOUT);
        wait.forElementIsClickable(getBookingNumberTextbox() );
        getBookingNumberTextbox() .sendKeys(number);
        logger.info("set booking number : " +number);
    }
    public void sendLastName(String lastName){
        wait.forElementIsClickable(getLastNameTextbox());
        getLastNameTextbox().sendKeys(lastName);
        logger.info("set last name : " +lastName);
    }

    public void sendFlightDate(String date){
        wait.forElementIsClickable(getFlightDateTextbox());
        getFlightDateTextbox().sendKeys(date);
        clickFlightDate();
        logger.info("set flight date : " +date);
        wait.pause(2000);
    }


    public void clickViewBookingButton(){

        wait.forElementIsClickable(getViewBookingButton());
        getViewBookingButton().click();
        logger.info("click view booking button");
    }
}
