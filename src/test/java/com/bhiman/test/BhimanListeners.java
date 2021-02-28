package com.bhiman.test;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;

import jdk.internal.org.jline.utils.Log;

public class BhimanListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// Log.info("Running started for "+result+ " test case.");
		
	} // end of method

	@Override
	public void onTestSuccess(ITestResult result) {
		// Log.info("Successfully completed run for "+result+ "test case.");
		
	} // end of method

	@Override
	public void onTestFailure(ITestResult result) {
		// Log.info("Test case "+ result +" failed.");
		Date date = new Date();
		String screenshotName = "bhiman_"+ result.getName() + "_" + date.getDate() + "_" + date.getHours() + "_" + date.getMinutes() + "_" + date.getSeconds() + ".png";
		// Log.info("Taking screenshot of "+ result +" failed test case.");
		UIKeywords.takeScreenshot(Constants.basePath+"\\screenshots", screenshotName);
		
	} // end of method

	@Override
	public void onTestSkipped(ITestResult result) {
		Log.info("Test case "+result+ " skipped.");
		
	} // end of method

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Log.info("Test case "+ result +" failed but with in success percentage.");
		
	} // end of method

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// Log.info("Test case "+ result +" failed due to timeout.");
		
	} // end of method

	@Override
	public void onStart(ITestContext context) {
		// Log.info("Started running "+context+ " test case.");
		
	} // end of method

	@Override
	public void onFinish(ITestContext context) {
		// Log.info("Finish running "+context+ " test case.");
		
	} // end of method
	
}