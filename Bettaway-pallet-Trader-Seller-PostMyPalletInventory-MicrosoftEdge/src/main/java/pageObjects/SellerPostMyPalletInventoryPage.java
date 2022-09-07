package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SellerPostMyPalletInventoryPage {

	public WebDriver driver;

By signIn=By.xpath("//button[normalize-space()='SIGN IN']");
By EmailId=By.xpath("//input[@placeholder='Email*']");
By PassWord=By.xpath("//input[@placeholder='Password (At least 8 characters)']");
By SigninButton=By.xpath("//button[normalize-space()='Sign In']");
By DropDown=By.xpath("(//button[contains(@type,'button')])[1]");
By Inventory=By.xpath("//button[normalize-space()='Post My Pallet Inventory']");
By TitleOfPost=By.xpath("//input[@placeholder='Title']");
By ProductImages=By.xpath("//input[@id='uploadPalletInventoryImg']");
By ConditionType=By.xpath("//label[normalize-space()='Recycled']");
By PalletTypeDropdown=By.xpath("(//div[contains(@class,'css-tlfecz-indicatorContainer')])[2]");
By palletType=By.xpath("//div[text()='Stringer']");
By SizeDropdown=By.xpath("(//div[contains(@aria-hidden,'true')])[8]");	
By Size=By.xpath("//div[text()='48 x 40']");	
By Length=By.xpath("//input[@placeholder='Length']");	
By Width=By.xpath("//input[@placeholder='Width']");	
By Height=By.xpath("//input[@placeholder='Height']");	
By HeatTreatedCheckbox=By.xpath("//label[normalize-space()='Heat Treated']");	
By UploadSpecificationFile=By.xpath("//input[@id='uploadSpecificationImgLoad']");
By TravelInMiles=By.xpath("//input[@placeholder='Up to (In Miles)']");	
By BusinessDayDropdown=By.xpath("(//div[contains(@class,'css-tlfecz-indicatorContainer')])[6]");	
By SelectTheHours=By.xpath("//div[text()='72']");
By Lots=By.xpath("//input[@placeholder='Lots']");
By MinimumDeliveredPrice=By.xpath("(//input[@name='basePrice'])[1]");
By BuyNowDeliveredPrice=By.xpath("(//input[@name='desiredPrice'])[1]");
By BuyNowPickupPrice=By.xpath("(//input[@name='cpuPrice'])[1]");


public SellerPostMyPalletInventoryPage(WebDriver driver) {
			this.driver=driver;
		}


	public WebElement getsignIn() {
		return driver.findElement(signIn);
	}

	public WebElement getEmailId() {
		return driver.findElement(EmailId);
	}


	public WebElement getPassWord() {
		return driver.findElement(PassWord);
	}

	public WebElement getSigninButton() {
		return driver.findElement(SigninButton);
	}

	public WebElement getDropDown() {
		return driver.findElement(DropDown);
	}

	public WebElement getInventory() {
		return driver.findElement(Inventory);
	}


	public WebElement getTitleOfPost() {
		return driver.findElement(TitleOfPost);
	}

	public WebElement getProductImages() {
		return driver.findElement(ProductImages);
	}



	public WebElement getConditionType() {
		return driver.findElement(ConditionType);
	}




	public WebElement getPalletTypeDropdown() {
		return driver.findElement(PalletTypeDropdown);
	}



	public WebElement getpalletType() {
		return driver.findElement(palletType);
	}


	public WebElement getSizeDropdown() {
		return driver.findElement(SizeDropdown);
	}


	public WebElement getSize() {
		return driver.findElement(Size);
	}


	
	public WebElement getLength() {
		return driver.findElement(Length);
	}

	
	
	
	public WebElement getWidth() {
		return driver.findElement(Width);
	}

	
	public WebElement getHeight() {
		return driver.findElement(Height);
	}

	
	
	public WebElement getHeatTreatedCheckbox() {
		return driver.findElement(HeatTreatedCheckbox);
	}

	
	
	public WebElement getUploadSpecificationFile() {
		return driver.findElement(UploadSpecificationFile);
	}
	
	
	
	public WebElement getTravelInMiles() {
		return driver.findElement(TravelInMiles);
	}
	
	
	public WebElement getBusinessDayDropdown() {
		return driver.findElement(BusinessDayDropdown);
	}
	
	
	public WebElement getSelectTheHours() {
		return driver.findElement(SelectTheHours);
	}
	


	public WebElement getLots() {
		return driver.findElement(Lots);
	}


	public WebElement getMinimumDeliveredPrice() {
		return driver.findElement(MinimumDeliveredPrice);
	}


	public WebElement getBuyNowDeliveredPrice() {
		return driver.findElement(BuyNowDeliveredPrice);
	}


	public WebElement getBuyNowPickupPrice() {
		return driver.findElement(BuyNowPickupPrice);
	}
	
	
	
	
	

}
