package com.emr.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emr.qa.base.TestBase;
import com.emr.qa.pages.Addcmupage;
import com.emr.qa.pages.Application_Db_Assessment;
import com.emr.qa.pages.Auctionpage;
import com.emr.qa.pages.EmrDbhomepage;
import com.emr.qa.pages.EmrEPhomepage;
import com.emr.qa.pages.Homepage;
import com.emr.qa.pages.Loginpage;
import com.emr.qa.util.Commonfunction;

public class Application_Db_AssessmentTest extends TestBase {
	
		Commonfunction cf;
	    Loginpage login;
		Homepage  homepage;
		Auctionpage auction;
		EmrDbhomepage dbhomepage;
		EmrEPhomepage EPhomepage;
		Addcmupage Addcmuobj;
		Application_Db_Assessment Dbassessmentobj;
	Application_Db_AssessmentTest(){
		super();
	}
	

	
	@BeforeMethod
	public void setUp() {
		initialization();
		login = new Loginpage();
		dbhomepage = new EmrDbhomepage();
		auction = new Auctionpage();
		EPhomepage = new EmrEPhomepage();
		Addcmuobj = new Addcmupage();
		cf= new Commonfunction();
		Dbassessmentobj = new Application_Db_Assessment();
	
	}	
	
	
	
	@Test
	void EXGapplicationassessmentSAVE() throws IOException, InterruptedException{
		login.Loginuser(cf.accessfromfile(0, 1, 1), cf.accessfromfile(0, 2, 1));
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		
		Dbassessmentobj.SearchApplication(cf.accessfromfile(2, 1, 4));
		Dbassessmentobj.ClickonContinueReview();
		Dbassessmentobj.EXGDbAssessment_stage_1();
		Dbassessmentobj.Dbassessmentsave();
		
		
		
	}
	
	
	//@AfterMethod
	public void teardown() {
		driver.quit();
		}
	

}
