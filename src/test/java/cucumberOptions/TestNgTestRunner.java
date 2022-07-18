package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
glue = "stepDefinations",
        tags = "@HBOCTag1 or @HBOCTag2 or @HBOCTag3 or @HBOCTag4 or @HBOCTag5 or @HBOCTag6 or @HBOCTag7 or @HBOCTag8 or @HBOCTag9 or @HBOCTag10",
plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
