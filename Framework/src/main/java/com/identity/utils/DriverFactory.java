package com.identity.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Class to initialise the WebDriver and define methods on WebDriver
 *
 * The class is written as factory to provide ability to work with different types of Webdrivers. - (but for now just Chromedriver works).
 */
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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driverWait = new WebDriverWait(driver, 10);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    /**
     * Method to close the WebDriver.
     */
    public static void closeDriver() {
        if(driver != null)
            driver.close();
    }

    public WebElement waitForElement(WebElement webElement) {
        return driverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

}
