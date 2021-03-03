package com.bhiman.main.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Projects {

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

	@FindBy(id="layout")
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


}
