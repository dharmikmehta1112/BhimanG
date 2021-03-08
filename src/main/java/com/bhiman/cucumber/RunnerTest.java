package com.bhiman.cucumber;

import com.bhiman.main.Constants;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
					features = {"src/main/resources/Features/Banks.feature"},
					glue = {"com.bhiman.cucumber.stepdefinitions"},
//					tags = "@Regression and @Smoke not @Sanity"
					dryRun = false,
					monochrome = true
				)

public class RunnerTest extends AbstractTestNGCucumberTests{
	
	
	

}