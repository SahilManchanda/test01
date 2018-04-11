package com.emr.qa.pages;

import com.emr.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends TestBase {

	public Homepage() {
		
		PageFactory.initElements(driver, this);	
	}
	

	@FindBy(xpath="//a[contains(text(), \"Home\")]")
	WebElement Home;
	
	
	@FindBy(xpath="//a[contains(text(), \"Capacity Market\")]")
	WebElement CapacityMarket;
	
	
	@FindBy(xpath="//a[contains(text(), \"Contracts for Difference\")]")
	WebElement ContractsforDifference;
	
	
	@FindBy(xpath="//a[contains(text(), \"About EMR\")]")
	WebElement AboutEMR;
	
	@FindBy(xpath="//a[contains(text(), \"Contact Us\")]")
	WebElement ContactUs;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
