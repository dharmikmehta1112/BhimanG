package com.bhiman.main.materials;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Banks;

public class Materials extends UIKeywords {
  
	private static final Logger LOG = Logger.getLogger(Banks.class);

	// ***************Page Object Locators for Materials*********************

	@FindBy(xpath = "//span[normalize-space()='Materials']")
	private static WebElement materials;

	@FindBy(xpath = "//span[text()='Copy']")
	private static WebElement materials_copyBtn;

	@FindBy(xpath = "//span[text()='Excel']")
	private static WebElement materials_excelBtn;

	@FindBy(xpath = "//span[text()='CSV']")
	private static WebElement materials_csvBtn;

	@FindBy(xpath = "//span[text()='PDF']")
	private static WebElement materials_pdfBtn;

	@FindBy(xpath = "//span[text()='Print']")
	private static WebElement materials_printBtn;

	@FindBy(xpath = "//input[@type='search']")
	private static WebElement materials_searchBox;

	@FindBy(xpath = "//td[text() = 'No matching records found']")
	private static WebElement materials_table_noRecords;

	// Page Object Locators after click on Add materials button in Banks page
	@FindBy(css = "#add_btn")
	private static WebElement material_add;

	@FindBy(css = "#view_btn")
	private static WebElement material_view;

	@FindBy(xpath = "//input[@placeholder='Enter Date']")
	private static WebElement material_Date;

	@FindBy(css = "#project_id")
	private static WebElement material_project_name;

	@FindBy(css = "#material_name")
	private static WebElement material_Name;

	@FindBy(css = "#amount")
	private static WebElement material_amount;

	@FindBy(xpath = "//input[@placeholder='Upload Material Bill']")
	private static WebElement material_upload_bill;

	@FindBy(xpath = "//input[@type='submit']")
	private static WebElement material_submit;

	@FindBy(css = "#Reset")
	private static WebElement material_cancel;

	// Constructor to instantiate an instance of class and set a lazy proxy for each
	// of the WebElement

	public Materials() {
		PageFactory.initElements(Constants.driver, this);
	}
  
	public String getTextofMaterial() {
		LOG.info("get material Name");
		return UIKeywords.getText(materials);
	}
  
	public void clickonMaterials() {
		LOG.info("click on Material :");
		UIKeywords.clickOnElement(materials);
	}
  
	public String getTextofCopyonMaterialPage() {
		LOG.info("get Text of copy name on material page");
		return UIKeywords.getText(materials_copyBtn);

	}
  
	public void clickonmaterialcopy() {
		LOG.info("click on Copy");
		UIKeywords.clickOnElement(materials_copyBtn);
	}
  
	public void clickonmaterialexcel() {
		LOG.info("click on Excel");
		UIKeywords.clickOnElement(materials_excelBtn);
	}
  
	public void clickonmaterialcsv() {
		LOG.info("click on csv");
		UIKeywords.clickOnElement(materials_csvBtn);
	}
  
	public void clickonmaterialpdf() {
		LOG.info("click on pdf");
		UIKeywords.clickOnElement(materials_pdfBtn);
	}
  
	public void clickonmaterialprint() {
		LOG.info("click on print");
		UIKeywords.clickOnElement(materials_printBtn);
	}
  
	public void enterTextOnSearchBox(String textToEnter) {
		LOG.info("Entering text on search box of material page");
		UIKeywords.enterText(materials_searchBox, textToEnter);
	}
  
	public void clickonaddMaterial() {
		LOG.info("click on add material");
		UIKeywords.clickOnElement(material_add);
	}
  
	public void clickonViewMaterial() {
		LOG.info("click on view material");
		UIKeywords.clickOnElement(material_view);
	}
  
	public void entertoMaterialDate(String dateToEnter) {
		LOG.info("enter material date");
		UIKeywords.enterText(material_Date, dateToEnter);
	}
  
	public void selectProjectName(String textToEnter) {
		LOG.info("select project name from drop don list");
		UIKeywords.selectByTextFromDropdown(material_project_name, textToEnter);
	}
  
	public void enterMaterialName(String TextToEnter) {
		LOG.info("enter material name");
		UIKeywords.enterText(material_Name, TextToEnter);
	}
  
	public void enterAmountforMaterial(String TextToEnter) {
		LOG.info("enter amount of material :");
		UIKeywords.enterText(material_amount, TextToEnter);
	}
  
	public void uploadmaterialBill(String filePath) {
		LOG.info("File to upload");
		UIKeywords.enterText(material_upload_bill, filePath);
	}
  
	public void clickonsubmit() {
		LOG.info("click on submit");
		UIKeywords.clickOnElement(material_submit);
	}
  
	public void clickonCancel() {
		LOG.info("click on cancel");
		UIKeywords.clickOnElement(material_cancel);
	}

}