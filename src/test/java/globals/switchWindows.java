package globals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class switchWindows {
	WebDriver driver;
	 
   public void WinSwitch(WebDriver driver){
		this.driver = driver;
		String winHandleBefore = driver.getWindowHandle();
		 for (String winHandle : driver.getWindowHandles()) {
		   // Switch to child window
		   driver.switchTo().window(winHandle);
		 }
		   driver.close();
		   //Switch to parent window
		   driver.switchTo().window(winHandleBefore);
		   
		  	 }
}

	
