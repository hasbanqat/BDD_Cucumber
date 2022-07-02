package cucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinition",
        plugin={"pretty","html:target/results.html","json:target/results.json", "junit:target/results.xml"}
)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
}
