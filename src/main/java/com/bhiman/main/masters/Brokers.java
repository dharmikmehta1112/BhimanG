package com.bhiman.main.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.log4testng.Logger;

import com.bhiman.main.UIKeywords;

public class Brokers {
	private static final Logger LOG = Logger.getLogger(Brokers.class);
	// Page Object Locators for Banks page in Masters --> Intialize at runtime

	@FindBy(xpath = "//span[text()='Masters']")
	private static WebElement masters;

	@FindBy(xpath = "//a[text()='Brokers']")
	private static WebElement brokers;

	@FindBy(css = "#add_btn")
	private static WebElement add_broker;

	@FindBy(xpath = "//span[text()='Copy']")
	private static WebElement brokersCopy;

	@FindBy(xpath = "//span[text()='Excel']")
	private static WebElement brokersExcel;

	@FindBy(xpath = "//span[text()='CSV']")
	private static WebElement csv;

	@FindBy(xpath = "//span[text()='PDF']")
	private static WebElement brokersPDF;

	@FindBy(xpath = "//span[text()='Print']")
	private static WebElement brokersPrint;

	@FindBy(xpath = "//input[@type='search']")
	private static WebElement brokersSearchbox;

	//Needs to edit XPATH as it works for 1st entry only.
	@FindBy(xpath="//button[@data-brokerid='1']")  
	private static WebElement brokesIdView;

	//Needs to edit XPATH as it works for 1st entry only.
	@FindBy(xpath = "//button[@class='btn btn-success btn-border btn-rounded btn-xs editBtn']")
	private static WebElement brokersIdEdit;
	
	//Needs to edit XPATH as it works for 1st entry only.
	@FindBy(xpath= "//button[@class='btn btn-danger btn-border btn-rounded btn-xs deleteBtn']") 
	private static WebElement brokersIdDelet;

	// Page Object Locators after click on Add Broker button in Brokers page

	@FindBy(xpath = "//a[text()='View Broker']")
	private static WebElement view_brokers;

	@FindBy(name="broker_name")
	private static WebElement brokersBroker_name;
	
	@FindBy(name="mobile_no")
	private static WebElement brokersMobile_no;
	
	@FindBy(xpath="//input[@id='broker_address']")
	private static WebElement brokersBroker_address;
	
	@FindBy(xpath="//input[@id='joining_date']")
	private static WebElement brokersJoining_date;
	
	@FindBy(xpath="//select[@id='blood_group']")
	private static WebElement brokersBlood_group;
	
	//@FindBy(name="")
	//private static WebElement
	
	@FindBy(name = "bank_name")
	private static WebElement brokersBank_name;

	@FindBy(name = "account_no")
	private static WebElement brokersAccount_no;

	@FindBy(xpath = "//input[@id='ifsc_code']")
	private static WebElement BrokersIFSC_code;

	@FindBy(xpath = "//input[@value = 'Submit']")
	private static WebElement submit;

	@FindBy(xpath = "//input[@value = 'Cancel']")
	private static WebElement cancel;

	
}
