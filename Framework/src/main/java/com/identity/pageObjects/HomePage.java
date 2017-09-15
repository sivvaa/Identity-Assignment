package com.identity.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page {

    public static final String HOMEPAGE_URL = "https://www.gov.uk/get-vehicle-information-from-dvla";

    @FindBy(linkText = "Start now")
    private WebElement startNow;

    public void init() {
        getDriver().get(HOMEPAGE_URL);
        PageFactory.initElements(getDriver(), HomePage.class);
    }

    public VehicleEnquiryPage goToVehicleEnquiryPage() {
        startNow.click();
        return PageFactory.initElements(driver, VehicleEnquiryPage.class);
    }
}
