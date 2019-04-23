package tccTest.stepDefinitions.frontend;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src/test/resources/features/contactPageTest.feature"},
        glue = "tccTest.stepDefinitions",
        tags = {"@ContactTest"},
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
                "testng:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports"}
)

public class RunWebTest extends AbstractTestNGCucumberTests {

}

