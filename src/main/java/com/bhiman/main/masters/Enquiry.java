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
		
		   //Locator for  After click on Add Button in Enquire page.
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
		
		
		//Method for Enquire page in Masters
		public void goToEnquiryPage(){
			mouseHover(masters);
			clickOnElement(enquiry);
		}
		
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
		

}
