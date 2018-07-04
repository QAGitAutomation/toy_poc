package pages;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import globals.switchWindows;
 
public class Gnav_UtilityNav{
 
 WebDriver driver;
 
        public Gnav_UtilityNav(WebDriver driver){ 
                this.driver=driver; 
        }
        
        @FindBy(xpath = ".//*[@id='tcom-main-nav']/ul/li[4]/a/span")
    	WebElement CertifiedUsedVehicles;

    	@FindBy(xpath = ".//*[@id='tcom-main-nav']/ul/li[5]/a/span")
    	WebElement Owners;

    	@FindBy (xpath = ".//*[@id='tcom-main-nav']/ul/li[6]/a/span")
    	WebElement Espanol;
    	
    	/*...Location overlay Elements...*/
    	@FindBy(xpath =".//*[@id='tcom-main-nav']/ul/li[3]/button")
    	WebElement SetLocation;
    	
    	@FindBy(css =".tcom-zipcode-changer-input.sub-tablet")
    	WebElement Zipcodefield;
    	
    	@FindBy(css=".tcom-submit")
    	WebElement Submit;
    	
    	@FindBy(xpath = "//button[contains(.,'Close')]")
    	WebElement CloseOverlay;         
    	
    	/*...Search field Elements...*/
    	
    	@FindBy(xpath = ".//*[@id='tcom-main-nav']/ul/li[7]/button")
    	WebElement Search;
    	
    	@FindBy(xpath="//input[contains(@placeholder,'Type here to search')]")
    	WebElement Searchbox;
    	
    	@FindBy(xpath="//button[contains(.,'GO')]")
    	WebElement Search_GoBtn;
        
 // Defining all the user actions (Methods) that can be performed on Utility nav
 
    	switchWindows Winswitch = new switchWindows();
    	
    	public void locationOverlay(){
    		
    		/*....close location overlay without input...*/
    		SetLocation.click();
    		CloseOverlay.click();
    		
    		/*...Enter zipcode in location overlay...*/
    		SetLocation.click();
    		Zipcodefield.sendKeys("12345");
    		Submit.click();
    		
    	}
    	
    	
    	public void tcuv(){
			   		
    		CertifiedUsedVehicles.click();
    		Winswitch.WinSwitch(driver);
    		   		  		
    		}
    	
    	public void Owners(){
			
     		Owners.click();
     		Winswitch.WinSwitch(driver);
    		  		
    		}
    	
    	public void EspLang(){
			
    		Espanol.click();
    		  		}
    	
    	
    	public void searchOverlay(){
    		
    		/*....search text...*/
		Search.click();
		Searchbox.sendKeys("Toyota");
		Search_GoBtn.click();
    		
    	}
    	
    	
  
}