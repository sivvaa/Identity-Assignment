package com.identity.pageObjects;

import com.identity.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class Page extends DriverFactory{


    public String getPageHeader() {
        return driver.findElement(By.tagName("h1")).getText();
    }

    public List<WebElement> getElements(String xpath, String tag) {
        WebElement parentElement = driver.findElement(By.xpath(xpath));
        return parentElement.findElements(By.tagName(tag));
    }
}
