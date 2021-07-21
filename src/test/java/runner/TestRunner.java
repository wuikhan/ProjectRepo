package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		features="src/test/resources/features/accounts",
		glue="steps",
		monochrome=true
		)
public class TestRunner {

}
