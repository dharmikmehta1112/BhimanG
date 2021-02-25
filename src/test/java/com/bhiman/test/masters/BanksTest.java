package com.bhiman.test.masters;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bhiman.main.Constants;
import com.bhiman.main.UIAlerts;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Banks;
import com.bhiman.main.utility.PropertyReader;
import com.bhiman.test.BaseTest;
import com.bhiman.test.BhimanListeners;

@Listeners(BhimanListeners.class)
public class BanksTest extends BaseTest {
	
	private static final Logger LOG = Logger.getLogger(BanksTest.class);
	
//	Banks banks = PageFactory.initElements(Constants.driver, Banks.class);
	
	@Test (priority = 1, description = "To verify and validate 'Banks' option in 'Masters'.")
	public void verifyBanksInMasters() {
		LOG.info("Verify Banks option in Masters.");
		Banks banks = new Banks();
		banks.mouseHoverToMasters();
//		Assert.assertEquals("actual", "expected");
	}
	
	@Test(description = "To verify and validate after click on 'Banks' option in 'Masters'")
	public void verifyClickOnBanksInMasters() {
		LOG.info("Verify click on 'Banks' option in Masters");
		Banks banks = new Banks();
		banks.mouseHoverToMasters();
		banks.clickOnBanks();
		Constants.actual = UIKeywords.getPageUrl();
		Constants.expected = "http://103.50.162.196/testing/bank.php";
		Assert.assertEquals(Constants.actual, Constants.expected);
	}
	
	@Test(description = "To verify and validate click on 'Copy' button.")
	public void verifyClickOnCopyButton() {	
		LOG.info("Verifying click on 'Copy' button in Banks page.");
		Banks banks = new Banks();
		banks.mouseHoverToMasters();	
		banks.clickOnBanks();
		banks.clickOnCopyButton();
// To Do write code to assert
	}
		
	@Test(description = "To verify and validate click on 'Excel' button.")
	public static void verifyClickOnExcelButton() {
		LOG.info("Verifying click on 'Excel' button in Banks page.");
		Banks banks = new Banks();
		banks.mouseHoverToMasters();	
		banks.clickOnBanks();
		banks.clickOnExcelButton();
		Constants.actual = "Banks.xlsx";
		String filePath = "C:\\Users\\Lenovo\\Downloads\\Banks.xlsx";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +filePath);
	}
		
	@Test(description = "To verify and validate click on 'CSV' button.")
	public static void verifyClickOnCSVButton() {
		LOG.info("Verifying click on 'CSV' button in Banks page.");
		Banks banks = new Banks();
		Constants.actual = "Banks.csv";
		banks.mouseHoverToMasters();	
		banks.clickOnBanks();
		banks.clickOnCSVButton();
		Constants.actual = "Banks.csv";
		String filePath = "C:\\Users\\Lenovo\\Downloads\\Banks.csv";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +filePath);
	}

	@Test(description = "To verify and validate click on 'PDF' button.")
	public static void verifyClickOnPDFButton() {
		LOG.info("Verifying click on 'PDF' button in Banks page.");
		Banks banks = new Banks();
		Constants.actual = "Banks.pdf";
		banks.mouseHoverToMasters();	
		banks.clickOnBanks();
		banks.clickOnPDFButton();
		Constants.actual = "Banks.pdf";
		String filePath = "C:\\Users\\Lenovo\\Downloads\\Banks.pdf";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +filePath);
	}

	@Test(description = "To verify and validate click on 'Print' button.")
	public static void verifyClickOnPrintButton() {
		LOG.info("Verifying click on 'Print' button in Banks page.");
		Banks banks = new Banks();
		banks.mouseHoverToMasters();	
		banks.clickOnBanks();
		banks.clickOnPrintButton();
// To Do write code to assert		
	}
	
	@Test(description = "To verify and validate search box field with valid input (text).")
	public void verifySearchBoxWithValidText() {
		LOG.info("Entering valid text on 'Search' textbox in Banks page.");
		Banks banks = new Banks();
		banks.mouseHoverToMasters();	
		banks.clickOnBanks();
		banks.enterTextOnSearchBox(PropertyReader.getLocatorValue("banks_search_valid_text"));
// To Do write code to assert				
	}
	
	@Test(description = "To verify and validate search box field with invalid input (text).")
	public void verifySearchBoxWithInValidText() {
		LOG.info("Entering invalid text on 'Search' textbox in Banks page.");
		Banks banks = new Banks();
		banks.mouseHoverToMasters();	
		banks.clickOnBanks();
		banks.enterTextOnSearchBox(PropertyReader.getLocatorValue("banks_search_invalid_text"));
		Constants.expected = "No matching records found";
		Constants.actual = banks.getTextOFBanksDataTableForInvalidSearch();
		Assert.assertEquals(Constants.actual, Constants.expected);	
	}

	@Test(description = "To verify and validate click on 'Edit' icon on Banks Data Table.")
	public static void verifyClickOnEditIcon() {
		LOG.info("Verifying click on 'Edit' icon of Action column of Bank Data Table in Banks page.");
		Banks banks = new Banks();
		banks.mouseHoverToMasters();	
		banks.clickOnBanks();
		banks.clickOnEditIcon();
// To Do write code to assert		
	}
	
	@Test(description = "To verify and validate click on 'Delete' icon on Banks Data Table.")
	public static void verifyClickOnDeleteIcon() {
		LOG.info("Verifying click on 'Delete' icon of Action column of Bank Data Table in Banks page.");
		Banks banks = new Banks();
		banks.mouseHoverToMasters();	
		banks.clickOnBanks();
		banks.clickOnDeleteIcon();
		Constants.expected = "Are you sure you want to Delete the Bank Details?";
		Constants.actual = UIAlerts.getTextFromAlert();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}

	@Test(description = "To verify and validate click on 'Delete' icon on Banks Data Table and accept alert.")
	public static void verifyClickOnDeleteIconAndClickOKOnAlert() {
		LOG.info("Verifying to accept alert after click on 'Delete' icon of Action column of Bank Data Table in Banks page.");
		Banks banks = new Banks();
		banks.mouseHoverToMasters();	
		banks.clickOnBanks();
		banks.clickOnDeleteIcon();
		banks.clickOnOKInAlert();
		
// To Do write code to assert		
	}
	
	@Test(description = "To verify and validate click on 'Delete' icon on Banks Data Table and dismiss alert.")
	public static void verifyClickOnDeleteIconAndClickCancelOnAlert() {
		LOG.info("Verifying to dismiss alert after click on 'Delete' icon of Action column of Bank Data Table in Banks page.");
		Banks banks = new Banks();
		banks.mouseHoverToMasters();	
		banks.clickOnBanks();
		banks.clickOnDeleteIcon();
		banks.clickOnCancelInAlert();

// To Do write code to assert				
	}

	@Test (description = "To verify and validate click on 'Add Bank' buttton.")
	public void verifyClickOnAddBankButton() {
		LOG.info("Verifying click on 'Add Bank' button in Banks page.");
		Banks banks = new Banks();
		banks.mouseHoverToMasters();	
		banks.clickOnBanks();
		banks.clickOnAddBankButton();
		Constants.expected = "http://103.50.162.196/testing/bank.php#";
		Constants.actual = UIKeywords.getPageUrl();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}
	
	@Test (description = "To verify and validate the 'Bank Name' to accept input only small and big alphabets.")
	public static void verifyBankName() {
		LOG.info("Verifying input to 'Bank Name' to accept only small and big alphabets in Add Banks page.");
		Banks banks = new Banks();
		banks.mouseHoverToMasters();	
		banks.clickOnBanks();
		banks.clickOnAddBankButton();
		banks.enterBankName(PropertyReader.getLocatorValue("banks_addBank_bankName"));		
	}
	
	@Test (description = "To verify and validate the 'Account Name' to accept input only small and big alphabets.")
	public static void verifyAccountName() {
		LOG.info("Verifying input to 'Account Name' to accept only small and big alphabets in Add Banks page.");
		
		
		
	}

	@Test (description = "To verify and validate the 'Account No.' to accept input as 5 and more than 5 digits.")
	public static void verifyAccountNo() {
		LOG.info("Verifying input to 'Account No.' to accept input as 5 and more than 5 digits in Add Banks page.");
		
		
		
	}
	
	@Test (description = "To verify and validate the 'Bank Account Type' to select 'Savings'.")
	public void verifyBankAccountTypeToSelectSavings() {
		LOG.info("Verifying 'Bank Account Type' to select 'Savings' in Add Banks page.");
		
		
		
	}
	
	@Test (description = "To verify and validate the 'Bank Account Type' to select 'Current'.")
	public void verifyBankAccountTypeToSelectCurrent() {
		LOG.info("Verifying 'Bank Account Type' to select 'Current' in Add Banks page.");
		
		
		
	}

	@Test (description = "To verify and validate the 'IFSC Code' to accept input as alphanumeric values min = 8 and max = 12.")
	public static void verifyIFSCCode() {
		LOG.info("Verifying input to 'IFSC Code' to accept input as 8 and more than 8 alphanumeric values in Add Banks page.");
		
		
		
	}
	
	@Test (description = "To verify and validate the 'MICR Code' to accept input as only 9 alphanumeric values.")
	public static void verifyMICRCode() {
		LOG.info("Verifying input to 'MICR Code' to accept input as only 9 alphanumeric values in Add Banks page.");
		
		
		
	}	
			
	@Test (description = "To verify and validate click on 'View Bank' buttton.")
	public void verifyClickOnViewBankButton() {
		LOG.info("Verifying click on 'View Bank' button in Add Bank page.");

		
		Constants.expected = "http://103.50.162.196/testing/bank.php#";
		Constants.actual = UIKeywords.getPageUrl();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}
	
}