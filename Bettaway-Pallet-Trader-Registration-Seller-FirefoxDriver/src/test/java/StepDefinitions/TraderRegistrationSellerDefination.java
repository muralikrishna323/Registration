package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects2.RegistrationSellerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TraderRegistrationSellerDefination {

	WebDriver driver;
	public WebDriver initializeDriver() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-Pallet-Trader-Registration-Seller-FirefoxDriver\\Drivers\\geckodriver.exe");
	driver=new FirefoxDriver();

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
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
	s.getRegistration().click();
	}
	
	@When(": User Enter the Registration form")
	public void user_enter_the_registration_form() {
		WebElement element=driver.findElement(By.xpath("(//a[normalize-space()='Click here to register'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
	}
	@When(": User Enter the valid UserName")
	public void user_enter_the_valid_user_name() {
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
     s.getUsername().sendKeys("AutomationTester");
	}
	
	@When(": User Enter the valid EmailId")
	public void user_enter_the_valid_email_id() {
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
    s.getEmail().sendKeys("2025m@mailinator.com");
	}
	@When(": User Enter the valid PassWord")
	public void user_enter_the_valid_pass_word() {
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
    s.getpassword().sendKeys("Automation@123");
	}
	@When(": User Enter the valid Conform Password")
	public void user_enter_the_valid_conform_password() {
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
    s.getConfirmPassword().sendKeys("Automation@123");
	}
	@When(": User Enter the valid CompanyName")
	public void user_enter_the_valid_company_name() {
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
    s.getCompanyNamel().sendKeys("PalletTrader");
	}
	@When(": User Enter the valid Cell Phone Number")
	public void user_enter_the_valid_cell_phone_number() {
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
    s.getPhoneNumber().sendKeys("315-280-8677");
	}
	@When(": User Enter the valid Address1 Name")
	public void user_enter_the_valid_address1_name() {
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
    s.getAddress1().sendKeys("2827 Gandy Street");
	}
	
	@When(": User Enter the valid Address2 Name")
	public void user_enter_the_valid_address2_name() {
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
    s.getAddress2().sendKeys("Testing");
	}
	
	@When(": User Enter the valid  City Name")
	public void user_enter_the_valid_city_name() {
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
    s.getCity().sendKeys("Syracuse");
	}
	
	@When(": User Enter DropDown  and Select State")
	public void user_enter_drop_down_and_select_state() throws InterruptedException {
	Thread.sleep(2000); 
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
	s.getselectdropdown().click();
    Thread.sleep(2000);  
	driver.findElement(By.xpath("//div[text()='WA-Washington']")).click();
	}
	
	@When(": User Enter the valid locationZipCode")
	public void user_enter_the_valid_location_zip_code() throws InterruptedException {
	Thread.sleep(2000);
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
      s.getlocationZipCode().sendKeys("13202");
	}
	
	@When(": User Enter the SumbitButton")
	public void user_enter_the_sumbit_button() {
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
    s.getSubmit().click();
	}
	@When(": User Enter the valid OTP in popup Screen")
	public void user_enter_the_valid_otp_in_popup_screen() {
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
    s.getOtp().sendKeys("223345");
	}
	
	@When(": User Enter the GreenSumbitButton")
	public void user_enter_the_green_sumbit_button() {
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
   s.getGreenButton().click();
	}
	@Then(": User verified EmaiId")
	public void user_verified_emai_id() {
	PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
    s.getVerifiedEmailid().click();
	}
	@When(": User Enter the Not Register for  the Broker")
	public void user_enter_the_not_register_for_the_broker() throws InterruptedException {
		 WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
			Thread.sleep(2000);
	}
	@When(": User Enter the Not Register for  the Buyer")
	public void user_enter_the_not_register_for_the_buyer() throws InterruptedException {
		Thread.sleep(2000); 
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
    s.getNotRegisterfortheBuyer().click();
	}
	@When(": User Enter the register for this platform to seller pallets")
	public void user_enter_the_register_for_this_platform_to_seller_pallets() throws InterruptedException {
		Thread.sleep(2000); 
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
   s.getRegisterfortheSeller().click();
	}
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
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		 s.getTaxId().sendKeys("232222222");
	}
	@When(": User Enter the Valid DNB\\/DUNS")
	public void user_enter_the_valid_dnb_duns() {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		  s.getDNBDUNS().sendKeys("45-455-5555");
	}
	@When(": User Enter the BusinessURL")
	public void user_enter_the_business_url() {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		 s.getURL().sendKeys("https://www.officeplace.com/");
	}
	@When(": User Enter the BusinessDescription")
	public void user_enter_the_business_description() {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		s.getBusinessDescription().sendKeys("Business Description");
	}
	@When(": User Enter the BuyerPaymentInformation")
	public void user_enter_the_buyer_payment_information() throws InterruptedException {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		WebElement element4=driver.findElement(By.xpath("//label[normalize-space()='Debit Card']"));
		JavascriptExecutor executor4=(JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();",element4);
		Thread.sleep(2000);
	}
	@When(": User Enter the Name on the Card")
	public void user_enter_the_name_on_the_card() throws InterruptedException {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		s.getNameOnTheCard().sendKeys("AutomationQa");
	}
	@When(": User Enter the valid Card Number")
	public void user_enter_the_valid_card_number() {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));

		s.getCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date")
	public void user_enter_the_valid_expiration_date() throws InterruptedException {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		s.getExpirationDate().sendKeys("0424");
	}
	@When(": User Enter the valid CVC\\/CVV Number")
	public void user_enter_the_valid_cvc_cvv_number() {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		s.getCVCCVVNumber().sendKeys("123");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate BuyersPaymentInformation")
	public void user_enter_the_validate_buyers_payment_information() throws InterruptedException {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		WebElement element5=driver.findElement(By.xpath("//button[@class='app-green-button']"));
		JavascriptExecutor executor5=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor5.executeScript("arguments[0].click();",element5);
	}
	@When(": User Sumbit the popup alert")
	public void user_sumbit_the_popup_alert() {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		 s.getPopupAlert().click();
	}
	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard")
	public void user_enter_the_membership_payment_information_with_name_on_the_card() {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		s.getMembershipName().sendKeys("AutomationTester");
	}
	@When(": User Enter the valid Card Number for MembershipPayment")
	public void user_enter_the_valid_card_number_for_membership_payment() throws InterruptedException {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
	    s.getMembershipCardNumber().sendKeys("5200828282828210");
	}
	@When(": User Enter the valid Expiration Date for MembershipPayment")
	public void user_enter_the_valid_expiration_date_for_membership_payment() {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		s.getMembershipExpirationDate().sendKeys("0525");
	}
	@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment")
	public void user_enter_the_valid_cvc_cvv_number_for_membership_payment() {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		s.getMembershipCVCCVVNumber().sendKeys("183");
		driver.switchTo().parentFrame();
	}
	@When(": User Enter the validate MembershipPaymentInformation")
	public void user_enter_the_validate_membership_payment_information() throws InterruptedException {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		WebElement element6=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
		JavascriptExecutor executor6=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor6.executeScript("arguments[0].click();",element6);
	}
	@When(": User Sumbit the popup alert2")
	public void user_sumbit_the_popup_alert2() throws InterruptedException {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		Thread.sleep(2000);
		s.getPopupAlert2().click();
	}
	@When(": User Enter the Next Step")
	public void user_enter_the_next_step() {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		WebElement element7=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		JavascriptExecutor executor7=(JavascriptExecutor)driver;
		executor7.executeScript("arguments[0].click();",element7);
	}
	@When(": User Accept Subscription Fee")
	public void user_accept_subscription_fee() {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		WebElement element8=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor8=(JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();",element8);
	}
	@When(": User Acknowledged and Agree")
	public void user_acknowledged_and_agree() throws InterruptedException {
		Thread.sleep(2000);
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		WebElement element9=driver.findElement(By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']"));
		JavascriptExecutor executor9=(JavascriptExecutor)driver;
		executor9.executeScript("arguments[0].click();",element9);
	}
	@When(": User Enter the Sumbit Button1")
	public void user_enter_the_sumbit_button1() throws InterruptedException {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		Thread.sleep(2000);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor executor10=(JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();",element10);
	}
	@Then(": User Sucessfully Registered With Valid Credentials")
	public void user_sucessfully_registered_with_valid_credentials() throws InterruptedException {
		PageObjects2.RegistrationSellerPage s=new RegistrationSellerPage(driver);
		Thread.sleep(10000);
		s.getSucessfullyRegistered().click();
	}




}