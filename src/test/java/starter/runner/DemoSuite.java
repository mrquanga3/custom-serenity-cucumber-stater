package starter.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/search",
        plugin = {"pretty", "json:target/cucumber.json"},
        glue = {"starter.stepdefinitions"})
public class DemoSuite {
}
