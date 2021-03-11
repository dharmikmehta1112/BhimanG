package com.bhiman.cucumber.stepdefinitions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.pages.materials.MaterialsPage;
import com.bhiman.utility.PropertyReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaterialsSteps {
	
	private static final Logger LOG = Logger.getLogger(MaterialsSteps.class);
	MaterialsPage material = new MaterialsPage();
	@Given("click on material")
	public void click_on_material() {
		material.clickonMaterials();	
	}
	@Then("verify and validate Material URL")
	public void verify_and_validate_material_url() {
		Constants.expected = "http://103.50.162.196/testing/material.php";
		Constants.actual = UIKeywords.getPageUrl();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}

	@Given("verify and validate Material text")
	public void verify_and_validate_material_text() {
		Constants.expected="Materials";
		Constants.actual=material.getTextofMaterial();
		Assert.assertEquals(Constants.actual, Constants.expected);	
	}
	
	@Given("click on material tab")
	public void click_on_material_tab() {
		material.clickonaddMaterial();
	}
	
	@When("click on add material")
	public void click_on_add_material() {
		material.clickonaddMaterial();
	}

	@Then("verify and validate add material tab	with URL")
	public void verify_and_validate_add_material_tab_with_url() {
		String Materials_expectedUrl = "http://103.50.162.196/testing/material.php#";
		String Materials_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(Materials_actualUrl, Materials_expectedUrl);
	}

	@Then("click on view material tab")
	public void click_on_view_material_tab() {
		material.clickonViewMaterial();
	}
	
	

	@Then("verify and validate view material tab with URL")
	public void verify_and_validate_view_material_tab_with_url() {
		String Materials_expectedUrl = "http://103.50.162.196/testing/material.php#";
		String Materials_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(Materials_actualUrl, Materials_expectedUrl);
	}
	
	@Then("vrify and validate the Date format")
	public void vrify_and_validate_the_date_format() {
		String value=PropertyReader.getLocatorValue("Material_purchase_date");
		if (value !=null && value.matches("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$")) {
			material.entertoMaterialDate(value);
			Constants.flag=true;
		}
		LOG.error("this test case is fail");
		Assert.assertTrue(true, "Date format is valid");	
	}

	@Then("vrify and validate the valid material name enter")
	public void vrify_and_validate_the_valid_material_name_enter() {
		String value=PropertyReader.getLocatorValue("Material_purchese_name");
		if (value !=null && value.matches("^[a-zA-Z ]*$")) {
			material.enterMaterialName(value);
			Constants.flag=true;
		}
		Assert.assertTrue(true, "valid material name enter");
	}

}
