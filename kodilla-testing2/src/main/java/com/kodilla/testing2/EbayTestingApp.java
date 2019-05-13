package com.kodilla.testing2;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayTestingApp {
    public static void main(String[] args){
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        webDriver.get("https://www.ebay.com/");

        WebElement webElement = webDriver.findElement(By.id("gh-ac"));
        webElement.sendKeys("Laptop");
        webElement.submit();
    }
}
