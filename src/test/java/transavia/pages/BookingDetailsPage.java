package transavia.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingDetailsPage extends AbstractPage {

    public BookingDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='front']")
    private WebElement totalSum;
    @FindBy(xpath = "//*[contains(text(),'Transaction overview')]/following-sibling::div//*[@class='amount']")
    private WebElement paymentAmount;

    public String getTotalSum(){

        logger.info("get total sum");
        System.out.println("total = " +totalSum.getText());
        return totalSum.getText();
    }

    public String getPaymentAmount(){

        logger.info("get payment amount");
        System.out.println("amount = " +paymentAmount.getText());
        return paymentAmount.getText();
    }
}
