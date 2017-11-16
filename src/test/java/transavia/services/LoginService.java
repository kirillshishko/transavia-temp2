package transavia.services;


import org.openqa.selenium.WebDriver;
import transavia.pages.LoginPage;

public class LoginService extends AbstractService {

    private LoginPage loginPage;
    public LoginService(WebDriver driver) {
        super(driver);
        loginPage = new LoginPage(driver);
    }


    public BookingViewService fillingBookingData(String number,String lastName,String date){

        loginPage.sendBookingNumber(number);
        loginPage.sendLastName(lastName);
        loginPage.sendFlightDate(date);
        loginPage.clickViewBookingButton();
        return new BookingViewService(driver);
    }
}
