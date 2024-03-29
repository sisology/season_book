package com.common;

public class Condition {

    private String option;
    private String value;

    public Condition() {
    }

    public Condition(String option, String value) {
        this.option = option;
        this.value = value;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "option='" + option + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
