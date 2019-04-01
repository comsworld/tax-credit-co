package cucumberWebTest.stepDefinitions.api;


import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner;
import cucumber.api.CucumberOptions;


@ExtendedCucumberOptions(jsonReport = "target/API/cucumber.json",
        retryCount = 3,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        coverageReport = true,
        jsonUsageReport = "target/API/cucumber-usage.json",
        usageReport = true,
        toPDF = true,
        excludeCoverageTags = {"@flaky" },
        includeCoverageTags = {"@passed" },
        outputFolder = "target/API")
@CucumberOptions(plugin = { "html:target/API/cucumber-html-report",
        "json:target/API/cucumber.json", "pretty:target/API/cucumber-pretty.txt",
        "usage:target/API/cucumber-usage.json", "junit:target/API/cucumber-results.xml" },
        features = {"C:\\Users\\Kostadin Mladenov\\Documents\\Coding\\IntelliJ Projects\\onlineStore\\src\\test\\resources\\features\\frontend\\"},
        glue = {"cucumberWebTest.stepDefinitions"},
        tags = {"@APITest"})


public class RunApiTest extends ExtendedTestNGRunner{

}