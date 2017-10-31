package com.epam.mentoring.framework.webdrivers;

import com.epam.mentoring.framework.core.PropertyProvider;
import com.epam.mentoring.framework.webdrivers.factory.ChromeDriverFactory;
import com.epam.mentoring.framework.webdrivers.factory.FireFoxDriverFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactoryManager {
    private static final WebDriverFactory firefoxDriverFactory = new FireFoxDriverFactory();
    private static final WebDriverFactory chromeDriverFactory = new ChromeDriverFactory();
    private static final Logger logger = Logger.getLogger("wowLogger");
    private static WebDriver driver;

    public static WebDriver getDriverOf(BrowserType browserType) {
        WebDriverFactory webDriverFactory;
        switch (browserType) {
            case CHROME:
                webDriverFactory = chromeDriverFactory;
                logger.info("Chrome driver created");
                break;
            case FIREFOX:
                webDriverFactory = firefoxDriverFactory;
                logger.info("Firefox driver created");
                break;
            default:
                webDriverFactory = firefoxDriverFactory;
                logger.info("Firefox driver created");
        }

        return webDriverFactory.getDriverOf(browserType);
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            BrowserType type = BrowserType.valueOf(PropertyProvider.getProperty("browser"));
            driver = getDriverOf(type);
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get(PropertyProvider.getProperty("url"));
        return driver;
    }


    public static void closeDriver() {
        driver.quit();
        driver = null;
        logger.info("Driver has been closed");
    }
}
