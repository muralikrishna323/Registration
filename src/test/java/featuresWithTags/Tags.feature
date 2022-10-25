@RegistrationModule
Feature: Registration Action
  
@BrokerAccount
Scenario:Sucessful Broker Registration with valid credentials
Given : User navigates to the website myapp.pallettrader.com
When : User Enter the signup page
When : User Enter the Registration form
When : User Enter the valid UserName 
When : User Enter the valid EmailId
When : User Enter the valid PassWord
When : User Enter the valid Conform Password
When : User Enter the valid CompanyName
When : User Enter the valid Cell Phone Number
When : User Enter the valid Address1 Name
When : User Enter the valid Address2 Name
When : User Enter the valid  City Name
When : User Enter DropDown  and Select State
When : User Enter the valid locationZipCode
#When : User Enter the Promo Code or Referral Code 
#When : User Click on the apply button 
#When : User Sumbit the popup alert5
#When : User acknowledged that this promo code
When : User Enter the SumbitButton5
When : User Enter the valid OTP in popup Screen
When : User Enter the GreenSumbitButton5
Then : User verified EmaiId
When : User Enter the Platform as a broker
When : User Enter the BusinessInformationWithTaxId
When : User Enter the Valid TaxId
When : User Enter the Valid DNB/DUNS
When : User Enter the BusinessURL
When : User Enter the BusinessDescription
When : User Enter the SellersRemittance InformationWithBankAccount
When : User Enter AccountHolderName
When : User Enter the valid BankAccountNumber
When : User Enter the Valid BankRoutingNumber
When : User Enter the validate the Information
When : User Enter the BuyerPaymentInformation With DebitCard
When : User Enter the Name on the Card
When : User Enter the valid Card Number
When : User Enter the valid Expiration Date
When : User Enter the valid Expiration Date
When : User Enter the valid CVC/CVV Number
When : User Enter the validate BuyersPaymentInformation 
When : User Sumbit the popup alert
When : User Enter the MembershipPaymentInformation with NameOnTheCard
When : User Enter the valid Card Number for MembershipPayment
When : User Enter the valid Expiration Date for MembershipPayment
When : User Enter the valid CVC/CVV Number for MembershipPayment
When : User Enter the validate MembershipPaymentInformation
When : User Sumbit the popup alert2
When : User Enter the Next Step
When : User Accept Subscription Fee
When : User Acknowledged and Agree
When : User Enter the Sumbit Button1
Then : User Sucessfully Registered With Valid Credentials
 
 
 
 @BrokerAccount1
Scenario:Sucessful Broker Registration with valid credentials1
Given : User navigates to the website myapp.pallettrader.com1
When : User Enter the signup page1
When : User Enter the Registration form1
When : User Enter the valid UserName1
When : User Enter the valid EmailId1
When : User Enter the valid PassWord1
When : User Enter the valid Conform Password1
When : User Enter the valid CompanyName1
When : User Enter the valid Cell Phone Number1
When : User Enter the valid Address1 Name1
When : User Enter the valid Address2 Name1
When : User Enter the valid  City Name1
When : User Enter DropDown  and Select State1
When : User Enter the valid locationZipCode1
#When : User Enter the Promo Code or Referral Code1 
#When : User Click on the apply button1 
#When : User Sumbit the popup alert51
#When : User acknowledged that this promo code1
When : User Enter the SumbitButton7
When : User Enter the valid OTP in popup Screen1
When : User Enter the GreenSumbitButton7
Then : User verified EmaiId1
When : User Enter the Platform as a broker1
When : User Enter the BusinessInformationWithTaxId1
When : User Enter the Valid TaxId1
When : User Enter the Valid DNB/DUNS1
When : User Enter the BusinessURL1
When : User Enter the BusinessDescription1
When : User Enter the SellersRemittance InformationWithDebitCard
When : User Enter the Name on the Card1
When : User Enter the valid Card Number1
When : User Enter the valid Expiration Date1
When : User Enter the valid Expiration Date1
When : User Enter the valid CVC/CVV Number1
When : User Enter the validate the Information1
When : User Sumbit the popup alert1
When : User Enter the BuyerPaymentInformation With CreditCard
When : User Enter the Name on the Card2
When : User Enter the valid Card Number2
When : User Enter the valid Expiration Date2
When : User Enter the valid Expiration Date2
When : User Enter the valid CVC/CVV Number2
When : User Enter the validate BuyersPaymentInformation2
When : User Sumbit the popup alert21
When : User Enter the MembershipPaymentInformation with NameOnTheCard1
When : User Enter the valid Card Number for MembershipPayment3
When : User Enter the valid Expiration Date for MembershipPayment3
When : User Enter the valid CVC/CVV Number for MembershipPayment3
When : User Enter the validate MembershipPaymentInformation1
When : User Sumbit the popup alert22
When : User Enter the Next Step1
When : User Accept Subscription Fee1
When : User Acknowledged and Agree1
When : User Enter the Sumbit Button12
Then : User Sucessfully Registered With Valid Credentials1
 
 
 @BuyerAccountSingleLocationWithTaxID
 Scenario Outline: Sucessful Buyer Registration with valid credentials4
Given : User navigates to the website myapp.pallettrader.com for Buyer4
When : User Enter the signup page for Buyer4
When : User Enter the Registration form for Buyer4
When : User Enter the valid UserName for Buyer4
When : User Enter the valid EmailId for Buyer4
When : User Enter the valid PassWord for Buyer4
When : User Enter the valid Conform Password for Buyer4
When : User Enter the valid CompanyName for Buyer4
When : User Enter the valid Cell Phone Number for Buyer4
When : User Enter the valid Address1 Name for Buyer4
When : User Enter the valid Address2 Name for Buyer4
When : User Enter the valid  City Name for Buyer4
When : User Enter DropDown  and Select State for Buyer4
When : User Enter the valid locationZipCode for Buyer4
#When : User Enter the Promo Code or Referral Code for Buyer4
#When : User Click on the apply button for Buyer4
#When : User Sumbit the popup alert5 for Buyer4
#When : User acknowledged that this promo code for Buyer4
When : User Enter the SumbitButton for Buyer4
When : User Enter the valid OTP in popup Screen for Buyer4
When : User Enter the GreenSumbitButton for Buyer4
Then : User verified EmaiId for Buyer4
When : User Enter the Not Register for  the Broker14
When : User Enter the Register for this platform to buyerPallets14
When : User Enter the Not Register for  the Seller14
When : User Enter the company operate  one location for Buyer14
#When : User Enter the Payment options for Buyer4
When : User Enter the Valid TaxId for Buyer4
When : User Enter the Valid DNB/DUNS for Buyer4
When : User Enter the BusinessURL for Buyer4
When : User Enter the BusinessDescription for Buyer4
When : User Enter the BuyerPaymentInformation for Buyer4
When : User Enter the Name on the Card for Buyer4
When : User Enter the valid Card Number for Buyer4
When : User Enter the valid Expiration Date for Buyer4
When : User Enter the valid Expiration Date for Buyer4
When : User Enter the valid CVC/CVV Number for Buyer4
When : User Enter the validate BuyersPaymentInformation for Buyer4
When : User Sumbit the popup alert for Buyer4
When : User Enter the MembershipPaymentInformation with NameOnTheCard for Buyer4
When : User Enter the valid Card Number for MembershipPayment for Buyer4
When : User Enter the valid Expiration Date for MembershipPayment for Buyer4
When : User Enter the valid CVC/CVV Number for MembershipPayment for Buyer4
When : User Enter the validate MembershipPaymentInformation for Buyer4
When : User Sumbit the popup alert2 for Buyer4
When : User Enter the Next Step for Buyer4
When : User Accept Subscription Fee for Buyer4
When : User Acknowledged and Agree for Buyer4
When : User Enter the Sumbit Button1 for Buyer4
Then : User Sucessfully Registered With Valid Credentials for Buyer4
 
 
 
 
@BuyerAccountSingleLocationwithLicence 
 Scenario Outline: Sucessful Buyer Registration with valid credentials
Given : User navigates to the website myapp.pallettrader.com for Buyer
When : User Enter the signup page for Buyer
When : User Enter the Registration form for Buyer
When : User Enter the valid UserName for Buyer
When : User Enter the valid EmailId for Buyer
When : User Enter the valid PassWord for Buyer
When : User Enter the valid Conform Password for Buyer
When : User Enter the valid CompanyName for Buyer
When : User Enter the valid Cell Phone Number for Buyer
When : User Enter the valid Address1 Name for Buyer
When : User Enter the valid Address2 Name for Buyer
When : User Enter the valid  City Name for Buyer
When : User Enter DropDown  and Select State for Buyer
When : User Enter the valid locationZipCode for Buyer
#When : User Enter the Promo Code or Referral Code for Buyer
#When : User Click on the apply button for Buyer
#When : User Sumbit the popup alert5 for Buyer
#When : User acknowledged that this promo code for Buyer
When : User Enter the SumbitButton for Buyer
When : User Enter the valid OTP in popup Screen for Buyer
When : User Enter the GreenSumbitButton for Buyer
Then : User verified EmaiId for Buyer
When : User Enter the Not Register for  the Broker1
When : User Enter the Register for this platform to buyerPallets1
When : User Enter the Not Register for  the Seller1
When : User Enter the company operate  one location for Buyer
#When : User Enter the Payment options for Buyer
When : User Enter the BusinessInformationWithLICENSE for Buyer
When : User Enter the Valid Driver's License Number for Buyer
When : User Click On the Drivers License State Drop down for Buyer
When : User Select the Drivers License State for Buyer
When : User Enter the valid First Name for Buyer
When : User Enter the valid Last Name for Buyer
When : User Enter the valid Date of Birth  for Buyer
When : User Upload the valid Driver's License for Buyer
When : User Enter the BusinessURL for Buyer5
When : User Enter the BusinessDescription for Buyer
#When : User Enter the Valid TaxId for Buyer
#When : User Enter the Valid DNB/DUNS for Buyer
When : User Enter the BuyerPaymentInformation for Buyer
When : User Enter the Name on the Card for Buyer
When : User Enter the valid Card Number for Buyer
When : User Enter the valid Expiration Date for Buyer
When : User Enter the valid Expiration Date for Buyer
When : User Enter the valid CVC/CVV Number for Buyer
When : User Enter the validate BuyersPaymentInformation for Buyer
When : User Sumbit the popup alert for Buyer
When : User Enter the MembershipPaymentInformation with NameOnTheCard for Buyer
When : User Enter the valid Card Number for MembershipPayment for Buyer
When : User Enter the valid Expiration Date for MembershipPayment for Buyer
When : User Enter the valid CVC/CVV Number for MembershipPayment for Buyer
When : User Enter the validate MembershipPaymentInformation for Buyer
When : User Sumbit the popup alert2 for Buyer
When : User Enter the Next Step for Buyer
When : User Accept Subscription Fee for Buyer
When : User Acknowledged and Agree for Buyer
When : User Enter the Sumbit Button1 for Buyer
Then : User Sucessfully Registered With Valid Credentials for Buyer    

   
   
 
 
 @BuyerAccountMultiplelocationwithIndependentPayment
Scenario Outline: Sucessful Buyer Registration with valid credentials1
Given : User navigates to the website myapp.pallettrader.com for Buyer1
When : User Enter the signup page for Buyer1
When : User Enter the Registration form for Buyer1
When : User Enter the valid UserName for Buyer1
When : User Enter the valid EmailId for Buyer1
When : User Enter the valid PassWord for Buyer1
When : User Enter the valid Conform Password for Buyer1
When : User Enter the valid CompanyName for Buyer1
When : User Enter the valid Cell Phone Number for Buyer1
When : User Enter the valid Address1 Name for Buyer1
When : User Enter the valid Address2 Name for Buyer1
When : User Enter the valid  City Name for Buyer1
When : User Enter DropDown  and Select State for Buyer1
When : User Enter the valid locationZipCode for Buyer1
#When : User Enter the Promo Code or Referral Code for Buyer1
#When : User Click on the apply button for Buyer1
#When : User Sumbit the popup alert5 for Buyer1
#When : User acknowledged that this promo code for Buyer1
When : User Enter the SumbitButton for Buyer1
When : User Enter the valid OTP in popup Screen for Buyer1
When : User Enter the GreenSumbitButton for Buyer1
Then : User verified EmaiId for Buyer1
When : User Enter the Not Register for  the Broker2
When : User Enter the Register for this platform to buyerPallets2
When : User Enter the Not Register for  the Seller2
When : User Enter the company operate  Multiple location for Buyer1
When : User Enter the Payment options  and cick the Independent payment
#When : User Enter the BusinessInformationWithTaxId for buyer
When : User Enter the Valid TaxId for buyer  
When : User Enter the Valid DNB/DUNS for buyer
When : User Enter the BusinessURL for buyer
When : User Enter the BusinessDescription for buyer1
When : User Enter the BuyerPaymentInformation for Buyer1
When : User Enter the Name on the Card for Buyer1
When : User Enter the valid Card Number for Buyer1
When : User Enter the valid Expiration Date for Buyer1
When : User Enter the valid Expiration Date for Buyer1
When : User Enter the valid CVC/CVV Number for Buyer1
When : User Enter the validate BuyersPaymentInformation for Buyer1
When : User Sumbit the popup alert for Buyer1
When : User Enter the MembershipPaymentInformation with NameOnTheCard for Buyer1
When : User Enter the valid Card Number for MembershipPayment for Buyer1
When : User Enter the valid Expiration Date for MembershipPayment for Buyer1
When : User Enter the valid CVC/CVV Number for MembershipPayment for Buyer1
When : User Enter the validate MembershipPaymentInformation for Buyer1
When : User Sumbit the popup alert2 for Buyer1
When : User Enter the Next Step for Buyer1
When : User Accept Subscription Fee for Buyer1
When : User Acknowledged and Agree for Buyer1
When : User Enter the Sumbit Button1 for Buyer1
Then : User Sucessfully Registered With Valid Credentials for Buyer 1
 
 
 
  


 @SellerAccountSingleLocationWithTaxID
Scenario Outline:Sucessful Seller Registration with valid credentials
 Given : User navigates to the website myapp.pallettrader.com for SellerAccount 
When : User Enter the signup page for SellerAccount
When : User Enter the Registration form for SellerAccount
When : User Enter the valid UserName for SellerAccount 
When : User Enter the valid EmailId for SellerAccount
When : User Enter the valid PassWord for SellerAccount
When : User Enter the valid Conform Password for SellerAccount
When : User Enter the valid CompanyName for SellerAccount
When : User Enter the valid Cell Phone Number for SellerAccount
When : User Enter the valid Address1 Name for SellerAccount
When : User Enter the valid Address2 Name for SellerAccount
When : User Enter the valid  City Name for SellerAccount
When : User Enter DropDown  and Select State for SellerAccount
When : User Enter the valid locationZipCode for SellerAccount
#When : User Enter the Promo Code or Referral Code for SellerAccount
#When : User Click on the apply button for SellerAccount
#When : User Sumbit the popup alert5 for SellerAccount
#When : User acknowledged that this promo code for SellerAccount
When : User Enter the SumbitButton for SellerAccount
When : User Enter the valid OTP in popup Screen for SellerAccount
When : User Enter the GreenSumbitButton for SellerAccount
Then : User verified EmaiId for SellerAccount
When : User Enter the Not Register for  the Broker for SellerAccount
When : User Enter the Not Register for  the Buyer for SellerAccount
When : User Enter the register for this platform to seller pallets
When : User Enter the company operate  Single location for SellerAccount
When : User Enter the Valid TaxId for SellerAccount
When : User Enter the Valid DNB/DUNS for SellerAccount
When : User Enter the BusinessURL for SellerAccount
When : User Enter the BusinessDescription for SellerAccount
When : User Enter the BuyerPaymentInformation for SellerAccount
When : User Enter the Name on the Card for SellerAccount
When : User Enter the valid Card Number for SellerAccount
When : User Enter the valid Expiration Date for SellerAccount
When : User Enter the valid Expiration Date for SellerAccount
When : User Enter the valid CVC/CVV Number for SellerAccount
When : User Enter the validate BuyersPaymentInformation for SellerAccount
When : User Sumbit the popup alert for SellerAccount
When : User Enter the MembershipPaymentInformation with NameOnTheCard for SellerAccount
When : User Enter the valid Card Number for MembershipPayment for SellerAccount
When : User Enter the valid Expiration Date for MembershipPayment for SellerAccount
When : User Enter the valid CVC/CVV Number for MembershipPayment for SellerAccount
When : User Enter the validate MembershipPaymentInformation for SellerAccount
When : User Sumbit the popup alert2 for SellerAccount
When : User Enter the Next Step for SellerAccount
When : User Accept Subscription Fee for SellerAccount
When : User Acknowledged and Agree for SellerAccount
When : User Enter the Sumbit Button1 for SellerAccount for SellerAccount
Then : User Sucessfully Registered With Valid Credentials for  SellerAccount
 
 
 
 @SellerAccountSingleLocationwithLicence 
 Scenario Outline:Sucessful Seller Registration with valid credentials1
 Given : User navigates to the website myapp.pallettrader.com for SellerAccount1
When : User Enter the signup page for SellerAccount1
When : User Enter the Registration form for SellerAccount1
When : User Enter the valid UserName for SellerAccount1 
When : User Enter the valid EmailId for SellerAccount1
When : User Enter the valid PassWord for SellerAccount1
When : User Enter the valid Conform Password for SellerAccount1
When : User Enter the valid CompanyName for SellerAccount1
When : User Enter the valid Cell Phone Number for SellerAccount1
When : User Enter the valid Address1 Name for SellerAccount1
When : User Enter the valid Address2 Name for SellerAccount1
When : User Enter the valid  City Name for SellerAccount1
When : User Enter DropDown  and Select State for SellerAccount1
When : User Enter the valid locationZipCode for SellerAccount1
#When : User Enter the Promo Code or Referral Code for SellerAccount1
#When : User Click on the apply button for SellerAccount1
#When : User Sumbit the popup alert5 for SellerAccount1
#When : User acknowledged that this promo code for SellerAccount1
When : User Enter the SumbitButton for SellerAccount1
When : User Enter the valid OTP in popup Screen for SellerAccount1
When : User Enter the GreenSumbitButton for SellerAccount1
Then : User verified EmaiId for SellerAccount1
When : User Enter the Not Register for  the Broker for SellerAccount1
When : User Enter the Not Register for  the Buyer for SellerAccount1
When : User Enter the register for this platform to seller pallets1 
When : User Enter the company operate  Single location for SellerAccount1
When : User Enter the BusinessInformationWithLICENSE for SellerAccount1
When : User Enter the Valid Driver's License Number for SellerAccount1
When : User Click On the Drivers License State Drop down for SellerAccount1
When : User Select the Drivers License State for SellerAccount1
When : User Enter the valid First Name for SellerAccount1
When : User Enter the valid Last Name for SellerAccount1
When : User Enter the valid Date of Birth  for Buyer SellerAccount1
When : User Upload the valid Driver's License for SellerAccount1
When : User Enter the BusinessURL for SellerAccount1
When : User Enter the BusinessDescription for SellerAccount1
When : User Enter the BuyerPaymentInformation for SellerAccount1
When : User Enter the Name on the Card for SellerAccount1
When : User Enter the valid Card Number for SellerAccount1
When : User Enter the valid Expiration Date for SellerAccount1
When : User Enter the valid Expiration Date for SellerAccount1
When : User Enter the valid CVC/CVV Number for SellerAccount1
When : User Enter the validate BuyersPaymentInformation for SellerAccount1
When : User Sumbit the popup alert for SellerAccount1
When : User Enter the MembershipPaymentInformation with NameOnTheCard for SellerAccount1
When : User Enter the valid Card Number for MembershipPayment for SellerAccount1
When : User Enter the valid Expiration Date for MembershipPayment for SellerAccount1
When : User Enter the valid CVC/CVV Number for MembershipPayment for SellerAccount1
When : User Enter the validate MembershipPaymentInformation for SellerAccount1
When : User Sumbit the popup alert2 for SellerAccount1
When : User Enter the Next Step for SellerAccount1
When : User Accept Subscription Fee for SellerAccount1
When : User Acknowledged and Agree for SellerAccount1
When : User Enter the Sumbit Button1 for SellerAccount for SellerAccount 1
Then : User Sucessfully Registered With Valid Credentials for  SellerAccount1 
 
@SellerAccountMultiplelocationwithCentralizedPayment   
 Scenario Outline:Sucessful Seller Registration with valid credentials2
 Given : User navigates to the website myapp.pallettrader.com for SellerAccount2 
When : User Enter the signup page for SellerAccount2
When : User Enter the Registration form for SellerAccount2
When : User Enter the valid UserName for SellerAccount2
When : User Enter the valid EmailId for SellerAccount2
When : User Enter the valid PassWord for SellerAccount2
When : User Enter the valid Conform Password for SellerAccount2
When : User Enter the valid CompanyName for SellerAccount2
When : User Enter the valid Cell Phone Number for SellerAccount2
When : User Enter the valid Address1 Name for SellerAccount2
When : User Enter the valid Address2 Name for SellerAccount2
When : User Enter the valid  City Name for SellerAccount2
When : User Enter DropDown  and Select State for SellerAccount2
When : User Enter the valid locationZipCode for SellerAccount2
#When : User Enter the Promo Code or Referral Code for SellerAccount2
#When : User Click on the apply button for SellerAccount2
#When : User Sumbit the popup alert5 for SellerAccount2
#When : User acknowledged that this promo code for SellerAccount2
When : User Enter the SumbitButton for SellerAccount2
When : User Enter the valid OTP in popup Screen for SellerAccount2
When : User Enter the GreenSumbitButton for SellerAccount2
Then : User verified EmaiId for SellerAccount2
When : User Enter the Not Register for  the Broker for SellerAccount2
When : User Enter the Not Register for  the Buyer for SellerAccount2
When : User Enter the register for this platform to seller pallets2
When : User Enter the company operate  multiple locations for SellerAccount2
When : User Enter the Payment options and select the Centralized Paymentfor SellerAccount2
When : User Enter the Valid TaxId for SellerAccount2
When : User Enter the Valid DNB/DUNS for SellerAccount2
When : User Enter the BusinessURL for SellerAccount2
When : User Enter the BusinessDescription for SellerAccount2
When : User Enter the BuyerPaymentInformation for SellerAccount2
When : User Enter the Name on the Card for SellerAccount2
When : User Enter the valid Card Number for SellerAccount2
When : User Enter the valid Expiration Date for SellerAccount2
When : User Enter the valid Expiration Date for SellerAccount2
When : User Enter the valid CVC/CVV Number for SellerAccount2
When : User Enter the validate BuyersPaymentInformation for SellerAccount2
When : User Sumbit the popup alert for SellerAccount2
When : User Enter the MembershipPaymentInformation with NameOnTheCard for SellerAccount2
When : User Enter the valid Card Number for MembershipPayment for SellerAccount2
When : User Enter the valid Expiration Date for MembershipPayment for SellerAccount2
When : User Enter the valid CVC/CVV Number for MembershipPayment for SellerAccount2
When : User Enter the validate MembershipPaymentInformation for SellerAccount2
When : User Sumbit the popup alert2 for SellerAccount2
When : User Enter the Next Step for SellerAccount2
When : User Accept Subscription Fee for SellerAccount2
When : User Acknowledged and Agree for SellerAccount2
When : User Enter the Sumbit Button1 for SellerAccount for SellerAccount2   
    
    
    
 @BuyerAndSellerAccountSingleLocationWithTaxID
  Scenario Outline: Sucessful BuyerAndSeller Registration with valid credentials
Given : User navigates to the website myapp.pallettrader.com for BuyerAndSellerAccount 
When : User Enter the signup page for BuyerAndSellerAccount 
When : User Enter the Registration form for BuyerAndSellerAccount 
When : User Enter the valid UserName for BuyerAndSellerAccount 
When : User Enter the valid EmailId for BuyerAndSellerAccount 
When : User Enter the valid PassWord for BuyerAndSellerAccount 
When : User Enter the valid Conform Password for BuyerAndSellerAccount 
When : User Enter the valid CompanyName for BuyerAndSellerAccount 
When : User Enter the valid Cell Phone Number for BuyerAndSellerAccount 
When : User Enter the valid Address1 Name for BuyerAndSellerAccount 
When : User Enter the valid Address2 Name for BuyerAndSellerAccount 
When : User Enter the valid  City Name for BuyerAndSellerAccount 
When : User Enter DropDown  and Select State for BuyerAndSellerAccount 
When : User Enter the valid locationZipCode for BuyerAndSellerAccount 
#When : User Enter the Promo Code or Referral Code for BuyerAndSellerAccount 
#When : User Click on the apply button for BuyerAndSellerAccount 
#When : User Sumbit the popup alert5 for BuyerAndSellerAccount 
#When : User acknowledged that this promo code for BuyerAndSellerAccount 
When : User Enter the SumbitButton for BuyerAndSellerAccount 
When : User Enter the valid OTP in popup Screen for BuyerAndSellerAccount 
When : User Enter the GreenSumbitButton for BuyerAndSellerAccount 
Then : User verified EmaiId for BuyerAndSellerAccount 
When : User Enter the Not Register for  the Broker for BuyerAndSellerAccount 
When : User Enter the register for this platform to BuyerPallets for BuyerAndSellerAccount 
When : User Enter the register for this platform to SellerPallets for BuyerAndSellerAccount 
When : User Enter the company operate  Single location for BuyerAndSellerAccount 
When : User Enter the Valid TaxId for BuyerAndSellerAccount 
When : User Enter the Valid DNB/DUNS for BuyerAndSellerAccount 
When : User Enter the BusinessURL for BuyerAndSellerAccount 
When : User Enter the BusinessDescription for BuyerAndSellerAccount 
When : User Enter the SellersRemittance Information for BuyerAndSellerAccount 
When : User Enter the Name on the Card for BuyerAndSellerAccount 
When : User Enter the valid Card Number for BuyerAndSellerAccount 
When : User Enter the valid Expiration Date for BuyerAndSellerAccount 
When : User Enter the valid Expiration Date for BuyerAndSellerAccount 
When : User Enter the valid CVC/CVV Number for BuyerAndSellerAccount 
When : User Enter the validate SellerRemittance Information for BuyerAndSellerAccount 
When : User Sumbit the popup alert for BuyerAndSellerAccount 
When : User Enter the BuyerPaymentInformation for BuyerAndSellerAccount 
When : User Enter the Name on the Card1 for BuyerAndSellerAccount 
When : User Enter the valid Card Number1 for BuyerAndSellerAccount 
When : User Enter the valid Expiration Date1 for BuyerAndSellerAccount 
When : User Enter the valid Expiration Date1 for BuyerAndSellerAccount 
When : User Enter the valid CVC/CVV Number1 for BuyerAndSellerAccount 
When : User Enter the validate BuyersPaymentInformation for BuyerAndSellerAccount 
When : User Sumbit the popup alert1 for BuyerAndSellerAccount 
When : User Enter the MembershipPaymentInformation with NameOnTheCard for BuyerAndSellerAccount 
When : User Enter the valid Card Number for MembershipPayment for BuyerAndSellerAccount 
When : User Enter the valid Expiration Date for MembershipPayment for BuyerAndSellerAccount 
When : User Enter the valid CVC/CVV Number for MembershipPayment for BuyerAndSellerAccount 
When : User Enter the validate MembershipPaymentInformation for BuyerAndSellerAccount 
When : User Sumbit the popup alert2 for BuyerAndSellerAccount 
When : User Enter the Next Step for BuyerAndSellerAccount 
When : User Accept Subscription Fee for BuyerAndSellerAccount 
When : User Acknowledged and Agree for BuyerAndSellerAccount 
When : User Enter the Sumbit Button1 for BuyerAndSellerAccount 
Then : User Sucessfully Registered With Valid Credentials for BuyerAndSellerAccount 

 
 
 @BuyerAndSellerAccountSingleLocationwithLicence 
Scenario Outline: Sucessful BuyerAndSeller Registration with valid credentials1
Given : User navigates to the website myapp.pallettrader.com for BuyerAndSellerAccount1 
When : User Enter the signup page for BuyerAndSellerAccount1 
When : User Enter the Registration form for BuyerAndSellerAccount1 
When : User Enter the valid UserName for BuyerAndSellerAccount1 
When : User Enter the valid EmailId for BuyerAndSellerAccount1
When : User Enter the valid PassWord for BuyerAndSellerAccount1 
When : User Enter the valid Conform Password for BuyerAndSellerAccount1 
When : User Enter the valid CompanyName for BuyerAndSellerAccount1 
When : User Enter the valid Cell Phone Number for BuyerAndSellerAccount1 
When : User Enter the valid Address1 Name for BuyerAndSellerAccount1 
When : User Enter the valid Address2 Name for BuyerAndSellerAccount1 
When : User Enter the valid  City Name for BuyerAndSellerAccount1 
When : User Enter DropDown  and Select State for BuyerAndSellerAccount1 
When : User Enter the valid locationZipCode for BuyerAndSellerAccount1 
#When : User Enter the Promo Code or Referral Code for BuyerAndSellerAccount1 
#When : User Click on the apply button for BuyerAndSellerAccount1 
#When : User Sumbit the popup alert5 for BuyerAndSellerAccount1 
#When : User acknowledged that this promo code for BuyerAndSellerAccount1 
When : User Enter the SumbitButton for BuyerAndSellerAccount1 
When : User Enter the valid OTP in popup Screen for BuyerAndSellerAccount1 
When : User Enter the GreenSumbitButton for BuyerAndSellerAccount1 
Then : User verified EmaiId for BuyerAndSellerAccount1 
When : User Enter the Not Register for  the Broker for BuyerAndSellerAccount1 
When : User Enter the register for this platform to BuyerPallets for BuyerAndSellerAccount1 
When : User Enter the register for this platform to SellerPallets for BuyerAndSellerAccount1 
When : User Enter the company operate  Single location for BuyerAndSellerAccount1 
When : User Enter the BusinessInformationWithLICENSE for BuyerAndSellerAccount1
When : User Enter the Valid Driver's License Number for BuyerAndSellerAccount1
When : User Click On the Drivers License State Drop down for BuyerAndSellerAccount1
When : User Select the Drivers License State for BuyerAndSellerAccount1
When : User Enter the valid First Name for BuyerAndSellerAccount1
When : User Enter the valid Last Name for BuyerAndSellerAccount1
When : User Enter the valid Date of Birth  for BuyerAndSellerAccount1
When : User Upload the valid Driver's License for BuyerAndSellerAccount1
When : User Enter the BusinessURL for BuyerAndSellerAccount1
When : User Enter the BusinessDescription for BuyerAndSellerAccount1
When : User Enter the SellersRemittance Information for BuyerAndSellerAccount1 
When : User Enter the Name on the Card for BuyerAndSellerAccount1 
When : User Enter the valid Card Number for BuyerAndSellerAccount1
When : User Enter the valid Expiration Date for BuyerAndSellerAccount1 
When : User Enter the valid Expiration Date for BuyerAndSellerAccount1 
When : User Enter the valid CVC/CVV Number for BuyerAndSellerAccount1 
When : User Enter the validate SellerRemittance Information for BuyerAndSellerAccount1 
When : User Sumbit the popup alert for BuyerAndSellerAccount1 
When : User Enter the BuyerPaymentInformation for BuyerAndSellerAccount1
When : User Enter the Name on the Card1 for BuyerAndSellerAccount1 
When : User Enter the valid Card Number1 for BuyerAndSellerAccount1 
When : User Enter the valid Expiration Date1 for BuyerAndSellerAccount1 
When : User Enter the valid Expiration Date1 for BuyerAndSellerAccount1 
When : User Enter the valid CVC/CVV Number1 for BuyerAndSellerAccount1 
When : User Enter the validate BuyersPaymentInformation for BuyerAndSellerAccount1 
When : User Sumbit the popup alert1 for BuyerAndSellerAccount1 
When : User Enter the MembershipPaymentInformation with NameOnTheCard for BuyerAndSellerAccount1 
When : User Enter the valid Card Number for MembershipPayment for BuyerAndSellerAccount1 
When : User Enter the valid Expiration Date for MembershipPayment for BuyerAndSellerAccount1 
When : User Enter the valid CVC/CVV Number for MembershipPayment for BuyerAndSellerAccount1 
When : User Enter the validate MembershipPaymentInformation for BuyerAndSellerAccount1 
When : User Sumbit the popup alert2 for BuyerAndSellerAccount1 
When : User Enter the Next Step for BuyerAndSellerAccount1 
When : User Accept Subscription Fee for BuyerAndSellerAccount1 
When : User Acknowledged and Agree for BuyerAndSellerAccount1 
When : User Enter the Sumbit Button1 for BuyerAndSellerAccount1 
Then : User Sucessfully Registered With Valid Credentials for BuyerAndSellerAccount1



@BuyerandSellerAccountMultiplelocationwithIndependentPayment
Scenario Outline: Sucessful BuyerAndSeller Registration with valid credentials2
Given : User navigates to the website myapp.pallettrader.com for BuyerAndSellerAccount2 
When : User Enter the signup page for BuyerAndSellerAccount2 
When : User Enter the Registration form for BuyerAndSellerAccount2 
When : User Enter the valid UserName for BuyerAndSellerAccount2 
When : User Enter the valid EmailId for BuyerAndSellerAccount2 
When : User Enter the valid PassWord for BuyerAndSellerAccount2 
When : User Enter the valid Conform Password for BuyerAndSellerAccount2 
When : User Enter the valid CompanyName for BuyerAndSellerAccount2 
When : User Enter the valid Cell Phone Number for BuyerAndSellerAccount2 
When : User Enter the valid Address1 Name for BuyerAndSellerAccount2 
When : User Enter the valid Address2 Name for BuyerAndSellerAccount2 
When : User Enter the valid  City Name for BuyerAndSellerAccount2 
When : User Enter DropDown  and Select State for BuyerAndSellerAccount2 
When : User Enter the valid locationZipCode for BuyerAndSellerAccount2 
#When : User Enter the Promo Code or Referral Code for BuyerAndSellerAccount2 
#When : User Click on the apply button for BuyerAndSellerAccount2 
#When : User Sumbit the popup alert5 for BuyerAndSellerAccount2 
#When : User acknowledged that this promo code for BuyerAndSellerAccount2 
When : User Enter the SumbitButton for BuyerAndSellerAccount2 
When : User Enter the valid OTP in popup Screen for BuyerAndSellerAccount2 
When : User Enter the GreenSumbitButton for BuyerAndSellerAccount2 
Then : User verified EmaiId for BuyerAndSellerAccount2 
When : User Enter the Not Register for  the Broker for BuyerAndSellerAccount2 
When : User Enter the register for this platform to BuyerPallets for BuyerAndSellerAccount2 
When : User Enter the register for this platform to SellerPallets for BuyerAndSellerAccount2 
When : User Enter the company operate  Multiple location for BuyerAndSellerAccount2 
When : User Enter the Payment options and click the independent payment for BuyerAndSellerAccount2 
When : User Enter the Valid TaxId for BuyerAndSellerAccount for BuyerAndSellerAccount2 
When : User Enter the Valid DNB/DUNS for BuyerAndSellerAccount for BuyerAndSellerAccount2
When : User Enter the BusinessURL for BuyerAndSellerAccount for BuyerAndSellerAccount2
When : User Enter the BusinessDescription for BuyerAndSellerAccount2 
When : User Enter the SellersRemittance Information for BuyerAndSellerAccount2 
When : User Enter the Name on the Card for BuyerAndSellerAccount2 
When : User Enter the valid Card Number for BuyerAndSellerAccount2 
When : User Enter the valid Expiration Date for BuyerAndSellerAccount2 
When : User Enter the valid Expiration Date for BuyerAndSellerAccount2 
When : User Enter the valid CVC/CVV Number for BuyerAndSellerAccount2 
When : User Enter the validate SellerRemittance Information for BuyerAndSellerAccount2 
When : User Sumbit the popup alert for BuyerAndSellerAccount2 
When : User Enter the BuyerPaymentInformation for BuyerAndSellerAccount2 
When : User Enter the Name on the Card1 for BuyerAndSellerAccount2 
When : User Enter the valid Card Number1 for BuyerAndSellerAccount2 
When : User Enter the valid Expiration Date1 for BuyerAndSellerAccount2 
When : User Enter the valid Expiration Date1 for BuyerAndSellerAccount2 
When : User Enter the valid CVC/CVV Number1 for BuyerAndSellerAccount2 
When : User Enter the validate BuyersPaymentInformation for BuyerAndSellerAccount2 
When : User Sumbit the popup alert1 for BuyerAndSellerAccount2 
When : User Enter the MembershipPaymentInformation with NameOnTheCard for BuyerAndSellerAccount2 
When : User Enter the valid Card Number for MembershipPayment for BuyerAndSellerAccount2 
When : User Enter the valid Expiration Date for MembershipPayment for BuyerAndSellerAccount2 
When : User Enter the valid CVC/CVV Number for MembershipPayment for BuyerAndSellerAccount2 
When : User Enter the validate MembershipPaymentInformation for BuyerAndSellerAccount2 
When : User Sumbit the popup alert2 for BuyerAndSellerAccount2
When : User Enter the Next Step for BuyerAndSellerAccount2 
When : User Accept Subscription Fee for BuyerAndSellerAccount2 
When : User Acknowledged and Agree for BuyerAndSellerAccount2 
When : User Enter the Sumbit Button1 for BuyerAndSellerAccount2 
Then : User Sucessfully Registered With Valid Credentials for BuyerAndSellerAccount2 
 
 
 
 
 
 
 
 
 @BuyerandSellerAccountMultiplelocationwithCentralizedPayment
 Scenario Outline: Sucessful BuyerAndSeller Registration with valid credentials3
Given : User navigates to the website myapp.pallettrader.com for BuyerAndSellerAccount3 
When : User Enter the signup page for BuyerAndSellerAccount3 
When : User Enter the Registration form for BuyerAndSellerAccount3 
When : User Enter the valid UserName for BuyerAndSellerAccount3 
When : User Enter the valid EmailId for BuyerAndSellerAccount3 
When : User Enter the valid PassWord for BuyerAndSellerAccount3 
When : User Enter the valid Conform Password for BuyerAndSellerAccount3 
When : User Enter the valid CompanyName for BuyerAndSellerAccount3 
When : User Enter the valid Cell Phone Number for BuyerAndSellerAccount3 
When : User Enter the valid Address1 Name for BuyerAndSellerAccount3 
When : User Enter the valid Address2 Name for BuyerAndSellerAccount3 
When : User Enter the valid  City Name for BuyerAndSellerAccount3 
When : User Enter DropDown  and Select State for BuyerAndSellerAccount3 
When : User Enter the valid locationZipCode for BuyerAndSellerAccount3 
#When : User Enter the Promo Code or Referral Code for BuyerAndSellerAccount3 
#When : User Click on the apply button for BuyerAndSellerAccount3 
#When : User Sumbit the popup alert5 for BuyerAndSellerAccount3 
#When : User acknowledged that this promo code for BuyerAndSellerAccount3 
When : User Enter the SumbitButton for BuyerAndSellerAccount3 
When : User Enter the valid OTP in popup Screen for BuyerAndSellerAccount3 
When : User Enter the GreenSumbitButton for BuyerAndSellerAccount3 
Then : User verified EmaiId for BuyerAndSellerAccount3 
When : User Enter the Not Register for  the Broker for BuyerAndSellerAccount3 
When : User Enter the register for this platform to BuyerPallets for BuyerAndSellerAccount3 
When : User Enter the register for this platform to SellerPallets for BuyerAndSellerAccount3 
When : User Enter the company operate  Multiple location for BuyerAndSellerAccount3 
When : User Enter the Payment options and click On the Centralized payment for BuyerAndSellerAccount3 
When : User Enter the Valid TaxId for BuyerAndSellerAccount for BuyerAndSellerAccount3 
When : User Enter the Valid DNB/DUNS for BuyerAndSellerAccount for BuyerAndSellerAccount3
When : User Enter the BusinessURL for BuyerAndSellerAccount for BuyerAndSellerAccount3
When : User Enter the BusinessDescription for BuyerAndSellerAccount3 
When : User Enter the SellersRemittance Information for BuyerAndSellerAccount3 
When : User Enter the Name on the Card for BuyerAndSellerAccount3 
When : User Enter the valid Card Number for BuyerAndSellerAccount3 
When : User Enter the valid Expiration Date for BuyerAndSellerAccount3 
When : User Enter the valid Expiration Date for BuyerAndSellerAccount3 
When : User Enter the valid CVC/CVV Number for BuyerAndSellerAccount3 
When : User Enter the validate SellerRemittance Information for BuyerAndSellerAccount3 
When : User Sumbit the popup alert for BuyerAndSellerAccount3
When : User Enter the BuyerPaymentInformation for BuyerAndSellerAccount3 
When : User Enter the Name on the Card1 for BuyerAndSellerAccount3 
When : User Enter the valid Card Number1 for BuyerAndSellerAccount3 
When : User Enter the valid Expiration Date1 for BuyerAndSellerAccount3 
When : User Enter the valid Expiration Date1 for BuyerAndSellerAccount3 
When : User Enter the valid CVC/CVV Number1 for BuyerAndSellerAccount3
When : User Enter the validate BuyersPaymentInformation for BuyerAndSellerAccount3 
When : User Sumbit the popup alert1 for BuyerAndSellerAccount3 
When : User Enter the MembershipPaymentInformation with NameOnTheCard for BuyerAndSellerAccount3 
When : User Enter the valid Card Number for MembershipPayment for BuyerAndSellerAccount3 
When : User Enter the valid Expiration Date for MembershipPayment for BuyerAndSellerAccount3 
When : User Enter the valid CVC/CVV Number for MembershipPayment for BuyerAndSellerAccount3 
When : User Enter the validate MembershipPaymentInformation for BuyerAndSellerAccount3 
When : User Sumbit the popup alert2 for BuyerAndSellerAccount3
When : User Enter the Next Step for BuyerAndSellerAccount3 
When : User Accept Subscription Fee for BuyerAndSellerAccount3 
When : User Acknowledged and Agree for BuyerAndSellerAccount3 
When : User Enter the Sumbit Button1 for BuyerAndSellerAccount3 
Then : User Sucessfully Registered With Valid Credentials for BuyerAndSellerAccount3 



@BuyerandSellerAccountMultiplelocationwithHybridPayment
Scenario Outline: Sucessful BuyerAndSeller Registration with valid credentials4
Given : User navigates to the website myapp.pallettrader.com for BuyerAndSellerAccount4 
When : User Enter the signup page for BuyerAndSellerAccount4 
When : User Enter the Registration form for BuyerAndSellerAccount4 
When : User Enter the valid UserName for BuyerAndSellerAccount4 
When : User Enter the valid EmailId for BuyerAndSellerAccount4 
When : User Enter the valid PassWord for BuyerAndSellerAccount4 
When : User Enter the valid Conform Password for BuyerAndSellerAccount4 
When : User Enter the valid CompanyName for BuyerAndSellerAccount4 
When : User Enter the valid Cell Phone Number for BuyerAndSellerAccount4 
When : User Enter the valid Address1 Name for BuyerAndSellerAccount4 
When : User Enter the valid Address2 Name for BuyerAndSellerAccount4 
When : User Enter the valid  City Name for BuyerAndSellerAccount4 
When : User Enter DropDown  and Select State for BuyerAndSellerAccount4 
When : User Enter the valid locationZipCode for BuyerAndSellerAccount4 
#When : User Enter the Promo Code or Referral Code for BuyerAndSellerAccount4 
#When : User Click on the apply button for BuyerAndSellerAccount4 
#When : User Sumbit the popup alert5 for BuyerAndSellerAccount4 
#When : User acknowledged that this promo code for BuyerAndSellerAccount4 
When : User Enter the SumbitButton for BuyerAndSellerAccount4 
When : User Enter the valid OTP in popup Screen for BuyerAndSellerAccount4 
When : User Enter the GreenSumbitButton for BuyerAndSellerAccount4 
Then : User verified EmaiId for BuyerAndSellerAccount4 
When : User Enter the Not Register for  the Broker for BuyerAndSellerAccount4 
When : User Enter the register for this platform to BuyerPallets for BuyerAndSellerAccount4 
When : User Enter the register for this platform to SellerPallets for BuyerAndSellerAccount4 
When : User Enter the company operate  Multiple location for BuyerAndSellerAccount4 
When : User Enter the Payment options and click On the Hybrid payment for BuyerAndSellerAccount4 
When : User Enter the Valid TaxId for BuyerAndSellerAccount for BuyerAndSellerAccount4 
When : User Enter the Valid DNB/DUNS for BuyerAndSellerAccount for BuyerAndSellerAccount4
When : User Enter the BusinessURL for BuyerAndSellerAccount for BuyerAndSellerAccount4
When : User Enter the BusinessDescription for BuyerAndSellerAccount4 
When : User Enter the SellersRemittance Information for BuyerAndSellerAccount4 
When : User Enter the Name on the Card for BuyerAndSellerAccount4 
When : User Enter the valid Card Number for BuyerAndSellerAccount4 
When : User Enter the valid Expiration Date for BuyerAndSellerAccount4 
When : User Enter the valid Expiration Date for BuyerAndSellerAccount4 
When : User Enter the valid CVC/CVV Number for BuyerAndSellerAccount4 
When : User Enter the validate SellerRemittance Information for BuyerAndSellerAccount4 
When : User Sumbit the popup alert for BuyerAndSellerAccount4
When : User Enter the BuyerPaymentInformation for BuyerAndSellerAccount4 
When : User Enter the Name on the Card1 for BuyerAndSellerAccount4 
When : User Enter the valid Card Number1 for BuyerAndSellerAccount4 
When : User Enter the valid Expiration Date1 for BuyerAndSellerAccount4 
When : User Enter the valid Expiration Date1 for BuyerAndSellerAccount4 
When : User Enter the valid CVC/CVV Number1 for BuyerAndSellerAccount4
When : User Enter the validate BuyersPaymentInformation for BuyerAndSellerAccount4 
When : User Sumbit the popup alert1 for BuyerAndSellerAccount4 
When : User Enter the MembershipPaymentInformation with NameOnTheCard for BuyerAndSellerAccount4 
When : User Enter the valid Card Number for MembershipPayment for BuyerAndSellerAccount4 
When : User Enter the valid Expiration Date for MembershipPayment for BuyerAndSellerAccount4 
When : User Enter the valid CVC/CVV Number for MembershipPayment for BuyerAndSellerAccount4 
When : User Enter the validate MembershipPaymentInformation for BuyerAndSellerAccount4 
When : User Sumbit the popup alert2 for BuyerAndSellerAccount4
When : User Enter the Next Step for BuyerAndSellerAccount4 
When : User Accept Subscription Fee for BuyerAndSellerAccount4 
When : User Acknowledged and Agree for BuyerAndSellerAccount4 
When : User Enter the Sumbit Button1 for BuyerAndSellerAccount4 
Then : User Sucessfully Registered4 










  
   