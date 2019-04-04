package cucumberWebTest.stepDefinitions.frontend;

import com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;



@ExtendedCucumberOptions(jsonReport = "target/UI/cucumber.json",
        //retryCount = 3,
        detailedReport = true,
//        detailedAggregatedReport = false,
        overviewReport = true,
        coverageReport = true,
        jsonUsageReport = "target/UI/cucumber-usage.json",
        usageReport = true,
        toPDF = true,
        excludeCoverageTags = {"@flaky" },
        includeCoverageTags = {"@passed" },
        outputFolder = "target/UI")
@CucumberOptions(plugin = { "html:target/UI/cucumber-html-report",
        "json:target/UI/cucumber.json", "pretty:target/UI/cucumber-pretty.txt",
        "usage:target/UI/cucumber-usage.json", "junit:target/UI/cucumber-results.xml" },
        features = {"C:\\Users\\Kostadin Mladenov\\Documents\\Coding\\IntelliJ Projects\\onlineStore\\src\\test\\resources\\features\\frontend\\"},
        glue = {"cucumberWebTest.stepDefinitions"},
        tags = {"@UITest"})


public class RunWebTest extends ExtendedTestNGRunner{

}