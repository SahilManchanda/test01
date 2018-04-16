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

public class ApplicatoncreationTest extends TestBase {

	Loginpage login;
	EmrEPhomepage EPhomepage;
	EpApplicationcreation applicationpage;
	Commonfunction cf;
	ApplicatoncreationTest() {

		super();

	}

	@BeforeMethod
	public void setUp() {
		initialization();
		login = new Loginpage();
		EPhomepage = new EmrEPhomepage();
		applicationpage = new EpApplicationcreation();
		cf = new Commonfunction();
	}

	@Test
	void createapplicationTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.applicationcreation(cf.accessfromfile(2, 1, 4),cf.accessfromfile(1, 0, 2),cf.accessfromfile(0, 9, 1));
	}

//	@Test
	public void verifyApplicationcompanyTest() throws InterruptedException, IOException {
		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.applicationcreation(cf.accessfromfile(2, 1, 4),cf.accessfromfile(1, 0, 2),cf.accessfromfile(0, 9, 1));
		applicationpage.verifyApplicationcompany();

	}

//	@Test
	public void verifyApplicationcmuTest() throws InterruptedException, IOException {
		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.applicationcreation(cf.accessfromfile(2, 8, 4),cf.accessfromfile(1, 0, 2),cf.accessfromfile(0, 9, 1));
		applicationpage.verifyApplicationcompany();

	}

	@Test
	void EXGApplicationsaveTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.EXGApplicationsave(cf.accessfromfile(2, 1, 4),cf.accessfromfile(1, 0, 2),cf.accessfromfile(0, 9, 1));
		applicationpage.Saveclick();
	}

	@Test
	void EXGApplicationsubmitTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.EXGSubmitclick(cf.accessfromfile(2, 1, 4));
	}

	// EXI APPLICATION
	@Test
	void EXIApplicationsaveTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.EXIApplicationsave(cf.accessfromfile(2, 2, 4),cf.accessfromfile(1, 0, 2),cf.accessfromfile(0, 9, 1));
		applicationpage.Saveclick();
	}

	@Test
	void EXIApplicationsubmitTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.EXISubmitclick(cf.accessfromfile(2, 2, 4));
	}

	// NBG APPLICATION

	@Test
	void NBGApplicationsaveTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.NBGApplicationsave(cf.accessfromfile(2, 3, 4),cf.accessfromfile(1, 0, 2),cf.accessfromfile(0, 9, 1));
		applicationpage.Saveclick();
	}

	@Test
	void NBGApplicationsubmitTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.NBGSubmitclick(cf.accessfromfile(2, 3, 4));
	}

	// RBG APPLICATION

	@Test
	void RBGApplicationsaveTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.RBGApplicationsave(cf.accessfromfile(2, 4, 4),cf.accessfromfile(1, 0, 2),cf.accessfromfile(0, 9, 1));
		applicationpage.Saveclick();
	}

	@Test
	void RBGApplicationsubmitTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.RBGSubmitclick(cf.accessfromfile(2, 4, 4));
	}

	// Proven DSR APPLICATION

	@Test
	void PDSRApplicationSaveTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.PDSRApplicationsave(cf.accessfromfile(2, 5, 4),cf.accessfromfile(1, 0, 2),cf.accessfromfile(0, 9, 1));
		applicationpage.Saveclick();
	}

	@Test
	void PDSRApplicationSubmitTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.PDSRSubmitclick(cf.accessfromfile(2, 5, 4));
	}

	// UProven DSR APPLICATION

	@Test
	void UPDSRApplicationSaveTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.UPDSRApplicationsave(cf.accessfromfile(2, 6, 4),cf.accessfromfile(1, 0, 2),cf.accessfromfile(0, 9, 1));
		applicationpage.Saveclick();
	}

	@Test
	void UPDSRApplicationSubmitTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.UPDSRSubmitclick(cf.accessfromfile(2, 6, 4));
	}

	// RBI APPLICATION

	@Test
	void RBIApplicationsaveTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.RBIApplicationsave(cf.accessfromfile(2, 7, 4),cf.accessfromfile(1, 0, 2),cf.accessfromfile(0, 9, 1));
		applicationpage.Saveclick();
	}

	@Test
	void RBIApplicationsubmitTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.RBISubmitclick(cf.accessfromfile(2, 7, 4));
	}

	// NBI APPLICATION

	@Test
	void NBIApplicationsaveTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.NBIApplicationsave(cf.accessfromfile(2, 8, 4),cf.accessfromfile(1, 0, 2),cf.accessfromfile(0, 9, 1));
		applicationpage.Saveclick();
	}

	@Test
	void NBIApplicationsubmitTest() throws InterruptedException, IOException {

		login.Loginuser("am1a.mainadmin", "Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.MyApplicationclick();
		applicationpage.NBISubmitclick(cf.accessfromfile(2, 8, 4));
	}

}
