package org.Cucumber_ForPractice;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/org/Cucumber_ForPractice", glue = "org.StepDefinition_For_Practice",
monochrome = true,tags = "@loginFunction", plugin = {"html:target/cucumber.html"})
public class testRunner_Practice extends AbstractTestNGCucumberTests {
}
