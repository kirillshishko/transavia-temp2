package com.epam.mentoring.framework.webdrivers.factory;

import com.epam.mentoring.framework.webdrivers.BrowserType;
import com.epam.mentoring.framework.webdrivers.WebDriverFactory;
import javafx.scene.shape.Path;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;

import static com.google.common.base.Preconditions.checkState;
import static org.testng.util.Strings.isNullOrEmpty;


public class FireFoxDriverFactory implements WebDriverFactory {
    @Override
    public WebDriver getDriverOf(BrowserType webDriverType) {
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary(getFireFoxBinary());
        return new FirefoxDriver(options);
    }

    private String getFireFoxBinary() {
        String binaryPath = System.setProperty("src\\main\\resources\\browser\\firefox\\geckodriver.exe",GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY);
        checkState(!isNullOrEmpty(binaryPath), "FireFox driver path must be specified");
        return binaryPath;
    }
}
