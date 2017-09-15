package com.identity.pageObjects;


import org.openqa.selenium.support.PageFactory;

/**
 * Page object representing the page - https://www.gov.uk/get-vehicle-information-from-dvla
 */
public class HomePage extends Page {

    public static final String HOMEPAGE_URL = "https://www.gov.uk/get-vehicle-information-from-dvla";
    private static final String START_NOW_BUTTON_XPATH = "//a[@data-transaction-slug = 'get-vehicle-information-from-dvla']";

    public void init() {
        getDriver().get(HOMEPAGE_URL);
        PageFactory.initElements(getDriver(), HomePage.class);
    }

    public VehicleEnquiryPage goToVehicleEnquiryPage() {
        getElementByXpath(START_NOW_BUTTON_XPATH).click();
        return PageFactory.initElements(driver, VehicleEnquiryPage.class);
    }
}
