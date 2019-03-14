package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
             "html:target/default-cucumber-reports",
              "json:target/cucumber.json"
        },
        features = {"src/test/resources/features"},
        glue = "step_definitions"
        , dryRun = false
        , tags = "@wip"
)
public class CukesRunner {


}