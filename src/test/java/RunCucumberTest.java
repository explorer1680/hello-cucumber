import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports"})
//@CucumberOptions(
//        features = "src/test/resources/selenium/selenium_tutorial_step1.feature",
//        glue = {"selenium"},
//        plugin = {"pretty", "html:target/cucumber-reports"},
//        tags = "@smoke",
//        monochrome = true)
public class RunCucumberTest {
}
