package gmiBank.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\default-cucumber_reports.html",
                "json:target\\json-reports/cucumber.json",
                "junit:target\\xml-report/cucumber.xml" },
        features="src/test/resources/features",
        glue= "gmiBank/stepDefinitions",
        dryRun = false

)
public class GmiBankRunner {

}
