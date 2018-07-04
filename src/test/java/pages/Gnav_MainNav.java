package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import globals.mouseHover;

public class Gnav_MainNav {

	WebDriver driver;
	 
    public Gnav_MainNav(WebDriver driver) {
		
            this.driver=driver; 
    }
	
    @FindBy(css=".tcom-nav-logo")
	static
	WebElement Toyotalogo;
	
	@FindBy(xpath = "//*[@id='tcom-secondary-nav']/ul/li[2]/button")
	WebElement SelectVehicleDropdown;
	
	@FindBy(xpath="//*[@id='tcom-secondary-nav']/ul/li[3]/button")
	WebElement ShoppingToolsDropdown;
	
	@FindBy(xpath=".//*[@id='tcom-secondary-nav']/ul/li[4]/a/span")
	WebElement FindADealer;
	
	@FindBy(xpath = ".//*[@id='tcom-secondary-nav']/ul/li[5]/a/span")
	WebElement BuildAndPrice;
	
	@FindBy(xpath = ".//*[@id='tcom-secondary-nav']/ul/li[6]/a/span")
	WebElement LocalSpecials;
	
	/*...Select Vehicle Drawer Elements...*/
	@FindBy(css=".tcom-vehicles-drawer-tabs>nav>ul>li>a")
	List <WebElement> SelectVehicleTabs;
	
	@FindBy(css=".gnav-jelly-wrap>img")
	//@FindBy(xpath=".//img[contains(@data-di-id='#/tcom/img/blank.gif)]")
	List <WebElement> VehicleImages;
	
	@FindBy(css="#cars-minivan>ul>li")
	List <WebElement> CarsAndMinivans;
	
	@FindBy(css="#trucks>ul>li")
	List <WebElement> Trucks;
	
	@FindBy(css="#crossovers-suvs>ul>li")
	List <WebElement> CrossoversAndSUVs;
	
	@FindBy(css="#hybrids-fcv>ul>li")
	List <WebElement> HybridsAndFCV;
	
	@FindBy(xpath=".//*[@id='tcom-gnav-vehicles-carousel']/div/div/div[5]/ul/li")
	List <WebElement> UpcomingVehicles;
	
	@FindBy(xpath=".//*[@id='tcom-shopping-tools-drawer']/div/nav/ul/li/a")
	List <WebElement> ShoppingToolsTab;
	
	@FindBy(css=".//*[@id='tcom-gnav-all-vehicles']")
	WebElement AllVehicles;
	
	@FindBy(xpath=".//*[@id='cars-minivan']/ul/li/div/a[1]")
	List <WebElement> CarsBuildLink;
	
	@FindBy(xpath=".//*[@id='cars-minivan']/ul/li/div/a[2]")
	List <WebElement> CarsSpecialsLink;
    
    
    mouseHover mhover= new mouseHover();
    
	
public void SelectVehicle() throws Exception {
		
		int vehicleCount = VehicleImages.size();
				
		/*.....Count of total number of vehicles.....*/
		int vehicleCategoryCount = SelectVehicleTabs.size();
		System.out.println("Number of Vehicle Categories "+ vehicleCategoryCount);
		
		/*...Count of total number of Cars & Minivans....*/
		int TotalCars=CarsAndMinivans.size();
		System.out.println("Total number of Cars and minivans "+ TotalCars);
		
		
		/*...Count of total number of Trucks....*/
		int TotalTrucks=Trucks.size();
		System.out.println("Total number of Trucks "+ TotalTrucks);
		
		/*...Count of total number of Crossovers & SUVs....*/
		int TotalCrossovers=CrossoversAndSUVs.size();
		System.out.println("Total number of Crossovers and SUVs "+ TotalCrossovers);
		
		
		/*...Count of total number of Hybrids & FCVs....*/
		int TotalHybrids=HybridsAndFCV.size();
		System.out.println("Total number of Hybrids and FCVs "+ TotalHybrids);
		
		/*...Count of total number of Upcoming Vehicles....*/
		int TotalUVP=UpcomingVehicles.size();
		System.out.println("Total number of Upcoming Vehicles "+ TotalUVP);
		
		/*....Functionality to test vehicle images...*/
		int vehicleIterator;
		Thread.sleep(1000);
		SelectVehicleDropdown.click();
		for (int i=0; i<vehicleCategoryCount;){
			System.out.println(SelectVehicleTabs.get(i).getText());
			if (SelectVehicleTabs.get(i).getText().equals("Cars & Minivans")){
				vehicleIterator = TotalCars;
				System.out.println("vehicle Iterator count" + vehicleIterator);
					for (int j=0; j<vehicleIterator; j++){
					CarsAndMinivans.get(j).click();
					Thread.sleep(1000);
					Toyotalogo.click();
					SelectVehicleDropdown.click();
					mhover.mouseHover(driver, CarsAndMinivans.get(j), CarsBuildLink.get(j));
					Thread.sleep(1000);
					Toyotalogo.click();
					SelectVehicleDropdown.click();
					mhover.mouseHover(driver, CarsAndMinivans.get(j),CarsSpecialsLink.get(j));
					Thread.sleep(1000);
					Toyotalogo.click();
					SelectVehicleDropdown.click();
					}
					i++;
					SelectVehicleTabs.get(i).click();
				}
						
			if (SelectVehicleTabs.get(i).getText().equals("Trucks")){
				vehicleIterator = TotalCars+TotalTrucks;
				System.out.println("vehicleInterator count" + vehicleIterator);
				for (int j=0; j<TotalTrucks; j++){
					Trucks.get(j).click();
					Thread.sleep(1000);
					Toyotalogo.click();
					SelectVehicleDropdown.click();
					SelectVehicleTabs.get(i).click();
					}
				i++;
				SelectVehicleTabs.get(i).click();
				}
			
			if (SelectVehicleTabs.get(i).getText().equals("Crossovers & SUVs")){
				vehicleIterator=TotalCars+TotalTrucks+TotalCrossovers;
				for (int j=0; j<TotalCrossovers; j++){
					CrossoversAndSUVs.get(j).click();
					Thread.sleep(1000);
					Toyotalogo.click();
					SelectVehicleDropdown.click();
					SelectVehicleTabs.get(i).click();
					}
				i++;
				SelectVehicleTabs.get(i).click();
				
			}
			if (SelectVehicleTabs.get(i).getText().equals("Hybrids & FCV")){
				for (int j=0; j<TotalHybrids ; j++){
					HybridsAndFCV.get(j).click();
					Thread.sleep(1000);
					if (driver.getTitle().contains("Toyota Mirai"))
							{
						driver.get("https://www.toyota.com/");
							}
					Toyotalogo.click();
					SelectVehicleDropdown.click();
					SelectVehicleTabs.get(i).click();
					}
				i++;
				SelectVehicleTabs.get(i).click();
				}
			
			if (SelectVehicleTabs.get(i).getText().equals("Upcoming Vehicles")){
				for (int j=0; j<TotalHybrids ; j++){
					UpcomingVehicles.get(j).click();
					Thread.sleep(1000);
					driver.navigate().back();
					SelectVehicleDropdown.click();
					SelectVehicleTabs.get(i).click();
					}
				}
			}
		/**** Functionality of All Vehicles link *****/
		SelectVehicleDropdown.click();
		AllVehicles.click();
		Toyotalogo.click();
		}
	
	public void ShoppingTools() throws Exception{
		int shoppingToolsCount=ShoppingToolsTab.size();
		System.out.println("Total links in Shopping Tools" + shoppingToolsCount);
		for (int i=0; i<shoppingToolsCount;i++){
			ShoppingToolsDropdown.click();
			Thread.sleep(1000);
			ShoppingToolsTab.get(i).click();
			Toyotalogo.click();
		}
	}
	
	public void ToyLogo()
	{
		Toyotalogo.click();
	}
	
	
	
	public void dealersLink()
	{
		FindADealer.click();
		Toyotalogo.click();
	}
	
	public void buildLink()
	{
		BuildAndPrice.click();
		Toyotalogo.click();
	}
	
	public void localspecialsLink()
	{
		LocalSpecials.click();
		Toyotalogo.click();
		
	}
	
		
	
	
	
	
}
