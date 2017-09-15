package com.identity.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Page object representing the page - https://vehicleenquiry.service.gov.uk/ConfirmVehicle
 */
public class VehicleDetailsPage extends Page {

    /**
     * Method to read the list of all details of the vehicle
     * @return
     */
    private List<WebElement> getDetails() {
        return getElements("//div[@id = 'pr3']/div/ul", "li");
    }

    /**
     * Method that returns the color of the vehicle
     * @return
     */
    public String getVehicleColor() {
        WebElement makeElement = getDetails().get(2);
        return makeElement.findElements(By.tagName("span")).get(1).findElement(By.tagName("strong")).getText();
    }

    /**
     * Method that returns the make of the vehicle
     * @return
     */
    public String getVehicleMake() {
        WebElement makeElement = getDetails().get(1);
        return makeElement.findElements(By.tagName("span")).get(1).findElement(By.tagName("strong")).getText();
    }
}
