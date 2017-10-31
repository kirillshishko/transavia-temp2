package transavia.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FarePage extends AbstractPage {
    public FarePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//tfoot//button[@value='B'][1]")
    private WebElement selectButton;
    @FindBy(xpath = "//tfoot//td[2]//*[contains(@class,'pull-right')]")
    private WebElement priceForPerson;
    @FindBy(xpath = "//*[@class='flipper']/div[@class='front']")
    private WebElement totalPrice;

    public void clickSelectButton(){

        wait.waitForPageLoaded(driver,10000);
        wait.waitForElementIsClickable(selectButton);
        selectButton.click();
        logger.info("click select button");

    }

    public double getPriceForPerson(){
        wait.waitForPageLoaded(driver,10000);
        wait.waitForElementAppearing(priceForPerson);
        String personPrice = priceForPerson.getText();
        String price = personPrice.substring(2,personPrice.length());
        double priceDouble = Double.parseDouble(price);
        System.out.println("price for person : " +priceDouble);
        return  priceDouble;

    }

    public double getTotalPrice(){
        wait.waitForElementAppearing(totalPrice);
        String price = totalPrice.getText();
        String total = price.substring(2,price.length());
        double totalDouble = Double.parseDouble(total);
        System.out.println("total price = " +totalDouble);
        return totalDouble;
    }

}
