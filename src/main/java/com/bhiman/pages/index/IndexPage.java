package com.bhiman.pages.index;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIKeywords;

public class IndexPage extends UIKeywords {
	
	private static final Logger LOG = Logger.getLogger(IndexPage.class);
	
// Page Object Locators for Index page --> Intialize at runtime
	
	@FindBys(@FindBy(css = "body div.main-horizontal-nav nav ul#respMenu span.toggle-none"))
	private static List<WebElement> nav_bar_options;

	@FindBy(xpath = "//span[text() = 'Masters']")
	private static WebElement masters;
	
	@FindBy(css = "a.dropdown-toggle")
	private static WebElement admin;

// Constructor to instantiate an instance of class and set a lazy proxy for each of the WebElement

	public IndexPage() {
		PageFactory.initElements(Constants.driver, this);
	}

// Page Object Methods for Index page
	
	public int getCountOfNavBarOptions() {
		LOG.info("Counting number of options on navigation bar of Index page.");
		return nav_bar_options.size();
	}
	
	public void getTextOfNavBarOptions() {
		Constants.count = 1;
		LOG.info("Reading text of navigation bar options on Index page.");
		LOG.info("Navigation Options count:: "+nav_bar_options.size());
		Iterator<WebElement> nav_options_itr = nav_bar_options.iterator();
		while(nav_options_itr.hasNext()) {
			WebElement nav_options_name = nav_options_itr.next();
			System.out.println("Text of navigation bar options" +Constants.count+ " :: " + nav_options_name.getText());
			Constants.count++;
		}
	}

	public void clickOnAdmin() {
		LOG.info("Clicking on Admin dropdown on Index page.");
		UIKeywords.clickOnElement(admin);		
	}
	
	public String getAdminText() {
		LOG.info("Reading text of Admin dropdown on Index page.");
		return UIKeywords.getText(admin);
	}
	
//	public int getCountofMastersOptions() {
//		LOG.info("Counting number of options under Masters tab of Index page.");
//		return masters;
//	}
	
	
	

}
