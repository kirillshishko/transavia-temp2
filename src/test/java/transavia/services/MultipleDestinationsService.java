package transavia.services;

import org.openqa.selenium.WebDriver;
import transavia.pages.MultipleDestinationsPage;


public class MultipleDestinationsService extends AbstractService{

    private MultipleDestinationsPage multipleDestinationsPage;
    public MultipleDestinationsService(WebDriver driver) {
        super(driver);
        multipleDestinationsPage = new MultipleDestinationsPage(driver);
    }

    public MultipleDestinationsService fillingBookingForm(String outboundCityFrom, String outboundCityTo , String outboundDate,
                                                          String inboundCityFrom, String inboundCityTo, String inboundDate){

        multipleDestinationsPage.setOutboundFlightFrom(outboundCityFrom);
        multipleDestinationsPage.setOutboundFlightTo(outboundCityTo);
        multipleDestinationsPage.setOutboundFlightDate(outboundDate);

        multipleDestinationsPage.setInboundFlightFrom(inboundCityFrom);
        multipleDestinationsPage.setInboundFlightTo(inboundCityTo);
        multipleDestinationsPage.setInboundFlightDate(inboundDate);

        multipleDestinationsPage.clickSearchButton();

        return this;
    }

    public MultipleDestinationsService selectFlights(){
        multipleDestinationsPage.clickOutboundFlightSelectButton();
        multipleDestinationsPage.clickInboundFlightSelectButton();

        return this;
    }

    public boolean compareTicketsCost(){
        return multipleDestinationsPage.getTotalAmount() ==
                multipleDestinationsPage.getOutboundFlightPrice() + multipleDestinationsPage.getInboundFlightPrice();
    }
    public double getTotalAmount(){ return multipleDestinationsPage.getTotalAmount();}
}
