package com.emr.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emr.qa.base.TestBase;
import com.emr.qa.pages.Homepage;
import com.emr.qa.pages.Loginpage;
import com.emr.qa.util.Commonfunction;

public class LoginPageTest extends TestBase {
	Commonfunction cf;
	Loginpage login;
	Homepage  homepage;
	public LoginPageTest() {		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
	
		initialization();
		login = new Loginpage(); 
		cf= new Commonfunction();
		
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
	public void LoginTest() throws IOException {
	
	login.Loginuser(cf.accessfromfile(0, 1, 1),cf.accessfromfile(0, 2, 1));

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
