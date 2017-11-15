package transavia.pages;

import com.epam.mentoring.framework.decorator.CustomWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "routeSelection_DepartureStation-input")
    private CustomWebElement airportFromInput;

    @FindBy(id = "routeSelection_ArrivalStation-input")
    private CustomWebElement airportToInput;

    @FindBy(xpath = ".//input[@id=\"routeSelection_DepartureStation-input\"]/..//li")
    private List<CustomWebElement> airportFromDDL;

    @FindBy(xpath = ".//input[@id=\"routeSelection_DepartureStation-input\"]/..//li")
    private CustomWebElement airportFrom;

    @FindBy(xpath = ".//input[@id=\"routeSelection_ArrivalStation-input\"]/..//li")
    private List<CustomWebElement> airportToDDL;

    @FindBy(xpath = ".//input[@id=\"routeSelection_ArrivalStation-input\"]/..//li")
    private CustomWebElement airportTo;

    @FindBy(css = ".label--bold--bp0")
    private CustomWebElement returnOnCheckbox;

    @FindBy(id = "dateSelection_IsReturnFlight-datepicker")
    private CustomWebElement returnDateInput;

    @FindBy(id = "dateSelection_OutboundDate-datepicker")
    private CustomWebElement departureDateInput;

    @FindBy(id = "booking-passengers-input")
    private CustomWebElement passengersInputBtn;

    @FindBy(css = ".desktop .button-primary")
    private CustomWebElement searchBtn;

    @FindBy(css = ".selectfield.adults .decrease")
    private CustomWebElement adultsDecreaseBtn;

    @FindBy(css = ".selectfield.adults .increase")
    private CustomWebElement adultsIncreaseBtn;

    @FindBy(css = ".selectfield.children .decrease")
    private CustomWebElement childrensDecreaseBtn;

    @FindBy(css = ".selectfield.children .increase")
    private CustomWebElement childrensIncreaseBtn;

    @FindBy(css = ".close")
    private CustomWebElement savePassengersCountBtn;

    @FindBy(xpath = "//li[@class='primary-navigation_item']/a[text()[contains(.,'Manage your booking')]]")
    private CustomWebElement manageYourBookingBtn;

    @FindBy(xpath = "//span[@class=\"sub-navigation-level-1_link-text\" and contains(text(),\"View your booking\")]")
    private CustomWebElement viewYourBooking;


    public CustomWebElement getViewYourBooking() {
        return viewYourBooking;
    }

    public boolean isViewYourBookingDisplayed() {
        return getViewYourBooking().isDisplayed();
    }

    public CustomWebElement getManageYourBookingBtn() {
        return manageYourBookingBtn;
    }

    public CustomWebElement getAirportFromInput() {
        return airportFromInput;

    }

    public void clickAirportFromInput() {
        getAirportFromInput().click();
    }

    public boolean isAirportFromInputDisplayed() {
        return getAirportFromInput().isDisplayed();
    }

    public void sendCityNameToAirportFromInput(String city) {
        getAirportFromInput().sendKeys(city);
    }

    public CustomWebElement getAirportFrom() {
        return airportFrom;
    }

    public void clickAirportFrom() {
        getAirportFrom().click();
    }

    public CustomWebElement getAirportTo(){
        return airportTo;
    }

    public void clickAirportTo() {
        getAirportTo().click();
    }




    public CustomWebElement getAirportsToInput() {
        return airportToInput;
    }

    public void clickAirportToInput() {
        getAirportsToInput().click();
    }

    public void sendCityNameToAirportToInput(String city) {
        getAirportsToInput().sendKeys(city);
    }

    public boolean isAirportToInputDisplayed() {
        return getAirportsToInput().isDisplayed();
    }

    public void chooseAirportFrom(String city) {
        clickAirportFromInput();
        sendCityNameToAirportFromInput(city);
        wait.waitForElementIsClickable(getAirportFrom());
        clickAirportFrom();
    }

    public void chooseAirportTo(String city) {
        clickAirportToInput();
        sendCityNameToAirportToInput(city);
        wait.waitForElementIsClickable(getAirportTo());
        clickAirportTo();
    }


    public CustomWebElement getDepartureDateInput() {
        return departureDateInput;
    }

    public boolean isDePartureDateInputDisplayed() {
        return getDepartureDateInput().isDisplayed();
    }

    public CustomWebElement getReturnDateInput() {
        return returnDateInput;
    }

    public boolean isReturnDateInputDisplayed() {
        return getReturnDateInput().isDisplayed();
    }

    public String getReturnDateInputText() {
        return getReturnDateInput().getText();
    }

    public CustomWebElement getReturnOnCheckbox() {
        return returnOnCheckbox;
    }

    public void clickReturnOnCheckbox() {
        getReturnOnCheckbox().click();
    }

    public boolean isReturnOnCheckboxDisplayed() {
        return getReturnOnCheckbox().isDisplayed();
    }

    public CustomWebElement getPassengersInputBtn() {
        return passengersInputBtn;
    }

    public void clickPasengersInputBtn() {
        getPassengersInputBtn().click();
    }

    public boolean isPassengersInputBtnDisplayed() {
        return getPassengersInputBtn().isDisplayed();
    }

    public CustomWebElement getSearchBtn() {
        return searchBtn;
    }

    public void clickSearchBtn() {
        getSearchBtn().click();
    }

    public boolean isSearchBtnDisplayed() {
        return getSearchBtn().isDisplayed();
    }

    public CustomWebElement getAdultsDecreaseBtn() {
        return adultsDecreaseBtn;
    }

    public void clickAdultsDecreaseBtn() {
        getAdultsDecreaseBtn().click();
    }

    public boolean isAdultsDecreaseBtnDisplayed() {
        return getAdultsDecreaseBtn().isDisplayed();
    }

    public CustomWebElement getAdultsIncreaseBtn() {
        return adultsIncreaseBtn;
    }

    public void clickAdultsIncreaseBtn() {
        wait.waitForElementIsClickable(getAdultsIncreaseBtn());
        getAdultsIncreaseBtn().click();
    }

    public boolean isAdultsIncreaseDisplayed() {
        return getAdultsIncreaseBtn().isDisplayed();
    }

    public CustomWebElement getChildrensDecreaseBtn() {
        return childrensDecreaseBtn;
    }

    public void clickChildrensDecreaseBtn() {
        getChildrensDecreaseBtn().click();
    }

    public boolean isChildrensDecreaseBtnDisplayed() {
        return getChildrensDecreaseBtn().isDisplayed();
    }

    public CustomWebElement getChildrensIncreaseBtn() {
        return childrensIncreaseBtn;
    }

    public void clickChildrensIncreaseBtn() {
        wait.waitForElementIsClickable(getChildrensIncreaseBtn());
        getChildrensIncreaseBtn().click();
    }

    public boolean isChildrensIncreaseBtnDisplayed() {
        return getChildrensIncreaseBtn().isDisplayed();
    }


    public CustomWebElement getSavePassengersCountBtn() {
        return savePassengersCountBtn;
    }

    public void clickSavePassengersCountBtn() {
        getSavePassengersCountBtn().click();
    }

    public boolean isSavePassengersCountBtn() {
        return getSavePassengersCountBtn().isDisplayed();
    }


    public void sendDepartureDateInput(String date) {
        getDepartureDateInput().clear();
        getDepartureDateInput().sendKeys(date);
    }

    public void sendReturnDateInput(String date) {
        getReturnDateInput().clear();
        getReturnDateInput().sendKeys(date);
    }



}
