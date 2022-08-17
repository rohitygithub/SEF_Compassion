package sef.compassion.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import sef.compassion.utilities.Utilities;


public class BaseClass {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String url = "https://services.compassionuk.org/sef/";
	
	 By byUsername = By.id("username");
     By byPassword = By.id("password");
     By byLoginButton = By.id("login");
	
    @Parameters({"username","password"}) 
	@BeforeMethod(groups = {"All", "SEF_FamilySponsorshipRN", "SEF_IndividualSponsorshipRN", "SEF_CoupleSponsorshipRN", "SEF_FriendsORGroupSponsorshipRN",
			                    "SEF_OrganizationSponsorshipRN"})
	public void setupApplication(@Optional ("GC_2") String username, @Optional("G33con0404") String password) {
		
		Reporter.log("************************ Browser Session Started ************************", true);
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
//	    To Handle Chrome Browser Crashes in server
		options.addArguments("--no-sandbox");
//		options.addArguments("--headless"); //should be enabled for Jenkins
		options.addArguments("--disable-dev-shm-usage"); //should be enabled for Jenkins
		options.addArguments("--window-size=1920x1080"); //should be enabled for Jenkinss
		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
		
		Utilities.hardWait(3);
        
        driver.findElement(byUsername).sendKeys(username);
        driver.findElement(byPassword).sendKeys(password);
        
        wait.until(ExpectedConditions.elementToBeClickable(byLoginButton));
        driver.findElement(byLoginButton).click();
        Utilities.hardWait(5);
	
		Reporter.log("************************ Application Started ************************", true);
	}
	
	@AfterMethod(groups = {"All", "SEF_FamilySponsorshipRN", "SEF_IndividualSponsorshipRN", "SEF_CoupleSponsorshipRN", "SEF_FriendsORGroupSponsorshipRN",
			                "SEF_OrganizationSponsorshipRN"})
	public void closeApplication() throws InterruptedException
	{
		 
		 Utilities.hardWait(5);
	     driver.quit();
	  
	  Reporter.log("************************ Browser Session End ************************", true);
	}

}
