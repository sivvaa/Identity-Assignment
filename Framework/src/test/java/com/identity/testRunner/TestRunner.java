package com.identity.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features"},
        glue = {"com.identity.stepDefinitions"},
        format = { "pretty", "html:target/cucumber" }
)
public class TestRunner {
}

