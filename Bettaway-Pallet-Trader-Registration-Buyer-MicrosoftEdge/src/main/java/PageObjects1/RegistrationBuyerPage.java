package PageObjects1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationBuyerPage {

	public WebDriver driver;
	By signup=By.xpath("//button[normalize-space()='SIGN IN']");
	By username=By.xpath("//input[@name='name']");
	By Email=By.xpath("//input[@name='email']");
	By password=By.xpath("//input[@name='password']");
	By ConfirmPassword=By.xpath("//input[@name='confirmPassword']");
	By CompanyName=By.xpath("//input[@name='companyName']");
	By PhoneNumber=By.xpath("//input[@name='smsPhNumber']");
	By Address1=By.xpath("//input[@name='line1']");
	By Address2=By.xpath("//input[@name='line2']");
	By City=By.xpath("//input[@name='locationCity']");
	By selectdropdown=By.xpath("//div[@class=' css-1wy0on6']");
	By  locationZipCode=By.name("locationZip");
	By Submit=By.xpath("//button[normalize-space()='Submit']");
	By Otp=By.xpath("//input[@placeholder='Enter OTP*']");
	By GreenButton=By.xpath("//button[@class='button app-green-button submitBtn']");
	By VerifiedEmailid=By.xpath("//button[normalize-space()='OK']");
   // By NotRegisterForTheBroker=By.xpath("//label[@for='deActive']//span[@class='radio-checkmark']");
	By RegisterForTheBuyer=By.xpath("//label[@for='Yes']//span[@class='radio-checkmark']");
	By NotRegisterForTheSeller=By.xpath("//label[@for='false']//span[@class='radio-checkmark']");
	By TaxId=By.xpath("//input[@placeholder='Tax ID ']");
	By DNBDUNS=By.xpath("//input[@placeholder='DNB/DUNS']");
	By UploadCreditReferences=By.id("creditRef");
	By URL=By.xpath("//input[@placeholder='https//:']");
	By BusinessDescription=By.xpath("//textarea[@name='businessDesc']");
	//(//input[@placeholder='Name on the Card'])[1]
	//By SellerRemittance=By.xpath("//label[normalize-space()='Bank Account']");
	By NameOnTheCard= By.xpath("(//input[@placeholder='Name on the Card'])[1]");         
	By CardNumber=By.cssSelector("#root > form > span:nth-child(4) > div > div.CardNumberField-input-wrapper > span > input");
	By ExpirationDate=By.xpath("//*[@id=\"root\"]/form/span[2]/span/input");
	By CVCCVVNumber=By.xpath("//*[@id=\"root\"]/form/span[2]/span/input");
	By PopupAlert=By.xpath("//button[normalize-space()='OK']");
	By MembershipName=By.xpath("(//input[@placeholder='Name on the Card'])[2]");
	By MembershipCardNumber=By.xpath("//*[@id=\"root\"]/form/span[2]/div/div[2]/span/input");
	By MembershipExpirationDate=By.xpath("//*[@id=\"root\"]/form/span[2]/span/input");
	By MembershipCVCCVVNumber=By.xpath("//*[@id=\"root\"]/form/span[2]/span/input");
	By PopupAlert2=By.xpath("//button[normalize-space()='OK']");
	//By SubscriptionFee=By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]");
	By AcknowledgedandAgree=By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']");
	By  SumbitButton1=By.xpath("//button[normalize-space()='Submit']");
	By SucessfullyRegistered=By.xpath("//button[normalize-space()='OK']");
	
	public RegistrationBuyerPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getRegistration() {
		return driver.findElement(signup);
	}
	public WebElement getUsername() {
		return driver.findElement(username);
		
	}

	public WebElement getEmail() {
		return driver.findElement(Email);
	}
	public WebElement getpassword() {
		return driver.findElement(password);
	}
	public WebElement getConfirmPassword() {
	return driver.findElement(ConfirmPassword);
	}
	public WebElement getCompanyNamel() {
	return driver.findElement(CompanyName);
	}
	public WebElement getPhoneNumber() {
	  return driver.findElement(PhoneNumber);
	}
	public WebElement getAddress1() {
		return driver.findElement(Address1);
	}
	public WebElement getAddress2() {
	 return driver.findElement(Address2);
	}
	public WebElement getCity() {
	return driver.findElement(City);
	}
	public WebElement getselectdropdown() {
	return driver.findElement(selectdropdown);
	}

	public WebElement getlocationZipCode() {
	return driver.findElement(locationZipCode);
	}
	public WebElement getSubmit() {
	return driver.findElement(Submit);
	}

	public WebElement getOtp() {
		return driver.findElement(Otp);
		}

	public WebElement getGreenButton() {
		return driver.findElement(GreenButton);
		}

	public WebElement getVerifiedEmailid() {
		return driver.findElement(VerifiedEmailid);
		}

	//public WebElement getNotRegisterForTheBroker() {
		//return driver.findElement(NotRegisterForTheBroker);
		//}

	public WebElement getRegisterForTheBuyer() {
		return driver.findElement(RegisterForTheBuyer);
		}

	public WebElement getNotRegisterForTheSeller() {
		return driver.findElement(NotRegisterForTheSeller);
		}

	public WebElement getTaxId() {
		return driver.findElement(TaxId);
		}
	public WebElement getDNBDUNS() {
		return driver.findElement(DNBDUNS);
		}


	public WebElement getUploadCreditReferences() {
		return driver.findElement(UploadCreditReferences);
		}



	public WebElement getURL() {
		return driver.findElement(URL);
		}
	
	public WebElement getBusinessDescription() {
		return driver.findElement(BusinessDescription);
		}


	//public WebElement getSellerRemittance() {
		//return driver.findElement(SellerRemittance);
		//}

	
	
	public WebElement getNameOnTheCard() {
		return driver.findElement(NameOnTheCard);
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


	public WebElement getPopupAlert() {
		return driver.findElement(PopupAlert);
		}


	public WebElement getMembershipName() {
		return driver.findElement(MembershipName);
		}


	public WebElement getMembershipCardNumber() {
		return driver.findElement(MembershipCardNumber);
		}


	public WebElement getMembershipExpirationDate() {
		return driver.findElement(MembershipExpirationDate);
		}

	public WebElement getMembershipCVCCVVNumber() {
		return driver.findElement(MembershipCVCCVVNumber);
		}
	
	
	public WebElement getPopupAlert2() {
		return driver.findElement(PopupAlert2);
		}
	

	//public WebElement getSubscriptionFee() {
		//return driver.findElement(SubscriptionFee);
		//}
	

	public WebElement getAcknowledgedandAgree() {
		return driver.findElement(AcknowledgedandAgree);
		}
	
	public WebElement getSumbitButton1() {
		return driver.findElement(SumbitButton1);
		}
	

	public WebElement getSucessfullyRegistered() {
		return driver.findElement(SucessfullyRegistered);
		}









}
