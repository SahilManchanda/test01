package com.emr.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emr.qa.base.TestBase;
import com.emr.qa.pages.Homepage;
import com.emr.qa.pages.Loginpage;

public class LoginPageTest extends TestBase {
	Loginpage login;
	Homepage  homepage;
	public LoginPageTest() {		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
	
		initialization();
		login = new Loginpage(); 
		
	}
	
	
	@Test
	public void LoginPagetitletest() {
		
	String title =	login.ValidateLoginPageTitle();
		
	Assert.assertEquals(title,"EMR Portal - Home");

	
	}
	
	@Test
	
	public void EMRLogoImageTest() {
		
		 boolean flag =login.validateloginpageimage();
		 Assert.assertTrue(flag);	
		 
	}

		
	@Test	
	public void LoginTest() {
	
	login.Loginuser("am1a.mainadmin","Passw01!");

	}
	
	@Test
	public void resetpasswordtextTest() {
		
		 boolean flag =login.Validateresetpasswordtext();
		 Assert.assertTrue(flag);	
		 
	}
	
	@Test
	public void retrievepasswordtextTest() {
		
		 boolean flag =login.Validateretrieveusernametext();
		 Assert.assertTrue(flag);		 
	}
	
	@Test
	public void forgotpintextTest() {
		
		 boolean flag =login.Validateforgotpintext();
		 Assert.assertTrue(flag);	
	}

		
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	

}
