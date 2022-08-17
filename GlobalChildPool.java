package sef.compassion.testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sef.compassion.utilities.Utilities;

public class GlobalChildPool extends BaseClass {
	
	By byglobalcheckbox               = By.xpath("//div[2]/div[2]/div[2]/input[@name='child-pool']");
	By bySearchButton                 = By.xpath("//button[@id='global-search']");
	By byHoldImportButton             = By.xpath("//div[1]/div[1]/div[2]//button[text()='Hold & Import in RN']");
	By byApplicationCode              = By.xpath("//div[@class='col-lg-3']/div[@class='ui input ukborder']/input[@name='barcode']");
	By bySponsorshipSource            = By.xpath("//div[@class='col-lg-3']/div[@class='form-group required field']/div[@class='ui dropdown selection']");
	By bySupporterGroupType           = By.xpath("//div[3]/div[2]/div[1]/div[@class='ui dropdown selection']");
	By byEnterRNID                    = By.xpath("//div[@class='ui input ukborder']/input[@name='sprnid0']");
	By bySearchSupporter              = By.xpath("//div[3]/div[@class='col-lg-4']/button[@name='fetchsup0']");
	By byClickOnSupporterRecordbutton = By.xpath("//tr[@id='datatr0']");
	By byOkButton                     = By.xpath("//body/div[8]/div[7]/div[1]/button[contains(text(),'OK')]");
	By byTitledropdown                = By.xpath("//form[1]/div[3]/div[2]/div[1]/div[3]/div[1]//div[@class='ui dropdown selection title']");
	By byFirstName                    = By.xpath("//div[1]/div[3]//div[1]/input[@name='name[]']");
	By byLastName                     = By.xpath("//div[3]/div[3]/div[1]/input[@name='surname[]']");
	By byPostCode                     = By.xpath("//div[3]/div[2]/div[1]/div[4]/div[1]/div[1]/input[@name='postcode[]']");
	By byclickOnFindMyAddressButton   = By.xpath("//div[1]/div[4]/div[2]/button[@id='findmyaddress0']");
	By bySupporterGroupnm             = By.xpath("//div[@class='col-lg-3']/div[@class='ui input ukborder']/input[@name='sgname']");
	By bySGPreferredname              = By.xpath("//div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[@class='ui dropdown selection']");
	By byDDISourceDropdown            = By.xpath("//div[7]/div[2]/div[2]/div[2]/div[1]//div[@class='ui dropdown selection']");
	By byAccountNameTextbox           = By.xpath("//div[@class='ui input ukborder']//input[@id='accountname']");
	By byAccountNumberTextbox         = By.xpath("//div[@class='ui input ukborder']//input[@id='accountnumber']");
	By bySortcodeTextbox              = By.xpath("//div[@class='ui input ukborder']//input[@id='sortcode']");
	By byAccountValidateButton        = By.xpath("//div[5]/div[1]//button[@id='validateBankAccount']");
	By byValidateMsg                  = By.xpath("//label[contains(text(),'Bank Account Validated Successfully.')]");
	By bySubmitButton                 = By.xpath("//div[10]/div[1]/div[1]/div[1]/div[2]//input[@id='submit']");
	By byDonationDate                 = By.xpath("//div[@class='ui input ukborder']/input[@class='datepicker hasDatepicker']");
	
	@Parameters({"byApplicationCode", "byEnterRNID", "byAccountNameTextbox", "byAccountNumberTextbox", "bySortcodeTextbox"})
	@Test
	public void SearchGlobalChild(@Optional ("1150") String appcode,
			                      @Optional ("229207") String RNID,
			                      @Optional ("David") String AccName,
			                      @Optional ("34661743") String AccNumber,
			                      @Optional ("602003") String SortCode)  {
		
		driver.findElement(byglobalcheckbox).click();
		driver.findElement(bySearchButton).click();
		Utilities.hardWait(5);
		
		driver.findElement(byHoldImportButton).click();
		Utilities.hardWait(10);
		driver.findElement(byApplicationCode).sendKeys(appcode);
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
		String value2 = list1.get(0).getText();
		System.out.println(value2);
		Utilities.hardWait(1);
		list1.get(0).click();
		Utilities.hardWait(3);
		
		driver.findElement(byEnterRNID).sendKeys(RNID);
		Utilities.hardWait(3);
		driver.findElement(bySearchSupporter).click();
		Utilities.hardWait(5);
		

		
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
				
		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
			{
			   String child_window=I1.next();
			   if(!parent.equals(child_window))
				{
					driver.switchTo().window(child_window);
				}
			}
			Utilities.hardWait(5);
			driver.findElement(byClickOnSupporterRecordbutton).click();
			Utilities.hardWait(5);
				
			// It will return the parent window name as a String
			String parent_Window=driver.getWindowHandle();
						
			Set<String>I=driver.getWindowHandles();

			// Now iterate using Iterator
			Iterator<String> I2= I.iterator();

		while(I2.hasNext())
			{
				String parent_Window1=I2.next();
				if(!parent_Window.equals(parent_Window1))
						{
							driver.switchTo().window(parent_Window1);
						}
						}
		Utilities.hardWait(10);
		driver.findElement(byOkButton).click();

		Utilities.hardWait(4);
		driver.findElement(byDDISourceDropdown).click();
		Utilities.hardWait(1);
				
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		String value5 = list2.get(1).getText();
		System.out.println(value5);
		Utilities.hardWait(1);
		list2.get(1).click();
		Utilities.hardWait(4);
				
		driver.findElement(byAccountNameTextbox).sendKeys(AccName);
		driver.findElement(byAccountNumberTextbox).sendKeys(AccNumber);
		driver.findElement(bySortcodeTextbox).sendKeys(SortCode);
		Utilities.hardWait(1);
		driver.findElement(byAccountValidateButton).click();
		Utilities.hardWait(2);
				
		String actualMsg = driver.findElement(byValidateMsg).getText();//label[contains(text(),'Bank Account Validated Successfully.')]
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
	
	
	
	
	
	

