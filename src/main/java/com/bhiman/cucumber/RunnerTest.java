package com.bhiman.cucumber;

import com.bhiman.main.Constants;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = {"loginPath", "banksPath"}, glue = {"com.bhiman.cucumber.stepsdefn"})
public class RunnerTest {
	
	String loginPath = Constants.basePath + "src\\main\\java\\CucumberFeatures\\Login.feature";
//	String banksPath = Constants.basePath + "src\\main\\java\\CucumberFeatures\\Banks.feature";
	

}
