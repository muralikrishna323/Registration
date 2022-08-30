package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyCommunityPage {

	public WebDriver driver;
By EmailId=By.xpath("(//input[@placeholder='Email*'])[1]");
By Password=By.xpath("//input[@placeholder='Password (At least 8 characters)']");
By RememberMe=By.xpath("//span[@class='checkMark']");
By Name=By.xpath("//input[@placeholder='Name']");
By  CheckMark=By.xpath("(//span[@class='checkMark'])[2]");
By Send=By.xpath("//button[normalize-space()='Send']");
By  popupwindow5=By.xpath("//button[normalize-space()='OK']");
By HamburgerIcon=By.xpath("(//div[@class='menu-icon'])[1]");
//div[@class='menu-icon']//*[name()='svg']");
By MyCommunity=By.xpath("//div[normalize-space()='My Community']");
By UploadImage=By.xpath("//input[@id='getFile']");	
By  popupwindow6=By.xpath("//button[normalize-space()='OK']");
By  CreateGroup=By.xpath("//button[normalize-space()='Create Group']");
By UploadImage1=By.xpath("//input[@id='getGroupFileundefined']");	
By GroupName=By.xpath("//input[@placeholder='Group Name']");
By  Description=By.xpath("//textarea[@placeholder='Briefly describe the purpose of the group']");
By  popupwindow7=By.xpath("//button[normalize-space()='OK']");
By  Recipients=By.xpath("//div[contains(@class,'empty')]//input[contains(@type,'text')]");
By SelectGroupName=By.id("react-select-2-option-0");
By AddMessage=By.xpath("//textarea[@placeholder='Add Message']");
By  popupwindow8=By.xpath("//button[normalize-space()='OK']");

public MyCommunityPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getEmailId() {
		return driver.findElement(EmailId);
	}
	public WebElement getPassword() {
		return driver.findElement( Password);
	}


	public WebElement getRememberMe() {
		return driver.findElement(RememberMe);
	}

	public WebElement getName() {
		return driver.findElement(Name);
	}
	
	public WebElement getCheckMark() {
		return driver.findElement(CheckMark);
	}
	
	public WebElement getSend() {
		return driver.findElement(Send);
	}
	
	public WebElement getpopupwindow5() {
		return driver.findElement(popupwindow5);
	}


	public WebElement  getHamburgerIcon() {
		return driver.findElement(HamburgerIcon);
	}


	public WebElement  getMyCommunity() {
		return driver.findElement(MyCommunity);
	}

	public WebElement  getUploadImage() {
		return driver.findElement(UploadImage);
	}


	public WebElement getCreateGroup() {
		return driver.findElement(CreateGroup);
	}


	public WebElement getpopupwindow6() {
		return driver.findElement(popupwindow6);
	}


	public WebElement getUploadImage1() {
		return driver.findElement(UploadImage1);
	}


	public WebElement getGroupName() {
		return driver.findElement(GroupName);
	}

	public WebElement getDescription() {
		return driver.findElement(Description);
	}

	public WebElement getpopupwindow7() {
		return driver.findElement(popupwindow6);
	}


	public WebElement getRecipients() {
		return driver.findElement(Recipients);
	}

	public WebElement getSelectGroupName() {
		return driver.findElement(SelectGroupName);
	}
	
	public WebElement getAddMessage() {
		return driver.findElement(AddMessage);
	}
	
	public WebElement getpopupwindow8() {
		return driver.findElement(popupwindow8);
	}
	
	
	
}
