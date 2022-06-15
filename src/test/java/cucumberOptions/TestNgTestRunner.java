package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
glue = "stepDefinations",dryRun = true, tags = "@hello",
plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json"})

public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
