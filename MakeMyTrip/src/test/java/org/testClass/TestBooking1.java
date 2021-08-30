package org.testClass;

import java.awt.AWTException;
import org.baseClass.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pageObjects.FlightBooking;

public class TestBooking1 extends Utility{

 public static void main(String[] args) throws AWTException, InterruptedException {
	
	 openBrowser();
	 
	 loadURL("https://www.makemytrip.com/");
	 
	 maximize();
	 
	 System.out.println(showTitle());
	 
	 FlightBooking f =new FlightBooking();
	 
	 leftClick(f.getOneWayTrip());
	 
	 leftClick(f.getFromClick());
	 
	 enterText(f.getFromTextbox(),"Chennai");
	 
	 Thread.sleep(3000);
	 
	 pressDown();
	 
	 pressEnter();
	 
	 Thread.sleep(2000);
	 
	 leftClick(f.getToClick());
	 
	 enterText(f.getToTextbox(),"Bangalore");
	 
	 Thread.sleep(2000);
	 
	 pressDown();
	 
	 pressEnter();
	 
	 selectDate("Jul 14 2021");
	
}
}