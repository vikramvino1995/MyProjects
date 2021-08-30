package org.brokenImages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.zalando.co.uk/");

		driver.manage().window().maximize();

		List<WebElement> allImages = driver.findElements(By.tagName("img"));

		int count = 0;

		for (WebElement element : allImages) {

			String image = element.getAttribute("src");
			
			System.out.println(image);

			if (!(image == null)) {

				URL url = new URL(image);

				URLConnection openConnection = url.openConnection();

				HttpURLConnection http = (HttpURLConnection) openConnection;

				int responseCode = http.getResponseCode();

				if (!(responseCode == 200)) {

					count++;
					System.out.println("Broken Image : " + image);

				}

			}

		}
			
		System.out.println("Broken Images Count: "+count);
		
		driver.close();
	}

}