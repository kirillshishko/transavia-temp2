package com.epam.mentoring.framework.ui_utils;


import java.util.ResourceBundle;

public class PropertyProvider {
    private static final String CONFIG_PATH = "config";
    private static final ResourceBundle bundle = ResourceBundle.getBundle(CONFIG_PATH);

    public static String getProperty(String propertyName) {
        return bundle.getString(propertyName);
    }


}
