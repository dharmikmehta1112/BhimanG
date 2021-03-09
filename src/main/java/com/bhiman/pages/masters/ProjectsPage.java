package com.bhiman.pages.masters;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.keywords.WaitsInHelp;

public class ProjectsPage {
	
	private static final Logger LOG = Logger.getLogger(ProjectsPage.class);
	
	public ProjectsPage() {
		PageFactory.initElements(Constants.driver, this);
	}

	// Page Object Locators for Project page in Masters --> Intialize at runtime
	
	@FindBy(xpath="//span[text()='Masters']")
	private static WebElement masters;

	@FindBy(css="a[href='project.php']")
	private static WebElement projects_under_masters;

	@FindBy(id="add_btn")
	private static WebElement projects_addProjectBtn;

	@FindBy(xpath="//span[text()='Copy']")
	private static WebElement projects_copyBtn;

	@FindBy(xpath="//span[text()='Excel']")
	private static WebElement projects_excelBtn;

	@FindBy(xpath="//span[text()='CSV']")
	private static WebElement projects_csvBtn;

	@FindBy(xpath="//span[text()='PDF']")
	private static WebElement projects_pdfBtn;

	@FindBy(xpath="//span[text()='Print']")
	private static WebElement projects_printBtn;

	@FindBy(css="input[type='search']")
	private static WebElement projects_searchTxtBx;

	@FindBy(css="a[href='plots-manage.php?id=44']")
	private static WebElement projects_managePlotBtn;

	@FindBy(xpath="//*[@id='datatable3']/tbody/tr[1]/td[9]/button[1]")
	private static WebElement projects_enable_actionBtn;

	@FindBy(xpath="//*[@id='datatable3']/tbody/tr[2]/td[9]/button[1]")
	private static WebElement projects_complete_actionBtn;

	@FindBy(xpath="//*[@id='datatable3']/tbody/tr[1]/td[9]/button[2]/i")
	private static WebElement Projects_edit_actionBtn;

	@FindBy(xpath="//*[@id='datatable3']/tbody/tr[1]/td[9]/button[3]/i")
	private static WebElement projects_delete_actionBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	private static WebElement projects_OkBtn;

	@FindBy(xpath="//div[@class='dataTables_scrollBody']")
	private static WebElement projects_scrollBar;

	// Page Object Locators for Add Project page in Masters --> Intialize at runtime
	
	@FindBy(id="view_btn")
	private static WebElement projects_viewProjectsBtn;

	@FindBy(id="branch_id")
	private static WebElement projects_branchName;

	@FindBy(id="project_name")
	private static WebElement projects_projectName;

	@FindBy(id="no_of_plot")
	private static WebElement projects_noOfplots;

	@FindBy(id="total_area")
	private static WebElement projects_totalArea;

	@FindBy(id="rate")
	private static WebElement projects_rate;

	@FindBy(id="total_amount")
	private static WebElement projects_totalAmount;

	@FindBy(css="input[type='file']")
	private static WebElement projects_layout;

	@FindBy(id="na_order")
	private static WebElement projects_NAOrder;

	@FindBy(id="seven_by_twelve")
	private static WebElement project_7_12;

	@FindBy(css="input[type='submit']")
	private static WebElement projects_addProject_submitBtn;

	@FindBy(id="input[type='reset']")
	private static WebElement projects_addProject_cancleBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	private static WebElement projects_addProject_OkBtn;

	// Page Object Locators for Project Plot page in Masters --> Intialize at
	// runtime

	@FindBy(xpath="//a[@id='add_btn']")
	private static WebElement projects_addPlotsBtn;

	@FindBy(xpath="//span[text()='Copy']")
	private static WebElement projects_addPlot_copyBtn;

	@FindBy(xpath="//span[text()='Excel']")
	private static WebElement projects_addPlot_excelBtn;

	@FindBy(xpath="//span[text()='CSV']")
	private static WebElement projects_addPlot_csvBtn;

	@FindBy(xpath="//span[text()='PDF']")
	private static WebElement projects_addPlot_pdfBtn;

	@FindBy(xpath="//span[text()='Print']")
	private static WebElement projects_addPlot_printBtn;
	
	@FindBy(xpath="//input[@type='search']")
	private static WebElement projects_addPlot_searchTxtBx;
	
	@FindBy(xpath="//*[@id='datatable3']/tbody/tr/td[9]/button[1]")
	private static WebElement projects_addPlot_editBtn;
	
	@FindBy(xpath="//*[@id='datatable3']/tbody/tr/td[9]/button[2]")
	private static WebElement projects_addPlot_deleteBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	private static WebElement projects_addPlot_OkBtn;

	// Page Object Locators for Project Add Plot page in Masters --> Intialize at
	// runtime

	@FindBy(css="a[id='view_btn']")
	private static WebElement projects_viewPlotsBtn;

	@FindBy(id="plot_no")
	private static WebElement projects_addPlot_plotNo;

	@FindBy(id="area_of_plot")
	private static WebElement projects_addPlot_areaOfPlot;

	@FindBy(id="east")
	private static WebElement projects_addPlot_east;

	@FindBy(id="west")
	private static WebElement projects_addPlot_west;

	@FindBy(id="north")
	private static WebElement projects_addPlot_north;

	@FindBy(id="south")
	private static WebElement projects_addPlot_south;

	@FindBy(id="amount")
	private static WebElement projects_addPlot_amount;

	@FindBy(xpath="//input[@type='submit']")
	private static WebElement projects_addPlot_submitBtn;

	@FindBy(xpath="//input[@type='reset']")
	private static WebElement projects_addPlot_cancleBtn;

	// Page Object Methods for Projects page in Masters
	
	public String getSwitchWindowURL() {
		LOG.info("Click to handle print window.");
		UIKeywords.switchToChildWindow();
		return UIKeywords.getPageUrl();
	}

	
	public void mouseHoverToMasters() {
		UIKeywords.mouseHover(masters);
	}
	
	public void clickOnProjectsUnderMaster() {
		
		UIKeywords.clickOnElement(projects_under_masters);
		WaitsInHelp.threadSleepInMilliSeconds(1000);
	}
	
	public String getTextOfProjectsUnderMaster() {
		return UIKeywords.getText(projects_under_masters);
	}
	
	public void clickOnProjectcsCopyButton() {
		UIKeywords.clickOnElement(projects_copyBtn);
	}
	
	public void clickOnProjectcsExcelButton() {
		UIKeywords.clickOnElement(projects_excelBtn);
	}
	
	public void clickOnProjectcsCSVButton() {
		UIKeywords.clickOnElement(projects_csvBtn);
	}
	
	public void clickOnProjectcsPDFButton() {
		UIKeywords.clickOnElement(projects_pdfBtn);
	}
	
	public void clickOnProjectcsPrintButton() {
		UIKeywords.clickOnElement(projects_printBtn);
		WaitsInHelp.threadSleepInMilliSeconds(1000);
	}
	
	public void clickOnAddProjectButton() {
		UIKeywords.clickOnElement(projects_addProjectBtn);
		WaitsInHelp.threadSleepInMilliSeconds(1000);
	}
	
	public void enterProjectsInSearchBox() {
		UIKeywords.enterText(projects_searchTxtBx, "Incyte");
	}
	
	public void clickOnManagePlots() {
		UIKeywords.clickOnElement(projects_managePlotBtn);
	}
	
	public void clickOnCompleteButtonOnActions() {
		UIKeywords.clickOnElement(projects_complete_actionBtn);
	}
	
	public void clickOnEnableButtonOnActions() {
		UIKeywords.clickOnElement(projects_enable_actionBtn);
	}
	
	public void clickOnEditButtonOnActions() {
		UIKeywords.clickOnElement(Projects_edit_actionBtn);
	}
	
	public void clickOnDeleteButtonOnActions() {
		UIKeywords.clickOnElement(projects_delete_actionBtn);
	}
	
	// Page Object Methods for Add Projects page in Masters
	
	public void selectBranchName(String branchName) {
		UIKeywords.selectByTextFromDropdown(projects_branchName,branchName);
	}
	
	public void enterProjectName(String projectName) {
		UIKeywords.enterText(projects_projectName, projectName);
	}
	
	public void enterProjectsNoOfPlots(int noOfPlot) {
		String value_noOfPlot = String.valueOf(noOfPlot);
		UIKeywords.enterText(projects_noOfplots, value_noOfPlot);
	}
	
	public void enterProjectsTotalArea(float totalArea) {
		String value_totalArea = String.valueOf(totalArea);
		UIKeywords.enterText(projects_totalArea, value_totalArea);
	}
	
	public void enterProjectsRate(float rate) {
		String value_rate = String.valueOf(rate);
		UIKeywords.enterText(projects_rate, value_rate);
	}
	
	public void enterProjectsTotalAmount(float totalAmount) {
		String value_totalAmount = String.valueOf(totalAmount);
		UIKeywords.enterText(projects_totalAmount, value_totalAmount);
	}
	
	public void clickOnSubmitButtonOnAddProject() {
		UIKeywords.clickOnElement(projects_addProject_submitBtn);
	}
	
	public void clickOnCancleButtonOnAddProject() {
		UIKeywords.clickOnElement(projects_addProject_cancleBtn);
	}
	
	public  void clickOnProjectsLayout() {
		UIKeywords.clickOnElement(projects_layout);
		WaitsInHelp.threadSleepInMilliSeconds(1000);
		
	}
}
