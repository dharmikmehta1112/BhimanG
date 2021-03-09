package com.bhiman.test.masters;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.apache.log4j.Logger;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.pages.masters.BrokersPage;
import com.bhiman.test.BaseTest;
import com.bhiman.utility.PropertyReader;



public class BrokersTest extends BaseTest {
	private static final Logger LOG = Logger.getLogger(BanksTest.class);

	//Brokers broker=PageFactory.initElements(Constants.driver, Brokers.class);
	//TC-01
	@Test(priority=-1, description="To verify whether 'Brokers' option is visible and clickable in Masters Tab or not.")
	public void toCheckBrokersOption()  {
		LOG.info("Checking for Brokers option in Masters Tab After MouseHover");
		BrokersPage brokers=new BrokersPage();
		brokers.mouseHoverToMastersForBrokersPage();
		//Constants.driver.close();	
	}
	
	//TC-02
	@Test( groups = {"Regression"}, description="To verify functionality of Add Broker option. ", alwaysRun=true)
	public void clickingOnBrokersPageFromMasters() {
		LOG.info("Clicking on Add Broker from Masters Broker");
		BrokersPage brokers=new BrokersPage();
		String brokers_expectedUrl = "http://103.50.162.196/testing/broker.php#";
		brokers.mouseHoverToMastersForBrokersPage();
		brokers.clickOnBrokers();
		brokers.clickOnAddBroker();
		String brokers_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(brokers_actualUrl, brokers_expectedUrl);
		//Constants.driver.close();		
	}
	
	//TC-03
	@Test( groups = {"Regression"}, description="Clicking on View Broker Button after clicked on Add Broker")
	public void clickOnViewBrokers() {
		LOG.info("Clicking on View Broker after clicked on Add Broker from Masters Broker");
		BrokersPage brokers=new BrokersPage();
		String brokers_expectedUrl = "http://103.50.162.196/testing/broker.php#";
		brokers.mouseHoverToMastersForBrokersPage();
		brokers.clickOnBrokers();
		brokers.clickOnAddBroker();
		brokers.clickOnViewBrokers();
		String brokers_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(brokers_actualUrl, brokers_expectedUrl);
	}
	
	//TC-04
	@Test( groups = {"Regression"}, description="Clicking on Copy Button")
	public void clickOnCopyBtnOnBroker() {
		LOG.info("Clicking on Copy Button");
		BrokersPage brokers=new BrokersPage();
		brokers.mouseHoverToMastersForBrokersPage();
		brokers.clickOnBrokers();
		brokers.clickOnCopyAtBrokersPage();
	}
	
	//TC-05
	@Test(groups = {"Regression"}, description="Clicking on Excel Button")
	public void clickOnExcelBtn() {
		LOG.info("Clicking on Excel Button");
		BrokersPage brokers=new BrokersPage();
		brokers.mouseHoverToMastersForBrokersPage();
		brokers.clickOnBrokers();
		brokers.clickOnExcelBtnAtBrokersPage();
		Constants.actual = "Brokers.xlsx";
		String brokersFilePath = "C:\\Users\\VINITA\\Downloads\\Brokers.xlsx";
		File file = new File(brokersFilePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +brokersFilePath);
	}
	
	//TC-06
	@Test( groups = {"Regression"}, description="Clicking on CSV Button")
	public void clickOnCSVBtn() {
		LOG.info("Clicking on CSV Button");
		BrokersPage brokers=new BrokersPage();
		brokers.mouseHoverToMastersForBrokersPage();
		brokers.clickOnBrokers();
		brokers.clickOnCSVBtnAtBrokersPage();
		Constants.actual = "Brokers.csv";
		String brokersFilePath = "C:\\Users\\VINITA\\Downloads\\Brokers.csv";
		File file = new File(brokersFilePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +brokersFilePath);
	}
	
	//TC-07
	@Test( groups = {"Regression"},  description="Clicking on PDF Button")
	public void clickOnPDFBtn() {
		LOG.info("Clicking on PDF Button");
		BrokersPage brokers=new BrokersPage();
		brokers.mouseHoverToMastersForBrokersPage();
		brokers.clickOnBrokers();
		brokers.clickOnPDFBtnAtBrokersPage();
		Constants.actual = "Brokers.pdf";
		String brokersFilePath = "C:\\Users\\VINITA\\Downloads\\Brokers.pdf";
		File file = new File(brokersFilePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +brokersFilePath);
	}
	
	//TC-08
	@Test( groups = {"Regression"}, description="Clicking on Print Button")
	public void clickOnPrintBtn() {
		LOG.info("Clicking on Print Button");
		BrokersPage brokers=new BrokersPage();
		brokers.mouseHoverToMastersForBrokersPage();
		brokers.clickOnBrokers();
		brokers.clickOnPrintBtnAtBrokersPage();
	}
	
	//TC-09
	@Test(groups = {"Regression"}, description = "To verify/validate functionality of search box with valid input.")
	public void searchBoxWithValidText() {
		LOG.info("Masters-->Brokers: Entering invalid text in Search box ");
		BrokersPage brokers=new BrokersPage();
		brokers.mouseHoverToMastersForBrokersPage();
		brokers.clickOnBrokers();
		brokers.enterTextInSearchBox(PropertyReader.getLocatorValue("brokers_search_valid_text"));
	}
		
	//TC-10
	@Test(groups = {"Regression"}, description = "To verify/validate functionality of search box with invalid input.")
	public void searchBoxWithInvalidText() {
		LOG.info("Masters-->Brokers: Entering invalid text in Search box ");
		BrokersPage brokers=new BrokersPage();
		brokers.mouseHoverToMastersForBrokersPage();
		brokers.clickOnBrokers();
		brokers.enterTextInSearchBox(PropertyReader.getLocatorValue("brokers_search_invalid_text"));
		Constants.expected = "No matching records found";
		Constants.actual = brokers.getTextForInvalidBrokersSearch();
		Assert.assertEquals(Constants.actual, Constants.expected);	
	}
	
	//TC-11
		@Test(description = "To verify/validate functionality of search box with invalid input.")
		public void fillAddBrokerFormTest() {
			LOG.info("Masters-->Brokers: Filling Add Broker Form ");
			BrokersPage brokers=new BrokersPage();
			brokers.mouseHoverToMastersForBrokersPage();
			brokers.clickOnBrokers();
			brokers.clickOnAddBroker();
			brokers.fillAddBrokerForm();
			//brokers.attachResume();
			brokers.clickOnSubmit();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
