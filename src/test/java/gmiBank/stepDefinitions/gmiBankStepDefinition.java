package gmiBank.stepDefinitions;

import cucumber.api.java.en.Given;
import gmiBank.utilities.ConfigurationReader;
import gmiBank.utilities.Driver;

public class gmiBankStepDefinition {
    @Given("user go to {string}")
    public void userGoTo(String url) {
        Driver.getDriver().get(ConfigurationReader.getProperty(url));
    }

}
