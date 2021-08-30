package org.lang;

public class StateDetails {
	private void southIndia() {
		
		System.out.println("This is South India");
		
	}
    private  void northIndia() {
		System.out.println("This is North India");

	}
    public static void main(String[] args) {
    	StateDetails location = new StateDetails();
    	location.southIndia();
    	location.northIndia();
    	LanguageInfo lang = new LanguageInfo();
    	lang.englishLanguage();
    	lang.tamilLanguage();
    	lang.hindiLanguage();
		
	}
}
