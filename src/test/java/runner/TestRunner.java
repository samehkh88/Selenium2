package runner;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import tests.TestBase;

@CucumberOptions(features = "src/test/java/features"
        , glue = {"steps"}
        , plugin = {"pretty" , "html:target/cucumber-html-report"})
public class TestRunner extends TestBase {

    // the test runner shout extend from TestBase
    // TestBase should extend from AbstractTestNGCucumberTests to make cucumber work
    // to run it parallel i should add plugin maven-surefire-plugin and override this method

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}