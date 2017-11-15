package transavia.services;


import org.openqa.selenium.WebDriver;
import transavia.pages.BookingDetailsPage;

public class BookingDetailsService extends  AbstractService{

    private BookingDetailsPage bookingDetailsPage;
    public BookingDetailsService(WebDriver driver) {
        super(driver);
        bookingDetailsPage = new BookingDetailsPage(driver);
    }

    public boolean isTotalSumEqualsPaymentAmount(){

        return bookingDetailsPage.getTotalSumText().equals(bookingDetailsPage.getPaymentAmountText());
    }
}
