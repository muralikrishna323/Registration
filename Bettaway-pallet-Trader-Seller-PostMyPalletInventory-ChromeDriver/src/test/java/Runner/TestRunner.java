package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-pallet-Trader-Seller-PostMyPalletInventory-ChromeDriver\\src\\test\\java\\features\\SellerPostMyPalletInventory.feature",


glue={"StepDefination"},
plugin= {"pretty", "html:target/site/cucumber-pretty",
		"json:target/cucumber.json",},
		//"de.monochromata.cucumber.report.PrettyReports:target/cucumber"	},
monochrome=true
)
















public class TestRunner {

}
