package Com.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
					 glue = {"Com.StepDefination"},
					 plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json"},
					 tags = "@record1"
)

public class CucumberRunner {

}