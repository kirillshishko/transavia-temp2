package transavia.core;

import com.epam.mentoring.framework.core.PropertyProvider;
import com.epam.mentoring.framework.webdrivers.WebDriverFactoryManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import transavia.services.HomePageService;

public class BaseTest {
    protected WebDriver driver;
    protected HomePageService homePageService;

    @BeforeSuite
    public void setUp(){
        driver = WebDriverFactoryManager.getInstance();
        driver.get(PropertyProvider.getProperty("url"));
        homePageService = new HomePageService(driver);
    }


    @AfterSuite
    public void teardown(){
        WebDriverFactoryManager.closeDriver();
        driver = null;
    }
}
