Feature: Verify the vehicle details.

  Scenario Outline: Validate vehicle details
    Given A "<CSV File>" with vehicle details
    And The Vehicle Information Page is running
    When I click on Start now button
    Then Vehicle Enquiry Details page is displayed.
    When I enter Vehicle registration details and submit the page
    Then Vehicle details page is displayed with the color and make details

  Examples:
    | CSV File            |
    | VehicleDetails.xlsx  |



