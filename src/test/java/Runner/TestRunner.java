package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mobile Programming\\eclipse-workspace\\pallet_Trader_Registration_All_Users\\src\\test\\java\\featuresWithTags\\Tags.feature",


glue={"stepdefinations"},
plugin= {"pretty", "html:target/site/cucumber-pretty",
		"json:target/cucumber.json",},
		//"de.monochromata.cucumber.report.PrettyReports:target/cucumber"	},

//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},



monochrome=true,
//tags= " @BuyerAccount or @SellerAccount or @BuyerAndSellerAccount"
	
//tags= "@BrokerAccount or @BrokerAccount1 or @BuyerAccount or @SellerAccount or @BuyerAndSellerAccount"

//tags= "@BrokerAccount1" 
//tags= " @BuyerAccountMultiplelocationwithIndependentPayment" 
//tags= " @BuyerAccountMultiplelocationwithIndependentPayment or   @BuyerAccountMultiplelocationwithCentralizedPayment or  @BuyerAccountMultiplelocationwithHybridPayment"
//tags= " @SellerAccountMultiplelocationwithIndependentPayment  or   @SellerAccountMultiplelocationwithCentralizedPayment  or  @SellerAccountMultiplelocationwithHybridPayment "
//tags= "  @BuyerAndSellerAccountSingleLocationwithLicence  " 
//tags= "       @BuyerAccountMultiplelocationwithIndependentPayment " 

tags= "@BrokerAccount or @BrokerAccount1 or  @BuyerAccountSingleLocationWithTaxID  or @BuyerAccountSingleLocationwithLicence   or @BuyerAccountMultiplelocationwithIndependentPayment    or  @SellerAccountSingleLocationWithTaxID or  @SellerAccountSingleLocationwithLicence  or @SellerAccountMultiplelocationwithCentralizedPayment or  @BuyerAndSellerAccountSingleLocationWithTaxID or  @BuyerAndSellerAccountSingleLocationwithLicence  or @BuyerandSellerAccountMultiplelocationwithIndependentPayment or  @BuyerandSellerAccountMultiplelocationwithCentralizedPayment or @BuyerandSellerAccountMultiplelocationwithHybridPayment "
		 
//tags= "@BuyerAccountSingleLocationWithTaxID" 
//tags= "@BuyerAndSellerAccountSingleLocationwithLicence" 

//tags= "@BrokerAccount or @BrokerAccount1 or  @BuyerAccountSingleLocationWithTaxID"

		)
















public class TestRunner {

}
