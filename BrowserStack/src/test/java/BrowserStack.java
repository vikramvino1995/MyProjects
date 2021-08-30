import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class BrowserStack {
	
	  public static final String AUTOMATE_USERNAME = "vikramvino1";
	  public static final String AUTOMATE_ACCESS_KEY = "Nxx2pnDdzFsicYySET5H";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("os_version", "8.1");
	    caps.setCapability("resolution", "1920x1080");
	    caps.setCapability("browser", "Firefox");
	    caps.setCapability("browser_version", "85.0");
	    caps.setCapability("os", "Windows");
	    
	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    
	    driver.get("https://www.nordica.ee/en");
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//label[contains(text(),'One-way')]")).click();
	 
	    //departure
	    
	    driver.findElement(By.xpath("(//span[@dir='ltr'])[2]")).click();
	    
	    WebElement departure = driver.findElement(By.xpath("//select[@id='fsf-from-airport']"));
	    
	    Select s = new Select(departure);
	    
	    s.selectByValue("TLL");
	    
	    WebElement destination = driver.findElement(By.xpath("//select[@id='fsf-to-airport']"));
	    
	    Select s1 =new Select(destination);
	    
	    s1.selectByValue("WAW");
	    
	    
	    
	    
	}
	
}
