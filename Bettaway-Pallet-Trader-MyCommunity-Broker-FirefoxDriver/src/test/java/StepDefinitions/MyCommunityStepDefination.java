package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MyCommunityPage;

public class MyCommunityStepDefination {


	WebDriver driver;
	

	public WebDriver initializeDriver() {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-Pallet-Trader-MyCommunity-Broker-FirefoxDriver\\Drivers\\geckodriver.exe");

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

	@When(": User Enter the signin page")
	public void user_enter_the_signin_page() {
		//pageObjects.ManageAccountPage M=new ManageAccountPage(driver);
		WebElement element=driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
		
		//M.getsignin().click();
	}
	@When(": User Enter the Valid Email ID")
	public void user_enter_the_valid_email_id() {
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
	mc.getEmailId().sendKeys("1977a@mailinator.com");
	}
	@When(": User Enter the valid Password")
	public void user_enter_the_valid_password() {
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
		mc.getPassword().sendKeys("Test@123");
	}
	@When(": User Enter the RememberMe Check Button")
	public void user_enter_the_remember_me_check_button() throws InterruptedException {
		Thread.sleep(2000);
		//pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
		//mc.getRememberMe().click();
		WebElement element=driver.findElement(By.xpath("//span[@class='checkMark']"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
	
	}
	
	
	@Then(": User Sucessfully Enter The DashBoard")
	public void user_sucessfully_enter_the_dash_board() {
		WebElement element=driver.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
	}
		@When(": User Enter the Name")
		public void user_enter_the_name() {
			pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
          mc.getName().sendKeys("AutomationQa");
		}
		
		@When(": User Enter the Acknowledged and agree")
		public void user_enter_the_acknowledged_and_agree() {
		 pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
        mc.getCheckMark().click();
		}
		@When(": User Send Terms and conditions")
		public void user_send_terms_and_conditions() throws InterruptedException {
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
			Thread.sleep(2000);
			mc.getSend().click();

		}
		@When(": User  Click on OK button inside alert pop-up window5")
		public void user_click_on_ok_button_inside_alert_pop_up_window5() {
			pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
			mc.getpopupwindow5().click();
	
		//driver.findElement(By.xpath("//div[contains(text(),'My Community')]")).click();
		}

	@When(": User  Click on the Hamburger Icon")
	public void user_click_on_the_hamburger_icon() throws InterruptedException {
		Thread.sleep(2000);
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
     mc.getHamburgerIcon().click();  
	
	}

	@When(": User  Click on the My community")
	public void user_click_on_the_my_community() {
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
     mc.getMyCommunity().click();
	}


	@When(": User  Click on the profile picture and upload the Image")
	public void user_click_on_the_profile_picture_and_upload_the_image() throws InterruptedException {
		Thread.sleep(2000);
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
    mc.getUploadImage().sendKeys("C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-Pallet-Trader-MyCommunity-Broker-ChromeDriver\\Resources\\Broker.jpeg");  
	}



	@When(": User  Click on OK button inside alert pop-up window6")
	public void user_click_on_ok_button_inside_alert_pop_up_window6() {
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
   mc.getpopupwindow6().click(); 
	}


	@When(": User Click on the Create GroupButton")
	public void user_click_on_the_create_group_button() {
		//pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
    //mc.getCreateGroup().click();
		WebElement element=driver.findElement(By.xpath("//button[normalize-space()='Create Group']"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
	
	
	}
	
	
	
	@When(": User Click on the camera icon and upload the Image")
	public void user_click_on_the_camera_icon_and_upload_the_image() {
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
   mc.getUploadImage1().sendKeys("C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-Pallet-Trader-MyCommunity-Broker-ChromeDriver\\Resources\\group.png"); 
	
	}
   
	@When(": User Click on the  Group Name")
	public void user_click_on_the_group_name() {
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
   mc.getGroupName().sendKeys("T@1234");
	}
	@When(": User Click on the Description")
	public void user_click_on_the_description() {
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
   mc.getDescription().sendKeys("Testing Group for testing reasons"); 
	}
	
	@When(": User Enter the Group Privacy Settings")
	public void user_enter_the_group_privacy_settings() {
	WebElement element43=driver.findElement(By.xpath("//label[normalize-space()='Public']"));
	JavascriptExecutor executor43=(JavascriptExecutor)driver;
	executor43.executeScript("arguments[0].click();",element43);
	}
	
	@When(": User Give Permissions of Allow Members")
	public void user_give_permissions_of_allow_members() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element44=driver.findElement(By.xpath("//label[normalize-space()='Allow members to invite their connections']"));
		JavascriptExecutor executor44=(JavascriptExecutor)driver;
		executor44.executeScript("arguments[0].click();",element44);
	}
	@When(": User Give Permissions of New joinee Request")
	public void user_give_permissions_of_new_joinee_request() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element45=driver.findElement(By.xpath("//label[contains(text(),'Require new joinee request to be reviewed by admin')]"));
		JavascriptExecutor executor45=(JavascriptExecutor)driver;
		executor45.executeScript("arguments[0].click();",element45);
	}
	@When(": User Click on the CreateButton")
	public void user_click_on_the_create_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element46=driver.findElement(By.xpath("//button[normalize-space()='Create']"));
		JavascriptExecutor executor46=(JavascriptExecutor)driver;
		executor46.executeScript("arguments[0].click();",element46);
	}
	@When(": User  Click on OK button inside alert pop-up window7")
	public void user_click_on_ok_button_inside_alert_pop_up_window7() {
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
     mc.getpopupwindow7().click();
	}


	@When(": User  Click on the InviteButton")
	public void user_click_on_the_invite_button() throws InterruptedException {
	    Thread.sleep(2000);
		WebElement element47=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]"));
		JavascriptExecutor executor47=(JavascriptExecutor)driver;
		executor47.executeScript("arguments[0].click();",element47);
	
		//driver.findElement(By.xpath("//div[contains(@class,'empty')]//input[contains(@type,'text')]")).sendKeys("tester@mailinator.com");
	}

	@When(": User  Click on the Recipients")
	public void user_click_on_the_recipients() throws InterruptedException {
		Thread.sleep(2000);
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
    mc.getRecipients().sendKeys("tester@mailinator.com");
	
	//driver.findElement(By.xpath("//input[@id='react-select-2-input']")).click();

	}
	@When(": User  Click on the Select Group")
	public void user_click_on_the_select_group() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,0)");
		Thread.sleep(4000);
			driver.findElement(By.xpath("//div[normalize-space()='Select Group' and contains(@class,'placeholder')]/../../div[2]")).click();
				}
@When(": User  Select on the  Group Name")
	public void user_select_on_the_group_name() throws InterruptedException {
		Thread.sleep(2000);
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
      mc.getSelectGroupName().click();
	}
	
	@When(": User  Click on the  Add Message")
	public void user_click_on_the_add_message() throws InterruptedException {
		Thread.sleep(2000);
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
    mc.getAddMessage().sendKeys("invitations expire after 7 days,but request to join a group never expire"); 
	}
	
	@When(": User  Click on the  Send Invite Button")
	public void user_click_on_the_send_invite_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element59=driver.findElement(By.xpath("//button[normalize-space()='Send Invite']"));
		JavascriptExecutor executor59=(JavascriptExecutor)driver;
		executor59.executeScript("arguments[0].click();",element59); 
	}
	@When(": User  Click on OK button inside alert pop-up window8")
	public void user_click_on_ok_button_inside_alert_pop_up_window8() throws InterruptedException {
		Thread.sleep(2000);
		pageObjects.MyCommunityPage mc=new MyCommunityPage(driver);
      mc.getpopupwindow8().click();
	}









}
