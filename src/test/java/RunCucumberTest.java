import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports"})//, tags = "@smoke")
//@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports"}, tags = "@smoke")
public class RunCucumberTest {
}
