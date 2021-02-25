package com.bhiman.test.masters;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Banks;
import com.bhiman.main.masters.Brokers;
import com.bhiman.test.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokersTest extends BaseTest {
	private static final Logger LOG = Logger.getLogger(BanksTest.class);

	//Brokers broker=PageFactory.initElements(Constants.driver, Brokers.class);
	
	@Test(priority=-1, description="To verify whether 'Brokers' option is visible and clickable in Masters Tab or not.")
	public void toCheckBrokersOption() throws InterruptedException {
		LOG.info("Checking for Brokers option in Masters Tab After MouseHover");
		Brokers brokers=new Brokers();
		Thread.sleep(2000);
		brokers.mouseHoverToMastersForBrokersPage();
		Thread.sleep(2000);
		//Constants.driver.close();	
	}
	
	@Test( description="To verify functionality of Add Broker option. ", alwaysRun=true)
	public void clickingOnBrokersPageFromMasters() throws InterruptedException {
		LOG.info("Clicking on Add Broker from Masters Broker");
		Brokers brokers=new Brokers();
		String brokers_expectedUrl = "http://103.50.162.196/testing/broker.php#";
		brokers.mouseHoverToMastersForBrokersPage();
		Thread.sleep(2000);
		brokers.clickOnBrokers();
		Thread.sleep(2000);
		brokers.clickOnAddBroker();
		Thread.sleep(2000);
		String brokers_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(brokers_actualUrl, brokers_expectedUrl);
		//Constants.driver.close();		
	}
	
	@Test( description="Clicking on View Broker Button after clicked on Add Broker")
	public void clickOnViewBrokers() throws InterruptedException {
		LOG.info("Clicking on View Broker after clicked on Add Broker from Masters Broker");
		Brokers brokers=new Brokers();
		String brokers_expectedUrl = "http://103.50.162.196/testing/broker.php#";
		brokers.mouseHoverToMastersForBrokersPage();
		Thread.sleep(2000);
		brokers.clickOnBrokers();
		Thread.sleep(2000);
		brokers.clickOnAddBroker();
		Thread.sleep(2000);
		brokers.clickOnViewBrokers();
		String brokers_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(brokers_actualUrl, brokers_expectedUrl);
	}
	
	@Test( description="Clicking on Copy Button")
	public void clickOnCopyBtnOnBroker() throws InterruptedException {
		LOG.info("Clicking on Copy Button");
		Brokers brokers=new Brokers();
		brokers.mouseHoverToMastersForBrokersPage();
		Thread.sleep(2000);
		brokers.clickOnBrokers();
		Thread.sleep(2000);
		brokers.clickOnCopyAtBrokersPage();
		Thread.sleep(2000);
	}
	
	@Test(description="Clicking on Excel Button")
	public void clickOnExcelBtn() throws InterruptedException {
		LOG.info("Clicking on Excel Button");
		Brokers brokers=new Brokers();
		Thread.sleep(2000);
		brokers.mouseHoverToMastersForBrokersPage();
		Thread.sleep(2000);
		brokers.clickOnBrokers();
		Thread.sleep(2000);
		brokers.clickOnExcelBtnAtBrokersPage();
		Thread.sleep(2000);
	}
	
	@Test( description="Clicking on PDF Button")
	public void clickOnPDFBtn() throws InterruptedException {
		LOG.info("Clicking on PDF Button");
		Brokers brokers=new Brokers();
		Thread.sleep(2000);
		brokers.mouseHoverToMastersForBrokersPage();
		Thread.sleep(2000);
		brokers.clickOnBrokers();
		Thread.sleep(2000);
		brokers.clickOnPDFBtnAtBrokersPage();
		Thread.sleep(2000);
	}
	
	@Test( description="Clicking on Print Button")
	public void clickOnPrintBtn() throws InterruptedException {
		LOG.info("Clicking on PDF Button");
		Brokers brokers=new Brokers();
		Thread.sleep(2000);
		brokers.mouseHoverToMastersForBrokersPage();
		Thread.sleep(2000);
		brokers.clickOnBrokers();
		Thread.sleep(2000);
		brokers.clickOnPDFBtnAtBrokersPage();
		Thread.sleep(2000);
	}
	
}
