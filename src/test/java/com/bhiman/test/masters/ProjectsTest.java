package com.bhiman.test.masters;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.pages.masters.ProjectsPage;
import com.bhiman.test.BaseTest;
import com.bhiman.utility.PropertyReader;

public class ProjectsTest extends BaseTest {
	
	private static final Logger LOG = Logger.getLogger(ProjectsTest.class);
	
	public ProjectsTest() {
		PageFactory.initElements(Constants.driver, this);
	}

	@Test(groups ="Regression", description= "To verify Projects option is visible under masters")
	public void verifyProjectsOptionUderMaster() throws IOException {
		LOG.info("Verifying Projects option is visible under masters");
		ProjectsPage project = new ProjectsPage();
		project.mouseHoverToMasters();
		project.clickOnProjectsUnderMaster();
		Constants.actual="Projects";
		Constants.expected=project.getTextOfProjectsUnderMaster();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}
	@Test(groups="Regression", description = "To verify and validate Projects options is clickable or not")
	 public void verifyClickOnProjectsOptionUnderMaster() {
		LOG.info("Verifying Projects option is clickable or not ");
		ProjectsPage project = new ProjectsPage();
		project.mouseHoverToMasters();
		project.clickOnProjectsUnderMaster();
		Constants.actual="http://103.50.162.196/testing/project.php";
		Constants.expected= UIKeywords.getPageUrl();
		Assert.assertEquals(Constants.actual, Constants.expected);
		 
	 }
	@Test(groups="Regression", description = "To verify and validate 'Copy' Button on Projects Page")
	public void verifyCopyButtonOfProjects() {
		LOG.info("Verifying Copy Button on Projects Page ");
		ProjectsPage project = new ProjectsPage();
		project.mouseHoverToMasters();
		project.clickOnProjectsUnderMaster();
		project.clickOnProjectcsCopyButton();
		
	}
	@Test(groups="Regression", description = "To verify and validate 'Excel' Button on Projects Page")
	public void verifyExcelButtonOfProjects() {
		LOG.info("Verifying Excel Button on Projects Page ");
		ProjectsPage project = new ProjectsPage();
		project.mouseHoverToMasters();
		project.clickOnProjectsUnderMaster();
		project.clickOnProjectcsExcelButton();
		Constants.actual = "Projects.xlsx";
		String filePath = PropertyReader.getLocatorValue("projects_download_filePath") + ".xlsx";
		File file = new File(filePath);
		Constants.flag=file.exists();
		Assert.assertTrue(Constants.flag, "File name: "+Constants.actual+" is not downloaded at location "+filePath);
		
	}
	@Test(groups="Regression", description = "To verify and validate 'CSV' Button on Projects Page")
	public void verifyCSVButtonOfProjects() {
		LOG.info("Verifying Copy Button on Projects Page ");
		ProjectsPage project = new ProjectsPage();
		project.mouseHoverToMasters();
		project.clickOnProjectsUnderMaster();
		project.clickOnProjectcsCSVButton();
		Constants.actual = "Projects.csv";
		String filePath = PropertyReader.getLocatorValue("projects_download_filePath") + ".csv";
		File file = new File(filePath);
		Constants.flag=file.exists();
//		boolean flag = Constants.flag;
//		LOG.info(flag);
		assertTrue(Constants.flag, "File name: "+Constants.actual+" is not downloaded at location "+filePath);
	}
	@Test(groups="Regression", description = "To verify and validate 'PDF' Button on Projects Page")
	public void verifyPDFButtonOfProjects() {
		LOG.info("Verifying PDF Button on Projects Page ");
		ProjectsPage project = new ProjectsPage();
		project.mouseHoverToMasters();
		project.clickOnProjectsUnderMaster();
		project.clickOnProjectcsPDFButton();
		Constants.actual = "Projects.pdf";
		String filePath = PropertyReader.getLocatorValue("projects_download_filePath") + ".pdf";
		File file = new File(filePath);
		Constants.flag=file.exists();
		Assert.assertTrue(Constants.flag, "File name: "+Constants.actual+" is not downloaded at location "+filePath);
		
	}
	@Test(groups="Regression", description = "To verify and validate 'Print' Button on Projects Page")
	public void verifyPrintButtonOfProjects() {
		LOG.info("Verifying Print Button on Projects Page ");
		ProjectsPage project = new ProjectsPage();
		project.mouseHoverToMasters();
		project.clickOnProjectsUnderMaster();
		project.clickOnProjectcsPrintButton();
		Constants.actual="about:blank";
		Constants.expected=project.getSwitchWindowURL();
		assertEquals(Constants.actual, Constants.expected);
	}
}
