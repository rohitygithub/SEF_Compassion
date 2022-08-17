package sef.compassion.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sef.compassion.utilities.Utilities;



public class new_user extends BaseClass {
	
	
	
	By byglobalcheckbox             =  By.xpath("//div[2]/div[2]/div[2]/input[@name='child-pool']");
	By bySearchButton               = By.xpath("//button[@id='global-search']");
	By byHoldImportButton           = By.xpath("//div[1]/div[1]/div[2]//button[text()='Hold & Import in RN']");
	By byapplicationcode            =  By.xpath("//div[1]/div[1]/div[3]/div[1]/input[@id='barcode']");
	By bySSSourcedropdown           =  By.xpath("//div[1]/div[1]/div[4]/div[1]/div[1]/i[@class='dropdown icon']");
	By bySelectSpportergrouptype    =  By.xpath("//div[1]/div[3]/div[2]/div[1]/div[1]/i[@class='dropdown icon']");
	By byTitledropdown              =  By.xpath("//div[3]/div[1]//div[@class='ui dropdown selection title']");
	By byFindAddress                =  By.xpath("//div[4]/div[3]/div[1]/i[1]");
	By byFirstName                  =  By.xpath("//div[1]/div[3]//div[1]/input[@name='name[]']");
	By byLastName                   =  By.xpath("//div[3]/div[3]/div[1]/input[@name='surname[]']");
	By byPostCode                   =  By.xpath("//div[3]/div[2]/div[1]/div[4]/div[1]/div[1]/input[@name='postcode[]']");
	By byclickOnFindMyAddressButton =  By.xpath("//div[1]/div[4]/div[2]/button[@id='findmyaddress0']");
	By byclickonEmail               =  By.xpath("//div[3]/div[2]/div[1]/div[8]/div[1]/div[1]/input[@class='email-validate']");
    By bySupporterGPname            = By.xpath("//div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]");
    By byDDISourceDropdown          = By.xpath("//div[7]/div[2]/div[2]/div[2]/div[1]//div[@class='ui dropdown selection']");
    By byAccountNameTextbox         = By.xpath("//div[@class='ui input ukborder']//input[@id='accountname']");
	By byAccountNumberTextbox       = By.xpath("//div[@class='ui input ukborder']//input[@id='accountnumber']");
	By bySortcodeTextbox            = By.xpath("//div[@class='ui input ukborder']//input[@id='sortcode']");
	By byAccountValidateButton      = By.xpath("//div[5]/div[1]//button[@id='validateBankAccount']");
	By byValidateMsg                = By.xpath("//label[contains(text(),'Bank Account Validated Successfully.')]");
	By bySubmitButton               = By.xpath("//div[10]/div[1]/div[1]/div[1]/div[2]//input[@id='submit']");
	By byDonationDate               = By.xpath("//div[@class='ui input ukborder']/input[@class='datepicker hasDatepicker']");
	
	
@Parameters({"byapplicationcode","byFirstName","byLastName","byPostCode","byAccountNameTextbox","byAccountNumberTextbox","bySortcodeTextbox"})	
@Test
public void GlobalChildPool(@Optional("1150") String appcode,
		                    @Optional("Joe") String  FName,
		                    @Optional("Root") String LName,
		                    @Optional("GU51 2UT") String PostCode,
		                    @Optional("David") String AccNameTB,
		                    @Optional("34661743") String AccNumberTB,
		                    @Optional("602003") String SortcodeTB) {
	
	driver.findElement(byglobalcheckbox).click();
	Utilities.hardWait(2);
	driver.findElement(bySearchButton).click();
	Utilities.hardWait(5);
	
	driver.findElement(byHoldImportButton).click();
	Utilities.hardWait(10);
	driver.findElement(byapplicationcode).sendKeys(appcode);
	Utilities.hardWait(2);
	
	driver.findElement(bySSSourcedropdown).click();
	Utilities.hardWait(2);
	
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
	String value = list.get(1).getText();
	System.out.println(value);
	Utilities.hardWait(1);
	list.get(1).click();
	Utilities.hardWait(2);
	
	driver.findElement(bySelectSpportergrouptype).click();
	Utilities.hardWait(2);
	
	List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
	String value2 = list1.get(0).getText();
	System.out.println(value2);
	Utilities.hardWait(1);
	list1.get(0).click();
	Utilities.hardWait(2);
	
	driver.findElement(byTitledropdown).click();
	Utilities.hardWait(3);
	
	List<WebElement> list3 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
	String value3 = list3.get(1).getText();
	System.out.println(value3);
	Utilities.hardWait(1);
	list3.get(1).click();
	Utilities.hardWait(2);
	
	
	
	driver.findElement(byFirstName).sendKeys(FName);
	driver.findElement(byLastName).sendKeys(LName);
	driver.findElement(byPostCode).sendKeys(PostCode);
	Utilities.hardWait(1);
	driver.findElement(byclickOnFindMyAddressButton).click();
	Utilities.hardWait(3);
	
	driver.findElement(byFindAddress).click();
	Utilities.hardWait(1);
	
	List<WebElement> list4 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
	String value4 = list4.get(1).getText();
	System.out.println(value4);
	Utilities.hardWait(1);
	list4.get(1).click();
	Utilities.hardWait(3);
	
	driver.findElement(byclickonEmail).sendKeys("yelamkarr174@gmail.com");
	Utilities.hardWait(3);
	
	driver.findElement(bySupporterGPname).click();
	Utilities.hardWait(1);
	
	List<WebElement> list5 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
	String value5 = list5.get(1).getText();
	System.out.println(value5);
	Utilities.hardWait(1);
	list5.get(1).click();
	Utilities.hardWait(3);
	
	driver.findElement(byDDISourceDropdown).click();
	Utilities.hardWait(1);
	
	List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
	String value6 = list2.get(1).getText();
	System.out.println(value6);
	Utilities.hardWait(1);
	list2.get(1).click();
	Utilities.hardWait(4);
	
	driver.findElement(byAccountNameTextbox).sendKeys(AccNameTB);
	driver.findElement(byAccountNumberTextbox).sendKeys(AccNumberTB);
	driver.findElement(bySortcodeTextbox).sendKeys(SortcodeTB);
	Utilities.hardWait(1);
	driver.findElement(byAccountValidateButton).click();
	Utilities.hardWait(2);
	
	String actualMsg = driver.findElement(byValidateMsg).getText();       
	System.out.println("Validate Actual Msg: "+actualMsg);
	String expectedMsg = "Bank Account Validated Successfully.";
	System.out.println("Validate Expected Msg: "+expectedMsg);
	Assert.assertEquals(actualMsg, expectedMsg);
	Utilities.hardWait(4);
	
	
	String expectedday = "1";
	String expectedmonth ="August";
	String expectedyear ="2022";
	
	driver.findElement(byDonationDate).click();
	Utilities.hardWait(4);
	
	while(true) {
		
		String actualmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String actualyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		//comparing (actual and expected)month and year 
		if(actualmonth.equals(expectedmonth) && actualyear.equals(expectedyear)) {
			
			//get all day's list
			List<WebElement> daylist = driver.findElements(By.xpath("//table/tbody/tr/td"));   
			
			//using for-each loop
			for(WebElement W :daylist ) {
				
				String calendarday = W.getText();
				//Comparing Actual day and expected day
				if(calendarday.equals(expectedday)) {
					W.click();
					break;
				}
			}
			break;
		
		}else {
			//click on next button
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		System.out.println("*******'\n'");
		System.out.println("The Selected Date is -" + expectedday +"/" + expectedmonth + "/" + expectedyear );
		System.out.println("*******'\n'");
	}
	
	
	driver.findElement(bySubmitButton).click();
	Utilities.hardWait(60);
	
    String response = driver.findElement(By.xpath("//table[@id='Responsetable']")).getText();
    System.out.println("Responce---->"+'\n' + response);
    Utilities.hardWait(15);
    driver.findElement(By.xpath("//div[@class='ui cancel blue button continue']")).click();
  
	
}
}