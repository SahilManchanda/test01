package com.emr.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.emr.qa.base.TestBase;
import com.emr.qa.util.Commonfunction;

public class EpApplicationcreation extends TestBase {

	public EpApplicationcreation() {

		PageFactory.initElements(driver, this);

	}
	
	Commonfunction cf= new Commonfunction();
	JavascriptExecutor js = (JavascriptExecutor) driver;

	// Add new Application Button
	
	@FindBy(xpath = "//div[@class=\"add-new-application-button\"]")
	WebElement Add_new_Application_button;
	
	
	@FindBy(xpath = "//a[contains(text(),\"New Prequalification Application for Secondary Trading\")]")
	WebElement Secondrytradingapplcaiton;
	
	
	@FindBy(xpath = "//a[contains(text(),\"New Opt-Out Notification for an Auction\")]")
	WebElement OptOutapplication;
	
	
	@FindBy(xpath = "//a[contains(text(),\"New Prequalification Application for an Auction\")]")
	WebElement PreQual_application;
	
	
	@FindBy(xpath = "//*[@id=\"select2-SelectCompany-container\"]")
	WebElement Selectcompany;
	
	
	@FindBy(id = "select2-SelectCMU-container")
	WebElement Selectcmu;
	
	
	@FindBy(xpath = "//span[@class=\"select2-selection select2-selection--single\" and @aria-labelledby= \"select2-SelectAuction-container\"]")
	WebElement SelectAuction;
	
	@FindBy(className = "select2-search__field")
	WebElement Searchfield;
	
	
	@FindBy(xpath = "/html/body/span/span/span[2]/ul/li")
	WebElement Highlightedcompany;
	
	@FindBy(className = "select2-results__option--highlighted")
	WebElement HighlightedAuction;
	
	@FindBy(xpath = "/html/body/span/span/span[2]/ul/li[1]")
	WebElement Highlightedcmu;
	
	
	@FindBy(xpath = "//span[text()=\"Create\"]")
	WebElement CreateApplication;
	
	
	//Existing Generating CMU
	
	
	@FindBy(xpath = "//label[text()=\"Applicant Company\"]//following-sibling::p")
	WebElement EXGApplicantCompanytext;
	
	
	@FindBy(xpath = "//label[text()=\"Auction\"]//following-sibling::p")
	WebElement EXGAuctiontext;
	
	//Company and CMU Summary Page
	
	@FindBy(xpath = "//a[@id=\"ui-id-3\"]")
	WebElement EXGCompanyandCMUSummaryPage;
	
	
	//Covering Letter
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[69265].SelectedValue\"]")
	WebElement EXGCoveringLetter;
	
	//Application Status	
	@FindBy(xpath = "//span[@id=\"select2-Sections[18].Questions[52].SelectedValue-container\"]")
	WebElement EXGApplicationstatus;
	
	//Application Declaration	
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[53].SelectedValue\"]")
	WebElement EXGApplicationDeclaration;
	
	//Aggregator Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[54].SelectedValue\"]")
	WebElement EXGAggregatorDeclaration;
	
	//Legal Owner declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[55].SelectedValue\"]")
	WebElement EXGLegalOwnerDeclaration;
		
	//Joint Owner Declaration	
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[56].SelectedValue\"]")
	WebElement EXGJointOwnerDeclaration;
	
	//Primary Fuel Type *
	@FindBy(xpath = "//span[@id=\"select2-CompanyAndCMUSummary.PrimaryFuelType-g2-container\"]")
	WebElement EXGPrimaryFuelType;
	
	//Application Page
	
	
	@FindBy(xpath = "//a[text()=\"Application Page\"]")
	WebElement EXGApplication_Page;
	
	//Historic Performance Period 1 Date (DD/MM/YYYY)
		@FindBy(xpath = "//input[@id=\"Sections[19].Questions[63].SelectedValue\"]")
		WebElement EXGHistoricperiod1date;
			
	//Historic Performance Period 1 delivery capacity (DD/MM/YYYY)
		@FindBy(xpath = "//input[@id=\"Sections[19].Questions[64].SelectedValue\"]")
		WebElement EXGHistoricperiod1deliverycapacity;
	
	//Historic Performance Period 1 Settlement Period 
		@FindBy(xpath = "//input[@id=\"Sections[19].Questions[65].SelectedValue\"]")
		WebElement EXGHistoricperiod1settlementperiod;
		
	//Historic Performance Period 2 Date (DD/MM/YYYY) *
		@FindBy(xpath = "//input[@id=\"Sections[19].Questions[66].SelectedValue\"]")
		WebElement EXGHistoricPerformancePeriod2Date;
		
	//Historic Performance Period 2 Delivered Capacity *
		@FindBy(xpath = "//input[@id=\"Sections[19].Questions[67].SelectedValue\"]")
		WebElement EXGHistoricPerformancePeriod2DeliveredCapacity;	
	
	//Historic Performance Period 2 Settlement Period *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[68].SelectedValue\"]")
	WebElement EXGHistoricPerformancePeriod2SettlementPeriod;		
		
		
	//Historic Performance Period 3 Date (DD/MM/YYYY) *
		@FindBy(xpath = "//input[@id=\"Sections[19].Questions[69].SelectedValue\"]")
		WebElement EXGHistoricPerformancePeriod3Date ;
	
	//Historic Performance Period 3 Delivered Capacity *
		@FindBy(xpath = "//input[@id=\"Sections[19].Questions[70].SelectedValue\"]")
		WebElement EXGHistoricPerformancePeriod3DeliveredCapacity;
	
	
	//	Historic Performance Period 3 Settlement Period *
		@FindBy(xpath = "//input[@id=\"Sections[19].Questions[71].SelectedValue\"]")
		WebElement EXGHistoricPerformancePeriod3SettlementPeriod;
	
	//	Start of Date Range for Historic Performance Data (DD/MM/YYY) *
		@FindBy(xpath = "//input[@id=\"Sections[19].Questions[72].SelectedValue\"]")
		WebElement EXGStartofDateRangeforHistoricPerformanceData;
		
	//	End of Date Range for Historic Performance Data (DD/MM/YYY) *
		@FindBy(xpath = "//input[@id=\"Sections[19].Questions[73].SelectedValue\"]")
		WebElement EXGEndofDateRangeforHistoricPerformanceData;
		
	//  Confirmation of Historic Metered Output *
		@FindBy(xpath = "//input[@id=\"Sections[19].Questions[74].SelectedValue\"]")
		WebElement EXGConfirmationofHistoricMeteredOutput;
		
	//	Confirmation of Line Loss Factors 
		@FindBy(xpath = "//input[@id=\"Sections[19].Questions[75].SelectedValue\"]")
		WebElement EXGConfirmationofLineLossFactors;
	
		
		
		
		
	//	Declaration of Solvency *
		@FindBy(xpath = "//input[@id=\"Sections[20].Questions[57].SelectedValue\"]")
		WebElement EXGDeclarationofSolvency;
	
	//  LCE - Application made but not Determined *
		@FindBy(xpath = "//input[@id=\"Sections[21].Questions[58].SelectedValue\"]")
		WebElement EXGLCEApplicationmadebutnotDetermined;
	
	//  LCE Withdrawal Document 
		@FindBy(xpath = "//input[@id=\"Sections[21].Questions[129].SelectedValue\"]")
		WebElement EXGLCEWithdrawalDocument;
		
	//  LCE - Current Benefit but not Relevant Year 
		@FindBy(xpath = "//input[@id=\"Sections[21].Questions[59].SelectedValue\"]")
		WebElement EXGLCECurrentBenefitbutnotRelevantYear;
		
	//  LCE Term document or LCE Non-Support document
		@FindBy(xpath = "//input[@id=\"Sections[21].Questions[130].SelectedValue\"]")
		WebElement  EXGLCETermdocumentorLCENonSupportdocument;
	
	//  LCE - No Current Benefit and not Relevant Year *
		@FindBy(xpath = "//input[@id=\"Sections[21].Questions[60].SelectedValue\"]")
		WebElement  EXGLCENoCurrentBenefitandnotRelevantYear;
		
	//  Low Carbon Grant Status *
		@FindBy(xpath = "//input[@id=\"Sections[21].Questions[61].SelectedValue\"]")
		WebElement  EXGLowCarbonGrantStatus;
		
	//	Acknowledge Low Carbon Exclusion Status *	
		@FindBy(xpath = "//input[@id=\"Sections[21].Questions[62].SelectedValue\"]")
		WebElement  EXGAcknowledgeLowCarbonExclusionStatus;
		
	//  STOR No Current contract and not the relevant year	
		@FindBy(xpath = "//input[@id=\"Sections[22].Questions[76].SelectedValue\"]")
		WebElement  EXGSTORNoCurrentcontractandnottherelevantyear;	
		
	//  STOR Subject of Contract but to Withdraw
		@FindBy(xpath = "//input[@id=\"Sections[22].Questions[77].SelectedValue\"]")
		WebElement  EXGSTORSubjectofContractbuttoWithdraw;
		
	//  Conduct - No Market Manipulation *
		@FindBy(xpath = "//input[@id=\"Sections[23].Questions[78].SelectedValue\"]")
		WebElement  EXGConductNoMarketManipulation;
		
	//	Conduct - Complied with all laws *
		@FindBy(xpath = "//input[@id=\"Sections[23].Questions[79].SelectedValue\"]")
		WebElement  EXGConductCompliedwithalllaws;
		
	//  Conduct - No offer to pay any officer *
		@FindBy(xpath = "//input[@id=\"Sections[23].Questions[80].SelectedValue\"]")
		WebElement  EXGConductNooffertopayanyofficer;
		
	//  Conduct - No breach of the Bribery Act 2010 *
		@FindBy(xpath = "//input[@id=\"Sections[23].Questions[81].SelectedValue\"]")
		WebElement  EXGConductNobreachoftheBriberyAct2010;
		
	//  Conduct - No Information disclosure *
		@FindBy(xpath = "//input[@id=\"Sections[23].Questions[82].SelectedValue\"]")
		WebElement  EXGConductNoInformationdisclosure;
		
	//  Declaration that Application is correct *
		@FindBy(xpath = "//input[@id=\"Sections[23].Questions[83].SelectedValue\"]")
		WebElement  EXGDeclarationthatApplicationiscorrect;
		
	//  MPAN Declaration*
		@FindBy(xpath = "//textarea[@id=\"Sections[23].Questions[84].SelectedValue\"]")
		WebElement  EXGMPANDeclaration;
		
		
	//  Application Save Button	
		@FindBy(xpath = "//input[@value=\"Save\"]")
		WebElement  Applicationsavebutton;
		
	//  Application Save Button	
		@FindBy(xpath = "//input[@value=\"Submit\"]")
		WebElement  Applicationsubmitbutton;	
		
		
	// Application Final Save
		@FindBy(xpath = "//span[text()=\"Yes\"]")
		WebElement  ApplicationSAVE_Submityesbutton;
		
		
		
		
		
		
		
		
		
		
	
	//Methods
	
	//Application creation
	

	public void applicationcreation() throws InterruptedException {
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Add_new_Application_button);
		Thread.sleep(2000);
		actions.moveToElement(PreQual_application);
		actions.click().build().perform();	
				
		Selectcompany.click();
		Searchfield.sendKeys("test");
		Highlightedcompany.click();

		Selectcmu.click();
		Searchfield.sendKeys("sm12f8");
		Highlightedcmu.click();
		Thread.sleep(2000);
		SelectAuction.click();
		Searchfield.sendKeys("05Mare2e");
		
		HighlightedAuction.click();
		
		CreateApplication.click();
	
		
	}
	
	
	public boolean verifyApplicationcompany(){
		
		return EXGApplicantCompanytext.isDisplayed();
		}
	
	public boolean verifyApplicationcmu(){
		
		return EXGAuctiontext.isDisplayed();
		}
	
	public void Applcationsave() throws InterruptedException, IOException {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Add_new_Application_button);
		Thread.sleep(4000);
		actions.moveToElement(PreQual_application);
		actions.click().build().perform();	
				
		Selectcompany.click();
		Searchfield.sendKeys("test");
		Highlightedcompany.click();

		Selectcmu.click();
		Searchfield.sendKeys("sm12f8");
		Highlightedcmu.click();
		
		Thread.sleep(4000);
		SelectAuction.click();
		Searchfield.sendKeys("05Mare2e");
		HighlightedAuction.click();
		
		Thread.sleep(2000);
		
		CreateApplication.click();
		
		
		EXGCompanyandCMUSummaryPage.click();
		
		EXGCoveringLetter.sendKeys(System.getProperty("user.dir") + "/test.txt");
		EXGApplicationDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		EXGAggregatorDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		EXGLegalOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		EXGJointOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		//EXGPrimaryFuelType.sendKeys(System.getProperty("user.dir") + "/test.txt");
		
		
		//navigate to Application page
		Thread.sleep(2000);

		EXGApplication_Page.click();
		//Historic Dates
	
		js.executeScript("arguments[0].value='03/04/2018';", EXGHistoricperiod1date);
		js.executeScript("arguments[0].value='30';", EXGHistoricperiod1deliverycapacity);
		js.executeScript("arguments[0].value='30';", EXGHistoricperiod1settlementperiod);
		js.executeScript("arguments[0].value='03/04/2018';", EXGHistoricPerformancePeriod2Date);
		js.executeScript("arguments[0].value='30';", EXGHistoricPerformancePeriod2DeliveredCapacity);
		js.executeScript("arguments[0].value='30';", EXGHistoricPerformancePeriod2SettlementPeriod);
		js.executeScript("arguments[0].value='03/04/2018';", EXGHistoricPerformancePeriod3Date);
		js.executeScript("arguments[0].value='30';", EXGHistoricPerformancePeriod3DeliveredCapacity);
		js.executeScript("arguments[0].value='30';", EXGHistoricPerformancePeriod3SettlementPeriod);
		js.executeScript("arguments[0].value='03/04/2018';", EXGStartofDateRangeforHistoricPerformanceData);
		js.executeScript("arguments[0].value='03/04/2018';", EXGEndofDateRangeforHistoricPerformanceData);
		EXGConfirmationofHistoricMeteredOutput.sendKeys(System.getProperty("user.dir") + "/test.txt");
		EXGConfirmationofLineLossFactors.sendKeys(System.getProperty("user.dir") + "/test.txt");
		js.executeScript("window.scrollBy(0,1000)", "EXGDeclarationofSolvency");
		Thread.sleep(1500);
		EXGDeclarationofSolvency.click();
		js.executeScript("window.scrollBy(0,250)", "EXGAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(1500);
		EXGLCEApplicationmadebutnotDetermined.click();
		EXGLCEWithdrawalDocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Thread.sleep(2000);
		EXGLCECurrentBenefitbutnotRelevantYear.click();
		EXGLCETermdocumentorLCENonSupportdocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		js.executeScript("window.scrollBy(0,250)", "EXGAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(1500);
		EXGLCENoCurrentBenefitandnotRelevantYear.click();
		EXGLowCarbonGrantStatus.click();
		js.executeScript("window.scrollBy(0,250)", "EXGAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(1500);
		EXGAcknowledgeLowCarbonExclusionStatus.click();
		EXGSTORNoCurrentcontractandnottherelevantyear.click();
		EXGSTORSubjectofContractbuttoWithdraw.click();
		EXGConductNoMarketManipulation.click();
		js.executeScript("window.scrollBy(0,250)", "EXGConductNoInformationdisclosure");
		Thread.sleep(1500);
		EXGConductCompliedwithalllaws.click();
		EXGConductNooffertopayanyofficer.click();
		js.executeScript("window.scrollBy(0,250)", "EXGMPANDeclaration");
		Thread.sleep(1500);
		EXGConductNobreachoftheBriberyAct2010.click();		
		EXGConductNoInformationdisclosure.click();
		EXGDeclarationthatApplicationiscorrect.click();
		js.executeScript("window.scrollBy(0,250)", "EXGConductNoInformationdisclosure");
		Thread.sleep(1500);
		EXGMPANDeclaration.sendKeys("Text1");
		js.executeScript("window.scrollBy(0,650)", "");
		Applicationsavebutton.click();
		
		ApplicationSAVE_Submityesbutton.click();
	
	}
	
	public void Saveclick() {

		Applicationsavebutton.click();
		ApplicationSAVE_Submityesbutton.click();		
	}
	
	public void Submitclick() {
			
		Applicationsubmitbutton.click();
		ApplicationSAVE_Submityesbutton.click();
	}
	
}
