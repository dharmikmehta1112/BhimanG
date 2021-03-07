package com.bhiman.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
					features = {"src/main/resources/CucumberFeatures"},
					glue = {"com.bhiman.cucumber.stepsdefn"},
					tags = "@Regressio and @Smoke not @Sanity"
				)

public class RunnerTest extends AbstractTestNGCucumberTests{
	
	

}