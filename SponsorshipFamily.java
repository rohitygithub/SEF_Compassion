package sef.compassion.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sef.compassion.utilities.Utilities;


public class SponsorshipFamily extends BaseClass {
	
	
		
		By byglobalpool 		= By.xpath("//div[2]/div[2]/div[2]/input[@name='child-pool']");
		By bysearch_button 		= By.id("global-search");
		By byhold_import		= By.xpath("//div[1]/div[1]/div[2]//button[text()='Hold & Import in RN']");
		By bylocal_id			= By.xpath("//div[1]/div[1]/div[5]/span[2]");
		By byrnpool				= By.xpath("//div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/input[@name='child-pool']");
		By byben_id_field		= By.xpath("//div[2]/div[4]/div[1]/div[2]/div[1]/input[@id='referenceid']");
		By byrn_search			= By.xpath("//div[2]/div[4]/div[1]/div[4]/button[@id='specific-search']");
		By byselect_button		= By.xpath("//button[@id='select-child']");
		By byappl_code 			= By.xpath("//div[1]/div[1]/div[3]/div[1]/input[@id='barcode']");
		By bysponsor_source		= By.xpath("//div[4]/div[1]/div[@class='ui dropdown selection']");
		By bysupporter_type		= By.xpath("//div[3]/div[2]/div[1]/div[@class='ui dropdown selection']");
		By bysearch_supprter	= By.xpath("//div[2]/button[@id='fetchsup0']");
		By bytitle				= By.xpath("//div[1]/div[3]/div[1]/div[1]/i[1]");   
		By byfirstname			= By.xpath("//div[3]/div[2]/div[1]/div[3]/div[2]/div[1]//input[@type='text']");
		By bylastname			= By.xpath("//div[3]/div[3]/div[1]//input[@id='surname0']");
		By byemail				= By.xpath("//div[8]/div[1]/div[1]//input[@id='emailid0']");
		By bytitle2				= By.xpath("//div[3]/div[2]/div[2]/div[4]/div[1]/div[1]");
		By byfirstname2			= By.id("name1");
		By bylastname2			= By.id("surname1");
		By byemail2				= By.id("emailid1");
		By bytitle3				= By.xpath("//div[3]/div[1]/div[5]/div[1]/div[1]/i[1]"); 
		By byfirstname3			= By.id("name2");
		By bylastname3			= By.id("surname2");
		By byemail3				= By.id("emailid2");
		By byadd_row_button		= By.xpath("//button[contains(text(),'Add row')]");
		By bysupporter_group  	= By.xpath("//div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]");
		By bysupp_gr_field  	= By.xpath("//input[@id='other_sup_preferred_name']");
		By byDDI_source 		= By.xpath("//div[7]/div[2]/div[2]/div[2]/div[1]//div[@class='ui dropdown selection']");
		By byacc_name			= By.xpath("//div[7]/div[2]/div[3]/div[1]/div[1]/input[@id='accountname']");
		By byacc_no				= By.xpath("//div[7]/div[2]/div[3]/div[2]/div[1]/input[@id='accountnumber']");
		By bysort_code 			= By.xpath("//div[7]/div[2]/div[3]/div[3]/div[1]/input[@id='sortcode']");
		By byvalidate_acc		= By.xpath("//div[5]/div[1]/button[@id='validateBankAccount']");
		By byvalidate_msg		= By.xpath("//label[contains(text(),'Bank Account Validated Successfully.')]");
		By bysubmit				= By.xpath("//div[10]/div[1]/div[1]/div[1]/div[2]/input[@id='submit']");
		By byreport_issue		= By.xpath("//div[contains(text(),'Report Issue')]");
		
		
		
		@Parameters({"appcode","firstname","lastname","email", "firstname2","lastname2","email2", "firstname3","lastname3","email3","acc_name","acc_no","sort_code"})
		@Test(groups = {"All","SponsorshipFamily"})
		public void test(@Optional ("1150") String appcode , 
						 @Optional ("Patrick") String firstname, 
						 @Optional ("Mathews") String lastname, 
						 @Optional ("rabeh94411@altpano.com") String email,
						 @Optional ("Cassendra") String firstname2, 
						 @Optional ("Powers") String lastname2, 
						 @Optional ("xirilon259@5k2u.com") String email2,
						 @Optional ("Raymond") String firstname3, 
						 @Optional ("Johnson") String lastname3, 
						 @Optional ("jeyede1839@anlubi.com") String email3,
						 @Optional ("David") String acc_name,
						 @Optional ("34661743") String acc_no,
						 @Optional ("602003") String sort_code) throws InterruptedException 
		{
			Utilities.hardWait(3);
			
			driver.findElement(byglobalpool).click();
			Utilities.hardWait(2);
			
			driver.findElement(bysearch_button).click();
			Utilities.hardWait(8);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scrollBy(0,1000)");
			Utilities.hardWait(1);
			
			driver.findElement(byhold_import).click();
			Utilities.hardWait(6);
			
			String local_id = driver.findElement(bylocal_id).getText();
			Utilities.hardWait(2);
			System.out.println("Ben.Local Id selected from Global Child Pool : "+local_id);
			Utilities.hardWait(2);
			
			js.executeScript("scrollBy(0,-1000)");
			Utilities.hardWait(2);
			
			driver.findElement(byrnpool).click();
			Utilities.hardWait(2);
			
			driver.findElement(byben_id_field).sendKeys(local_id);
			Utilities.hardWait(2);
			
			driver.findElement(byrn_search).click();
			Utilities.hardWait(5);
			
			js.executeScript("scrollBy(0,1200)");
			Utilities.hardWait(1);
			
			driver.findElement(byselect_button).click();
			Utilities.hardWait(3);
			
			js.executeScript("scrollBy(0,1000)");
			Utilities.hardWait(1);
			
			driver.findElement(byappl_code).sendKeys(appcode);
			Utilities.hardWait(1);
		
			driver.findElement(bysponsor_source).click();
			Utilities.hardWait(2);
			
			List<WebElement> list = driver.findElements (By.xpath("//div[@class='menu transition visible']//div"));
			Utilities.hardWait(1);
			list.get(1).click();
			String value = list.get(1).getText();
			System.out.println(value);
			Utilities.hardWait(2);
			
			driver.findElement(bysupporter_type).click();
			Utilities.hardWait(2);
			
			List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
			Utilities.hardWait(1);
			list1.get(2).click();
			String value1 = list1.get(2).getText();
			System.out.println(value1);
			Utilities.hardWait(2);
			
			js.executeScript("scrollBy(0,1000)");
			Utilities.hardWait(1);
			
			Utilities.hardWait(2);
			driver.findElement(bytitle).click();
			Utilities.hardWait(2);
			List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
			list2.get(1).click();
			String value2 = list2.get(1).getText();
			System.out.println(value2);
			Utilities.hardWait(2);
			
			driver.findElement(byfirstname).sendKeys(firstname);
			driver.findElement(bylastname).sendKeys(lastname);
			Utilities.hardWait(2);
			driver.findElement(byemail).sendKeys(email);
			Utilities.hardWait(2);
			
			js.executeScript("scrollBy(0,700)");
			Utilities.hardWait(2);

			Utilities.hardWait(2);
			driver.findElement(bytitle2).click();
			Utilities.hardWait(2);
			List<WebElement> list3 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
			list3.get(2).click();
			String value3 = list3.get(2).getText();
			System.out.println(value3);
			Utilities.hardWait(2);
			
			driver.findElement(byfirstname2).sendKeys(firstname2);
			driver.findElement(bylastname2).sendKeys(lastname2);
			Utilities.hardWait(2);
			driver.findElement(byemail2).sendKeys(email2);
			Utilities.hardWait(2);
			
			js.executeScript("scrollBy(0,700)");
			Utilities.hardWait(2);
			
			boolean add_row = driver.findElement(byadd_row_button).isDisplayed();
			Utilities.hardWait(2);
			
			if(add_row)
			{
				driver.findElement(byadd_row_button).click();
				Utilities.hardWait(2);
			
			js.executeScript("scrollBy(0,-600)");
			Utilities.hardWait(2);
			
			Utilities.hardWait(2);
			driver.findElement(bytitle3).click();
			Utilities.hardWait(2);
			List<WebElement> list_title3 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
			list_title3.get(1).click();
			String value4 = list_title3.get(1).getText();
			System.out.println(value4);
			Utilities.hardWait(2);
			
			driver.findElement(byfirstname3).sendKeys(firstname3);
			driver.findElement(bylastname3).sendKeys(lastname3);
			Utilities.hardWait(2);
			driver.findElement(byemail3).sendKeys(email3);
			Utilities.hardWait(2);
			}
			
			js.executeScript("scrollBy(0,200)");
			Utilities.hardWait(2);
			
			driver.findElement(By.xpath("//input[@id='sgname']")).sendKeys("SupporterName1");
			Utilities.hardWait(2);
			
			driver.findElement(bysupporter_group).click();
			Utilities.hardWait(2);
			List<WebElement> supp_gr = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
			supp_gr.get(0).click();
			String value5 = supp_gr.get(0).getText();
			System.out.println(value5);
			Utilities.hardWait(2);
			
			js.executeScript("scrollBy(0,500)");
			Utilities.hardWait(1);
		
			driver.findElement(byDDI_source).click();
			Utilities.hardWait(2);
			List<WebElement> list6 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
			list6.get(1).click();
			String value6 = list6.get(1).getText();
			System.out.println(value6);
			Utilities.hardWait(2);
			
			driver.findElement(byacc_name).sendKeys(acc_name);
			driver.findElement(byacc_no).sendKeys(acc_no);
			driver.findElement(bysort_code).sendKeys(sort_code);
			Utilities.hardWait(3);
			
			driver.findElement(byvalidate_acc).click();
			Utilities.hardWait(5);
		
			String actual_msg 	= driver.findElement(byvalidate_msg).getText();
			System.out.println(actual_msg);
			String expected_msg	= "Bank Account Validated Successfully.";
			Assert.assertEquals(actual_msg, expected_msg);
			Utilities.hardWait(3);
			
			driver.findElement(By.xpath("//input[@id='ffdate']")).click();																
			Utilities.hardWait(3);

			List<WebElement> dates = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']"));
			
			int total_dates = dates.size();
			Utilities.hardWait(2);
				
			for (int i =0; i<total_dates;i++)
			{
				String date = dates.get(i).getText();
				Utilities.hardWait(2);
			
			if(date.equals("1"))
			{
				break;	
			}
			else
			{
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();	
			}
			}
			WebElement wc = driver.findElement(By.xpath("//a[@class='ui-state-default' or class=\"ui-state-default ui-state-hover\" or contains(text(),'1')]"));
			wc.click();
			Utilities.hardWait(4);
				
			String day = wc.getText();
			String month_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText(); 
			Utilities.hardWait(4);
			System.out.println("Date selected : "+day+" "+month_year);
			Utilities.hardWait(3);
			
			js.executeScript("scrollBy(0,1000)");
			Utilities.hardWait(1);
			
			driver.findElement(bysubmit).click();
			Utilities.hardWait(80);
			
			String response_msg = driver.findElement(By.id("Responsetable")).getText();
			System.out.println('\n'+"*** Response - ");
			System.out.println(response_msg);
			Utilities.hardWait(5);
			
			System.out.println("***********'\n'*************");
			
			Boolean find_error = driver.findElement(By.xpath("//div[@class='re list1']/table[@class='ui table responseTable']/tr/td/i[@class='remove circle large red icon'])[4]")).isDisplayed();
			
			if(find_error) {
				
				String F_error = driver.findElement(By.xpath("//div[@class='re list1']/table[@class='ui table responseTable']/tr/td/i[@class='remove circle large red icon'])[4]")).getText();
				System.out.println("Find Error Message" +F_error);
				}
			
			//(//div[@class='re list1']/table[@class='ui table responseTable']/tr/td/i[@class='remove circle large red icon'])[1]
			
			boolean error_msg = driver.findElement(byreport_issue).isDisplayed();
			Utilities.hardWait(2);
			
			if(error_msg)
			{
				driver.findElement(byreport_issue).click();
				Utilities.hardWait(2);
				String er_msg = driver.findElement(By.xpath("//div[@class='ui compact message']")).getText();
				System.out.println(er_msg);
			}
			
			Utilities.hardWait(2);
			driver.navigate().to("https://services.compassionuk.org/sef/");
			Utilities.hardWait(2);
				
			System.out.println('\n'+"*** COMPLETED RIGHTNOW FAMILY TESTING ***"+'\n');
		}

	}



