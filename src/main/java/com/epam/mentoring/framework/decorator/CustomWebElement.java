package com.epam.mentoring.framework.decorator;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;

import java.util.List;

public class CustomWebElement implements  WebElement{
    private WebElement webElement;
    private Logger logger = LogManager.getRootLogger();

    public CustomWebElement(WebElement webElement) {
        this.webElement = webElement;
    }

    @Override
    public void click() {
        logger.info("click webElement:  " + webElement.getText());
        webElement.click();

    }

    public void submit() {
        logger.info("Submit webElement : " + webElement);
        webElement.submit();
    }

    public void sendKeys(CharSequence... charSequences) {
        logger.info("SendKeys to  webElement :  " + webElement.getText());
        webElement.sendKeys(charSequences);
    }

    public void clear() {
        logger.info("Clear webElement : " + webElement.getText());
        webElement.clear();
    }

    public String getTagName() {
        logger.info("Get tag name  : " + webElement.getTagName());
        return webElement.getTagName();
    }

    public String getAttribute(String s) {
        logger.info("Get attribute of   : " + webElement.getAttribute(s));
        return webElement.getAttribute(s);
    }

    public boolean isSelected() {
        logger.info("Is webElement " + webElement + " selected ");
        return webElement.isSelected();
    }

    public boolean isEnabled() {
        logger.info("Is webElement " + webElement + " enabled ");
        return webElement.isEnabled();
    }

    public String getText() {
        logger.info("Get text of " + webElement.getText());
        return webElement.getText();
    }

    public List<WebElement> findElements(By by) {
        logger.info("Find elements by : " + by);
        return webElement.findElements(by);
    }

    public WebElement findElement(By by) {
        logger.info("Find webElement by :" + by);
        return webElement.findElement(by);
    }

    public boolean isDisplayed() {
        logger.info("Is webElement " + webElement + " displayed");
        return webElement.isDisplayed();
    }

    public Point getLocation() {
        logger.info("Get location of : " + webElement);
        return webElement.getLocation();
    }

    public Dimension getSize() {
        logger.info("Get dimension of : " + webElement);
        return webElement.getSize();
    }

    public Rectangle getRect() {
        logger.info("Get location and size of : " + webElement);
        return webElement.getRect();
    }

    public String getCssValue(String s) {
        logger.info("Get css value of : " + webElement);
        return webElement.getCssValue(s);
    }

    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        logger.info("Get screenshot of : " + webElement);
        return webElement.getScreenshotAs(outputType);
    }
}
