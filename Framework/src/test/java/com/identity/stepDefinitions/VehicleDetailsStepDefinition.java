package com.identity.stepDefinitions;

import com.identity.model.Vehicle;
import com.identity.pageObjects.HomePage;
import com.identity.pageObjects.VehicleDetailsPage;
import com.identity.pageObjects.VehicleEnquiryPage;
import com.identity.utils.DriverFactory;
import com.identity.utils.ReadFileData;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class VehicleDetailsStepDefinition {

    private HomePage homePage = null;
    private Vehicle vehicle = new Vehicle();
    private VehicleEnquiryPage vehicleEnquiryPage = null;
    private VehicleDetailsPage vehicleDetailsPage = null;

    @Given("^A \"([^\"]*)\" with vehicle details$")
    public void readVehicleRegistration(String vehicleDetailsDataFileName) throws Throwable {
        vehicle = ReadFileData.getVehicleData(vehicleDetailsDataFileName);
    }

    @Given("^The Vehicle Information Page is running$")
    public void openHomePage() throws Throwable {
        homePage = new HomePage();
        homePage.init();
    }

    @When("^I click on Start now button$")
    public void i_click_on_Start_now_button() throws Throwable {
       vehicleEnquiryPage = homePage.goToVehicleEnquiryPage();
    }

    @Then("^Vehicle Enquiry Details page is displayed\\.$")
    public void vehicle_Registration_Details_page_is_displayed() throws Throwable {
        Assert.assertTrue("Vehicle Enquiry Page is not displayed", vehicleEnquiryPage.verifyPageHeader());
    }

    @When("^I enter Vehicle registration details and submit the page$")
    public void i_enter_Vehicle_registration_details_and_submit_the_page() throws Throwable {
        vehicleEnquiryPage.enterRegistrationNumber(vehicle.getRegistrationNumber());
        vehicleDetailsPage = vehicleEnquiryPage.getVehicleDetails();
    }

    @Then("^Vehicle details page is displayed with the color and make details$")
    public void vehicle_details_page_is_displayed_with_the_color_and_make_details() throws Throwable {
        Assert.assertTrue("Vehicle Make is incorrect", vehicleDetailsPage.getVehicleMake().equalsIgnoreCase(vehicle.getMake()));
        Assert.assertTrue("Vehicle Color is incorrect", vehicleDetailsPage.getVehicleColor().equalsIgnoreCase(vehicle.getColor()));
    }


    @After
    public void closeDriver() {
        DriverFactory.closeDriver();
    }

}
