package sef.compassion.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import sef.compassion.utilities.Utilities;

public class SEF_IndividualSponsorshipRNandBankdetails extends BaseClass{

	By byLocalIdTextbox = By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/input[1]");
	By bySearchButton = By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/div[4]/button[1]");
	By bySelectChildId = By.xpath("//button[@id='select-child']");
	By byAppcodeId = By.xpath("//div[@class='col-lg-3']//div[@class='ui input ukborder']//input[@id='barcode']");
	
	
	@Test
	public void SearchChildUsingId(@Optional ("TZ018400023") String needkey) {
		
		driver.findElement(byLocalIdTextbox).sendKeys(needkey);
		Utilities.hardWait(1);
		driver.findElement(bySearchButton).click();
		Utilities.hardWait(3);
		driver.findElement(bySelectChildId).click();
		
	}

}
//1150