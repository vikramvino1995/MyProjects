package org.base;

import org.testng.annotations.DataProvider;


public class BaseData {
	
	@DataProvider(indices= {0,2})
	public Object[][] datas(){
		
		return new Object[][] {{"Vikram","123455"},{"Vino","123456"},{"Appa","2i0345"}};
	}
	
}
