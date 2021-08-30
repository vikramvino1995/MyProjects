package org.lang;
//child
public class LanguageInfo extends StateDetails {
	private void tamilLanguage() {
		System.out.println("Tamil Language is spoken here.");

	}
	private void englishLanguage() {
		System.out.println("English Language is also prevalent");

	}
	private void hindiLanguage() {
		System.out.println("Hindi Language is spoken here.");

	}
	public static void main(String[] args) {
		LanguageInfo lang =new LanguageInfo();
		lang.southIndia();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.northIndia();
		lang.hindiLanguage();
		lang.englishLanguage();
		
	}

}
