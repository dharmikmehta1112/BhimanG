package com.bhiman.main;

public class UIAlerts {
	
	/**
	 * Switch to alert and accept the alert. 
	 */
	public static void acceptAlert() {
		Constants.driver.switchTo().alert().accept();
	}

	/**
	 * Switch to alert and dismiss the alert. 
	 */
	public static void dismissAlert() {
		Constants.driver.switchTo().alert().dismiss();
	}

	/**
	 * Switch to alert and read text message from the alert. 
	 */
	public static String getTextFromAlert() {
		return Constants.driver.switchTo().alert().getText();
	}

	/**
	 * Switch to alert and send text to the alert. 
	 * 
	 * @param textToEnter as {@code String}.
	 */
	public static void sendKeysToAlert(String textToEnter) {
		Constants.driver.switchTo().alert().sendKeys(textToEnter);;
	}
}