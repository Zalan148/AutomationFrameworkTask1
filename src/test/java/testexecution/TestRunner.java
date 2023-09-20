package testexecution;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
        features="src/test/resources/features",
        glue={"org.trello"},
        tags = "@zalantestc",
        plugin = {"pretty", "html:target/HtmlReports/report.html",
                "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml"}
)



public class TestRunner extends AbstractTestNGCucumberTests {




}





