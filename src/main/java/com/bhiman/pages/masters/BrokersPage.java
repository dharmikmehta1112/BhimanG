package com.bhiman.pages.masters;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIAlerts;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.keywords.WaitsInHelp;
import com.bhiman.pages.adminlogin.AdminLoginPage;

public class BrokersPage extends UIKeywords{
	private static final Logger LOG = Logger.getLogger(BrokersPage.class);
	// Page Object Locators for Brokers page in Masters --> Intialize at runtime
	
	public BrokersPage() {
		PageFactory.initElements(Constants.driver, this);
	}

	@FindBy(xpath = "//span[text()='Masters']")
	private static WebElement masters;

	@FindBy(xpath = "//a[text()='Brokers']")
	private static WebElement brokers;

	@FindBy(css = "#add_btn")
	private static WebElement brokersAdd_broker;

	@FindBy(xpath = "//span[text()='Copy']")
	private static WebElement brokersCopy;

	@FindBy(xpath = "//span[text()='Excel']")
	private static WebElement brokersExcel;

	@FindBy(xpath = "//span[text()='CSV']")
	private static WebElement brokersCSV;

	@FindBy(xpath = "//span[text()='PDF']")
	private static WebElement brokersPDF;

	@FindBy(xpath = "//span[text()='Print']")
	private static WebElement brokersPrint;

	@FindBy(xpath = "//input[@type='search']")
	private static WebElement brokersSearchbox;
	
	@FindBy(xpath = "//td[text() = 'No matching records found']")
	private static WebElement brokersNoRecords;

	@FindBy(xpath = "//div[@class='dataTables_scrollBody']")
	private static WebElement brokersTableScroll;

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
	private static WebElement brokersView_brokers;

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
	
	@FindBy(xpath="//select[@id='status']")
	private static WebElement brokersStatus;
	
	@FindBy(name = "bank_name")
	private static WebElement brokersBank_name;

	@FindBy(name = "account_no")
	private static WebElement brokersAccount_no;

	@FindBy(xpath = "//input[@id='ifsc_code']")
	private static WebElement brokersIFSC_code;
	
	@FindBy(xpath="//input[@id='resume']")
	private static WebElement brokersResume;
	
	@FindBy(name="agreement")
	private static WebElement brokersAgreement;
	
	@FindBy(name="kyc")
	private static WebElement brokersKYC;
	
	@FindBy(xpath ="//input[@type='submit' and @name='add_user']")
	private static WebElement brokersSubmit;

	@FindBy(xpath = "//input[@value = 'Cancel']")
	private static WebElement brokersCancel;

	// Page Object Methods for Brokers page in Masters
	
	AdminLoginPage alp=new AdminLoginPage();
	
		public void mouseHoverToMastersForBrokersPage() {
			alp.login();
			LOG.info("Master->Brokers: Mouse Hover to Masters");
			WaitsInHelp.threadSleepInMilliSeconds(2000);
			UIKeywords.mouseHover(masters);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
			
			//UIKeywords.clickOnElement(brokers);
		}
		
		public String getTextOfBrokers() {
			LOG.info("Reading Brokers text after mouse hover to Masters.");
			return UIKeywords.getText(brokers);
		}
		public void clickOnBrokers() {
			LOG.info("Master->Brokers: Click on Brokers option under Masters");
			clickOnElement(brokers);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}
		
		public void clickOnCopyAtBrokersPage() {
			LOG.info("Master->Brokers: Click on Copy Button");
			clickOnElement(brokersCopy);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}
		
		public void clickOnExcelBtnAtBrokersPage() {
			LOG.info("Master->Brokers: Click on EXCEL Button");
			clickOnElement(brokersExcel);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}
		
		public void clickOnCSVBtnAtBrokersPage() {
			LOG.info("Master->Brokers: Click on CSV Button");
			clickOnElement(brokersCSV);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}
		
		public void clickOnPDFBtnAtBrokersPage() {
			LOG.info("Master->Brokers: Click on PDF Button");
			clickOnElement(brokersPDF);
		}
		
		public void clickOnPrintBtnAtBrokersPage() {
			LOG.info("Master->Brokers: Click on Print Button");
			clickOnElement(brokersPrint);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}
		
		public void clickOnAttachResume() {
			clickOnElement(brokersResume);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}
		
		public void enterTextInSearchBox(String enterText) {
			LOG.info("Entering text on search box of Brokers page");
			UIKeywords.enterText(brokersSearchbox, enterText);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}
		
		public String getTextForInvalidBrokersSearch() {
			LOG.info("Reading text from Broker data table for invalid search of Brokers page");
			WaitsInHelp.threadSleepInMilliSeconds(2000);
			return UIKeywords.getText(brokersNoRecords);
			
		}
		
		public void clickOnAddBroker() {
			LOG.info("Master->Brokers: Clicking on Add Broker button of Brokers page");
			clickOnElement(brokersAdd_broker);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}
		
		public void clickOnViewBrokers() {
			LOG.info("Master->Brokers: Click on View Brokers button of Add Broker page.");
			clickOnElement(brokersView_brokers);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}
		
		public void attachResume() {
			LOG.info("Attaching Resume to Add Broker form");
			brokersResume.sendKeys("F:\\Bhiman Requirements\\RESUME.docx");
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}
		
		public void attachAgreement() {
			LOG.info("Attaching Resume to Add Broker form");
			brokersAgreement.sendKeys("F:\\Bhiman Requirements\\Agreement.docx");
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}
		
		public void attachKYC() {
			LOG.info("Attaching KYC to Add Broker form");
			brokersKYC.sendKeys("F:\\Bhiman Requirements\\KYC.docx");
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}
		
		public void scrollPageOperation() throws InterruptedException {

			String javaScript = "window.scrollBy(0,1600);";
			JavascriptExecutor js = (JavascriptExecutor) Constants.driver;
			js.executeScript(javaScript);
		}

		
		public void fillAddBrokerForm() throws Exception {
			LOG.info("Adding values to Add Broker form");
			UIKeywords.enterText(brokersBroker_name, "MAG");
			UIKeywords.enterText(brokersMobile_no, "8765432109");
			UIKeywords.enterText(brokersBroker_address, "Amravati");
			UIKeywords.enterText(brokersJoining_date,"24-02-2021");
			UIKeywords.selectByTextFromDropdown(brokersBlood_group, "B positive");			
			UIKeywords.selectByTextFromDropdown(brokersStatus, "Active");
			scrollPageOperation();
			UIKeywords.enterText(brokersBank_name,"HDFC Bank");
			UIKeywords.enterText(brokersAccount_no, "12345678909");
			UIKeywords.enterText(brokersIFSC_code, "HDFC0000001");
			UIKeywords.enterText(brokersResume,Constants.basePath+"\\src\\main\\resources\\Bhiman Requirements\\RESUME.pdf");
			UIKeywords.enterText(brokersAgreement,Constants.basePath+"\\src\\main\\resources\\Bhiman Requirements\\Agreement.pdf");
			UIKeywords.enterText(brokersKYC,Constants.basePath+"\\src\\main\\resources\\Bhiman Requirements\\KYC.jpg");
			LOG.info("Values added to Add Broker form");
			WaitsInHelp.threadSleepInMilliSeconds(1000);
			
		}
		
		public void fillAddBrokerFormwithAutoIT() throws Exception {
			LOG.info("Adding values to Add Broker form");
			UIKeywords.enterText(brokersBroker_name, "MAG");
			UIKeywords.enterText(brokersMobile_no, "8765432109");
			UIKeywords.enterText(brokersBroker_address, "Amravati");
			UIKeywords.enterText(brokersJoining_date,"24-02-2021");
			UIKeywords.selectByTextFromDropdown(brokersBlood_group, "B positive");			
			UIKeywords.selectByTextFromDropdown(brokersStatus, "Active");
			scrollPageOperation();
			UIKeywords.enterText(brokersBank_name,"HDFC Bank");
			UIKeywords.enterText(brokersAccount_no, "12345678909");
			UIKeywords.enterText(brokersIFSC_code, "HDFC0000001");
			
			//UIKeywords.clickOnElement(brokersResume);
			//brokersResume.click();
			//WebElement brkResume=Constants.driver.findElement(By.xpath("//input[@id='resume']"));
			
			WaitsInHelp.threadSleepInMilliSeconds(1000);
			Actions act=new Actions(Constants.driver);
			act.moveToElement(brokersResume).click().build().perform();
			WaitsInHelp.threadSleepInMilliSeconds(2000);
			Runtime.getRuntime().exec(Constants.basePath+"\\src\\main\\resources\\AutoIT\\uploadResume.exe");
			
			WaitsInHelp.threadSleepInMilliSeconds(1000);
			act.moveToElement(brokersAgreement).click().build().perform();
			WaitsInHelp.threadSleepInMilliSeconds(1000);
			Runtime.getRuntime().exec(Constants.basePath+"\\src\\main\\resources\\AutoIT\\uploadAgreement.exe");
			
			WaitsInHelp.threadSleepInMilliSeconds(1000);
			act.moveToElement(brokersKYC).click().build().perform();
			WaitsInHelp.threadSleepInMilliSeconds(1000);
			Runtime.getRuntime().exec(Constants.basePath+"\\src\\main\\resources\\AutoIT\\uploadKYC.exe");
			
			LOG.info("Values added to Add Broker form");
			WaitsInHelp.threadSleepInMilliSeconds(1000);
			//WaitsInHelp.threadSleepInMilliSeconds(1000);
			//UIKeywords.scrollPageVerticalDown(4000);
			//UIKeywords.clickOnElement(brokersSubmit);
			//WaitsInHelp.threadSleepInMilliSeconds(2000);
		}


		
		public void clickOnSubmit() {
			LOG.info("Master->Brokers: Click on Submit button of Add Broker page.");
			UIKeywords.clickOnElement(brokersSubmit);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
			//UIAlerts.acceptAlert();
		}
		
		
		
		public void clickOnCancel() {
			LOG.info("Master->Brokers: Click on Cancel button of Add Broker page.");
			UIKeywords.clickOnElement(brokersCancel);
		}
		
}