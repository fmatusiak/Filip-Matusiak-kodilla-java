package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public final static String FIREFOX = "FIREFOX_DRIVER";

    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.gecko.driver", "/home/elliot/Desktop/geckodriver");

        if (driver.equals(FIREFOX)) {
            return new FirefoxDriver();
        }
        return null;
    }
}
