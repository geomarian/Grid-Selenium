package selenium.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class gD {
	WebDriver driver;
	Platform WINDOWS;
	String nodeURL;
	
	@Parameters({"portNO","appURL"})
	@BeforeMethod
	public void setUP(String portNO, String appURL){
		if(portNO.equalsIgnoreCase("4545")){
			nodeURL = "http://192.168.1.8:4444/wd/hub";
			System.out.println("Firefox driver created");
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
			
			try {
				driver= new RemoteWebDriver(new URL(nodeURL),cap);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			driver.navigate().to(appURL);
		}
		else
			if(portNO.equalsIgnoreCase("4546")){
				nodeURL= "http://192.168.1.8:4444/wd/hub";
				System.out.println("Firefox driver created");
				DesiredCapabilities cap = DesiredCapabilities.chrome();
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.WINDOWS);
				
				try {
					driver= new RemoteWebDriver(new URL(nodeURL),cap);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.manage().window().maximize();
				driver.navigate().to(appURL);
			}
			else
				System.err.println("provide correct port number");
		
	}
	@Test(dataProvider="Authentication")
	public void facebookLogin(String username, String password) throws InterruptedException
	{
		System.out.println("Trying with :"+username);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.id("u_0_d_EW")).click();
		
//		String c = driver1.findElement(By.cssSelector("div[class='_4rbf _53ij']")).getText();
//		System.out.println(c);
	}

	@DataProvider(name="Authentication")
	public Object[][] credentials()
	{
		Object[][] obj = new Object[3][2];
		obj[0][0]="Admin";
		obj[0][1]="Admin";
		
		obj[1][0]="Tester";
		obj[1][1]="Tester";
		
		obj[2][0]="Developer";
		obj[2][1]="developer";
		
		return obj;	
	}
	
				@AfterMethod()
		
		public void tearDown(){
			driver.quit();
			System.out.println("Closing the browser");
		}
		
	}

