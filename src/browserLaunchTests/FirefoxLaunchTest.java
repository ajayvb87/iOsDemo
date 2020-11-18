package browserLaunchTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirefoxLaunchTest {

	public static void main(String[] args) {
		
		//DriverExecutable path
		
				System.setProperty("webdriver.gecko.driver","/Users/ajaybharadwaj/BrowserDrivers/geckodriver");
		
		// Instantiate a Safari class. 
		WebDriver driver = new FirefoxDriver(); 
		
		
		// Launch Website 
		driver.navigate().to("http://www.google.com/"); 

		// Click on the search text box and send value 
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("BrowserStack");
		
		// Click on the search button 
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		

		// Close the Browser 
		driver.close(); 

	}

}
