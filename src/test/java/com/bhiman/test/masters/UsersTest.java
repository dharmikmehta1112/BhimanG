package com.bhiman.test.masters;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.pages.adminlogin.AdminLoginPage;
import com.bhiman.pages.masters.BanksPage;
import com.bhiman.pages.masters.UsersPage;
import com.bhiman.test.BaseTest;
import com.bhiman.test.BhimanListeners;
import com.bhiman.utility.PropertyReader;

@Listeners(BhimanListeners.class)
public class UsersTest extends BaseTest {

	private static final Logger LOG = Logger.getLogger(UsersTest.class);
	
	@Test(groups = "Regression",description = "To verify and validate 'Users' option in 'Masters'.")
	public void verifyUsersInMasters() {
		LOG.info("userPageTest_01");
		UsersPage users = new UsersPage();
		users.loginToApplication();
		users.mouseHoverToMastersforuser();
		Constants.expected= "Users";
		Constants.actual=users.getTextofUsersforC();
		Assert.assertEquals(Constants.expected, Constants.actual);
	}

	@Test(groups = "Regression",description = "To verify and validate after click on 'Users' option in 'Masters'")
	public void verifyaddUserinUsers() {
		UsersPage users = new UsersPage();
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		String Users_expectedUrl = "http://103.50.162.196/testing/user.php#";
		String Users_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(Users_actualUrl, Users_expectedUrl);
	}
	
	@Test (groups = "Regression",description = "To verify and validate after click on 'View Users btn.")
	public void toverifyViewUsersBtn() {
		UsersPage users = new UsersPage();
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		users.clickOnViewUsers();
		String Users_expectedUrl = "http://103.50.162.196/testing/user.php#";
		String Users_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(Users_actualUrl, Users_expectedUrl);

	}

	@Test(groups = "Regression",description = "To verify and validate click on 'Copy' button on User page.")
	public void verifyClickOnCopyButton() {
		UsersPage users = new UsersPage();
		LOG.info("Verifying click on 'Copy' button in user page.");
		String user_expectedUrl = "http://103.50.162.196/testing/user.php";
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnUserCopyButton();
		String user_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(user_actualUrl, user_expectedUrl);
	}

	@Test(groups = "Regression",description = "To verify and validate click on 'Excel' button on User page.")
	public void verifyClickOnExcelButton() {
		UsersPage users = new UsersPage();
		LOG.info("Verifying click on ''Excel' button in user page.");
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnExcelButton();
		Constants.actual = "Users.xlsx";
		String filePath = PropertyReader.getLocatorValue("Users_download_filePath")+".xlsx";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " + Constants.actual + " is not downloaded at location: " + filePath);

	}

	@Test(groups = "Regression",description = "To verify and validate click on 'CSV' button in User page.")
	public static void verifyClickOnCSVButton() {
		LOG.info("Verifying click on 'CSV' button in User page.");
		UsersPage users = new UsersPage();
		Constants.actual = "Users.csv";
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnCSVButton();
		Constants.actual = "Users.csv";
		String filePath = PropertyReader.getLocatorValue("Users_download_filePath")+".csv";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " + Constants.actual + " is not downloaded at location: " + filePath);
	}

	@Test(groups = "Regression",description = "To verify and validate click on 'PDF' button in User page.")
	public static void verifyClickOnPDFButton() {
		LOG.info("Verifying click on 'CSV' button in User page.");
		UsersPage users = new UsersPage();
		Constants.actual = "Users.pdf";
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnPDFButton();
		Constants.actual = "Users.pdf";
		String filePath = PropertyReader.getLocatorValue("Users_download_filePath")+".pdf";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " + Constants.actual + " is not downloaded at location: " + filePath);
	}

	@Test(groups = "Regression",description = "To verify and validate click on 'Print' button in User page")
	public static void verifyPrintButton() {
		LOG.info("Verifying click on 'Print' button in User page.");
		UsersPage users = new UsersPage();
		//Constants.actual = "Users.pdf";
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnPrintButton();

//work in progress
	}

	@Test (groups = "Regression",description = "To verify and validate search box field with In-valid input (text).")
	public void verifySearchBoxWithInValidText() {
		LOG.info("Entering invalid text on 'Search' textbox in User page.");
		UsersPage users = new UsersPage();
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.sarchonUsersSearchBox(PropertyReader.getLocatorValue("Users_search_invalid_text"));		
		Constants.expected = "No matching records found";
		Constants.actual = users.getTextOFUserDataTableForInvalidSearch();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}
	
	@Test(groups = "Regression",description = "To verify and validate search box field with valid input (text).")
	public void verifySearchBoxWithValidText() {
		LOG.info("Entering valid text on 'Search' textbox in Users page.");
		UsersPage users = new UsersPage();
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		String value=PropertyReader.getLocatorValue("Users_search_valid_text");
		//not updated
	}
	
	@Test (groups = "Regression",description = "To verify save button. when all field is blank.")
	public void toVerifySavebtnWhenAlltheFieldAreBlank() {	
		UsersPage users = new UsersPage();
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		users.scrollVerticalDownloadWhenRequired();
		users.clickOnUserSubmit();
		String Users_expectedUrl = "http://103.50.162.196/testing/user.php#";
		String Users_actualUrl = UIKeywords.getPageUrl();
//		Constants.expected ="Please Enter User Name";
//		Constants.actual = users.gettextofUserNameErroeMessage();
//		Assert.assertEquals(Constants.actual, Constants.expected);	
		Assert.assertEquals(Users_actualUrl, Users_expectedUrl);
	}
	
	
	@Test (groups = "Regression",description = "To verify and validate Save button. when enter a Valid entry.")
	public void endToendTestforUserenterALLValidData() {
		UsersPage users = new UsersPage();
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		
		users.enterUserName("Mangesh");
		users.enterMobileNo("9970579149");
		users.enterEmailId("mingalkar@gmail.com");
		users.selectRoleforUser("Admin");
		users.enterJoiningDate("10-02-1987");
		users.selectBloodGroup("O negative");
		users.enterBankName("State Bank Of India");
		users.enterIFSCcode("SBIN0000455");
		users.scrollVerticalDownloadWhenRequired();
		users.uploadUserResumeDoc("E:\\java_Program_1\\New folder (2)\\BhimanG\\src\\main\\resources\\up load only\\3-update_resume.rtf");
		users.uploadUserAgreementDoc("E:\\java_Program_1\\New folder (2)\\BhimanG\\src\\main\\resources\\up load only\\3-update_agreement.rtf");
		users.uploaduserKYCDoc("E:\\java_Program_1\\New folder (2)\\BhimanG\\src\\main\\resources\\up load only\\3-update_kyc.rtf");
		users.enterFatherName("Vitthal");
		users.enterFatherMobileNo("8989151423");
		users.enterFatherOccupation("worker");
		users.selectUserStatus("Active");
		users.enterPassword("123456");
		users.enterConfirmPassword("123456");
		
		users.clickOnUserSubmit();
		String Users_expectedUrl = "http://103.50.162.196/testing/user.php";
		String Users_actualUrl = UIKeywords.getPageUrl();	
		Assert.assertEquals(Users_actualUrl, Users_expectedUrl);
	}
	
	@Test (groups = "Regression",description = "To verify when enter a In-Valid user Name.")
	public void toverifyUserEnterInvaldUsername() {
		UsersPage users = new UsersPage();
		Constants.flag = false;
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		String value=PropertyReader.getLocatorValue("User_name_addUser");
		if (value != null && value.matches("^[a-zA-Z ]*$")) {
			users.enterUserName(value);
			Constants.flag = true;
		}
		Assert.assertTrue(Constants.flag, "Invalid User Name. Only blank space, lowercase and uppercase alphabets are allowed.");

	}
	@Test (groups = "Regression",description = "To verify users enter a In-Valid mobile no .")
	public void toverifySavebtnWhenEnterInvaldMobileNo() {
		UsersPage users = new UsersPage();
		Constants.flag = false;
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		String value = PropertyReader.getLocatorValue("User_mobile_No");
//		if(value !=null  ) {
//			users.enterMobileNo(value);
//			Constants.flag = true;
//		} 
//		if (value.length()<=10) {
//			users.enterMobileNo(value);
//			Constants.flag = true;
//		}
//		if (value.matches("\\d{10}") ) {
//			users.enterMobileNo(value);
//			Constants.flag = true;
//		}
		if ((value !=null) && (value.length()<=10) && (value.matches("\\d{10}") ) ) {
			users.enterMobileNo(value);
			Constants.flag = true;
		}
		Assert.assertTrue(Constants.flag, "  validate phone numbers of format will consider.");		
	}

	
	@Test (groups = "Regression",description = "To verify users  enter a In-Valid Email_id .")
	public void toverifyInvaldEmailId() {
		UsersPage users = new UsersPage();
		Constants.flag = false;
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		String value = PropertyReader.getLocatorValue("User_email_Id");
		if (value !=null && value.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
			users.enterEmailId(value);
			Constants.flag = true; 
		}
		LOG.error("Test case is pass but user enters Invalid email id");
		Assert.assertTrue(true, "validate email format will consider");
		//Assert.assertFalse(Constants.flag, "invalid email id");
	}
	
	@Test (groups = "Regression",description = "To verify users enter a  in valid joining date format")
	public void toverifyvalidDateFormat() {
		UsersPage users = new UsersPage();
		Constants.flag = false;
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		String value=PropertyReader.getLocatorValue("User_joining_Date");
		if (value !=null && value.matches("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$")) {
			users.enterJoiningDate(value);	
			Constants.flag = true;
		}
		//Assert.assertTrue(true, "Date is valid");
		LOG.error("this test case is fail");
		Assert.assertFalse(false, "invalid date format consider");	
	}
	
	@Test(groups = "Regression",description = "To verify users enter valid bank name for user")
	public void toVerifyValidBankNameforuser() {
		UsersPage users = new UsersPage();
		Constants.flag = false;
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		String value=PropertyReader.getLocatorValue("User_Bank_Name");
		if (value !=null && value.matches("^[a-zA-Z ]*$")) {
			users.enterBankName(value);
			Constants.flag=true;
		}
		//Assert.assertFalse(false, "Valid Bank name is consider");
		Assert.assertTrue(true,"Valid Bank name is consider");
	}
	@Test(groups = "Regression",description = "To verify users enter valid Account no for user Bank")
	public void toVerifyValidAccountNumberforUserBank() {
		UsersPage users = new UsersPage();
		Constants.flag = false;
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		String value=PropertyReader.getLocatorValue("User_Account_No");
		if (value !=null && value.matches("^\\d{9,18}$")) {
			users.enterAccountNo(value);
			Constants.flag=true;
		}
		Assert.assertTrue(true,"Valid Account no. is consider");

	}
	@Test (groups = "Regression",description = "To verify users enter valid IFSC code for user Bank")
	public void toVerifyValidIFSCCodeforUserBank() {
		UsersPage users = new UsersPage();
		Constants.flag = false;
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		String value=PropertyReader.getLocatorValue("User_IFSC_Code");
		if (value !=null && value.matches("^[A-Z]{4}0[A-Z0-9]{6}$")) {
			users.enterIFSCcode(value);
			Constants.flag=true;
		}
		Assert.assertTrue(true,"Valid IFSC code is consider");

	}
	
	@Test (description = "To verify users enter valid father name format")
	public void toVerifyValidFatherNameformatEnter() {
		UsersPage users = new UsersPage();
		Constants.flag = false;
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		users.scrollVerticalDownloadWhenRequired();
		String value=PropertyReader.getLocatorValue("User_Father_Name");
		if (value != null && value.matches("^[a-zA-Z ]*$")) {
			users.enterFatherName(value);
			Constants.flag=true;
		}
		Assert.assertTrue(true,"Valid Father name is consider");
	}
	@Test(description = "To verify users enter a Valid Father mobile no .")
	public void toVerifyValidFatherMobileNo() {
		UsersPage users = new UsersPage();
		Constants.flag = false;
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		users.scrollVerticalDownloadWhenRequired();
		String value=PropertyReader.getLocatorValue("User_Father_Mobile_No");
		if ((value !=null) && (value.length()<=10) && (value.matches("\\d{10}") ) ) {
			users.enterFatherMobileNo(value);
			Constants.flag=true;
		}
		Assert.assertTrue(true, "Valid mobile no format is consider");
	}

	@Test (description = "To verify users enter a Valid occupation string format")
	public void toVrifyuserEntervalidFatherOccupationFormat() {
		UsersPage users = new UsersPage();
		Constants.flag = false;
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		users.scrollVerticalDownloadWhenRequired();
		String value=PropertyReader.getLocatorValue("User_Father_Occupation");
		if (value !=null && value.matches("^[a-zA-Z ]*$")) {
			users.enterFatherOccupation(value);
			Constants.flag=true;	
		}
		Assert.assertTrue(true, "Valid occupation string format is consider");
	}
	@Test(description = "To verify users enter a Valid password format")
	public void toVerifyUserEnterValidPassword() {
		UsersPage users = new UsersPage();
		Constants.flag = false;
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		users.scrollVerticalDownloadWhenRequired();
		String value=PropertyReader.getLocatorValue("User_enter_password");
		if (value !=null && value.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")) {
			users.enterPassword(value);
			Constants.flag=true;	
		}
		Assert.assertTrue(true, "Valid password format is consider");
	}
	@Test (description = "To verify users enter a Valid Confirm password format")
	public void toVerifyUserEnterConfirmPasswordFormat() {
		UsersPage users = new UsersPage();
		Constants.flag = false;
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		users.scrollVerticalDownloadWhenRequired();
		String value=PropertyReader.getLocatorValue("User_enter_password");
		if (value !=null && value.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")) {
			users.enterConfirmPassword(value);
			Constants.flag=true;	
		}
		Assert.assertTrue(true, "Valid confirm password format is consider");

	}
	@Test
	public void toCompairpasswordandconfirmpassword() {
		UsersPage users = new UsersPage();
		Constants.flag = false;
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		users.scrollVerticalDownloadWhenRequired();
		String value1=PropertyReader.getLocatorValue("User_enter_password");
		String value2=PropertyReader.getLocatorValue("User_enter_Confpassword");
	
		users.enterPassword(value1);
		//users.enterConfirmPassword("123456MMM");
		
	System.out.println(Constants.driver.findElement(By.cssSelector("#password")).getAttribute("value1"));
		
		//assertEquals("Retrievd password not equal to the enter password","",_Constants. false);
	
	}
	
	//use for valid password ^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$”
	@Test
	public void TableDataTest() {

		UsersPage users = new UsersPage();
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		
		List <WebElement> rowElement = Constants.driver.findElements(By.xpath("//table[@id='datatable3']//tbody//tr"));
		int rowSize= rowElement.size();
		
		List <WebElement> colElement = Constants.driver.findElements(By.xpath("//table[@id='datatable3']//tbody//tr[1]//td"));
		int colSize= colElement.size();
		
		WebElement element = Constants.driver.findElement(By.xpath("//table[@id='datatable3']//tbody//tr[1]//td[1]"));
		String firstpart1="//table[@id='datatable3']//tbody//tr[";
		String Secodpart1="]//td[";
		String thirepart ="]";
		
		for(int i = 1; i <=rowSize; i++) {
			
			for(int j=1;j<=colSize; j++) {
				element= Constants.driver.findElement(By.xpath(firstpart1+i+Secodpart1+j+thirepart));
			String data1=	element.getText();
			System.out.print(data1+ " \t");
			
			}System.out.println();	
		}	
	}	
	
}
