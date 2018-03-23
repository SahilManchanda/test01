package com.emr.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emr.qa.base.TestBase;
import com.emr.qa.pages.Auctionpage;
import com.emr.qa.pages.EmrDbhomepage;
import com.emr.qa.pages.Homepage;
import com.emr.qa.pages.Loginpage;

public class AuctionPageTest extends TestBase {
	
	Loginpage login;
	Homepage  homepage;
	Auctionpage auction;
	EmrDbhomepage dbhomepage;
	AuctionPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		login = new Loginpage();
		dbhomepage = new EmrDbhomepage();
		auction = new Auctionpage();
		
		 
		
	}	
	
	
	@Test
	void AuctionCreationTest() throws IOException, InterruptedException {
		
		login.Loginuser("cmamuat.dbadmin", "Passw01!");
		
		dbhomepage.Navigatetoauctionsetup();
		
		auction.AuctionCreation(driver);
		
		
		
		
	}
	
	@Test
	void VerifyAuctionCreatedTest() throws InterruptedException, IOException {
		System.out.println("1 run");

		login.Loginuser("cmamuat.dbadmin", "Passw01!");
		
		System.out.println("2 run");
		
		dbhomepage.Navigatetoauctionsetup();
		
		System.out.println("3 run");
		
		auction.VerifyAuctionCreated(driver);
	
		System.out.println("4 run");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
