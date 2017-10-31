package com.epam.mentoring.framework.ui_utils;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Wait {
    private WebDriver driverWait;
    private org.openqa.selenium.support.ui.Wait<WebDriver> wait;
    private WebElement element;

    public Wait(WebDriver driver) {
        this.driverWait = driver;
        wait = new WebDriverWait(this.driverWait, 10).ignoring(StaleElementReferenceException.class, WebDriverException.class)
                .withMessage("Element was not found by locator ");
    }

    public Wait(WebDriver driver, int time) {
        this.driverWait = driver;
        wait = new WebDriverWait(driver, time).ignoring(StaleElementReferenceException.class, WebDriverException.class)
                .withMessage("Element was not found by locator ");
    }

    public void waitForElementIsClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForTextInElement(WebElement element, String text) {
        wait.until(ExpectedConditions.textToBePresentInElementValue(element,text));
    }

    public void  waitForPageLoaded(WebDriver driver , long timeout){
        new FluentWait<>(driver).withTimeout(timeout, TimeUnit.SECONDS).pollingEvery(1000,TimeUnit.MILLISECONDS)
                .until(new Function<WebDriver, Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver ).executeScript("return document.readyState").equals("complete");
                    }
                });
    }


    public void waitForElementAppearing(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public static void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

