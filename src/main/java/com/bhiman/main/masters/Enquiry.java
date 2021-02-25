package com.bhiman.main.masters;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;

public class Enquiry extends UIKeywords{
	private static final Logger LOG = Logger.getLogger(Enquiry.class);
	
	public Enquiry(){
		PageFactory.initElements(Constants.driver, this);
	}
	
	
	//  Locators for Enquire page in Masters 
		
		@FindBy(xpath ="//span[text()='Masters']")			 
		private static WebElement masters;
		
		@FindBy(xpath ="//a[text()='Enquiry']")
		private static WebElement enquiry;
		
		   //Locator for  After click on Add Button in Enquire valid page .
		@FindBy(id="add_btn")
		private static WebElement addButton;
		
		@FindBy(id="name")
		private static WebElement name;
		
		@FindBy(id="mobile_no")
		private static WebElement mobileNumber;
		
		@FindBy(id="purpose")
		private static WebElement purpose;
		
		@FindBy(id="reference")
		private static WebElement reference;
		
		@FindBy(name="enquiry_add")
		private static WebElement submitEnquiryButton;
		
		@FindBy(name="//input[@value='Cancel']")
		private static WebElement cancelEnquiryButton;
		
		@FindBy(xpath="//*[text()='OK']")
		private static WebElement okButton;
		
		@FindBy(xpath="(//*[@id='datatable3']//td[2])[1]")
		private static WebElement savedName;
		
		@FindBy(xpath ="(//*[@id='datatable3']//td[3])[1]")
		private static WebElement savedMobileNumber;
		
		@FindBy(xpath ="(//*[@id='datatable3']//td[4])[1]")
		private static WebElement savedPurpose;
		
		@FindBy(xpath="(//*[@id='datatable3']//td[5])[1]")
		private static WebElement savedReference;
		
//-------------------invalid Mobile number locator-------------------------------------------------------------
		
		@FindBy(id="name")
		private static WebElement invalidName;
		
		@FindBy(id="mobile_no-error")
		private static WebElement invalidMobileNumber;
		
		
//--------------------------------------------------------------------------------------		
		//Locator for enquire homePage on button(Copy,Excel,Csv,Pdf,Print)
		@FindBy(xpath = "//span[text()='Copy']")
		private static WebElement copyButton;

		@FindBy(xpath = "//span[text()='Excel']")
		private static WebElement excelButton;

		@FindBy(xpath = "//span[text()='CSV']")
		private static WebElement csvButton;

		@FindBy(xpath = "//span[text()='PDF']")
		private static WebElement pdfButton;

		@FindBy(xpath = "//span[text()='Print']")
		private static WebElement printButton;
		
		//Action button
		
		@FindBy(xpath = "//button[@data-id='18']")
		private static WebElement reNamebutton;
		
//----------------Search button-------------------------------------------------------------------
		@FindBy(xpath = "//input[@type='search']")
		private static WebElement searchButton;
		
//---------------Method for Enquire page in Masters----------------------------
		public void goToEnquiryPage(){
			mouseHover(masters);
			clickOnElement(enquiry);
		}
		
		//When click on addButton Method
		public void clickOnAddEnquiry(){
			clickOnElement(addButton);
		}
		
		public void enterName(String username){
			enterText(name, username);
		}
		
		public void enterMobileNumber(String mobileNo){
			enterText(mobileNumber, mobileNo);
		}
		
		public void enterPurpose(String purposeText){
			enterText(purpose, purposeText);
		}
		
		public void enterReference(String referenceText){
			enterText(reference, referenceText);
		}
		
		public void submit(){
			clickOnElement(submitEnquiryButton);
		}
		
		public String getSavedName(){
			return getText(savedName);
		}
		
		public String getSavedMobileNumber(){
			return getText(savedMobileNumber);
		}
		public String getSavedPurpose(){
			return getText(savedPurpose);
		}
		public String getSavedReference(){
			return getText(savedReference);
		}
		public void clickOnOkButton(){
			clickOnElement(okButton);
		}
		
		public void clickOnCancelButton(){
			clickOnElement(okButton);
		}
		
		//Method for button(copy,excel,csv,pdf,print)
		public Boolean isCopyButtonDisplayed(){
			return copyButton.isDisplayed();
		}
		
		public Boolean isExcelButtonDisplayed(){
			return excelButton.isDisplayed();
		}
		
		public Boolean isCsvButtonDisplayed(){
			return csvButton.isDisplayed();
		}
		
		public Boolean isPdfButtonDisplayed(){
			return pdfButton.isDisplayed();
		}
		
		public Boolean isPrintButtonDisplayed(){
			return printButton.isDisplayed();
		}
		
		
		//#mobile_no-error
		

}
