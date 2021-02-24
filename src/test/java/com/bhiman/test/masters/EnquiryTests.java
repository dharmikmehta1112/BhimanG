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

	
	
	
	@Test
	public void tc_01() {
		Enquiry enquiry = new Enquiry();
		enquiry.goToEnquiryPage();
		Assert.assertTrue(Constants.driver.getCurrentUrl().contains("enquiry"));
		
		enquiry.clickOnAddEnquiry();
		
		enquiry.enterName("Fareen");
		enquiry.enterMobileNumber("1234567890");
		enquiry.enterPurpose("Visiting");
		enquiry.enterReference("Testing Shashtra");
		
		enquiry.submit();
		
		//Assert.assertEquals(enquiry.getName(), "Fareen");
	}
}

