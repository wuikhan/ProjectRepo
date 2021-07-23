package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue="steps",
		monochrome=true,
		dryRun = false,
		tags="@regression"
		)

public class KenKimTestRunner {

}