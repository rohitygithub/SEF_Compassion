package sef.compassion.testcases;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import sef.compassion.utilities.Utilities;

public class SEF_IndividualGlobalPool extends BaseClass {
	
	By byGlobalCheckbox = By.xpath("//div[@id='tab-commitment']/child::div[1]/child::div[2]/child::div[2]/child::div[2]//input[1]");
	By bySearchButton = By.xpath("//button[@id='global-search']");
	By byHoldImportBotton = By.xpath("//div[1]/div[1]/div[2]//button[text()='Hold & Import in RN']");
	By byAppcodeId = By.xpath("//div[@class='col-lg-3']//div[@class='ui input ukborder']//input[@id='barcode']");
	By bySponsorshipSourceDropdown = By.xpath("//div[@class='col-lg-3']//div[@class='form-group required field']//div[@class='ui dropdown selection']");
	By bySupporterTypeDropdown = By.xpath("//div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[@class='ui dropdown selection']");
	
	By byRNIDTextbox = By.xpath("//input[@id='sprnid0']");
	By bySearchSupporter = By.xpath("//div[2]/div[3]/div[2]/button[@id='fetchsup0']");
	By byTitleDropdown = By.xpath("//form[1]/div[3]/div[2]/div[1]/div[3]/div[1]//div[@class='ui dropdown selection title']");
	By byClickOnSupporterRecordbutton = By.xpath("//tr[@id='datatr0']");
	By byOkButton = By.xpath("//button[contains(text(),'OK')]");
	By byDDISourceDropdown = By.xpath("//div[7]/div[2]/div[2]/div[2]/div[1]//div[@class='ui dropdown selection']");
	By byAccountNameTextbox = By.xpath("//div[@class='ui input ukborder']//input[@id='accountname']");
	By byAccountNumberTextbox = By.xpath("//div[@class='ui input ukborder']//input[@id='accountnumber']");
	By bySortcodeTextbox = By.xpath("//div[@class='ui input ukborder']//input[@id='sortcode']");
	By byAccountValidateButton = By.xpath("//div[5]/div[1]//button[@id='validateBankAccount']");
	By byValidateMsg = By.xpath("//label[contains(text(),'Bank Account Validated Successfully.')]");
	By bySubmitButton = By.xpath("//div[10]/div[1]/div[1]/div[1]/div[2]//input[@id='submit']");
	
	@Test
	public void CommitmentGloblchild() throws InterruptedException {
		
	
		driver.findElement(byGlobalCheckbox).click();
		driver.findElement(bySearchButton).click();
		
		 Utilities.hardWait(10);
		 
		String GloblId = driver.findElement(byHoldImportBotton).getAttribute("id");
		String childinfo = driver.findElement(byHoldImportBotton).getAttribute("onclick");
		System.out.println("GloblId: " + GloblId);
		System.out.println("Child Details: " + childinfo);
		driver.findElement(byHoldImportBotton).click();
		Utilities.hardWait(10);
		driver.findElement(byAppcodeId).sendKeys("1150");
		Utilities.hardWait(2);
		
		driver.findElement(bySponsorshipSourceDropdown).click();
		Utilities.hardWait(1);
		List<WebElement> list = driver.findElements(By.xpath("//div[1]/div[4]/div[1]/div[1]/div[@class='menu transition visible']//div"));
		System.out.println(list.size());
		String value = list.get(1).getText();
		System.out.println(value);
		Utilities.hardWait(1);
		list.get(1).click();
		
		Utilities.hardWait(2);
		
		driver.findElement(bySupporterTypeDropdown).click();
		Utilities.hardWait(1);
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		System.out.println(list1.size());
		String value1 = list1.get(0).getText();
		System.out.println(value1);
		Utilities.hardWait(1);
		list1.get(0).click();
		
		Utilities.hardWait(2);
		driver.findElement(byRNIDTextbox).sendKeys("229207");
		Utilities.hardWait(1);
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
//				System.out.println(driver.switchTo().window(child_window).getTitle());
//				System.out.println("Print the name"+child_window);
			}
		}
		Utilities.hardWait(1);
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
//						System.out.println(driver.switchTo().window(child_window).getTitle());
//						System.out.println("Print the name"+child_window);
					}
				}
		Utilities.hardWait(1);
		driver.findElement(byOkButton).click();

		Utilities.hardWait(3);
		
		driver.findElement(byDDISourceDropdown).click();
		Utilities.hardWait(1);
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		System.out.println(list2.size());
		String value2 = list2.get(1).getText();
		System.out.println(value2);
		Utilities.hardWait(1);
		list2.get(1).click();
		
		driver.findElement(byAccountNameTextbox).sendKeys("David");
		driver.findElement(byAccountNumberTextbox).sendKeys("34661743");
		driver.findElement(bySortcodeTextbox).sendKeys("602003");
		Utilities.hardWait(1);
		driver.findElement(byAccountValidateButton).click();
		Utilities.hardWait(2);
		
		String actualMsg = driver.findElement(byValidateMsg).getText();//label[contains(text(),'Bank Account Validated Successfully.')]
		System.out.println("Validate Actual Msg: "+actualMsg);
		String expectedMsg = "Bank Account Validated Successfully.";
		System.out.println("Validate Expected Msg: "+expectedMsg);
		Assert.assertEquals(actualMsg, expectedMsg);
		
		driver.findElement(By.xpath("//input[@id='ffdate']")).click();
		new WebDriverWait(driver ,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='ui-datepicker-div']")));
		
		SelectDate("1","Augst","2022");
		
		Utilities.hardWait(2);
		driver.findElement(bySubmitButton).click();
		
		Utilities.hardWait(5);
		
	}
	
	// Selecting the calendar date 
	// If February month selected and date is greater than 29 and if in any month, 
	// date is greater than 31 then it will return nothing and prints wrong date 
	// with given month and year 
	
	public static void SelectDate (String exDay, String exMonth, String exYear) { 
		if (exMonth.equals("February") && Integer.parseInt(exDay) > 29) 
		{
			System.out.println("Wrong date:" + exMonth + ":" + exDay); 
			return;
		}
		
		if (Integer.parseInt(exDay) > 31) 
		{
			System.out.println("wrong date:" + exMonth + ":" + exDay); 
			return;
		}
	String MonthYear = driver. findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]//span[2]")).getText();
	// when month and year does not match, keep looping
	System.out.println("before while print month year: "+MonthYear);
	
	while (!getMonthYear (MonthYear)[0].equals (exMonth) && getMonthYear (MonthYear)[1].equals (exYear)) {
	Utilities.hardWait(2);
	driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/a[@title='Next']")).click(); 
	
	MonthYear = driver. findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]//span[2]")).getText();
	System.out.println("In while print month year: "+MonthYear);
	}
	Utilities.hardWait(2);
	driver. findElement(By.xpath("//td//a[text()='"+exDay+"']")).click(); 
	Utilities.hardWait(10);
//	driver.close();	
	}
	
	public static String[] getMonthYear (String MonthYear) {
		return MonthYear.split("");
	}

	
}
