package com.epam.mentoring.framework.ui_utils;

public enum Months {

    Jan("Jan"),Feb("Feb"),Mar("Mar"),Apr("Apr"),May("May"),Jun("Jun"),Jul("Jul"),Aug("Aug"),Sep("Sep"),Oct("Oct"),Nov("Nov"),Dec("Dec");

    private String value;
    Months(String value) { this.value = value; }

    public String getValue() {
        return value;
    }

}
