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

	@FindBy(xpath = "//th[@class='dt-head-left']/input[@type = 'text' and @data-filter-property = 'CMU_Identifier' and @placeholder='Filter by CMU']")
	WebElement CMU_Filter_box;
	
	@FindBy(xpath = "//td[@data-dt-row=\"0\"]//a[text()='Edit']")
	WebElement Aplication_edit;
	
	
	// Existing Generating CMU

	@FindBy(xpath = "//label[text()=\"Applicant Company\"]//following-sibling::p")
	WebElement EXGApplicantCompanytext;

	@FindBy(xpath = "//label[text()=\"Auction\"]//following-sibling::p")
	WebElement EXGAuctiontext;

	// Company and CMU Summary Page

	@FindBy(xpath = "//a[@id=\"ui-id-3\"]")
	WebElement EXGCompanyandCMUSummaryPage;

	// Covering Letter
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[69265].SelectedValue\"]")
	WebElement EXGCoveringLetter;

	// Application Status
	@FindBy(xpath = "//span[@id=\"select2-Sections[18].Questions[52].SelectedValue-container\"]")
	WebElement EXGApplicationstatus;

	// Application Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[53].SelectedValue\"]")
	WebElement EXGApplicationDeclaration;

	// Aggregator Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[54].SelectedValue\"]")
	WebElement EXGAggregatorDeclaration;

	// Legal Owner declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[55].SelectedValue\"]")
	WebElement EXGLegalOwnerDeclaration;

	// Joint Owner Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[56].SelectedValue\"]")
	WebElement EXGJointOwnerDeclaration;

	// Primary Fuel Type *
	@FindBy(xpath = "//span[@id=\"select2-CompanyAndCMUSummary.PrimaryFuelType-g2-container\"]")
	WebElement EXGPrimaryFuelType;

	// Application Page

	@FindBy(xpath = "//a[text()=\"Application Page\"]")
	WebElement EXGApplication_Page;

	// Historic Performance Period 1 Date (DD/MM/YYYY)
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[63].SelectedValue\"]")
	WebElement EXGHistoricperiod1date;

	// Historic Performance Period 1 delivery capacity (DD/MM/YYYY)
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[64].SelectedValue\"]")
	WebElement EXGHistoricperiod1deliverycapacity;

	// Historic Performance Period 1 Settlement Period
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[65].SelectedValue\"]")
	WebElement EXGHistoricperiod1settlementperiod;

	// Historic Performance Period 2 Date (DD/MM/YYYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[66].SelectedValue\"]")
	WebElement EXGHistoricPerformancePeriod2Date;

	// Historic Performance Period 2 Delivered Capacity *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[67].SelectedValue\"]")
	WebElement EXGHistoricPerformancePeriod2DeliveredCapacity;

	// Historic Performance Period 2 Settlement Period *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[68].SelectedValue\"]")
	WebElement EXGHistoricPerformancePeriod2SettlementPeriod;

	// Historic Performance Period 3 Date (DD/MM/YYYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[69].SelectedValue\"]")
	WebElement EXGHistoricPerformancePeriod3Date;

	// Historic Performance Period 3 Delivered Capacity *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[70].SelectedValue\"]")
	WebElement EXGHistoricPerformancePeriod3DeliveredCapacity;

	// Historic Performance Period 3 Settlement Period *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[71].SelectedValue\"]")
	WebElement EXGHistoricPerformancePeriod3SettlementPeriod;

	// Start of Date Range for Historic Performance Data (DD/MM/YYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[72].SelectedValue\"]")
	WebElement EXGStartofDateRangeforHistoricPerformanceData;

	// End of Date Range for Historic Performance Data (DD/MM/YYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[73].SelectedValue\"]")
	WebElement EXGEndofDateRangeforHistoricPerformanceData;

	// Confirmation of Historic Metered Output *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[74].SelectedValue\"]")
	WebElement EXGConfirmationofHistoricMeteredOutput;

	// Confirmation of Line Loss Factors
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[75].SelectedValue\"]")
	WebElement EXGConfirmationofLineLossFactors;

	// Declaration of Solvency *
	@FindBy(xpath = "//input[@id=\"Sections[20].Questions[57].SelectedValue\"]")
	WebElement EXGDeclarationofSolvency;

	// LCE - Application made but not Determined *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[58].SelectedValue\"]")
	WebElement EXGLCEApplicationmadebutnotDetermined;

	// LCE Withdrawal Document
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[129].SelectedValue\"]")
	WebElement EXGLCEWithdrawalDocument;

	// LCE - Current Benefit but not Relevant Year
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[59].SelectedValue\"]")
	WebElement EXGLCECurrentBenefitbutnotRelevantYear;

	// LCE Term document or LCE Non-Support document
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[130].SelectedValue\"]")
	WebElement EXGLCETermdocumentorLCENonSupportdocument;

	// LCE - No Current Benefit and not Relevant Year *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[60].SelectedValue\"]")
	WebElement EXGLCENoCurrentBenefitandnotRelevantYear;

	// Low Carbon Grant Status *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[61].SelectedValue\"]")
	WebElement EXGLowCarbonGrantStatus;

	// Acknowledge Low Carbon Exclusion Status *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[62].SelectedValue\"]")
	WebElement EXGAcknowledgeLowCarbonExclusionStatus;

	// STOR No Current contract and not the relevant year
	@FindBy(xpath = "//input[@id=\"Sections[22].Questions[76].SelectedValue\"]")
	WebElement EXGSTORNoCurrentcontractandnottherelevantyear;

	// STOR Subject of Contract but to Withdraw
	@FindBy(xpath = "//input[@id=\"Sections[22].Questions[77].SelectedValue\"]")
	WebElement EXGSTORSubjectofContractbuttoWithdraw;

	// Conduct - No Market Manipulation *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[78].SelectedValue\"]")
	WebElement EXGConductNoMarketManipulation;

	// Conduct - Complied with all laws *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[79].SelectedValue\"]")
	WebElement EXGConductCompliedwithalllaws;

	// Conduct - No offer to pay any officer *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[80].SelectedValue\"]")
	WebElement EXGConductNooffertopayanyofficer;

	// Conduct - No breach of the Bribery Act 2010 *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[81].SelectedValue\"]")
	WebElement EXGConductNobreachoftheBriberyAct2010;

	// Conduct - No Information disclosure *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[82].SelectedValue\"]")
	WebElement EXGConductNoInformationdisclosure;

	// Declaration that Application is correct *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[83].SelectedValue\"]")
	WebElement EXGDeclarationthatApplicationiscorrect;

	// MPAN Declaration*
	@FindBy(xpath = "//textarea[@id=\"Sections[23].Questions[84].SelectedValue\"]")
	WebElement EXGMPANDeclaration;

	// Application Save Button
	@FindBy(xpath = "//input[@value=\"Save\"]")
	WebElement Applicationsavebutton;

	// Application Save Button
	@FindBy(xpath = "//input[@value=\"Submit\"]")
	WebElement Applicationsubmitbutton;

	// Application Final Save
	@FindBy(xpath = "//span[@class=\"ui-button-text\" and text()=\"Yes\"]")
	WebElement ApplicationSAVE_Submityesbutton;

	// ////////////////////// Existing InterConnector CMU
	// /////////////////////////////////////////

	@FindBy(xpath = "//label[text()=\"Applicant Company\"]//following-sibling::p")
	WebElement EXIApplicantCompanytext;

	@FindBy(xpath = "//label[text()=\"Auction\"]//following-sibling::p")
	WebElement EXIAuctiontext;

	// Company and CMU Summary Page

	@FindBy(xpath = "//a[@id=\"ui-id-3\"]")
	WebElement EXICompanyandCMUSummaryPage;

	// Covering Letter
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[69265].SelectedValue\"]")
	WebElement EXICoveringLetter;

	// Application Status
	@FindBy(xpath = "//span[@id=\"select2-Sections[18].Questions[52].SelectedValue-container\"]")
	WebElement EXIApplicationstatus;

	// Application Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[53].SelectedValue\"]")
	WebElement EXIApplicationDeclaration;

	// Aggregator Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[54].SelectedValue\"]")
	WebElement EXIAggregatorDeclaration;

	// Legal Owner declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[55].SelectedValue\"]")
	WebElement EXILegalOwnerDeclaration;

	// Joint Owner Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[56].SelectedValue\"]")
	WebElement EXIJointOwnerDeclaration;

	// Primary Fuel Type *
	@FindBy(xpath = "//span[@id=\"select2-CompanyAndCMUSummary.PrimaryFuelType-g2-container\"]")
	WebElement EXIPrimaryFuelType;

	// Application Page

	@FindBy(xpath = "//a[text()=\"Application Page\"]")
	WebElement EXIApplication_Page;

	// Historic Performance Period 1 Date (DD/MM/YYYY)
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[63].SelectedValue\"]")
	WebElement EXIHistoricperiod1date;

	// Historic Performance Period 1 delivery capacity (DD/MM/YYYY)
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[64].SelectedValue\"]")
	WebElement EXIHistoricperiod1deliverycapacity;

	// Historic Performance Period 1 Settlement Period
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[65].SelectedValue\"]")
	WebElement EXIHistoricperiod1settlementperiod;

	// Historic Performance Period 2 Date (DD/MM/YYYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[66].SelectedValue\"]")
	WebElement EXIHistoricPerformancePeriod2Date;

	// Historic Performance Period 2 Delivered Capacity *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[67].SelectedValue\"]")
	WebElement EXIHistoricPerformancePeriod2DeliveredCapacity;

	// Historic Performance Period 2 Settlement Period *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[68].SelectedValue\"]")
	WebElement EXIHistoricPerformancePeriod2SettlementPeriod;

	// Historic Performance Period 3 Date (DD/MM/YYYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[69].SelectedValue\"]")
	WebElement EXIHistoricPerformancePeriod3Date;

	// Historic Performance Period 3 Delivered Capacity *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[70].SelectedValue\"]")
	WebElement EXIHistoricPerformancePeriod3DeliveredCapacity;

	// Historic Performance Period 3 Settlement Period *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[71].SelectedValue\"]")
	WebElement EXIHistoricPerformancePeriod3SettlementPeriod;

	// Start of Date Range for Historic Performance Data (DD/MM/YYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[72].SelectedValue\"]")
	WebElement EXIStartofDateRangeforHistoricPerformanceData;

	// End of Date Range for Historic Performance Data (DD/MM/YYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[73].SelectedValue\"]")
	WebElement EXIEndofDateRangeforHistoricPerformanceData;

	// Confirmation of Historic Metered Output *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[74].SelectedValue\"]")
	WebElement EXIConfirmationofHistoricMeteredOutput;

	// Declaration of Solvency *
	@FindBy(xpath = "//input[@id=\"Sections[20].Questions[57].SelectedValue\"]")
	WebElement EXIDeclarationofSolvency;

	// LCE - Application made but not Determined *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[58].SelectedValue\"]")
	WebElement EXILCEApplicationmadebutnotDetermined;

	// LCE Withdrawal Document
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[129].SelectedValue\"]")
	WebElement EXILCEWithdrawalDocument;

	// LCE - Current Benefit but not Relevant Year
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[59].SelectedValue\"]")
	WebElement EXILCECurrentBenefitbutnotRelevantYear;

	// LCE Term document or LCE Non-Support document
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[130].SelectedValue\"]")
	WebElement EXILCETermdocumentorLCENonSupportdocument;

	// LCE - No Current Benefit and not Relevant Year *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[60].SelectedValue\"]")
	WebElement EXILCENoCurrentBenefitandnotRelevantYear;

	// Low Carbon Grant Status *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[61].SelectedValue\"]")
	WebElement EXILowCarbonGrantStatus;

	// Acknowledge Low Carbon Exclusion Status *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[62].SelectedValue\"]")
	WebElement EXIAcknowledgeLowCarbonExclusionStatus;

	// STOR No Current contract and not the relevant year
	@FindBy(xpath = "//input[@id=\"Sections[22].Questions[76].SelectedValue\"]")
	WebElement EXISTORNoCurrentcontractandnottherelevantyear;

	// STOR Subject of Contract but to Withdraw
	@FindBy(xpath = "//input[@id=\"Sections[22].Questions[77].SelectedValue\"]")
	WebElement EXISTORSubjectofContractbuttoWithdraw;

	// Conduct - No Market Manipulation *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[78].SelectedValue\"]")
	WebElement EXIConductNoMarketManipulation;

	// Conduct - Complied with all laws *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[79].SelectedValue\"]")
	WebElement EXIConductCompliedwithalllaws;

	// Conduct - No offer to pay any officer *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[80].SelectedValue\"]")
	WebElement EXIConductNooffertopayanyofficer;

	// Conduct - No breach of the Bribery Act 2010 *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[81].SelectedValue\"]")
	WebElement EXIConductNobreachoftheBriberyAct2010;

	// Conduct - No Information disclosure *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[82].SelectedValue\"]")
	WebElement EXIConductNoInformationdisclosure;

	// Declaration that Application is correct *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[83].SelectedValue\"]")
	WebElement EXIDeclarationthatApplicationiscorrect;

	// MPAN Declaration*
	@FindBy(xpath = "//textarea[@id=\"Sections[23].Questions[84].SelectedValue\"]")
	WebElement EXIMPANDeclaration;

	// ////////////////////// NEW BUILD GENERATING CMU
	// /////////////////////////////////////////

	@FindBy(xpath = "//label[text()=\"Applicant Company\"]//following-sibling::p")
	WebElement NBGApplicantCompanytext;

	@FindBy(xpath = "//label[text()=\"Auction\"]//following-sibling::p")
	WebElement NBGAuctiontext;

	// Company and CMU Summary Page

	@FindBy(xpath = "//a[@id=\"ui-id-3\"]")
	WebElement NBGCompanyandCMUSummaryPage;

	// Covering Letter
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[69265].SelectedValue\"]")
	WebElement NBGCoveringLetter;

	// Application Status
	@FindBy(xpath = "//span[@id=\"select2-Sections[18].Questions[52].SelectedValue-container\"]")
	WebElement NBGApplicationstatus;

	// Application Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[53].SelectedValue\"]")
	WebElement NBGApplicationDeclaration;

	// Aggregator Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[54].SelectedValue\"]")
	WebElement NBGAggregatorDeclaration;

	// Legal Owner declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[55].SelectedValue\"]")
	WebElement NBGLegalOwnerDeclaration;

	// Joint Owner Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[56].SelectedValue\"]")
	WebElement NBGJointOwnerDeclaration;

	// Primary Fuel Type *
	@FindBy(xpath = "//span[@id=\"select2-CompanyAndCMUSummary.PrimaryFuelType-g2-container\"]")
	WebElement NBGPrimaryFuelType;

	// Application Page

	@FindBy(xpath = "//a[text()=\"Application Page\"]")
	WebElement NBGApplication_Page;

	// Declaration of Solvency *
	@FindBy(xpath = "//input[@id=\"Sections[20].Questions[57].SelectedValue\"]")
	WebElement NBGDeclarationofSolvency;

	// LCE - Application made but not Determined *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[58].SelectedValue\"]")
	WebElement NBGLCEApplicationmadebutnotDetermined;

	// LCE Withdrawal Document
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[129].SelectedValue\"]")
	WebElement NBGLCEWithdrawalDocument;

	// LCE - Current Benefit but not Relevant Year
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[59].SelectedValue\"]")
	WebElement NBGLCECurrentBenefitbutnotRelevantYear;

	// LCE Term document or LCE Non-Support document
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[130].SelectedValue\"]")
	WebElement NBGLCETermdocumentorLCENonSupportdocument;

	// LCE - No Current Benefit and not Relevant Year *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[60].SelectedValue\"]")
	WebElement NBGLCENoCurrentBenefitandnotRelevantYear;

	// Low Carbon Grant Status *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[61].SelectedValue\"]")
	WebElement NBGLowCarbonGrantStatus;

	// Acknowledge Low Carbon Exclusion Status *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[62].SelectedValue\"]")
	WebElement NBGAcknowledgeLowCarbonExclusionStatus;

	// STOR No Current contract and not the relevant year
	@FindBy(xpath = "//input[@id=\"Sections[22].Questions[76].SelectedValue\"]")
	WebElement NBGSTORNoCurrentcontractandnottherelevantyear;

	// STOR Subject of Contract but to Withdraw
	@FindBy(xpath = "//input[@id=\"Sections[22].Questions[77].SelectedValue\"]")
	WebElement NBGSTORSubjectofContractbuttoWithdraw;

	// Conduct - No Market Manipulation *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[78].SelectedValue\"]")
	WebElement NBGConductNoMarketManipulation;

	// Conduct - Complied with all laws *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[79].SelectedValue\"]")
	WebElement NBGConductCompliedwithalllaws;

	// Conduct - No offer to pay any officer *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[80].SelectedValue\"]")
	WebElement NBGConductNooffertopayanyofficer;

	// Conduct - No breach of the Bribery Act 2010 *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[81].SelectedValue\"]")
	WebElement NBGConductNobreachoftheBriberyAct2010;

	// Conduct - No Information disclosure *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[82].SelectedValue\"]")
	WebElement NBGConductNoInformationdisclosure;

	// Declaration that Application is correct *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[83].SelectedValue\"]")
	WebElement NBGDeclarationthatApplicationiscorrect;

	// MPAN Declaration*
	@FindBy(xpath = "//textarea[@id=\"Sections[23].Questions[84].SelectedValue\"]")
	WebElement NBGMPANDeclaration;

	// ////////////////////// Refurb GENERATING CMU
	// /////////////////////////////////////// //

	@FindBy(xpath = "//label[text()=\"Applicant Company\"]//following-sibling::p")
	WebElement RBGApplicantCompanytext;

	@FindBy(xpath = "//label[text()=\"Auction\"]//following-sibling::p")
	WebElement RBGAuctiontext;

	// Company and CMU Summary Page

	@FindBy(xpath = "//a[@id=\"ui-id-3\"]")
	WebElement RBGCompanyandCMUSummaryPage;

	// Covering Letter
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[69265].SelectedValue\"]")
	WebElement RBGCoveringLetter;

	// Application Status
	@FindBy(xpath = "//span[@id=\"select2-Sections[18].Questions[52].SelectedValue-container\"]")
	WebElement RBGApplicationstatus;

	// Application Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[53].SelectedValue\"]")
	WebElement RBGApplicationDeclaration;

	// Aggregator Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[54].SelectedValue\"]")
	WebElement RBGAggregatorDeclaration;

	// Legal Owner declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[55].SelectedValue\"]")
	WebElement RBGLegalOwnerDeclaration;

	// Joint Owner Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[56].SelectedValue\"]")
	WebElement RBGJointOwnerDeclaration;

	// Primary Fuel Type *
	@FindBy(xpath = "//span[@id=\"select2-CompanyAndCMUSummary.PrimaryFuelType-g2-container\"]")
	WebElement RBGPrimaryFuelType;

	// Refurbishing CMU Structure Tab

	@FindBy(xpath = "//a[text()=\"Refurbishing CMU Structure\"]")
	WebElement RBGRefurbishingCMUStructuretab;

	@FindBy(xpath = "//input[@name=\"Sections[26].Questions[140].SelectedValue\" and @value =\"Yes\"]")
	WebElement RBGPreRefurbishmentOpt_Out_Yes;

	@FindBy(xpath = "//input[@name=\"Sections[26].Questions[140].SelectedValue\" and @value =\"No\"]")
	WebElement RBGPreRefurbishmentOpt_Out_No;

	// Application Page (Pre-Refurb) tab

	@FindBy(xpath = "//a[text()=\"Application Page (Pre-Refurb)\"]")
	WebElement RBGApplicationPagePre_Refurbtab;

	// Historic Performance Period 1 Date (DD/MM/YYYY)
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[63].SelectedValue\"]")
	WebElement RBGHistoricperiod1date;

	// Historic Performance Period 1 delivery capacity (DD/MM/YYYY)
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[64].SelectedValue\"]")
	WebElement RBGHistoricperiod1deliverycapacity;

	// Historic Performance Period 1 Settlement Period
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[65].SelectedValue\"]")
	WebElement RBGHistoricperiod1settlementperiod;

	// Historic Performance Period 2 Date (DD/MM/YYYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[66].SelectedValue\"]")
	WebElement RBGHistoricPerformancePeriod2Date;

	// Historic Performance Period 2 Delivered Capacity *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[67].SelectedValue\"]")
	WebElement RBGHistoricPerformancePeriod2DeliveredCapacity;

	// Historic Performance Period 2 Settlement Period *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[68].SelectedValue\"]")
	WebElement RBGHistoricPerformancePeriod2SettlementPeriod;

	// Historic Performance Period 3 Date (DD/MM/YYYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[69].SelectedValue\"]")
	WebElement RBGHistoricPerformancePeriod3Date;

	// Historic Performance Period 3 Delivered Capacity *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[70].SelectedValue\"]")
	WebElement RBGHistoricPerformancePeriod3DeliveredCapacity;

	// Historic Performance Period 3 Settlement Period *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[71].SelectedValue\"]")
	WebElement RBGHistoricPerformancePeriod3SettlementPeriod;

	// Start of Date Range for Historic Performance Data (DD/MM/YYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[72].SelectedValue\"]")
	WebElement RBGStartofDateRangeforHistoricPerformanceData;

	// End of Date Range for Historic Performance Data (DD/MM/YYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[73].SelectedValue\"]")
	WebElement RBGEndofDateRangeforHistoricPerformanceData;

	// Confirmation of Historic Metered Output *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[74].SelectedValue\"]")
	WebElement RBGConfirmationofHistoricMeteredOutput;

	// Confirmation of Line Loss Factors
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[75].SelectedValue\"]")
	WebElement RBGConfirmationofLineLossFactors;

	// Application Page Post refurb

	@FindBy(xpath = "//a[text()=\"Application Page (Post-Refurb)\"]")
	WebElement RBGApplication_Page_post_refurb;

	@FindBy(xpath = "//a[text()=\"Application Page\"]")
	WebElement RBGApplication_Page;

	// Declaration of Solvency *
	@FindBy(xpath = "//input[@id=\"Sections[27].Questions[141].SelectedValue\"]")
	WebElement RBGDeclarationofSolvency;

	// LCE - Application made but not Determined *
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[142].SelectedValue\"]")
	WebElement RBGLCEApplicationmadebutnotDetermined;

	// LCE Withdrawal Document
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[162].SelectedValue\"]")
	WebElement RBGLCEWithdrawalDocument;

	// LCE - Current Benefit but not Relevant Year
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[143].SelectedValue\"]")
	WebElement RBGLCECurrentBenefitbutnotRelevantYear;

	// LCE Term document or LCE Non-Support document
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[163].SelectedValue\"]")
	WebElement RBGLCETermdocumentorLCENonSupportdocument;

	// LCE - No Current Benefit and not Relevant Year *
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[144].SelectedValue\"]")
	WebElement RBGLCENoCurrentBenefitandnotRelevantYear;

	// Low Carbon Grant Status *
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[145].SelectedValue\"]")
	WebElement RBGLowCarbonGrantStatus;

	// Acknowledge Low Carbon Exclusion Status *
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[146].SelectedValue\"]")
	WebElement RBGAcknowledgeLowCarbonExclusionStatus;

	// STOR Declarations//

	// STOR No Current contract and not the relevant year
	@FindBy(xpath = "//input[@id=\"Sections[29].Questions[164].SelectedValue\"]")
	WebElement RBGSTORNoCurrentcontractandnottherelevantyear;

	// STOR Subject of Contract but to Withdraw
	@FindBy(xpath = "//input[@id=\"Sections[29].Questions[165].SelectedValue\"]")
	WebElement RBGSTORSubjectofContractbuttoWithdraw;

	// Conduct - No Market Manipulation *
	@FindBy(xpath = "//input[@id=\"Sections[30].Questions[166].SelectedValue\"]")
	WebElement RBGConductNoMarketManipulation;

	// Conduct - Complied with all laws *
	@FindBy(xpath = "//input[@id=\"Sections[30].Questions[167].SelectedValue\"]")
	WebElement RBGConductCompliedwithalllaws;

	// Conduct - No offer to pay any officer *
	@FindBy(xpath = "//input[@id=\"Sections[30].Questions[168].SelectedValue\"]")
	WebElement RBGConductNooffertopayanyofficer;

	// Conduct - No breach of the Bribery Act 2010 *
	@FindBy(xpath = "//input[@id=\"Sections[30].Questions[169].SelectedValue\"]")
	WebElement RBGConductNobreachoftheBriberyAct2010;

	// Conduct - No Information disclosure *
	@FindBy(xpath = "//input[@id=\"Sections[30].Questions[170].SelectedValue\"]")
	WebElement RBGConductNoInformationdisclosure;

	// Declaration that Application is correct *
	@FindBy(xpath = "//input[@id=\"Sections[30].Questions[171].SelectedValue\"]")
	WebElement RBGDeclarationthatApplicationiscorrect;

	// MPAN Declaration*
	@FindBy(xpath = "//textarea[@id=\"Sections[30].Questions[172].SelectedValue\"]")
	WebElement RBGMPANDeclaration;

	// /////// ///////// Proven DSR CMU ///////// //////// //

	@FindBy(xpath = "//label[text()=\"Applicant Company\"]//following-sibling::p")
	WebElement PDSRApplicantCompanytext;

	@FindBy(xpath = "//label[text()=\"Auction\"]//following-sibling::p")
	WebElement PDSRAuctiontext;

	// Company and CMU Summary Page

	@FindBy(xpath = "//a[@id=\"ui-id-3\"]")
	WebElement PDSRCompanyandCMUSummaryPage;

	// Covering Letter
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[69265].SelectedValue\"]")
	WebElement PDSRCoveringLetter;

	// Application Status
	@FindBy(xpath = "//span[@id=\"select2-Sections[18].Questions[52].SelectedValue-container\"]")
	WebElement PDSRApplicationstatus;

	// Application Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[53].SelectedValue\"]")
	WebElement PDSRApplicationDeclaration;

	// Aggregator Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[54].SelectedValue\"]")
	WebElement PDSRAggregatorDeclaration;

	// Legal Owner declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[55].SelectedValue\"]")
	WebElement PDSRLegalOwnerDeclaration;

	// Joint Owner Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[56].SelectedValue\"]")
	WebElement PDSRJointOwnerDeclaration;

	// Primary Fuel Type *
	@FindBy(xpath = "//span[@id=\"select2-CompanyAndCMUSummary.PrimaryFuelType-g2-container\"]")
	WebElement PDSRPrimaryFuelType;

	// Application Page (Pre-Refurb) tab

	@FindBy(xpath = "//a[text()=\"Application Page\"]")
	WebElement PDSRApplicationPage_tab;

	// Declaration of Solvency *
	@FindBy(xpath = "//input[@id=\"Sections[20].Questions[57].SelectedValue\"]")
	WebElement PDSRDeclarationofSolvency;

	// LCE - Application made but not Determined *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[58].SelectedValue\"]")
	WebElement PDSRLCEApplicationmadebutnotDetermined;

	// LCE Withdrawal Document
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[129].SelectedValue\"]")
	WebElement PDSRLCEWithdrawalDocument;

	// LCE - Current Benefit but not Relevant Year
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[59].SelectedValue\"]")
	WebElement PDSRLCECurrentBenefitbutnotRelevantYear;

	// LCE Term document or LCE Non-Support document
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[130].SelectedValue\"]")
	WebElement PDSRLCETermdocumentorLCENonSupportdocument;

	// LCE - No Current Benefit and not Relevant Year *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[60].SelectedValue\"]")
	WebElement PDSRLCENoCurrentBenefitandnotRelevantYear;

	// Low Carbon Grant Status *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[61].SelectedValue\"]")
	WebElement PDSRLowCarbonGrantStatus;

	// Acknowledge Low Carbon Exclusion Status *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[62].SelectedValue\"]")
	WebElement PDSRAcknowledgeLowCarbonExclusionStatus;

	// STOR Declarations//

	// STOR No Current contract and not the relevant year
	@FindBy(xpath = "//input[@id=\"Sections[22].Questions[76].SelectedValue\"]")
	WebElement PDSRSTORNoCurrentcontractandnottherelevantyear;

	// STOR Subject of Contract but to Withdraw
	@FindBy(xpath = "//input[@id=\"Sections[22].Questions[77].SelectedValue\"]")
	WebElement PDSRSTORSubjectofContractbuttoWithdraw;

	// Conduct - No Market Manipulation *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[78].SelectedValue\"]")
	WebElement PDSRConductNoMarketManipulation;

	// Conduct - Complied with all laws *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[79].SelectedValue\"]")
	WebElement PDSRConductCompliedwithalllaws;

	// Conduct - No offer to pay any officer *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[80].SelectedValue\"]")
	WebElement PDSRConductNooffertopayanyofficer;

	// Conduct - No breach of the Bribery Act 2010 *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[81].SelectedValue\"]")
	WebElement PDSRConductNobreachoftheBriberyAct2010;

	// Conduct - No Information disclosure *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[82].SelectedValue\"]")
	WebElement PDSRConductNoInformationdisclosure;

	// Declaration that Application is correct *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[83].SelectedValue\"]")
	WebElement PDSRDeclarationthatApplicationiscorrect;

	// MPAN Declaration*
	@FindBy(xpath = "//textarea[@id=\"Sections[23].Questions[84].SelectedValue\"]")
	WebElement PDSRMPANDeclaration;

	// /////// ///////// UnProven DSR CMU ///////// //////// //

	@FindBy(xpath = "//label[text()=\"Applicant Company\"]//following-sibling::p")
	WebElement UPDSRApplicantCompanytext;

	@FindBy(xpath = "//label[text()=\"Auction\"]//following-sibling::p")
	WebElement UPDSRAuctiontext;

	// Company and CMU Summary Page

	@FindBy(xpath = "//a[@id=\"ui-id-3\"]")
	WebElement UPDSRCompanyandCMUSummaryPage;

	// Covering Letter
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[69265].SelectedValue\"]")
	WebElement UPDSRCoveringLetter;

	// Application Status
	@FindBy(xpath = "//span[@id=\"select2-Sections[18].Questions[52].SelectedValue-container\"]")
	WebElement UPDSRApplicationstatus;

	// Application Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[53].SelectedValue\"]")
	WebElement UPDSRApplicationDeclaration;

	// Aggregator Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[54].SelectedValue\"]")
	WebElement UPDSRAggregatorDeclaration;

	// Legal Owner declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[55].SelectedValue\"]")
	WebElement UPDSRLegalOwnerDeclaration;

	// Joint Owner Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[56].SelectedValue\"]")
	WebElement UPDSRJointOwnerDeclaration;

	// Primary Fuel Type *
	@FindBy(xpath = "//span[@id=\"select2-CompanyAndCMUSummary.PrimaryFuelType-g2-container\"]")
	WebElement UPDSRPrimaryFuelType;

	// Application Page (Pre-Refurb) tab

	@FindBy(xpath = "//a[text()=\"Application Page\"]")
	WebElement UPDSRApplicationPage_tab;

	// Declaration of Solvency *
	@FindBy(xpath = "//input[@id=\"Sections[20].Questions[57].SelectedValue\"]")
	WebElement UPDSRDeclarationofSolvency;

	// LCE - Application made but not Determined *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[58].SelectedValue\"]")
	WebElement UPDSRLCEApplicationmadebutnotDetermined;

	// LCE Withdrawal Document
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[129].SelectedValue\"]")
	WebElement UPDSRLCEWithdrawalDocument;

	// LCE - Current Benefit but not Relevant Year
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[59].SelectedValue\"]")
	WebElement UPDSRLCECurrentBenefitbutnotRelevantYear;

	// LCE Term document or LCE Non-Support document
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[130].SelectedValue\"]")
	WebElement UPDSRLCETermdocumentorLCENonSupportdocument;

	// LCE - No Current Benefit and not Relevant Year *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[60].SelectedValue\"]")
	WebElement UPDSRLCENoCurrentBenefitandnotRelevantYear;

	// Low Carbon Grant Status *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[61].SelectedValue\"]")
	WebElement UPDSRLowCarbonGrantStatus;

	// Acknowledge Low Carbon Exclusion Status *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[62].SelectedValue\"]")
	WebElement UPDSRAcknowledgeLowCarbonExclusionStatus;

	// STOR Declarations//

	// STOR No Current contract and not the relevant year
	@FindBy(xpath = "//input[@id=\"Sections[22].Questions[76].SelectedValue\"]")
	WebElement UPDSRSTORNoCurrentcontractandnottherelevantyear;

	// STOR Subject of Contract but to Withdraw
	@FindBy(xpath = "//input[@id=\"Sections[22].Questions[77].SelectedValue\"]")
	WebElement UPDSRSTORSubjectofContractbuttoWithdraw;

	// Conduct - No Market Manipulation *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[78].SelectedValue\"]")
	WebElement UPDSRConductNoMarketManipulation;

	// Conduct - Complied with all laws *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[79].SelectedValue\"]")
	WebElement UPDSRConductCompliedwithalllaws;

	// Conduct - No offer to pay any officer *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[80].SelectedValue\"]")
	WebElement UPDSRConductNooffertopayanyofficer;

	// Conduct - No breach of the Bribery Act 2010 *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[81].SelectedValue\"]")
	WebElement UPDSRConductNobreachoftheBriberyAct2010;

	// Conduct - No Information disclosure *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[82].SelectedValue\"]")
	WebElement UPDSRConductNoInformationdisclosure;

	// Declaration that Application is correct *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[83].SelectedValue\"]")
	WebElement UPDSRDeclarationthatApplicationiscorrect;

	// MPAN Declaration*
	@FindBy(xpath = "//textarea[@id=\"Sections[23].Questions[84].SelectedValue\"]")
	WebElement UPDSRMPANDeclaration;

	// ////////////////////// Refurb Interconector CMU
	// /////////////////////////////////////// //

	@FindBy(xpath = "//label[text()=\"Applicant Company\"]//following-sibling::p")
	WebElement RBIApplicantCompanytext;

	@FindBy(xpath = "//label[text()=\"Auction\"]//following-sibling::p")
	WebElement RBIAuctiontext;

	// Company and CMU Summary Page

	@FindBy(xpath = "//a[@id=\"ui-id-3\"]")
	WebElement RBICompanyandCMUSummaryPage;

	// Covering Letter
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[69265].SelectedValue\"]")
	WebElement RBICoveringLetter;

	// Application Status
	@FindBy(xpath = "//span[@id=\"select2-Sections[18].Questions[52].SelectedValue-container\"]")
	WebElement RBIApplicationstatus;

	// Application Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[53].SelectedValue\"]")
	WebElement RBIApplicationDeclaration;

	// Aggregator Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[54].SelectedValue\"]")
	WebElement RBIAggregatorDeclaration;

	// Legal Owner declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[55].SelectedValue\"]")
	WebElement RBILegalOwnerDeclaration;

	// Joint Owner Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[56].SelectedValue\"]")
	WebElement RBIJointOwnerDeclaration;

	// Primary Fuel Type *
	@FindBy(xpath = "//span[@id=\"select2-CompanyAndCMUSummary.PrimaryFuelType-g2-container\"]")
	WebElement RBIPrimaryFuelType;

	// Refurbishing CMU Structure Tab

	@FindBy(xpath = "//a[text()=\"Refurbishing CMU Structure\"]")
	WebElement RBIRefurbishingCMUStructuretab;

	@FindBy(xpath = "//input[@name=\"Sections[26].Questions[140].SelectedValue\" and @value =\"Yes\"]")
	WebElement RBIPreRefurbishmentOpt_Out_Yes;

	@FindBy(xpath = "//input[@name=\"Sections[26].Questions[140].SelectedValue\" and @value =\"No\"]")
	WebElement RBIPreRefurbishmentOpt_Out_No;

	// Application Page (Pre-Refurb) tab

	@FindBy(xpath = "//a[text()=\"Application Page (Pre-Refurb)\"]")
	WebElement RBIApplicationPagePre_Refurbtab;

	// Historic Performance Period 1 Date (DD/MM/YYYY)
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[63].SelectedValue\"]")
	WebElement RBIHistoricperiod1date;

	// Historic Performance Period 1 delivery capacity (DD/MM/YYYY)
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[64].SelectedValue\"]")
	WebElement RBIHistoricperiod1deliverycapacity;

	// Historic Performance Period 1 Settlement Period
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[65].SelectedValue\"]")
	WebElement RBIHistoricperiod1settlementperiod;

	// Historic Performance Period 2 Date (DD/MM/YYYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[66].SelectedValue\"]")
	WebElement RBIHistoricPerformancePeriod2Date;

	// Historic Performance Period 2 Delivered Capacity *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[67].SelectedValue\"]")
	WebElement RBIHistoricPerformancePeriod2DeliveredCapacity;

	// Historic Performance Period 2 Settlement Period *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[68].SelectedValue\"]")
	WebElement RBIHistoricPerformancePeriod2SettlementPeriod;

	// Historic Performance Period 3 Date (DD/MM/YYYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[69].SelectedValue\"]")
	WebElement RBIHistoricPerformancePeriod3Date;

	// Historic Performance Period 3 Delivered Capacity *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[70].SelectedValue\"]")
	WebElement RBIHistoricPerformancePeriod3DeliveredCapacity;

	// Historic Performance Period 3 Settlement Period *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[71].SelectedValue\"]")
	WebElement RBIHistoricPerformancePeriod3SettlementPeriod;

	// Start of Date Range for Historic Performance Data (DD/MM/YYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[72].SelectedValue\"]")
	WebElement RBIStartofDateRangeforHistoricPerformanceData;

	// End of Date Range for Historic Performance Data (DD/MM/YYY) *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[73].SelectedValue\"]")
	WebElement RBIEndofDateRangeforHistoricPerformanceData;

	// Confirmation of Historic Metered Output *
	@FindBy(xpath = "//input[@id=\"Sections[19].Questions[74].SelectedValue\"]")
	WebElement RBIConfirmationofHistoricMeteredOutput;

	// Application Page Post refurb

	@FindBy(xpath = "//a[text()=\"Application Page (Post-Refurb)\"]")
	WebElement RBIApplication_Page_post_refurb;

	@FindBy(xpath = "//a[text()=\"Application Page\"]")
	WebElement RBIApplication_Page;

	// Declaration of Solvency *
	@FindBy(xpath = "//input[@id=\"Sections[27].Questions[141].SelectedValue\"]")
	WebElement RBIDeclarationofSolvency;

	// LCE - Application made but not Determined *
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[142].SelectedValue\"]")
	WebElement RBILCEApplicationmadebutnotDetermined;

	// LCE Withdrawal Document
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[162].SelectedValue\"]")
	WebElement RBILCEWithdrawalDocument;

	// LCE - Current Benefit but not Relevant Year
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[143].SelectedValue\"]")
	WebElement RBILCECurrentBenefitbutnotRelevantYear;

	// LCE Term document or LCE Non-Support document
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[163].SelectedValue\"]")
	WebElement RBILCETermdocumentorLCENonSupportdocument;

	// LCE - No Current Benefit and not Relevant Year *
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[144].SelectedValue\"]")
	WebElement RBILCENoCurrentBenefitandnotRelevantYear;

	// Low Carbon Grant Status *
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[145].SelectedValue\"]")
	WebElement RBILowCarbonGrantStatus;

	// Acknowledge Low Carbon Exclusion Status *
	@FindBy(xpath = "//input[@id=\"Sections[28].Questions[146].SelectedValue\"]")
	WebElement RBIAcknowledgeLowCarbonExclusionStatus;

	// STOR Declarations//

	// STOR No Current contract and not the relevant year
	@FindBy(xpath = "//input[@id=\"Sections[29].Questions[164].SelectedValue\"]")
	WebElement RBISTORNoCurrentcontractandnottherelevantyear;

	// STOR Subject of Contract but to Withdraw
	@FindBy(xpath = "//input[@id=\"Sections[29].Questions[165].SelectedValue\"]")
	WebElement RBISTORSubjectofContractbuttoWithdraw;

	// Conduct - No Market Manipulation *
	@FindBy(xpath = "//input[@id=\"Sections[30].Questions[166].SelectedValue\"]")
	WebElement RBIConductNoMarketManipulation;

	// Conduct - Complied with all laws *
	@FindBy(xpath = "//input[@id=\"Sections[30].Questions[167].SelectedValue\"]")
	WebElement RBIConductCompliedwithalllaws;

	// Conduct - No offer to pay any officer *
	@FindBy(xpath = "//input[@id=\"Sections[30].Questions[168].SelectedValue\"]")
	WebElement RBIConductNooffertopayanyofficer;

	// Conduct - No breach of the Bribery Act 2010 *
	@FindBy(xpath = "//input[@id=\"Sections[30].Questions[169].SelectedValue\"]")
	WebElement RBIConductNobreachoftheBriberyAct2010;

	// Conduct - No Information disclosure *
	@FindBy(xpath = "//input[@id=\"Sections[30].Questions[170].SelectedValue\"]")
	WebElement RBIConductNoInformationdisclosure;

	// Declaration that Application is correct *
	@FindBy(xpath = "//input[@id=\"Sections[30].Questions[171].SelectedValue\"]")
	WebElement RBIDeclarationthatApplicationiscorrect;

	// MPAN Declaration*
	@FindBy(xpath = "//textarea[@id=\"Sections[30].Questions[172].SelectedValue\"]")
	WebElement RBIMPANDeclaration;

	// ////////////////////// NEW BUILD GENERATING CMU
	// /////////////////////////////////////////

	@FindBy(xpath = "//label[text()=\"Applicant Company\"]//following-sibling::p")
	WebElement NBIApplicantCompanytext;

	@FindBy(xpath = "//label[text()=\"Auction\"]//following-sibling::p")
	WebElement NBIAuctiontext;

	// Company and CMU Summary Page

	@FindBy(xpath = "//a[@id=\"ui-id-3\"]")
	WebElement NBICompanyandCMUSummaryPage;

	// Covering Letter
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[69265].SelectedValue\"]")
	WebElement NBICoveringLetter;

	// Application Status
	@FindBy(xpath = "//span[@id=\"select2-Sections[18].Questions[52].SelectedValue-container\"]")
	WebElement NBIApplicationstatus;

	// Application Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[53].SelectedValue\"]")
	WebElement NBIApplicationDeclaration;

	// Aggregator Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[54].SelectedValue\"]")
	WebElement NBIAggregatorDeclaration;

	// Legal Owner declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[55].SelectedValue\"]")
	WebElement NBILegalOwnerDeclaration;

	// Joint Owner Declaration
	@FindBy(xpath = "//input[@id=\"Sections[18].Questions[56].SelectedValue\"]")
	WebElement NBIJointOwnerDeclaration;

	// Primary Fuel Type *
	@FindBy(xpath = "//span[@id=\"select2-CompanyAndCMUSummary.PrimaryFuelType-g2-container\"]")
	WebElement NBIPrimaryFuelType;

	// Application Page

	@FindBy(xpath = "//a[text()=\"Application Page\"]")
	WebElement NBIApplication_Page;

	// Declaration of Solvency *
	@FindBy(xpath = "//input[@id=\"Sections[20].Questions[57].SelectedValue\"]")
	WebElement NBIDeclarationofSolvency;

	// LCE - Application made but not Determined *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[58].SelectedValue\"]")
	WebElement NBILCEApplicationmadebutnotDetermined;

	// LCE Withdrawal Document
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[129].SelectedValue\"]")
	WebElement NBILCEWithdrawalDocument;

	// LCE - Current Benefit but not Relevant Year
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[59].SelectedValue\"]")
	WebElement NBILCECurrentBenefitbutnotRelevantYear;

	// LCE Term document or LCE Non-Support document
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[130].SelectedValue\"]")
	WebElement NBILCETermdocumentorLCENonSupportdocument;

	// LCE - No Current Benefit and not Relevant Year *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[60].SelectedValue\"]")
	WebElement NBILCENoCurrentBenefitandnotRelevantYear;

	// Low Carbon Grant Status *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[61].SelectedValue\"]")
	WebElement NBILowCarbonGrantStatus;

	// Acknowledge Low Carbon Exclusion Status *
	@FindBy(xpath = "//input[@id=\"Sections[21].Questions[62].SelectedValue\"]")
	WebElement NBIAcknowledgeLowCarbonExclusionStatus;

	// STOR No Current contract and not the relevant year
	@FindBy(xpath = "//input[@id=\"Sections[22].Questions[76].SelectedValue\"]")
	WebElement NBISTORNoCurrentcontractandnottherelevantyear;

	// STOR Subject of Contract but to Withdraw
	@FindBy(xpath = "//input[@id=\"Sections[22].Questions[77].SelectedValue\"]")
	WebElement NBISTORSubjectofContractbuttoWithdraw;

	// Conduct - No Market Manipulation *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[78].SelectedValue\"]")
	WebElement NBIConductNoMarketManipulation;

	// Conduct - Complied with all laws *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[79].SelectedValue\"]")
	WebElement NBIConductCompliedwithalllaws;

	// Conduct - No offer to pay any officer *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[80].SelectedValue\"]")
	WebElement NBIConductNooffertopayanyofficer;

	// Conduct - No breach of the Bribery Act 2010 *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[81].SelectedValue\"]")
	WebElement NBIConductNobreachoftheBriberyAct2010;

	// Conduct - No Information disclosure *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[82].SelectedValue\"]")
	WebElement NBIConductNoInformationdisclosure;

	// Declaration that Application is correct *
	@FindBy(xpath = "//input[@id=\"Sections[23].Questions[83].SelectedValue\"]")
	WebElement NBIDeclarationthatApplicationiscorrect;

	// MPAN Declaration*
	@FindBy(xpath = "//textarea[@id=\"Sections[23].Questions[84].SelectedValue\"]")
	WebElement NBIMPANDeclaration;

	// Methods //1//

	// Existing Generating Application creation

	public boolean verifyApplicationcompany() {

		return EXGApplicantCompanytext.isDisplayed();
	}

	public boolean verifyApplicationcmu() {

		return EXGAuctiontext.isDisplayed();
	}

	// Existing Generating Application creation

	public void EXGApplicationsave(String cmuid,String AuctionName , String companyname) throws InterruptedException, IOException {

		Actions actions = new Actions(driver);
		actions.moveToElement(Add_new_Application_button);
		Thread.sleep(4000);
		actions.moveToElement(PreQual_application);
		actions.click().build().perform();

		Selectcompany.click();
		Searchfield.sendKeys(companyname);
		Highlightedcompany.click();

		Selectcmu.click();
		Searchfield.sendKeys(cmuid);
		Highlightedcmu.click();

		Thread.sleep(4000);
		SelectAuction.click();
		Searchfield.sendKeys(AuctionName);
		HighlightedAuction.click();

		Thread.sleep(2000);

		CreateApplication.click();

		EXGCompanyandCMUSummaryPage.click();

		EXGCoveringLetter.sendKeys(System.getProperty("user.dir") + "/test.txt");
		EXGApplicationDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		EXGAggregatorDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		EXGLegalOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		EXGJointOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		// EXGPrimaryFuelType.sendKeys(System.getProperty("user.dir") + "/test.txt");

		// navigate to Application page
		Thread.sleep(2000);

		EXGApplication_Page.click();
		// Historic Dates

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
		Thread.sleep(1000);

	}
	
	
	public void EXGSubmitclick(String cmuid) throws InterruptedException {


		Thread.sleep(5500);
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(3500);
		CMU_Filter_box.clear();
		Thread.sleep(1500);
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(3500);
		Aplication_edit.click();
		Thread.sleep(3000);
		Applicationsubmitbutton.click();
		Thread.sleep(1000);
		ApplicationSAVE_Submityesbutton.click();
		ApplicationSAVE_Submityesbutton.click();
		
		
	}

	// Methods //2//
	// Existing InterConnector Application creation

	public void EXIApplicationsave(String cmuid,String AuctionName , String companyname) throws InterruptedException, IOException {

		Actions actions = new Actions(driver);
		actions.moveToElement(Add_new_Application_button);
		Thread.sleep(4000);
		actions.moveToElement(PreQual_application);
		actions.click().build().perform();

		Selectcompany.click();
		Searchfield.sendKeys(companyname);
		Highlightedcompany.click();

		Selectcmu.click();
		Searchfield.sendKeys(cmuid);
		Highlightedcmu.click();

		Thread.sleep(4000);
		SelectAuction.click();
		Searchfield.sendKeys(AuctionName);
		HighlightedAuction.click();

		Thread.sleep(2000);

		CreateApplication.click();

		EXICompanyandCMUSummaryPage.click();

		EXICoveringLetter.sendKeys(System.getProperty("user.dir") + "/test.txt");
		EXIApplicationDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		EXIAggregatorDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		EXILegalOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		EXIJointOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		// EXIPrimaryFuelType.sendKeys(System.getProperty("user.dir") + "/test.txt");

		// navigate to Application page
		Thread.sleep(2000);

		EXIApplication_Page.click();
		// Historic Dates

		js.executeScript("arguments[0].value='03/04/2018';", EXIHistoricperiod1date);
		js.executeScript("arguments[0].value='30';", EXIHistoricperiod1deliverycapacity);
		js.executeScript("arguments[0].value='30';", EXIHistoricperiod1settlementperiod);
		js.executeScript("arguments[0].value='03/04/2018';", EXIHistoricPerformancePeriod2Date);
		js.executeScript("arguments[0].value='30';", EXIHistoricPerformancePeriod2DeliveredCapacity);
		js.executeScript("arguments[0].value='30';", EXIHistoricPerformancePeriod2SettlementPeriod);
		js.executeScript("arguments[0].value='03/04/2018';", EXIHistoricPerformancePeriod3Date);
		js.executeScript("arguments[0].value='30';", EXIHistoricPerformancePeriod3DeliveredCapacity);
		js.executeScript("arguments[0].value='30';", EXIHistoricPerformancePeriod3SettlementPeriod);
		js.executeScript("arguments[0].value='03/04/2018';", EXIStartofDateRangeforHistoricPerformanceData);
		js.executeScript("arguments[0].value='03/04/2018';", EXIEndofDateRangeforHistoricPerformanceData);
		EXIConfirmationofHistoricMeteredOutput.sendKeys(System.getProperty("user.dir") + "/test.txt");
		js.executeScript("window.scrollBy(0,1000)", "EXIDeclarationofSolvency");
		Thread.sleep(1500);
		EXIDeclarationofSolvency.click();
		js.executeScript("window.scrollBy(0,250)", "EXIAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(1500);
		EXILCEApplicationmadebutnotDetermined.click();
		EXILCEWithdrawalDocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Thread.sleep(2000);
		EXILCECurrentBenefitbutnotRelevantYear.click();
		EXILCETermdocumentorLCENonSupportdocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		js.executeScript("window.scrollBy(0,250)", "EXIAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(1500);
		EXILCENoCurrentBenefitandnotRelevantYear.click();
		EXILowCarbonGrantStatus.click();
		js.executeScript("window.scrollBy(0,250)", "EXIAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(1500);
		EXIAcknowledgeLowCarbonExclusionStatus.click();
		EXISTORNoCurrentcontractandnottherelevantyear.click();
		EXISTORSubjectofContractbuttoWithdraw.click();
		EXIConductNoMarketManipulation.click();
		js.executeScript("window.scrollBy(0,250)", "EXIConductNoInformationdisclosure");
		Thread.sleep(1500);
		EXIConductCompliedwithalllaws.click();
		EXIConductNooffertopayanyofficer.click();
		js.executeScript("window.scrollBy(0,250)", "EXIMPANDeclaration");
		Thread.sleep(1500);
		EXIConductNobreachoftheBriberyAct2010.click();
		EXIConductNoInformationdisclosure.click();
		EXIDeclarationthatApplicationiscorrect.click();
		js.executeScript("window.scrollBy(0,250)", "EXIConductNoInformationdisclosure");
		Thread.sleep(1500);
		EXIMPANDeclaration.sendKeys("Text1");
		js.executeScript("window.scrollBy(0,650)", "");

	}

		public void EXISubmitclick(String cmuid) throws InterruptedException {

		


			Thread.sleep(5500);
			CMU_Filter_box.sendKeys(cmuid);
			Thread.sleep(3500);
			CMU_Filter_box.clear();
			Thread.sleep(1500);
			CMU_Filter_box.sendKeys(cmuid);
			Thread.sleep(3500);
			Aplication_edit.click();
			Thread.sleep(3000);
			Applicationsubmitbutton.click();
			Thread.sleep(1000);
			ApplicationSAVE_Submityesbutton.click();
			ApplicationSAVE_Submityesbutton.click();
			
			
	}
	// Methods //3//
	// NEW BUILD GENERATING Application creation

	public void NBGApplicationsave(String cmuid,String AuctionName , String companyname) throws InterruptedException, IOException {

		Actions actions = new Actions(driver);
		actions.moveToElement(Add_new_Application_button);
		Thread.sleep(4000);
		actions.moveToElement(PreQual_application);
		actions.click().build().perform();

		Selectcompany.click();
		Searchfield.sendKeys(companyname);
		Highlightedcompany.click();

		Selectcmu.click();
		Searchfield.sendKeys(cmuid);
		Highlightedcmu.click();

		Thread.sleep(4000);
		SelectAuction.click();
		Searchfield.sendKeys(AuctionName);
		HighlightedAuction.click();

		Thread.sleep(2000);

		CreateApplication.click();

		NBGCompanyandCMUSummaryPage.click();

		NBGCoveringLetter.sendKeys(System.getProperty("user.dir") + "/test.txt");
		NBGApplicationDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		NBGAggregatorDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		NBGLegalOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		NBGJointOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		// NBGPrimaryFuelType.sendKeys(System.getProperty("user.dir") + "/test.txt");

		// navigate to Application page
		Thread.sleep(2000);

		NBGApplication_Page.click();
		// Historic Dates

		NBGDeclarationofSolvency.click();
		js.executeScript("window.scrollBy(0,250)", "NBGAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(1500);
		NBGLCEApplicationmadebutnotDetermined.click();
		NBGLCEWithdrawalDocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Thread.sleep(2000);
		NBGLCECurrentBenefitbutnotRelevantYear.click();
		NBGLCETermdocumentorLCENonSupportdocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		js.executeScript("window.scrollBy(0,250)", "NBGAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(1500);
		NBGLCENoCurrentBenefitandnotRelevantYear.click();
		NBGLowCarbonGrantStatus.click();
		js.executeScript("window.scrollBy(0,250)", "NBGAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(1500);
		NBGAcknowledgeLowCarbonExclusionStatus.click();
		NBGSTORNoCurrentcontractandnottherelevantyear.click();
		js.executeScript("window.scrollBy(0,250)", "NBGConductNoMarketManipulation");
		NBGSTORSubjectofContractbuttoWithdraw.click();
		NBGConductNoMarketManipulation.click();
		js.executeScript("window.scrollBy(0,250)", "NBGConductNoInformationdisclosure");
		Thread.sleep(1500);
		NBGConductCompliedwithalllaws.click();
		NBGConductNooffertopayanyofficer.click();
		js.executeScript("window.scrollBy(0,250)", "NBGMPANDeclaration");
		Thread.sleep(1500);
		NBGConductNobreachoftheBriberyAct2010.click();
		NBGConductNoInformationdisclosure.click();
		NBGDeclarationthatApplicationiscorrect.click();
		js.executeScript("window.scrollBy(0,250)", "NBGConductNoInformationdisclosure");
		Thread.sleep(1500);
		NBGMPANDeclaration.sendKeys("Text1");
		js.executeScript("window.scrollBy(0,650)", "");

	}

	public void NBGSubmitclick(String cmuid) throws InterruptedException {


		Thread.sleep(5500);
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(3500);
		CMU_Filter_box.clear();
		Thread.sleep(1500);
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(3500);
		Aplication_edit.click();
		Thread.sleep(3000);
		Applicationsubmitbutton.click();
		Thread.sleep(1000);
		ApplicationSAVE_Submityesbutton.click();
		ApplicationSAVE_Submityesbutton.click();
		
		
	}

	// Methods //4//
	// Refurb Generating Application creation

	public void RBGApplicationsave(String cmuid,String AuctionName , String companyname) throws InterruptedException, IOException {

		Actions actions = new Actions(driver);
		actions.moveToElement(Add_new_Application_button);
		Thread.sleep(4000);
		actions.moveToElement(PreQual_application);
		actions.click().build().perform();

		Selectcompany.click();
		Searchfield.sendKeys(companyname);
		Highlightedcompany.click();

		Selectcmu.click();
		Searchfield.sendKeys(cmuid);
		Highlightedcmu.click();

		Thread.sleep(4000);
		SelectAuction.click();
		Searchfield.sendKeys(AuctionName);
		HighlightedAuction.click();

		Thread.sleep(2000);

		CreateApplication.click();

		RBGCompanyandCMUSummaryPage.click();

		RBGCoveringLetter.sendKeys(System.getProperty("user.dir") + "/test.txt");
		RBGApplicationDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		RBGAggregatorDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		RBGLegalOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		RBGJointOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		// RBGPrimaryFuelType.sendKeys(System.getProperty("user.dir") + "/test.txt");

		RBGRefurbishingCMUStructuretab.click();
		RBGPreRefurbishmentOpt_Out_No.click();

		// navigate to Application page
		Thread.sleep(500);

		RBGApplicationPagePre_Refurbtab.click();
		// Historic Dates

		js.executeScript("arguments[0].value='03/04/2018';", RBGHistoricperiod1date);
		js.executeScript("arguments[0].value='30';", RBGHistoricperiod1deliverycapacity);
		js.executeScript("arguments[0].value='30';", RBGHistoricperiod1settlementperiod);
		js.executeScript("arguments[0].value='03/04/2018';", RBGHistoricPerformancePeriod2Date);
		js.executeScript("arguments[0].value='30';", RBGHistoricPerformancePeriod2DeliveredCapacity);
		js.executeScript("arguments[0].value='30';", RBGHistoricPerformancePeriod2SettlementPeriod);
		js.executeScript("arguments[0].value='03/04/2018';", RBGHistoricPerformancePeriod3Date);
		js.executeScript("arguments[0].value='30';", RBGHistoricPerformancePeriod3DeliveredCapacity);
		js.executeScript("arguments[0].value='30';", RBGHistoricPerformancePeriod3SettlementPeriod);
		js.executeScript("arguments[0].value='03/04/2018';", RBGStartofDateRangeforHistoricPerformanceData);
		js.executeScript("arguments[0].value='03/04/2018';", RBGEndofDateRangeforHistoricPerformanceData);
		RBGConfirmationofHistoricMeteredOutput.sendKeys(System.getProperty("user.dir") + "/test.txt");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				RBGConfirmationofLineLossFactors);
		RBGConfirmationofLineLossFactors.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Thread.sleep(500);

		RBGApplication_Page_post_refurb.click();

		// Next Tab

		RBGDeclarationofSolvency.click();
		js.executeScript("window.scrollBy(0,250)", "RBGAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(500);
		RBGLCEApplicationmadebutnotDetermined.click();
		RBGLCEWithdrawalDocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Thread.sleep(500);
		RBGLCECurrentBenefitbutnotRelevantYear.click();
		RBGLCETermdocumentorLCENonSupportdocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		js.executeScript("window.scrollBy(0,250)", "RBGAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(500);
		RBGLCENoCurrentBenefitandnotRelevantYear.click();
		js.executeScript("window.scrollBy(0,250)", "RBGAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(500);

		RBGLowCarbonGrantStatus.click();
		RBGAcknowledgeLowCarbonExclusionStatus.click();
		RBGSTORNoCurrentcontractandnottherelevantyear.click();

		js.executeScript("window.scrollBy(0,250)", "RBGConductNoInformationdisclosure");
		Thread.sleep(500);

		RBGSTORSubjectofContractbuttoWithdraw.click();
		RBGConductNoMarketManipulation.click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", RBGConductNooffertopayanyofficer);
		Thread.sleep(500);
		RBGConductCompliedwithalllaws.click();
		RBGConductNooffertopayanyofficer.click();

		RBGConductNobreachoftheBriberyAct2010.click();
		js.executeScript("window.scrollBy(0,250)", "RBGMPANDeclaration");
		Thread.sleep(500);
		RBGConductNoInformationdisclosure.click();
		RBGDeclarationthatApplicationiscorrect.click();
		js.executeScript("window.scrollBy(0,250)", "RBGConductNoInformationdisclosure");
		Thread.sleep(500);
		RBGMPANDeclaration.sendKeys("Text1");
		js.executeScript("window.scrollBy(0,650)", "");

	}
	
		public void RBGSubmitclick(String cmuid) throws InterruptedException {

		

			Thread.sleep(5500);
			CMU_Filter_box.sendKeys(cmuid);
			Thread.sleep(3500);
			CMU_Filter_box.clear();
			Thread.sleep(1500);
			CMU_Filter_box.sendKeys(cmuid);
			Thread.sleep(3500);
			Aplication_edit.click();
			Thread.sleep(3000);
			Applicationsubmitbutton.click();
			Thread.sleep(1000);
			ApplicationSAVE_Submityesbutton.click();
			ApplicationSAVE_Submityesbutton.click();
	}

	// Methods //5//
	// Proven Application creation

	public void PDSRApplicationsave(String cmuid,String AuctionName , String companyname) throws InterruptedException, IOException {

		Actions actions = new Actions(driver);
		actions.moveToElement(Add_new_Application_button);
		Thread.sleep(4000);
		actions.moveToElement(PreQual_application);
		actions.click().build().perform();

		Selectcompany.click();
		Searchfield.sendKeys(companyname);
		Highlightedcompany.click();

		Selectcmu.click();
		Searchfield.sendKeys(cmuid);
		Highlightedcmu.click();

		Thread.sleep(4000);
		SelectAuction.click();
		Searchfield.sendKeys(AuctionName);
		HighlightedAuction.click();

		Thread.sleep(2000);

		CreateApplication.click();

		PDSRCompanyandCMUSummaryPage.click();

		PDSRCoveringLetter.sendKeys(System.getProperty("user.dir") + "/test.txt");
		PDSRApplicationDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		PDSRAggregatorDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		PDSRLegalOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		PDSRJointOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		// PDSRPrimaryFuelType.sendKeys(System.getProperty("user.dir") + "/test.txt");

		PDSRApplicationPage_tab.click();
		// navigate to Application page
		Thread.sleep(500);

		PDSRDeclarationofSolvency.click();
		js.executeScript("window.scrollBy(0,250)", "PDSRAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(500);
		PDSRLCEApplicationmadebutnotDetermined.click();
		PDSRLCEWithdrawalDocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Thread.sleep(500);
		PDSRLCECurrentBenefitbutnotRelevantYear.click();
		PDSRLCETermdocumentorLCENonSupportdocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		js.executeScript("window.scrollBy(0,250)", "PDSRAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(500);
		PDSRLCENoCurrentBenefitandnotRelevantYear.click();
		js.executeScript("window.scrollBy(0,250)", "PDSRAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(500);

		PDSRLowCarbonGrantStatus.click();
		PDSRAcknowledgeLowCarbonExclusionStatus.click();
		PDSRSTORNoCurrentcontractandnottherelevantyear.click();

		js.executeScript("window.scrollBy(0,250)", "PDSRConductNoInformationdisclosure");
		Thread.sleep(500);

		PDSRSTORSubjectofContractbuttoWithdraw.click();
		PDSRConductNoMarketManipulation.click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", PDSRConductNooffertopayanyofficer);
		Thread.sleep(500);
		PDSRConductCompliedwithalllaws.click();
		PDSRConductNooffertopayanyofficer.click();

		PDSRConductNobreachoftheBriberyAct2010.click();
		js.executeScript("window.scrollBy(0,250)", "PDSRMPANDeclaration");
		Thread.sleep(500);
		PDSRConductNoInformationdisclosure.click();
		PDSRDeclarationthatApplicationiscorrect.click();
		js.executeScript("window.scrollBy(0,250)", "PDSRConductNoInformationdisclosure");
		Thread.sleep(500);
		PDSRMPANDeclaration.sendKeys("Text1");
		js.executeScript("window.scrollBy(0,650)", "");

	}

	
	public void PDSRSubmitclick(String cmuid) throws InterruptedException {

		


		Thread.sleep(5500);
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(3500);
		CMU_Filter_box.clear();
		Thread.sleep(1500);
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(3500);
		Aplication_edit.click();
		Thread.sleep(3000);
		Applicationsubmitbutton.click();
		Thread.sleep(1000);
		ApplicationSAVE_Submityesbutton.click();
		ApplicationSAVE_Submityesbutton.click();
		
	}
	// Methods //6// // UnProven Application creation

	public void UPDSRApplicationsave(String cmuid,String AuctionName , String companyname) throws InterruptedException, IOException {

		Actions actions = new Actions(driver);
		actions.moveToElement(Add_new_Application_button);
		Thread.sleep(4000);
		actions.moveToElement(PreQual_application);
		actions.click().build().perform();

		Selectcompany.click();
		Searchfield.sendKeys(companyname);
		Highlightedcompany.click();

		Selectcmu.click();
		Searchfield.sendKeys(cmuid);
		Highlightedcmu.click();

		Thread.sleep(4000);
		SelectAuction.click();
		Searchfield.sendKeys(AuctionName);
		HighlightedAuction.click();

		Thread.sleep(2000);

		CreateApplication.click();

		UPDSRCompanyandCMUSummaryPage.click();

		UPDSRCoveringLetter.sendKeys(System.getProperty("user.dir") + "/test.txt");
		UPDSRApplicationDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		UPDSRAggregatorDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		UPDSRLegalOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		UPDSRJointOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		// UPDSRPrimaryFuelType.sendKeys(System.getProperty("user.dir") + "/test.txt");

		UPDSRApplicationPage_tab.click();
		// navigate to Application page
		Thread.sleep(500);

		UPDSRDeclarationofSolvency.click();
		js.executeScript("window.scrollBy(0,250)", "UPDSRAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(500);
		UPDSRLCEApplicationmadebutnotDetermined.click();
		UPDSRLCEWithdrawalDocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Thread.sleep(500);
		UPDSRLCECurrentBenefitbutnotRelevantYear.click();
		UPDSRLCETermdocumentorLCENonSupportdocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		js.executeScript("window.scrollBy(0,250)", "UPDSRAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(500);
		UPDSRLCENoCurrentBenefitandnotRelevantYear.click();
		js.executeScript("window.scrollBy(0,250)", "UPDSRAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(500);

		UPDSRLowCarbonGrantStatus.click();
		UPDSRAcknowledgeLowCarbonExclusionStatus.click();
		UPDSRSTORNoCurrentcontractandnottherelevantyear.click();
		js.executeScript("window.scrollBy(0,250)", "UPDSRConductNoInformationdisclosure");
		Thread.sleep(500);

		UPDSRSTORSubjectofContractbuttoWithdraw.click();
		UPDSRConductNoMarketManipulation.click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", UPDSRConductNooffertopayanyofficer);
		Thread.sleep(500);
		UPDSRConductCompliedwithalllaws.click();
		UPDSRConductNooffertopayanyofficer.click();

		UPDSRConductNobreachoftheBriberyAct2010.click();
		js.executeScript("window.scrollBy(0,250)", "UPDSRMPANDeclaration");
		Thread.sleep(500);
		UPDSRConductNoInformationdisclosure.click();
		UPDSRDeclarationthatApplicationiscorrect.click();
		js.executeScript("window.scrollBy(0,250)", "UPDSRConductNoInformationdisclosure");
		Thread.sleep(500);
		UPDSRMPANDeclaration.sendKeys("Text1");
		js.executeScript("window.scrollBy(0,650)", "");

	}
	
	
	public void UPDSRSubmitclick(String cmuid) throws InterruptedException {

		


		Thread.sleep(5500);
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(3500);
		CMU_Filter_box.clear();
		Thread.sleep(1500);
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(3500);
		Aplication_edit.click();
		Thread.sleep(3000);
		Applicationsubmitbutton.click();
		Thread.sleep(1000);
		ApplicationSAVE_Submityesbutton.click();
		ApplicationSAVE_Submityesbutton.click();
		
	}

	// Methods //7//// Refurb Interconnector Application creation

	public void RBIApplicationsave(String cmuid,String AuctionName , String companyname) throws InterruptedException, IOException {

		Actions actions = new Actions(driver);
		actions.moveToElement(Add_new_Application_button);
		Thread.sleep(4000);
		actions.moveToElement(PreQual_application);
		actions.click().build().perform();

		Selectcompany.click();
		Searchfield.sendKeys(companyname);
		Highlightedcompany.click();

		Selectcmu.click();
		Searchfield.sendKeys(cmuid);
		Highlightedcmu.click();

		Thread.sleep(4000);
		SelectAuction.click();
		Searchfield.sendKeys(AuctionName);
		HighlightedAuction.click();

		Thread.sleep(2000);

		CreateApplication.click();

		RBICompanyandCMUSummaryPage.click();

		RBICoveringLetter.sendKeys(System.getProperty("user.dir") + "/test.txt");
		RBIApplicationDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		RBIAggregatorDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		RBILegalOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		RBIJointOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		// RBIPrimaryFuelType.sendKeys(System.getProperty("user.dir") + "/test.txt");

		RBIRefurbishingCMUStructuretab.click();
		RBIPreRefurbishmentOpt_Out_No.click();

		// navigate to Application page
		Thread.sleep(500);

		RBIApplicationPagePre_Refurbtab.click();
		// Historic Dates

		js.executeScript("arguments[0].value='03/04/2018';", RBIHistoricperiod1date);
		js.executeScript("arguments[0].value='30';", RBIHistoricperiod1deliverycapacity);
		js.executeScript("arguments[0].value='30';", RBIHistoricperiod1settlementperiod);
		js.executeScript("arguments[0].value='03/04/2018';", RBIHistoricPerformancePeriod2Date);
		js.executeScript("arguments[0].value='30';", RBIHistoricPerformancePeriod2DeliveredCapacity);
		js.executeScript("arguments[0].value='30';", RBIHistoricPerformancePeriod2SettlementPeriod);
		js.executeScript("arguments[0].value='03/04/2018';", RBIHistoricPerformancePeriod3Date);
		js.executeScript("arguments[0].value='30';", RBIHistoricPerformancePeriod3DeliveredCapacity);
		js.executeScript("arguments[0].value='30';", RBIHistoricPerformancePeriod3SettlementPeriod);
		js.executeScript("arguments[0].value='03/04/2018';", RBIStartofDateRangeforHistoricPerformanceData);
		js.executeScript("arguments[0].value='03/04/2018';", RBIEndofDateRangeforHistoricPerformanceData);
		RBIConfirmationofHistoricMeteredOutput.sendKeys(System.getProperty("user.dir") + "/test.txt");

		Thread.sleep(5000);

		RBIApplication_Page_post_refurb.click();

		// Next Tab

		RBIDeclarationofSolvency.click();
		js.executeScript("window.scrollBy(0,250)", "RBIAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(500);
		RBILCEApplicationmadebutnotDetermined.click();
		RBILCEWithdrawalDocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Thread.sleep(500);
		RBILCECurrentBenefitbutnotRelevantYear.click();
		RBILCETermdocumentorLCENonSupportdocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		js.executeScript("window.scrollBy(0,250)", "RBIAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(500);
		RBILCENoCurrentBenefitandnotRelevantYear.click();
		js.executeScript("window.scrollBy(0,250)", "RBIAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(500);

		RBILowCarbonGrantStatus.click();
		RBIAcknowledgeLowCarbonExclusionStatus.click();
		RBISTORNoCurrentcontractandnottherelevantyear.click();

		js.executeScript("window.scrollBy(0,250)", "RBIConductNoInformationdisclosure");
		Thread.sleep(500);

		RBISTORSubjectofContractbuttoWithdraw.click();
		RBIConductNoMarketManipulation.click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", RBIConductNooffertopayanyofficer);
		Thread.sleep(500);
		RBIConductCompliedwithalllaws.click();
		RBIConductNooffertopayanyofficer.click();

		RBIConductNobreachoftheBriberyAct2010.click();
		js.executeScript("window.scrollBy(0,250)", "RBIMPANDeclaration");
		Thread.sleep(500);
		RBIConductNoInformationdisclosure.click();
		RBIDeclarationthatApplicationiscorrect.click();
		js.executeScript("window.scrollBy(0,250)", "RBIConductNoInformationdisclosure");
		Thread.sleep(500);
		RBIMPANDeclaration.sendKeys("Text1");
		js.executeScript("window.scrollBy(0,650)", "");

	}
	
	
	public void RBISubmitclick(String cmuid) throws InterruptedException {



		Thread.sleep(5500);
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(3500);
		CMU_Filter_box.clear();
		Thread.sleep(1500);
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(3500);
		Aplication_edit.click();
		Thread.sleep(3000);
		Applicationsubmitbutton.click();
		Thread.sleep(1000);
		ApplicationSAVE_Submityesbutton.click();
		ApplicationSAVE_Submityesbutton.click();
		
		
	}

	// Methods //8//// New build InterConnection Application creation

	public void NBIApplicationsave(String cmuid,String AuctionName , String companyname) throws InterruptedException, IOException {

		Actions actions = new Actions(driver);
		actions.moveToElement(Add_new_Application_button);
		Thread.sleep(4000);
		actions.moveToElement(PreQual_application);
		actions.click().build().perform();

		Selectcompany.click();
		Searchfield.sendKeys(companyname);
		Highlightedcompany.click();

		Selectcmu.click();
		Searchfield.sendKeys(cmuid);
		Highlightedcmu.click();

		Thread.sleep(4000);
		SelectAuction.click();
		Searchfield.sendKeys(AuctionName);
		HighlightedAuction.click();
		
		Thread.sleep(2000);

		CreateApplication.click();

		NBICompanyandCMUSummaryPage.click();

		NBICoveringLetter.sendKeys(System.getProperty("user.dir") + "/test.txt");
		NBIApplicationDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		NBIAggregatorDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		NBILegalOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		NBIJointOwnerDeclaration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		// NBIPrimaryFuelType.sendKeys(System.getProperty("user.dir") + "/test.txt");

		// navigate to Application page
		Thread.sleep(2000);

		NBIApplication_Page.click();
		// Historic Dates

		NBIDeclarationofSolvency.click();
		js.executeScript("window.scrollBy(0,250)", "NBIAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(1500);
		NBILCEApplicationmadebutnotDetermined.click();
		NBILCEWithdrawalDocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Thread.sleep(2000);
		NBILCECurrentBenefitbutnotRelevantYear.click();
		NBILCETermdocumentorLCENonSupportdocument.sendKeys(System.getProperty("user.dir") + "/test.txt");
		js.executeScript("window.scrollBy(0,250)", "NBIAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(1500);
		NBILCENoCurrentBenefitandnotRelevantYear.click();
		NBILowCarbonGrantStatus.click();
		js.executeScript("window.scrollBy(0,250)", "NBIAcknowledgeLowCarbonExclusionStatus");
		Thread.sleep(1500);
		NBIAcknowledgeLowCarbonExclusionStatus.click();
		NBISTORNoCurrentcontractandnottherelevantyear.click();
		js.executeScript("window.scrollBy(0,250)", "NBIConductNoMarketManipulation");
		NBISTORSubjectofContractbuttoWithdraw.click();
		NBIConductNoMarketManipulation.click();
		js.executeScript("window.scrollBy(0,250)", "NBIConductNoInformationdisclosure");
		Thread.sleep(1500);
		NBIConductCompliedwithalllaws.click();
		NBIConductNooffertopayanyofficer.click();
		js.executeScript("window.scrollBy(0,250)", "NBIMPANDeclaration");
		Thread.sleep(1500);
		NBIConductNobreachoftheBriberyAct2010.click();
		NBIConductNoInformationdisclosure.click();
		NBIDeclarationthatApplicationiscorrect.click();
		js.executeScript("window.scrollBy(0,250)", "NBIConductNoInformationdisclosure");
		Thread.sleep(1500);
		NBIMPANDeclaration.sendKeys("Text1");
		js.executeScript("window.scrollBy(0,650)", "");

	}
	
	public void NBISubmitclick(String cmuid) throws InterruptedException {

		Thread.sleep(5500);
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(3500);
		CMU_Filter_box.clear();
		Thread.sleep(1500);
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(3500);
		Aplication_edit.click();
		Thread.sleep(3000);
		Applicationsubmitbutton.click();
		Thread.sleep(1000);
		ApplicationSAVE_Submityesbutton.click();
		ApplicationSAVE_Submityesbutton.click();
		
		
	}

	// Common Methods for application types.

	public void Saveclick() throws InterruptedException {

		Applicationsavebutton.click();
		Thread.sleep(1000);
		ApplicationSAVE_Submityesbutton.click();
		ApplicationSAVE_Submityesbutton.click();
	}

	public void Submitclick() throws InterruptedException {

		Applicationsubmitbutton.click();
		Thread.sleep(1000);
		ApplicationSAVE_Submityesbutton.click();
		ApplicationSAVE_Submityesbutton.click();
	}

	public void applicationcreation(String cmuid,String AuctionName , String companyname) throws InterruptedException {

		Actions actions = new Actions(driver);
		actions.moveToElement(Add_new_Application_button);
		Thread.sleep(2000);
		actions.moveToElement(PreQual_application);
		actions.click().build().perform();

		Selectcompany.click();
		Searchfield.sendKeys("companyname");
		Highlightedcompany.click();

		Selectcmu.click();
		Searchfield.sendKeys("cmuid");
		Highlightedcmu.click();
		Thread.sleep(2000);
		SelectAuction.click();
		Searchfield.sendKeys("AuctionName");

		HighlightedAuction.click();

		CreateApplication.click();

	}

}
