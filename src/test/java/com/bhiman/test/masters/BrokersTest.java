package com.bhiman.test.masters;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Banks;
import com.bhiman.main.masters.Brokers;
import com.bhiman.test.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokersTest {
	private static final Logger LOG = Logger.getLogger(BanksTest.class);

	Brokers broker=PageFactory.initElements(Constants.driver, Brokers.class);
	
	// @BeforeSuite
	// @Test

//	private void openChromeBrowser() {
//		WebDriverManager.chromedriver().setup();
//		Constants.driver=new ChromeDriver();
//		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Constants.driver.get("http://103.50.162.196/testing/user-login.php");
//		String currUrl=UIKeywords.getPageUrl();

	@Test
	private void selectBrokersPageFromMasters() {
		UIKeywords.openBrowser("CHROME");
		UIKeywords.openUrl("http://103.50.162.196/testing/user-login.php");

	}
}
