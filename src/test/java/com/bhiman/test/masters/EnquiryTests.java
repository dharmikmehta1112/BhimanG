package com.bhiman.test.masters;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bhiman.main.Constants;
import com.bhiman.main.masters.Enquiry;
import com.bhiman.test.BaseTest;
import com.bhiman.test.BhimanListeners;


@Listeners(BhimanListeners.class)
public class EnquiryTests extends BaseTest {

	private static final Logger LOG = Logger.getLogger(EnquiryTests.class);

	
	
	
	@Test(priority=1)
	public void tc_01() throws InterruptedException {
		Enquiry enquiry = new Enquiry();
		enquiry.goToEnquiryPage();
		Assert.assertTrue(Constants.driver.getCurrentUrl().contains("enquiry"));
		
		enquiry.clickOnAddEnquiry();
	
	
		
		enquiry.enterName("Fareen");
		enquiry.enterMobileNumber("9234567890");
		enquiry.enterPurpose("Visiting");
		enquiry.enterReference("Testing Shashtra");
		enquiry.submit();
		Thread.sleep(8000);
		enquiry.clickOnOkButton();
		Thread.sleep(5000);
		
		Assert.assertEquals(enquiry.getSavedName(), "Fareen");
		Assert.assertEquals(enquiry.getSavedMobileNumber(), "9234567890");
		Assert.assertEquals(enquiry.getSavedPurpose(), "Visiting");
		Assert.assertEquals(enquiry.getSavedReference(), "Testing Shashtra");

	}

        @Test(priority=3)
	public void tc_invalid01() throws InterruptedException {
		Enquiry enquiry = new Enquiry();
		enquiry.goToEnquiryPage();
		Assert.assertTrue(Constants.driver.getCurrentUrl().contains("enquiry"));
		
				enquiry.clickOnAddEnquiry();
				enquiry.enterName("Fareen");
				enquiry.enterMobileNumber("134234567890");
				Thread.sleep(8000);
				enquiry.clickOnCancelButton();
				Thread.sleep(8000);



				Assert.assertEquals(enquiry.getSavedName(), "Fareen");
				Assert.assertEquals(enquiry.getSavedMobileNumber(), "134234567890");
	} 
	
	@Test(priority=2)
	public void tc_05() throws InterruptedException {
		Enquiry enquiry = new Enquiry();
		enquiry.goToEnquiryPage();
		Assert.assertTrue(Constants.driver.getCurrentUrl().contains("enquiry"));
		
		Enquiry enquiry1 = new Enquiry();
		enquiry.goToEnquiryPage();
		Assert.assertTrue(enquiry.isCopyButtonDisplayed());

		Assert.assertTrue(enquiry.isExcelButtonDisplayed());
		Assert.assertTrue(enquiry.isCsvButtonDisplayed());
		Assert.assertTrue(enquiry.isPdfButtonDisplayed());
		Assert.assertTrue(enquiry.isPrintButtonDisplayed());

	}
}

