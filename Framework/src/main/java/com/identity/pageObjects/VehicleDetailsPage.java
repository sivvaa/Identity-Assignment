package com.identity.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VehicleDetailsPage extends Page {

    private List<WebElement> getDetails() {
        return getElements("//div[@id = 'pr3']/ul", "li");
    }

    public String getVehicleColor() {
        WebElement makeElement = getDetails().get(2);
        return makeElement.findElements(By.tagName("span")).get(1).findElement(By.tagName("strong")).getText();
    }

    public String getVehicleMake() {
        WebElement makeElement = getDetails().get(1);
        return makeElement.findElements(By.tagName("span")).get(1).findElement(By.tagName("strong")).getText();
    }
}
