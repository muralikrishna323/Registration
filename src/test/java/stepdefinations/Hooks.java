package stepdefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import io.cucumber.java.After;

public class Hooks  extends RegistrationStepDefination{
	
	@After(order=1)
	public void takeScreenShotOnFailure(Scenario scenario) {
		
		if(scenario.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] src=ts.getScreenshotAs(OutputType.BYTES);
			scenario.embed(src,"image/png" );
		}
		
	}
	
	@After(order =0)
	public void tearDown() {
		driver.close();
	}

}
