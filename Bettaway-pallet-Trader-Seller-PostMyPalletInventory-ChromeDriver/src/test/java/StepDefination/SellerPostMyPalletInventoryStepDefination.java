package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.SellerPostMyPalletInventoryPage;

public class SellerPostMyPalletInventoryStepDefination {



WebDriver driver;
	

	public WebDriver initializeDriver() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-pallet-Trader-Seller-PostMyPalletInventory-ChromeDriver\\drivers\\chromedriver.exe");

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
	
	@When(": User Enter on the signin page")
	public void user_enter_on_the_signin_page() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
	i.getsignIn().click();
	}
	
	@When(": User Enter on the valid EmailId")
	public void user_enter_on_the_valid_email_id() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getEmailId().sendKeys("1934a@mailinator.com");
	    
	}
	
	@When(": User Enter on the valid PassWord")
	public void user_enter_on_the_valid_pass_word() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getPassWord().sendKeys("Automation@123");
	}
	
	@When(": User click on the Signin Button")
	public void user_click_on_the_signin_button() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
//i.getSigninButton().click();
	
		WebElement element = driver.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	
	
	}
	@When(": User Click on the Sell pallets drop down")
	public void user_click_on_the_sell_pallets_drop_down() {
		WebElement element1 = driver.findElement(By.xpath("(//button[contains(@type,'button')])[1]"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element1);
	
	}
	
	@When(": User Select on the Post My Pallet Inventory")
	public void user_select_on_the_post_my_pallet_inventory() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
  i.getInventory().click();
	}
	
	@When(": User Enter on the Title of post")
	public void user_enter_on_the_title_of_post() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
  i.getTitleOfPost().sendKeys("pallet1");
	}
	
	@When(": User Upload on the Product Images")
	public void user_upload_on_the_product_images() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getProductImages().sendKeys("C:\\Users\\Mobile Programming\\eclipse-workspace\\dummy\\Resources\\pallet1.png");
	}
	@When(": User Select on the Condition Type")
	public void user_select_on_the_condition_type() throws InterruptedException {

	Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath("//label[normalize-space()='Recycled']"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element1);
		Thread.sleep(3000);
	}
	
	@When(": User Click on the  pallet Type drop down")
	public void user_click_on_the_pallet_type_drop_down() throws InterruptedException {
		Thread.sleep(3000);
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getPalletTypeDropdown().click();
	}
	@When(": User Select on  the pallet Type")
	public void user_select_on_the_pallet_type() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
   i.getpalletType().click();
		
		
	}
	
	@When(": User Click on the  size Drop down")
	public void user_click_on_the_size_drop_down() throws InterruptedException {
		Thread.sleep(3000);
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getSizeDropdown().click();
		
		//driver.findElement(By.xpath("(//div[contains(@aria-hidden,'true')])[8]")).click();
	
	}
	
	@When(": User Select  the size")
	public void user_select_the_size() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
       i.getSize().click();
		//driver.findElement(By.xpath("//div[text()='Custom']")).click();

	}
	
	@When(": User Enter on the Length")
	public void user_enter_on_the_length() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
  i.getLength().sendKeys("47");
	}
	@When(": User Enter on the Width")
	public void user_enter_on_the_width() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getWidth().sendKeys("39");
	}
	@When(": User Enter on the valid Height")
	public void user_enter_on_the_valid_height() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getHeight().sendKeys("5");   
	}

	@When(": User Click on the  Heat Treated  Checkbox")
	public void user_click_on_the_heat_treated_checkbox() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
 i.getHeatTreatedCheckbox().click();
	}
	
	@When(": User Click on the  uploadSpecification Button and Upload Specification file")
	public void user_click_on_the_upload_specification_button_and_upload_specification_file() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getUploadSpecificationFile().sendKeys("C:\\Users\\Mobile Programming\\eclipse-workspace\\Bettaway-pallet-Trader-Seller-PostMyPalletInventory-ChromeDriver\\Resources\\Specification.docx");
	}


	@When(": User Enter on the Equipment Available for Delivery \\(Select all that apply)")
	public void user_enter_on_the_equipment_available_for_delivery_select_all_that_apply() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement element41 = driver.findElement(By.xpath("//label[normalize-space()='Flat Bed/Open Trailer']"));
		JavascriptExecutor executor41 = (JavascriptExecutor) driver;
		executor41.executeScript("arguments[0].click();", element41);	
	
	}
	@When(": User Enter on the Distance Willing To Travel \\(In miles)")
	public void user_enter_on_the_distance_willing_to_travel_in_miles() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
 i.getTravelInMiles().sendKeys("20");
	}
	@When(": User Click on the  Delivery Lead Time \\(Business Day, M-F) drop down")
	public void user_click_on_the_delivery_lead_time_business_day_m_f_drop_down() throws InterruptedException {
		Thread.sleep(3000);
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getBusinessDayDropdown().click();  
	}
	@When(": User Select  the Hours")
	public void user_select_the_hours() throws InterruptedException {
		Thread.sleep(3000);
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getSelectTheHours().click(); 
	}
	@When(": User Enter on the Lots")
	public void user_enter_on_the_lots() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getLots().sendKeys("2");  
	}

	@When(": User Click on the Allow Users Radio Button")
	public void user_click_on_the_allow_users_radio_button() {
		WebElement element95 = driver.findElement(By.xpath("//label[contains(text(),'Allow users to make offers for a quantity that is ')]"));
		JavascriptExecutor executor95 = (JavascriptExecutor) driver;
	   executor95.executeScript("arguments[0].click();", element95);
	}
	@When(": User Enter on the Minimum Delivered Price")
	public void user_enter_on_the_minimum_delivered_price() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getMinimumDeliveredPrice().sendKeys("10");
	}
	@When(": User Enter on the Buy Now Delivered Price")
	public void user_enter_on_the_buy_now_delivered_price() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getBuyNowDeliveredPrice().sendKeys("15");
	}
	@When(": User Enter on the  Buy Now Pickup Price")
	public void user_enter_on_the_buy_now_pickup_price() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
i.getBuyNowPickupPrice().sendKeys("25");
	}

@When(": User Enter on the Bid Close Date")
	public void user_enter_on_the_bid_close_date() {
	String year="2022";
	String month="September";
	String date="10";
	
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
	@When(": User Click on the  Schedule of recreate daily, weekly or monthly needs Checkbox")
	public void user_click_on_the_schedule_of_recreate_daily_weekly_or_monthly_needs_checkbox() {
		//driver.findElement(By.xpath("//label[contains(text(),'Schedule this post to automatically recreate daily')]")).click(); 
	
		WebElement element95 = driver.findElement(By.xpath("//label[contains(text(),'Schedule this post to automatically recreate daily')]"));
		JavascriptExecutor executor95 = (JavascriptExecutor) driver;
	   executor95.executeScript("arguments[0].click();", element95);
	
	
	}

	
	@When(": User Enter on the Setup Recurring Post and select the Start Date")
	public void user_enter_on_the_setup_recurring_post_and_select_the_start_date() throws InterruptedException {
	  
		String year="2022";
		String month="September";
		String date="15";
		
		WebElement element94 = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]"));
		JavascriptExecutor executor94 = (JavascriptExecutor) driver;
		executor94.executeScript("arguments[0].click();", element94);	
		
		//driver.findElement(By.xpath("//button[@aria-label='change date']//span[@class='MuiIconButton-label']")).click();
		
				while(true)
				{
					Thread.sleep(2000);
					String monthyear=driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter'])[1]")).getText();
					//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']
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
	@When(": User Enter on the Setup Recurring Post and select the End Date")
	public void user_enter_on_the_setup_recurring_post_and_select_the_end_date() throws InterruptedException {
	  
		
		String year="2022";
		String month="October";
		String date="14";
		
		WebElement element94 = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]"));
		JavascriptExecutor executor94 = (JavascriptExecutor) driver;
		executor94.executeScript("arguments[0].click();", element94);	
		
		//driver.findElement(By.xpath("//button[@aria-label='change date']//span[@class='MuiIconButton-label']")).click();
		
				while(true)
				{
					Thread.sleep(2000);
					String monthyear=driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter'])[1]")).getText();
					//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']
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
	@When(": User Enter on the Recurrence Pattern and click on the Daily or weekly or monthly Radio Button")
	public void user_enter_on_the_recurrence_pattern_and_click_on_the_daily_or_weekly_or_monthly_radio_button() {
	
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);

		i.getweeklyRadioButton().click();
		
		//driver.findElement(By.xpath("//label[normalize-space()='Daily']")).click();
		
	}
	@When(": User Click  on the  Submit Button")
	public void user_click_on_the_submit_button() {
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);

		i.getSubmitButton().click();
		
		//driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	}



	@When(": User Enter on the  Notes")
	public void user_enter_on_the_notes() {
		//driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Notes");
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
      i.getNotes().sendKeys("Notes");
		
		
	}
	@When(": User Click on the post Button")
	public void user_click_on_the_post_button() {
	    

		WebElement element95 = driver.findElement(By.xpath("//button[normalize-space()='Post']"));
		JavascriptExecutor executor95 = (JavascriptExecutor) driver;
	   executor95.executeScript("arguments[0].click();", element95);
		
		
		
		}
	@When(": User Enter on the  Click on OK button inside alert pop-up window1")
	public void user_enter_on_the_click_on_ok_button_inside_alert_pop_up_window1() {
	 
		SellerPostMyPalletInventoryPage i=new SellerPostMyPalletInventoryPage(driver);
      i.getpopupwindow1().click();
		
		
		//driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	
		
	}
















}
