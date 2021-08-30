package org.testRunner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",
				glue="org.stepDefinition",
				monochrome=true,
				plugin= {"pretty","json:src\\test\\resources\\Reports\\Output.json"},
				dryRun=false,
				snippets=SnippetType.CAMELCASE)


public class TestRunner{

	
	@AfterClass
	public static void report() {
		
		JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Output.json");
		
	}
	
}

