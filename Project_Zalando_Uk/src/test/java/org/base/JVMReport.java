package org.base;

import java.io.File;
import java.util.*;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jsonFile) {
			
		File reportDirectory = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		
		Configuration configuration = new Configuration(reportDirectory,"Zalando_Product_Search");
		
		configuration.addClassifications("OS","Windows");
		configuration.addClassifications("Browser","Chrome");
		configuration.addClassifications("Version","89");
		configuration.addClassifications("Sprint","32");
	
		List<String> jsonFiles = new ArrayList<>();
		
		jsonFiles.add(jsonFile);
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles,configuration);
		
		reportBuilder.generateReports();
		
	}
}
