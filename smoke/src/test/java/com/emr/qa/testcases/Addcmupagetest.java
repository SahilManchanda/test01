package com.emr.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.emr.qa.base.TestBase;
import com.emr.qa.pages.Addcmupage;
import com.emr.qa.pages.Auctionpage;
import com.emr.qa.pages.EmrDbhomepage;
import com.emr.qa.pages.EmrEPhomepage;
import com.emr.qa.pages.Homepage;
import com.emr.qa.pages.Loginpage;
import com.emr.qa.util.Commonfunction;

    public class Addcmupagetest extends TestBase {
    Commonfunction cf;
    Loginpage login;
	Homepage  homepage;
	Auctionpage auction;
	EmrDbhomepage dbhomepage;
	EmrEPhomepage EPhomepage;
	Addcmupage Addcmuobj;
	Addcmupagetest(){
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
	
	}	
	
	@Test
	void addExistingGencmuTest() throws InterruptedException, IOException {
		
		login.Loginuser("am1a.mainadmin","Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.Mycmuclick();
		Addcmuobj.AddCMU("ExistingGenerating");
		Addcmuobj.EGCMUcreation();	
		Addcmuobj.Meteringnotdeferred();
		
		 boolean flag =Addcmuobj.verifycmucreation(cf.accessfromfile(2, 1, 4));
		 Assert.assertTrue(flag);
		
	}
	
	@Test
	void addExistingIntercmuTest() throws InterruptedException, IOException {
		
		login.Loginuser("am1a.mainadmin","Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.Mycmuclick();
		
		//Select the CMU Type
		
		Addcmuobj.AddCMU("ExistingInterconnector");
		Addcmuobj.EICMUcreation();
		Addcmuobj.Existingmeteringinternotdeferred();
		
		boolean flag =Addcmuobj.verifycmucreation(cf.accessfromfile(2, 2, 4));
		 Assert.assertTrue(flag);
		
	}
	
	
	@Test
	void addNewBuildGencmuTest() throws InterruptedException, IOException {
		
		login.Loginuser("am1a.mainadmin","Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.Mycmuclick();
		
		//Select the CMU Type
		
		Addcmuobj.AddCMU("NewBuildInterconnector");
		Addcmuobj.NBGCMUtypecreation();
		Addcmuobj.NBIconstructionplan();
		Addcmuobj.NBITabswitch();
		System.out.println("1A");
		Addcmuobj.NBGMeteringnotdeferred();
		System.out.println("1E");
		boolean flag =Addcmuobj.verifycmucreation(cf.accessfromfile(2, 3, 4));
		 Assert.assertTrue(flag);
		
	}
	
	
         @Test
	void addRefurbGencmuTest() throws InterruptedException, IOException {
		
		login.Loginuser("am1a.mainadmin","Passw01!");
		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
		EPhomepage.Mycmuclick();
		
		//Select the CMU Type
		
		Addcmuobj.AddCMU("RefurbishingGenerating");
		Addcmuobj.RBGCMUtypecreation();
		Addcmuobj.refurbconstructionplan();
		Addcmuobj.Tabswitch();
		System.out.println("1A");
		Addcmuobj.Pre_Refurb_Meteringnotdeferred();
		Addcmuobj.postrefurbTabswitch();
		System.out.println("1E");
		Addcmuobj.Post_Refurb_Meteringnotdeferred();
		boolean flag =Addcmuobj.verifycmucreation(cf.accessfromfile(2, 4, 4));
		 Assert.assertTrue(flag);
	}
	

	
         @Test
     	void addprovendsrcmuTest() throws InterruptedException, IOException {
     		
     		login.Loginuser("am1a.mainadmin","Passw01!");
     		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
     		EPhomepage.Mycmuclick();
     		
     		//Select the CMU Type
     		
     		Addcmuobj.AddCMU("ProvenDSR");
     		Addcmuobj.PRVNCMUtypecreation();
     		Addcmuobj.provenDSRBusinessModel();
     		Addcmuobj.Tabswitch();
     		System.out.println("1A");
     		Addcmuobj.provenDSRMeteringAssessment();
     		System.out.println("1E");
     		
     		boolean flag =Addcmuobj.verifycmucreation(cf.accessfromfile(2, 5, 4));
     		Assert.assertTrue(flag);
     		
     	}
         
         @Test
         void addunprovendsrcmuTest() throws InterruptedException, IOException {
      		
      		login.Loginuser("am1a.mainadmin","Passw01!");
      		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
      		EPhomepage.Mycmuclick();
      		
      		//Select the CMU Type
      		
      		Addcmuobj.AddCMU("UnprovenDSR");
      		Addcmuobj.UnPRVNCMUtypecreation();
      		Addcmuobj.UnprovenDSRBusinessModel();
      		Addcmuobj.Tabswitch();
      		System.out.println("1A");
      		Addcmuobj.UnprovenDSRMeteringAssessment();
      		System.out.println("1E");
      		

     		boolean flag =Addcmuobj.verifycmucreation(cf.accessfromfile(2, 6, 4));
     		Assert.assertTrue(flag);
     		
      	}
        
         @Test
     	void addRefurbIntcmuTest() throws InterruptedException, IOException {
     		
     		login.Loginuser("am1a.mainadmin","Passw01!");
     		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
     		EPhomepage.Mycmuclick();
     		
     		//Select the CMU Type
     		
     		Addcmuobj.AddCMU("RefurbishingInterconnector");
     		Addcmuobj.RBCMUtypecreation();
     		Addcmuobj.refurb_int_constructionplan();
     		Addcmuobj.Tabswitch();
     		System.out.println("1A");
     		Addcmuobj.Pre_Refurb_int_Meteringnotdeferred();
     		Addcmuobj.postrefurbTabswitch();
     		System.out.println("1E");
     		Addcmuobj.Post_Refurb_int_Meteringnotdeferred();

     		boolean flag =Addcmuobj.verifycmucreation(cf.accessfromfile(2, 7, 4));
     		Assert.assertTrue(flag);
     
         }
         
         
        @Test
     	void addNewBuildintcmuTest() throws InterruptedException, IOException {
     		
     		login.Loginuser("am1a.mainadmin","Passw01!");
     		driver.switchTo().frame("MSOPageViewerWebPart_WebPartWPQ2");
     		EPhomepage.Mycmuclick();
     		
     		//Select the CMU Type
     		
     		Addcmuobj.AddCMU("NewBuildInterconnector");
     		Addcmuobj.NBItypecreation();
     		Addcmuobj.NBIconstructionplan();
     		Addcmuobj.NBITabswitch();
     		System.out.println("1A");
     		Addcmuobj.NBInotdeferred();
     		System.out.println("1E");
     		

     		boolean flag =Addcmuobj.verifycmucreation(cf.accessfromfile(2, 8, 4));
     		Assert.assertTrue(flag);
     		
     	}
     	
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
     	
	//@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
