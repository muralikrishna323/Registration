
package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import PageObjects3.RegistrationBuyerAndSellerPage;
import Pageobjects.RegistrationBrokerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationBrokerStepDefination {

	WebDriver driver;
	

	public WebDriver initializeDriver() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mobile Programming\\Downloads\\registration updated\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
				
//		System.setProperty("webdriver.edge.driver","C:\\Automation\\All example Program files\\My_Complete_Bettaway_Module\\My-Registration-Complete-Codes\\Drivers\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		return driver;
		}
	
	@Given(": User navigates to the website myapp.pallettrader.com")
	public void user_navigates_to_the_website_myapp_pallettrader_com() throws Throwable {
		driver=initializeDriver() ;
//		driver.get("http://stage.pallettrader.com/#/");
		driver.get("http://bettawayui-env.eba-sti3ipyi.us-east-1.elasticbeanstalk.com/#/");		
		driver.findElement(By.xpath("//input[1]")).sendKeys("PalletWorld");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("PalletSaleTime@2022");
		driver.findElement(By.xpath("//button[normalize-space()='SUBMIT']")).click();
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
	r.getUsername().sendKeys("1209 Single location");   
	}
	
	@When(": User Enter the valid EmailId")
	public void user_enter_the_valid_email_id() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getEmail().sendKeys("1209T@mailinator.com");  
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
		r.getCompanyNamel().sendKeys("1209 Single Location Company");  
	}
	
	@When(": User Enter the valid Cell Phone Number")
	public void user_enter_the_valid_cell_phone_number() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getPhoneNumber().sendKeys("315-280-8677");	  
	}
	
	@When(": User Enter the valid Address1 Name")
	public void user_enter_the_valid_address1_name() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getAddress1().sendKeys("2827 Gandy");	
	}
	
	@When(": User Enter the valid Address2 Name")
	public void user_enter_the_valid_address2_name() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getAddress2().sendKeys("Testing");
	}   
	
	@When(": User Enter the valid  City Name")
	public void user_enter_the_valid_city_name() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getCity().sendKeys("Sunny");
	}
	
	@When(": User Enter DropDown  and Select State")
	public void user_enter_drop_down_and_select_state() throws InterruptedException {
		Thread.sleep(2000);
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getselectdropdown().click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//div[text()='FL-Florida']")).click();
	}
	
	@When(": User Enter the valid locationZipCode")
	public void user_enter_the_valid_location_zip_code() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getlocationZipCode().sendKeys("33160");
	}
	  
	@When(": User Enter the SumbitButton")
	public void user_enter_the_sumbit_button() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getSubmit().click();
	}
	
	@When(": User Enter the valid OTP in popup Screen")
	public void user_enter_the_valid_otp_in_popup_screen() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getOtp().sendKeys("232336"); 	 
	}

	@When(": User Enter the GreenSumbitButton")
	public void user_enter_the_green_sumbit_button() throws InterruptedException {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		Thread.sleep(2000);
		r.getGreenButton().click();     
	}

	@Then(": User verified EmaiId")
	public void user_verified_emai_id() {
		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
		r.getVerifiedEmailid().click();       
	}

////--------------- BROKER CODE ----------------
//	@When(": User Enter the Platform as a broker")
//	public void user_enter_the_platform_as_a_broker() throws InterruptedException {
//		//Pageobjects.Registrationpage r=new Pageobjects.Registrationpage(driver);     
//		WebElement element1=driver.findElement(By.xpath("//label[@for='active']//span[@class='radio-checkmark']"));
//		JavascriptExecutor executor1=(JavascriptExecutor)driver;
//		executor1.executeScript("arguments[0].click();",element1);
//		Thread.sleep(2000);
//		//r.getAsaBroker().click();
//	}
//	
//	@When(": User Enter the BusinessInformationWithTaxId")
//	public void user_enter_the_business_information_with_tax_id() throws InterruptedException {
//		WebElement element2=driver.findElement(By.xpath("//label[normalize-space()='TAX ID']"));
//		JavascriptExecutor executor2=(JavascriptExecutor)driver;
//		Thread.sleep(2000);
//		executor2.executeScript("arguments[0].click();",element2);
//		//Pageobjects.Registrationpage r=new Pageobjects.Registrationpage(driver);     
//	//Thread.sleep(2000);
//	//r.getBusinessInformation().click();
//	}

//----------------- NON BROKER CODE ------------------	
	@When(": User Enter the Not Register for  the Broker")
	public void user_enter_the_not_register_for_the_broker() throws InterruptedException {
		 WebElement element1=driver.findElement(By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
			Thread.sleep(2000);
	}
	
	@When(": User Enter the register for this platform to BuyerPallets")
	public void user_enter_the_register_for_this_platform_to_buyer_pallets() throws InterruptedException {
		 WebElement element1=driver.findElement(By.xpath("//label[@for='Yes']//span[@class='radio-checkmark']"));
//		 WebElement element1=driver.findElement(By.xpath("//label[@for='No']//span[@class='radio-checkmark']"));
		 JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
			Thread.sleep(2000);
//		Pageobjects.RegistrationBrokerPage both=new RegistrationBrokerPage(driver);
//		both.getRegisterforTheBuyer().click();
	}
	
	@When(": User Enter the register for this platform to SellerPallets")
	public void user_enter_the_register_for_this_platform_to_seller_pallets() throws InterruptedException {
		 WebElement element1=driver.findElement(By.xpath("//label[@for='true']//span[@class='radio-checkmark']"));
//		 WebElement element1=driver.findElement(By.xpath("//label[@for='false']//span[@class='radio-checkmark']"));
		 JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
			Thread.sleep(2000);
	}	

//---------------- SINGLE LOCATION USERS --------------------
	@When(": User Enter the company operate  multiple locations")
	public void user_enter_the_company_operate_multiple_locations() throws InterruptedException {
		Thread.sleep(2000);
//		   WebElement element2=driver.findElement(By.xpath("//label[normalize-space()='Multiple']"));
		   WebElement element2=driver.findElement(By.xpath("//label[normalize-space()='One']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
	}
	
//----------------MULTIPLE LOCATION USERS	
	@When(": User Enter the Payment options")
	public void user_enter_the_payment_options() throws InterruptedException {
//		WebElement element3=driver.findElement(By.xpath("//label[contains(text(),'Each location handles payment independently.')]"));
//		WebElement element3=driver.findElement(By.xpath("//label[contains(text(),'One centralized corporate account handles payments')]"));		
		WebElement element3=driver.findElement(By.xpath("//label[contains(text(),'Hybrid, some locations handle payments independently')]"));		
		JavascriptExecutor executor3=(JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();",element3);
		Thread.sleep(2000);	  
	}
//--------------- NON BROKER CODE ENDS --------------
	
	@When(": User Enter the BusinessInformationWithLICENSE")
	public void user_enter_the_business_information_with_license() {
		WebElement element = driver.findElement(By.xpath("//label[normalize-space()='LICENSE']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	@When(": User Enter the Valid Driver's License Number")
	public void user_enter_the_valid_driver_s_license_number() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("11111111111111111111");

	}
	@When(": User Click On the Drivers License State Drop down")
	public void user_click_on_the_drivers_license_state_drop_down() {
		
		driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']")).click();

	}
	@When(": User Select the Drivers License State")
	public void user_select_the_drivers_license_state() {
		
		driver.findElement(By.xpath("//div[text()='AL-Alabama']")).click();
	
		@When(": User Enter the valid First Name")
	public void user_enter_the_valid_first_name() {
	   
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hello");

		}
	
		@When(": User Enter the valid Last Name")
	public void user_enter_the_valid_last_name() {
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tester");

	}
	
		
		@When(": User Enter the valid Date of Birth")
	public void user_enter_the_valid_date_of_birth() {
	  

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
	
		
		
		
		@When(": User Upload the valid Driver's License")
	public void user_upload_the_valid_driver_s_license() {
			driver.findElement(By.xpath("//input[@id='drivingLicenseDoc']")).sendKeys("C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-pallet-Trader-Seller-PostMyPalletInventory-ChromeDriver\\Resources\\License.jpg");

	}
	@When(": User Enter the BusinessURL")
	public void user_enter_the_business_url() {
		driver.findElement(By.xpath("//input[@placeholder='https//:']")).sendKeys("https://www.officeplace.com/");

	}
	@When(": User Enter the BusinessDescription")
	public void user_enter_the_business_description() {
		driver.findElement(By.xpath("//textarea[@name='businessDesc']")).sendKeys("Business Description");

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
	
//------------- BOTH BUYER SELLER CODE------------------	
//------------ SELLER PAYMENT DETAILS -------------------
	@When(": User Enter the SellersRemittance InformationWithBankAccount")
	public void user_enter_the_sellers_remittance_information_with_bank_account() throws InterruptedException {
		WebElement element3=driver.findElement(By.xpath("//label[normalize-space()='Bank Account']"));
		JavascriptExecutor executor3=(JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();",element3);
		Thread.sleep(2000);
		//Pageobjects.Registrationpage r=new Pageobjects.Registrationpage(driver);    
	//r.getSellerRemittance().click();
	}
//----------BANK ACCOUNT ------------------------	
	@When(": User Enter AccountHolderName")
	public void user_enter_account_holder_name() throws InterruptedException {
	RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
	Thread.sleep(2000);
	r.getAccountHolderName().sendKeys("Main User");
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
//------------- BUYER PAYMENT CODE--------------------------	
	@When(": User Enter the BuyerPaymentInformation")
	public void user_enter_the_buyer_payment_information() throws InterruptedException {
//		WebElement element5=driver.findElement(By.xpath("//label[@for='buyerDebitCard']//span[@class='radio-checkmark']"));
//		JavascriptExecutor executor5=(JavascriptExecutor)driver;
//		executor5.executeScript("arguments[0].click();",element5);
//		Thread.sleep(2000);
		WebElement element9=driver.findElement(By.xpath("//label[normalize-space()='Credit Card']"));
		JavascriptExecutor executor9=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor9.executeScript("arguments[0].click();",element9);	
	}

	@When(": User Enter the Name on the Card")
	public void user_enter_the_name_on_the_card() {
	RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
	r.getNameOnTheCard().sendKeys("Main User");
	}

	@When(": User Enter the valid Card Number")
	public void user_enter_the_valid_card_number() throws InterruptedException {
	RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
	driver.switchTo().frame(0);
	r.getCardNumber().sendKeys("3714 4963 5398 431");
	}	
	
	@When(": User Enter the valid Expiration Date")
	public void user_enter_the_valid_expiration_date() throws InterruptedException {
	RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
	driver.switchTo().parentFrame();
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
	Thread.sleep(3000);
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

	@When(": User Sumbit the popup alert")
	public void user_sumbit_the_popup_alert() throws InterruptedException {
	Thread.sleep(2000);	
	RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
    r.getPopupAlert().click();
	}
	
	@When(": User Enter the validate BuyersPaymentInformation")
	public void user_enter_the_validate_buyers_payment_information() throws InterruptedException {
	WebElement element7=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
	JavascriptExecutor executor7=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	executor7.executeScript("arguments[0].click();",element7);
	}		

	@When(": User Enter the MembershipPaymentInformation with NameOnTheCard")
	public void user_enter_the_membership_payment_information_with_name_on_the_card() throws InterruptedException {
	RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
	Thread.sleep(2000);
	r.getMembershipName().sendKeys("Main User");
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
		//Pageobjects.Registrationpage r=new Pageobjects.Registrationpage(driver);   
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

	
// ------------ ONLY BUYER ACCOUNT CODE ------------	
//	
//		@When(": User Enter the BuyerPaymentInformation")
//			public void user_enter_the_buyer_payment_information() throws InterruptedException {
////			WebElement element5=driver.findElement(By.xpath("//label[@for='buyerDebitCard']//span[@class='radio-checkmark']"));
////			JavascriptExecutor executor5=(JavascriptExecutor)driver;
////			executor5.executeScript("arguments[0].click();",element5);
////			Thread.sleep(2000);
//			WebElement element9=driver.findElement(By.xpath("//label[normalize-space()='Credit Card']"));
//			JavascriptExecutor executor9=(JavascriptExecutor)driver;
//			Thread.sleep(2000);
//			executor9.executeScript("arguments[0].click();",element9);	
//		}
//
//		@When(": User Enter the Name on the Card")
//		public void user_enter_the_name_on_the_card() {
//			RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
//			r.getNameOnTheCard().sendKeys("Main User");
//		}
//
//		@When(": User Enter the valid Card Number")
//		public void user_enter_the_valid_card_number() throws InterruptedException {
//			RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//			driver.switchTo().frame(0);
//			r.getCardNumber().sendKeys("3714 4963 5398 431");
//		}		
//		
//		@When(": User Enter the valid Expiration Date")
//		public void user_enter_the_valid_expiration_date() throws InterruptedException {
//			RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
//			driver.switchTo().parentFrame();
//			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
//			Thread.sleep(3000);
//			r.getExpirationDate().sendKeys("0424");
//		}
//		
//		@When(": User Enter the valid CVC\\/CVV Number")
//		public void user_enter_the_valid_cvc_cvv_number() {
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[4]/div/div[2]/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
//		r.getCVCCVVNumber().sendKeys("1234");
//		driver.switchTo().parentFrame();
//		}	
//					
//		@When(": User Enter the validate BuyersPaymentInformation")
//		public void user_enter_the_validate_buyers_payment_information() throws InterruptedException {
//		WebElement element7=driver.findElement(By.xpath("//button[@class='app-green-button']"));
//		JavascriptExecutor executor7=(JavascriptExecutor)driver;
//		Thread.sleep(2000);
//		executor7.executeScript("arguments[0].click();",element7);
//		}
//		
//		@When(": User Sumbit the popup alert")
//		public void user_sumbit_the_popup_alert() throws InterruptedException {
//		Thread.sleep(2000);	
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//	    r.getPopupAlert().click();
//		}
//	
//		@When(": User Enter the MembershipPaymentInformation with NameOnTheCard")
//		public void user_enter_the_membership_payment_information_with_name_on_the_card() throws InterruptedException {
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//		Thread.sleep(2000);
//		r.getMembershipName1().sendKeys("Main User");
//		}
//		
//		@When(": User Enter the valid Card Number for MembershipPayment")
//		public void user_enter_the_valid_card_number_for_membership_payment() {
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
//	    r.getMembershipCardNumber().sendKeys("5200828282828210");
//		}
//		
//		@When(": User Enter the valid Expiration Date for MembershipPayment")
//		public void user_enter_the_valid_expiration_date_for_membership_payment() {
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
//		r.getMembershipExpirationDate().sendKeys("0525");
//		}
//		
//		@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment")
//		public void user_enter_the_valid_cvc_cvv_number_for_membership_payment() {
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
//		r.getMembershipCVCCVVNumber().sendKeys("183");
//		driver.switchTo().parentFrame();
//		}
//		
//		@When(": User Enter the validate MembershipPaymentInformation")
//		public void user_enter_the_validate_membership_payment_information() throws InterruptedException {
//			//Pageobjects.Registrationpage r=new Pageobjects.Registrationpage(driver);   
//			WebElement element8=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
//			JavascriptExecutor executor8=(JavascriptExecutor)driver;
//			Thread.sleep(2000);
//			executor8.executeScript("arguments[0].click();",element8);
//			}
//		@When(": User Sumbit the popup alert2")
//		public void user_sumbit_the_popup_alert2() throws InterruptedException {
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//		Thread.sleep(2000);
//		r.getPopupAlert2().click();
//		}
////------------------- ONLY BUYER PAYMENT CODE -------------------	

	
////----------------ONLY SELLER PAYMENT CODES------------------
//	//------------ SELLER PAYMENT DETAILS -------------------
//		@When(": User Enter the SellersRemittance InformationWithBankAccount")
//		public void user_enter_the_sellers_remittance_information_with_bank_account() throws InterruptedException {
//			WebElement element3=driver.findElement(By.xpath("//label[normalize-space()='Bank Account']"));
//			JavascriptExecutor executor3=(JavascriptExecutor)driver;
//			executor3.executeScript("arguments[0].click();",element3);
//			Thread.sleep(2000);
//			//Pageobjects.Registrationpage r=new Pageobjects.Registrationpage(driver);    
//		//r.getSellerRemittance().click();
//		}
//
//	//----------BANK ACCOUNT ------------------------	
//		@When(": User Enter AccountHolderName")
//		public void user_enter_account_holder_name() throws InterruptedException {
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
//		Thread.sleep(2000);
//		r.getAccountHolderName().sendKeys("Main User");
//		}
//		
//		@When(": User Enter the valid BankAccountNumber")
//		public void user_enter_the_valid_bank_account_number() throws InterruptedException {
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver); 
//		Thread.sleep(2000);
//		r.getBankAccountNumber().sendKeys("000999999991");
//		
//		}
//		@When(": User Enter the Valid BankRoutingNumber")
//		public void user_enter_the_valid_bank_routing_number() throws InterruptedException {
//			Thread.sleep(2000);
//			RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//		r.getBankRoutingNumber().sendKeys("110000000");
//		}
//		
//		@When(": User Enter the validate the Information")
//		public void user_enter_the_validate_the_information() throws InterruptedException {
//			Thread.sleep(2000);
//			WebElement element4=driver.findElement(By.xpath("//button[@class='button app-green-button']"));
//			JavascriptExecutor executor4=(JavascriptExecutor)driver;
//			executor4.executeScript("arguments[0].click();",element4);
//			RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
//		    r.getValidate().click();
//		}
//	//------------BANK ACCOUNT CODE ENDS------------------------
//
//		@When(": User Enter the MembershipPaymentInformation with NameOnTheCard")
//		public void user_enter_the_membership_payment_information_with_name_on_the_card() throws InterruptedException {
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//		Thread.sleep(2000);
//		r.getMembershipName2().sendKeys("Main User");
//		}
//		
//		@When(": User Enter the valid Card Number for MembershipPayment")
//		public void user_enter_the_valid_card_number_for_membership_payment() {
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
//	    r.getMembershipCardNumber().sendKeys("5200828282828210");
//		}
//		
//		@When(": User Enter the valid Expiration Date for MembershipPayment")
//		public void user_enter_the_valid_expiration_date_for_membership_payment() {
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
//		r.getMembershipExpirationDate().sendKeys("0525");
//		}
//		
//		@When(": User Enter the valid CVC\\/CVV Number for MembershipPayment")
//		public void user_enter_the_valid_cvc_cvv_number_for_membership_payment() {
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/form/div[5]/div/div/div/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
//		r.getMembershipCVCCVVNumber().sendKeys("183");
//		driver.switchTo().parentFrame();
//		}
//		
//		@When(": User Enter the validate MembershipPaymentInformation")
//		public void user_enter_the_validate_membership_payment_information() throws InterruptedException {
//			//Pageobjects.Registrationpage r=new Pageobjects.Registrationpage(driver);   
//			WebElement element8=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]"));
//			JavascriptExecutor executor8=(JavascriptExecutor)driver;
//			Thread.sleep(2000);
//			executor8.executeScript("arguments[0].click();",element8);
//			}
//		@When(": User Sumbit the popup alert2")
//		public void user_sumbit_the_popup_alert2() throws InterruptedException {
//		RegistrationBrokerPage r=new RegistrationBrokerPage(driver);   
//		Thread.sleep(2000);
//		r.getPopupAlert2().click();
//		}

		
	
	@When(": User Enter the Next Step")
	public void user_enter_the_next_step() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element10=driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	JavascriptExecutor executor10=(JavascriptExecutor)driver;
	executor10.executeScript("arguments[0].click();",element10);
	
	}
	@When(": User Accept Subscription Fee")
	public void user_accept_subscription_fee() throws InterruptedException {
	//Pageobjects.Registrationpage r=new Pageobjects.Registrationpage(driver);     
		WebElement element11=driver.findElement(By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]"));
		JavascriptExecutor executor11=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		executor11.executeScript("arguments[0].click();",element11);
		Thread.sleep(2000);
	//r.getSubscriptionFee().click();
	}
	
	@When(": User Acknowledged and Agree")
	public void user_acknowledged_and_agree() throws InterruptedException {
	RegistrationBrokerPage r=new RegistrationBrokerPage(driver);  
	Thread.sleep(2000);
	r.getAcknowledgedandAgree().click();
	}
	
	@When(": User Enter the Sumbit Button1")
	public void user_enter_the_sumbit_button1() throws InterruptedException {
	RegistrationBrokerPage r=new RegistrationBrokerPage(driver);     
	Thread.sleep(2000);
	r.getSumbitButton1().click();
	}
	
	@Then(": User Sucessfully Registered With Valid Credentials")
	public void user_sucessfully_registered_with_valid_credentials() throws InterruptedException {
	RegistrationBrokerPage r=new RegistrationBrokerPage(driver);    
	Thread.sleep(13000);
	r.getSucessfullyRegistered().click();
	}


	



}

