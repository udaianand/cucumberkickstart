package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Aanand\\Project\\Selenium_Workspace_Tutorial\\BDDFramework\\src\\main\\java\\features\\login.feature", glue = {
		"stepDefinitions" }, plugin = { "pretty", "html:target\\cucumber-reports" }, monochrome = true)

public class TestRunner {

}
