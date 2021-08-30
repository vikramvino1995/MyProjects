package org.all;

import org.tamil.Tamil;

//child
public class LanguageClass extends Tamil {
	private void alllanguage() {
		System.out.println("These are the available languages:");

	}
	public static void main(String[] args) {
		LanguageClass l =new LanguageClass();
		l.alllanguage();
		l.tamilLanguage();
		l.englishLanguage();
		l.teluguLanguage();
		
	}

}
