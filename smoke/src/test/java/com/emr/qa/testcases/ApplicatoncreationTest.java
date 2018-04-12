package com.emr.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emr.qa.base.TestBase;
import com.emr.qa.pages.Addcmupage;
import com.emr.qa.pages.Auctionpage;
import com.emr.qa.pages.EmrDbhomepage;
import com.emr.qa.pages.EmrEPhomepage;
import com.emr.qa.pages.EpApplicationcreation;
import com.emr.qa.pages.Loginpage;
import com.emr.qa.util.Commonfunction;
import com.emr.qa.pages.Loginpage;

public class ApplicatoncreationTest  extends TestBase {
	
	
	Loginpage login;
	EmrEPhomepage EPhomepage;
	EpApplicationcreation applicationpage;
	ApplicatoncreationTest(){
		
		
		super();
	
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		login = new Loginpage();
		EPhomepage = new EmrEPhomepage();
		applicationpage = new EpApplicationcreation();
	}	
	
	@Test
	void createapplicationTest() throws InterruptedException {
		
		
		login.Loginuser("am1a.mainadmin","Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.applicationcreation();
	}
	
	
	@Test
	public void verifyApplicationcompanyTest() throws InterruptedException{
		login.Loginuser("am1a.mainadmin","Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.applicationcreation();
		applicationpage.verifyApplicationcompany();
		
		}
	
	@Test
	public void verifyApplicationcmuTest() throws InterruptedException{
		login.Loginuser("am1a.mainadmin","Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.applicationcreation();
		applicationpage.verifyApplicationcompany();
		
		}
	
	@Test
	void ApplicationsaveTest() throws InterruptedException, IOException {
		
		
		login.Loginuser("am1a.mainadmin","Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.EXGApplicationsave();
		applicationpage.Saveclick();
	}
	
	@Test
	void ApplicationsubmitTest() throws InterruptedException, IOException {
		
		
		login.Loginuser("am1a.mainadmin","Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.EXGApplicationsave();
		applicationpage.Submitclick();
	}
	
	
	
	
	
}
