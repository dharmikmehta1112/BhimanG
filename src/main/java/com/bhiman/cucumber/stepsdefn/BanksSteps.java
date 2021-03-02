package com.bhiman.cucumber.stepsdefn;

import org.testng.Assert;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Banks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BanksSteps {
	
	Banks banks = new Banks();
	
	@Given("Mouse Hover to master")
	public void mouse_hover_to_master() {
		banks.mouseHoverToMasters();
	}

	@Given("Verify Banks option")
	public void verify_banks_option() {
		Constants.expected = "Banks";
		Constants.actual = banks.getTextOfBanks();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}

	@Then("Click on Banks")
	public void click_on_banks() {
		banks.clickOnBanks();
	}

	@And("Verify Banks URL")
	public void verify_banks_url() {
		Constants.actual = UIKeywords.getPageUrl();
		Constants.expected = "http://103.50.162.196/testng/bank.php";
		Assert.assertEquals(Constants.actual, Constants.expected);
	}

	@Then("Click on Copy button")
	public void click_on_copy_button() {
		banks.clickOnCopyButton();
	}
	
	@Then("Click on Excel button")
	public void click_on_excel_button() {
		banks.clickOnExcelButton();
	}

	@Then("Click on CSV button")
	public void click_on_csv_button() {
		banks.clickOnCSVButton();
	}

	@Then("Click on PDF button")
	public void click_on_pdf_button() {
		banks.clickOnPDFButton();
	}

	@Then("Click on Print button")
	public void click_on_print_button() {
		banks.clickOnPrintButton();
	}
	
	@Then("Verify excel file in path")
	public void verify_excel_file_in_path() {
	
	}

	@Then("Verify CSV file in path")
	public void verify_csv_file_in_path() {
	
	}

	@Then("Verify PDF file in path")
	public void verify_pdf_file_in_path() {
	 
	}

	@Then("Verify Print URL")
	public void verify_print_url() {
	 
	}


}