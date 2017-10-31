package transavia.pages;

import com.epam.mentoring.framework.ui_utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "routeSelection_DepartureStation-input")
    private WebElement airportFromInput;

    @FindBy(id = "routeSelection_ArrivalStation-input")
    private WebElement airportToInput;

    @FindBy(xpath = ".//input[@id=\"routeSelection_DepartureStation-input\"]/..//li")
    private List<WebElement> airportFromDDL;

    @FindBy(xpath = ".//input[@id=\"routeSelection_DepartureStation-input\"]/..//li")
    private WebElement airportFrom;

    @FindBy(xpath = ".//input[@id=\"routeSelection_ArrivalStation-input\"]/..//li")
    private List<WebElement> airportToDDL;

    @FindBy(xpath = ".//input[@id=\"routeSelection_ArrivalStation-input\"]/..//li")
    private WebElement airportTo;

    @FindBy(css = ".label--bold--bp0")
    private WebElement returnOnCheckbox;

    @FindBy(id = "dateSelection_IsReturnFlight-datepicker")
    private WebElement returnDateInput;

    @FindBy(id = "dateSelection_OutboundDate-datepicker")
    private WebElement departureDateInput;

    @FindBy(id = "booking-passengers-input")
    private WebElement passengersInputBtn;

    @FindBy(css = ".desktop .button-primary")
    private WebElement searchBtn;

    @FindBy(css = ".selectfield.adults .decrease")
    private WebElement adultsDecreaseBtn;

    @FindBy(css = ".selectfield.adults .increase")
    private WebElement adultsIncreaseBtn;

    @FindBy(css = ".selectfield.children .decrease")
    private WebElement childrensDecreaseBtn;

    @FindBy(css = ".selectfield.children .increase")
    private WebElement childrensIncreaseBtn;

    @FindBy(css = ".close")
    private WebElement savePassengersCountBtn;

    @FindBy(xpath = "//li[@class='primary-navigation_item']/a[text()[contains(.,'Manage your booking')]]")
    private WebElement manageYourBookingBtn;

    @FindBy(xpath = "//span[@class=\"sub-navigation-level-1_link-text\" and contains(text(),\"View your booking\")]")
    private WebElement viewYourBooking;


    public WebElement getViewYourBooking() {
        return viewYourBooking;
    }

    public boolean isViewYourBookingDisplayed() {
        return getViewYourBooking().isDisplayed();
    }

    public WebElement getManageYourBookingBtn() {
        return manageYourBookingBtn;
    }

    public WebElement getAirportFromInput() {
        return airportFromInput;

    }

    public void clickAirportFromInput() {
        getAirportFromInput().click();
    }

    public boolean isAirportFromInputDisplayed() {
        return getAirportFromInput().isDisplayed();
    }

    public void  sendCityNameToAirportFromInput(String city){
         getAirportFromInput().sendKeys(city);
    }

    public void selectAirportFrom(String city) {
        Wait.pause(7000);
        wait.waitForPageLoaded(driver, 10000);
        wait.waitForElementIsClickable(getAirportFromInput());
        clickAirportFromInput();

        selectAirport(true, city);
    }

    public WebElement getAirportFrom() {
        return airportFrom;
    }

    public void clickAirportFrom(){
        getAirportFrom().click();
    }

    public WebElement getAirportTo() {
        return airportTo;
    }

    public void clickAirportTo(){
        getAirportTo().click();
    }

    public List<WebElement> getAirportsFromDDL() {
        return airportFromDDL;
    }


    public WebElement getAirportsToInput() {
        return airportToInput;
    }

    public void clickAirportToInput() {
        getAirportsToInput().click();
    }

    public void  sendCityNameToAirportToInput(String city){
        getAirportsToInput().sendKeys(city);
    }

    public boolean isAirportToInputDisplayed() {
        return getAirportsToInput().isDisplayed();
    }

    public void chooseAirportFrom(String city){
        clickAirportFromInput();
        sendCityNameToAirportFromInput(city);
        wait.waitForElementIsClickable(getAirportFrom());
        clickAirportFrom();
    }

    public void chooseAirportTo(String city){
        clickAirportToInput();
        sendCityNameToAirportToInput(city);
        wait.waitForElementIsClickable(getAirportTo());
        clickAirportTo();
    }

    public void selectAirportTo(String city) {
        clickAirportFromInput();
        Wait.pause(6000);
        selectAirport(false, city);
    }

    public List<WebElement> getAirportsToDDL() {
        return airportToDDL;
    }

    public WebElement getDepartureDateInput() {
        return departureDateInput;
    }

    public boolean isDePartureDateInputDisplayed() {
        return getDepartureDateInput().isDisplayed();
    }

    public WebElement getReturnDateInput() {
        return returnDateInput;
    }

    public boolean isReturnDateInputDisplayed() {
        return getReturnDateInput().isDisplayed();
    }

    public String getReturnDateInputText() {
        return getReturnDateInput().getText();
    }

    public WebElement getReturnOnCheckbox() {
        return returnOnCheckbox;
    }

    public void clickReturnOnCheckbox() {
        getReturnOnCheckbox().click();
    }

    public boolean isReturnOnCheckboxDisplayed() {
        return getReturnOnCheckbox().isDisplayed();
    }

    public WebElement getPassengersInputBtn() {
        return passengersInputBtn;
    }

    public void clickPasengersInputBtn() {
        getPassengersInputBtn().click();
    }

    public boolean isPassengersInputBtnDisplayed() {
        return getPassengersInputBtn().isDisplayed();
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public void clickSearchBtn() {
        getSearchBtn().click();
    }

    public boolean isSearchBtnDisplayed() {
        return getSearchBtn().isDisplayed();
    }

    public WebElement getAdultsDecreaseBtn() {
        return adultsDecreaseBtn;
    }

    public void clickAdultsDecreaseBtn() {
        getAdultsDecreaseBtn().click();
    }

    public boolean isAdultsDecreaseBtnDisplayed() {
        return getAdultsDecreaseBtn().isDisplayed();
    }

    public WebElement getAdultsIncreaseBtn() {
        return adultsIncreaseBtn;
    }

    public void clickAdultsIncreaseBtn() {
        wait.waitForElementIsClickable(getAdultsIncreaseBtn());
        getAdultsIncreaseBtn().click();
    }

    public boolean isAdultsIncreaseDisplayed() {
        return getAdultsIncreaseBtn().isDisplayed();
    }

    public WebElement getChildrensDecreaseBtn() {
        return childrensDecreaseBtn;
    }

    public void clickChildrensDecreaseBtn() {
        getChildrensDecreaseBtn().click();
    }

    public boolean isChildrensDecreaseBtnDisplayed() {
        return getChildrensDecreaseBtn().isDisplayed();
    }

    public WebElement getChildrensIncreaseBtn() {
        return childrensIncreaseBtn;
    }

    public void clickChildrensIncreaseBtn() {
        wait.waitForElementIsClickable(getChildrensIncreaseBtn());
        getChildrensIncreaseBtn().click();
    }

    public boolean isChildrensIncreaseBtnDisplayed() {
        return getChildrensIncreaseBtn().isDisplayed();
    }


    public WebElement getSavePassengersCountBtn() {
        return savePassengersCountBtn;
    }

    public void clickSavePassengersCountBtn() {
        getSavePassengersCountBtn().click();
    }

    public boolean isSavePassengersCountBtn() {
        return getSavePassengersCountBtn().isDisplayed();
    }


    public void sendDepartureDateInput(String date) {
        getDepartureDateInput().sendKeys(date);
    }

    public void sendReturnDateInput(String date) {
        getReturnDateInput().sendKeys(date);
    }

    private void selectAirport(boolean isFrom, String city) {
        List<WebElement> airports = null;
        if (isFrom) {
            airports = getAirportsFromDDL();
        } else {
            airports = getAirportsToDDL();
        }

        for (WebElement airport : airports) {
            if (airport.getText().contains(city))
              //  Scroll.scrollToElement(driver,airport);
                airport.click();
        }
    }


}
