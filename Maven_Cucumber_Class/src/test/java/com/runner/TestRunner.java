package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.Utility.Report;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue= {"com.stepDefinition"},monochrome=true,snippets=SnippetType.CAMELCASE,dryRun=false,plugin= {"pretty","rerun:src\\test\\resources\\FailedScenarios\\Failed.txt"})                                                                    


public class TestRunner {

/*	@AfterClass
	public static void afterClass() {
		
		Report.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\MyJsonReport.json");
		
	}
	*/

}

