package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",

        /* For both tag to run @RegTest and @SmokeTest [need to satisfy both]
        For both tag to run @RegTest or @SmokeTest [need to satisfy anyone of these tag]
        For not to run any tag not @SanityTest [Except sanity all of the tag will run]

        2 more attributes for cucumberOptions: for dryrun=true means to check the mapping feature to stepdefinition
        and monochrome = true the same thing with a good looking output and.
        */
        glue = "stepDefinition",tags = "", stepNotifications = true,
        plugin={"pretty","html:target/results.html","json:target/results.json", "junit:target/results.xml"}
)
public class JUnitTestRunner {


}
