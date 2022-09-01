package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageAccountPage;

public class ManageAccountStepDefination {

WebDriver driver;
	

	public WebDriver initializeDriver() {

		System.setProperty("webdriver.edge.driver","C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-Pallet-Trader-ManageAccount-Broker-microsoftEdge3\\drivers\\msedgedriver.exe");

		driver=new EdgeDriver();

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
	@When(": User Enter the signin page")
	public void user_enter_the_signin_page() throws InterruptedException {
		Thread.sleep(2000);
		//pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
		WebElement element=driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
		
		//M.getsignin().click();
	}
	@When(": User Enter the Valid Email ID")
	public void user_enter_the_valid_email_id() throws InterruptedException {
		Thread.sleep(2000);
		pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
	M.getEmailId().sendKeys("1901s@mailinator.com");
	}
	@When(": User Enter the valid Password")
	public void user_enter_the_valid_password() {
		pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
		M.getPassword().sendKeys("Automation@123");
	}
	@When(": User Enter the RememberMe Check Button")
	public void user_enter_the_remember_me_check_button() throws InterruptedException {
		Thread.sleep(2000);
		pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
		M.getRememberMe().click();
	}
	@Then(": User Sucessfully Enter The DashBoard")
	public void user_sucessfully_enter_the_dash_board() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
	}
		@When(": User Enter the Name")
		public void user_enter_the_name() throws InterruptedException {
			Thread.sleep(2000);
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
          M.getName().sendKeys("AutomationQa");
		}
		
		@When(": User Enter the Acknowledged and agree")
		public void user_enter_the_acknowledged_and_agree() throws InterruptedException {
			Thread.sleep(2000);
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);

		
		M.getCheckMark().click();
		}
		@When(": User Send Terms and conditions")
		public void user_send_terms_and_conditions() throws InterruptedException {
			
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
			Thread.sleep(2000);
			M.getSend().click();

		}
		@When(": User  Click on OK button inside alert pop-up window5")
		public void user_click_on_ok_button_inside_alert_pop_up_window5() throws InterruptedException {
			Thread.sleep(2000);
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
			M.getpopupwindow5().click();
	}
	@When(": User Click on  the Hello DropDown on the Header")
	public void user_click_on_the_hello_drop_down_on_the_header() throws InterruptedException {
		Thread.sleep(2000);
		pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
		M.getHelloDropDown().click();
	}
	@When(": User Click on  the Manage Account")
	public void user_click_on_the_manage_account() throws InterruptedException {
		Thread.sleep(2000);
		pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
		M.getManageAccount().click();
	}
	@Then(": User Enter The Account Details and Click on the Edit profile picture")
	public void user_enter_the_account_details_and_click_on_the_edit_profile_picture() throws InterruptedException {
		pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
    driver.findElement(By.xpath("//input[@id='getFile']")).sendKeys("C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-Pallet-Trader-ManageAccount-Broker-ChromeDriver2\\Resourses\\Broker.jpeg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	
		@When(": User Adding the Sellers Remittance Information")
		public void user_adding_the_sellers_remittance_information() throws InterruptedException {
			//Thread.sleep(5000);
			WebElement element1=driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
			
		}
		@When(": User Enter the DebitCard")
		public void user_enter_the_debit_card() {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
            M.getDebitCard().click();
			
		}
			
		@When(": User Enter the Name on the Card")
		public void user_enter_the_name_on_the_card() {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
         M.getNameontheCard().sendKeys("AutomationQa");
			
		}
		@When(": User Enter the Card Number")
		public void user_enter_the_card_number() {
			
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);

			driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div[2]/form/div[3]/div/div/div[1]/form/label[2]/div/div/iframe")));
		M.getCardNumber().sendKeys("5200828282828210");
		}
		
		@When(": User Enter the Expiration Date")
		public void user_enter_the_expiration_date() {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);

			driver.switchTo().parentFrame();
			driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div[2]/form/div[3]/div/div/div[1]/form/label[3]/div/div/iframe")));
		    M.getExpirationDate().sendKeys("0427");
		}
		
		
		
		@When(": User Enter the CVC\\/CVV Number")
		public void user_enter_the_cvc_cvv_number() {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
   		
		
			driver.switchTo().parentFrame();
			driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div[2]/form/div[3]/div/div/div[1]/form/label[4]/div/div/iframe")));
		M.getCVCCVVNumber().sendKeys("324");
		driver.switchTo().parentFrame();
		}
		
		@When(": User Enter the  Submit button")
		public void user_enter_the_submit_button() throws InterruptedException {
		
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
			Thread.sleep(2000);
			M.getSubmitbutton().click();
		}
		@When(": User  Click on OK button inside alert pop-up window")
		public void user_click_on_ok_button_inside_alert_pop_up_window() throws InterruptedException {
			Thread.sleep(2000);
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);

		M.getpopupwindow().click();
	
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,350)","");
		
		}
		
		@When(": User Enter the Buyer Payment Information")
          public void user_enter_the_buyer_payment_information() {     
		//driver.findElement(By.xpath("//span[normalize-space()='Buyer Payment Information']")).click();  
         WebElement element1=driver.findElement(By.xpath("//span[normalize-space()='Buyer Payment Information']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
}
		@When(": User Enter the  Edit Card Details")
		public void user_enter_the_edit_card_details() {
			//pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
       // M.getEditCardDetails().click();
        WebElement element1=driver.findElement(By.xpath("//span[normalize-space()='Edit']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1);
		
		
		
		}
		@When(": User Enter the  Edit Expire Month")
		public void user_enter_the_edit_expire_month() throws InterruptedException {
		  Thread.sleep(2000);
		WebElement el = driver.findElement(By.xpath("//input[@placeholder='Enter expire month']"));
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].value=\"\"", el);
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
           M.getExpireMonth().sendKeys("1");
		}
		@When(": User Enter the  Edit Expire Year")
		public void user_enter_the_edit_expire_year() throws InterruptedException {
			 Thread.sleep(2000);
				//driver.findElement(By.xpath("//p[text()='Expire Year']/..//input")).clear();
			
			WebElement el1 = driver.findElement(By.xpath("//p[text()='Expire Year']/..//input"));
				JavascriptExecutor executor=(JavascriptExecutor)driver;
					executor.executeScript("arguments[0].value=\"\"", el1);
					pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
					//Thread.sleep(10000);
					M.getExpireYear().sendKeys("2024");
		}
		@When(": User Enter the  User Enter the  Submit button1")
		public void user_enter_the_user_enter_the_submit_button1() throws InterruptedException {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
			Thread.sleep(2000);
			//M.getSubmitbutton1().click();
			WebElement element=driver.findElement(By.cssSelector("form[class='form'] button[type='submit']"));
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",element);
			
		
		}
		
		@When(": User Enter the  User  Click on OK button inside alert pop-up window1")
		public void user_enter_the_user_click_on_ok_button_inside_alert_pop_up_window1() throws InterruptedException {
			Thread.sleep(2000);
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);    
		M.getpopupwindow1().click();
		//driver.findElement(By.xpath("//img[@alt='close-icon']")).click();
		}
		
		@When(": User Adding the Buyers Payment Information")
		public void user_adding_the_buyers_payment_information() throws InterruptedException {
			Thread.sleep(2000);
			WebElement element1=driver.findElement(By.xpath("//button[normalize-space()='Add']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
		}
		
		
		@When(": User Enter the Name on the Card1")
		public void user_enter_the_name_on_the_card1() throws InterruptedException {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
			 Thread.sleep(2000);
			M.getNameontheCard1().sendKeys("Tester");
		}
		
		@When(": User Enter the Card Number1")
		public void user_enter_the_card_number1() throws InterruptedException {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
			 Thread.sleep(2000);
			driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe"))); 
		  
			M.getCardNumber1().sendKeys("3566002020360505 ");
		}
		
		@When(": User Enter the Expiration Date1")
		public void user_enter_the_expiration_date1() {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);

			driver.switchTo().parentFrame();
			driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe"))); 
		M.getExpirationDate1().sendKeys("0428");
		
		}
		@When(": User Enter the CVC\\/CVV Number1")
		public void user_enter_the_cvc_cvv_number1() {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);

			driver.switchTo().parentFrame();
			driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));
		M.getCVCCVVNumber1().sendKeys("143");
		driver.switchTo().parentFrame();

		}
		@When(": User Enter the  Submit button2")
		public void user_enter_the_submit_button2() throws InterruptedException {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
            Thread.sleep(2000);
            WebElement element1=driver.findElement(By.xpath("//button[@class='app-green-button']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
            
            
            
            //M.getSubmitbutton2().click();
		}
		@When(": User  Click on OK button inside alert pop-up window2")
		public void user_click_on_ok_button_inside_alert_pop_up_window2() throws InterruptedException {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
         M.getpopupwindow2().click();
		Thread.sleep(2000);
        // driver.findElement(By.xpath("//img[@alt='close-icon']")).click();
		}
		@When(": User Enter the Buyer MemberShip Subscription Information")
		public void user_enter_the_buyer_member_ship_subscription_information() throws InterruptedException {
			Thread.sleep(2000);
			WebElement element1=driver.findElement(By.xpath("//span[normalize-space()='Membership Subscription Information']"));
				JavascriptExecutor executor1=(JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click();",element1);
		}
		@When(": User Enter the  Edit Card Details1")
		public void user_enter_the_edit_card_details1() {
			WebElement element1=driver.findElement(By.xpath("//span[@class='edit-btn']"));
			JavascriptExecutor executor1=(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",element1);
		}
		@When(": User Enter the  Edit Expire Month1")
		public void user_enter_the_edit_expire_month1() throws InterruptedException {
			Thread.sleep(2000);
			WebElement el = driver.findElement(By.xpath("//p[text()='Expire Month']/..//input"));
				JavascriptExecutor executor=(JavascriptExecutor)driver;
				executor.executeScript("arguments[0].value=\"\"", el);
				pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
	           M.getExpireMonth().sendKeys("9");
		}
		@When(": User Enter the  Edit Expire Year1")
		public void user_enter_the_edit_expire_year1() throws InterruptedException {
			Thread.sleep(2000);
			WebElement el = driver.findElement(By.xpath("//p[text()='Expire Year']/..//input"));
				JavascriptExecutor executor=(JavascriptExecutor)driver;
				executor.executeScript("arguments[0].value=\"\"", el);
				pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
				//Thread.sleep(10000);
				M.getExpireMonth().sendKeys("2027");
		}
		@When(": User Enter the  Submit button3")
		public void user_enter_the_submit_button3() throws InterruptedException {
			Thread.sleep(2000);
			//M.getSubmitbutton1().click();
			WebElement element=driver.findElement(By.xpath("//form[@class='form']//button[@type='submit'][normalize-space()='Submit']"));
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",element);  
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		}
	//	@When(": User  Click on OK button inside alert pop-up window3")
		//public void user_click_on_ok_button_inside_alert_pop_up_window3() throws InterruptedException {
			//Thread.sleep(2000);
			//pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
        //  M.getpopupwindow3().click();
          //driver.findElement(By.xpath("//img[@alt='close-icon']")).click();
		//}
		@When(": User Adding the MemberShip Subscription Information")
		public void user_adding_the_member_ship_subscription_information() throws InterruptedException {
			Thread.sleep(2000);
			WebElement element2=driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);  
		//driver.findElement(By.xpath("//div[@class='sc-cYfsmL ftYmbuttongO']/.//button")).click();
		
		}

		@When(": User Enter the Name on the Card2")
		public void user_enter_the_name_on_the_card2() throws InterruptedException {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
          Thread.sleep(2000);
			M.getNameontheCard2().sendKeys("QaTester");
		}
		
		
		@When(": User Enter the Card Number2")
		public void user_enter_the_card_number2() throws InterruptedException {
			 Thread.sleep(2000);
			for(int i=0;i<=2;i++) {
				try {
					   driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe")));
			       break;
					}
					catch(Exception e) {
					System.out.println(e.getMessage());
					}
					}
					
			
		
		
			//Thread.sleep(10000);
		   //html/body/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe 
		   
		   
		   //Thread.sleep(2000);
		//html/body/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe
		
		
		//html/body/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/label[2]/div/div/iframe
			 pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
			M.getCardNumber2().sendKeys("6011981111111113");
      
		}
        
        
        
        @When(": User Enter the Expiration Date2")
		public void user_enter_the_expiration_date2() {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
            driver.switchTo().parentFrame();
			driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/label[3]/div/div/iframe")));
		    M.getExpirationDate2().sendKeys("0427");
		}
		
		@When(": User Enter the CVC\\/CVV Number2")
		public void user_enter_the_cvc_cvv_number2() {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
            driver.switchTo().parentFrame();
			driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/form/label[4]/div/div/iframe")));   
			M.getCVCCVVNumber2().sendKeys("149");
			driver.switchTo().parentFrame();
		}
		@When(": User Enter the  Submit button4")
		public void user_enter_the_submit_button4() {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
           M.getSubmitbutton4().click();
		}
		@When(": User  Click on OK button inside alert pop-up window9")
		public void user_click_on_ok_button_inside_alert_pop_up_window9() throws InterruptedException {
			Thread.sleep(2000);
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
          M.getpopupwindow9().click();
          Thread.sleep(2000);
         // driver.findElement(By.xpath("//img[@alt='close-icon']")).click();
        //img[@alt='close-icon']
		}
		
		
		
		@When(": User Edit the Marketplace Search Preferences")
		public void user_edit_the_marketplace_search_preferences() throws InterruptedException {
			Thread.sleep(2000);
			WebElement element2=driver.findElement(By.xpath("//p[normalize-space()='Edit']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);   
		}
		@When(": Buyers Equipment Requirement for Deliveries")
		public void buyers_equipment_requirement_for_deliveries() throws InterruptedException {
			Thread.sleep(2000);
			WebElement element2=driver.findElement(By.xpath("//label[normalize-space()='Straight Trailer']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
		   
		}
		@When(": Buyers Unloading Requirements for Deliveries")
		public void buyers_unloading_requirements_for_deliveries() throws InterruptedException {
			Thread.sleep(2000);
			
			WebElement element2=driver.findElement(By.xpath("//label[normalize-space()='Drop Trailer']"));
			JavascriptExecutor executor2=(JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();",element2);
			
		}
		
		
		
		@When(": Buyers Preferred Delivery time From")
		public void buyers_preferred_delivery_time_from() throws InterruptedException {
		    //driver.findElement(By.xpath("//p[text()='Buyers: Preferred Delivery Window']/../../.././/input"));
			  Thread.sleep(2000);
				WebElement el = driver.findElement(By.xpath("(//input[@name='deliveryWindowBegin'])[1]"));
					JavascriptExecutor executor=(JavascriptExecutor)driver;
					executor.executeScript("arguments[0].value=\"\"", el);
					pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
                   M.getDeliverytimeFrom().sendKeys("08:00");
		
		
		
		}
		
		@When(": Buyers Preferred Delivery time To")
		public void buyers_preferred_delivery_time_to() throws InterruptedException {
		   
			Thread.sleep(2000);
			WebElement el = driver.findElement(By.xpath("(//input[@name='deliveryWindowEnd'])[1]"));
				JavascriptExecutor executor=(JavascriptExecutor)driver;
				executor.executeScript("arguments[0].value=\"\"", el);
				pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
					M.getDeliverytimeTo().sendKeys("17:00");
		
		
		}
		
		
		
		
		
		@When(": Buyers Preferred Pickup time From")
		public void buyers_preferred_pickup_time_from() throws InterruptedException {
		   		
			Thread.sleep(2000);
			WebElement el = driver.findElement(By.xpath("(//input[@name='deliveryWindowBegin'])[2]"));
				JavascriptExecutor executor=(JavascriptExecutor)driver;
				executor.executeScript("arguments[0].value=\"\"", el);
				pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
		    M.getPickuptimeFrom().sendKeys("09:00");
		
		
		    
		 }
		
		
		
		@When(": Buyers Preferred Pickup time To")
		public void buyers_preferred_pickup_time_to() throws InterruptedException {
		  
			Thread.sleep(2000);
			WebElement el = driver.findElement(By.xpath("(//input[@name='deliveryWindowEnd'])[2]"));
				JavascriptExecutor executor=(JavascriptExecutor)driver;
				executor.executeScript("arguments[0].value=\"\"", el);
				pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
		     M.getPickuptimeTo().sendKeys("18:00");
		}
	
		@When(": User Enter the Marketplace Search Radius Preference")
		public void user_enter_the_marketplace_search_radius_preference() throws InterruptedException {
			   Thread.sleep(2000);
		for(int i=0;i<=2;i++) {
		try {
		driver.findElement(By.xpath("//div[@class='app-input-text']//div//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']")).click();
	       break;
			}
			catch(Exception e) {
			System.out.println(e.getMessage());
			}
			}
			}
		
		@When(": User Select the Markrtplace in Miles")
		public void user_select_the_markrtplace_in_miles() {
			for(int i=0;i<=2;i++) {
				try {
					driver.findElement(By.xpath("//div[text()='Within 200 Miles']")).click();
                 break;
				}
			catch(Exception e) {
			System.out.println(e.getMessage());
			}
			}
		}
	  
		@When(": User Update the Marketplace Search Preferences")
		public void user_update_the_marketplace_search_preferences() throws InterruptedException {
			Thread.sleep(2000);
			WebElement element5=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/p[1]"));
			JavascriptExecutor executor5=(JavascriptExecutor)driver;
			executor5.executeScript("arguments[0].click();",element5);
		}
		@When(": User  Click on OK button inside alert pop-up window6")
		public void user_click_on_ok_button_inside_alert_pop_up_window6() {
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
          M.getpopupwindow6().click();
		
		}
		
		/*@When(": User Enter the  Tax Exemption and click the State Dropdown")
		public void user_enter_the_tax_exemption_and_click_the_state_dropdown() throws InterruptedException {
			Thread.sleep(1000);
			for(int i=0;i<=2;i++) {
				try {
				driver.findElement(By.xpath("//input[@id='react-select-4-input']")).click();
                 break;
				}
			catch(Exception e) {
			System.out.println(e.getMessage());
			}
			}
			WebElement dropDown2= driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
			Actions actionDropDown2=new Actions(driver);
			actionDropDown2.moveToElement(dropDown2);	
			actionDropDown2.click().build().perform();
				Thread.sleep(2000);
		
		}
		@When(": User Select the State")
		public void user_select_the_state() throws InterruptedException {
			//pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
           //M.getSelectTheState().click();
			 Thread.sleep(2000);
				for(int i=0;i<=2;i++) {
				try {
				driver.findElement(By.xpath("//div[text()='AL-Alabama']")).click();
			       break;
					}
					catch(Exception e) {
					System.out.println(e.getMessage());
					}
					}
					}
		
		
		
		@When(": User Enter the  Upload the Exempt Form")
		public void user_enter_the_upload_the_exempt_form() throws InterruptedException {
			 Thread.sleep(2000);
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
	           M.getUploadTheExemptForm().sendKeys("C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-Pallet-Trader-ManageAccount-Broker-ChromeDriver2\\Resourses\\EXEMPT FORM.docx");
	      }
		
		@When(": User Agree Uploading a valid Exempt Form")
		public void user_agree_uploading_a_valid_exempt_form() throws InterruptedException {
			 Thread.sleep(2000);
			WebElement element7=driver.findElement(By.xpath("//label[contains(text(),'I agree that I am uploading a valid tax exempt for')]"));
			JavascriptExecutor executor7=(JavascriptExecutor)driver;
			executor7.executeScript("arguments[0].click();",element7);
		}
		@When(": User Update the Tax Exemption")
		public void user_update_the_tax_exemption() throws InterruptedException {
			 Thread.sleep(2000);
			WebElement element8=driver.findElement(By.xpath("//button[normalize-space()='Update']"));
			JavascriptExecutor executor8=(JavascriptExecutor)driver;
			executor8.executeScript("arguments[0].click();",element8);  
		}
		
		@When(": User  Click on OK button inside alert pop-up window7")
		public void user_click_on_ok_button_inside_alert_pop_up_window7() throws InterruptedException {
			 Thread.sleep(2000);
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
           M.getpopupwindow7().click();*/
		
		//}
		
		@When(": User Enter the Email Notification Preferences and Submit")
		public void user_enter_the_email_notification_preferences_and_submit() throws InterruptedException {
			 Thread.sleep(2000);
			WebElement element9=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
			JavascriptExecutor executor9=(JavascriptExecutor)driver;
			executor9.executeScript("arguments[0].click();",element9);
			
		}
		@When(": User  Click on OK button inside alert pop-up window8")
		public void user_click_on_ok_button_inside_alert_pop_up_window8() throws InterruptedException {
			 Thread.sleep(2000);
			pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
          M.getpopupwindow8().click();
		}



}
		
		
		

		
		
		
		
		
		
		
		
		
		
	
		
		
