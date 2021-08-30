package org.pom;

public class SampleTestClass extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser();
		
		goToWebsite("https://adactinhotelapp.com/Register.php");
		
		maximize();
		
		System.out.println(getUrl());

		System.out.println(getTitle());
		
		titleContains("Adactin");
		
		RegistrationPage r = new RegistrationPage();
		
		enterText(r.getEnterUsername(),"Vikram1136");
		
		enterText(r.getEnterPassword(),"NewtonsApple1136");
		
		enterText(r.getConfirmPassword(),"NewtonsApple1136");
		
		enterText(r.getEnterFullName(),"A.Vikram");
		
		enterText(r.getEnterEmail(),"vikramvino1136@gmail.com");
		
		enterText(r.getEnterCaptcha(),getUserInput());
		
		leftClick(r.getAcceptTerms());
		
		leftClick(r.getReadTerms());
		
		windowHandle();
		
		System.out.println(showText(r.getPrintTerms()));
		
		goToParentWindow();
		
		wait(3000);
		
		//leftClick(r.getRegisterForm());
		
		leftClick(r.getGoBackToLogIn());
		
		LoginPage l = new LoginPage();
		
		enterText(l.getLoginUser(),"Vikram1136");
		
		enterText(l.getLoginPass(),"NewtonsApple1136");
		
		leftClick(l.getLoginButton());
		
		
		
		
		
		
		
		
		
		
		
	}
}
