package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automation.Tcom_POC.TestBaseSetup;
import globals.switchWindows;
import pages.Gnav_UtilityNav;

public class GlobalNavTest extends TestBaseSetup{
	@Test
	public void firstSearchResultIsRelatedTest() throws Exception{
	    
	    // This line tells your test where to find the chromedriver, which is the "glue"
	    // between Selenium and the Chrome installation on your machine
		/*String chromePath = "D:\\Automation\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", chromePath);
		
	    
	    // Start a new Chrome browser instance and maximize the browser window
	    driver = new ChromeDriver();
	    driver.manage().window().maximize(); */
	    
	    // Navigate to the Toyota.com home page
		
		TestBaseSetup.setDriver("Chrome", "https://www.toyota.com/");
	    Gnav_UtilityNav unav = PageFactory.initElements(driver, Gnav_UtilityNav.class);
	       
	    unav.locationOverlay();
	    unav.tcuv();
	    unav.Owners();
	    unav.EspLang();
	    unav.searchOverlay();
	    driver.navigate().back();
		

	    // Close the browser
	    driver.quit();    
	}
}
