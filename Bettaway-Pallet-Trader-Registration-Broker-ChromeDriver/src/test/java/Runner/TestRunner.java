 package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-Pallet-Trader-Registration-Broker-ChromeDriver\\src\\test\\java\\features\\RegistrationBroker.feature",


glue={"StepDefinitions"},
plugin= {"pretty", "html:target/site/cucumber-pretty",
		"json:target/cucumber.json",},
		//"de.monochromata.cucumber.report.PrettyReports:target/cucumber"	},
monochrome=true
)












public class TestRunner {

}
