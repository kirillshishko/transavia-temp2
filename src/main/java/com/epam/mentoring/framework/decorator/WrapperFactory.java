package com.epam.mentoring.framework.decorator;

import org.openqa.selenium.WebElement;

public class WrapperFactory {
    public static WebElement createInstance(Class<WebElement> clazz,
                                            org.openqa.selenium.WebElement element) {
        try {
            return clazz.getConstructor(org.openqa.selenium.WebElement.class).
                    newInstance(element);
        } catch (Exception e) {
            throw new AssertionError(
                    "WebElement can't be represented as " + clazz
            );
        }
    }
}
