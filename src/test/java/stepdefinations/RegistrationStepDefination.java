package stepdefinations;





import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobjects.RegistrationBrokerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class RegistrationStepDefination {


WebDriver driver;
	

	public WebDriver initializeDriver() throws Throwable {

		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Mobile Programming\\eclipse-workspace\\pallet_Trader_Registration_All_Users\\src\\main\\java\\objectRepository\\properties.file");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-Pallet-Trader-Registration-Broker-Buyer-Seller-BuyerAndSeller\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-Pallet-Trader-Registration-Broker-Buyer-Seller-BuyerAndSeller\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("microsoftedge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-Pallet-Trader-Registration-Broker-Buyer-Seller-BuyerAndSeller\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().window().maximize();
return driver;
		}
		
// ------------------------Broker code-----------------------------------------


	@Given(": User navigates to the website myapp.pallettrader.com")
	public void user_navigates_to_the_website_myapp_pallettrader_com() throws Throwable {
		driver=initializeDriver() ;
		//driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");
}
	@When(": User Enter the signup page")
	public void user_enter_the_signup_page() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getRegistration().click(); 
	}
	@When(": User Enter the Registration form")
	public void user_enter_the_registration_form() {
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
	}
	@When(": User Enter the valid UserName")
	public void user_enter_the_valid_user_name() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getUsername().sendKeys("QaTester");   
	}
	//@When(": User Enter the valid EmailId")
	public void user_enter_the_valid_email_id431() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getEmail().sendKeys("1101c@mailinator.com");
	}
		public int randomFourDigitGenerator(){
			   Random rand = new Random();
			   int resRandom = 0;
			   for (int i = 1; i<= 10; i++) {
			      resRandom = rand.nextInt((9999 - 100) + 1) + 10;
			      System.out.println(resRandom);
			   }
			   return resRandom;
			
		}
		@When(": User Enter the valid EmailId")
         public void user_enter_the_valid_emailWithRandomNumber() {
			   int num = randomFourDigitGenerator();
			   String randomNum = String.valueOf(num);
			   System.out.println(randomNum);
				RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
			   r.getEmail().sendKeys(randomNum + "s@mailinator.com");
			   System.out.println(randomNum + "s@mailinator.com");
			}
	
	
	@When(": User Enter the valid PassWord")
	public void user_enter_the_valid_pass_word() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getpassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid Conform Password")
	public void user_enter_the_valid_conform_password() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getConfirmPassword().sendKeys("Test@123");    
	}
	@When(": User Enter the valid CompanyName")
	public void user_enter_the_valid_company_name() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getCompanyNamel().sendKeys("PalletTrader");  
	}
	@When(": User Enter the valid Cell Phone Number")
	public void user_enter_the_valid_cell_phone_number() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getPhoneNumber().sendKeys("315-280-8677");
	}
	@When(": User Enter the valid Address1 Name")
	public void user_enter_the_valid_address1_name() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getAddress1().sendKeys("2827 Gandy Street");
	}
	@When(": User Enter the valid Address2 Name")
	public void user_enter_the_valid_address2_name() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getAddress2().sendKeys("Testing");
	}
	@When(": User Enter the valid  City Name")
	public void user_enter_the_valid_city_name() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getCity().sendKeys("Syracuse");
	}
	@When(": User Enter DropDown  and Select State")
	public void user_enter_drop_down_and_select_state() throws InterruptedException {
		Thread.sleep(2000);
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getselectdropdown().click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//div[text()='NY-New York']")).click();
	}
	@When(": User Enter the valid locationZipCode")
	public void user_enter_the_valid_location_zip_code() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getlocationZipCode().sendKeys("13202");
	}
	/*@When(": User Enter the Promo Code or Referral Code")
	public void user_enter_the_promo_code_or_referral_code() {
		driver.findElement(By.xpath("//input[@name='promoCodeInput']")).sendKeys("WORLDSFIRST");

	}
	@When(": User Click on the apply button")
	public void user_click_on_the_apply_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@type='app-green-button']")).click();
	}
	@When(": User Sumbit the popup alert5")
	public void user_sumbit_the_popup_alert5() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click(); 
	}
	@When(": User acknowledged that this promo code")
	public void user_acknowledged_that_this_promo_code() {
		WebElement element1=driver.findElement(By.xpath("//span[@class='checkMark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
	}*/
	
	@When(": User Enter the SumbitButton5")
	public void user_enter_the_sumbit_button5() {
		WebElement element1=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
	
	}
	
	@When(": User Enter the valid OTP in popup Screen")
	public void user_enter_the_valid_otp_in_popup_screen() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getOtp().sendKeys("232336"); 
	}
	@When(": User Enter the GreenSumbitButton5")
	public void user_enter_the_green_sumbit_button5() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		Thread.sleep(2000);
		r.getGreenButton().click();     
	}
	@Then(": User verified EmaiId")
	public void user_verified_emai_id() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getVerifiedEmailid().click(); 
	}
	@When(": User Enter the Platform as a broker")
	public void user_enter_the_platform_as_a_broker() throws InterruptedException {
		WebElement element1=driver.findElement(By.xpath("//label[@for='active']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	}
	@When(": User Enter the BusinessInformationWithTaxId")
	public void user_enter_the_business_information_with_tax_id() throws InterruptedException {
		WebElement element2=driver.findElement(By.xpath("//label[normalize-space()='TAX ID']"));
		JavascriptExecutor executor2=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor2.executeScript("arguments[0].click();",element2);
	}
	@When(": User Enter the Valid TaxId")
	public void user_enter_the_valid_tax_id() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
		r.getTaxId().sendKeys("232222222");
		}
	
	@When(": User Enter the Valid DNB\\/DUNS")
	public void user_enter_the_valid_dnb_duns() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		Thread.sleep(2000);
		r.getDNBDUNS().sendKeys("45-455-5555");
	}
	@When(": User Enter the BusinessURL")
	public void user_enter_the_business_url() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);      
		r.getURL().sendKeys("https://www.officeplace.com/");
	}
	@When(": User Enter the BusinessDescription")
	public void user_enter_the_business_description() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		Thread.sleep(2000);
		r.getBusinessDescription().sendKeys("Business Description");
	}
	
	
	// ------------------------SellersRemittance InformationWithBankAccount-----------------------------------------


@When(": User Enter the SellersRemittance InformationWithBankAccount")
	public void user_enter_the_sellers_remittance_information_with_bank_account() throws InterruptedException {
		WebElement element3=driver.findElement(By.xpath("//label[normalize-space()='Bank Account']"));
		JavascriptExecutor executor3=(JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();",element3);
		Thread.sleep(2000);
	}
	@When(": User Enter AccountHolderName")
	public void user_enter_account_holder_name() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
		Thread.sleep(2000);
		r.getAccountHolderName().sendKeys("broker");
	}
	@When(": User Enter the valid BankAccountNumber")
	public void user_enter_the_valid_bank_account_number() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver); 
		Thread.sleep(2000);
		r.getBankAccountNumber().sendKeys("000999999991");
	}
	@When(": User Enter the Valid BankRoutingNumber")
	public void user_enter_the_valid_bank_routing_number() throws InterruptedException {
		Thread.sleep(2000);
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
	r.getBankRoutingNumber().sendKeys("110000000");
	}
	@When(": User Enter the validate the Information")
	public void user_enter_the_validate_the_information() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element4=driver.findElement(By.xpath("//button[@class='button app-green-button']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
	    r.getValidate().click();
	}
	
		// ------------------------BuyerPaymentInformationWithDebitCard-----------------------------------------
	
	@When(": User Enter the BuyerPaymentInformation With DebitCard")
	public void user_enter_the_buyer_payment_information_with_debit_card() throws InterruptedException {
	   WebElement element5=driver.findElement(By.xpath("//label[@for='buyerDebitCard']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();",element5);
		Thread.sleep(2000);
		
	}
	@When(": User Enter the Name on the Card")
	public void user_enter_the_name_on_the_card() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
		r.getNameOnTheCard().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number")
	public void user_enter_the_valid_card_number() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		r.getCardNumber().sendKeys("6011981111111113");
	}
	@When(": User Enter the valid Expiration Date")
	public void user_enter_the_valid_expiration_date() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		//driver.switchTo().frame(1);
		//Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		r.getExpirationDate().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number")
	public void user_enter_the_valid_cvc_cvv_number() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		r.getCVCCVVNumber().sendKeys("123");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation")
	public void user_enter_the_validate_buyers_payment_information() throws InterruptedException {
		WebElement element7=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor7=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor7.executeScript("arguments[0].click();",element7);
	}
	@When(": User Sumbit the popup alert")
	public void user_sumbit_the_popup_alert() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
	    r.getPopupAlert().click();
		}
	
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard")
	public void user_enter_the_membership_payment_information_with_name_on_the_card() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		Thread.sleep(2000);
		r.getMembershipName().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number for MembershipPayment")
	public void user_enter_the_valid_card_number_for_membership_payment() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    r.getMembershipCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for MembershipPayment")
	public void user_enter_the_valid_expiration_date_for_membership_payment() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		r.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		r.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate MembershipPaymentInformation")
	public void user_enter_the_validate_membership_payment_information() throws InterruptedException {
		WebElement element8=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Sumbit the popup alert2")
	public void user_sumbit_the_popup_alert2() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		Thread.sleep(2000);
		r.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step")
	public void user_enter_the_next_step() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	JavascriptExecutor executor10=(JavascriptExecutor)driver;
	executor10.executeScript("arguments[0].click();",element10);
	}
	@When(": User Accept Subscription Fee")
	public void user_accept_subscription_fee() throws InterruptedException {
		WebElement element11=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor11=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor11.executeScript("arguments[0].click();",element11);
		Thread.sleep(2000);
	}
	@When(": User Acknowledged and Agree")
	public void user_acknowledged_and_agree() throws InterruptedException {
		WebElement element11=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
		JavascriptExecutor executor11=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor11.executeScript("arguments[0].click();",element11);
		Thread.sleep(2000);
	}
	@When(": User Enter the Sumbit Button1")
	public void user_enter_the_sumbit_button1() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);     
		Thread.sleep(2000);
		r.getSumbitButton1().click();
	}
	@Then(": User Sucessfully Registered With Valid Credentials")
	public void user_sucessfully_registered_with_valid_credentials98() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
		Thread.sleep(5000);
		r.getSucessfullyRegistered().click();
		Thread.sleep(2000);
	driver.close();
	}



	// ------------------------Broker code2-----------------------------------------

	
	
	@Given(": User navigates to the website myapp.pallettrader.com1")
	public void user_navigates_to_the_website_myapp_pallettrader_com1() throws Throwable {
		driver=initializeDriver() ;
		//driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");
	}
	@When(": User Enter the signup page1")
	public void user_enter_the_signup_page1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getRegistration().click(); 
	}
	@When(": User Enter the Registration form1")
	public void user_enter_the_registration_form1() {
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
	}
	@When(": User Enter the valid UserName1")
	public void user_enter_the_valid_user_name1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getUsername().sendKeys("QaTester"); 
	}
	//@When(": User Enter the valid EmailId1")
	public void user_enter_the_valid_email_id1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getEmail().sendKeys("1102b@mailinator.com");
	}
	
	@When(": User Enter the valid EmailId1")
    public void user_enter_the_valid_emailWithRandomNumber1() {
		   int num = randomFourDigitGenerator();
		   String randomNum = String.valueOf(num);
		   System.out.println(randomNum);
			RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		   r.getEmail().sendKeys(randomNum + "s@mailinator.com");
		   System.out.println(randomNum + "s@mailinator.com");
		}
	
	@When(": User Enter the valid PassWord1")
	public void user_enter_the_valid_pass_word1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getpassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid Conform Password1")
	public void user_enter_the_valid_conform_password1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getConfirmPassword().sendKeys("Test@123"); 
	}
	@When(": User Enter the valid CompanyName1")
	public void user_enter_the_valid_company_name1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getCompanyNamel().sendKeys("PalletTrader");  
	}
	@When(": User Enter the valid Cell Phone Number1")
	public void user_enter_the_valid_cell_phone_number1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getPhoneNumber().sendKeys("315-280-8677"); 
	}
	@When(": User Enter the valid Address1 Name1")
	public void user_enter_the_valid_address1_name1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getAddress1().sendKeys("2827 Gandy Street");
	}
	@When(": User Enter the valid Address2 Name1")
	public void user_enter_the_valid_address2_name1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getAddress2().sendKeys("Testing");
	}
	@When(": User Enter the valid  City Name1")
	public void user_enter_the_valid_city_name1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getCity().sendKeys("Syracuse");
	}
	@When(": User Enter DropDown  and Select State1")
	public void user_enter_drop_down_and_select_state1() throws InterruptedException {
		Thread.sleep(2000);
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getselectdropdown().click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//div[text()='NY-New York']")).click();
	}
	@When(": User Enter the valid locationZipCode1")
	public void user_enter_the_valid_location_zip_code1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getlocationZipCode().sendKeys("13202");
	}
	/*@When(": User Enter the Promo Code or Referral Code1")
	public void user_enter_the_promo_code_or_referral_code1() {
		driver.findElement(By.xpath("//input[@name='promoCodeInput']")).sendKeys("");

	}
	@When(": User Click on the apply button1")
	public void user_click_on_the_apply_button1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@type='app-green-button']")).click();  
	}
	@When(": User Sumbit the popup alert51")
	public void user_sumbit_the_popup_alert51() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click(); 
	}
	@When(": User acknowledged that this promo code1")
	public void user_acknowledged_that_this_promo_code1() {
		WebElement element1=driver.findElement(By.xpath("//span[@class='checkMark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
	}*/
	@When(": User Enter the SumbitButton7")
	public void user_enter_the_sumbit_button7() {
		WebElement element1=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
	}
	@When(": User Enter the valid OTP in popup Screen1")
	public void user_enter_the_valid_otp_in_popup_screen1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getOtp().sendKeys("232336"); 
	}
	@When(": User Enter the GreenSumbitButton7")
	public void user_enter_the_green_sumbit_button7() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		Thread.sleep(2000);
		r.getGreenButton().click(); 
	}
	@Then(": User verified EmaiId1")
	public void user_verified_emai_id1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getVerifiedEmailid().click(); 
	}
	@When(": User Enter the Platform as a broker1")
	public void user_enter_the_platform_as_a_broker1() throws InterruptedException {
		WebElement element1=driver.findElement(By.xpath("//label[@for='active']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	}
	@When(": User Enter the BusinessInformationWithTaxId1")
	public void user_enter_the_business_information_with_tax_id1() throws InterruptedException {
		WebElement element2=driver.findElement(By.xpath("//label[normalize-space()='TAX ID']"));
		JavascriptExecutor executor2=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor2.executeScript("arguments[0].click();",element2);
	}
	@When(": User Enter the Valid TaxId1")
	public void user_enter_the_valid_tax_id1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
		r.getTaxId().sendKeys("232222222");
	}
	@When(": User Enter the Valid DNB\\/DUNS1")
	public void user_enter_the_valid_dnb_duns1() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		Thread.sleep(2000);
		r.getDNBDUNS().sendKeys("45-455-5555");
	}
	@When(": User Enter the BusinessURL1")
	public void user_enter_the_business_url1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);      
		r.getURL().sendKeys("https://www.officeplace.com/");
	}
	@When(": User Enter the BusinessDescription1")
	public void user_enter_the_business_description1() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		Thread.sleep(2000);
		r.getBusinessDescription().sendKeys("Business Description");
	}
	
	// ------------------------SellersRemittance InformationWithDebitCard-----------------------------------------

	@When(": User Enter the SellersRemittance InformationWithDebitCard")
	public void user_enter_the_sellers_remittance_information_with_debit_card() throws InterruptedException {
		WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card1")
	public void user_enter_the_name_on_the_card1() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
		r.getNameOnTheCard().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number1")
	public void user_enter_the_valid_card_number1() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		r.getCardNumber1().sendKeys("6011981111111113");
	}
	@When(": User Enter the valid Expiration Date1")
	public void user_enter_the_valid_expiration_date1() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		r.getExpirationDate1().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number1")
	public void user_enter_the_valid_cvc_cvv_number1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		r.getCVCCVVNumber1().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate the Information1")
	public void user_enter_the_validate_the_information1() throws InterruptedException {
		WebElement element7=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor7=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor7.executeScript("arguments[0].click();",element7);
	}
	@When(": User Sumbit the popup alert1")
	public void user_sumbit_the_popup_alert1() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
	    r.getPopupAlert().click();
	}
	
	// ------------------------BuyerPaymentInformationWithCreditCard-----------------------------------------

	
	@When(": User Enter the BuyerPaymentInformation With CreditCard")
	public void user_enter_the_buyer_payment_information_with_credit_card() throws InterruptedException {
		WebElement element4=driver.findElement(By.xpath("//label[@for='creditCard']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card2")
	public void user_enter_the_name_on_the_card2() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
		r.getNameOnTheCard2().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number2")
	public void user_enter_the_valid_card_number2() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		r.getCardNumber2().sendKeys("3056930009020004");
	}
	@When(": User Enter the valid Expiration Date2")
	public void user_enter_the_valid_expiration_date2() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		r.getExpirationDate2().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number2")
	public void user_enter_the_valid_cvc_cvv_number2() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		r.getCVCCVVNumber2().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation2")
	public void user_enter_the_validate_buyers_payment_information2() throws InterruptedException {
		WebElement element7=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor7=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor7.executeScript("arguments[0].click();",element7);
	}
	@When(": User Sumbit the popup alert21")
	public void user_sumbit_the_popup_alert21() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
	    r.getPopupAlert().click();
	}

	
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard1")
	public void user_enter_the_membership_payment_information_with_name_on_the_card1() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		Thread.sleep(2000);
		r.getMembershipName2().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number for MembershipPayment3")
	public void user_enter_the_valid_card_number_for_membership_payment3() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    r.getMembershipCardNumber().sendKeys("5200828282828210");
	}

	@When(": User Enter the valid Expiration Date for MembershipPayment3")
	public void user_enter_the_valid_expiration_date_for_membership_payment3() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		r.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment3")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment3() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		r.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	
	@When(": User Enter the validate MembershipPaymentInformation1")
	public void user_enter_the_validate_membership_payment_information1() throws InterruptedException {
		WebElement element8=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Sumbit the popup alert22")
	public void user_sumbit_the_popup_alert22() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
		Thread.sleep(2000);
		r.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step1")
	public void user_enter_the_next_step1() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	JavascriptExecutor executor10=(JavascriptExecutor)driver;
	executor10.executeScript("arguments[0].click();",element10);
	}
	@When(": User Accept Subscription Fee1")
	public void user_accept_subscription_fee1() throws InterruptedException {
		WebElement element11=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor11=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor11.executeScript("arguments[0].click();",element11);
		Thread.sleep(2000);
	}
	@When(": User Acknowledged and Agree1")
	public void user_acknowledged_and_agree1() throws InterruptedException {
		WebElement element11=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
		JavascriptExecutor executor11=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor11.executeScript("arguments[0].click();",element11);
		Thread.sleep(2000);
	}
	@When(": User Enter the Sumbit Button12")
	public void user_enter_the_sumbit_button12() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);     
		Thread.sleep(2000);
		r.getSumbitButton1().click();
	}
	@Then(": User Sucessfully Registered With Valid Credentials1")
	public void user_sucessfully_registered_with_valid_credentials1() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
		Thread.sleep(6000);
		r.getSucessfullyRegistered().click();
	   Thread.sleep(2000);
		driver.close();
	
	}


	//------------------------ @BuyerAccountSingleLocationWithTaxID -----------------------------------------

	
	@Given(": User navigates to the website myapp.pallettrader.com for Buyer4")
	public void user_navigates_to_the_website_myapp_pallettrader_com_for_buyer4() throws Throwable {
		driver=initializeDriver() ;
		//driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");
	}
	@When(": User Enter the signup page for Buyer4")
	public void user_enter_the_signup_page_for_buyer4() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getRegistration().click();
	}
	@When(": User Enter the Registration form for Buyer4")
	public void user_enter_the_registration_form_for_buyer4() {
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);   
	}
	@When(": User Enter the valid UserName for Buyer4")
	public void user_enter_the_valid_user_name_for_buyer4() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		   b.getUsername().sendKeys("AutomationTester");
	}
	
	//@When(": User Enter the valid EmailId for Buyer4")
	public void user_enter_the_valid_email_id_for_buyer4() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		   b.getEmail().sendKeys("1103c@mailinator.com");
	}
	
		public int randomFourDigitGenerator2(){
			   Random rand = new Random();
			   int resRandom = 0;
			   for (int i = 1; i<= 10; i++) {
			      resRandom = rand.nextInt((9999 - 100) + 1) + 10;
			      System.out.println(resRandom);
			   }
			   return resRandom;
		}
    @When(": User Enter the valid EmailId for Buyer4")
	public void user_enter_the_valid_email_id_for_buyer14() {
int num = randomFourDigitGenerator();
String randomNum = String.valueOf(num);
System.out.println(randomNum);
Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
b.getEmail().sendKeys(randomNum + "s@mailinator.com");
System.out.println(randomNum + "s@mailinator.com");
}
	@When(": User Enter the valid PassWord for Buyer4")
	public void user_enter_the_valid_pass_word_for_buyer4() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		  b.getpassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid Conform Password for Buyer4")
	public void user_enter_the_valid_conform_password_for_buyer4() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		   b.getConfirmPassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid CompanyName for Buyer4")
	public void user_enter_the_valid_company_name_for_buyer4() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		   b.getCompanyNamel().sendKeys("PalletTrader");
	}
	@When(": User Enter the valid Cell Phone Number for Buyer4")
	public void user_enter_the_valid_cell_phone_number_for_buyer4() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getPhoneNumber().sendKeys("315-280-8677");
	}
	@When(": User Enter the valid Address1 Name for Buyer4")
	public void user_enter_the_valid_address1_name_for_buyer4() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getAddress1().sendKeys("2827 Gandy Street");
	}
	@When(": User Enter the valid Address2 Name for Buyer4")
	public void user_enter_the_valid_address2_name_for_buyer4() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getAddress2().sendKeys("Testing");
	}
	@When(": User Enter the valid  City Name for Buyer4")
	public void user_enter_the_valid_city_name_for_buyer4() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getCity().sendKeys("Syracuse");
	}
	@When(": User Enter DropDown  and Select State for Buyer4")
	public void user_enter_drop_down_and_select_state_for_buyer4() throws InterruptedException {
		Thread.sleep(2000); 
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		b.getselectdropdown().click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//div[text()='ND-North Dakota']")).click();  
	}
	@When(": User Enter the valid locationZipCode for Buyer4")
	public void user_enter_the_valid_location_zip_code_for_buyer4() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getlocationZipCode().sendKeys("13202");
	}
	/*@When(": User Enter the Promo Code or Referral Code for Buyer4")
	public void user_enter_the_promo_code_or_referral_code_for_buyer4() {
		driver.findElement(By.xpath("//input[@name='promoCodeInput']")).sendKeys("automationqa");

	}
	@When(": User Click on the apply button for Buyer4")
	public void user_click_on_the_apply_button_for_buyer4() {
	   Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@type='app-green-button']")).click();
	}
	@When(": User Sumbit the popup alert5 for Buyer4")
	public void user_sumbit_the_popup_alert5_for_buyer4() {
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	@When(": User acknowledged that this promo code for Buyer4")
	public void user_acknowledged_that_this_promo_code_for_buyer4() {
	   WebElement element1=driver.findElement(By.xpath("//span[@class='checkMark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1)
	}*/
	@When(": User Enter the SumbitButton for Buyer4")
	public void user_enter_the_sumbit_button_for_buyer4() {
		WebElement element1=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1); 
	}
	@When(": User Enter the valid OTP in popup Screen for Buyer4")
	public void user_enter_the_valid_otp_in_popup_screen_for_buyer4() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getOtp().sendKeys("223345");
	}
	@When(": User Enter the GreenSumbitButton for Buyer4")
	public void user_enter_the_green_sumbit_button_for_buyer4() throws InterruptedException {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		Thread.sleep(2000);
		b.getGreenButton().click();
	}
	@Then(": User verified EmaiId for Buyer4")
	public void user_verified_emai_id_for_buyer4() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getVerifiedEmailid().click();
	}
	@When(": User Enter the Not Register for  the Broker14")
	public void user_enter_the_not_register_for_the_broker14() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
			Thread.sleep(2000);
	}
	
	@When(": User Enter the Register for this platform to buyerPallets14")
	public void user_enter_the_register_for_this_platform_to_buyer_pallets14() throws InterruptedException {
		Thread.sleep(2000);
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		    b.getRegisterForTheBuyer().click();
	}
	@When(": User Enter the Not Register for  the Seller14")
	public void user_enter_the_not_register_for_the_seller14() {
		WebElement element2=driver.findElement(By.xpath("//label[@for='false']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor2=(JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();",element2);
	}
	@When(": User Enter the company operate  one location for Buyer14")
	public void user_enter_the_company_operate_one_location_for_buyer14() throws InterruptedException {
		Thread.sleep(2000);
		   WebElement element2=driver.findElement(By.xpath("//label[@for='ONE']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
	}
	
	
	
	@When(": User Enter the Valid TaxId for Buyer4")
	public void user_enter_the_valid_tax_id_for_buyer4() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getTaxId().sendKeys("232222222");
	}
	@When(": User Enter the Valid DNB\\/DUNS for Buyer4")
	public void user_enter_the_valid_dnb_duns_for_buyer4() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		   b.getDNBDUNS().sendKeys("45-455-5555");
	}
	@When(": User Enter the BusinessURL for Buyer4")
	public void user_enter_the_business_url_for_buyer4() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		   b.getURL().sendKeys("https://www.officeplace.com/");

	}
	@When(": User Enter the BusinessDescription for Buyer4")
	public void user_enter_the_business_description_for_buyer4() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		   Thread.sleep(2000);
			b.getBusinessDescription().sendKeys("Business Description");
	}
	@When(": User Enter the BuyerPaymentInformation for Buyer4")
	public void user_enter_the_buyer_payment_information_for_buyer4() throws InterruptedException {
		WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card for Buyer4")
	public void user_enter_the_name_on_the_card_for_buyer4() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		Thread.sleep(2000);
		b.getNameOnTheCard().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number for Buyer4")
	public void user_enter_the_valid_card_number_for_buyer4() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().frame(0);
		b.getCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for Buyer4")
	public void user_enter_the_valid_expiration_date_for_buyer4() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		b.getExpirationDate().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number for Buyer4")
	public void user_enter_the_valid_cvc_cvv_number_for_buyer4() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		b.getCVCCVVNumber().sendKeys("123");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation for Buyer4")
	public void user_enter_the_validate_buyers_payment_information_for_buyer4() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert for Buyer4")
	public void user_sumbit_the_popup_alert_for_buyer4() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		 b.getPopupAlert().click();
	}
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard for Buyer4")
	public void user_enter_the_membership_payment_information_with_name_on_the_card_for_buyer4() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		b.getMembershipName().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number for MembershipPayment for Buyer4")
	public void user_enter_the_valid_card_number_for_membership_payment_for_buyer4() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    b.getMembershipCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for MembershipPayment for Buyer4")
	public void user_enter_the_valid_expiration_date_for_membership_payment_for_buyer4() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		b.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment for Buyer4")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment_for_buyer4() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		b.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate MembershipPaymentInformation for Buyer4")
	public void user_enter_the_validate_membership_payment_information_for_buyer4() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		WebElement element6=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor6=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor6.executeScript("arguments[0].click();",element6);
	}
	@When(": User Sumbit the popup alert2 for Buyer4")
	public void user_sumbit_the_popup_alert2_for_buyer4() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		Thread.sleep(2000);
		b.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step for Buyer4")
	public void user_enter_the_next_step_for_buyer4() {
		WebElement element7=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		JavascriptExecutor executor7=(JavascriptExecutor)driver;
		executor7.executeScript("arguments[0].click();",element7);
	}
	@When(": User Accept Subscription Fee for Buyer4")
	public void user_accept_subscription_fee_for_buyer4() throws InterruptedException {
		WebElement element8=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Acknowledged and Agree for Buyer4")
	public void user_acknowledged_and_agree_for_buyer4() throws InterruptedException {
		Thread.sleep(2000);
		 //b.getAcknowledgedandAgree().click();
			WebElement element9=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
			JavascriptExecutor executor9=(JavascriptExecutor)driver;
			executor9.executeScript("arguments[0].click();",element9);;
	}
	@When(": User Enter the Sumbit Button1 for Buyer4")
	public void user_enter_the_sumbit_button1_for_buyer4() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		//b.getSumbitButton1().click();
				Thread.sleep(2000);
				WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
				JavascriptExecutor executor10=(JavascriptExecutor)driver;
				executor10.executeScript("arguments[0].click();",element10);
	}
	@Then(": User Sucessfully Registered With Valid Credentials for Buyer4")
	public void user_sucessfully_registered_with_valid_credentials_for_buyer4() throws InterruptedException {
		Thread.sleep(5000);
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
b.getSucessfullyRegistered().click();
	
Thread.sleep(2000);
driver.close();
	}



//------------------------@BuyerAccountSingleLocationwithLicence -----------------------------------------


	@Given(": User navigates to the website myapp.pallettrader.com for Buyer")
	public void user_navigates_to_the_website_myapp_pallettrader_com_for_buyer() throws Throwable {
		driver=initializeDriver() ;
		//driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");
	}
	@When(": User Enter the signup page for Buyer")
	public void user_enter_the_signup_page_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getRegistration().click();
	}
	@When(": User Enter the Registration form for Buyer")
	public void user_enter_the_registration_form_for_buyer() {
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);   
	}
	@When(": User Enter the valid UserName for Buyer")
	public void user_enter_the_valid_user_name_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		   b.getUsername().sendKeys("AutomationTester");

	}
	@When(": User Enter the valid EmailId for Buyer")
	public void user_enter_the_valid_email_id_for_buyer() {
	//	Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		  // b.getEmail().sendKeys("1104d@mailinator.com");

		int num = randomFourDigitGenerator();
		String randomNum = String.valueOf(num);
		System.out.println(randomNum);
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		b.getEmail().sendKeys(randomNum + "s@mailinator.com");
		System.out.println(randomNum + "s@mailinator.com");
		
		
		
		
	}
	@When(": User Enter the valid PassWord for Buyer")
	public void user_enter_the_valid_pass_word_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		  b.getpassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid Conform Password for Buyer")
	public void user_enter_the_valid_conform_password_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		   b.getConfirmPassword().sendKeys("Test@123");

	}
	@When(": User Enter the valid CompanyName for Buyer")
	public void user_enter_the_valid_company_name_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		   b.getCompanyNamel().sendKeys("PalletTrader");
	}
	@When(": User Enter the valid Cell Phone Number for Buyer")
	public void user_enter_the_valid_cell_phone_number_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getPhoneNumber().sendKeys("315-280-8677");

	}
	@When(": User Enter the valid Address1 Name for Buyer")
	public void user_enter_the_valid_address1_name_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getAddress1().sendKeys("2827 Gandy Street");

	}
	@When(": User Enter the valid Address2 Name for Buyer")
	public void user_enter_the_valid_address2_name_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getAddress2().sendKeys("Testing");

	}
	@When(": User Enter the valid  City Name for Buyer")
	public void user_enter_the_valid_city_name_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getCity().sendKeys("Syracuse");

	}
	@When(": User Enter DropDown  and Select State for Buyer")
	public void user_enter_drop_down_and_select_state_for_buyer() throws InterruptedException {
		Thread.sleep(2000); 
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		b.getselectdropdown().click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//div[text()='ND-North Dakota']")).click();  
	}
	@When(": User Enter the valid locationZipCode for Buyer")
	public void user_enter_the_valid_location_zip_code_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getlocationZipCode().sendKeys("13202");

	}
	/*@When(": User Enter the Promo Code or Referral Code for Buyer")
	public void user_enter_the_promo_code_or_referral_code_for_buyer() {
		driver.findElement(By.xpath("//input[@name='promoCodeInput']")).sendKeys("automationqa");

	}
	@When(": User Click on the apply button for Buyer")
	public void user_click_on_the_apply_button_for_buyer() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@type='app-green-button']")).click();
	}
	@When(": User Sumbit the popup alert5 for Buyer")
	public void user_sumbit_the_popup_alert5_for_buyer() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	@When(": User acknowledged that this promo code for Buyer")
	public void user_acknowledged_that_this_promo_code_for_buyer() {
		WebElement element1=driver.findElement(By.xpath("//span[@class='checkMark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
	}*/
	@When(": User Enter the SumbitButton for Buyer")
	public void user_enter_the_sumbit_button_for_buyer() {
		WebElement element1=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1); 
	}
	@When(": User Enter the valid OTP in popup Screen for Buyer")
	public void user_enter_the_valid_otp_in_popup_screen_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getOtp().sendKeys("223345");

	}
	@When(": User Enter the GreenSumbitButton for Buyer")
	public void user_enter_the_green_sumbit_button_for_buyer() throws InterruptedException {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		Thread.sleep(2000);
		b.getGreenButton().click();
	}
	@Then(": User verified EmaiId for Buyer")
	public void user_verified_emai_id_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getVerifiedEmailid().click();

	}
	@When(": User Enter the Not Register for  the Broker1")
	public void user_enter_the_not_register_for_the_broker1() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
			Thread.sleep(2000);
	}
	@When(": User Enter the Register for this platform to buyerPallets1")
	public void user_enter_the_register_for_this_platform_to_buyer_pallets1() throws InterruptedException {
		Thread.sleep(2000);
	   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getRegisterForTheBuyer().click();

	}
	@When(": User Enter the Not Register for  the Seller1")
	public void user_enter_the_not_register_for_the_seller1() throws InterruptedException {
		Thread.sleep(2000);
		  // Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);   
		  // b.getNotRegisterForTheSeller().click();
		WebElement element2=driver.findElement(By.xpath("//label[@for='false']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor2=(JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();",element2);
	}
	@When(": User Enter the company operate  one location for Buyer")
	public void user_enter_the_company_operate_one_location_for_buyer() throws InterruptedException {
		 Thread.sleep(2000);
		   WebElement element2=driver.findElement(By.xpath("//label[@for='ONE']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
	}
	
	
	@When(": User Enter the BusinessInformationWithLICENSE for Buyer")
	public void user_enter_the_business_information_with_license_for_buyer() {
		WebElement element = driver.findElement(By.xpath("//label[normalize-space()='LICENSE']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

	}
	@When(": User Enter the Valid Driver's License Number for Buyer")
	public void user_enter_the_valid_driver_s_license_number_for_buyer() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("11111111111111111111");


	}
	@When(": User Click On the Drivers License State Drop down for Buyer")
	public void user_click_on_the_drivers_license_state_drop_down_for_buyer() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();


	}
	@When(": User Select the Drivers License State for Buyer")
	public void user_select_the_drivers_license_state_for_buyer() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='AL-Alabama']")).click();


	}
	@When(": User Enter the valid First Name for Buyer")
	public void user_enter_the_valid_first_name_for_buyer() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hello");


	}
	@When(": User Enter the valid Last Name for Buyer")
	public void user_enter_the_valid_last_name_for_buyer() {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tester");

	}
	@When(": User Enter the valid Date of Birth  for Buyer")
	public void user_enter_the_valid_date_of_birth_for_buyer() {
		String year="2004";
		String month="August";
		String date="30";
		
		WebElement element94 = driver.findElement(By.xpath("//button[@aria-label='change date']//span[@class='MuiIconButton-label']"));
		JavascriptExecutor executor94 = (JavascriptExecutor) driver;
		executor94.executeScript("arguments[0].click();", element94);	
		
		//driver.findElement(By.xpath("//button[@aria-label='change date']//span[@class='MuiIconButton-label']")).click();
		
				while(true)
				{
					
					String monthyear=driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter'])[1]")).getText();
					
				String arr[]=monthyear.split(" ");
				String mon=arr[0];
				String yr=arr[1];
				
				if(mon.equals(month) && yr.equals(year))
				break;
				else
					
					driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersCalendarHeader-iconButton']")).click();
				
				}
						
		List<WebElement> alldates=driver.findElements(By.xpath("//div[@class='MuiPickersBasePicker-pickerView']//button"));
		for(WebElement ele:alldates)
				
		{
			String dt=ele.getText();
			
			if(dt.equals(date))
			
			{
				ele.click();
				break;
			}
				
				}
		
		driver.findElement(By.xpath("//span[normalize-space()='OK']")).click();

}
	@When(": User Upload the valid Driver's License for Buyer")
	public void user_upload_the_valid_driver_s_license_for_buyer() {
		driver.findElement(By.xpath("//input[@id='drivingLicenseDoc']")).sendKeys("C:\\Users\\Mobile Programming\\eclipse-workspace\\pallet_Trader_Registration_All_Users\\Resources\\License.jpg");


	}
	@When(": User Enter the BusinessURL for Buyer5")
	public void user_enter_the_business_url_for_buyer5() {
	   


	driver.findElement(By.xpath("//input[@placeholder='https//:']")).sendKeys("https://www.officeplace.com/");


	}
	@When(": User Enter the BusinessDescription for Buyer")
	public void user_enter_the_business_description_for_buyer() {
		driver.findElement(By.xpath("//textarea[@name='businessDesc']")).sendKeys("Business Description");


	}
	//@When(": User Enter the Valid TaxId for Buyer")
	//public void user_enter_the_valid_tax_id_for_buyer() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	//}
	//@When(": User Enter the Valid DNB\\/DUNS for Buyer")
	//public void user_enter_the_valid_dnb_duns_for_buyer() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	//}
	@When(": User Enter the BuyerPaymentInformation for Buyer")
	public void user_enter_the_buyer_payment_information_for_buyer() throws InterruptedException {
		WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card for Buyer")
	public void user_enter_the_name_on_the_card_for_buyer() throws InterruptedException {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		Thread.sleep(2000);
		b.getNameOnTheCard().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number for Buyer")
	public void user_enter_the_valid_card_number_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		b.getCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for Buyer")
	public void user_enter_the_valid_expiration_date_for_buyer() throws InterruptedException {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		b.getExpirationDate().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number for Buyer")
	public void user_enter_the_valid_cvc_cvv_number_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		b.getCVCCVVNumber().sendKeys("123");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation for Buyer")
	public void user_enter_the_validate_buyers_payment_information_for_buyer() throws InterruptedException {
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert for Buyer")
	public void user_sumbit_the_popup_alert_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		 b.getPopupAlert().click();

	}
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard for Buyer")
	public void user_enter_the_membership_payment_information_with_name_on_the_card_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		b.getMembershipName().sendKeys("AutomationTester");

	}
	@When(": User Enter the valid Card Number for MembershipPayment for Buyer")
	public void user_enter_the_valid_card_number_for_membership_payment_for_buyer() throws InterruptedException {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    b.getMembershipCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for MembershipPayment for Buyer")
	public void user_enter_the_valid_expiration_date_for_membership_payment_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		b.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment for Buyer")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		b.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate MembershipPaymentInformation for Buyer")
	public void user_enter_the_validate_membership_payment_information_for_buyer() throws InterruptedException {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		WebElement element6=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor6=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor6.executeScript("arguments[0].click();",element6);
	
	}
	@When(": User Sumbit the popup alert2 for Buyer")
	public void user_sumbit_the_popup_alert2_for_buyer() throws InterruptedException {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		Thread.sleep(2000);
		b.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step for Buyer")
	public void user_enter_the_next_step_for_buyer() {
		WebElement element7=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		JavascriptExecutor executor7=(JavascriptExecutor)driver;
		executor7.executeScript("arguments[0].click();",element7);
	}
	@When(": User Accept Subscription Fee for Buyer")
	public void user_accept_subscription_fee_for_buyer() {
		WebElement element8=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Acknowledged and Agree for Buyer")
	public void user_acknowledged_and_agree_for_buyer() {
		WebElement element9=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
		JavascriptExecutor executor9=(JavascriptExecutor)driver;
		executor9.executeScript("arguments[0].click();",element9);
	}
	@When(": User Enter the Sumbit Button1 for Buyer")
	public void user_enter_the_sumbit_button1_for_buyer() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@Then(": User Sucessfully Registered With Valid Credentials for Buyer")
	public void user_sucessfully_registered_with_valid_credentials_for_buyer() throws InterruptedException {
		Thread.sleep(5000);
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		b.getSucessfullyRegistered().click();
	
		Thread.sleep(2000);
		driver.close();
	}




//-------------------	@BuyerAccountMultiplelocationwithIndependentPayment------------------------
	
	@Given(": User navigates to the website myapp.pallettrader.com for Buyer1")
	public void user_navigates_to_the_website_myapp_pallettrader_com_for_buyer1() throws Throwable {
		driver=initializeDriver() ;
		//driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");
	}
	@When(": User Enter the signup page for Buyer1")
	public void user_enter_the_signup_page_for_buyer1() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getRegistration().click();
	}
	@When(": User Enter the Registration form for Buyer1")
	public void user_enter_the_registration_form_for_buyer1() {
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);   
	}
	@When(": User Enter the valid UserName for Buyer1")
	public void user_enter_the_valid_user_name_for_buyer1() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		   b.getUsername().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid EmailId for Buyer1")
	public void user_enter_the_valid_email_id_for_buyer1() {
		//Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		//   b.getEmail().sendKeys("1105a@mailinator.com");
		int num = randomFourDigitGenerator();
		String randomNum = String.valueOf(num);
		System.out.println(randomNum);
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		b.getEmail().sendKeys(randomNum + "s@mailinator.com");
		System.out.println(randomNum + "s@mailinator.com");
	}
	@When(": User Enter the valid PassWord for Buyer1")
	public void user_enter_the_valid_pass_word_for_buyer1() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		  b.getpassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid Conform Password for Buyer1")
	public void user_enter_the_valid_conform_password_for_buyer1() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		   b.getConfirmPassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid CompanyName for Buyer1")
	public void user_enter_the_valid_company_name_for_buyer1() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		   b.getCompanyNamel().sendKeys("PalletTrader");
	}
	@When(": User Enter the valid Cell Phone Number for Buyer1")
	public void user_enter_the_valid_cell_phone_number_for_buyer1() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getPhoneNumber().sendKeys("315-280-8677");
	}
	@When(": User Enter the valid Address1 Name for Buyer1")
	public void user_enter_the_valid_address1_name_for_buyer1() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getAddress1().sendKeys("2827 Gandy Street");
	}
	@When(": User Enter the valid Address2 Name for Buyer1")
	public void user_enter_the_valid_address2_name_for_buyer1() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getAddress2().sendKeys("Testing");

	}
	@When(": User Enter the valid  City Name for Buyer1")
	public void user_enter_the_valid_city_name_for_buyer1() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getCity().sendKeys("Syracuse");
	}
	@When(": User Enter DropDown  and Select State for Buyer1")
	public void user_enter_drop_down_and_select_state_for_buyer1() throws InterruptedException {
		Thread.sleep(2000); 
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		b.getselectdropdown().click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//div[text()='ND-North Dakota']")).click();  
	}
	@When(": User Enter the valid locationZipCode for Buyer1")
	public void user_enter_the_valid_location_zip_code_for_buyer1() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getlocationZipCode().sendKeys("13202");
	}
	/*@When(": User Enter the Promo Code or Referral Code for Buyer1")
	public void user_enter_the_promo_code_or_referral_code_for_buyer1() {
		driver.findElement(By.xpath("//input[@name='promoCodeInput']")).sendKeys("automationqa");

	}
	@When(": User Click on the apply button for Buyer1")
	public void user_click_on_the_apply_button_for_buyer1() {
	   Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@type='app-green-button']")).click();
	}
	@When(": User Sumbit the popup alert5 for Buyer1")
	public void user_sumbit_the_popup_alert5_for_buyer1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	@When(": User acknowledged that this promo code for Buyer1")
	public void user_acknowledged_that_this_promo_code_for_buyer1() {
	    WebElement element1=driver.findElement(By.xpath("//span[@class='checkMark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
	}*/
	@When(": User Enter the SumbitButton for Buyer1")
	public void user_enter_the_sumbit_button_for_buyer1() {
		WebElement element1=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1); 
	}
	@When(": User Enter the valid OTP in popup Screen for Buyer1")
	public void user_enter_the_valid_otp_in_popup_screen_for_buyer1() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getOtp().sendKeys("223345");

	}
	@When(": User Enter the GreenSumbitButton for Buyer1")
	public void user_enter_the_green_sumbit_button_for_buyer1() throws InterruptedException {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		Thread.sleep(2000);
		b.getGreenButton().click();
	}
	@Then(": User verified EmaiId for Buyer1")
	public void user_verified_emai_id_for_buyer1() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
	    b.getVerifiedEmailid().click();
	}
	@When(": User Enter the Not Register for  the Broker2")
	public void user_enter_the_not_register_for_the_broker2() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
			Thread.sleep(2000);
	}
	@When(": User Enter the Register for this platform to buyerPallets2")
	public void user_enter_the_register_for_this_platform_to_buyer_pallets2() throws InterruptedException {
		Thread.sleep(2000);
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		    b.getRegisterForTheBuyer().click();
	}
	@When(": User Enter the Not Register for  the Seller2")
	public void user_enter_the_not_register_for_the_seller2() {
		WebElement element2=driver.findElement(By.xpath("//label[@for='false']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor2=(JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();",element2);
	}
	@When(": User Enter the company operate  Multiple location for Buyer1")
	public void user_enter_the_company_operate_multiple_location_for_buyer1() throws InterruptedException {
		Thread.sleep(2000);
		   WebElement element2=driver.findElement(By.xpath("//label[@for='MULTIPLE']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
	}
	@When(": User Enter the Payment options  and cick the Independent payment")
	public void user_enter_the_payment_options_and_cick_the_independent_payment() throws InterruptedException {
		Thread.sleep(2000);
		   WebElement element2=driver.findElement(By.xpath("//label[@for='INDEPENDENT']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
	}
	//@When(": User Enter the BusinessInformationWithTaxId for buyer")
	//public void user_enter_the_business_information_with_tax_id_for_buyer() {
	   
	//}
	@When(": User Enter the Valid TaxId for buyer")
	public void user_enter_the_valid_tax_id_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
        b.getTaxId().sendKeys("232222222");
	}
	@When(": User Enter the Valid DNB\\/DUNS for buyer")
	public void user_enter_the_valid_dnb_duns_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
       b.getDNBDUNS().sendKeys("45-455-5555");
	}
	@When(": User Enter the BusinessURL for buyer")
	public void user_enter_the_business_url_for_buyer() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
        b.getURL().sendKeys("https://www.officeplace.com/");
	}
	@When(": User Enter the BusinessDescription for buyer1")
	public void user_enter_the_business_description_for_buyer1() {
		Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
       b.getBusinessDescription().sendKeys("Business Description");
	
	}
	@When(": User Enter the BuyerPaymentInformation for Buyer1")
	public void user_enter_the_buyer_payment_information_for_buyer1() throws InterruptedException {
		WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card for Buyer1")
	public void user_enter_the_name_on_the_card_for_buyer1() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		Thread.sleep(2000);
		b.getNameOnTheCard().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number for Buyer1")
	public void user_enter_the_valid_card_number_for_buyer1() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().frame(0);
		b.getCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for Buyer1")
	public void user_enter_the_valid_expiration_date_for_buyer1() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		b.getExpirationDate().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number for Buyer1")
	public void user_enter_the_valid_cvc_cvv_number_for_buyer1() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		b.getCVCCVVNumber().sendKeys("123");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation for Buyer1")
	public void user_enter_the_validate_buyers_payment_information_for_buyer1() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert for Buyer1")
	public void user_sumbit_the_popup_alert_for_buyer1() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		 b.getPopupAlert().click();
	}
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard for Buyer1")
	public void user_enter_the_membership_payment_information_with_name_on_the_card_for_buyer1() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		b.getMembershipName().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number for MembershipPayment for Buyer1")
	public void user_enter_the_valid_card_number_for_membership_payment_for_buyer1() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    b.getMembershipCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for MembershipPayment for Buyer1")
	public void user_enter_the_valid_expiration_date_for_membership_payment_for_buyer1() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		b.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment for Buyer1")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment_for_buyer1() {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		b.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate MembershipPaymentInformation for Buyer1")
	public void user_enter_the_validate_membership_payment_information_for_buyer1() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		WebElement element6=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor6=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor6.executeScript("arguments[0].click();",element6);
	}
	@When(": User Sumbit the popup alert2 for Buyer1")
	public void user_sumbit_the_popup_alert2_for_buyer1() throws InterruptedException {
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
		Thread.sleep(2000);
		b.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step for Buyer1")
	public void user_enter_the_next_step_for_buyer1() {
		WebElement element7=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		JavascriptExecutor executor7=(JavascriptExecutor)driver;
		executor7.executeScript("arguments[0].click();",element7);
	}
	@When(": User Accept Subscription Fee for Buyer1")
	public void user_accept_subscription_fee_for_buyer1() {
		WebElement element8=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Acknowledged and Agree for Buyer1")
	public void user_acknowledged_and_agree_for_buyer1() {
		WebElement element9=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
		JavascriptExecutor executor9=(JavascriptExecutor)driver;
		executor9.executeScript("arguments[0].click();",element9);
	}
	@When(": User Enter the Sumbit Button1 for Buyer1")
	public void user_enter_the_sumbit_button1_for_buyer1() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@Then(": User Sucessfully Registered With Valid Credentials for Buyer {int}")
	public void user_sucessfully_registered_with_valid_credentials_for_buyer(Integer int1) throws InterruptedException {
		Thread.sleep(5000);
		   Pageobjects.RegistrationBuyerPage b=new Pageobjects.RegistrationBuyerPage(driver);
b.getSucessfullyRegistered().click();
Thread.sleep(2000);
driver.close();
	}


	// ------------------------@SellerAccountSingleLocationWithTaxID-----------------------------------------


	@Given(": User navigates to the website myapp.pallettrader.com for SellerAccount")
	public void user_navigates_to_the_website_myapp_pallettrader_com_for_seller_account() throws Throwable {
		driver=initializeDriver() ;
		//driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");

	}
	@When(": User Enter the signup page for SellerAccount")
	public void user_enter_the_signup_page_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getRegistration().click();
	}
	@When(": User Enter the Registration form for SellerAccount")
	public void user_enter_the_registration_form_for_seller_account() {
		//Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
	}
	@When(": User Enter the valid UserName for SellerAccount")
	public void user_enter_the_valid_user_name_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	     s.getUsername().sendKeys("AutomationTester");

	}
	//@When(": User Enter the valid EmailId for SellerAccount")
	public void user_enter_the_valid_email_id_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getEmail().sendKeys("1105d@mailinator.com");

	}
	public int randomFourDigitGenerator914(){
		   Random rand = new Random();
		   int resRandom = 0;
		   for (int i = 1; i<= 10; i++) {
		      resRandom = rand.nextInt((9999 - 100) + 1) + 10;
		      System.out.println(resRandom);
		   }
		   return resRandom;
	}
	@When(": User Enter the valid EmailId for SellerAccount")
	public void user_enter_the_valid_email_id_for_seller_account914() {
     int num = randomFourDigitGenerator();
	   String randomNum = String.valueOf(num);
	   System.out.println(randomNum);
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	   s.getEmail().sendKeys(randomNum + "s@mailinator.com");
	   System.out.println(randomNum + "s@mailinator.com");
	
	
}
	
@When(": User Enter the valid PassWord for SellerAccount")
	public void user_enter_the_valid_pass_word_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getpassword().sendKeys("Test@123");

	}
	@When(": User Enter the valid Conform Password for SellerAccount")
	public void user_enter_the_valid_conform_password_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getConfirmPassword().sendKeys("Test@123");

	}
	@When(": User Enter the valid CompanyName for SellerAccount")
	public void user_enter_the_valid_company_name_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getCompanyNamel().sendKeys("PalletTrader");

	}
	@When(": User Enter the valid Cell Phone Number for SellerAccount")
	public void user_enter_the_valid_cell_phone_number_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getPhoneNumber().sendKeys("315-280-8677");

	}
	@When(": User Enter the valid Address1 Name for SellerAccount")
	public void user_enter_the_valid_address1_name_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getAddress1().sendKeys("2827 Gandy Street");

	}
	@When(": User Enter the valid Address2 Name for SellerAccount")
	public void user_enter_the_valid_address2_name_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getAddress2().sendKeys("Testing");

	}
	@When(": User Enter the valid  City Name for SellerAccount")
	public void user_enter_the_valid_city_name_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getCity().sendKeys("Syracuse");
	}
	@When(": User Enter DropDown  and Select State for SellerAccount")
	public void user_enter_drop_down_and_select_state_for_seller_account() throws InterruptedException {
		  Thread.sleep(2000);  
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getselectdropdown().click();
	    Thread.sleep(2000);  
		driver.findElement(By.xpath("//div[text()='WA-Washington']")).click();

	}
	@When(": User Enter the valid locationZipCode for SellerAccount")
	public void user_enter_the_valid_location_zip_code_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	      s.getlocationZipCode().sendKeys("13202");

	}
	/*@When(": User Enter the Promo Code or Referral Code for SellerAccount")
	public void user_enter_the_promo_code_or_referral_code_for_seller_account() {
		driver.findElement(By.xpath("//input[@name='promoCodeInput']")).sendKeys("automationqa");

	}
	@When(": User Click on the apply button for SellerAccount")
	public void user_click_on_the_apply_button_for_seller_account() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@type='app-green-button']")).click();
	}
	@When(": User Sumbit the popup alert5 for SellerAccount")
	public void user_sumbit_the_popup_alert5_for_seller_account() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	@When(": User acknowledged that this promo code for SellerAccount")
	public void user_acknowledged_that_this_promo_code_for_seller_account() {
		WebElement element1=driver.findElement(By.xpath("//span[@class='checkMark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
	}*/
	@When(": User Enter the SumbitButton for SellerAccount")
	public void user_enter_the_sumbit_button_for_seller_account() {
		WebElement element1=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1); 
	}
	@When(": User Enter the valid OTP in popup Screen for SellerAccount")
	public void user_enter_the_valid_otp_in_popup_screen_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getOtp().sendKeys("223345");;
	}
	@When(": User Enter the GreenSumbitButton for SellerAccount")
	public void user_enter_the_green_sumbit_button_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
         s.getGreenButton().click();
	}
	@Then(": User verified EmaiId for SellerAccount")
	public void user_verified_emai_id_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getVerifiedEmailid().click();
	}
	@When(": User Enter the Not Register for  the Broker for SellerAccount")
	public void user_enter_the_not_register_for_the_broker_for_seller_account() throws InterruptedException {
		WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	}
	@When(": User Enter the Not Register for  the Buyer for SellerAccount")
	public void user_enter_the_not_register_for_the_buyer_for_seller_account() throws InterruptedException {
		//Thread.sleep(2000); 
		//Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
    //s.getNotRegisterfortheBuyer().click();
	
		WebElement element1=driver.findElement(By.xpath("//label[@for='No']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	
	
	}
	@When(": User Enter the register for this platform to seller pallets")
	public void user_enter_the_register_for_this_platform_to_seller_pallets() throws InterruptedException {
		Thread.sleep(2000); 
		//Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
   //s.getRegisterfortheSeller().click();
		WebElement element1=driver.findElement(By.xpath("//label[@for='true']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	
	
	
	
	}
	@When(": User Enter the company operate  Single location for SellerAccount")
	public void user_enter_the_company_operate_single_location_for_seller_account() throws InterruptedException {
		Thread.sleep(2000);
		   WebElement element2=driver.findElement(By.xpath("//label[@for='ONE']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
		
	}
	
	@When(": User Enter the Valid TaxId for SellerAccount")
	public void user_enter_the_valid_tax_id_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		 s.getTaxId().sendKeys("232222222");
	}
	@When(": User Enter the Valid DNB\\/DUNS for SellerAccount")
	public void user_enter_the_valid_dnb_duns_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		  s.getDNBDUNS().sendKeys("45-455-5555");
	}
	@When(": User Enter the BusinessURL for SellerAccount")
	public void user_enter_the_business_url_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		 s.getURL().sendKeys("https://www.officeplace.com/");
	}
	@When(": User Enter the BusinessDescription for SellerAccount")
	public void user_enter_the_business_description_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getBusinessDescription().sendKeys("Business Description");
	}
	@When(": User Enter the BuyerPaymentInformation for SellerAccount")
	public void user_enter_the_buyer_payment_information_for_seller_account() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card for SellerAccount")
	public void user_enter_the_name_on_the_card_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getNameOnTheCard().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number for SellerAccount")
	public void user_enter_the_valid_card_number_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));

		s.getCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for SellerAccount")
	public void user_enter_the_valid_expiration_date_for_seller_account() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		s.getExpirationDate().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number for SellerAccount")
	public void user_enter_the_valid_cvc_cvv_number_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		s.getCVCCVVNumber().sendKeys("123");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation for SellerAccount")
	public void user_enter_the_validate_buyers_payment_information_for_seller_account() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert for SellerAccount")
	public void user_sumbit_the_popup_alert_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		 s.getPopupAlert().click();
	}
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard for SellerAccount")
	public void user_enter_the_membership_payment_information_with_name_on_the_card_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getMembershipName().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number for MembershipPayment for SellerAccount")
	public void user_enter_the_valid_card_number_for_membership_payment_for_seller_account() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    s.getMembershipCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for MembershipPayment for SellerAccount")
	public void user_enter_the_valid_expiration_date_for_membership_payment_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		s.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment for SellerAccount")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		s.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate MembershipPaymentInformation for SellerAccount")
	public void user_enter_the_validate_membership_payment_information_for_seller_account() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element6=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor6=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor6.executeScript("arguments[0].click();",element6);
	}
	@When(": User Sumbit the popup alert2 for SellerAccount")
	public void user_sumbit_the_popup_alert2_for_seller_account() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		Thread.sleep(2000);
		s.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step for SellerAccount")
	public void user_enter_the_next_step_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element7=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		JavascriptExecutor executor7=(JavascriptExecutor)driver;
		executor7.executeScript("arguments[0].click();",element7);
	}
	@When(": User Accept Subscription Fee for SellerAccount")
	public void user_accept_subscription_fee_for_seller_account() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Acknowledged and Agree for SellerAccount")
	public void user_acknowledged_and_agree_for_seller_account() throws InterruptedException {
		Thread.sleep(2000);
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element9=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
		JavascriptExecutor executor9=(JavascriptExecutor)driver;
		executor9.executeScript("arguments[0].click();",element9);
	}
	@When(": User Enter the Sumbit Button1 for SellerAccount for SellerAccount")
	public void user_enter_the_sumbit_button1_for_seller_account_for_seller_account() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		Thread.sleep(2000);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}


	@Then(": User Sucessfully Registered With Valid Credentials for  SellerAccount")
	public void user_sucessfully_registered_with_valid_credentials_for_seller_account() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		Thread.sleep(10000);
		s.getSucessfullyRegistered().click();
	
		Thread.sleep(2000);
		driver.close();
	
	}
	
	
	// ------------------------  @SellerAccountSingleLocationwithLicence-----------------------------------------

	@Given(": User navigates to the website myapp.pallettrader.com for SellerAccount1")
	public void user_navigates_to_the_website_myapp_pallettrader_com_for_seller_account1() throws Throwable {
		driver=initializeDriver() ;
		//driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");
	}
	@When(": User Enter the signup page for SellerAccount1")
	public void user_enter_the_signup_page_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getRegistration().click();
	}
	@When(": User Enter the Registration form for SellerAccount1")
	public void user_enter_the_registration_form_for_seller_account1() {
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
	}
	@When(": User Enter the valid UserName for SellerAccount1")
	public void user_enter_the_valid_user_name_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	     s.getUsername().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid EmailId for SellerAccount1")
	public void user_enter_the_valid_email_id_for_seller_account1() {
		//Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	   // s.getEmail().sendKeys("1105h@mailinator.com");
	
		int num = randomFourDigitGenerator();
		   String randomNum = String.valueOf(num);
		   System.out.println(randomNum);
			Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		   s.getEmail().sendKeys(randomNum + "s@mailinator.com");
		   System.out.println(randomNum + "s@mailinator.com");
	
	
	
	}
	@When(": User Enter the valid PassWord for SellerAccount1")
	public void user_enter_the_valid_pass_word_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getpassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid Conform Password for SellerAccount1")
	public void user_enter_the_valid_conform_password_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getConfirmPassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid CompanyName for SellerAccount1")
	public void user_enter_the_valid_company_name_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getCompanyNamel().sendKeys("PalletTrader");
	}
	@When(": User Enter the valid Cell Phone Number for SellerAccount1")
	public void user_enter_the_valid_cell_phone_number_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getPhoneNumber().sendKeys("315-280-8677");
	}
	@When(": User Enter the valid Address1 Name for SellerAccount1")
	public void user_enter_the_valid_address1_name_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getAddress1().sendKeys("2827 Gandy Street");
	}
	@When(": User Enter the valid Address2 Name for SellerAccount1")
	public void user_enter_the_valid_address2_name_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getAddress2().sendKeys("Testing");
	}
	@When(": User Enter the valid  City Name for SellerAccount1")
	public void user_enter_the_valid_city_name_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getCity().sendKeys("Syracuse");
	}
	@When(": User Enter DropDown  and Select State for SellerAccount1")
	public void user_enter_drop_down_and_select_state_for_seller_account1() throws InterruptedException {
		Thread.sleep(2000); 
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getselectdropdown().click();
	    Thread.sleep(2000);  
		driver.findElement(By.xpath("//div[text()='WA-Washington']")).click();
	}
	@When(": User Enter the valid locationZipCode for SellerAccount1")
	public void user_enter_the_valid_location_zip_code_for_seller_account1() throws InterruptedException {
		Thread.sleep(2000);
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	      s.getlocationZipCode().sendKeys("13202");
	}
	/*@When(": User Enter the Promo Code or Referral Code for SellerAccount1")
	public void user_enter_the_promo_code_or_referral_code_for_seller_account1() {
	   		driver.findElement(By.xpath("//input[@name='promoCodeInput']")).sendKeys("automationqa");

	}
	@When(": User Click on the apply button for SellerAccount1")
	public void user_click_on_the_apply_button_for_seller_account1() {
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@type='app-green-button']")).click();
	}
	@When(": User Sumbit the popup alert5 for SellerAccount1")
	public void user_sumbit_the_popup_alert5_for_seller_account1() {
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	@When(": User acknowledged that this promo code for SellerAccount1")
	public void user_acknowledged_that_this_promo_code_for_seller_account1() {
	   WebElement element1=driver.findElement(By.xpath("//span[@class='checkMark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);                                                                         
	}*/
	@When(": User Enter the SumbitButton for SellerAccount1")
	public void user_enter_the_sumbit_button_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getSubmit().click();
	}
	@When(": User Enter the valid OTP in popup Screen for SellerAccount1")
	public void user_enter_the_valid_otp_in_popup_screen_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getOtp().sendKeys("223345");
	}
	@When(": User Enter the GreenSumbitButton for SellerAccount1")
	public void user_enter_the_green_sumbit_button_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		   s.getGreenButton().click();
	}
	@Then(": User verified EmaiId for SellerAccount1")
	public void user_verified_emai_id_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getVerifiedEmailid().click();
	}
	@When(": User Enter the Not Register for  the Broker for SellerAccount1")
	public void user_enter_the_not_register_for_the_broker_for_seller_account1() throws InterruptedException {
		WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	}
	@When(": User Enter the Not Register for  the Buyer for SellerAccount1")
	public void user_enter_the_not_register_for_the_buyer_for_seller_account1() throws InterruptedException {
		Thread.sleep(2000); 
		//Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
   // s.getNotRegisterfortheBuyer().click();
		WebElement element1=driver.findElement(By.xpath("//label[@for='No']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	}
	@When(": User Enter the register for this platform to seller pallets1")
	public void user_enter_the_register_for_this_platform_to_seller_pallets1() throws InterruptedException {
		Thread.sleep(2000); 
		//Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
   //s.getRegisterfortheSeller().click();
	
		WebElement element1=driver.findElement(By.xpath("//label[@for='true']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	
	
	}
	@When(": User Enter the company operate  Single location for SellerAccount1")
	public void user_enter_the_company_operate_single_location_for_seller_account1() throws InterruptedException {
		Thread.sleep(2000);
		   WebElement element2=driver.findElement(By.xpath("//label[@for='ONE']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
	}
	
	
	@When(": User Enter the BusinessInformationWithLICENSE for SellerAccount1")
	public void user_enter_the_business_information_with_license_for_seller_account1() {
		WebElement element = driver.findElement(By.xpath("//label[normalize-space()='LICENSE']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

	}
	@When(": User Enter the Valid Driver's License Number for SellerAccount1")
	public void user_enter_the_valid_driver_s_license_number_for_seller_account1() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("11111111111111111111");

	}
	@When(": User Click On the Drivers License State Drop down for SellerAccount1")
	public void user_click_on_the_drivers_license_state_drop_down_for_seller_account1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();

	}
	@When(": User Select the Drivers License State for SellerAccount1")
	public void user_select_the_drivers_license_state_for_seller_account1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='AL-Alabama']")).click();
	}
	@When(": User Enter the valid First Name for SellerAccount1")
	public void user_enter_the_valid_first_name_for_seller_account1() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hello");

	}
	@When(": User Enter the valid Last Name for SellerAccount1")
	public void user_enter_the_valid_last_name_for_seller_account1() {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tester");

	}
	@When(": User Enter the valid Date of Birth  for Buyer SellerAccount1")
	public void user_enter_the_valid_date_of_birth_for_buyer_seller_account1() {
		String year="2004";
		String month="August";
		String date="30";
		
		WebElement element94 = driver.findElement(By.xpath("//button[@aria-label='change date']//span[@class='MuiIconButton-label']"));
		JavascriptExecutor executor94 = (JavascriptExecutor) driver;
		executor94.executeScript("arguments[0].click();", element94);	
		
		//driver.findElement(By.xpath("//button[@aria-label='change date']//span[@class='MuiIconButton-label']")).click();
		
				while(true)
				{
					
					String monthyear=driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter'])[1]")).getText();
					
				String arr[]=monthyear.split(" ");
				String mon=arr[0];
				String yr=arr[1];
				
				if(mon.equals(month) && yr.equals(year))
				break;
				else
					
					driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersCalendarHeader-iconButton']")).click();
				
				}
						
		List<WebElement> alldates=driver.findElements(By.xpath("//div[@class='MuiPickersBasePicker-pickerView']//button"));
		for(WebElement ele:alldates)
				
		{
			String dt=ele.getText();
			
			if(dt.equals(date))
			
			{
				ele.click();
				break;
			}
				
				}
		
		driver.findElement(By.xpath("//span[normalize-space()='OK']")).click();
	}
	@When(": User Upload the valid Driver's License for SellerAccount1")
	public void user_upload_the_valid_driver_s_license_for_seller_account1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='drivingLicenseDoc']")).sendKeys("C:\\Users\\Mobile Programming\\eclipse-workspace\\pallet_Trader_Registration_All_Users\\Resources\\License.jpg");

	}
	@When(": User Enter the BusinessURL for SellerAccount1")
	public void user_enter_the_business_url_for_seller_account1() {
			driver.findElement(By.xpath("//input[@placeholder='https//:']")).sendKeys("https://www.officeplace.com/");

	}
	@When(": User Enter the BusinessDescription for SellerAccount1")
	public void user_enter_the_business_description_for_seller_account1() {
		driver.findElement(By.xpath("//textarea[@name='businessDesc']")).sendKeys("Business Description");

	}
	@When(": User Enter the BuyerPaymentInformation for SellerAccount1")
	public void user_enter_the_buyer_payment_information_for_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card for SellerAccount1")
	public void user_enter_the_name_on_the_card_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getNameOnTheCard().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number for SellerAccount1")
	public void user_enter_the_valid_card_number_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));

		s.getCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for SellerAccount1")
	public void user_enter_the_valid_expiration_date_for_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		s.getExpirationDate().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number for SellerAccount1")
	public void user_enter_the_valid_cvc_cvv_number_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		s.getCVCCVVNumber().sendKeys("123");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation for SellerAccount1")
	public void user_enter_the_validate_buyers_payment_information_for_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert for SellerAccount1")
	public void user_sumbit_the_popup_alert_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		 s.getPopupAlert().click();
	}
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard for SellerAccount1")
	public void user_enter_the_membership_payment_information_with_name_on_the_card_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getMembershipName().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number for MembershipPayment for SellerAccount1")
	public void user_enter_the_valid_card_number_for_membership_payment_for_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    s.getMembershipCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for MembershipPayment for SellerAccount1")
	public void user_enter_the_valid_expiration_date_for_membership_payment_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		s.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment for SellerAccount1")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		s.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate MembershipPaymentInformation for SellerAccount1")
	public void user_enter_the_validate_membership_payment_information_for_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element6=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor6=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor6.executeScript("arguments[0].click();",element6);
	}
	@When(": User Sumbit the popup alert2 for SellerAccount1")
	public void user_sumbit_the_popup_alert2_for_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		Thread.sleep(2000);
		s.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step for SellerAccount1")
	public void user_enter_the_next_step_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element7=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		JavascriptExecutor executor7=(JavascriptExecutor)driver;
		executor7.executeScript("arguments[0].click();",element7);
	}
	@When(": User Accept Subscription Fee for SellerAccount1")
	public void user_accept_subscription_fee_for_seller_account1() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Acknowledged and Agree for SellerAccount1")
	public void user_acknowledged_and_agree_for_seller_account1() throws InterruptedException {
		Thread.sleep(2000);
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element9=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
		JavascriptExecutor executor9=(JavascriptExecutor)driver;
		executor9.executeScript("arguments[0].click();",element9);
	}
	@When(": User Enter the Sumbit Button1 for SellerAccount for SellerAccount {int}")
	public void user_enter_the_sumbit_button1_for_seller_account_for_seller_account(Integer int1) throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		Thread.sleep(2000);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@Then(": User Sucessfully Registered With Valid Credentials for  SellerAccount1")
	public void user_sucessfully_registered_with_valid_credentials_for_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		Thread.sleep(5000);
		s.getSucessfullyRegistered().click();
		Thread.sleep(2000);
		driver.close();
	}



	
	
	// ------------------------  @SellerAccountMultiplelocationwithCentralizedPayment-----------------------------------------

	
	@Given(": User navigates to the website myapp.pallettrader.com for SellerAccount2")
	public void user_navigates_to_the_website_myapp_pallettrader_com_for_seller_account2() throws Throwable {
		driver=initializeDriver() ;
		//driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");
	
	}
	@When(": User Enter the signup page for SellerAccount2")
	public void user_enter_the_signup_page_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getRegistration().click();
	}
	@When(": User Enter the Registration form for SellerAccount2")
	public void user_enter_the_registration_form_for_seller_account2() {
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
	}
	@When(": User Enter the valid UserName for SellerAccount2")
	public void user_enter_the_valid_user_name_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	     s.getUsername().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid EmailId for SellerAccount2")
	public void user_enter_the_valid_email_id_for_seller_account2() {
		//Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    //s.getEmail().sendKeys("1107k@mailinator.com");
		int num = randomFourDigitGenerator();
		   String randomNum = String.valueOf(num);
		   System.out.println(randomNum);
			Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		   s.getEmail().sendKeys(randomNum + "s@mailinator.com");
		   System.out.println(randomNum + "s@mailinator.com");
	
	}
	@When(": User Enter the valid PassWord for SellerAccount2")
	public void user_enter_the_valid_pass_word_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getpassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid Conform Password for SellerAccount2")
	public void user_enter_the_valid_conform_password_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getConfirmPassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid CompanyName for SellerAccount2")
	public void user_enter_the_valid_company_name_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getCompanyNamel().sendKeys("PalletTrader");
	}
	@When(": User Enter the valid Cell Phone Number for SellerAccount2")
	public void user_enter_the_valid_cell_phone_number_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getPhoneNumber().sendKeys("315-280-8677");
	}
	@When(": User Enter the valid Address1 Name for SellerAccount2")
	public void user_enter_the_valid_address1_name_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getAddress1().sendKeys("2827 Gandy Street");
	}
	@When(": User Enter the valid Address2 Name for SellerAccount2")
	public void user_enter_the_valid_address2_name_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getAddress2().sendKeys("Testing");
	}
	@When(": User Enter the valid  City Name for SellerAccount2")
	public void user_enter_the_valid_city_name_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getCity().sendKeys("Syracuse");
	}
	@When(": User Enter DropDown  and Select State for SellerAccount2")
	public void user_enter_drop_down_and_select_state_for_seller_account2() throws InterruptedException {
		Thread.sleep(2000); 
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getselectdropdown().click();
	    Thread.sleep(2000);  
		driver.findElement(By.xpath("//div[text()='WA-Washington']")).click();
	}
	@When(": User Enter the valid locationZipCode for SellerAccount2")
	public void user_enter_the_valid_location_zip_code_for_seller_account2() throws InterruptedException {
		Thread.sleep(2000);
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	      s.getlocationZipCode().sendKeys("13202");
	}
	/*@When(": User Enter the Promo Code or Referral Code for SellerAccount2")
	public void user_enter_the_promo_code_or_referral_code_for_seller_account2() {
   		driver.findElement(By.xpath("//input[@name='promoCodeInput']")).sendKeys("automationqa");

	}
	@When(": User Click on the apply button for SellerAccount2")
	public void user_click_on_the_apply_button_for_seller_account2() throws InterruptedException {
		 Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@type='app-green-button']")).click();
	}
	@When(": User Sumbit the popup alert5 for SellerAccount2")
	public void user_sumbit_the_popup_alert5_for_seller_account2() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	@When(": User acknowledged that this promo code for SellerAccount2")
	public void user_acknowledged_that_this_promo_code_for_seller_account2() {
		 WebElement element1=driver.findElement(By.xpath("//span[@class='checkMark']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);  
	}*/
	@When(": User Enter the SumbitButton for SellerAccount2")
	public void user_enter_the_sumbit_button_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getSubmit().click();
	}
	@When(": User Enter the valid OTP in popup Screen for SellerAccount2")
	public void user_enter_the_valid_otp_in_popup_screen_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getOtp().sendKeys("223345");
	}
	@When(": User Enter the GreenSumbitButton for SellerAccount2")
	public void user_enter_the_green_sumbit_button_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		   s.getGreenButton().click();
	}
	@Then(": User verified EmaiId for SellerAccount2")
	public void user_verified_emai_id_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
	    s.getVerifiedEmailid().click();
	}
	@When(": User Enter the Not Register for  the Broker for SellerAccount2")
	public void user_enter_the_not_register_for_the_broker_for_seller_account2() throws InterruptedException {
		WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	}
	@When(": User Enter the Not Register for  the Buyer for SellerAccount2")
	public void user_enter_the_not_register_for_the_buyer_for_seller_account2() throws InterruptedException {
		Thread.sleep(2000); 
		//Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
    //s.getNotRegisterfortheBuyer().click();
	
		WebElement element1=driver.findElement(By.xpath("//label[@for='No']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	
}
	@When(": User Enter the register for this platform to seller pallets2")
	public void user_enter_the_register_for_this_platform_to_seller_pallets2() throws InterruptedException {
		Thread.sleep(2000); 
		//Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
  // s.getRegisterfortheSeller().click();
	
		WebElement element1=driver.findElement(By.xpath("//label[@for='true']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	}
	@When(": User Enter the company operate  multiple locations for SellerAccount2")
	public void user_enter_the_company_operate_multiple_locations_for_seller_account2() throws InterruptedException {
		Thread.sleep(2000);
		   WebElement element2=driver.findElement(By.xpath("//label[normalize-space()='Multiple']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
	}
	@When(": User Enter the Payment options and select the Centralized Paymentfor SellerAccount2")
	public void user_enter_the_payment_options_and_select_the_centralized_paymentfor_seller_account2() throws InterruptedException {
		WebElement element3=driver.findElement(By.xpath("//label[@for='BETTAWAY_BANK']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor3=(JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();",element3);
		Thread.sleep(2000);
	}
	@When(": User Enter the Valid TaxId for SellerAccount2")
	public void user_enter_the_valid_tax_id_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		 s.getTaxId().sendKeys("232222222");
	}
	@When(": User Enter the Valid DNB\\/DUNS for SellerAccount2")
	public void user_enter_the_valid_dnb_duns_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		  s.getDNBDUNS().sendKeys("45-455-5555");
	}
	@When(": User Enter the BusinessURL for SellerAccount2")
	public void user_enter_the_business_url_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		 s.getURL().sendKeys("https://www.officeplace.com/");
	}
	@When(": User Enter the BusinessDescription for SellerAccount2")
	public void user_enter_the_business_description_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getBusinessDescription().sendKeys("Business Description");
	}
	@When(": User Enter the BuyerPaymentInformation for SellerAccount2")
	public void user_enter_the_buyer_payment_information_for_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card for SellerAccount2")
	public void user_enter_the_name_on_the_card_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getNameOnTheCard().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number for SellerAccount2")
	public void user_enter_the_valid_card_number_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));

		s.getCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for SellerAccount2")
	public void user_enter_the_valid_expiration_date_for_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		s.getExpirationDate().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number for SellerAccount2")
	public void user_enter_the_valid_cvc_cvv_number_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		s.getCVCCVVNumber().sendKeys("123");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation for SellerAccount2")
	public void user_enter_the_validate_buyers_payment_information_for_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert for SellerAccount2")
	public void user_sumbit_the_popup_alert_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		 s.getPopupAlert().click();
	}
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard for SellerAccount2")
	public void user_enter_the_membership_payment_information_with_name_on_the_card_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		s.getMembershipName().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number for MembershipPayment for SellerAccount2")
	public void user_enter_the_valid_card_number_for_membership_payment_for_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    s.getMembershipCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for MembershipPayment for SellerAccount2")
	public void user_enter_the_valid_expiration_date_for_membership_payment_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		s.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment for SellerAccount2")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		s.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate MembershipPaymentInformation for SellerAccount2")
	public void user_enter_the_validate_membership_payment_information_for_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element6=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor6=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor6.executeScript("arguments[0].click();",element6);
	}
	@When(": User Sumbit the popup alert2 for SellerAccount2")
	public void user_sumbit_the_popup_alert2_for_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		Thread.sleep(2000);
		s.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step for SellerAccount2")
	public void user_enter_the_next_step_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element7=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		JavascriptExecutor executor7=(JavascriptExecutor)driver;
		executor7.executeScript("arguments[0].click();",element7);
	}
	@When(": User Accept Subscription Fee for SellerAccount2")
	public void user_accept_subscription_fee_for_seller_account2() {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Acknowledged and Agree for SellerAccount2")
	public void user_acknowledged_and_agree_for_seller_account2() throws InterruptedException {
		Thread.sleep(2000);
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		WebElement element9=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
		JavascriptExecutor executor9=(JavascriptExecutor)driver;
		executor9.executeScript("arguments[0].click();",element9);
	}
	@When(": User Enter the Sumbit Button1 for SellerAccount for SellerAccount2")
	public void user_enter_the_sumbit_button1_for_seller_account_for_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
		Thread.sleep(2000);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	
	
	}
	
	
		@Then(": User Sucessfully Registered With Valid Credentials")
		public void user_sucessfully_registered_with_valid_credentials() throws InterruptedException {
			Pageobjects.RegistrationSellerPage s=new Pageobjects.RegistrationSellerPage(driver);
			Thread.sleep(5000);
			s.getSucessfullyRegistered().click();
		
			Thread.sleep(2000);
			driver.close();
		}
	
	
	
// ------------------------@BuyerAndSellerAccountSingleLocationWithTaxID-----------------------------------------

@Given(": User navigates to the website myapp.pallettrader.com for BuyerAndSellerAccount")
	public void user_navigates_to_the_website_myapp_pallettrader_com_for_buyer_and_seller_account() throws Throwable {
		driver=initializeDriver() ;
		//driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");

	}
	@When(": User Enter the signup page for BuyerAndSellerAccount")
	public void user_enter_the_signup_page_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getRegistration().click();
	}
	@When(": User Enter the Registration form for BuyerAndSellerAccount")
	public void user_enter_the_registration_form_for_buyer_and_seller_account() {
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);  
	}
	@When(": User Enter the valid UserName for BuyerAndSellerAccount")
	public void user_enter_the_valid_user_name_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getUsername().sendKeys("AutomationTester");

	}
	//@When(": User Enter the valid EmailId for BuyerAndSellerAccount")
	public void user_enter_the_valid_email_id_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getEmail().sendKeys("1108a@mailinator.com");

	}
	
	public int randomFourDigitGenerator85(){
		   Random rand = new Random();
		   int resRandom = 0;
		   for (int i = 1; i<= 10; i++) {
		      resRandom = rand.nextInt((9999 - 100) + 1) + 10;
		      System.out.println(resRandom);
		   }
		   return resRandom;
		
	}
	
	@When(": User Enter the valid EmailId for BuyerAndSellerAccount")
		public void user_enter_the_valid_email_id_for_buyer_and_seller_account741() {
	
	
		int num = randomFourDigitGenerator();
		   String randomNum = String.valueOf(num);
		   System.out.println(randomNum);
			Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		   both.getEmail().sendKeys(randomNum + "z@mailinator.com");
		   System.out.println(randomNum + "s@mailinator.com");
		
		
	}
		
	@When(": User Enter the valid PassWord for BuyerAndSellerAccount")
	public void user_enter_the_valid_pass_word_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getpassword().sendKeys("Test@123");

	}
	@When(": User Enter the valid Conform Password for BuyerAndSellerAccount")
	public void user_enter_the_valid_conform_password_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getConfirmPassword().sendKeys("Test@123");

	}
	@When(": User Enter the valid CompanyName for BuyerAndSellerAccount")
	public void user_enter_the_valid_company_name_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getCompanyNamel().sendKeys("PalletTrader");

	}
	@When(": User Enter the valid Cell Phone Number for BuyerAndSellerAccount")
	public void user_enter_the_valid_cell_phone_number_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getPhoneNumber().sendKeys("315-280-8677");

	}
	@When(": User Enter the valid Address1 Name for BuyerAndSellerAccount")
	public void user_enter_the_valid_address1_name_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getAddress1().sendKeys("2827 Gandy Street");

	}
	@When(": User Enter the valid Address2 Name for BuyerAndSellerAccount")
	public void user_enter_the_valid_address2_name_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getAddress2().sendKeys("Testing");

	}
	@When(": User Enter the valid  City Name for BuyerAndSellerAccount")
	public void user_enter_the_valid_city_name_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getCity().sendKeys("Syracuse");

	}
	@When(": User Enter DropDown  and Select State for BuyerAndSellerAccount")
	public void user_enter_drop_down_and_select_state_for_buyer_and_seller_account() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000); 
		both.getselectdropdown().click();
		 Thread.sleep(2000);  
			driver.findElement(By.xpath("//div[text()='NY-New York']")).click();
	}
	@When(": User Enter the valid locationZipCode for BuyerAndSellerAccount")
	public void user_enter_the_valid_location_zip_code_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getlocationZipCode().sendKeys("13202");

	}
	/*@When(": User Enter the Promo Code or Referral Code for BuyerAndSellerAccount")
	public void user_enter_the_promo_code_or_referral_code_for_buyer_and_seller_account() {
		driver.findElement(By.xpath("//input[@name='promoCodeInput']")).sendKeys("automationqa");

	}
	@When(": User Click on the apply button for BuyerAndSellerAccount")
	public void user_click_on_the_apply_button_for_buyer_and_seller_account() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@type='app-green-button']")).click();
	}
	@When(": User Sumbit the popup alert5 for BuyerAndSellerAccount")
	public void user_sumbit_the_popup_alert5_for_buyer_and_seller_account() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	@When(": User acknowledged that this promo code for BuyerAndSellerAccount")
	public void user_acknowledged_that_this_promo_code_for_buyer_and_seller_account() {
		WebElement element1=driver.findElement(By.xpath("//span[@class='checkMark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
	}*/
	@When(": User Enter the SumbitButton for BuyerAndSellerAccount")
	public void user_enter_the_sumbit_button_for_buyer_and_seller_account() {
		WebElement element1=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1); 
	}
	@When(": User Enter the valid OTP in popup Screen for BuyerAndSellerAccount")
	public void user_enter_the_valid_otp_in_popup_screen_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getOtp().sendKeys("223345");
	}
	@When(": User Enter the GreenSumbitButton for BuyerAndSellerAccount")
	public void user_enter_the_green_sumbit_button_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getGreenButton().click();
	}
	@Then(": User verified EmaiId for BuyerAndSellerAccount")
	public void user_verified_emai_id_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
			both.getVerifiedEmailid().click();
	}
	@When(": User Enter the Not Register for  the Broker for BuyerAndSellerAccount")
	public void user_enter_the_not_register_for_the_broker_for_buyer_and_seller_account() throws InterruptedException {
		 WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
			Thread.sleep(2000);
	}
	@When(": User Enter the register for this platform to BuyerPallets for BuyerAndSellerAccount")
	public void user_enter_the_register_for_this_platform_to_buyer_pallets_for_buyer_and_seller_account() throws InterruptedException {
		Thread.sleep(2000);
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getRegisterforTheBuyer().click();
		Thread.sleep(2000);
	}
	@When(": User Enter the register for this platform to SellerPallets for BuyerAndSellerAccount")
	public void user_enter_the_register_for_this_platform_to_seller_pallets_for_buyer_and_seller_account() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='true']//span[@class='radio-checkmark']")));
		//Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		// both.getRegisterforTheSeller().click();
	
		WebElement element1=driver.findElement(By.xpath("//label[@for='true']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	
	
	
	
	}
	
	@When(": User Enter the company operate  Single location for BuyerAndSellerAccount")
	public void user_enter_the_company_operate_single_location_for_buyer_and_seller_account() throws InterruptedException {
		Thread.sleep(2000);
		   WebElement element2=driver.findElement(By.xpath("//label[@for='ONE']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
	}
	@When(": User Enter the Valid TaxId for BuyerAndSellerAccount")
	public void user_enter_the_valid_tax_id_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getTaxId().sendKeys("232222222");
	}
	@When(": User Enter the Valid DNB\\/DUNS for BuyerAndSellerAccount")
	public void user_enter_the_valid_dnb_duns_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getDNBDUNS().sendKeys("45-455-5555");
	}
	//@When(": User Enter the UploadCreditReferences for BuyerAndSellerAccount")
	//public void user_enter_the_upload_credit_references_for_buyer_and_seller_account() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	//}
	@When(": User Enter the BusinessURL for BuyerAndSellerAccount")
	public void user_enter_the_business_url_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getURL().sendKeys("https://www.officeplace.com/");
	}
	@When(": User Enter the BusinessDescription for BuyerAndSellerAccount")
	public void user_enter_the_business_description_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getBusinessDescription().sendKeys("Business Description");
	}
	@When(": User Enter the SellersRemittance Information for BuyerAndSellerAccount")
	public void user_enter_the_sellers_remittance_information_for_buyer_and_seller_account() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card for BuyerAndSellerAccount")
	public void user_enter_the_name_on_the_card_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		   both.getNameOnTheCard().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number for BuyerAndSellerAccount")
	public void user_enter_the_valid_card_number_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		both.getCardNumber().sendKeys("6011981111111113");
	}
	@When(": User Enter the valid Expiration Date for BuyerAndSellerAccount")
	public void user_enter_the_valid_expiration_date_for_buyer_and_seller_account() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getExpirationDate().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number for BuyerAndSellerAccount")
	public void user_enter_the_valid_cvc_cvv_number_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		  
		   driver.switchTo().parentFrame();
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
			both.getCVCCVVNumber().sendKeys("123");
			driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate SellerRemittance Information for BuyerAndSellerAccount")
	public void user_enter_the_validate_seller_remittance_information_for_buyer_and_seller_account() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert for BuyerAndSellerAccount")
	public void user_sumbit_the_popup_alert_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
     both.getPopupAlert().click(); 
	}
	@When(": User Enter the BuyerPaymentInformation for BuyerAndSellerAccount")
	public void user_enter_the_buyer_payment_information_for_buyer_and_seller_account() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[@for='buyerDebitCard']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card1 for BuyerAndSellerAccount")
	public void user_enter_the_name_on_the_card1_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getNameOnTheCard1().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number1 for BuyerAndSellerAccount")
	public void user_enter_the_valid_card_number1_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		both.getCardNumber1().sendKeys("4000056655665556");
	}
	@When(": User Enter the valid Expiration Date1 for BuyerAndSellerAccount")
	public void user_enter_the_valid_expiration_date1_for_buyer_and_seller_account() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));

		Thread.sleep(3000);
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getExpirationDate1().sendKeys("0426");
	}
	
	@When(": User Enter the valid CVC\\/CVV Number1 for BuyerAndSellerAccount")
	public void user_enter_the_valid_cvc_cvv_number1_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		both.getCVCCVVNumber1().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation for BuyerAndSellerAccount")
	public void user_enter_the_validate_buyers_payment_information_for_buyer_and_seller_account() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert1 for BuyerAndSellerAccount")
	public void user_sumbit_the_popup_alert1_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getPopupAlert1().click();
	}
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard for BuyerAndSellerAccount")
	public void user_enter_the_membership_payment_information_with_name_on_the_card_for_buyer_and_seller_account() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000);
		both.getMembershipName().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number for MembershipPayment for BuyerAndSellerAccount")
	public void user_enter_the_valid_card_number_for_membership_payment_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    both.getMembershipCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for MembershipPayment for BuyerAndSellerAccount")
	public void user_enter_the_valid_expiration_date_for_membership_payment_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment for BuyerAndSellerAccount")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		both.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate MembershipPaymentInformation for BuyerAndSellerAccount")
	public void user_enter_the_validate_membership_payment_information_for_buyer_and_seller_account() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Sumbit the popup alert2 for BuyerAndSellerAccount")
	public void user_sumbit_the_popup_alert2_for_buyer_and_seller_account() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000);
		both.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step for BuyerAndSellerAccount")
	public void user_enter_the_next_step_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@When(": User Accept Subscription Fee for BuyerAndSellerAccount")
	public void user_accept_subscription_fee_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Acknowledged and Agree for BuyerAndSellerAccount")
	public void user_acknowledged_and_agree_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element9=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
		JavascriptExecutor executor9=(JavascriptExecutor)driver;
		executor9.executeScript("arguments[0].click();",element9);
	}
	@When(": User Enter the Sumbit Button1 for BuyerAndSellerAccount")
	public void user_enter_the_sumbit_button1_for_buyer_and_seller_account() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@Then(": User Sucessfully Registered With Valid Credentials for BuyerAndSellerAccount")
	public void user_sucessfully_registered_with_valid_credentials_for_buyer_and_seller_account() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(5000);
		both.getSucessfullyRegistered().click();
	
		Thread.sleep(2000);
		driver.close();
	}

	// ------------------------ @BuyerAndSellerAccountSingleLocationwithLicence-----------------------------------------

	@Given(": User navigates to the website myapp.pallettrader.com for BuyerAndSellerAccount1")
	public void user_navigates_to_the_website_myapp_pallettrader_com_for_buyer_and_seller_account1() throws Throwable {
		driver=initializeDriver() ;
		//driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");
	}
	@When(": User Enter the signup page for BuyerAndSellerAccount1")
	public void user_enter_the_signup_page_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getRegistration().click();
	}
	@When(": User Enter the Registration form for BuyerAndSellerAccount1")
	public void user_enter_the_registration_form_for_buyer_and_seller_account1() {
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
	}
	@When(": User Enter the valid UserName for BuyerAndSellerAccount1")
	public void user_enter_the_valid_user_name_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getUsername().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid EmailId for BuyerAndSellerAccount1")
	public void user_enter_the_valid_email_id_for_buyer_and_seller_account1() {
		//Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		//both.getEmail().sendKeys("1108s@mailinator.com");
	
		int num = randomFourDigitGenerator();
		   String randomNum = String.valueOf(num);
		   System.out.println(randomNum);
			Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		   both.getEmail().sendKeys(randomNum + "z@mailinator.com");
		   System.out.println(randomNum + "z@mailinator.com");
	}
	@When(": User Enter the valid PassWord for BuyerAndSellerAccount1")
	public void user_enter_the_valid_pass_word_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getpassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid Conform Password for BuyerAndSellerAccount1")
	public void user_enter_the_valid_conform_password_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getConfirmPassword().sendKeys("Test@123");

	}
	@When(": User Enter the valid CompanyName for BuyerAndSellerAccount1")
	public void user_enter_the_valid_company_name_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getCompanyNamel().sendKeys("PalletTrader");
	}
	@When(": User Enter the valid Cell Phone Number for BuyerAndSellerAccount1")
	public void user_enter_the_valid_cell_phone_number_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getPhoneNumber().sendKeys("315-280-8677");
	}
	@When(": User Enter the valid Address1 Name for BuyerAndSellerAccount1")
	public void user_enter_the_valid_address1_name_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getAddress1().sendKeys("2827 Gandy Street");

	}
	@When(": User Enter the valid Address2 Name for BuyerAndSellerAccount1")
	public void user_enter_the_valid_address2_name_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getAddress2().sendKeys("Testing");
	}
	@When(": User Enter the valid  City Name for BuyerAndSellerAccount1")
	public void user_enter_the_valid_city_name_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getCity().sendKeys("Syracuse");

	}
	@When(": User Enter DropDown  and Select State for BuyerAndSellerAccount1")
	public void user_enter_drop_down_and_select_state_for_buyer_and_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000); 
		both.getselectdropdown().click();
		 Thread.sleep(2000);  
			driver.findElement(By.xpath("//div[text()='NY-New York']")).click();
	}
	@When(": User Enter the valid locationZipCode for BuyerAndSellerAccount1")
	public void user_enter_the_valid_location_zip_code_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getlocationZipCode().sendKeys("13202");

	}
	/*@When(": User Enter the Promo Code or Referral Code for BuyerAndSellerAccount1")
	public void user_enter_the_promo_code_or_referral_code_for_buyer_and_seller_account1() {
		driver.findElement(By.xpath("//input[@name='promoCodeInput']")).sendKeys("automationqa");

	}
	@When(": User Click on the apply button for BuyerAndSellerAccount1")
	public void user_click_on_the_apply_button_for_buyer_and_seller_account1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@type='app-green-button']")).click();
	
	}
	@When(": User Sumbit the popup alert5 for BuyerAndSellerAccount1")
	public void user_sumbit_the_popup_alert5_for_buyer_and_seller_account1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	@When(": User acknowledged that this promo code for BuyerAndSellerAccount1")
	public void user_acknowledged_that_this_promo_code_for_buyer_and_seller_account1() {
		WebElement element1=driver.findElement(By.xpath("//span[@class='checkMark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
	}*/
	@When(": User Enter the SumbitButton for BuyerAndSellerAccount1")
	public void user_enter_the_sumbit_button_for_buyer_and_seller_account1() {
		WebElement element1=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1); 
	}
	@When(": User Enter the valid OTP in popup Screen for BuyerAndSellerAccount1")
	public void user_enter_the_valid_otp_in_popup_screen_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getOtp().sendKeys("223345");
	}
	@When(": User Enter the GreenSumbitButton for BuyerAndSellerAccount1")
	public void user_enter_the_green_sumbit_button_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getGreenButton().click();
	}
	@Then(": User verified EmaiId for BuyerAndSellerAccount1")
	public void user_verified_emai_id_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getVerifiedEmailid().click();
	}
	@When(": User Enter the Not Register for  the Broker for BuyerAndSellerAccount1")
	public void user_enter_the_not_register_for_the_broker_for_buyer_and_seller_account1() throws InterruptedException {
		 WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
			Thread.sleep(2000);
	}
	@When(": User Enter the register for this platform to BuyerPallets for BuyerAndSellerAccount1")
	public void user_enter_the_register_for_this_platform_to_buyer_pallets_for_buyer_and_seller_account1() throws InterruptedException {
		Thread.sleep(2000);
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getRegisterforTheBuyer().click();
		Thread.sleep(2000);
	}
	@When(": User Enter the register for this platform to SellerPallets for BuyerAndSellerAccount1")
	public void user_enter_the_register_for_this_platform_to_seller_pallets_for_buyer_and_seller_account1() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='true']//span[@class='radio-checkmark']")));
		//Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		 //both.getRegisterforTheSeller().click();
	
		WebElement element1=driver.findElement(By.xpath("//label[@for='true']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	
	
	}
	@When(": User Enter the company operate  Single location for BuyerAndSellerAccount1")
	public void user_enter_the_company_operate_single_location_for_buyer_and_seller_account1() throws InterruptedException {
		Thread.sleep(2000);
		   WebElement element2=driver.findElement(By.xpath("//label[@for='ONE']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
	}
	@When(": User Enter the BusinessInformationWithLICENSE for BuyerAndSellerAccount1")
	public void user_enter_the_business_information_with_license_for_buyer_and_seller_account1() {
		WebElement element = driver.findElement(By.xpath("//label[normalize-space()='LICENSE']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}
	@When(": User Enter the Valid Driver's License Number for BuyerAndSellerAccount1")
	public void user_enter_the_valid_driver_s_license_number_for_buyer_and_seller_account1() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("11111111111111111111");

	}
	@When(": User Click On the Drivers License State Drop down for BuyerAndSellerAccount1")
	public void user_click_on_the_drivers_license_state_drop_down_for_buyer_and_seller_account1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();

	}
	@When(": User Select the Drivers License State for BuyerAndSellerAccount1")
	public void user_select_the_drivers_license_state_for_buyer_and_seller_account1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='AL-Alabama']")).click();
	}
	@When(": User Enter the valid First Name for BuyerAndSellerAccount1")
	public void user_enter_the_valid_first_name_for_buyer_and_seller_account1() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hello");

	}
	@When(": User Enter the valid Last Name for BuyerAndSellerAccount1")
	public void user_enter_the_valid_last_name_for_buyer_and_seller_account1() {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tester");

	}
	@When(": User Enter the valid Date of Birth  for BuyerAndSellerAccount1")
	public void user_enter_the_valid_date_of_birth_for_buyer_and_seller_account1() {
		String year="2004";
		String month="August";
		String date="30";
		
		WebElement element94 = driver.findElement(By.xpath("//button[@aria-label='change date']//span[@class='MuiIconButton-label']"));
		JavascriptExecutor executor94 = (JavascriptExecutor) driver;
		executor94.executeScript("arguments[0].click();", element94);	
		
		//driver.findElement(By.xpath("//button[@aria-label='change date']//span[@class='MuiIconButton-label']")).click();
		
				while(true)
				{
					
					String monthyear=driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter'])[1]")).getText();
					
				String arr[]=monthyear.split(" ");
				String mon=arr[0];
				String yr=arr[1];
				
				if(mon.equals(month) && yr.equals(year))
				break;
				else
					
					driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersCalendarHeader-iconButton']")).click();
				
				}
						
		List<WebElement> alldates=driver.findElements(By.xpath("//div[@class='MuiPickersBasePicker-pickerView']//button"));
		for(WebElement ele:alldates)
				
		{
			String dt=ele.getText();
			
			if(dt.equals(date))
			
			{
				ele.click();
				break;
			}
				
				}
		
		driver.findElement(By.xpath("//span[normalize-space()='OK']")).click();
	}
	@When(": User Upload the valid Driver's License for BuyerAndSellerAccount1")
	public void user_upload_the_valid_driver_s_license_for_buyer_and_seller_account1() {
		driver.findElement(By.xpath("//input[@id='drivingLicenseDoc']")).sendKeys("C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-Pallet-Trader-Registration-Broker-Buyer-Seller-BuyerAndSeller\\Resources\\License.jpg");

	}
	@When(": User Enter the BusinessURL for BuyerAndSellerAccount1")
	public void user_enter_the_business_url_for_buyer_and_seller_account1() {
		driver.findElement(By.xpath("//input[@placeholder='https//:']")).sendKeys("https://www.officeplace.com/");

	}
	@When(": User Enter the BusinessDescription for BuyerAndSellerAccount1")
	public void user_enter_the_business_description_for_buyer_and_seller_account1() {
		driver.findElement(By.xpath("//textarea[@name='businessDesc']")).sendKeys("Business Description");

	}
	@When(": User Enter the SellersRemittance Information for BuyerAndSellerAccount1")
	public void user_enter_the_sellers_remittance_information_for_buyer_and_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card for BuyerAndSellerAccount1")
	public void user_enter_the_name_on_the_card_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		   both.getNameOnTheCard().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number for BuyerAndSellerAccount1")
	public void user_enter_the_valid_card_number_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		both.getCardNumber().sendKeys("6011981111111113");
	}
	@When(": User Enter the valid Expiration Date for BuyerAndSellerAccount1")
	public void user_enter_the_valid_expiration_date_for_buyer_and_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getExpirationDate().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number for BuyerAndSellerAccount1")
	public void user_enter_the_valid_cvc_cvv_number_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		  
		   driver.switchTo().parentFrame();
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
			both.getCVCCVVNumber().sendKeys("123");
			driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate SellerRemittance Information for BuyerAndSellerAccount1")
	public void user_enter_the_validate_seller_remittance_information_for_buyer_and_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert for BuyerAndSellerAccount1")
	public void user_sumbit_the_popup_alert_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
	     both.getPopupAlert().click(); 
	}
	@When(": User Enter the BuyerPaymentInformation for BuyerAndSellerAccount1")
	public void user_enter_the_buyer_payment_information_for_buyer_and_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[@for='buyerDebitCard']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card1 for BuyerAndSellerAccount1")
	public void user_enter_the_name_on_the_card1_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getNameOnTheCard1().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number1 for BuyerAndSellerAccount1")
	public void user_enter_the_valid_card_number1_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		both.getCardNumber1().sendKeys("4000056655665556");
	}
	@When(": User Enter the valid Expiration Date1 for BuyerAndSellerAccount1")
	public void user_enter_the_valid_expiration_date1_for_buyer_and_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));

		Thread.sleep(3000);
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getExpirationDate1().sendKeys("0426");
	}
	@When(": User Enter the valid CVC\\/CVV Number1 for BuyerAndSellerAccount1")
	public void user_enter_the_valid_cvc_cvv_number1_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		both.getCVCCVVNumber1().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation for BuyerAndSellerAccount1")
	public void user_enter_the_validate_buyers_payment_information_for_buyer_and_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert1 for BuyerAndSellerAccount1")
	public void user_sumbit_the_popup_alert1_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getPopupAlert1().click();
	}
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard for BuyerAndSellerAccount1")
	public void user_enter_the_membership_payment_information_with_name_on_the_card_for_buyer_and_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000);
		both.getMembershipName().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number for MembershipPayment for BuyerAndSellerAccount1")
	public void user_enter_the_valid_card_number_for_membership_payment_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    both.getMembershipCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for MembershipPayment for BuyerAndSellerAccount1")
	public void user_enter_the_valid_expiration_date_for_membership_payment_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment for BuyerAndSellerAccount1")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		both.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate MembershipPaymentInformation for BuyerAndSellerAccount1")
	public void user_enter_the_validate_membership_payment_information_for_buyer_and_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Sumbit the popup alert2 for BuyerAndSellerAccount1")
	public void user_sumbit_the_popup_alert2_for_buyer_and_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000);
		both.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step for BuyerAndSellerAccount1")
	public void user_enter_the_next_step_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@When(": User Accept Subscription Fee for BuyerAndSellerAccount1")
	public void user_accept_subscription_fee_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Acknowledged and Agree for BuyerAndSellerAccount1")
	public void user_acknowledged_and_agree_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element9=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
		JavascriptExecutor executor9=(JavascriptExecutor)driver;
		executor9.executeScript("arguments[0].click();",element9);
	}
	@When(": User Enter the Sumbit Button1 for BuyerAndSellerAccount1")
	public void user_enter_the_sumbit_button1_for_buyer_and_seller_account1() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@Then(": User Sucessfully Registered With Valid Credentials for BuyerAndSellerAccount1")
	public void user_sucessfully_registered_with_valid_credentials_for_buyer_and_seller_account1() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(5000);
		both.getSucessfullyRegistered().click();
	
		Thread.sleep(2000);
		driver.close();
	
	}

// ------------------------ @BuyerandSellerAccountMultiplelocationwithIndependentPayment-----------------------------------------
	@Given(": User navigates to the website myapp.pallettrader.com for BuyerAndSellerAccount2")
	public void user_navigates_to_the_website_myapp_pallettrader_com_for_buyer_and_seller_account2() throws Throwable {
		driver=initializeDriver() ;
		//driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");
	}
	@When(": User Enter the signup page for BuyerAndSellerAccount2")
	public void user_enter_the_signup_page_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getRegistration().click();
	}
	@When(": User Enter the Registration form for BuyerAndSellerAccount2")
	public void user_enter_the_registration_form_for_buyer_and_seller_account2() {
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);  
	}
	@When(": User Enter the valid UserName for BuyerAndSellerAccount2")
	public void user_enter_the_valid_user_name_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getUsername().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid EmailId for BuyerAndSellerAccount2")
	public void user_enter_the_valid_email_id_for_buyer_and_seller_account2() {
		//Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		//both.getEmail().sendKeys("1109a@mailinator.com");
	
		int num = randomFourDigitGenerator();
		   String randomNum = String.valueOf(num);
		   System.out.println(randomNum);
			Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		   both.getEmail().sendKeys(randomNum + "y@mailinator.com");
		   System.out.println(randomNum + "y@mailinator.com");
	
	}
	@When(": User Enter the valid PassWord for BuyerAndSellerAccount2")
	public void user_enter_the_valid_pass_word_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getpassword().sendKeys("Test@123");

	}
	@When(": User Enter the valid Conform Password for BuyerAndSellerAccount2")
	public void user_enter_the_valid_conform_password_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getConfirmPassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid CompanyName for BuyerAndSellerAccount2")
	public void user_enter_the_valid_company_name_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getCompanyNamel().sendKeys("PalletTrader");
	}
	@When(": User Enter the valid Cell Phone Number for BuyerAndSellerAccount2")
	public void user_enter_the_valid_cell_phone_number_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getPhoneNumber().sendKeys("315-280-8677");
	}
	@When(": User Enter the valid Address1 Name for BuyerAndSellerAccount2")
	public void user_enter_the_valid_address1_name_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getAddress1().sendKeys("2827 Gandy Street");
	}
	@When(": User Enter the valid Address2 Name for BuyerAndSellerAccount2")
	public void user_enter_the_valid_address2_name_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getAddress2().sendKeys("Testing");

	}
	@When(": User Enter the valid  City Name for BuyerAndSellerAccount2")
	public void user_enter_the_valid_city_name_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getCity().sendKeys("Syracuse");
	}
	@When(": User Enter DropDown  and Select State for BuyerAndSellerAccount2")
	public void user_enter_drop_down_and_select_state_for_buyer_and_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000); 
		both.getselectdropdown().click();
		 Thread.sleep(2000);  
			driver.findElement(By.xpath("//div[text()='NY-New York']")).click();
	}
	@When(": User Enter the valid locationZipCode for BuyerAndSellerAccount2")
	public void user_enter_the_valid_location_zip_code_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getlocationZipCode().sendKeys("13202");
	}
	/*@When(": User Enter the Promo Code or Referral Code for BuyerAndSellerAccount2")
	public void user_enter_the_promo_code_or_referral_code_for_buyer_and_seller_account2() {
		driver.findElement(By.xpath("//input[@name='promoCodeInput']")).sendKeys("automationqa");

	}
	@When(": User Click on the apply button for BuyerAndSellerAccount2")
	public void user_click_on_the_apply_button_for_buyer_and_seller_account2() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@type='app-green-button']")).click();
	}
	@When(": User Sumbit the popup alert5 for BuyerAndSellerAccount2")
	public void user_sumbit_the_popup_alert5_for_buyer_and_seller_account2() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	@When(": User acknowledged that this promo code for BuyerAndSellerAccount2")
	public void user_acknowledged_that_this_promo_code_for_buyer_and_seller_account2() {
		WebElement element1=driver.findElement(By.xpath("//span[@class='checkMark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
	}*/
	@When(": User Enter the SumbitButton for BuyerAndSellerAccount2")
	public void user_enter_the_sumbit_button_for_buyer_and_seller_account2() {
		WebElement element1=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
	}
	@When(": User Enter the valid OTP in popup Screen for BuyerAndSellerAccount2")
	public void user_enter_the_valid_otp_in_popup_screen_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getOtp().sendKeys("223345");
	}
	@When(": User Enter the GreenSumbitButton for BuyerAndSellerAccount2")
	public void user_enter_the_green_sumbit_button_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getGreenButton().click();
	}
	@Then(": User verified EmaiId for BuyerAndSellerAccount2")
	public void user_verified_emai_id_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getVerifiedEmailid().click();
	}
	@When(": User Enter the Not Register for  the Broker for BuyerAndSellerAccount2")
	public void user_enter_the_not_register_for_the_broker_for_buyer_and_seller_account2() throws InterruptedException {
		WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	}
	@When(": User Enter the register for this platform to BuyerPallets for BuyerAndSellerAccount2")
	public void user_enter_the_register_for_this_platform_to_buyer_pallets_for_buyer_and_seller_account2() throws InterruptedException {
		Thread.sleep(2000);
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getRegisterforTheBuyer().click();
		Thread.sleep(2000);
	}
	@When(": User Enter the register for this platform to SellerPallets for BuyerAndSellerAccount2")
	public void user_enter_the_register_for_this_platform_to_seller_pallets_for_buyer_and_seller_account2() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='true']//span[@class='radio-checkmark']")));;
		//Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		// both.getRegisterforTheSeller().click();
	
		WebElement element1=driver.findElement(By.xpath("//label[@for='true']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	
	
	
	}
	@When(": User Enter the company operate  Multiple location for BuyerAndSellerAccount2")
	public void user_enter_the_company_operate_multiple_location_for_buyer_and_seller_account2() throws InterruptedException {
		Thread.sleep(2000);
		   WebElement element2=driver.findElement(By.xpath("//label[normalize-space()='Multiple']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
	}
	@When(": User Enter the Payment options and click the independent payment for BuyerAndSellerAccount2")
	public void user_enter_the_payment_options_and_click_the_independent_payment_for_buyer_and_seller_account2() throws InterruptedException {
		WebElement element3=driver.findElement(By.xpath("//label[@for='INDEPENDENT']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor3=(JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();",element3);
		Thread.sleep(2000);	  
	}
	@When(": User Enter the Valid TaxId for BuyerAndSellerAccount for BuyerAndSellerAccount2")
	public void user_enter_the_valid_tax_id_for_buyer_and_seller_account_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getTaxId().sendKeys("232222222");
	}
	@When(": User Enter the Valid DNB\\/DUNS for BuyerAndSellerAccount for BuyerAndSellerAccount2")
	public void user_enter_the_valid_dnb_duns_for_buyer_and_seller_account_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getDNBDUNS().sendKeys("45-455-5555");
	}
	@When(": User Enter the BusinessURL for BuyerAndSellerAccount for BuyerAndSellerAccount2")
	public void user_enter_the_business_url_for_buyer_and_seller_account_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getURL().sendKeys("https://www.officeplace.com/");
	}
	@When(": User Enter the BusinessDescription for BuyerAndSellerAccount2")
	public void user_enter_the_business_description_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getBusinessDescription().sendKeys("Business Description");
	}
	@When(": User Enter the SellersRemittance Information for BuyerAndSellerAccount2")
	public void user_enter_the_sellers_remittance_information_for_buyer_and_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card for BuyerAndSellerAccount2")
	public void user_enter_the_name_on_the_card_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		   both.getNameOnTheCard().sendKeys("AutomationQa");	
		   }
	@When(": User Enter the valid Card Number for BuyerAndSellerAccount2")
	public void user_enter_the_valid_card_number_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		both.getCardNumber().sendKeys("6011981111111113");
	}
	@When(": User Enter the valid Expiration Date for BuyerAndSellerAccount2")
	public void user_enter_the_valid_expiration_date_for_buyer_and_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getExpirationDate().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number for BuyerAndSellerAccount2")
	public void user_enter_the_valid_cvc_cvv_number_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		  
		   driver.switchTo().parentFrame();
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
			both.getCVCCVVNumber().sendKeys("123");
			driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate SellerRemittance Information for BuyerAndSellerAccount2")
	public void user_enter_the_validate_seller_remittance_information_for_buyer_and_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert for BuyerAndSellerAccount2")
	public void user_sumbit_the_popup_alert_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
	     both.getPopupAlert().click(); 
	}
	@When(": User Enter the BuyerPaymentInformation for BuyerAndSellerAccount2")
	public void user_enter_the_buyer_payment_information_for_buyer_and_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[@for='buyerDebitCard']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card1 for BuyerAndSellerAccount2")
	public void user_enter_the_name_on_the_card1_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getNameOnTheCard1().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number1 for BuyerAndSellerAccount2")
	public void user_enter_the_valid_card_number1_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		both.getCardNumber1().sendKeys("4000056655665556");
	}
	@When(": User Enter the valid Expiration Date1 for BuyerAndSellerAccount2")
	public void user_enter_the_valid_expiration_date1_for_buyer_and_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));

		Thread.sleep(3000);
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getExpirationDate1().sendKeys("0426");
	}
	@When(": User Enter the valid CVC\\/CVV Number1 for BuyerAndSellerAccount2")
	public void user_enter_the_valid_cvc_cvv_number1_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		both.getCVCCVVNumber1().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation for BuyerAndSellerAccount2")
	public void user_enter_the_validate_buyers_payment_information_for_buyer_and_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert1 for BuyerAndSellerAccount2")
	public void user_sumbit_the_popup_alert1_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getPopupAlert1().click();
	}
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard for BuyerAndSellerAccount2")
	public void user_enter_the_membership_payment_information_with_name_on_the_card_for_buyer_and_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000);
		both.getMembershipName().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number for MembershipPayment for BuyerAndSellerAccount2")
	public void user_enter_the_valid_card_number_for_membership_payment_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    both.getMembershipCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for MembershipPayment for BuyerAndSellerAccount2")
	public void user_enter_the_valid_expiration_date_for_membership_payment_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment for BuyerAndSellerAccount2")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		both.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate MembershipPaymentInformation for BuyerAndSellerAccount2")
	public void user_enter_the_validate_membership_payment_information_for_buyer_and_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Sumbit the popup alert2 for BuyerAndSellerAccount2")
	public void user_sumbit_the_popup_alert2_for_buyer_and_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000);
		both.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step for BuyerAndSellerAccount2")
	public void user_enter_the_next_step_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@When(": User Accept Subscription Fee for BuyerAndSellerAccount2")
	public void user_accept_subscription_fee_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Acknowledged and Agree for BuyerAndSellerAccount2")
	public void user_acknowledged_and_agree_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element9=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
		JavascriptExecutor executor9=(JavascriptExecutor)driver;
		executor9.executeScript("arguments[0].click();",element9);
	}
	@When(": User Enter the Sumbit Button1 for BuyerAndSellerAccount2")
	public void user_enter_the_sumbit_button1_for_buyer_and_seller_account2() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@Then(": User Sucessfully Registered With Valid Credentials for BuyerAndSellerAccount2")
	public void user_sucessfully_registered_with_valid_credentials_for_buyer_and_seller_account2() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(20000);
		both.getSucessfullyRegistered().click();
	
		Thread.sleep(2000);
		driver.close();
	
	}


	
	//--------------------  @BuyerandSellerAccountMultiplelocationwithCentralizedPayment-----------------------------------------
	
	@Given(": User navigates to the website myapp.pallettrader.com for BuyerAndSellerAccount3")
	public void user_navigates_to_the_website_myapp_pallettrader_com_for_buyer_and_seller_account3() throws Throwable {
		driver=initializeDriver() ;
		//driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");
	}
	@When(": User Enter the signup page for BuyerAndSellerAccount3")
	public void user_enter_the_signup_page_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getRegistration().click();
	}
	@When(": User Enter the Registration form for BuyerAndSellerAccount3")
	public void user_enter_the_registration_form_for_buyer_and_seller_account3() {
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);  
	}
	@When(": User Enter the valid UserName for BuyerAndSellerAccount3")
	public void user_enter_the_valid_user_name_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getUsername().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid EmailId for BuyerAndSellerAccount3")
	public void user_enter_the_valid_email_id_for_buyer_and_seller_account3() {
		//Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		//both.getEmail().sendKeys("1109j@mailinator.com");
	
		int num = randomFourDigitGenerator();
		   String randomNum = String.valueOf(num);
		   System.out.println(randomNum);
			Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		   both.getEmail().sendKeys(randomNum + "x@mailinator.com");
		   System.out.println(randomNum + "x@mailinator.com");
	
	
	}
	@When(": User Enter the valid PassWord for BuyerAndSellerAccount3")
	public void user_enter_the_valid_pass_word_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getpassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid Conform Password for BuyerAndSellerAccount3")
	public void user_enter_the_valid_conform_password_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getConfirmPassword().sendKeys("Test@123");

	}
	@When(": User Enter the valid CompanyName for BuyerAndSellerAccount3")
	public void user_enter_the_valid_company_name_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getCompanyNamel().sendKeys("PalletTrader");
	}
	@When(": User Enter the valid Cell Phone Number for BuyerAndSellerAccount3")
	public void user_enter_the_valid_cell_phone_number_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getPhoneNumber().sendKeys("315-280-8677");
	}
	@When(": User Enter the valid Address1 Name for BuyerAndSellerAccount3")
	public void user_enter_the_valid_address1_name_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getAddress1().sendKeys("2827 Gandy Street");
	}
	@When(": User Enter the valid Address2 Name for BuyerAndSellerAccount3")
	public void user_enter_the_valid_address2_name_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getAddress2().sendKeys("Testing");
	}
	@When(": User Enter the valid  City Name for BuyerAndSellerAccount3")
	public void user_enter_the_valid_city_name_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getCity().sendKeys("Syracuse");
	}
	@When(": User Enter DropDown  and Select State for BuyerAndSellerAccount3")
	public void user_enter_drop_down_and_select_state_for_buyer_and_seller_account3() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000); 
		both.getselectdropdown().click();
		 Thread.sleep(2000);  
			driver.findElement(By.xpath("//div[text()='NY-New York']")).click();
	}
	@When(": User Enter the valid locationZipCode for BuyerAndSellerAccount3")
	public void user_enter_the_valid_location_zip_code_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getlocationZipCode().sendKeys("13202");
	}
	/*@When(": User Enter the Promo Code or Referral Code for BuyerAndSellerAccount3")
	public void user_enter_the_promo_code_or_referral_code_for_buyer_and_seller_account3() {
		driver.findElement(By.xpath("//input[@name='promoCodeInput']")).sendKeys("automationqa");

	}
	@When(": User Click on the apply button for BuyerAndSellerAccount3")
	public void user_click_on_the_apply_button_for_buyer_and_seller_account3() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@type='app-green-button']")).click();
	}
	@When(": User Sumbit the popup alert5 for BuyerAndSellerAccount3")
	public void user_sumbit_the_popup_alert5_for_buyer_and_seller_account3() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	@When(": User acknowledged that this promo code for BuyerAndSellerAccount3")
	public void user_acknowledged_that_this_promo_code_for_buyer_and_seller_account3() {
		WebElement element1=driver.findElement(By.xpath("//span[@class='checkMark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
	}*/
	@When(": User Enter the SumbitButton for BuyerAndSellerAccount3")
	public void user_enter_the_sumbit_button_for_buyer_and_seller_account3() {
		WebElement element1=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1); 
	}
	@When(": User Enter the valid OTP in popup Screen for BuyerAndSellerAccount3")
	public void user_enter_the_valid_otp_in_popup_screen_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getOtp().sendKeys("223345");
	}
	@When(": User Enter the GreenSumbitButton for BuyerAndSellerAccount3")
	public void user_enter_the_green_sumbit_button_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getGreenButton().click();
	}
	@Then(": User verified EmaiId for BuyerAndSellerAccount3")
	public void user_verified_emai_id_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getVerifiedEmailid().click();
	}
	@When(": User Enter the Not Register for  the Broker for BuyerAndSellerAccount3")
	public void user_enter_the_not_register_for_the_broker_for_buyer_and_seller_account3() throws InterruptedException {
		 WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
			Thread.sleep(2000);
	}
	@When(": User Enter the register for this platform to BuyerPallets for BuyerAndSellerAccount3")
	public void user_enter_the_register_for_this_platform_to_buyer_pallets_for_buyer_and_seller_account3() throws InterruptedException {
		Thread.sleep(2000);
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getRegisterforTheBuyer().click();
		Thread.sleep(2000);
	}
	@When(": User Enter the register for this platform to SellerPallets for BuyerAndSellerAccount3")
	public void user_enter_the_register_for_this_platform_to_seller_pallets_for_buyer_and_seller_account3() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='true']//span[@class='radio-checkmark']")));
		//Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		// both.getRegisterforTheSeller().click();
	
	
		WebElement element1=driver.findElement(By.xpath("//label[@for='true']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	
	
	
	
	
	
	
	
	}
	@When(": User Enter the company operate  Multiple location for BuyerAndSellerAccount3")
	public void user_enter_the_company_operate_multiple_location_for_buyer_and_seller_account3() throws InterruptedException {
		Thread.sleep(2000);
		   WebElement element2=driver.findElement(By.xpath("//label[normalize-space()='Multiple']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
	}
	@When(": User Enter the Payment options and click On the Centralized payment for BuyerAndSellerAccount3")
	public void user_enter_the_payment_options_and_click_on_the_centralized_payment_for_buyer_and_seller_account3() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element3=driver.findElement(By.xpath("//label[@for='BETTAWAY_BANK']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor3=(JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();",element3);
		Thread.sleep(2000);
	}
  @When(": User Enter the Valid TaxId for BuyerAndSellerAccount for BuyerAndSellerAccount3")
	public void user_enter_the_valid_tax_id_for_buyer_and_seller_account_for_buyer_and_seller_account3() {
	  Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getTaxId().sendKeys("232222222");
	}
	@When(": User Enter the Valid DNB\\/DUNS for BuyerAndSellerAccount for BuyerAndSellerAccount3")
	public void user_enter_the_valid_dnb_duns_for_buyer_and_seller_account_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getDNBDUNS().sendKeys("45-455-5555");
	}
	@When(": User Enter the BusinessURL for BuyerAndSellerAccount for BuyerAndSellerAccount3")
	public void user_enter_the_business_url_for_buyer_and_seller_account_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getURL().sendKeys("https://www.officeplace.com/");
	}
	@When(": User Enter the BusinessDescription for BuyerAndSellerAccount3")
	public void user_enter_the_business_description_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getBusinessDescription().sendKeys("Business Description");
	}
	@When(": User Enter the SellersRemittance Information for BuyerAndSellerAccount3")
	public void user_enter_the_sellers_remittance_information_for_buyer_and_seller_account3() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card for BuyerAndSellerAccount3")
	public void user_enter_the_name_on_the_card_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		   both.getNameOnTheCard().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number for BuyerAndSellerAccount3")
	public void user_enter_the_valid_card_number_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		both.getCardNumber().sendKeys("6011981111111113");
	}
	@When(": User Enter the valid Expiration Date for BuyerAndSellerAccount3")
	public void user_enter_the_valid_expiration_date_for_buyer_and_seller_account3() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getExpirationDate().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number for BuyerAndSellerAccount3")
	public void user_enter_the_valid_cvc_cvv_number_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		  
		   driver.switchTo().parentFrame();
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
			both.getCVCCVVNumber().sendKeys("123");
			driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate SellerRemittance Information for BuyerAndSellerAccount3")
	public void user_enter_the_validate_seller_remittance_information_for_buyer_and_seller_account3() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert for BuyerAndSellerAccount3")
	public void user_sumbit_the_popup_alert_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
	     both.getPopupAlert().click(); 
	}
	@When(": User Enter the BuyerPaymentInformation for BuyerAndSellerAccount3")
	public void user_enter_the_buyer_payment_information_for_buyer_and_seller_account3() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[@for='buyerDebitCard']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card1 for BuyerAndSellerAccount3")
	public void user_enter_the_name_on_the_card1_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getNameOnTheCard1().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number1 for BuyerAndSellerAccount3")
	public void user_enter_the_valid_card_number1_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		both.getCardNumber1().sendKeys("4000056655665556");
	}
	@When(": User Enter the valid Expiration Date1 for BuyerAndSellerAccount3")
	public void user_enter_the_valid_expiration_date1_for_buyer_and_seller_account3() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));

		Thread.sleep(3000);
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getExpirationDate1().sendKeys("0426");
	}
	@When(": User Enter the valid CVC\\/CVV Number1 for BuyerAndSellerAccount3")
	public void user_enter_the_valid_cvc_cvv_number1_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		both.getCVCCVVNumber1().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation for BuyerAndSellerAccount3")
	public void user_enter_the_validate_buyers_payment_information_for_buyer_and_seller_account3() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert1 for BuyerAndSellerAccount3")
	public void user_sumbit_the_popup_alert1_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getPopupAlert1().click();
	}
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard for BuyerAndSellerAccount3")
	public void user_enter_the_membership_payment_information_with_name_on_the_card_for_buyer_and_seller_account3() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000);
		both.getMembershipName().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number for MembershipPayment for BuyerAndSellerAccount3")
	public void user_enter_the_valid_card_number_for_membership_payment_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    both.getMembershipCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for MembershipPayment for BuyerAndSellerAccount3")
	public void user_enter_the_valid_expiration_date_for_membership_payment_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment for BuyerAndSellerAccount3")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		both.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate MembershipPaymentInformation for BuyerAndSellerAccount3")
	public void user_enter_the_validate_membership_payment_information_for_buyer_and_seller_account3() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Sumbit the popup alert2 for BuyerAndSellerAccount3")
	public void user_sumbit_the_popup_alert2_for_buyer_and_seller_account3() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000);
		both.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step for BuyerAndSellerAccount3")
	public void user_enter_the_next_step_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@When(": User Accept Subscription Fee for BuyerAndSellerAccount3")
	public void user_accept_subscription_fee_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Acknowledged and Agree for BuyerAndSellerAccount3")
	public void user_acknowledged_and_agree_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element9=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
		JavascriptExecutor executor9=(JavascriptExecutor)driver;
		executor9.executeScript("arguments[0].click();",element9);
	}
	@When(": User Enter the Sumbit Button1 for BuyerAndSellerAccount3")
	public void user_enter_the_sumbit_button1_for_buyer_and_seller_account3() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@Then(": User Sucessfully Registered With Valid Credentials for BuyerAndSellerAccount3")
	public void user_sucessfully_registered_with_valid_credentials_for_buyer_and_seller_account3() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(5000);
		both.getSucessfullyRegistered().click();
	
		Thread.sleep(2000);
		driver.close();
	
	}



// ------------------------ @BuyerandSellerAccountMultiplelocationwithHybridPayment-----------------------------------------

	@Given(": User navigates to the website myapp.pallettrader.com for BuyerAndSellerAccount4")
	public void user_navigates_to_the_website_myapp_pallettrader_com_for_buyer_and_seller_account4() throws Throwable {
		driver=initializeDriver() ;
		//driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");
	}
	@When(": User Enter the signup page for BuyerAndSellerAccount4")
	public void user_enter_the_signup_page_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getRegistration().click();
	}
	@When(": User Enter the Registration form for BuyerAndSellerAccount4")
	public void user_enter_the_registration_form_for_buyer_and_seller_account4() {
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
	}
	@When(": User Enter the valid UserName for BuyerAndSellerAccount4")
	public void user_enter_the_valid_user_name_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getUsername().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid EmailId for BuyerAndSellerAccount4")
	public void user_enter_the_valid_email_id_for_buyer_and_seller_account4() {
		//Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		//both.getEmail().sendKeys("1100k@mailinator.com");
	
		int num = randomFourDigitGenerator();
		   String randomNum = String.valueOf(num);
		   System.out.println(randomNum);
			Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		   both.getEmail().sendKeys(randomNum + "m@mailinator.com");
		   System.out.println(randomNum + "m@mailinator.com");
	
	}
	@When(": User Enter the valid PassWord for BuyerAndSellerAccount4")
	public void user_enter_the_valid_pass_word_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getpassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid Conform Password for BuyerAndSellerAccount4")
	public void user_enter_the_valid_conform_password_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getConfirmPassword().sendKeys("Test@123");
	}
	@When(": User Enter the valid CompanyName for BuyerAndSellerAccount4")
	public void user_enter_the_valid_company_name_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getCompanyNamel().sendKeys("PalletTrader");
	}
	@When(": User Enter the valid Cell Phone Number for BuyerAndSellerAccount4")
	public void user_enter_the_valid_cell_phone_number_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getPhoneNumber().sendKeys("315-280-8677");
	}
	@When(": User Enter the valid Address1 Name for BuyerAndSellerAccount4")
	public void user_enter_the_valid_address1_name_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getAddress1().sendKeys("2827 Gandy Street");
	}
	@When(": User Enter the valid Address2 Name for BuyerAndSellerAccount4")
	public void user_enter_the_valid_address2_name_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getAddress2().sendKeys("Testing");

	}
	@When(": User Enter the valid  City Name for BuyerAndSellerAccount4")
	public void user_enter_the_valid_city_name_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getCity().sendKeys("Syracuse");
	}
	@When(": User Enter DropDown  and Select State for BuyerAndSellerAccount4")
	public void user_enter_drop_down_and_select_state_for_buyer_and_seller_account4() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000); 
		both.getselectdropdown().click();
		 Thread.sleep(2000);  
			driver.findElement(By.xpath("//div[text()='NY-New York']")).click();
	}
	@When(": User Enter the valid locationZipCode for BuyerAndSellerAccount4")
	public void user_enter_the_valid_location_zip_code_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getlocationZipCode().sendKeys("13202");
	}
	/*@When(": User Enter the Promo Code or Referral Code for BuyerAndSellerAccount4")
	public void user_enter_the_promo_code_or_referral_code_for_buyer_and_seller_account4() {
		driver.findElement(By.xpath("//input[@name='promoCodeInput']")).sendKeys("automationqa");

	}
	@When(": User Click on the apply button for BuyerAndSellerAccount4")
	public void user_click_on_the_apply_button_for_buyer_and_seller_account4() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@type='app-green-button']")).click();
	}
	@When(": User Sumbit the popup alert5 for BuyerAndSellerAccount4")
	public void user_sumbit_the_popup_alert5_for_buyer_and_seller_account4() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();;
	}
	@When(": User acknowledged that this promo code for BuyerAndSellerAccount4")
	public void user_acknowledged_that_this_promo_code_for_buyer_and_seller_account4() {
		WebElement element1=driver.findElement(By.xpath("//span[@class='checkMark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
	}*/
	@When(": User Enter the SumbitButton for BuyerAndSellerAccount4")
	public void user_enter_the_sumbit_button_for_buyer_and_seller_account4() {
		WebElement element1=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1); 
	}
	@When(": User Enter the valid OTP in popup Screen for BuyerAndSellerAccount4")
	public void user_enter_the_valid_otp_in_popup_screen_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getOtp().sendKeys("223345");
	}
	@When(": User Enter the GreenSumbitButton for BuyerAndSellerAccount4")
	public void user_enter_the_green_sumbit_button_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getGreenButton().click();
	}
	@Then(": User verified EmaiId for BuyerAndSellerAccount4")
	public void user_verified_emai_id_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getVerifiedEmailid().click();
	}
	@When(": User Enter the Not Register for  the Broker for BuyerAndSellerAccount4")
	public void user_enter_the_not_register_for_the_broker_for_buyer_and_seller_account4() throws InterruptedException {
		 WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
			Thread.sleep(2000);
	}
	@When(": User Enter the register for this platform to BuyerPallets for BuyerAndSellerAccount4")
	public void user_enter_the_register_for_this_platform_to_buyer_pallets_for_buyer_and_seller_account4() throws InterruptedException {
		Thread.sleep(2000);
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getRegisterforTheBuyer().click();
		Thread.sleep(2000);
	}
	@When(": User Enter the register for this platform to SellerPallets for BuyerAndSellerAccount4")
	public void user_enter_the_register_for_this_platform_to_seller_pallets_for_buyer_and_seller_account4() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='true']//span[@class='radio-checkmark']")));
		//Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		// both.getRegisterforTheSeller().click();
	
		WebElement element1=driver.findElement(By.xpath("//label[@for='true']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		Thread.sleep(2000);
	
	
	
	}
	
	
	@When(": User Enter the company operate  Multiple location for BuyerAndSellerAccount4")
	public void user_enter_the_company_operate_multiple_location_for_buyer_and_seller_account4() throws InterruptedException {
		Thread.sleep(2000);
		   WebElement element2=driver.findElement(By.xpath("//label[normalize-space()='Multiple']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
	}
	@When(": User Enter the Payment options and click On the Hybrid payment for BuyerAndSellerAccount4")
	public void user_enter_the_payment_options_and_click_on_the_hybrid_payment_for_buyer_and_seller_account4() throws InterruptedException {
		WebElement element3=driver.findElement(By.xpath("//label[@for='HYBRID']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor3=(JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();",element3);
		Thread.sleep(2000);	
	}
	@When(": User Enter the Valid TaxId for BuyerAndSellerAccount for BuyerAndSellerAccount4")
	public void user_enter_the_valid_tax_id_for_buyer_and_seller_account_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getTaxId().sendKeys("232222222");
	}
	@When(": User Enter the Valid DNB\\/DUNS for BuyerAndSellerAccount for BuyerAndSellerAccount4")
	public void user_enter_the_valid_dnb_duns_for_buyer_and_seller_account_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getDNBDUNS().sendKeys("45-455-5555");
	}
	@When(": User Enter the BusinessURL for BuyerAndSellerAccount for BuyerAndSellerAccount4")
	public void user_enter_the_business_url_for_buyer_and_seller_account_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getURL().sendKeys("https://www.officeplace.com/");
	}
	@When(": User Enter the BusinessDescription for BuyerAndSellerAccount4")
	public void user_enter_the_business_description_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getBusinessDescription().sendKeys("Business Description");
	}
	@When(": User Enter the SellersRemittance Information for BuyerAndSellerAccount4")
	public void user_enter_the_sellers_remittance_information_for_buyer_and_seller_account4() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card for BuyerAndSellerAccount4")
	public void user_enter_the_name_on_the_card_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		   both.getNameOnTheCard().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number for BuyerAndSellerAccount4")
	public void user_enter_the_valid_card_number_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		both.getCardNumber().sendKeys("6011981111111113");
	}
	@When(": User Enter the valid Expiration Date for BuyerAndSellerAccount4")
	public void user_enter_the_valid_expiration_date_for_buyer_and_seller_account4() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getExpirationDate().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number for BuyerAndSellerAccount4")
	public void user_enter_the_valid_cvc_cvv_number_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		  
		   driver.switchTo().parentFrame();
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
			both.getCVCCVVNumber().sendKeys("123");
			driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate SellerRemittance Information for BuyerAndSellerAccount4")
	public void user_enter_the_validate_seller_remittance_information_for_buyer_and_seller_account4() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert for BuyerAndSellerAccount4")
	public void user_sumbit_the_popup_alert_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
	     both.getPopupAlert().click(); 
	}
	@When(": User Enter the BuyerPaymentInformation for BuyerAndSellerAccount4")
	public void user_enter_the_buyer_payment_information_for_buyer_and_seller_account4() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[@for='buyerDebitCard']//span[@class='radio-checkmark']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card1 for BuyerAndSellerAccount4")
	public void user_enter_the_name_on_the_card1_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getNameOnTheCard1().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number1 for BuyerAndSellerAccount4")
	public void user_enter_the_valid_card_number1_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
		both.getCardNumber1().sendKeys("4000056655665556");
	}
	@When(": User Enter the valid Expiration Date1 for BuyerAndSellerAccount4")
	public void user_enter_the_valid_expiration_date1_for_buyer_and_seller_account4() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));

		Thread.sleep(3000);
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getExpirationDate1().sendKeys("0426");
	}
	@When(": User Enter the valid CVC\\/CVV Number1 for BuyerAndSellerAccount4")
	public void user_enter_the_valid_cvc_cvv_number1_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		both.getCVCCVVNumber1().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation for BuyerAndSellerAccount4")
	public void user_enter_the_validate_buyers_payment_information_for_buyer_and_seller_account4() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert1 for BuyerAndSellerAccount4")
	public void user_sumbit_the_popup_alert1_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		both.getPopupAlert1().click();
	}
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard for BuyerAndSellerAccount4")
	public void user_enter_the_membership_payment_information_with_name_on_the_card_for_buyer_and_seller_account4() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000);
		both.getMembershipName().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number for MembershipPayment for BuyerAndSellerAccount4")
	public void user_enter_the_valid_card_number_for_membership_payment_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    both.getMembershipCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for MembershipPayment for BuyerAndSellerAccount4")
	public void user_enter_the_valid_expiration_date_for_membership_payment_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		both.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment for BuyerAndSellerAccount4")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[6]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		both.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate MembershipPaymentInformation for BuyerAndSellerAccount4")
	public void user_enter_the_validate_membership_payment_information_for_buyer_and_seller_account4() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Sumbit the popup alert2 for BuyerAndSellerAccount4")
	public void user_sumbit_the_popup_alert2_for_buyer_and_seller_account4() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(2000);
		both.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step for BuyerAndSellerAccount4")
	public void user_enter_the_next_step_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@When(": User Accept Subscription Fee for BuyerAndSellerAccount4")
	public void user_accept_subscription_fee_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Acknowledged and Agree for BuyerAndSellerAccount4")
	public void user_acknowledged_and_agree_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element9=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
		JavascriptExecutor executor9=(JavascriptExecutor)driver;
		executor9.executeScript("arguments[0].click();",element9);
	}
	@When(": User Enter the Sumbit Button1 for BuyerAndSellerAccount4")
	public void user_enter_the_sumbit_button1_for_buyer_and_seller_account4() {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@Then(": User Sucessfully Registered4")
	public void user_sucessfully_registered4() throws InterruptedException {
		Pageobjects.RegistrationBuyerAndSellerPage both=new Pageobjects.RegistrationBuyerAndSellerPage(driver);
		Thread.sleep(5000);
		both.getSucessfullyRegistered().click();
	
		Thread.sleep(2000);
		driver.close();
	
	
	}



}
