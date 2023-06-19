package com.jejakin.test.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/Jejakin.json",
                "html:target/cucumber-reports/jejakin.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/featureJejakin/jejakin.feature",
        glue = {"com/jejakin/test/stepsDefs"},
        monochrome = true,
        dryRun = false,
        tags = "@Jejakin"
)

public class testRunner extends AbstractTestNGCucumberTests {
}
