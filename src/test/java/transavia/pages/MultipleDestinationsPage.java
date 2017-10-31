package transavia.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleDestinationsPage extends AbstractPage {

    public MultipleDestinationsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "openJawRouteSelection_DepartureStationOutbound-input")
    private WebElement outboundFlightFromTextbox;
    @FindBy(xpath = "//*[@class='results']/li[1]")
    private WebElement autocompleteFrom;
    @FindBy(id = "openJawRouteSelection_ArrivalStationOutbound-input")
    private WebElement outboundFlightToTextbox;
    @FindBy(xpath = "//ol[@class='results']/li[contains(@class,'item')]")
    private WebElement autocompleteTo;
    @FindBy(id = "dateSelection_OutboundDate-datepicker")
    private WebElement outboundFlightDateTextbox;
    @FindBy(id = "openJawRouteSelection_DepartureStationInbound-input")
    private WebElement inboundFlightFromTextbox;
    @FindBy(id = "openJawRouteSelection_ArrivalStationInbound-input")
    private WebElement inboundFlightToTextbox;
    @FindBy(id = "dateSelection_InboundDate-datepicker")
    private WebElement inboundFlightDateTextbox;
    @FindBy(xpath = ".//*[@class='date-picker-suggestions']/li[@class='highlight']")
    private WebElement autocompleteDate;
    @FindBy(xpath = ".//*[@class='panel_section-button-container']/button[@type='submit']")
    private WebElement searchButton;
    @FindBy(xpath = ".//section[contains(@class,'outbound')]//div[@class='select']/span")
    private WebElement outboundFlightSelectButton;
    @FindBy(xpath = ".//section[contains(@class,'outbound')]//div[@class='actions']/div[1]")
    private WebElement outboundFlightPrice;
    @FindBy(xpath = ".//section[contains(@class,'inbound')]//div[@class='select']/span")
    private WebElement inboundFlightSelectButton;
    @FindBy(xpath = ".//section[contains(@class,'inbound')]//div[@class='actions']/div[1]")
    private WebElement inboundFlightPrice;
    @FindBy(xpath = "//*[@class='flipper']/div[@class='back']")
    private WebElement totalAmount;


    public void setOutboundFlightFrom(String cityFrom){
        wait.waitForPageLoaded(driver, 30);
        wait.waitForElementIsClickable(outboundFlightFromTextbox);
        outboundFlightFromTextbox.sendKeys(cityFrom);
        wait.waitForElementIsClickable(autocompleteFrom);
        autocompleteFrom.click();
        logger.info("set departure airport");

    }

    public void setOutboundFlightTo(String cityTo){

        wait.waitForElementIsClickable(outboundFlightToTextbox);
        outboundFlightToTextbox.sendKeys(cityTo);
        wait.waitForElementIsClickable(autocompleteTo);
        autocompleteTo.click();
        logger.info("set destination airport");

    }

    public void setOutboundFlightDate(String date){

        wait.waitForElementIsClickable(outboundFlightDateTextbox);
        outboundFlightDateTextbox.clear();
        outboundFlightDateTextbox.sendKeys(date);
        logger.info("set outbound flight date");
    }

    public void setInboundFlightFrom(String cityFrom){

        wait.waitForElementIsClickable(inboundFlightFromTextbox);
        inboundFlightFromTextbox.sendKeys(cityFrom);
        wait.waitForElementIsClickable(autocompleteFrom);
        autocompleteFrom.click();
        logger.info("set departure airport ");
    }

    public void setInboundFlightTo(String cityTo){

        wait.waitForElementIsClickable(inboundFlightToTextbox);
        inboundFlightToTextbox.sendKeys(cityTo);
        wait.waitForElementIsClickable(autocompleteTo);
        autocompleteTo.click();
        logger.info("set destination airport");
    }

    public void setInboundFlightDate(String date){

        wait.waitForElementIsClickable(inboundFlightDateTextbox);
        inboundFlightDateTextbox.clear();
        inboundFlightDateTextbox.sendKeys(date);
        inboundFlightToTextbox.click();
        logger.info("set inbound flight date");
    }

    public void clickSearchButton(){

        wait.waitForElementIsClickable(searchButton);
        searchButton.click();
        logger.info("click search button");
    }

    public void clickOutboundFlightSelectButton(){

        wait.waitForPageLoaded(driver, 30);
        wait.waitForElementIsClickable(outboundFlightSelectButton);
        outboundFlightSelectButton.click();
        logger.info("Select outbound flight");
    }

    public void clickInboundFlightSelectButton(){

        wait.waitForElementIsClickable(inboundFlightSelectButton);
        inboundFlightSelectButton.click();
        logger.info("Select inbound flight ");
        wait.waitForPageLoaded(driver,30);
    }

    public double getOutboundFlightPrice(){

        wait.waitForElementAppearing(outboundFlightPrice);
        String price = outboundFlightPrice.getText();
        String total = price.substring(2,price.length());
        double outboundPrice = Double.parseDouble(total);
        return outboundPrice;
    }

    public double getInboundFlightPrice(){

        wait.waitForElementAppearing(inboundFlightPrice);
        String price = inboundFlightPrice.getText();
        String total = price.substring(2,price.length());
        double inboundPrice = Double.parseDouble(total);
        return inboundPrice;
    }


    public double getTotalAmount(){

        wait.waitForPageLoaded(driver,30);
        wait.waitForElementAppearing(totalAmount);
        String price = totalAmount.getText();
        String total = price.substring(2,price.length());
        double totalDouble = Double.parseDouble(total);
        System.out.println("total price = " +totalDouble);
        return totalDouble;

    }

}
