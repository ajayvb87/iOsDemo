package browserLaunchTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariLaunch {

	public static void main(String[] args) {
		
		// Instantiate a Safari class. 
		WebDriver driver = new SafariDriver(); 
		
		// Launch Website 
		driver.navigate().to("http://www.google.com/"); 

		// Click on the search text box and send value 
		
		
		// Click on the search text box and send value 
		driver.findElement(By.xpath("//input[name='q']")).sendKeys("BrowserStack");
		
		
		driver.findElement(By.xpath("//input[name='btnK']")).click();

		// Click on the search button 
		driver.findElement(By.name("btnK")).click(); 

		// Close the Browser 
		driver.close(); 

	}

}
