package iOsDriverInvocation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class SafariBrowserLaunchOnSimulator {
	
	IOSDriver<IOSElement> driver;
	
	
	@Test
	
	public void Browser() throws MalformedURLException 
	{
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.1");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		driver=new IOSDriver<IOSElement>(new URL("http:127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		
		
		
		
		
	}
	
	

}
