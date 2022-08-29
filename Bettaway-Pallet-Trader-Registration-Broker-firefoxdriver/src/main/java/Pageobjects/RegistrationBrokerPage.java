package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationBrokerPage {

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
	//By AsaBroker=By.xpath("//label[@for='active']//span[@class='radio-checkmark']");
	//By BusinessInformation=By.xpath("//label[normalize-space()='TAX ID']");
	By TaxId=By.xpath("//input[@placeholder='Tax ID ']");
	By DNBDUNS=By.xpath("//input[@placeholder='DNB/DUNS']");
	By URL=By.xpath("//input[@placeholder='https//:']");
	By BusinessDescription=By.xpath("//textarea[@name='businessDesc']");
	//By SellerRemittance=By.xpath("//label[normalize-space()='Bank Account']");
	By AccountHolderName=By.xpath("//input[@placeholder='Account Holder Name']");
	By BankAccountNumber=By.xpath("//input[@placeholder='Bank Account Number']");
	By BankRoutingNumber=By.xpath("//input[@placeholder='Bank Routing Number']");
	By Validate=By.xpath("//button[normalize-space()='OK']");
	//(//button[normalize-space()='OK'])[1]
	By NameOnTheCard= By.xpath("(//input[@placeholder='Name on the Card'])[1]");         
	By CardNumber=By.cssSelector("#root > form > span:nth-child(4) > div > div.CardNumberField-input-wrapper > span > input");
	//*[@id="root"]/form/span[2]/div/div[2]/span/input
	By ExpirationDate=By.xpath("(//input[@placeholder='MM / YY'])[1]");
	By CVCCVVNumber=By.xpath("//input[@placeholder='CVC']");
	By PopupAlert=By.xpath("//button[normalize-space()='OK']");
	By MembershipName=By.xpath("(//input[@placeholder='Name on the Card'])[2]");
	//div[@class='sc-euEtCV hTuscY']//div[@class='col-12']//div//div[@class='text-left mt-4 mb-2']//div//div[contains(@class,'paymentWrapper')]//div[@class='payment']//div//input[@placeholder='Name on the Card']
	By MembershipCardNumber=By.cssSelector("#root > form > span:nth-child(4) > div > div.CardNumberField-input-wrapper > span > input");
	By MembershipExpirationDate=By.xpath("//*[@id=\"root\"]/form/span[2]/span/input");
	By MembershipCVCCVVNumber=By.xpath("//*[@id=\"root\"]/form/span[2]/span/input");
	By PopupAlert2=By.xpath("//button[normalize-space()='OK']");
	//By SubscriptionFee=By.xpath("//label[contains(text(),'I hereby accept and authorize that I will be charg')]");
	By AcknowledgedandAgree=By.xpath("//div[@class='checkbox-fieldAuth']//span[@class='checkMark']");
	By  SumbitButton1=By.xpath("//button[normalize-space()='Submit']");
	By SucessfullyRegistered=By.xpath("//button[normalize-space()='OK']");
	//By NextStep=By.xpath("//button[normalize-space()='Next']");
	//By ValidateInformation=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]");
	//label[normalize-space()='Expiration Date']//input
	//(//input[normalize-space()='Expiration Date'])[1]
	//label[normalize-space()='Expiration Date']//input)[1]
	//label[normalize-space()='Expiration Date'])[1]
	//(//input[@placeholder='MM / YY''])[1]


	public RegistrationBrokerPage(WebDriver driver) {
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

		public WebElement getTaxId() {
			return driver.findElement(TaxId);
			}


		public WebElement getDNBDUNS() {
			return driver.findElement(DNBDUNS);
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

		public WebElement getAccountHolderName() {
			return driver.findElement(AccountHolderName);
			}

		public WebElement getBankAccountNumber() {
			return driver.findElement(BankAccountNumber);
			}

		
		public WebElement getBankRoutingNumber() {
			return driver.findElement(BankRoutingNumber);
			}

		public WebElement getValidate() {
			return driver.findElement(Validate);
			}

		
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
		

