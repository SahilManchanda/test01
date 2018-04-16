package com.emr.qa.pages;

import java.io.IOException;
import java.util.List;

import javax.xml.xpath.XPathExpression;

import org.apache.xmlbeans.impl.common.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.emr.qa.base.TestBase;
import com.emr.qa.util.Commonfunction;

public class Addcmupage extends TestBase {

	public Addcmupage() {

		PageFactory.initElements(driver, this);

	}
	
	
	Commonfunction cf= new Commonfunction();
	
	//Web element on Add CMU page//
	String cmutextverify;
	
	
	@FindBy(xpath = "//*[@id=\"cmus-table_wrapper\"]/div[2]/div[2]/div[3]/div/table/tfoot/tr/th[1]/input")
	WebElement filtercmu;
	
	

	// Existing Generating Executor//Web Element//

	// Java Script Executor

	JavascriptExecutor js = (JavascriptExecutor) driver;

	// Add new CMU
	@FindBy(xpath = "//div[@class=\"add-new-cmu-button\"]")
	WebElement Addnewcmu;
	int i;

	// Existing generating CMU

	// CMU identifier
	@FindBy(id = "Identifier")
	WebElement cmuid;

	// CMU Name
	@FindBy(id = "Name")
	WebElement cmuname;

	// Classification of CMU

	@FindBy(id = "select2-Classification-container")
	WebElement ClassificationofCMU;

	// Connection Arrangements Drop-Down
	@FindBy(xpath = "//span[@id=\"select2-Sections[1].Questions[3].SelectedValue-container\"]")
	WebElement ConnectionArrangements;

	// Transmission Entry Capacity Declaration check box
	@FindBy(xpath = "//input[@id=\"Sections[1].Questions[112].SelectedValue\"]")
	WebElement CheckboxTransmissionEntryCapacityDeclaration;

	// Attachment
	@FindBy(xpath = "//input[@id=\"Sections[1].Questions[116].SelectedValue\"]")
	WebElement AttachmentTransmissionEntryCapacityDeclaration;

	// TransmissionEntryCapacityDeferral
	@FindBy(xpath = "//input[@id=\"Sections[1].Questions[113].SelectedValue\"]")
	WebElement CheckboxTransmissionConnectionAgreementAttachment;

	// Generating History

	// yes radio box
	@FindBy(xpath = "//input[@name=\"Sections[1].Questions[6].SelectedValue\"and @value = \"Yes\"]")
	WebElement GeneratingHistoryyesradiobutton;

	// No radio box
	@FindBy(xpath = "//input[@name=\"Sections[1].Questions[6].SelectedValue\"and @value = \"No\"]")
	WebElement GeneratingHistoryNoradiobutton;

	// Declaration of Grid Code Compliance

	@FindBy(xpath = "//input[@name=\"Sections[1].Questions[122].SelectedValue\"and @value = \"Yes\"]")
	WebElement DeclaratioofGridCodeComplianceYesradiobutton;

	@FindBy(xpath = "//input[@name=\"Sections[1].Questions[122].SelectedValue\"and @value = \"No\"]")
	WebElement DeclaratioofGridCodeComplianceNOradiobutton;

	@FindBy(xpath = "//input[@name=\"Sections[1].Questions[122].SelectedValue\"and @value = \"Na\"]")
	WebElement DeclaratioofGridCodeComplianceNaradiobutton;

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// Switch To Metering deferred

	@FindBy(id = "ui-id-3")
	public WebElement Meteringdeferredpage;

	// Metering Assessment

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[15].SelectedValue\" and @value =\"Yes\"]")
	WebElement DeferCMUMeteringAssessmentForSettlementYesRadioBox;

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[15].SelectedValue\" and @value =\"No\"]")
	WebElement DeferCMUMeteringAssessmentForSettlementNoRadioBox;

	// Other Generation On Site *

	// Not Other Generation On Site *
	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[21].SelectedValue\" and @value =\"No\"]")
	WebElement OtherGenerationOnSiteNotRadionbox;

	// Other Generation On Site *
	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[21].SelectedValue\" and @value =\"Yes\"]")
	WebElement OtherGenerationOnSiteRadionbox;

	// Single Line Diagram
	@FindBy(xpath = "//input[@name=\"Sections[4].Questions[13].SelectedValue\"]")
	WebElement SingleLineDiagram_upload;

	// Other Metering Information
	@FindBy(xpath = "//input[@name=\"Sections[4].Questions[14].SelectedValue\"]")
	WebElement OtherMeteringInformation_upload;

	// Metering Test Certificate or metering configuration
	@FindBy(xpath = "//input[@name=\"Sections[4].Questions[69255].SelectedValue\"]")
	WebElement MeteringTestCertificate_or_MeteringConfiguration_upload;

	// Save button

	@FindBy(xpath = "//td//input[@type='submit' and @value='Save']")
	WebElement Savebutton;

	//////////////////////////////////////////////////////////////////////////////////////////////////

	// Existing Interconnector // Web Element //

	// Metering Assessment

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[16].SelectedValue\" and @value =\"Yes\"]")
	WebElement EXIDeferCMUMeteringAssessmentForSettlementYesRadioBox;

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[16].SelectedValue\" and @value =\"No\"]")
	WebElement EXIDeferCMUMeteringAssessmentForSettlementNoRadioBox;

	// Interconnector Associated Load *

	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[26].SelectedValue\" and @value =\"Yes\"]")
	WebElement EXIInterconnectorAssociatedLoadYesRadioBox;

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[26].SelectedValue\" and @value =\"No\"]")
	WebElement EXIInterconnectorAssociatedLoadNoRadioBox;

	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	// New Build Generating // Web Element //

	@FindBy(xpath = "//a[@id=\"ui-id-3\"]")
	WebElement ConstructionPlantab;

	// Construction Plan Summary Information*

	@FindBy(xpath = "//textarea[@name=\"Sections[3].Questions[282].SelectedValue\"]")
	WebElement ConstructionPlanSummaryInformation;

	// Extended Years Criteria Check Box

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69258].SelectedValue\"]")
	WebElement newApparatus_1;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69259].SelectedValue\"]")
	WebElement bothnewandrebuiltApparatus_2;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69260].SelectedValue\"]")
	WebElement rebuiltandpreviously_3;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69261].SelectedValue\"]")
	WebElement B_EachGeneratingUnit_4;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69262].SelectedValue\"]")
	WebElement C_wheretheCMUisacombustion_5;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69263].SelectedValue\"]")
	WebElement Ci_wheretheCMUisacombustion_6;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69264].SelectedValue\"]")
	WebElement Cii_wheretheCMUisacombustion_7;

	// Construction Milestones

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4034].SelectedValue\"]")
	WebElement SigningofEPCequivalentMajorContractEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4035].SelectedValue\"]")
	WebElement SigningofEPCequivalentMajorContractLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[37].SelectedValue\"]")
	WebElement CommencementofConstructionWorksEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[38].SelectedValue\"]")
	WebElement CommencementofConstructionWorksLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4036].SelectedValue\"]")
	WebElement MainFoundationsCompleteEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4037].SelectedValue\"]")
	WebElement MainFoundationsCompleteLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4038].SelectedValue\"]")
	WebElement GasSteamTurbineDeliveryEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4039].SelectedValue\"]")
	WebElement GasSteamTurbineDeliveryLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[39].SelectedValue\"]")
	WebElement AchievementoftheBackFeedMilestoneEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[40].SelectedValue\"]")
	WebElement AchievementoftheBackFeedMilestoneLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4040].SelectedValue\"]")
	WebElement FirstFiringEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4041].SelectedValue\"]")
	WebElement FirstFiringLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[41].SelectedValue\"]")
	WebElement AchievementoftheSubstantialCompletionMilestoneEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[42].SelectedValue\"]")
	WebElement AchievementoftheSubstantialCompletionMilestoneLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[43].SelectedValue\"]")
	WebElement DetailsoftheTotalProjectSpend;

	@FindBy(xpath = "//span[@id=\"select2-Sections[3].Questions[283].SelectedValue-container\"]")
	WebElement QualifyingkWCapitalExpenditure;

	@FindBy(xpath = "//li[@class=\"select2-results__option\" and contains(text(), \"A\")]")
	WebElement QualifyingkWCapitalExpenditureA;

	@FindBy(xpath = "//li[@class=\"select2-results__option\" and contains(text(), \"B\")]")
	WebElement QualifyingkWCapitalExpenditureB;

	@FindBy(xpath = "//li[@class=\"select2-results__option\" and contains(text(), \"C\")]")
	WebElement QualifyingkWCapitalExpenditureC;

	@FindBy(xpath = "//a[@id=\"ui-id-4\"]")
	WebElement newbuildSwitchmetering;

	// Construction Plan Declaration *

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[45].SelectedValue\"]")
	WebElement ConstructionPlanDeclaration;

	@FindBy(xpath = "//a[@id=\"ui-id-4\"]")
	WebElement meteringtab;

	
	// Metering Assessment

		// Defer CMU Metering Assessment For Settlement
		@FindBy(xpath = "//input[@name=\"Sections[8].Questions[15].SelectedValue\" and @value =\"Yes\"]")
		WebElement NBGDeferCMUMeteringAssessmentForSettlementYesRadioBox;

		// Defer CMU Metering Assessment For Settlement
		@FindBy(xpath = "//input[@name=\"Sections[8].Questions[15].SelectedValue\" and @value =\"No\"]")
		WebElement NBGDeferCMUMeteringAssessmentForSettlementNoRadioBox;

		// Other generation Onsite*

		
		@FindBy(xpath = "//input[@name=\"Sections[8].Questions[21].SelectedValue\" and @value =\"No\"]")
		WebElement NBG_OthergenerationNotRadionbox;

		
		@FindBy(xpath = "//input[@name=\"Sections[8].Questions[21].SelectedValue\" and @value =\"Yes\"]")
		WebElement NBG_OthergenerationYesRadionbox;

		// Single Line Diagram
		@FindBy(xpath = "//input[@name=\"Sections[4].Questions[13].SelectedValue\"]")
		WebElement NBGSingleLineDiagram_upload;

		// Other Metering Information
		@FindBy(xpath = "//input[@name=\"Sections[4].Questions[14].SelectedValue\"]")
		WebElement NBGOtherMeteringInformation_upload;

		// Metering Test Certificate or metering configuration
		@FindBy(xpath = "//input[@name=\"Sections[4].Questions[69255].SelectedValue\"]")
		WebElement NBGMeteringTestCertificate_or_MeteringConfiguration_upload;

		// Save button

		@FindBy(xpath = "//td//input[@type='submit' and @value='Save']")
		WebElement NBGSavebutton;
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////

	// Construction Plan Summary Information* Refurb Generating

	@FindBy(xpath = "//textarea[@name=\"Sections[3].Questions[282].SelectedValue\"]")
	WebElement refurbConstructionPlanSummaryInformation;

	// Extended Years Criteria Check Box

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69258].SelectedValue\"]")
	WebElement refurbnewApparatus_1;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69259].SelectedValue\"]")
	WebElement refurbbothnewandrebuiltApparatus_2;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69260].SelectedValue\"]")
	WebElement refurbrebuiltandpreviously_3;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69261].SelectedValue\"]")
	WebElement refurbB_EachGeneratingUnit_4;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69262].SelectedValue\"]")
	WebElement refurbC_wheretheCMUisacombustion_5;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69263].SelectedValue\"]")
	WebElement refurbCi_wheretheCMUisacombustion_6;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69264].SelectedValue\"]")
	WebElement refurbCii_wheretheCMUisacombustion_7;

	// Construction Milestones

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4034].SelectedValue\"]")
	WebElement refurbSigningofEPCequivalentMajorContractEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4035].SelectedValue\"]")
	WebElement refurbSigningofEPCequivalentMajorContractLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[37].SelectedValue\"]")
	WebElement refurbCommencementofConstructionWorksEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[38].SelectedValue\"]")
	WebElement refurbCommencementofConstructionWorksLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4036].SelectedValue\"]")
	WebElement refurbMainFoundationsCompleteEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4037].SelectedValue\"]")
	WebElement refurbMainFoundationsCompleteLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4038].SelectedValue\"]")
	WebElement refurbGasSteamTurbineDeliveryEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4039].SelectedValue\"]")
	WebElement refurbGasSteamTurbineDeliveryLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4040].SelectedValue\"]")
	WebElement refurbFirstFiringEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4041].SelectedValue\"]")
	WebElement refurbFirstFiringLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[41].SelectedValue\"]")
	WebElement refurbAchievementoftheSubstantialCompletionMilestoneEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[42].SelectedValue\"]")
	WebElement refurbAchievementoftheSubstantialCompletionMilestoneLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[43].SelectedValue\"]")
	WebElement refurbDetailsoftheTotalProjectSpend;

	@FindBy(xpath = "//span[@id=\"select2-Sections[3].Questions[283].SelectedValue-container\"]")
	WebElement refurbQualifyingkWCapitalExpenditure;

	@FindBy(xpath = "//li[@class=\"select2-results__option\" and contains(text(), \"A\")]")
	WebElement refurbQualifyingkWCapitalExpenditureA;

	@FindBy(xpath = "//li[@class=\"select2-results__option\" and contains(text(), \"B\")]")
	WebElement refurbQualifyingkWCapitalExpenditureB;

	@FindBy(xpath = "//li[@class=\"select2-results__option\" and contains(text(), \"C\")]")
	WebElement refurbQualifyingkWCapitalExpenditureC;

	@FindBy(xpath = "//a[@id=\"ui-id-4\"]")
	WebElement refurbnewbuildSwitchmetering;

	// Construction Plan Declaration *

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[45].SelectedValue\"]")
	WebElement refurbConstructionPlanDeclaration;

	@FindBy(xpath = "//a[@id=\"ui-id-4\"]")
	WebElement refurbmeteringtab;

	// Metering Assessment (pre -Refurb)

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[39].Questions[214].SelectedValue\" and @value =\"Yes\"]")
	WebElement PrerefurbDeferCMUMeteringAssessmentForSettlementYesRadioBox;

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[39].Questions[214].SelectedValue\" and @value =\"No\"]")
	WebElement PrerefurbDeferCMUMeteringAssessmentForSettlementNoRadioBox;

	// Other Generation On Site *

	@FindBy(xpath = "//input[@name=\"Sections[39].Questions[226].SelectedValue\" and @value =\"Yes\"]")
	WebElement PrerefurbOtherGenerationOnSiteYesRadioBox;

	@FindBy(xpath = "//input[@name=\"Sections[39].Questions[226].SelectedValue\" and @value =\"No\"]")
	WebElement PrerefurbOtherGenerationOnSiteNoRadioBox;

	// Single Line Diagram
	@FindBy(xpath = "//input[@name=\"Sections[36].Questions[210].SelectedValue\"]")
	WebElement Prerefurb_single_line_diagram;

	// Other Metering Information
	@FindBy(xpath = "//input[@name=\"Sections[36].Questions[212].SelectedValue\"]")
	WebElement Prerefurb_other_metering_information;

	// Metering Test Certificate or metering configuration

	@FindBy(xpath = "//input[@name=\"Sections[36].Questions[69256].SelectedValue\"]")
	WebElement prerefurbMeteringTestCertificateormeteringconfiguration;

	// Metering Assessment (Post - Refurb)

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[40].Questions[215].SelectedValue\" and @value =\"Yes\"]")
	WebElement PostrefurbDeferCMUMeteringAssessmentForSettlementYesRadioBox;

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[40].Questions[215].SelectedValue\" and @value =\"No\"]")
	WebElement PostrefurbDeferCMUMeteringAssessmentForSettlementNoRadioBox;

	// Other Generation On Site *

	@FindBy(xpath = "//input[@name=\"Sections[40].Questions[227].SelectedValue\" and @value =\"Yes\"]")
	WebElement PostrefurbOtherGenerationOnSiteYesRadioBox;

	@FindBy(xpath = "//input[@name=\"Sections[40].Questions[227].SelectedValue\" and @value =\"No\"]")
	WebElement PostrefurbOtherGenerationOnSiteNoRadioBox;

	// Single Line Diagram
	@FindBy(xpath = "//input[@name=\"Sections[37].Questions[211].SelectedValue\"]")
	WebElement Postrefurb_single_line_diagram;

	// Other Metering Information
	@FindBy(xpath = "//input[@name=\"Sections[37].Questions[213].SelectedValue\"]")
	WebElement Postrefurb_other_metering_information;

	// Metering Test Certificate or metering configuration

	@FindBy(xpath = "//input[@name=\"Sections[37].Questions[69257].SelectedValue\"]")
	WebElement postrefurbMeteringTestCertificateormeteringconfiguration;

	// Post refurb Tab Switch

	@FindBy(xpath = "//a[@id=\"ui-id-5\"]")
	WebElement postrefurbmeteringtab;

	//////////////////////////////////////////////////////////////////////////////////////////////////////

	// Web elements//Proven//DSR//

	// Business Model

	@FindBy(xpath = "//input[@name=\"Sections[34].Questions[207].SelectedValue\"]")
	WebElement DSRBusinessModelTemplate;

	// DSR Business Model Declaration*

	@FindBy(xpath = "//input[@name=\"Sections[34].Questions[35].SelectedValue\" and @type =\"checkbox\"]")
	WebElement DSRBusinessModelDeclaration;

	// Defer CMU Metering Assessment For Settlement

	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[15].SelectedValue\" and @value =\"Yes\"]")
	WebElement provenDeferCMUMeteringAssessmentForSettlementYesRadioBox;

	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[15].SelectedValue\" and @value =\"No\"]")
	WebElement provenDeferCMUMeteringAssessmentForSettlementNoRadioBox;

	// Other Generation On Site

	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[21].SelectedValue\" and @value =\"Yes\"]")
	WebElement provenOtherGenerationOnSiteYesRadioBox;

	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[21].SelectedValue\" and @value =\"No\"]")
	WebElement provenOtherGenerationOnSiteNoRadioBox;

	// Single Line Diagram
	@FindBy(xpath = "//input[@name=\"Sections[4].Questions[13].SelectedValue\"]")
	WebElement Proven_single_line_diagram;

	// Other Metering Information
	@FindBy(xpath = "//input[@name=\"Sections[4].Questions[14].SelectedValue\"]")
	WebElement Proven_other_metering_information;

	//////////////////////////////////////////////////////////////////////////////////////////////////////

	// Web elements//UnProven//DSR//

	// Business Model

	@FindBy(xpath = "//input[@name=\"Sections[35].Questions[208].SelectedValue\"]")
	WebElement UnprovenDSRBusinessModelTemplate;

	// DSR Business Model Declaration*

	@FindBy(xpath = "//input[@name=\"Sections[35].Questions[209].SelectedValue\" and @type =\"checkbox\"]")
	WebElement UnprovenDSRBusinessModelDeclaration;

	// Defer CMU Metering Assessment For Settlement

	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[15].SelectedValue\" and @value =\"Yes\"]")
	WebElement UnprovenDeferCMUMeteringAssessmentForSettlementYesRadioBox;

	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[15].SelectedValue\" and @value =\"No\"]")
	WebElement UnprovenDeferCMUMeteringAssessmentForSettlementNoRadioBox;

	// Other Generation On Site

	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[21].SelectedValue\" and @value =\"Yes\"]")
	WebElement UnprovenOtherGenerationOnSiteYesRadioBox;

	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[21].SelectedValue\" and @value =\"No\"]")
	WebElement UnprovenOtherGenerationOnSiteNoRadioBox;

	// Single Line Diagram
	@FindBy(xpath = "//input[@name=\"Sections[4].Questions[13].SelectedValue\"]")
	WebElement UnProven_single_line_diagram;

	// Other Metering Information
	@FindBy(xpath = "//input[@name=\"Sections[4].Questions[14].SelectedValue\"]")
	WebElement UnProven_other_metering_information;

	//////////////////////////////////// ////////////////////////////////
	//////////////////////////////////// ////////////////////////////
	//////////////////////////////////// ////////////////

	// Construction Plan Summary Information* Refurb Interconnector//

	@FindBy(xpath = "//textarea[@name=\"Sections[3].Questions[36].SelectedValue\"]")
	WebElement refurbintConstructionPlanSummaryInformation;

	// Extended Years Criteria Check Box

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69258].SelectedValue\"]")
	WebElement refurbintnewApparatus_1;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69259].SelectedValue\"]")
	WebElement refurbintbothnewandrebuiltApparatus_2;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69260].SelectedValue\"]")
	WebElement refurbintrebuiltandpreviously_3;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69261].SelectedValue\"]")
	WebElement refurbint_B_EachGeneratingUnit_4;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69262].SelectedValue\"]")
	WebElement refurbint_C_wheretheCMUisacombustion_5;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69263].SelectedValue\"]")
	WebElement refurbint_Ci_wheretheCMUisacombustion_6;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69264].SelectedValue\"]")
	WebElement refurbint_Cii_wheretheCMUisacombustion_7;

	// Construction Milestones

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4034].SelectedValue\"]")
	WebElement refurbintSigningofEPCequivalentMajorContractEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4035].SelectedValue\"]")
	WebElement refurbintSigningofEPCequivalentMajorContractLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[37].SelectedValue\"]")
	WebElement refurbintCommencementofConstructionWorksEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[38].SelectedValue\"]")
	WebElement refurbintCommencementofConstructionWorksLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4036].SelectedValue\"]")
	WebElement refurbint_MainFoundationsCompleteEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4037].SelectedValue\"]")
	WebElement refurbint_MainFoundationsCompleteLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4038].SelectedValue\"]")
	WebElement refurbint_GasSteamTurbineDeliveryEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4039].SelectedValue\"]")
	WebElement refurbint_GasSteamTurbineDeliveryLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4040].SelectedValue\"]")
	WebElement refurbint_FirstFiringEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4041].SelectedValue\"]")
	WebElement refurbint_FirstFiringLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[41].SelectedValue\"]")
	WebElement refurbint_AchievementoftheSubstantialCompletionMilestoneEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[42].SelectedValue\"]")
	WebElement refurbint_AchievementoftheSubstantialCompletionMilestoneLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[43].SelectedValue\"]")
	WebElement refurbint_DetailsoftheTotalProjectSpend;

	@FindBy(xpath = "//a[@id=\"ui-id-4\"]")
	WebElement refurbint_newbuildSwitchmetering;

	// Construction Plan Declaration *

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[45].SelectedValue\"]")
	WebElement refurbint_ConstructionPlanDeclaration;

	@FindBy(xpath = "//a[@id=\"ui-id-4\"]")
	WebElement refurbint_meteringtab;

	// Metering Assessment (pre -Refurb)

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[39].Questions[216].SelectedValue\" and @value =\"Yes\"]")
	WebElement Prerefurbint_DeferCMUMeteringAssessmentForSettlementYesRadioBox;

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[39].Questions[216].SelectedValue\" and @value =\"No\"]")
	WebElement Prerefurbint_DeferCMUMeteringAssessmentForSettlementNoRadioBox;

	// Other Generation On Site *
	@FindBy(xpath = "//input[@name=\"Sections[39].Questions[236].SelectedValue\" and @value =\"Yes\"]")
	WebElement Prerefurbint_OtherGenerationOnSiteYesRadioBox;

	@FindBy(xpath = "//input[@name=\"Sections[39].Questions[236].SelectedValue\" and @value =\"No\"]")
	WebElement Prerefurbint_OtherGenerationOnSiteNoRadioBox;

	// Single Line Diagram
	@FindBy(xpath = "//input[@name=\"Sections[36].Questions[210].SelectedValue\"]")
	WebElement Prerefurbint_single_line_diagram;

	// Other Metering Information
	@FindBy(xpath = "//input[@name=\"Sections[36].Questions[212].SelectedValue\"]")
	WebElement Prerefurbint__other_metering_information;

	// Metering Test Certificate or metering configuration

	@FindBy(xpath = "//input[@name=\"Sections[36].Questions[69256].SelectedValue\"]")
	WebElement prerefurbint_MeteringTestCertificateormeteringconfiguration;

	// Metering Assessment (Post - Refurb)

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[40].Questions[217].SelectedValue\" and @value =\"Yes\"]")
	WebElement Postrefurbint_DeferCMUMeteringAssessmentForSettlementYesRadioBox;

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[40].Questions[217].SelectedValue\" and @value =\"No\"]")
	WebElement Postrefurbint_DeferCMUMeteringAssessmentForSettlementNoRadioBox;

	// Other Generation On Site *
	@FindBy(xpath = "//input[@name=\"Sections[40].Questions[237].SelectedValue\" and @value =\"Yes\"]")
	WebElement Postrefurbint_OtherGenerationOnSiteYesRadioBox;

	@FindBy(xpath = "//input[@name=\"Sections[40].Questions[237].SelectedValue\" and @value =\"No\"]")
	WebElement Postrefurbint_OtherGenerationOnSiteNoRadioBox;

	// Single Line Diagram
	@FindBy(xpath = "//input[@name=\"Sections[37].Questions[211].SelectedValue\"]")
	WebElement Postrefurbint_single_line_diagram;

	// Other Metering Information
	@FindBy(xpath = "//input[@name=\"Sections[37].Questions[213].SelectedValue\"]")
	WebElement Postrefurbint_other_metering_information;

	// Metering Test Certificate or metering configuration

	@FindBy(xpath = "//input[@name=\"Sections[37].Questions[69257].SelectedValue\"]")
	WebElement postrefurbint_MeteringTestCertificateormeteringconfiguration;

	// Post refurb Tab Switch

	@FindBy(xpath = "//a[@id=\"ui-id-5\"]")
	WebElement postrefurbint_meteringtab;

	// New Build Interconector Generating // Web Element //

	@FindBy(xpath = "//a[@id=\"ui-id-3\"]")
	WebElement nbiConstructionPlantab;

	// Construction Plan Summary Information*

	@FindBy(xpath = "//textarea[@name=\"Sections[3].Questions[36].SelectedValue\"]")
	WebElement NBIConstructionPlanSummaryInformation;

	// Extended Years Criteria Check Box

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69258].SelectedValue\"]")
	WebElement NBInewApparatus_1;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69259].SelectedValue\"]")
	WebElement NBIbothnewandrebuiltApparatus_2;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69260].SelectedValue\"]")
	WebElement NBIrebuiltandpreviously_3;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69261].SelectedValue\"]")
	WebElement NBIB_EachGeneratingUnit_4;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69262].SelectedValue\"]")
	WebElement NBIC_wheretheCMUisacombustion_5;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69263].SelectedValue\"]")
	WebElement NBICi_wheretheCMUisacombustion_6;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[69264].SelectedValue\"]")
	WebElement NBICii_wheretheCMUisacombustion_7;

	// Construction Milestones

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4034].SelectedValue\"]")
	WebElement NBISigningofEPCequivalentMajorContractEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4035].SelectedValue\"]")
	WebElement NBISigningofEPCequivalentMajorContractLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[37].SelectedValue\"]")
	WebElement NBICommencementofConstructionWorksEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[38].SelectedValue\"]")
	WebElement NBICommencementofConstructionWorksLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4036].SelectedValue\"]")
	WebElement NBIMainFoundationsCompleteEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4037].SelectedValue\"]")
	WebElement NBIMainFoundationsCompleteLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4038].SelectedValue\"]")
	WebElement NBIGasSteamTurbineDeliveryEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4039].SelectedValue\"]")
	WebElement NBIGasSteamTurbineDeliveryLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[39].SelectedValue\"]")
	WebElement NBIAchievementoftheBackFeedMilestoneEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[40].SelectedValue\"]")
	WebElement NBIAchievementoftheBackFeedMilestoneLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4040].SelectedValue\"]")
	WebElement NBIFirstFiringEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[4041].SelectedValue\"]")
	WebElement NBIFirstFiringLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[41].SelectedValue\"]")
	WebElement NBIAchievementoftheSubstantialCompletionMilestoneEarliestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[42].SelectedValue\"]")
	WebElement NBIAchievementoftheSubstantialCompletionMilestoneLatestDate;

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[43].SelectedValue\"]")
	WebElement NBIDetailsoftheTotalProjectSpend;

	@FindBy(xpath = "//a[@id=\"ui-id-4\"]")
	WebElement NBInewbuildSwitchmetering;

	// Construction Plan Declaration *

	@FindBy(xpath = "//input[@name=\"Sections[3].Questions[45].SelectedValue\"]")
	WebElement NBIConstructionPlanDeclaration;

	@FindBy(xpath = "//a[@id=\"ui-id-4\"]")
	WebElement NBImeteringtab;

	// New build Interconnector// Web Elements metering deffered.

	@FindBy(id = "ui-id-3")
	public WebElement NBIMeteringdeferredpage;

	// Metering Assessment

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[16].SelectedValue\" and @value =\"Yes\"]")
	WebElement NBIDeferCMUMeteringAssessmentForSettlementYesRadioBox;

	// Defer CMU Metering Assessment For Settlement
	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[16].SelectedValue\" and @value =\"No\"]")
	WebElement NBIDeferCMUMeteringAssessmentForSettlementNoRadioBox;

	// Other Generation On Site *

	// Interconnector Assosciate Load *
	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[26].SelectedValue\" and @value =\"No\"]")
	WebElement NBIInterconnectorAssociatedLoadNotRadionbox;

	// Other Generation On Site *
	@FindBy(xpath = "//input[@name=\"Sections[8].Questions[26].SelectedValue\" and @value =\"Yes\"]")
	WebElement NBIInterconnectorAssociatedLoadYesRadionbox;

	// Single Line Diagram
	@FindBy(xpath = "//input[@name=\"Sections[4].Questions[13].SelectedValue\"]")
	WebElement NBISingleLineDiagram_upload;

	// Other Metering Information
	@FindBy(xpath = "//input[@name=\"Sections[4].Questions[14].SelectedValue\"]")
	WebElement NBIOtherMeteringInformation_upload;

	// Metering Test Certificate or metering configuration
	@FindBy(xpath = "//input[@name=\"Sections[4].Questions[69255].SelectedValue\"]")
	WebElement NBIMeteringTestCertificate_or_MeteringConfiguration_upload;

	// Save button

	@FindBy(xpath = "//td//input[@type='submit' and @value='Save']")
	WebElement NBISavebutton;

	//////////////////////////////////////////////////////////////////////////////////////////////////

	// Existing Generating CMU // Methods //1//

	public void EGCMUcreation() throws IOException {

		System.out.println("A1");
		cmuid.sendKeys(cf.accessfromfile(2, 1, 4));
		System.out.println("A2");
		cmuname.sendKeys(cf.accessfromfile(2, 1, 5));
		Meteringdeferredpage.click();
	}

	public void Meteringnotdeferred() throws InterruptedException {

		// selected radio button No
		System.out.println("A1");
		DeferCMUMeteringAssessmentForSettlementNoRadioBox.click();
		js.executeScript("javascript:window.scrollBy(0,450)");
		Thread.sleep(2000);
		OtherGenerationOnSiteNotRadionbox.click();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		SingleLineDiagram_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		OtherMeteringInformation_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		MeteringTestCertificate_or_MeteringConfiguration_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		System.out.println("A2");
		
		Thread.sleep(2000L);
		System.out.println("A3");
		Savebutton.click();
		save();
		System.out.println("A4");
	}

	// Existing Interconnector // Methods //2//

	public void EICMUcreation() throws IOException {

		System.out.println("A1");
		cmuid.sendKeys(cf.accessfromfile(2, 2, 4));
		System.out.println("A2");
		cmuname.sendKeys(cf.accessfromfile(2,2, 5));
		Meteringdeferredpage.click();
	}

	public void Existingmeteringinternotdeferred() throws InterruptedException {

		// Selected Radio Button No

		EXIDeferCMUMeteringAssessmentForSettlementNoRadioBox.click();
		EXIInterconnectorAssociatedLoadNoRadioBox.click();
		SingleLineDiagram_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		OtherMeteringInformation_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		MeteringTestCertificate_or_MeteringConfiguration_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000L);
		Savebutton.click();
		save();
	}

	// New Build // Methods //3//

	public void NBGCMUtypecreation() throws IOException {

		System.out.println("A1");
		cmuid.sendKeys(cf.accessfromfile(2, 3, 4));
		System.out.println("A2");
		cmuname.sendKeys(cf.accessfromfile(2,3, 5));
		Meteringdeferredpage.click();
	}

	public void NBGconstructionplan() throws InterruptedException {

		ConstructionPlantab.click();

		ConstructionPlanSummaryInformation.sendKeys("Test text");

		newApparatus_1.click();
		bothnewandrebuiltApparatus_2.click();
		rebuiltandpreviously_3.click();
		B_EachGeneratingUnit_4.click();

		js.executeScript("window.scrollBy(0,150)", "");

		C_wheretheCMUisacombustion_5.click();
		Ci_wheretheCMUisacombustion_6.click();
		Cii_wheretheCMUisacombustion_7.click();

		System.out.println("1");

		js.executeScript("arguments[0].value='03/04/2018';", SigningofEPCequivalentMajorContractEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", SigningofEPCequivalentMajorContractLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", CommencementofConstructionWorksEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", CommencementofConstructionWorksLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", MainFoundationsCompleteEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", MainFoundationsCompleteLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", GasSteamTurbineDeliveryEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", GasSteamTurbineDeliveryLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", AchievementoftheBackFeedMilestoneEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", AchievementoftheBackFeedMilestoneLatestDate);

		js.executeScript("arguments[0].value='03/04/2018';", FirstFiringEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", FirstFiringLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';",
				AchievementoftheSubstantialCompletionMilestoneEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", AchievementoftheSubstantialCompletionMilestoneLatestDate);

		DetailsoftheTotalProjectSpend.sendKeys("500");

		// Please select whether the Qualifying £/kW Capital Expenditure is: *
		QualifyingkWCapitalExpenditure.click();

		QualifyingkWCapitalExpenditureB.click();

		ConstructionPlanDeclaration.click();

	}

	public void NBGMeteringnotdeferred() throws InterruptedException {

		// selected radio button No
		System.out.println("A1");
		NBGDeferCMUMeteringAssessmentForSettlementNoRadioBox.click();
		js.executeScript("javascript:window.scrollBy(0,450)");
		Thread.sleep(2000);
		NBG_OthergenerationNotRadionbox.click();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		NBGSingleLineDiagram_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		NBGOtherMeteringInformation_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		NBGMeteringTestCertificate_or_MeteringConfiguration_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		System.out.println("A2");
		
		Thread.sleep(2000L);
		System.out.println("A3");
		NBGSavebutton.click();
		save();
		System.out.println("A4");
	}

	
	public void Tabswitch() {

		newbuildSwitchmetering.click();
	}

	public void NewBuildgennotdeferred() throws InterruptedException {

		// Selected Radio Button No

		EXIDeferCMUMeteringAssessmentForSettlementNoRadioBox.click();
		EXIInterconnectorAssociatedLoadNoRadioBox.click();
		SingleLineDiagram_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		OtherMeteringInformation_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		MeteringTestCertificate_or_MeteringConfiguration_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000L);
		Savebutton.click();
		save();
	}

	// Refurb Generating Method//4//
	
	
	public void RBGCMUtypecreation() throws IOException {

		System.out.println("A1");
		cmuid.sendKeys(cf.accessfromfile(2, 4, 4));
		System.out.println("A2");
		cmuname.sendKeys(cf.accessfromfile(2,4, 5));
		Meteringdeferredpage.click();
	}

	public void refurbconstructionplan() throws InterruptedException {

		ConstructionPlantab.click();

		refurbConstructionPlanSummaryInformation.sendKeys("Test text");

		refurbnewApparatus_1.click();
		refurbbothnewandrebuiltApparatus_2.click();
		refurbrebuiltandpreviously_3.click();
		refurbB_EachGeneratingUnit_4.click();

		js.executeScript("window.scrollBy(0,150)", "");

		refurbC_wheretheCMUisacombustion_5.click();
		refurbCi_wheretheCMUisacombustion_6.click();
		refurbCii_wheretheCMUisacombustion_7.click();
		js.executeScript("window.scrollBy(0,650)", "");
		System.out.println("1");

		js.executeScript("arguments[0].value='03/04/2018';", refurbSigningofEPCequivalentMajorContractEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbSigningofEPCequivalentMajorContractLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbCommencementofConstructionWorksEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbCommencementofConstructionWorksLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbMainFoundationsCompleteEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbMainFoundationsCompleteLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbGasSteamTurbineDeliveryEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbGasSteamTurbineDeliveryLatestDate);
		// js.executeScript("arguments[0].value='03/04/2018';",
		// refurbAchievementoftheBackFeedMilestoneEarliestDate);
		// js.executeScript("arguments[0].value='03/04/2018';",
		// refurbAchievementoftheBackFeedMilestoneLatestDate);

		System.out.println("m1");

		js.executeScript("arguments[0].value='03/04/2018';", refurbFirstFiringEarliestDate);

		System.out.println("m2");

		js.executeScript("arguments[0].value='03/04/2018';", refurbFirstFiringLatestDate);

		System.out.println("m3");

		js.executeScript("arguments[0].value='03/04/2018';",
				refurbAchievementoftheSubstantialCompletionMilestoneEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';",
				refurbAchievementoftheSubstantialCompletionMilestoneLatestDate);

	
		refurbDetailsoftheTotalProjectSpend.sendKeys("500");

		// Please select whether the Qualifying £/kW Capital Expenditure is: *

	/*	refurbQualifyingkWCapitalExpenditure.click();
		System.out.println("m4");
		refurbQualifyingkWCapitalExpenditureB.click();
		System.out.println("m5");
		refurbConstructionPlanDeclaration.click();
	*/
	
	}

	public void Pre_Refurb_Meteringnotdeferred() throws InterruptedException {

		// selected radio button No
		System.out.println("A1");
		PrerefurbDeferCMUMeteringAssessmentForSettlementNoRadioBox.click();
		js.executeScript("javascript:window.scrollBy(0,450)");
		Thread.sleep(2000);
		PrerefurbOtherGenerationOnSiteNoRadioBox.click();
		Prerefurb_single_line_diagram.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Prerefurb_other_metering_information.sendKeys(System.getProperty("user.dir") + "/test.txt");
		prerefurbMeteringTestCertificateormeteringconfiguration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		System.out.println("A2");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000L);
		// System.out.println("A3");
		// Savebutton.click();
		// save();
		// System.out.println("A4");

	}

	public void Post_Refurb_Meteringnotdeferred() throws InterruptedException {

		// selected radio button No
		System.out.println("A1");
		PostrefurbDeferCMUMeteringAssessmentForSettlementNoRadioBox.click();
		js.executeScript("javascript:window.scrollBy(0,450)");
		Thread.sleep(2000);
		PostrefurbOtherGenerationOnSiteNoRadioBox.click();
		Postrefurb_single_line_diagram.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Postrefurb_other_metering_information.sendKeys(System.getProperty("user.dir") + "/test.txt");
		postrefurbMeteringTestCertificateormeteringconfiguration.sendKeys(System.getProperty("user.dir") + "/test.txt");
		System.out.println("A2");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000L);
		System.out.println("A3");
		Savebutton.click();
		save();
		System.out.println("A4");

	}

	public void postrefurbTabswitch() {

		postrefurbmeteringtab.click();

	}

	// Proven DSR// methods//5
	
	public void PRVNCMUtypecreation() throws IOException {

		System.out.println("A1");
		cmuid.sendKeys(cf.accessfromfile(2, 5, 4));
		System.out.println("A2");
		cmuname.sendKeys(cf.accessfromfile(2,5, 5));
		Meteringdeferredpage.click();
	}

	public void provenDSRBusinessModel() throws InterruptedException

	{
		DSRBusinessModelTemplate.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Thread.sleep(500);
		DSRBusinessModelDeclaration.click();

	}

	public void provenDSRMeteringAssessment() throws InterruptedException

	{
		provenDeferCMUMeteringAssessmentForSettlementNoRadioBox.click();
		js.executeScript("javascript:window.scrollBy(0,450)");
		Thread.sleep(2000);
		provenOtherGenerationOnSiteNoRadioBox.click();
		Proven_single_line_diagram.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Proven_other_metering_information.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView()", Savebutton);
		Savebutton.click();
		save();
	}

	// UnProven DSR// methods//6
	
	public void UnPRVNCMUtypecreation() throws IOException {

		System.out.println("A1");
		cmuid.sendKeys(cf.accessfromfile(2, 6, 4));
		System.out.println("A2");
		cmuname.sendKeys(cf.accessfromfile(2,6, 5));
		Meteringdeferredpage.click();
	}

	
	

	public void UnprovenDSRBusinessModel() throws InterruptedException

	{
		UnprovenDSRBusinessModelTemplate.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Thread.sleep(500);
		UnprovenDSRBusinessModelDeclaration.click();

	}

	public void UnprovenDSRMeteringAssessment() throws InterruptedException

	{
		UnprovenDeferCMUMeteringAssessmentForSettlementNoRadioBox.click();
		js.executeScript("javascript:window.scrollBy(0,450)");
		Thread.sleep(2000);
		UnprovenOtherGenerationOnSiteNoRadioBox.click();
		UnProven_single_line_diagram.sendKeys(System.getProperty("user.dir") + "/test.txt");
		UnProven_other_metering_information.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView()", Savebutton);
		Savebutton.click();
		save();
	}

	//// Refurb ////

	// Refurb Interconnector Method//7//
	
	public void RBCMUtypecreation() throws IOException {

		System.out.println("A1");
		cmuid.sendKeys(cf.accessfromfile(2, 7, 4));
		System.out.println("A2");
		cmuname.sendKeys(cf.accessfromfile(2,7, 5));
		Meteringdeferredpage.click();
	}


	public void refurb_int_constructionplan() throws InterruptedException {

		ConstructionPlantab.click();

		refurbintConstructionPlanSummaryInformation.sendKeys("Test text");

		refurbintnewApparatus_1.click();
		refurbintbothnewandrebuiltApparatus_2.click();
		refurbintrebuiltandpreviously_3.click();
		refurbint_B_EachGeneratingUnit_4.click();

		js.executeScript("window.scrollBy(0,150)", "");

		refurbint_C_wheretheCMUisacombustion_5.click();
		refurbint_Ci_wheretheCMUisacombustion_6.click();
		refurbint_Cii_wheretheCMUisacombustion_7.click();
		js.executeScript("window.scrollBy(0,650)", "");
		System.out.println("1");

		js.executeScript("arguments[0].value='03/04/2018';", refurbintSigningofEPCequivalentMajorContractEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbintSigningofEPCequivalentMajorContractLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbintCommencementofConstructionWorksEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbintCommencementofConstructionWorksLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbint_MainFoundationsCompleteEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbint_MainFoundationsCompleteLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbint_GasSteamTurbineDeliveryEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", refurbint_GasSteamTurbineDeliveryLatestDate);
		// js.executeScript("arguments[0].value='03/04/2018';",
		// refurbAchievementoftheBackFeedMilestoneEarliestDate);
		// js.executeScript("arguments[0].value='03/04/2018';",
		// refurbAchievementoftheBackFeedMilestoneLatestDate);

		System.out.println("m1");

		js.executeScript("arguments[0].value='03/04/2018';", refurbint_FirstFiringEarliestDate);

		System.out.println("m2");

		js.executeScript("arguments[0].value='03/04/2018';", refurbint_FirstFiringLatestDate);

		System.out.println("m3");

		js.executeScript("arguments[0].value='03/04/2018';",
				refurbint_AchievementoftheSubstantialCompletionMilestoneEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';",
				refurbint_AchievementoftheSubstantialCompletionMilestoneLatestDate);

		refurbint_DetailsoftheTotalProjectSpend.sendKeys("500");

		refurbint_ConstructionPlanDeclaration.click();

	}

	public void Pre_Refurb_int_Meteringnotdeferred() throws InterruptedException {

		// selected radio button No
		System.out.println("A1");
		Prerefurbint_DeferCMUMeteringAssessmentForSettlementNoRadioBox.click();
		Prerefurbint_OtherGenerationOnSiteNoRadioBox.click();
		Prerefurbint_single_line_diagram.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Prerefurbint__other_metering_information.sendKeys(System.getProperty("user.dir") + "/test.txt");
		prerefurbint_MeteringTestCertificateormeteringconfiguration
				.sendKeys(System.getProperty("user.dir") + "/test.txt");
		System.out.println("A2");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000L);
		// System.out.println("A3");
		// Savebutton.click();
		// save();
		// System.out.println("A4");

	}

	public void Post_Refurb_int_Meteringnotdeferred() throws InterruptedException {

		// selected radio button No
		System.out.println("A1");
		Postrefurbint_DeferCMUMeteringAssessmentForSettlementNoRadioBox.click();
		Postrefurbint_OtherGenerationOnSiteNoRadioBox.click();
		Postrefurbint_single_line_diagram.sendKeys(System.getProperty("user.dir") + "/test.txt");
		Postrefurbint_other_metering_information.sendKeys(System.getProperty("user.dir") + "/test.txt");
		postrefurbint_MeteringTestCertificateormeteringconfiguration
				.sendKeys(System.getProperty("user.dir") + "/test.txt");

		System.out.println("A2");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000L);
		System.out.println("A3");
		Savebutton.click();
		save();
		System.out.println("A4");

	}

	public void postrefurb_int_Tabswitch() {

		postrefurbmeteringtab.click();

	}

	// New Build interconnector // Methods //8//

	public void NBItypecreation() throws IOException {

		System.out.println("A1");
		cmuid.sendKeys(cf.accessfromfile(2, 8, 4));
		System.out.println("A2");
		cmuname.sendKeys(cf.accessfromfile(2,8, 5));
		Meteringdeferredpage.click();
	}

	public void NBIconstructionplan() throws InterruptedException {

		nbiConstructionPlantab.click();
		NBIConstructionPlanSummaryInformation.sendKeys("Test text");
		NBInewApparatus_1.click();
		NBIbothnewandrebuiltApparatus_2.click();
		NBIrebuiltandpreviously_3.click();
		NBIB_EachGeneratingUnit_4.click();
		js.executeScript("window.scrollBy(0,150)", "");
		NBIC_wheretheCMUisacombustion_5.click();
		NBICi_wheretheCMUisacombustion_6.click();
		NBICii_wheretheCMUisacombustion_7.click();

		System.out.println("1");

		js.executeScript("arguments[0].value='03/04/2018';", NBISigningofEPCequivalentMajorContractEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", NBISigningofEPCequivalentMajorContractLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", NBICommencementofConstructionWorksEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", NBICommencementofConstructionWorksLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", NBIMainFoundationsCompleteEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", NBIMainFoundationsCompleteLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", NBIGasSteamTurbineDeliveryEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", NBIGasSteamTurbineDeliveryLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';", NBIAchievementoftheBackFeedMilestoneEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", NBIAchievementoftheBackFeedMilestoneLatestDate);

		js.executeScript("arguments[0].value='03/04/2018';", NBIFirstFiringEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';", NBIFirstFiringLatestDate);
		js.executeScript("arguments[0].value='03/04/2018';",
				NBIAchievementoftheSubstantialCompletionMilestoneEarliestDate);
		js.executeScript("arguments[0].value='03/04/2018';",
				NBIAchievementoftheSubstantialCompletionMilestoneLatestDate);

		NBIDetailsoftheTotalProjectSpend.sendKeys("500");

		// Please select whether the Qualifying £/kW Capital Expenditure is: *

		NBIConstructionPlanDeclaration.click();

	}

	public void NBITabswitch() {

		NBImeteringtab.click();
	}

	public void NBInotdeferred() throws InterruptedException {

		// Selected Radio Button No

		NBIDeferCMUMeteringAssessmentForSettlementNoRadioBox.click();
		NBIInterconnectorAssociatedLoadNotRadionbox.click();
		NBISingleLineDiagram_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		NBIOtherMeteringInformation_upload.sendKeys(System.getProperty("user.dir") + "/test.txt");
		NBIMeteringTestCertificate_or_MeteringConfiguration_upload
				.sendKeys(System.getProperty("user.dir") + "/test.txt");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000L);
		Savebutton.click();
		save();
	}

	// Common Methods //

	void save() {

		List<WebElement> list1 = driver.findElements(By.xpath("//span[text()='Yes']"));
		System.out.println("List Size" + list1.size());

		for (int i = 0; i < list1.size(); i++) {
			int x = list1.get(i).getLocation().getX();
			if (x > 600 && x < 800) {
				list1.get(i).click();
			}
		}
	}

	// CMU Deferred Metering
	// Metering Not Deferred Assessment

	/*
	 * Methods to select the CMU type via Add CMU button. Method to select CMU using
	 * action Class.
	 */
	public void AddCMU(String cmutype) {

		switch (cmutype) {

		case "ExistingGenerating":

			i = 1;
			break;

		case "ExistingInterconnector":

			i = 2;
			break;

		case "NewBuildGenerating":

			i = 3;
			break;

		case "RefurbishingGenerating":

			i = 4;
			break;

		case "ProvenDSR":

			i = 5;
			break;

		case "UnprovenDSR":

			i = 6;
			break;

		case "RefurbishingInterconnector":

			i = 7;
			break;

		case "NewBuildInterconnector":

			i = 8;
			break;

		}
		System.out.println(i);

		// select cmu type while CMU creation
	
			Actions actions = new Actions(driver);
			actions.moveToElement(Addnewcmu);
			WebElement subMenu1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/ul/li[" + i + "]/a"));
			actions.moveToElement(subMenu1);
			actions.click().build().perform();

	}
	

	public boolean verifycmucreation(String cmuid) {
		
		
		System.out.println(cmuid);
		cmutextverify =cmuid ;
		System.out.println(cmutextverify);
		filtercmu.sendKeys(cmuid);
		filtercmu.click();
		
		WebElement cmutext= driver.findElement(By.xpath("//td[contains(text(), '"+cmuid+"')]"));
		return cmutext.isDisplayed();
		
		
	}

}
