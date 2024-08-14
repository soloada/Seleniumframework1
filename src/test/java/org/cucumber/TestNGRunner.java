package org.cucumber;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/org/cucumber",glue="org.StepDefinition",
 monochrome=true, tags = "@verifyHeader", plugin= {"html:target/cucumber.html"})
public class TestNGRunner  extends AbstractTestNGCucumberTests {


}
