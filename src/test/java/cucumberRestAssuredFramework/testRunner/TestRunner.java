package cucumberRestAssuredFramework.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/cucumberRestAssuredFramework/features",
        glue="cucumberRestAssuredFramework/stepDefinitions"
)
public class TestRunner {

}
