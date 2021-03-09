package com.bhiman.cucumber.stepdefinitions;

import com.bhiman.pages.adminlogin.AdminLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps extends AdminLoginPage {
	
	AdminLoginPage adm = new AdminLoginPage();
	
	@Given("Enter valid mobile no.")
	public void enter_valid_mobile_no() {
		adm.enterUsername("9876543210");
	}

	@Given("Enter valid password")
	public void enter_valid_password() {
	    adm.enterPassword("admin");
	}

	@Then("Click on Login button")
	public void click_on_login_button() {
	    adm.clickOnLoginButton();
	}

	@Then("Click on OK button")
	public void click_on_ok_button() {
	    adm.clickOnSignInOkButton();
	}
	
	@Given("Enter invalid mobile no.")
	public void enter_invalid_mobile_no() {
		adm.enterUsername("9876543211");
	}

	@Given("Enter invalid password")
	public void enter_invalid_password() {
	    adm.enterPassword("admin1");
	}

}