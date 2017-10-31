package transavia.services;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public abstract class AbstractService {
    protected WebDriver driver;
    protected Logger logger = LogManager.getRootLogger();


    public AbstractService(WebDriver driver){
        this.driver = driver;
    }
}
