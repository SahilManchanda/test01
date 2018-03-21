package com.emr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.emr.qa.base.TestBase;

public class Auctionpage extends TestBase {
	
	EmrDbhomepage emrhomepage;
	
	
	//Auction text
	
	@FindBy(xpath="//nobr//span[contains(text(), \"Auction\")]")
	WebElement Auctiontext;
	
	
	// Auction page new item
	
	@FindBy(xpath="//span[contains(text(), \"new item\")]")
	WebElement newitem;
	
	// Auction page modified sort
	
	@FindBy(xpath="//a[@id='diidSort2Modified']")
	WebElement modifiedsort;
		

	
	
	
	//Auction Title
	
	@FindBy(id="Title_fa564e0f-0c70-4ab9-b863-0177e6ddd247_$TextField")
	WebElement AuctionTitle;
	
	//Opening Delivery Year
	
	@FindBy(id="OpeningDeliveryYear_6f793ef2-d728-4a5b-a26a-74d3d1812788_$IntegerField")
	WebElement Openingdeliveryyear;
	
	//AuctionType
	
	@FindBy(id="AuctionType_653c7f0a-f506-416b-94af-fd758ae6582d_$DropDownChoice")
	WebElement AuctionType;
	
	
	//AuctionPrice VariableType
	
	@FindBy(id="AuctionPriceVariableType_61b4ce73-8fed-414c-bed8-ac3846241b35_$DropDownChoice")
	WebElement AuctionPriceVariableType;
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////		
	
//Auction Dates
	
	
	//AuctionStartDate
	
	@FindBy(id="AuctionStartDate_c755ecca-2ae0-4029-a803-4f9d4c8a6059_$DateTimeFieldDate")
	WebElement AuctionStartDate;
	
	//AuctionEndDate
	
	@FindBy(id="AuctionEndDate_ec59e9f1-4981-4246-927b-352f09220f3f_$DateTimeFieldDate")
	WebElement AuctionEndDate;
	
	//Prequalification opening date 
	
	@FindBy(id="PrequalificationOnOpeningDate_c13e1366-b6a9-47a3-a4f9-dfef5d3c30e0_$DateTimeFieldDate")
	WebElement PrequalificationOnOpeningDate;
	
	//Prequalification closing date
	
	@FindBy(id="PrequalificationOnClosingDate_81f27264-3611-4e01-945f-72f37daa81f8_$DateTimeFieldDate")
	WebElement PrequalificationOnClosingDate;
	
	//Product Selection Open Date/Time
	
	@FindBy(id="ProductSelectioNOpenDateTime_5aff62bc-fbad-4bbc-9e75-e0f72b5abd2b_$DateTimeFieldDate")
	WebElement ProductSelectioNOpenDate;
	
	//Product Selection Close Date/Time
	
	@FindBy(id="ProductSelectionCloseDateTime_6d5db127-5b7b-486f-ab4c-3913cc576c2b_$DateTimeFieldDate")
	WebElement ProductSelectionCloseDate;
	
	//Prequalification on results – Date (PQRD) 
	
	@FindBy(id="PreqResultDatePQRD_a13a7088-8ba3-44e7-8498-688bc31445c1_$DateTimeFieldDate")
	WebElement PreqResultDatePQRD;
	
	//Raising Disputes for Pre-qual decisions - Date
	
	@FindBy(id="RaisDispPreqDecDate_6a0dcf47-5d2e-4991-8a70-d4ed552d61d8_$DateTimeFieldDate")
	WebElement RaisDispPreqDecDate;
	
	
	//Auction Parameters update - date
	
	
	
	@FindBy(id="AuctionParamUpdateDate_c3790b6d-0656-4d16-9626-b5898775cc39_$DateTimeFieldDate")
	WebElement AuctionParamUpdateDate;
	
	//Opt Out Fix - End Date
	
	@FindBy(id="OptOutFixEndDate_20f85cae-db4b-4fd9-bcf4-7af8f95f83cc_$DateTimeFieldDate")
	WebElement OptOutFixEndDate;
	
	//Price Maker Taker request start date
	
	@FindBy(id="PriceMakerTakerReqSD_a7964f59-f478-470a-9e7f-a5c05802b322_$DateTimeFieldDate")
	WebElement PriceMakerTakerReq;
		
	
	//Price Maker Taker Fix Date
	
	@FindBy(id="PriceMakerTakerFD_785ea9b9-3e61-4a2d-9021-93ac5903748b_$DateTimeFieldDate")
	WebElement PriceMakerTakerFD;
	
	
	//Price Maker Status confirmation date
	
	@FindBy(id="PriceMakerStatusConfDate_a1448671-eed3-4c3e-aa5e-13a997d20664_$DateTimeFieldDate")
	WebElement PriceMakerStatusConfDate;
	
	
	//Confirmation of DSR bidding capacity – Start Date
	
	@FindBy(id="ConfDSRBidCapSD_f877efea-7362-4817-ac0c-30f088ea21cb_$DateTimeFieldDate")
	WebElement ConfDSRBidCapSD;
		
	//Confirmation of DSR bidding capacity – End Date
	
	@FindBy(id="ConfDSRBidCapED_b51dc757-49c4-4d20-962a-1da0cd13be96_$DateTimeFieldDate")
	WebElement ConfDSRBidCapED;	
	
	//Confirm entry & Fix Agreement Length Start Date (New Builds and Refurbs only)
	
	@FindBy(id="ConfLengthSDNewBUR_e8e8b563-4912-439c-a724-e023006ed11c_$DateTimeFieldDate")
	WebElement ConfLengthSDNewBUR;	

	//Confirm entry & Fix Agreement Length End Date (New Builds and Refurbs only)
	
	@FindBy(id="ConfLengthEDNewBUR_0049c2dd-bc86-4d51-b46d-4f98814eb60c_$DateTimeFieldDate")
	WebElement ConfLengthEDNewBUR;	
	
	//Confirm entry & Fix Agreement Length Start Date (Pre-Refurbs only) 
	
	@FindBy(id="ConfLengthSDPR_c85a9463-1aa3-471f-bd01-b175e56c00dd_$DateTimeFieldDate")
	WebElement ConfLengthSDPR;	
		
	
	//Confirm entry & Fix Agreement Length End Date (Pre-Refurbs only)
	
	@FindBy(id="ConfLengthEDPR_4c9fa979-95f9-493c-84aa-b6740819e5de_$DateTimeFieldDate")
	WebElement ConfLengthEDPR;	
	
	
	//Conditionally Approved Application Results Date
	
	@FindBy(id="ConApprovedAppRD_c41ea80c-ca98-4911-a2d9-3d1ee3f86e47_$DateTimeFieldDate")
	WebElement ConApprovedAppRD;	
	
	//Planning Consent Result Date 
	
	@FindBy(id="PlanConsentRD_c24fe707-7fab-4aaa-bfe7-7bb22af06216_$DateTimeFieldDate")
	WebElement PlanConsentRD;
	
	//Last Date to Submit Credit Cover following PQRD 
	
	@FindBy(id="LastDSubmitCCPQRD_07712e5f-c505-4450-955c-b3ee7e9bdfa4_$DateTimeFieldDate")
	WebElement LastDSubmitCCPQRD;
	
	//Last Date to submit Planning Consent following PQRD 
	
	@FindBy(id="LastDSubmitPCFPQRD_1da36a30-ee69-47fb-b0dd-ad8d18580c60_$DateTimeFieldDate")
	WebElement LastDSubmitPCFPQRD;
	
	//Auction Results Day (ARD) 
	
	@FindBy(id="AuctionRDayARD_f5f85108-28cb-49d0-8eaa-385e95facaa3_$DateTimeFieldDate")
	WebElement AuctionRDayARD;
	
	//Capacity Agreement Notice (CAN) Release Day (CRD)
	
	@FindBy(id="CapAgrNoticeCANRCRD_69a8f1de-61cb-4407-833f-83c7036fabbd_$DateTimeFieldDate")
	WebElement CapAgrNoticeCANRCRD;

	//TerminationFee1
	
	@FindBy(id="TerminationFee1_798ccb03-b38e-498c-9872-041887be520e_$TextField")
	WebElement TerminationFee1;
		
	//TerminationFee2
		
	@FindBy(id="TerminationFee2_7ea2fd4c-7caf-4c46-97d8-77a369d8b91c_$TextField")
	WebElement TerminationFee2;
		
	//TerminationFee3
		
	@FindBy(id="TerminationFee3_115a90dc-5662-4e72-aae3-fe7613935c15_$TextField")
	WebElement TerminationFee3;
		
	//TerminationFee4
		
	@FindBy(id="TerminationFee4_02f0bcc5-31bb-45ea-b88f-564bb3aaff82_$TextField")
	WebElement TerminationFee4;
		
	//TerminationFee5
		
	@FindBy(id="TerminationFee5_df612756-c32c-4a58-9e6d-4dae392e3fc6_$TextField")
	WebElement TerminationFee5;
	
	
	//MonthlyPenaltyCap
		
	@FindBy(id="MonthlyPenaltyCap_a7b62b61-197e-4ee6-9d3c-5183b3e68aa1_$NumberField")
	WebElement MonthlyPenaltyCap;
	
	
	
	//AnnualPenaltyCap
		
	@FindBy(id="AnnualPenaltyCap_64921f24-23a9-4eac-a16c-88da57458c11_$NumberField")
	WebElement AnnualPenaltyCap;
	
	
	
	//Deferred Metering Assessment Due Date
		
	@FindBy(id="DefMeteringADD_06ed3811-db1f-46c3-a958-840eeaff76a4_$DateTimeFieldDate")
	WebElement DefMeteringADD;
	
	
	//DSR Proving Test date (prior to prequal)
		
	@FindBy(id="DSRProvingTDPP_e40cfaeb-e5cf-4fc5-9fdd-917602ec899c_$DateTimeFieldDate")
	WebElement DSRProvingTDPP;
	
	
	
	//DSR Proving Test date (after CAN)
		
	@FindBy(id="DSRProvingTDACAN_909d550d-dd38-4919-8d81-ac6ce5f66acb_$DateTimeFieldDate")
	WebElement DSRProvingTDACAN;
	
	//Financial Commitment milestone (FCM) date
	
	@FindBy(id="FinComMFCMDate_9fd47495-069f-48ac-89f2-48d57621d6b3_$DateTimeFieldDate")
	WebElement FinComMFCMDate;
	
	
	//Final six monthly progress reporting date
		
	@FindBy(id="FinalSixMP_970fc02e-f9d0-4031-bd3f-389ac06b6825_$DateTimeFieldDate")
	WebElement FinalSixMP;
	
	
	//Six monthly progress reporting date 1
		
	@FindBy(id="SixMPRD1_f2fccc71-8344-48ca-86e9-24bfbaccaec8_$DateTimeFieldDate")
	WebElement SixMPRD1;
		
		
	//Six monthly progress reporting date 2
		
	@FindBy(id="SixMPRD2_5774a3a9-dea1-4257-8e0f-70beb6dd1992_$DateTimeFieldDate")
	WebElement SixMPRD2;
	
	//Six monthly progress reporting date 3
	
	@FindBy(id="SixMPRD3_b5b24f12-9e28-4653-8f91-56c5bad45f85_$DateTimeFieldDate")
	WebElement SixMPRD3;
	
	
	//Substantial completion milestone (SCM) date
		
	@FindBy(id="SubsComplMSCMDate_2239198a-103b-452d-ae5c-98d3f0b538e1_$DateTimeFieldDate")
	WebElement SubsComplMSCMDate;
		
	
	//SProvision of deferred connection agreements date
	
	@FindBy(id="ProvDCAD_7be69786-c8c5-4b0c-a1ad-b99a680888dc_$DateTimeFieldDate")
	WebElement Provisionofdeferredconnectionagreementsdate;
		
	
	
	
	//Provision of deferred TEC date
		
	@FindBy(id="ProvDefTECD_3ea5d2d9-1e5f-4cbf-895d-9617cb391ef7_$DateTimeFieldDate")
	WebElement ProvDefTECD;
		
	
	//BasePeriod
	
	@FindBy(id="BasePeriod_4b68d35c-b630-48fd-a2b7-c1b9ee2f0b48_$TextField")
	WebElement BasePeriod;
	
	//Dropdownstatus
	
	@FindBy(id="Auction_List_StatusField_-1")
	WebElement dropdownstatus;
	
	
	

	
	void AuctionCreation()
	{
		
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
