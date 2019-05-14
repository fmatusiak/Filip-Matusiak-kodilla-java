package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_MONTH = "//select[contains(@id,\"month\")]";
    public static final String XPATH_SELECT_DAY_ = "//select[contains(@id,\"day\")]";
    public static final String XPATH_SELECT_YEAR_ = "//select[contains(@id,\"year\")]";


    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        webDriver.get("https://www.facebook.com/");

        WebElement webElementMonth = webDriver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(webElementMonth);
        selectMonth.selectByIndex(10);

        WebElement webElementDay = webDriver.findElement(By.xpath(XPATH_SELECT_DAY_));
        Select selectDay = new Select(webElementDay);
        selectDay.selectByIndex(20);

        WebElement webElementYear = webDriver.findElement(By.xpath(XPATH_SELECT_YEAR_));
        Select selectYear = new Select(webElementYear);
        selectYear.selectByValue("1989");
    }
}
