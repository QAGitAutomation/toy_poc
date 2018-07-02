package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlobalNavTest {
	 public static WebDriver driver;
	@Test
	public void firstSearchResultIsRelatedTest() {
	    
	    // This line tells your test where to find the chromedriver, which is the "glue"
	    // between Selenium and the Chrome installation on your machine
		String chromePath = "D:\\Automation\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", chromePath);
		
	    
	    // Start a new Chrome browser instance and maximize the browser window
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    // Navigate to the Toyota.com home page
	    driver.get("https://www.toyota.com/");
	    /*
	    // Type "Software testing" in the search window
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Software Testing");
	    
	    // Click on the search button
	    driver.findElement(By.xpath("//input[@value='Go']")).click();
	    
	    // Select the first item in the list of search results
	    driver.findElement(By.xpath("(//div[@id='resultsCol']//a[contains(@class,'access-detail-page')])[1]")).click();
	    
	    // Check that the page title contains the term "Software Testing"
	    Assert.assertTrue(driver.getTitle().contains("Software Testing"));    */

	    // Close the browser
	    driver.quit();    
	}
}
