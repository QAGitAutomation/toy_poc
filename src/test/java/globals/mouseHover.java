package globals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {
	WebDriver driver;
	
	public void mouseHover(WebDriver driver,WebElement el, WebElement hoverLink){
		this.driver = driver;
		Actions hover = new Actions(driver);
		hover.moveToElement(el).perform();
		hover.moveToElement(hoverLink).click().build().perform();
		}
}
