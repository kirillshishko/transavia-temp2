package transavia.core;

import com.epam.mentoring.framework.ui_utils.PropertyProvider;
import com.epam.mentoring.framework.webdriverfactory.FactoryDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import transavia.services.HomePageService;

public class BaseTest {
    protected WebDriver driver;
    protected HomePageService homePageService;

    @BeforeSuite
    public void setUp(){
        driver = FactoryDriver.getInstance();
        driver.get(PropertyProvider.getProperty("url"));
        homePageService = new HomePageService(driver);
    }


 /*   @AfterSuite
    public void teardown(){
        FactoryDriver.closeDriver();
        driver = null;
    }*/
}
