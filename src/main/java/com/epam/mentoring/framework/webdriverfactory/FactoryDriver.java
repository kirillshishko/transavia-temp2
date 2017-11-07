package com.epam.mentoring.framework.webdriverfactory;


import com.epam.mentoring.framework.ui_utils.PropertyProvider;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FactoryDriver {
    private static final String WEBDRIVER_GECKO_DRIVER = "gecko_driver";
    private static final String GECKODRIVER_EXE_PATH = "gecko_driver_exe";
    private static final String WEBDRIVER_CHROME_DRIVER = "chrome_driver";
    private static final String CHROMEDRIVER_EXE_PATH = "chrome_driver_exe";
    private static final Logger log = LogManager.getRootLogger();
    private static WebDriver driver;

    private FactoryDriver() { }

    private static WebDriver getActualDriver() {
        BrowserType type = BrowserType.valueOf(PropertyProvider.getProperty("browser"));
        switch (type) {
            case CHROME:
                driver = createChromeDriver();
                log.info("chrome driver created");
                break;
            case FIREFOX:
                driver = createFirefoxDriver();
                log.info("firefox driver created");
                break;
            default:
                driver = createFirefoxDriver();
                log.info("firefox driver created");
        }
        int impWait = Integer.parseInt(PropertyProvider.getProperty("implisitywait_timeout"));
        int pageWait = Integer.parseInt(PropertyProvider.getProperty("pageload_timeout"));
        int scriptWait = Integer.parseInt(PropertyProvider.getProperty("script_timeout"));
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(scriptWait, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            getActualDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
        log.info("driver has been closed");
    }


    private static WebDriver createFirefoxDriver() {
        System.setProperty(PropertyProvider.getProperty(WEBDRIVER_GECKO_DRIVER),
                PropertyProvider.getProperty(GECKODRIVER_EXE_PATH));
        return new FirefoxDriver();
    }

    private static WebDriver createChromeDriver() {
        System.setProperty(PropertyProvider.getProperty(WEBDRIVER_CHROME_DRIVER),
                PropertyProvider.getProperty(CHROMEDRIVER_EXE_PATH));
        return new ChromeDriver();
    }
}