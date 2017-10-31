package com.epam.mentoring.framework.ui_utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
    public static void scrollToElement(WebDriver driver, WebElement element){
        String coordinats = element.getLocation().toString();

        String jsScript = "window.scroll" + coordinats;
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript(jsScript);
    }
}
