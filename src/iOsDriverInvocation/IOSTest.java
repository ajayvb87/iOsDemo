package iOsDriverInvocation;


import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions; 
import static io.appium.java_client.touch.offset.ElementOption.element; 
import io.appium.java_client.TouchAction;

public class IOSTest extends Practice{

	public static void main(String[] args) throws MalformedURLException {
		
		IOSDriver<IOSElement> driver=capabilities();
		
		driver.findElementByAccessibilityId("Alert Views").click();
		
		driver.findElement(By.xpath("//*[@value='Text Entry']")).click();
		
		driver.findElement(By.className("XCUIElementTypeTextField")).sendKeys("Hello");
		
		driver.findElementByName("OK").click();
		
		driver.navigate().back();

		//MobileElement Steppers = driver.findElementByAccessibilityId("Steppers");
		//		Point point = Steppers.getLocation();
		//		int startY = point.y;
		//		int endY = point.y;
		//	
		//		int startX = (int) ((driver.manage().window().getSize().getWidth()) * 0.80);
		//		int endX = (int) ((driver.manage().window().getSize().getWidth()) * 0.20);
		//	
		//		TouchAction actions = new TouchAction(driver);
		//		actions.longPress(longPressOptions().withPosition(startX,startY)
		

		//RemoteWebElement element = (RemoteWebElement)driver.findElementByAccessibilityId("Steppers");
		//String elementID = element.getId();
		//HashMap<String, String> scrollObject = new HashMap<String, String>();
		//scrollObject.put("element", elementID);
		//scrollObject.put("toVisible","not an empty string");
		//driver.executeScript("mobile:scroll", scrollObject);
		
		//RemoteWebElement parent = (RemoteWebElement)driver.findElementByAccessibilityId("Steppers");
		//String parentID = parent.getId();
		//HashMap<String, String> scrollObject = new HashMap<String, String>();
		//scrollObject.put("element", parentID);
		//scrollObject.put("name", "elementName");
		//driver.executeScript("mobile:scroll", scrollObject);
		
		//RemoteWebElement element = (RemoteWebElement)driver.findElementByAccessibilityId("Steppers");
		//String elementID = element.getId();
		//HashMap<String, String> scrollObject = new HashMap<String, String>();
		//scrollObject.put("element", elementID); // Only for ‘scroll in element’
		//scrollObject.put("direction", "down");
		//driver.executeScript("mobile:scroll", scrollObject);
		
		driver.findElementByAccessibilityId("Picker View").click();
		
		
		
		driver.findElementsByClassName("XCUIElementTypePickerWheel").get(0).getText();
		
		
		
		
	}

}
