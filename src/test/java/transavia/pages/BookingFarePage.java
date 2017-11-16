package transavia.pages;


import com.epam.mentoring.framework.decorator.CustomWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BookingFarePage extends AbstractPage {
    public BookingFarePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//tfoot//button[@value='B'][1]")
    private CustomWebElement selectButton;
    @FindBy(xpath = "//tfoot//td[2]//*[contains(@class,'pull-right')]")
    private CustomWebElement priceForPerson;
    @FindBy(css = ".front")
    private CustomWebElement totalPrice;

    public CustomWebElement getSelectButton() {
        return selectButton;
    }

    public CustomWebElement getPriceForPerson() {
        return priceForPerson;
    }

    public CustomWebElement getTotalPrice() {
        return totalPrice;
    }

    public void clickSelectButton() {
        wait.waitForElementIsClickable(getSelectButton());
        getSelectButton().click();
        logger.info("click select button");

    }

    public double getPriceForPersonFromText() {
        wait.waitForElementAppearing(getPriceForPerson());
        String personPrice = getPriceForPerson().getText();
        double price = Double.parseDouble(personPrice.substring(2, personPrice.length()));
        System.out.println("price for person is  : " + price);
        return price;

    }

    public double getTotalPriceFromText() {
        wait.waitForElementAppearing(getTotalPrice());
        String price =  getTotalPrice().getText();
        double totalPrice = Double.parseDouble(price.substring(2,price.length()));
        System.out.println("total price  is " + totalPrice);
        return totalPrice;
    }

}
