package com.bhiman.cucumber.stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.testng.Assert;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Branches;
import com.bhiman.main.utility.PropertyReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BranchesSteps extends Branches {
	
	Branches branch = new Branches();
	
	@Given("Mouse Hover to master for branches")
	public void mouse_hover_to_master_for_branches() {
		Branches branch = new Branches();		
		branch.mouseHoverToMasters();
	}

	@Given("Verify Branches option")
	public void verify_branches_option() {
		Branches branch = new Branches();	
		Constants.expected = "Branches";
		Constants.actual = branch.getTextOfBranches();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}

	@Then("Click on Branches")
	public void click_on_branches() {
		branch.clickOnBranches();
	}

	@And("Verify Branches URL for branches")
	public void verify_branches_url() {
		Constants.actual = UIKeywords.getPageUrl();
		Constants.expected = "http://103.50.162.196/testing/branches.php";
		Assert.assertEquals(Constants.actual, Constants.expected);
	}

	@Then("Click on Copy button for branches")
	public void click_on_copy_button_for_branches() {
		branch.clickOnCopyButton();
	}
	
	@Then("Click on Excel button for branches")
	public void click_on_excel_button_for_branches() {
		branch.clickOnExcelButton();
	}

	@Then("Click on CSV button for branches")
	public void click_on_csv_button_for_branches() {
		branch.clickOnCSVButton();
	}

	@Then("Click on PDF button for branches")
	public void click_on_pdf_button_for_branches() {
		branch.clickOnPDFButton();
	}

	@Then("Click on Print button for branches")
	public void click_on_print_button_for_branches() {
		branch.clickOnPrintButton();
	}
	
	@Then("Verify click on copy action for branches")
	public void verify_click_on_copy_action_for_branches() {
		Constants.expected = "Copy to clipboard";
		Constants.actual = branch.getTextAfterClick();
		Assert.assertEquals(Constants.actual, Constants.expected);		
	}
	
	@Then("Verify excel file in path for branches")
	public void verify_excel_file_in_path_for_branches() {
		Constants.actual = "Branches.xlsx";
		String filePath = PropertyReader.getLocatorValue("branches_download_filePath")+".xlsx";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +filePath);
	}

	@Then("Verify CSV file in path for branches")
	public void verify_csv_file_in_path_for_branches() {
		Constants.actual = "Branches.csv";
		String filePath = PropertyReader.getLocatorValue("branches_download_filePath")+".csv";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +filePath);
	}

	@Then("Verify PDF file in path for branches")
	public void verify_pdf_file_in_path_for_branches() {
		Constants.actual = "Branches.pdf";
		String filePath = PropertyReader.getLocatorValue("branches_download_filePath")+".pdf";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +filePath);	 
	}

	@Then("Verify Print URL for branches")
	public void verify_print_url_for_branches() {
		Constants.expected = "about:blank";
		Constants.actual = branch.getSwitchWindowURL();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}


}
