package com.identity.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleEnquiryPage extends Page {

    public static final String PAGE_HEADER = "Enter the registration number of the vehicle";

    @FindBy(linkText = "Vrm")
    private WebElement vehicleRegistrationNumber;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement continueButton;

    public boolean verifyPageHeader() {
        return getPageHeader().equalsIgnoreCase(PAGE_HEADER);
    }
    public void enterRegistrationNumber(String registrationNumber) {
        vehicleRegistrationNumber.sendKeys(registrationNumber);
    }

    public VehicleDetailsPage getVehicleDetails() {
        continueButton.click();
        return PageFactory.initElements(getDriver(), VehicleDetailsPage.class);
    }
}
