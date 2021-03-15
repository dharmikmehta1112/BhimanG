package com.bhiman.test;

import java.io.IOException;
import java.util.Date;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIKeywords;

public class BhimanListeners implements ITestListener {

	private static final Logger LOG = Logger.getLogger(BhimanListeners.class);
	
	@Override
	public void onTestStart(ITestResult result) {
		LOG.info("Running started for "+result+ " test case.");
		
	} // end of method

	@Override
	public void onTestSuccess(ITestResult result) {
		LOG.info("Test case "+ result.getName() +" success.");
		Date date = new Date();
		String screenshotName = result.getName() + "_" + date.getDate() + "_" + date.getHours() + "_" + date.getMinutes() + "_" + date.getSeconds()+".png";
		LOG.info("Taking screenshot of "+ result.getName() +" passed test case.");
		try {
			UIKeywords.captureScreenshot(Constants.basePath+"\\screenshots\\passed", screenshotName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		LOG.info("Successfully completed run for "+result+ "test case.");
		
	} // end of method

	@Override
	public void onTestFailure(ITestResult result) {
		LOG.info("Test case "+ result +" failed.");
		Date date = new Date();
		String screenshotName = result.getClass().getName() + "_" + result.getName() + "_" + date.getDate() + "_" + date.getHours() + "_" + date.getMinutes() + "_" + date.getSeconds()+".png";
		LOG.info("Taking screenshot of "+ result +" failed test case.");
		try {
			UIKeywords.captureScreenshot(Constants.basePath+"\\screenshots\\failed", screenshotName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // end of method

	@Override
	public void onTestSkipped(ITestResult result) {
		LOG.info("Test case "+result+ " skipped.");
		
	} // end of method

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		LOG.info("Test case "+ result +" failed but with in success percentage.");
		
	} // end of method

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		LOG.info("Test case "+ result +" failed due to timeout.");
		
	} // end of method

	@Override
	public void onStart(ITestContext context) {
		LOG.info("Started running "+context+ " test case.");
		
	} // end of method

	@Override
	public void onFinish(ITestContext context) {
		LOG.info("Finish running "+context+ " test case.");
		
	} // end of method
	
}