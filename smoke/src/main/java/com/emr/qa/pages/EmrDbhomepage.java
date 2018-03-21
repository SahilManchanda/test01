package com.emr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmrDbhomepage {
	
	
	//Db User Top Panel
	
	@FindBy(xpath="//a[contains(text(), \"My EMR\")]")
	WebElement MyEmrtoppanel;
	
	@FindBy(xpath="//a[contains(text(), \"Contact Us\")]")
	WebElement Contactustoppanel;
	
	@FindBy(xpath="//a[contains(text(), \"About EMR\")]")
	WebElement AboutEMRtoppanel;
	
	@FindBy(xpath="//a[contains(text(), \"Contracts for Difference\")]")
	WebElement CFDtoppanel;
	
	@FindBy(xpath="//li[@data-color]//a[contains(text(), \"Capacity Market\")]")
	WebElement CMtoppanel;
	
	@FindBy(xpath="//a[contains(text(), \"Home\")]")
	WebElement Hometoppanel;
	
	
	
	//Side panel
	
	@FindBy(xpath="//a[contains(text(), \"User Management\")]")
	WebElement UserManagementsidepanel;
	
	
	@FindBy(xpath="//a[contains(text(), \"Subscribers\")]")
	WebElement Subscriberssidepanel;
	
	
	@FindBy(xpath="//a[contains(text(), \"Companies\")]")
	WebElement Companiessidepanel;
	
	@FindBy(xpath="//a[contains(text(), \"Manage Login Credentials\")]")
	WebElement ManageLoginCredentilassidepanel;
	
	@FindBy(xpath="//a[contains(text(), \"My Profile\")]")
	WebElement Myprofilesidepanel;
	
	@FindBy(xpath="//a[contains(text(), \"Document Folder\")]")
	WebElement Documentfoldersidepanel;
	
	
	@FindBy(xpath="//a[contains(text(), \"Messaging\")]")
	WebElement Messagingsidepanel;
	
	@FindBy(xpath="//div[@class='left-nav-link-wrapper']//a[contains(text(), \"Capacity Market\")]")
	WebElement CapacityMarketsidepanel;
	
	@FindBy(xpath="//a[contains(text(), \"Start Elexon (Testing only)\")]")
	WebElement StartElexonsidepanel;
	
	@FindBy(xpath="//a[contains(text(), \"Elexon File 9 upload\")]")
	WebElement Elexonfile9sidepanel;
	
	@FindBy(xpath="//a[contains(text(), \"Whitelist Management \")]")
	WebElement WhitelistManagementsidepanel;
	


	// My EMR DB User Center Panel

	
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
		
		@FindBy(xpath="//a[@href='/techclass']")
		WebElement TechClass;
		
		@FindBy(xpath="//a[@href='/FuelTypes']")
		WebElement Fueltypes;
		
		@FindBy(xpath="//a[@href='/events-log']")
		WebElement Audit;
		
		@FindBy(xpath="//a[@href='/cmutransfer']")
		WebElement Cmutransfer;
		
		@FindBy(xpath="//a[@href='/outstanding']")
		WebElement OutstandingActivities;
		
		@FindBy(xpath="//a[@href='/SecondaryTrading']")
		WebElement SecondryTradingPanel;
		
		@FindBy(xpath="//a[@href='/agreementTrades']")
		WebElement MyTrades;
		
		@FindBy(xpath="//a[@href='/reports/elexon']")
		WebElement ElexonFile9;
		

//Capacity Market side icon
		
		@FindBy(xpath="/html/body/form/div[6]/div/div[3]/table/tbody/tr/td[1]/div/div/ul[2]/li[8]/div[1]/div")
		WebElement CapacityMarketsideicon;
		
		@FindBy(xpath=" //a[contains(text(), \"Primary Fuel Type\")]")
		WebElement Primaryfueltypecollapsed;
		
		@FindBy(xpath=" //a[contains(text(), \"Technology Class\")]")
		WebElement TechnologyClasscollapsed;

		@FindBy(xpath="//a[contains(text(), \"Auction Setup\")]")
		WebElement AuctionSetupcollapsed;
		
		@FindBy(xpath="//a[contains(text(), \"My Auctions\")]")
		WebElement MyAuctionscollapsed;
		
		@FindBy(xpath="//a[contains(text(), \"My CMUs\")]")
		WebElement MyCMUscollapsed;
		
		@FindBy(xpath=" //a[contains(text(), \"Appeals and Documents\")]")
		WebElement Appealsanddocumentscollapsed;
		
		@FindBy(xpath="//a[contains(text(), \"My Applications / Opt-Outs\")]")
		WebElement MyApplicationandoptoutcollapsed;
		 
		@FindBy(xpath="//a[contains(text(), \"My Disputes\")]")
		WebElement Mydisputescollapsed;
		
		@FindBy(xpath="//a[contains(text(), \"My Agreeements\")]")
		WebElement MyAgreeementscollapsed;
		 
		@FindBy(xpath="//a[contains(text(), \"My Trades\")]")
		WebElement MyTradescollapsed;
		
		@FindBy(xpath="//a[contains(text(), \"My CMU Transfers\")]")
		WebElement MyCMUtransfercollapsed;
		
		
		@FindBy(xpath="//a[contains(text(), \"Auction Upload\")]")
		WebElement Auctionuploadcollapsed;
		 
		@FindBy(xpath="//a[contains(text(), \"ST Control Panel\")]")
		WebElement STcontrolpanelcollapsed;
		
		@FindBy(xpath="//a[contains(text(), \"Reports\")]")
		WebElement Reportscollapsed;
		 
		@FindBy(xpath="//a[contains(text(), \"CM Register\")]")
		WebElement CMregistercollapsed;
		
		@FindBy(xpath="//a[contains(text(), \"Audit\")]")
		WebElement Auditcollapsed;
		 
		@FindBy(xpath="//a[contains(text(), \"Configuration\")]")
		WebElement Configurationcollapsed;
		
		@FindBy(xpath="//a[contains(text(), \"Outstanding Activities\")]")
		WebElement Outstandingactivitiescollapsed;
		
		@FindBy(xpath="//a[contains(text(), \"Notifications\")]")
		WebElement Notificationscollapsed;
		
	
		 
		 
		
		
		
		
		
}
