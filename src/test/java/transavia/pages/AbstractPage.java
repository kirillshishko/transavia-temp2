package transavia.pages;

import com.epam.mentoring.framework.decorator.CustomFieldDecorator;
import com.epam.mentoring.framework.ui_utils.Wait;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



public abstract class AbstractPage {

    protected WebDriver driver;
    protected Actions actions;
    protected Wait wait;
    protected Logger logger = LogManager.getRootLogger();


    public AbstractPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new CustomFieldDecorator(driver),this);
        actions = new Actions(this.driver);
        wait = new Wait(driver);

    }



}
