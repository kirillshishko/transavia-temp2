package com.epam.mentoring.framework.decorator;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;

import java.util.List;

public class CustomWebElement implements WebElement {
    private WebElement element;
    private Logger logger = LogManager.getRootLogger();

    public CustomWebElement(WebElement element){
        this.element = element;
    }

    @Override
    public void click() {
        logger.info("click element:  " + element.getText());
        element.click();

    }

    @Override
    public void submit() {
        logger.info("Submit element : " +element);
        element.submit();
    }


    @Override
    public void sendKeys(CharSequence... charSequences) {
        logger.info("SendKeys to  element :  " +element.getText());
        element.sendKeys(charSequences);
    }

    @Override
    public void clear() {
        logger.info("Clear element : " +element.getText());
        element.clear();
    }

    @Override
    public String getTagName() {
        logger.info("Get tag name  : "+element.getTagName());
        return element.getTagName();
    }

    @Override
    public String getAttribute(String s) {
        logger.info("Get attribute of   : " +element.getAttribute(s));
        return element.getAttribute(s);
    }

    @Override
    public boolean isSelected() {
        logger.info("Is element "+element + " selected ");
        return element.isSelected();
    }

    @Override
    public boolean isEnabled() {
        logger.info("Is element "+element + " enabled ");
        return element.isEnabled();
    }

    @Override
    public String getText() {
        logger.info("Get text of " +element.getText());
        return element.getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        logger.info("Find elements by : "+by);
        return element.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        logger.info("Find element by :" +by);
        return element.findElement(by);
    }

    @Override
    public boolean isDisplayed() {
        logger.info("Is element "+element + " displayed");
        return element.isDisplayed();
    }

    @Override
    public Point getLocation() {
        logger.info("Get location of : "+element);
        return element.getLocation();
    }

    @Override
    public Dimension getSize() {
        logger.info("Get dimension of : "+element);
        return element.getSize();
    }

    @Override
    public Rectangle getRect() {
        logger.info("Get location and size of : "+element);
        return element.getRect();
    }

    @Override
    public String getCssValue(String s) {
        logger.info("Get css value of : "+element);
        return element.getCssValue(s);
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        logger.info("Get screenshot of : " +element);
        return element.getScreenshotAs(outputType);
    }
}
