package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        webDriver.get("https://www.google.com");

        WebElement webElement = webDriver.findElement(By.name("q"));
        webElement.sendKeys("Kodilla");
        webElement.submit();
    }
}