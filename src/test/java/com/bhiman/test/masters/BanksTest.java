package com.bhiman.test.masters;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Banks;
import com.bhiman.test.BaseTest;
import com.bhiman.test.BhimanListeners;

@Listeners(BhimanListeners.class)
public class BanksTest extends BaseTest {
	
	private static final Logger LOG = Logger.getLogger(BanksTest.class);
	
	Banks bank = PageFactory.initElements(Constants.driver, Banks.class);
	
	@Test
	public void tc_01() {
		String index_expectedUrl = "http://103.50.162.196/testing/index.php";
		String index_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(index_actualUrl, index_expectedUrl);
		LOG.info("At Index/Home page");
		bank.mouseHoverToMasters();
		bank.clickOnBanks();
		String banks_expectedUrl = "http://103.50.162.196/testing/bank.php";
		String banks_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(banks_actualUrl, banks_expectedUrl);
		LOG.info("At Bank page");
		Banks.clickOnAddBank();
		String addbank_expectedUrl = "http://103.50.162.196/testing/bank.php#";
		String addbank_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(addbank_actualUrl, addbank_expectedUrl);
//	Click on submit w/o enter any text
		LOG.info("At Add Bank page after click on AddBank button");
		Banks.clickOnViewBank();
		String viewbank_expectedUrl = "http://103.50.162.196/testing/bank.php#";
		String viewbank_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(viewbank_actualUrl, viewbank_expectedUrl);
		LOG.info("At Bank page after click on ViewBanks button");
		
		
	
		
		
		
		
	}

	
	
	
	
	
}
