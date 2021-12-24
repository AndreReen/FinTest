import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty", "html:report.html"},
    features = {"src/test/resources/features"},
    glue = {"steps"}
)
public class Runner {


}
