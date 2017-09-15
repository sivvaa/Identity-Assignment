package com.identity.pageObjects;

import com.identity.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * An abstract class to define all the common methods for all the page objects
 */
public abstract class Page extends DriverFactory{


    /**
     * Method to return the text in <h1> tags
     * @return
     */
    public String getPageHeader() {
        return waitForElement(driver.findElement(By.xpath("//h1[@class = 'heading-large']"))).getText();
    }

    public List<WebElement> getElements(String xpath, String tag) {
        WebElement parentElement = driver.findElement(By.xpath(xpath));
        return parentElement.findElements(By.tagName(tag));
    }

    public WebElement getElementByXpath(String xpath) {
        return getDriver().findElement(By.xpath(xpath));
    }
}
