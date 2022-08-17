package sef.compassion.testcases;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sef.compassion.utilities.Utilities;

public class SEF_IndividualSponsorshipRN extends BaseClass {
	
	By byglobalcheckbox               = By.xpath("//div[2]/div[2]/div[2]/input[@name='child-pool']");
	By bySearchButton                 = By.xpath("//button[@id='global-search']");
	By byHoldImportButton             = By.xpath("//div[1]/div[1]/div[2]//button[text()='Hold & Import in RN']");
	By byRNChildPoolcheckbox          = By.xpath("(//div[1]/input[@name='child-pool'])[1]");
	By byBeneficiaryLocalID           = By.xpath("(//div[@class='ui input ukborder']/input[@id='referenceid'])[1]");
	By bySearchButton2                = By.xpath("(//button[@id='specific-search'])[1]");
	By bySelectbutton                 = By.xpath("//div[@class='col-lg-12']/button[@id='select-child']");
	By byApplicationCode              = By.xpath("//div[@class='col-lg-3']/div[@class='ui input ukborder']/input[@name='barcode']");
	By bySponsorshipSource            = By.xpath("//div[@class='col-lg-3']/div[@class='form-group required field']/div[@class='ui dropdown selection']");
	By bySupporterGroupType           = By.xpath("//div[3]/div[2]/div[1]/div[@class='ui dropdown selection']");
	By byTitledropdown                = By.xpath("//div[3]/div[1]//div[@class='ui dropdown selection title']");
	By byFirstName                    = By.xpath("//div[1]/div[3]//div[1]/input[@name='name[]']");
	By byLastName                     = By.xpath("//div[3]/div[3]/div[1]/input[@name='surname[]']");
	By byclickonEmail                 = By.xpath("//div[3]/div[2]/div[1]/div[8]/div[1]/div[1]/input[@class='email-validate']");
	By bySupporterGPname              = By.xpath("//div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[@class='ui dropdown selection']");
	By byDDISourceDropdown            = By.xpath("//div[7]/div[2]/div[2]/div[2]/div[1]//div[@class='ui dropdown selection']");
	By byAccountNameTextbox           = By.xpath("//div[@class='ui input ukborder']//input[@id='accountname']");
	By byAccountNumberTextbox         = By.xpath("//div[@class='ui input ukborder']//input[@id='accountnumber']");
	By bySortcodeTextbox              = By.xpath("//div[@class='ui input ukborder']//input[@id='sortcode']");
	By byAccountValidateButton        = By.xpath("//div[5]/div[1]//button[@id='validateBankAccount']");
	By byValidateMsg                  = By.xpath("//label[contains(text(),'Bank Account Validated Successfully.')]");
	By byDonationDate                 = By.xpath("//div[@class='ui input ukborder']/input[@class='datepicker hasDatepicker']");
	By bySubmitButton                 = By.xpath("//div[10]/div[1]/div[1]/div[1]/div[2]//input[@id='submit']");
	By byReportissuebutton            = By.xpath("//div[@class='ui reportIssue blue button hidden']");
	By byContinuebutton               = By.xpath("//div[@class='ui cancel blue button continue']");
	
	@Parameters({"byApplicationCode", "byFirstName", "byLastName", "byclickonEmail", "byAccountNameTextbox", "byAccountNumberTextbox",
		"bySortcodeTextbox"})
	@Test (groups = {"All", "SEF_IndividualSponsorshipRN"})
	public void individual(@Optional ("1150") String AppCode,
			               @Optional ("Sean") String FirstName,
			               @Optional ("Brown") String LastName,
			               @Optional ("jodol14188@chimpad.com") String Email,
			               @Optional ("Mr Sean  Brown") String AccName,
			               @Optional ("34661743") String AccNumber,
			               @Optional ("602003") String SortCode) {
		
		System.out.println("//**** Individual Sponsorship Started ****//" +'\n');
		
		driver.findElement(byglobalcheckbox).click();
		driver.findElement(bySearchButton).click();
		Utilities.hardWait(5);
		
		driver.findElement(byHoldImportButton).click();
		Utilities.hardWait(5);
		
		String BID = driver.findElement(By.xpath("//div[1]/div[1]/div[5]/span[2]")).getText();
		Utilities.hardWait(2);
		
		driver.findElement(byRNChildPoolcheckbox).click();
		Utilities.hardWait(2);
		
		driver.findElement(byBeneficiaryLocalID).sendKeys(BID);
		Utilities.hardWait(2);
		
		System.out.println("Beneficiary Local ID : ---  " + BID +'\n');
		
		driver.findElement(bySearchButton2).click();
		Utilities.hardWait(3);
		
		driver.findElement(bySelectbutton).click();
		Utilities.hardWait(2);
		
		driver.findElement(byApplicationCode).sendKeys(AppCode);
		Utilities.hardWait(2);
		
		driver.findElement(bySponsorshipSource).click();
		Utilities.hardWait(2);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		String value = list.get(1).getText();
		System.out.println(value);
		Utilities.hardWait(1);
		list.get(1).click();
		Utilities.hardWait(2);
		
		driver.findElement(bySupporterGroupType).click();
		Utilities.hardWait(2);
		
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		String value1 = list1.get(0).getText();
		System.out.println(value1);
		Utilities.hardWait(1);
		list1.get(0).click();
		Utilities.hardWait(4);
		
		driver.findElement(byTitledropdown).click();
		Utilities.hardWait(2);
		
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		String value2 = list2.get(1).getText();
		System.out.println(value2);
		Utilities.hardWait(1);
		list2.get(1).click();
		Utilities.hardWait(2);
		
		driver.findElement(byFirstName).sendKeys(FirstName);
		System.out.println("First Name : " + FirstName);
		driver.findElement(byLastName).sendKeys(LastName);
		System.out.println("Last Name : " + LastName);
		driver.findElement(byclickonEmail).sendKeys(Email);
		System.out.println("Email : " + Email + '\n');
		Utilities.hardWait(4);
		
		driver.findElement(bySupporterGPname).click();
		Utilities.hardWait(2);
		
		List<WebElement> list3 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		String value3 = list3.get(1).getText();
		System.out.println(value3);
		Utilities.hardWait(1);
		list3.get(1).click();
		Utilities.hardWait(3);
				
		Utilities.hardWait(5);
		driver.findElement(byDDISourceDropdown).click();
		Utilities.hardWait(1);
				
		List<WebElement> list4 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		String value4 = list4.get(1).getText();
		System.out.println(value4);
		Utilities.hardWait(1);
		list4.get(1).click();
		Utilities.hardWait(4);
				
		driver.findElement(byAccountNameTextbox).sendKeys(AccName);
		driver.findElement(byAccountNumberTextbox).sendKeys(AccNumber);
		driver.findElement(bySortcodeTextbox).sendKeys(SortCode);
		Utilities.hardWait(1);
		driver.findElement(byAccountValidateButton).click();
		Utilities.hardWait(3);
				
		String actualMsg = driver.findElement(byValidateMsg).getText();//label[contains(text(),'Bank Account Validated Successfully.')]
		System.out.println("Validate Actual Msg: "+actualMsg);
		String expectedMsg = "Bank Account Validated Successfully.";
		System.out.println("Validate Expected Msg: "+expectedMsg);
		Assert.assertEquals(actualMsg, expectedMsg);
		Utilities.hardWait(5);
		

				
		driver.findElement(byDonationDate).click();
		Utilities.hardWait(4);
		
		//list takes all dates from selected month (given path is whole month selected border)
		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']"));
				
		//created variable "total_dates" to store all dates from list's "dates"
		int total_dates = dates.size();
		Utilities.hardWait(2);
				
				
		//for loop checks all dates from calendar till all dates are less than 0
		for (int i =0; i<total_dates;i++)
			{
				//gets all dates from calendar and prints
				String date = dates.get(i).getText();

					
					
				//in this loop , checks selected calendar's date with "1" by "date" obj wchich is got text from calendar
				if(date.equals("1"))
				{
					break;	//if calendar's date is equal to 1 then breaks here and clicks wc 
				}
				else
				{
					driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();	//else clicks on next calendar's button
				}
					
				}
				
				//below wc's path is 1 date's path from all calendar's month from Jan-Dec.
				// If checked 1 date's xpath from Jan-Dec then there are 3 common paths which written in or
				//and or means it will check all xpaths of 1 dates and will select and click among Jan-Dec.
				WebElement wc = driver.findElement(By.xpath("//a[@class='ui-state-default' or class=\"ui-state-default ui-state-hover\" or contains(text(),'1')]"));
				wc.click();
				Utilities.hardWait(2);
				
				//get text which element that is 1 is selected
				String day = wc.getText();
				String month_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText(); //get month and year text
				Utilities.hardWait(4);
				System.out.println("Date selected : "+day+" "+month_year);
					
				System.out.println("//**** Individual Sponsorship Completed ****//" + '\n');
				
			 driver.findElement(bySubmitButton).click();
			 Utilities.hardWait(60);
				
			 String response = driver.findElement(By.xpath("//table[@id='Responsetable']")).getText();
			 System.out.println("Responce---->"+'\n' + response);
			 Utilities.hardWait(15);
			 
			 WebElement Reportissue = driver.findElement(byReportissuebutton);
			 
			 if(Reportissue.isDisplayed()) {
				 
				 Reportissue.click();
			 }
			 
			 else {
				 
//				 driver.findElement(byContinuebutton).click();
			 }
			 
			 driver.navigate().to(url);
		
		
		
		
	}

}
