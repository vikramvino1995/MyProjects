package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",
                 glue="org.stepDefinition",
                 monochrome=true,
                 plugin= {"pretty"},
                 dryRun=false,
                 strict=false,
                 snippets=SnippetType.CAMELCASE)


public class TestRunner {



}







