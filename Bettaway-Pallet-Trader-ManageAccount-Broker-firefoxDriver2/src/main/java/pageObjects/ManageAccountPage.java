package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageAccountPage {

	public WebDriver driver;
	By EmailId=By.xpath("(//input[@placeholder='Email*'])[1]");
	By Password=By.xpath("//input[@placeholder='Password (At least 8 characters)']");
	//input[@placeholder='Password (At least 8 characters)']
	By RememberMe=By.xpath("//span[@class='checkMark']");
    By Name=By.xpath("//input[@placeholder='Name']");
	By  CheckMark=By.xpath("(//span[@class='checkMark'])[2]");
	By Send=By.xpath("//button[normalize-space()='Send']");
	By  popupwindow5=By.xpath("//button[normalize-space()='OK']");
	By HelloDropDown=By.xpath("//img[@alt='userPic']");
	By  ManageAccount=By.xpath("//a[normalize-space()='Manage Account']");
	By EditProfilePic=By.xpath("(//div[@class='sc-fjBBiU bcYKKU'])[1]");
	By DebitCard=By.xpath("//label[normalize-space()='Debit Card']");
	By NameontheCard=By.xpath("//input[@placeholder='Name on the Card']");
	By  CardNumber=By.xpath("//*[@id=\"root\"]/form/span[2]/div/div[2]/span/input");
	By ExpirationDate=By.xpath("//*[@id=\"root\"]/form/span[2]/span/input");
	By  CVCCVVNumber=By.xpath("//*[@id=\"root\"]/form/span[2]/span/input");
	By Submitbutton=By.xpath("//button[@class='app-green-button']");
	By  popupwindow=By.xpath("//button[normalize-space()='OK']");
	By EditCardDetails=By.xpath("//span[@class='edit-btn']");
	By ExpireMonth=By.xpath("//p[text()='Expire Month']/..//input");
	By ExpireYear=By.xpath("//p[text()='Expire Year']/..//input");
	By Submitbutton1=By.xpath("(//button[@type='submit'][normalize-space()='Submit'])[2]");
	By popupwindow1=By.xpath("(//button[normalize-space()='OK'])[1]");
	//button[normalize-space()='OK']
	By NameontheCard1=By.xpath("//input[@placeholder='Name on the Card']");
	By CardNumber1=By.xpath("//*[@id=\"root\"]/form/span[2]/div/div[2]/span/input");
	By ExpirationDate1=By.xpath("//*[@id=\"root\"]/form/span[2]/span/input");
	By CVCCVVNumber1=By.xpath("//*[@id=\"root\"]/form/span[2]/span/input");
	By Submitbutton2=By.xpath("//button[@class='app-green-button']");
	By popupwindow2=By.xpath("//button[normalize-space()='OK']");
	By popupwindow3=By.xpath("//button[normalize-space()='OK']");
	By NameontheCard2=By.xpath("//input[@placeholder='Name on the Card']");
	By CardNumber2=By.xpath("//*[@id=\"root\"]/form/span[2]/div/div[2]/span/input");
	//html/body/div/form/span[2]/div/div[2]/span/input
	//*[@id="root"]/form/span[2]/div/div[2]/span/input
	By ExpirationDate2=By.xpath("//*[@id=\"root\"]/form/span[2]/span/input");
	By CVCCVVNumber2=By.xpath("//*[@id=\"root\"]/form/span[2]/span/input");
	By Submitbutton4=By.xpath("//button[@class='app-green-button']");
	By popupwindow4=By.xpath("//button[normalize-space()='OK']");
	By promocodeNumber=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/p[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]");
	By promocodeApply=By.xpath("//div[@type='app-green-button']");
	By RequirementforDeliveries=By.xpath("//label[normalize-space()='Straight Trailer']");
	By UnloadingRequirementsforDeliveries=By.xpath("//label[normalize-space()='Drop Trailer']");
	By DeliverytimeFrom=By.xpath("(//input[@name='deliveryWindowBegin'])[1]");
	By DeliverytimeTo=By.xpath("(//input[@name='deliveryWindowEnd'])[1]");
	By PickuptimeFrom=By.xpath("(//input[@name='deliveryWindowBegin'])[2]");
	By PickuptimeTo=By.xpath("(//input[@name='deliveryWindowEnd'])[2]");
	By popupwindow6=By.xpath("//button[normalize-space()='OK']");
	By SelectTheState=By.xpath("//div[text()='AL-Alabama']");
	By UploadTheExemptForm=By.xpath("//input[@id='taxExemption']");
	//By UpdateTheTaxExemption=By.xpath("
	By popupwindow7=By.xpath("//button[normalize-space()='OK']");
	By popupwindow8=By.xpath("(//button[normalize-space()='OK'])[1]");
	By popupwindow9=By.xpath("//button[normalize-space()='OK']");
	//button[normalize-space()='OK']
	//p[text()='Expire Year']/..//input
	//div[@class='sc-fjBBiU bcYKKU']
	public ManageAccountPage(WebDriver driver) {
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
	public WebElement getHelloDropDown() {
		return driver.findElement(HelloDropDown);
	}


	public WebElement getManageAccount() {
		return driver.findElement(ManageAccount);
	}

	public WebElement getEditProfilePic() {
		return driver.findElement(EditProfilePic);
	}


	
	public WebElement getDebitCard() {
		return driver.findElement(DebitCard);
	}

	
	public WebElement getNameontheCard() {
		return driver.findElement(NameontheCard);
	}

	public WebElement getCardNumber() {
		return driver.findElement(CardNumber);
	}

	public WebElement getExpirationDate() {
		return driver.findElement(ExpirationDate);
	}
	public WebElement getCVCCVVNumber() {
		return driver.findElement(CVCCVVNumber);
	}

	public WebElement getSubmitbutton() {
		return driver.findElement(Submitbutton);
	}

	
	public WebElement getpopupwindow() {
		return driver.findElement(popupwindow);
	}

	
	public WebElement getEditCardDetails() {
		return driver.findElement(EditCardDetails);
	}

	
	
	public WebElement getExpireMonth() {
		return driver.findElement(ExpireMonth);
	}

	
	public WebElement getExpireYear() {
		return driver.findElement(ExpireYear);
	}

	public WebElement getSubmitbutton1() {
		return driver.findElement(Submitbutton1);
	}

	public WebElement getpopupwindow1() {
		return driver.findElement(popupwindow1);
	}

	
	
	
	public WebElement getNameontheCard1() {
		return driver.findElement(NameontheCard1);
	}


	public WebElement getCardNumber1() {
		return driver.findElement(CardNumber1);
	}

	public WebElement getExpirationDate1() {
		return driver.findElement(ExpirationDate1);
	}

	public WebElement getCVCCVVNumber1() {
		return driver.findElement(CVCCVVNumber1);
	}

	public WebElement getSubmitbutton2() {
		return driver.findElement(Submitbutton2);
	}

	public WebElement getpopupwindow2() {
		return driver.findElement(popupwindow2);
	}

	public WebElement getpopupwindow3() {
		return driver.findElement(popupwindow3);
	}
	
	public WebElement getNameontheCard2() {
		return driver.findElement(NameontheCard2);
	}

	public WebElement getCardNumber2() {
		return driver.findElement(CardNumber2);
	}

	public WebElement getExpirationDate2() {
		return driver.findElement(ExpirationDate2);
	}

	public WebElement getCVCCVVNumber2() {
		return driver.findElement(CVCCVVNumber2);
	}

	public WebElement getSubmitbutton4() {
		return driver.findElement(Submitbutton4);
	}

	public WebElement getpopupwindow4() {
		return driver.findElement(popupwindow4);
	
	
	}	
	
	
	
	public WebElement getpromocodeNumber() {
		return driver.findElement(promocodeNumber);
	
	
	}	
	
	public WebElement getpromocodeApply() {
		return driver.findElement(promocodeApply);
	
	
	}
	
	
	
	public WebElement getRequirementforDeliveries() {
		return driver.findElement(RequirementforDeliveries);
	
	
	}	
	
	public WebElement getUnloadingRequirementsforDeliveries() {
		return driver.findElement(UnloadingRequirementsforDeliveries);
	
	
	}	
	public WebElement getDeliverytimeFrom() {
		return driver.findElement(DeliverytimeFrom);
	}
	
	public WebElement getDeliverytimeTo() {
		return driver.findElement(DeliverytimeTo);
	
	
	}	

	public WebElement getPickuptimeFrom() {
		return driver.findElement(PickuptimeFrom);
	
	}	

	public WebElement getPickuptimeTo() {
		return driver.findElement(PickuptimeTo);
	
	}	

	public WebElement getpopupwindow6() {
		return driver.findElement(popupwindow6);
	
	}
	
	public WebElement getSelectTheState() {
		return driver.findElement(SelectTheState);
	
	}
	
	public WebElement getUploadTheExemptForm() {
		return driver.findElement(UploadTheExemptForm);
	
	}
	
	public WebElement getpopupwindow7() {
		return driver.findElement(popupwindow7);
	
	}

	public WebElement getpopupwindow8() {
		return driver.findElement(popupwindow8);
	
	}
	public WebElement getpopupwindow9() {
		return driver.findElement(popupwindow9);
	
	}
}