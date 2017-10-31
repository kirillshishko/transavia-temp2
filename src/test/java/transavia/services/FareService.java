package transavia.services;


import org.openqa.selenium.WebDriver;
import transavia.pages.FarePage;

public class FareService extends AbstractService{

    private FarePage farePage;
    public FareService(WebDriver driver) {
        super(driver);
        farePage = new FarePage(driver);
    }

    public FareService selectFarePlus(){
        farePage.clickSelectButton();
        return this;
    }

    public double getTotalPrice(){
       return farePage.getTotalPrice();
    }
    public boolean compareTicketsPrice(){

        return getTotalPrice() == getPriceForPerson() * 3 ;
    }

    public double getPriceForPerson(){return  farePage.getPriceForPerson();}
}
