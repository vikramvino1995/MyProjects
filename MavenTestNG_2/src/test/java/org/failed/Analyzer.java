package org.failed;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Analyzer implements IRetryAnalyzer{
	
	int minCount=1,maxCount=5;
	
	public boolean retry(ITestResult result) {
		
		if(minCount<maxCount) {
			
			minCount++;
			return true;
			
		}
		
		return false;
	}
	
}
