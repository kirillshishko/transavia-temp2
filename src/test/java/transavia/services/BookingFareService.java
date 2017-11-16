package transavia.services;


import org.openqa.selenium.WebDriver;
import transavia.pages.BookingFarePage;

public class BookingFareService extends AbstractService{

    private BookingFarePage bookingFarePage;
    public BookingFareService(WebDriver driver) {
        super(driver);
        bookingFarePage = new BookingFarePage(driver);
    }

    public BookingFareService selectFarePlus(){
        bookingFarePage.clickSelectButton();
        return this;
    }

    public double getTotalPrice(){
       return bookingFarePage.getTotalPriceFromText();
    }

    public boolean compareTicketsPrice(){

        return getTotalPrice() == getPriceForPerson() * 3 ;
    }

    public double getPriceForPerson(){return  bookingFarePage.getPriceForPersonFromText();}
}
