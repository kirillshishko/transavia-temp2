package transavia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.Arrays;
import java.util.List;

public class Calendar extends AbstractPage {

    public Calendar(WebDriver driver) { super(driver); }


    @FindBy(xpath = ".//*[@id='dateSelection_OutboundDate-datepicker']/following-sibling::span")
    private WebElement calendarPic;
    @FindBy(xpath = ".//div[contains(@class,'is-visible')]//*[@class='ui-datepicker-month']")
    private WebElement currentMonth;
    @FindBy(xpath = ".//div[contains(@class,'is-visible')]//*[@class='ui-datepicker-year']")
    private WebElement currentYear;
    @FindBy(xpath = "//div[contains(@class,'is-visible')]//*[contains(@class,'ui-datepicker-next')]")
    private WebElement nextMonthClicker;
    @FindBys(@FindBy(xpath = "//div[contains(@class,'is-visible')]//td[not(contains(@class,'ui-state-disabled'))]"))
    private List<WebElement> availableDays;

    private List<String> monthList = Arrays.asList("JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER");



    public void setDate(String day, int month , int year, List<WebElement> listOfAvaliableDays,
                        WebElement nextMonthClicker, WebElement calendarCurrentMonth, WebElement calendarCurrentYear){

        boolean isSetDate = false;

        while (!isSetDate){

            String currMonth = currentMonth.getText().toUpperCase();
            String currYear = currentYear.getText().toUpperCase();

            int monthIndex = monthList.indexOf(currMonth);
            int yearI = Integer.parseInt(currYear);

            if( (monthIndex + 1 == month ) & yearI == year) {

                for (WebElement currDate : listOfAvaliableDays) {

                }
            }
        }
    }
}
