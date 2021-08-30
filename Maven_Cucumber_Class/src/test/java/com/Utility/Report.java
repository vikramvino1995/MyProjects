package com.Utility;

import java.io.File;
import java.util.*;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	
	public static void generateJVMReport(String jsonFile) {
		
		File reportDirectory = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		
		Configuration configuration = new Configuration(reportDirectory,"AirlineBooking");
		
		configuration.addClassifications("OS","Windows");
		configuration.addClassifications("Browser","chrome");
		configuration.addClassifications("Version","89");
		configuration.addClassifications("Sprint","40");
		
		List<String> jsonFiles = new ArrayList<>();
		
		jsonFiles.add(jsonFile);
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		
		reportBuilder.generateReports();
		
	}
}
