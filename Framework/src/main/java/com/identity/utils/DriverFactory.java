package com.identity.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

    public static WebDriver driver = null;
    public static WebDriverWait driverWait = null;

    static {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver/chromedriver.exe");
        driver = new ChromeDriver(capabilities);
        driverWait = new WebDriverWait(driver, 10);
    }

    public static WebDriver getDriver() {
        return driver;
    }
    public static void closeDriver() {
        if(driver != null)
            driver.close();
    }


}
