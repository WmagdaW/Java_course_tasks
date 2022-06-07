package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayTestingApp {
    public static final String SEARCHFIELD = "_nkw";

    public static void main(String[] args) {
        WebDriver driverEbay = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverEbay.get("https://www.ebay.com");

        WebElement searchField = driverEbay.findElement(By.name(SEARCHFIELD));
        searchField.sendKeys("Laptop");
        searchField.submit();

    }
}
