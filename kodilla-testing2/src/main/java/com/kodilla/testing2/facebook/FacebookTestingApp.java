package com.kodilla.testing2.facebook;


import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES_BUTTON = "//div[contains(@class, \"_9xo5\")]/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";


    public static void main(String[] args) {
        WebDriver driverFb = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driverFb.get("https://www.facebook.com");

        driverFb.findElement(By.xpath(XPATH_COOKIES_BUTTON)).click();

        driverFb.findElement(By.xpath(XPATH_NEW_ACCOUNT)).click();

        WebElement selectComboDay = driverFb.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(6);

        WebElement selectComboMonth = driverFb.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(6);

        WebElement selectComboYear = driverFb.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByValue("1987");

    }
}
