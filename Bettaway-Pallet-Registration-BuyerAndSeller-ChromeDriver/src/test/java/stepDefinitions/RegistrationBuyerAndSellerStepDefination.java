package stepDefinitions;







import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import PageObjects3.RegistrationBuyerAndSellerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationBuyerAndSellerStepDefination {

	WebDriver driver;
	public WebDriver initializeDriver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-Pallet-Registration-BuyerAndSeller-ChromeDriver\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	}


@Given(": User navigates to the website myapp.pallettrader.com")
public void user_navigates_to_the_website_myapp_pallettrader_com() {
	driver=initializeDriver() ;
	driver.get("http://stage.pallettrader.com/#/");
	driver.findElement(By.xpath("//input[1]")).sendKeys("PalletWorld");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("PalletSaleTime@2022");
	driver.findElement(By.xpath("//button[normalize-space()='SUBMIT']")).click();
}

@When(": User Enter the signup page")
public void user_enter_the_signup_page() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getRegistration().click();
}

@When(": User Enter the Registration form")
public void user_enter_the_registration_form() {
	WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",element);  
}

@When(": User Enter the valid UserName")
public void user_enter_the_valid_user_name() {
PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
both.getUsername().sendKeys("AutomationTester");
}

@When(": User Enter the valid EmailId")
public void user_enter_the_valid_email_id() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getEmail().sendKeys("1989c@mailinator.com");
}
@When(": User Enter the valid PassWord")
public void user_enter_the_valid_pass_word() {
PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
both.getpassword().sendKeys("Automation@123");
}
@When(": User Enter the valid Conform Password")
public void user_enter_the_valid_conform_password() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getConfirmPassword().sendKeys("Automation@123");
}

@When(": User Enter the valid CompanyName")
public void user_enter_the_valid_company_name() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getCompanyNamel().sendKeys("PalletTrader");
}

@When(": User Enter the valid Cell Phone Number")
public void user_enter_the_valid_cell_phone_number() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getPhoneNumber().sendKeys("315-280-8677");
}
@When(": User Enter the valid Address1 Name")
public void user_enter_the_valid_address1_name() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getAddress1().sendKeys("2827 Gandy Street");
}

@When(": User Enter the valid Address2 Name")
public void user_enter_the_valid_address2_name() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getAddress2().sendKeys("Testing");
}
@When(": User Enter the valid  City Name")
public void user_enter_the_valid_city_name() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getCity().sendKeys("Syracuse");
}
@When(": User Enter DropDown  and Select State")
public void user_enter_drop_down_and_select_state() throws InterruptedException {
	Thread.sleep(2000);
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getselectdropdown().click();
	 Thread.sleep(2000);  
		driver.findElement(By.xpath("//div[text()='NY-New York']")).click();
}

@When(": User Enter the valid locationZipCode")
public void user_enter_the_valid_location_zip_code() {
PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getlocationZipCode().sendKeys("13202");
}
@When(": User Enter the SumbitButton")
public void user_enter_the_sumbit_button() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getSubmit().click();
}
@When(": User Enter the valid OTP in popup Screen")
public void user_enter_the_valid_otp_in_popup_screen() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getOtp().sendKeys("223345");
}
@When(": User Enter the GreenSumbitButton")
public void user_enter_the_green_sumbit_button() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getGreenButton().click();
}
@Then(": User verified EmaiId")
public void user_verified_emai_id() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getVerifiedEmailid().click();
}


@When(": User Enter the Not Register for  the Broker")
public void user_enter_the_not_register_for_the_broker() throws InterruptedException {
	 WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
}
@When(": User Enter the register for this platform to BuyerPallets")
public void user_enter_the_register_for_this_platform_to_buyer_pallets() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getRegisterforTheBuyer().click();
}
@When(": User Enter the register for this platform to SellerPallets")
public void user_enter_the_register_for_this_platform_to_seller_pallets() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
 both.getRegisterforTheSeller().click();
}
//@When(": User Enter the company operate  multiple locations")
//public void user_enter_the_company_operate_multiple_locations() {
   
//}
@When(": User Enter the company operate  multiple locations")
public void user_enter_the_company_operate_multiple_locations() throws InterruptedException {
	Thread.sleep(2000);
	   WebElement element2=driver.findElement(By.xpath("//label[normalize-space()='Multiple']"));
		JavascriptExecutor executor2=(JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();",element2);
}
@When(": User Enter the Payment options")
public void user_enter_the_payment_options() throws InterruptedException {
	WebElement element3=driver.findElement(By.xpath("//label[contains(text(),'One centralized corporate account handles payments')]"));
	JavascriptExecutor executor3=(JavascriptExecutor)driver;
	executor3.executeScript("arguments[0].click();",element3);
	Thread.sleep(2000);	  
}
@When(": User Enter the Valid TaxId")
public void user_enter_the_valid_tax_id() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getTaxId().sendKeys("232222222");
}
@When(": User Enter the Valid DNB\\/DUNS")
public void user_enter_the_valid_dnb_duns() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getDNBDUNS().sendKeys("45-455-5555");
}



@When(": User Enter the BusinessURL")
public void user_enter_the_business_url() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getURL().sendKeys("https://www.officeplace.com/");
}
@When(": User Enter the BusinessDescription")
public void user_enter_the_business_description() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getBusinessDescription().sendKeys("Business Description");
}

@When(": User Enter the SellersRemittance Information")
public void user_enter_the_sellers_remittance_information() throws InterruptedException {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
	JavascriptExecutor executor4=(JavascriptExecutor)driver;
	executor4.executeScript("arguments[0].click();",element4);
	Thread.sleep(2000);


}
@When(": User Enter the Name on the Card")
public void user_enter_the_name_on_the_card() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
   both.getNameOnTheCard().sendKeys("AutomationQa");
}
@When(": User Enter the valid Card Number")
public void user_enter_the_valid_card_number() {
	driver.switchTo().frame(0);
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
  both.getCardNumber().sendKeys("6011981111111113");
}
@When(": User Enter the valid Expiration Date")
public void user_enter_the_valid_expiration_date() throws InterruptedException {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	driver.switchTo().parentFrame();
	Thread.sleep(3000);
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
	both.getExpirationDate().sendKeys("0424");
}
@When(": User Enter the valid CVC\\/CVV Number")
public void user_enter_the_valid_cvc_cvv_number() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
  
   driver.switchTo().parentFrame();
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
	both.getCVCCVVNumber().sendKeys("123");
	driver.switchTo().parentFrame();
	}


@When(": User Enter the validate SellerRemittance Information")
public void user_enter_the_validate_seller_remittance_information() throws InterruptedException {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
	JavascriptExecutor executor5=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	executor5.executeScript("arguments[0].click();",element5);
	
	
}
@When(": User Sumbit the popup alert")
public void user_sumbit_the_popup_alert() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);

	both.getPopupAlert().click(); 
}



@When(": User Enter the BuyerPaymentInformation")
public void user_enter_the_buyer_payment_information() throws InterruptedException {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	WebElement element4=driver.findElement(By.xpath("//label[@for='buyerDebitCard']//span[@class='radio-checkmark']"));
	JavascriptExecutor executor4=(JavascriptExecutor)driver;
	executor4.executeScript("arguments[0].click();",element4);
	Thread.sleep(2000);
}
@When(": User Enter the Name on the Card1")
public void user_enter_the_name_on_the_card1() throws InterruptedException {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	both.getNameOnTheCard1().sendKeys("AutomationTester");
}
@When(": User Enter the valid Card Number1")
public void user_enter_the_valid_card_number1() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
both.getCardNumber1().sendKeys("4000056655665556");

}
@When(": User Enter the valid Expiration Date1")
public void user_enter_the_valid_expiration_date1() throws InterruptedException {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	driver.switchTo().parentFrame();
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));

	Thread.sleep(3000);
	//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
	both.getExpirationDate1().sendKeys("0426");
}
@When(": User Enter the valid CVC\\/CVV Number1")
public void user_enter_the_valid_cvc_cvv_number1() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	driver.switchTo().parentFrame();
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
	both.getCVCCVVNumber1().sendKeys("183");
	driver.switchTo().parentFrame();
	
}
@When(": User Enter the validate BuyersPaymentInformation")
public void user_enter_the_validate_buyers_payment_information() throws InterruptedException {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
	JavascriptExecutor executor5=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	executor5.executeScript("arguments[0].click();",element5);
}
@When(": User Sumbit the popup alert1")
public void user_sumbit_the_popup_alert1() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
both.getPopupAlert1().click();
}


@When(": User Enter the MembershipPaymentInformation with NameOnTheCard")
public void user_enter_the_membership_payment_information_with_name_on_the_card() throws InterruptedException {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	Thread.sleep(2000);
	both.getMembershipName().sendKeys("AutomationTester");
}  
@When(": User Enter the valid Card Number for MembershipPayment")
public void user_enter_the_valid_card_number_for_membership_payment() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
    both.getMembershipCardNumber().sendKeys("5200828282828210");
}
@When(": User Enter the valid Expiration Date for MembershipPayment")
public void user_enter_the_valid_expiration_date_for_membership_payment() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	driver.switchTo().parentFrame();
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
	both.getMembershipExpirationDate().sendKeys("0525");
}
@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment")
public void user_enter_the_valid_cvc_cvv_number_for_membership_payment() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	driver.switchTo().parentFrame();
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
	both.getMembershipCVCCVVNumber().sendKeys("183");
	driver.switchTo().parentFrame();
}
@When(": User Enter the validate MembershipPaymentInformation")
public void user_enter_the_validate_membership_payment_information() throws InterruptedException {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	WebElement element8=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
	JavascriptExecutor executor8=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	executor8.executeScript("arguments[0].click();",element8);
}
@When(": User Sumbit the popup alert2")
public void user_sumbit_the_popup_alert2() throws InterruptedException {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	Thread.sleep(2000);
	both.getPopupAlert2().click();
}
@When(": User Enter the Next Step")
public void user_enter_the_next_step() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	JavascriptExecutor executor10=(JavascriptExecutor)driver;
	executor10.executeScript("arguments[0].click();",element10);
}


@When(": User Accept Subscription Fee")
public void user_accept_subscription_fee() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	WebElement element8=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
	JavascriptExecutor executor8=(JavascriptExecutor)driver;
	executor8.executeScript("arguments[0].click();",element8);
}
@When(": User Acknowledged and Agree")
public void user_acknowledged_and_agree() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	WebElement element9=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
	JavascriptExecutor executor9=(JavascriptExecutor)driver;
	executor9.executeScript("arguments[0].click();",element9);
}
@When(": User Enter the Sumbit Button1")
public void user_enter_the_sumbit_button1() {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
	JavascriptExecutor executor10=(JavascriptExecutor)driver;
	executor10.executeScript("arguments[0].click();",element10);
}
@Then(": User Sucessfully Registered With Valid Credentials")
public void user_sucessfully_registered_with_valid_credentials() throws InterruptedException {
	PageObjects3.RegistrationBuyerAndSellerPage both=new RegistrationBuyerAndSellerPage(driver);
	Thread.sleep(20000);
	both.getSucessfullyRegistered().click();
}















}