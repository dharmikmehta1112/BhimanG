package com.bhiman.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
					features = {"src/main/resources/Features/Branches.feature"},
					glue = {"com.bhiman.cucumber.stepdefinitions"},
//					tags = "@Regression and @Smoke not @Sanity"
					monochrome = true,
					dryRun = false
				)

public class RunnerTest extends AbstractTestNGCucumberTests{

// features: provide path to features	
// glue: provide step definitions class path
// tags: tagged hooks for scenarios
// monochrome: enhance the readability
// dryRun: true - will check pending or missing steps, but will not fail the script

	

}