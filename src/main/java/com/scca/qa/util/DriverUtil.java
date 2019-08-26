package com.scca.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {

    public static WebDriver setUpDriver(String browserName) {
        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/TheBestOrNothing/Downloads/chromedriver 2");
            return new ChromeDriver();
        } else {
            throw new IllegalArgumentException("Not valid input");
        }
    }

    public static void closeDriver(WebDriver driver) {
        driver.close();
    }
}
