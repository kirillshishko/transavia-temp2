package transavia.pages;


import com.epam.mentoring.framework.decorator.CustomWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BookingDetailsPage extends AbstractPage {

    public BookingDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='front']")
    private CustomWebElement totalSum;
    @FindBy(xpath = "//*[contains(text(),'Transaction overview')]/following-sibling::div//*[@class='amount']")
    private CustomWebElement paymentAmount;

    public CustomWebElement getTotalSum() {
        return totalSum;
    }

    public CustomWebElement getPaymentAmount() {
        return paymentAmount;
    }

    public String getTotalSumText() {

        logger.info("get total sum");
        System.out.println("total = " + getTotalSum().getText());
        return totalSum.getText();
    }

    public String getPaymentAmountText() {

        logger.info("get payment amount");
        System.out.println("amount = " + getPaymentAmount().getText());
        return paymentAmount.getText();
    }
}
