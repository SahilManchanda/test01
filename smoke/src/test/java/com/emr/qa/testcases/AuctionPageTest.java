package com.emr.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emr.qa.base.TestBase;
import com.emr.qa.pages.Auctionpage;
import com.emr.qa.pages.Homepage;
import com.emr.qa.pages.Loginpage;

public class AuctionPageTest extends TestBase {
	
	Loginpage login;
	Homepage  homepage;
	Auctionpage auction;
	
	AuctionPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
	
		initialization();
		auction = new Auctionpage(); 
		
	}	
	
	
	@Test
	void AuctionCreationTest() {
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
