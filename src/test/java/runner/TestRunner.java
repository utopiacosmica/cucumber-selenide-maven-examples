package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features = {"src/test/java/features/Login.feature"}, glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests {
}
