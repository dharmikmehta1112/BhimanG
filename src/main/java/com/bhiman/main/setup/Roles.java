package com.bhiman.main.setup;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bhiman.main.UIKeywords;

public class Roles extends UIKeywords {
	
	private static final Logger LOG = Logger.getLogger(Roles.class);
	
// --------------- all locators available on roles page under setup ------------------------//
	
	@FindBy(xpath = "//*[@id='respMenu']/li[8]/a/span[1]")			 
	private static WebElement setup;		
	
	@FindBy(css = "a[href='role.php']")
	private static WebElement roles;
	
	@FindBy(css="a#add_btn")
	private static WebElement addRole;

	@FindBy(xpath="//*[text()='Copy']")
	private static WebElement copy;
	
	@FindBy(xpath="//*[text()='Excel']")
	private static WebElement excel;
	
	@FindBy(xpath="//*[text()='CSV']")
	private static WebElement csv;
	
	@FindBy(xpath="//*[text()='PDF']")
	private static WebElement pdf;
	
	@FindBy(xpath="//*[text()='Print']")
	private static WebElement print;
	
	@FindBy(css="input[type='search']")
	private static WebElement searchbox;
	
	@FindBy(xpath = " //*[@id=\"datatable3\"]/tbody/tr[1]/td[3]/button[1]/i")
	private static WebElement action_edit_icon;

	@FindBy(xpath = "//*[@id=\"datatable3\"]/tbody/tr[1]/td[3]/button[2]/i")
	private static WebElement action_delete_icon;
	
// --------------- all locators available on add role page in roles ------------------------//
	
	@FindBy(css="a#view_btn")
	private static WebElement viewRoles;
	
	@FindBy(css="input#role_name")
	private static WebElement roleName;
	
	@FindBy(xpath="//label[@for='dashboard']")
	private static WebElement dashboard;
	
	@FindBy(xpath="//label[@for='banks']")
	private static WebElement banks;
	
	@FindBy(xpath="//label[@for='users']")
	private static WebElement users;
	
	@FindBy(xpath="//label[@for='branches']")
	private static WebElement branches;
	
	@FindBy(xpath="//label[@for='customers']")
	private static WebElement customers;
	
	@FindBy(xpath="//label[@for='brokers']")
	private static WebElement brokers;
	
	
}
