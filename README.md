# Identity-Assignment
<b>The Project is a multi-module maven project</b>
* Metdata Service - The file meta data service
* Framework - Cucumber E2E tests
* Identity_E2E - Parent module

## Prerequisites
*	Maven installed and configured the environment variable
*	Java 8 installed and configured the environment variable
*	IntelliJ / Eclipse IDE for a code walk through (optional)
*	ChromeDriver for browser automation (included in the project).

# Part 1 - Metadata Service
* The directory and supported MIME types are configured in `config.properties`. This file is available in the parent module (Identity_E2E\config.properties). 
* The code reads the configured directory and returns the meta data the files in the configured directory.

* To execute the code, configure the required directory and supported MIME types in `config.properties` file. 
* Open the command prompt and go to the above project root (/ MeataData Service) and run the following command <br>
 `mvn clean compile`<br>
 `mvn exec:java -Dexec.mainClass="org.identity.client.ServiceClient"`
* This will display the list of files in the directory configured in `config.properties`along with the meta data, also the supported MIME types.

# Part 2 - Framework (E2E tests)
* This is written in java and cucumber, implemented Page Object Model design pattern.
* The behaviour is defined in `vehicledetails.feature`. This is available in `src/test/features`.
* The excel file that contains the vehicle registration details must be specified in `vehicledetails.feature` and the file should be placed in the directory configured in `config.properties`.
* This module uses Metadata Service module to get the configured MIME types. Please see the `pom.xml` of Framework module.
* To execute, open the command prompt and navigate to the parent module `Identity_E2E` (/>Identity_E2E) and run the following command <br>
` mvn clean test`
* The basic reports will be published in the location `Identity_E2E/Framework/target/cucumber`. 
* Alternatively, the project can be executed from IDE.

# Screenshot of Test run and Results
![ScreenShot](https://github.com/sivvaa/Identity-Assignment/blob/master/TestResults.png)

`NOTE – The framework now works only for one record in Excel / CSV sheet.`

# What is NOT implemented
* Logging
* Exception Handling.
* Negative scenarios.

# What can be implemented if additional time is allowed
* Executing the tests for multiple records in Excel sheet.
* Exception handling
* Logging
* Enhanced reporting
* Negative scenarios


