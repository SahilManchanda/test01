package com.emr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.emr.qa.base.TestBase;

	public class EmrEPhomepage extends TestBase {
	
	public  EmrEPhomepage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	// My EMR EP User Center Panel
	
	@FindBy(xpath="//a[@href='/applications']")
	WebElement Myapplication;

	@FindBy(xpath="//a[@href='/my-agreements']")
	WebElement Myagreement;
	
	@FindBy(xpath="//a[@href='/cmus']")
	
	WebElement Mycmu;
	
	@FindBy(xpath="//a[@href='/my-disputes']")
	WebElement Mydispute;
	
	@FindBy(xpath="//a[@href='/my-auctions']")
	WebElement Myauction;
	
	@FindBy(xpath="//a[@href='/auction']")
	WebElement Auction;
	
	@FindBy(xpath="//a[@href='/reports']")
	WebElement Reports;
	
	@FindBy(xpath="//a[@href='/notification']")
	WebElement Notification;	
	
	@FindBy(xpath="//a[@href='/cmutransfer']")
	WebElement Cmutransfer;
	
	@FindBy(xpath="//a[@href='/agreementTrades']")
	WebElement MyTrades;
	
	
	
	
	
	//Methods 
	public void Mycmuclick() {
		
		
		
		Mycmu.click();
		
		
	}
	
	public void MyApplicationclick() {
		
		
		
		Myapplication.click();
		
		
	}
	
	

	
	
	
	
	
}
