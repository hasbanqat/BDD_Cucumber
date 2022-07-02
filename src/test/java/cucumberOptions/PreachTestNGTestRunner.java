package cucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(
        features = "src/test/java/features/registration.feature/",
        glue = "stepDefinition",
        plugin={"pretty","html:target/results.html","json:target/results.json", "junit:target/results.xml"}
)
public class PreachTestNGTestRunner extends AbstractTestNGCucumberTests {
}
