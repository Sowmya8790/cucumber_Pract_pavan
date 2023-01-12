package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//Features/", //feature file
		glue = "StepDefinitions",//package
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				"html:test-output"},
	//tags = {"@sanity","@regression"} //and
		tags = {"@sanity, @regression"} //or
		
		)
public class TestRun {

	
}
 