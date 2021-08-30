package org.data;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.pom.AdactinLogin;
import org.pom.AdactinRegistration;
import org.utility.UtilityClass;

public class AdactinTestClass extends UtilityClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		launchBrowser();

		loadUrl("https://adactinhotelapp.com/Register.php");

		maximize();

		AdactinRegistration ar = new AdactinRegistration();

		enterText(ar.getUname(), getData("Sheet1", 0, 1));

		enterText(ar.getPswd(), getData("Sheet1", 1, 1));

		enterText(ar.getCfmpswd(), getData("Sheet1", 2, 1));

		enterText(ar.getFname(), getData("Sheet1", 3, 1));

		enterText(ar.getMail(), getData("Sheet1", 4, 1));

		leftClick(ar.getTerms());
		
		//goTochildWindowWay2(ar.getWebText());
		
		goToChildWindowWay1(ar.getWebText());
		
		System.out.println("TITLE: "+ printTiltle());

		enterText(ar.getCaptcha(), getUserInput());

		leftClick(ar.getCheckBox());

		leftClick(ar.getBackToLogin());

		AdactinLogin al = new AdactinLogin();

		enterText(al.getUname(), getData("Sheet1", 0, 1));

		enterText(al.getPswd(), getData("Sheet1", 1, 1));

    	}
}
