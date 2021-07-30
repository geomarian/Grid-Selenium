package selenium.Grid;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class gridDemoOne {

	@Test
	public void TestOne() throws InterruptedException{
		try {
			System.out.println(" TC01 started...");
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName("chrome");
			dc.setPlatform(Platform.WINDOWS);
			
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.8:4444/wd/hub"),dc);
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			 	System.out.println("Title is " + driver.getTitle());
			 	Thread.sleep(2000);
			 	driver.quit();
			 	System.out.println("TC01 Ended...");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestTwo() throws InterruptedException{
		try {
			System.out.println(" TC02 started...");
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName("firefox");
			dc.setPlatform(Platform.WINDOWS);
			
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.8:4444/wd/hub"),dc);
			driver.manage().window().maximize();
			driver.get("https://www.bing.com");
			 	System.out.println("Title is " + driver.getTitle());
			 	Thread.sleep(2000);
			 	driver.quit();
			 	System.out.println("TC02 Ended...");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestThree() throws InterruptedException{
		try {
			System.out.println(" TC03 started...");
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName("chrome");
			dc.setPlatform(Platform.WINDOWS);
			
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.8:4444/wd/hub"),dc);
			driver.manage().window().maximize();
			driver.get("https://www.yahoo.com");
			 	System.out.println("Title is " + driver.getTitle());
			 	Thread.sleep(2000);
			 	driver.quit();
			 	System.out.println("TC03 Ended...");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
