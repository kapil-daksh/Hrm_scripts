package com.hrm.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {
	
	public static Properties config = null;
	public WebDriver wbDv = null;
	public static EventFiringWebDriver driver = null;
	//public static WebDriver driver =null;
	
	@BeforeSuite
	public void initialize(){
		
		try{
			
			// loading config Repositories
			config = new Properties();
			FileInputStream fp = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\hrm\\config\\config.properties");
			config.load(fp);
			
			
			// checking the type of browser
			if(config.getProperty("browserType").equalsIgnoreCase("Firefox")){
	
				wbDv = new FirefoxDriver();
				
			}else if(config.getProperty("browserType").equalsIgnoreCase("IE")){
				
				wbDv = new InternetExplorerDriver();
				DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
				ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				wbDv = new InternetExplorerDriver(ieCapabilities);
			}else if(config.getProperty("browserType").equalsIgnoreCase("Chrome")){
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\OtherUtility\\chromedriver.exe");
			    wbDv = new ChromeDriver();
				
			}
			
			driver = new EventFiringWebDriver(wbDv);
			
			// putting an implicit wait after every Action or Event
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// Loading the browser
			driver.get("http://croissanceservices.com/hrm");
			
			// opening the browser
			driver.manage().window().maximize();
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		
	}
	
	public static WebElement getObject(String xpathKey){
		
		// Initialize the xpath and Checking the type of the locator
		String strXpath = xpathKey;
		
		if(strXpath.startsWith("//")){
			
			return driver.findElement(By.xpath((xpathKey).trim()));
		
		}else{
			
			return driver.findElement(By.id((xpathKey).trim()));
		}
	}
	
	@AfterSuite
	public void closeBrowser(){
		
		driver.close();

	}
	

}
