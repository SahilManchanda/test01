package com.emr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.emr.qa.base.TestBase;

public class Loginpage extends TestBase{

//	Initialising the Page Objects 
	
	public  Loginpage() {
		
		PageFactory.initElements(driver, this);
		
	}
		
	 
	//pagefactory	

	@FindBy(xpath="//input[@placeholder='UserName']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	
	
	@FindBy(xpath="	//input[@id='btnLogin']")
	WebElement Login;
	
	@FindBy(xpath="//a[contains(text(), \"Forgot password\")]")
	WebElement forgotpassword;
	
	@FindBy(xpath="//a[contains(text(), \"Forgot username\")]")
	WebElement forgotusername;
	
	
	@FindBy(xpath="//a[contains(text(), \"Forgot pin\")]")
	WebElement forgotpin;
	
	@FindBy(xpath="//span[contains(text(), \"Sign in please\")]")
	WebElement loginlogo;
	
	@FindBy(xpath="//input[@id='txtSMS']")
	WebElement pin;
	
	@FindBy(xpath="//a[@id='ctl00_IdWelcome_ExplicitLogin']")
	WebElement loginhomepage;
	
	@FindBy(xpath="//h1[contains(text(),\"Reset Password\")]")
	WebElement resetpasswordtext;
	

	@FindBy(xpath="//h1[contains(text(),\"Retrieve your username\")]")
	WebElement retrieveusernametext;
	

	@FindBy(xpath="//h1[contains(text(),\"Forgot PIN\")]")
	WebElement forgotpintext;
	
	@FindBy(xpath="//input[@name='btnSMS']")
	WebElement btnSMS;
	
	
	
	 
	 //Actions:
	 
	 public String ValidateLoginPageTitle() {
		 
		 return driver.getTitle();	 
	}

	public boolean validateloginpageimage() {
		
		loginhomepage.click();
		
		return loginlogo.isDisplayed();
		
	}  
	
	public Homepage Loginuser(String un, String pswd) {
		System.out.println("1.1 run");
		loginhomepage.click();
		System.out.println("1.2 run");
		username.sendKeys(un);
		System.out.println("1.3 run");
		password.sendKeys(pswd);
		
		Login.click();

		pin.sendKeys("123456");
		
		btnSMS.click();
		
		return new Homepage();
		
	   }
	 
	
		public boolean Validateresetpasswordtext() {
			
		loginhomepage.click();	
		forgotpassword.click();
		
		return resetpasswordtext.isDisplayed();
		
	   }
	 
	 
		public boolean Validateretrieveusernametext() {
			loginhomepage.click();
			forgotusername.click();
			
			return retrieveusernametext.isDisplayed();
			
		}
	 
		
		public boolean Validateforgotpintext() {
			loginhomepage.click();
			forgotpin.click();
			
			return forgotpintext.isDisplayed();
			
		}
	 
	 
}
