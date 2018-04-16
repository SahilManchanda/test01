package com.emr.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.emr.qa.base.TestBase;

public class Application_Db_Assessment extends TestBase {

	public Application_Db_Assessment() {

		PageFactory.initElements(driver, this);

	}
	// Java Script Executor

		JavascriptExecutor js = (JavascriptExecutor) driver;


	// WebElements //
		
	@FindBy(xpath = "//input[@value=\"Save\" and @id =\"btn-save\"]")
	WebElement Save_button;
		
		

	// CMU Filter Box

	@FindBy(xpath = "//th[@class='dt-head-left']/input[@type = 'text' and @data-filter-property = 'CMU_Identifier' and @placeholder='Filter by CMU']")
	WebElement CMU_Filter_box;

	// Check Out or Continue reviw Button

	@FindBy(xpath = "//td[@data-dt-row ]//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]")
	WebElement CheckOutButton_Contnue_Review_button;

	/////////////////// Existing Generating
	/////////////////// CMU//////////////////////////////////////////-> 1

	@FindBy(xpath = "//a[contains(text(), 'Company and CMU Summary Page')]")
	WebElement EXGCompany_and_CMU_Summary_Page;

	// all fields been correctly completed Radio Button

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement EXGAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement EXGAllfieldsbeencorrectlycompletedRadio_No_Radio_Button;

	// Person submitting the Application an Agent

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement EXGPersonsubmittingtheApplicationanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement EXGPersonsubmittingtheApplicationanAgent_No_Radio_Button;

	// Has an Agent Nomination Form been submitted if Application from an Agent? *

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement EXGHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement EXGHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_No_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='Na'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement EXGHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Na_Radio_Button;

	// CMU Component review

	@FindBy(xpath = "//input[@data-component-id=\"4465\"]")
	WebElement EXGCMU_Component_review;

	@FindBy(xpath = "//input[@id=\"component-4465-question-287\"]")
	WebElement EXGDB_Verified_Component_Connection_Capacity;

	@FindBy(xpath = "//input[@id=\"component-4465-question-288\"]")
	WebElement EXGDB_Verified_Component_Derated_Capacity_2;

	@FindBy(xpath = "//span[text()=\"Save\"]")
	WebElement EXGComponent_review_Save_button;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[289].SelectedValue']")
	WebElement EXG_DBVerifiedCMUConnectionCapacity;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[290].SelectedValue']")
	WebElement EXG_DBVerifiedCMUDe_RatedCapacity;

	// all fields been correctly completed Radio Button 2

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement EXGAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button_2;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement EXGAllfieldsbeencorrectlycompletedRadio_No_Radio_Button_2;

	// DB Check: Have all Documents been successfully supplied

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement EXGDBCheck_HaveallDocumentsbeensuccessfullysupplied_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement EXGDBCheck_Haveall_Documents_beensuccessfullysupplied_no_Radio_Button;

	@FindBy(xpath = "//span[@id='select2-Sections[1].AssessmentQuestions[103].SelectedValue-container']")
	WebElement EXGPrequalification_Decision;

	@FindBy(xpath = "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']")
	WebElement EXGConditional_Prequalification_Reason;

	@FindBy(xpath = "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']")
	WebElement EXGPrequalification_Decision_Reasons_Comments;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement EXGcreditcoverrequired_No_Radio_box;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement EXGcreditcoverrequired_Yes_Radio_box;

	// Price Taker Price Maker

	@FindBy(xpath = "//span[@id=\"select2-Sections[1].AssessmentQuestions[108].SelectedValue-container\"]")
	WebElement EXGPrice_Taker_Price_Maker;

	@FindBy(xpath = "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']")
	WebElement EXGMaximum_Obligation_Period;

	//Agent Text

	@FindBy(xpath = "//label[text()=\"Agent Nomination Form for Main Admin\"]")
	WebElement EXGAgent_text;

	
	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement EXGDB_Check_Have_all_fields_been_correctly_completed_Yes_radionbutton;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement EXGDB_Check_Have_all_fields_been_correctly_completed_No_radio_button;

	@FindBy(xpath = "//span[@id='select2-Sections[8].AssessmentQuestions[185].SelectedValue-container']")
	WebElement EXGDB_Check_DB_Check_Is_a_Metering_Test_Required_button;

	// Switch to Application Page

	@FindBy(xpath = "//a[text()='Application Page']")
	WebElement EXGApplication_Page;

	// Historic Data Information

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='Yes']")
	WebElement EXGDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='No']")
	WebElement EXGDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_No_Radiobutton;

	// DB Check: Have all fields been correctly completed

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='Yes']")
	WebElement EXGDBCheckHaveall_fields_been_correctly_completed_Applicationpage_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='No']")
	WebElement EXGDBCheckHaveall_fields_been_correctly_completed_Applicationpage_No_Radiobutton;

	// Switch to Credit Cover tab

	@FindBy(xpath = "//a[text()='Credit Cover']")
	WebElement EXGCredit_Cover_Page;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='Yes']")
	WebElement EXGHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='No']")
	WebElement EXGHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_No_Radiobutton;

	// Switch to Price Maker Information

	@FindBy(xpath = "//a[text()='Price Maker Info']")
	WebElement EXGPrice_maker_page;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='Yes']")
	WebElement EXGPrice_Maker_Information_Radio_yes;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='No']")
	WebElement EXGPrice_Maker_Information_Radio_no;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Confirmation of Entry']")
	WebElement EXG_ConfirmationofEntrytab;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Length of Agreement']")
	WebElement EXG_Length_of_Agreementtab;

	/////////////////// Existing Inter connector
	/////////////////// CMU//////////////////////////////////////////-> 2

	@FindBy(xpath = "//a[contains(text(), 'Company and CMU Summary Page')]")
	WebElement EXICompany_and_CMU_Summary_Page;

	// all fields been correctly completed Radio Button

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement EXIAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement EXIAllfieldsbeencorrectlycompletedRadio_No_Radio_Button;

	// Person submitting the Application an Agent

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement EXIPersonsubmittingtheApplicationanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement EXIPersonsubmittingtheApplicationanAgent_No_Radio_Button;

	// Has an Agent Nomination Form been submitted if Application from an Agent? *

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement EXIHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement EXIHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_No_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='Na'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement EXIHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Na_Radio_Button;

	// CMU Component review

	@FindBy(xpath = "//input[@data-component-id=\"4465\"]")
	WebElement EXICMU_Component_review;

	@FindBy(xpath = "//input[@id=\"component-4465-question-287\"]")
	WebElement EXIDB_Verified_Component_Connection_Capacity;

	@FindBy(xpath = "//input[@id=\"component-4465-question-288\"]")
	WebElement EXIDB_Verified_Component_Derated_Capacity_2;

	@FindBy(xpath = "//span[text()=\"Save\"]")
	WebElement EXIComponent_review_Save_button;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[289].SelectedValue']")
	WebElement EXI_DBVerifiedCMUConnectionCapacity;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[290].SelectedValue']")
	WebElement EXI_DBVerifiedCMUDe_RatedCapacity;

	// all fields been correctly completed Radio Button 2

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement EXIAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button_2;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement EXIAllfieldsbeencorrectlycompletedRadio_No_Radio_Button_2;

	// DB Check: Have all Documents been successfully supplied

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement EXIDBCheck_HaveallDocumentsbeensuccessfullysupplied_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement EXIDBCheck_Haveall_Documents_beensuccessfullysupplied_no_Radio_Button;

	@FindBy(xpath = "//span[@id='select2-Sections[1].AssessmentQuestions[103].SelectedValue-container']")
	WebElement EXIPrequalification_Decision;

	@FindBy(xpath = "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']")
	WebElement EXIConditional_Prequalification_Reason;

	@FindBy(xpath = "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']")
	WebElement EXIPrequalification_Decision_Reasons_Comments;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement EXIcreditcoverrequired_No_Radio_box;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement EXIcreditcoverrequired_Yes_Radio_box;

	// Price Taker Price Maker

	@FindBy(xpath = "//span[@id=\"select2-Sections[1].AssessmentQuestions[108].SelectedValue-container\"]")
	WebElement EXIPrice_Taker_Price_Maker;

	@FindBy(xpath = "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']")
	WebElement EXIMaximum_Obligation_Period;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement EXIDB_Check_Have_all_fields_been_correctly_completed_Yes_radionbutton;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement EXIDB_Check_Have_all_fields_been_correctly_completed_No_radio_button;

	@FindBy(xpath = "//span[@id='select2-Sections[8].AssessmentQuestions[185].SelectedValue-container']")
	WebElement EXIDB_Check_DB_Check_Is_a_Metering_Test_Required_button;

	// Switch to Application Page

	@FindBy(xpath = "//a[text()='Application Page']")
	WebElement EXIApplication_Page;

	// Historic Data Information

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='Yes']")
	WebElement EXIDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='No']")
	WebElement EXIDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_No_Radiobutton;

	// DB Check: Have all fields been correctly completed

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='Yes']")
	WebElement EXIDBCheckHaveall_fields_been_correctly_completed_Applicationpage_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='No']")
	WebElement EXIDBCheckHaveall_fields_been_correctly_completed_Applicationpage_No_Radiobutton;

	// Switch to Credit Cover tab

	@FindBy(xpath = "//a[text()='Credit Cover']")
	WebElement EXICredit_Cover_Page;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='Yes']")
	WebElement EXIHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='No']")
	WebElement EXIHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_No_Radiobutton;

	// Switch to Price Maker Information

	@FindBy(xpath = "//a[text()='Price Maker Info']")
	WebElement EXIPrice_maker_page;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='Yes']")
	WebElement EXIPrice_Maker_Information_Radio_yes;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='No']")
	WebElement EXIPrice_Maker_Information_Radio_no;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Confirmation of Entry']")
	WebElement EXI_ConfirmationofEntrytab;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Length of Agreement']")
	WebElement EXI_Length_of_Agreementtab;

	/////////////////// New Build generating
	/////////////////// CMU//////////////////////////////////////////->3

	@FindBy(xpath = "//a[contains(text(), 'Company and CMU Summary Page')]")
	WebElement NBGCompany_and_CMU_Summary_Page;

	// all fields been correctly completed Radio Button

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement NBGAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement NBGAllfieldsbeencorrectlycompletedRadio_No_Radio_Button;

	// Person submitting the Application an Agent

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement NBGPersonsubmittingtheApplicationanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement NBGPersonsubmittingtheApplicationanAgent_No_Radio_Button;

	// Has an Agent Nomination Form been submitted if Application from an Agent? *

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement NBGHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement NBGHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_No_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='Na'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement NBGHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Na_Radio_Button;

	// CMU Component review

	@FindBy(xpath = "//input[@data-component-id=\"4465\"]")
	WebElement NBGCMU_Component_review;

	@FindBy(xpath = "//input[@id=\"component-4465-question-287\"]")
	WebElement NBGDB_Verified_Component_Connection_Capacity;

	@FindBy(xpath = "//input[@id=\"component-4465-question-288\"]")
	WebElement NBGDB_Verified_Component_Derated_Capacity_2;

	@FindBy(xpath = "//span[text()=\"Save\"]")
	WebElement NBGComponent_review_Save_button;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[289].SelectedValue']")
	WebElement NBG_DBVerifiedCMUConnectionCapacity;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[290].SelectedValue']")
	WebElement NBG_DBVerifiedCMUDe_RatedCapacity;

	// all fields been correctly completed Radio Button 2

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement NBGAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button_2;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement NBGAllfieldsbeencorrectlycompletedRadio_No_Radio_Button_2;

	// DB Check: Have all Documents been successfully supplied

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement NBGDBCheck_HaveallDocumentsbeensuccessfullysupplied_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement NBGDBCheck_Haveall_Documents_beensuccessfullysupplied_no_Radio_Button;

	@FindBy(xpath = "//span[@id='select2-Sections[1].AssessmentQuestions[103].SelectedValue-container']")
	WebElement NBGPrequalification_Decision;

	@FindBy(xpath = "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']")
	WebElement NBGConditional_Prequalification_Reason;

	@FindBy(xpath = "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']")
	WebElement NBGPrequalification_Decision_Reasons_Comments;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement NBGcreditcoverrequired_No_Radio_box;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement NBGcreditcoverrequired_Yes_Radio_box;

	// Price Taker Price Maker

	@FindBy(xpath = "//span[@id=\"select2-Sections[1].AssessmentQuestions[108].SelectedValue-container\"]")
	WebElement NBGPrice_Taker_Price_Maker;

	@FindBy(xpath = "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']")
	WebElement NBGMaximum_Obligation_Period;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement NBGDB_Check_Have_all_fields_been_correctly_completed_Yes_radionbutton;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement NBGDB_Check_Have_all_fields_been_correctly_completed_No_radio_button;

	@FindBy(xpath = "//span[@id='select2-Sections[8].AssessmentQuestions[185].SelectedValue-container']")
	WebElement NBGDB_Check_DB_Check_Is_a_Metering_Test_Required_button;

	// Switch to Application Page

	@FindBy(xpath = "//a[text()='Application Page']")
	WebElement NBGApplication_Page;

	// Historic Data Information

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='Yes']")
	WebElement NBGDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='No']")
	WebElement NBGDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_No_Radiobutton;

	// DB Check: Have all fields been correctly completed

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='Yes']")
	WebElement NBGDBCheckHaveall_fields_been_correctly_completed_Applicationpage_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='No']")
	WebElement NBGDBCheckHaveall_fields_been_correctly_completed_Applicationpage_No_Radiobutton;

	// Switch to Credit Cover tab

	@FindBy(xpath = "//a[text()='Credit Cover']")
	WebElement NBGCredit_Cover_Page;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='Yes']")
	WebElement NBGHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='No']")
	WebElement NBGHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_No_Radiobutton;

	// Switch to Price Maker Information

	@FindBy(xpath = "//a[text()='Price Maker Info']")
	WebElement NBGPrice_maker_page;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='Yes']")
	WebElement NBGPrice_Maker_Information_Radio_yes;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='No']")
	WebElement NBGPrice_Maker_Information_Radio_no;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Confirmation of Entry']")
	WebElement NBG_ConfirmationofEntrytab;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Length of Agreement']")
	WebElement NBG_Length_of_Agreementtab;

	/////////////////// Refrub generating
	/////////////////// CMU//////////////////////////////////////////-> 4

	@FindBy(xpath = "//a[contains(text(), 'Company and CMU Summary Page')]")
	WebElement RBGCompany_and_CMU_Summary_Page;

	// all fields been correctly completed Radio Button

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement RBGAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement RBGAllfieldsbeencorrectlycompletedRadio_No_Radio_Button;

	// Person submitting the Application an Agent

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement RBGPersonsubmittingtheApplicationanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement RBGPersonsubmittingtheApplicationanAgent_No_Radio_Button;

	// Has an Agent Nomination Form been submitted if Application from an Agent? *

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement RBGHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement RBGHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_No_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='Na'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement RBGHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Na_Radio_Button;

	// CMU Component review

	@FindBy(xpath = "//input[@data-component-id=\"4465\"]")
	WebElement RBGCMU_Component_review;

	@FindBy(xpath = "//input[@id=\"component-4465-question-287\"]")
	WebElement RBGDB_Verified_Component_Connection_Capacity;

	@FindBy(xpath = "//input[@id=\"component-4465-question-288\"]")
	WebElement RBGDB_Verified_Component_Derated_Capacity_2;

	@FindBy(xpath = "//span[text()=\"Save\"]")
	WebElement RBGComponent_review_Save_button;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[289].SelectedValue']")
	WebElement RBG_DBVerifiedCMUConnectionCapacity;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[290].SelectedValue']")
	WebElement RBG_DBVerifiedCMUDe_RatedCapacity;

	// all fields been correctly completed Radio Button 2

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement RBGAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button_2;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement RBGAllfieldsbeencorrectlycompletedRadio_No_Radio_Button_2;

	// DB Check: Have all Documents been successfully supplied

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement RBGDBCheck_HaveallDocumentsbeensuccessfullysupplied_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement RBGDBCheck_Haveall_Documents_beensuccessfullysupplied_no_Radio_Button;

	@FindBy(xpath = "//span[@id='select2-Sections[1].AssessmentQuestions[103].SelectedValue-container']")
	WebElement RBGPrequalification_Decision;

	@FindBy(xpath = "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']")
	WebElement RBGConditional_Prequalification_Reason;

	@FindBy(xpath = "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']")
	WebElement RBGPrequalification_Decision_Reasons_Comments;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement RBGcreditcoverrequired_No_Radio_box;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement RBGcreditcoverrequired_Yes_Radio_box;

	// Price Taker Price Maker

	@FindBy(xpath = "//span[@id=\"select2-Sections[1].AssessmentQuestions[108].SelectedValue-container\"]")
	WebElement RBGPrice_Taker_Price_Maker;

	@FindBy(xpath = "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']")
	WebElement RBGMaximum_Obligation_Period;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement RBGDB_Check_Have_all_fields_been_correctly_completed_Yes_radionbutton;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement RBGDB_Check_Have_all_fields_been_correctly_completed_No_radio_button;

	@FindBy(xpath = "//span[@id='select2-Sections[8].AssessmentQuestions[185].SelectedValue-container']")
	WebElement RBGDB_Check_DB_Check_Is_a_Metering_Test_Required_button;

	// Switch to Application Page

	@FindBy(xpath = "//a[text()='Application Page']")
	WebElement RBGApplication_Page;

	// Historic Data Information

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='Yes']")
	WebElement RBGDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='No']")
	WebElement RBGDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_No_Radiobutton;

	// DB Check: Have all fields been correctly completed

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='Yes']")
	WebElement RBGDBCheckHaveall_fields_been_correctly_completed_Applicationpage_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='No']")
	WebElement RBGDBCheckHaveall_fields_been_correctly_completed_Applicationpage_No_Radiobutton;

	// Switch to Credit Cover tab

	@FindBy(xpath = "//a[text()='Credit Cover']")
	WebElement RBGCredit_Cover_Page;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='Yes']")
	WebElement RBGHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='No']")
	WebElement RBGHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_No_Radiobutton;

	// Switch to Price Maker Information

	@FindBy(xpath = "//a[text()='Price Maker Info']")
	WebElement RBGPrice_maker_page;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='Yes']")
	WebElement RBGPrice_Maker_Information_Radio_yes;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='No']")
	WebElement RBGPrice_Maker_Information_Radio_no;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Confirmation of Entry']")
	WebElement RBG_ConfirmationofEntrytab;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Length of Agreement']")
	WebElement RBG_Length_of_Agreementtab;

	/////////////////// Proven DSR CMU//////////////////////////////////////////-> 5

	@FindBy(xpath = "//a[contains(text(), 'Company and CMU Summary Page')]")
	WebElement PDSRCompany_and_CMU_Summary_Page;

	// all fields been correctly completed Radio Button

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement PDSRAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement PDSRAllfieldsbeencorrectlycompletedRadio_No_Radio_Button;

	// Person submitting the Application an Agent

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement PDSRPersonsubmittingtheApplicationanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement PDSRPersonsubmittingtheApplicationanAgent_No_Radio_Button;

	// Has an Agent Nomination Form been submitted if Application from an Agent? *

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement PDSRHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement PDSRHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_No_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='Na'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement PDSRHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Na_Radio_Button;

	// CMU Component review

	@FindBy(xpath = "//input[@data-component-id=\"4465\"]")
	WebElement PDSRCMU_Component_review;

	@FindBy(xpath = "//input[@id=\"component-4465-question-287\"]")
	WebElement PDSRDB_Verified_Component_Connection_Capacity;

	@FindBy(xpath = "//input[@id=\"component-4465-question-288\"]")
	WebElement PDSRDB_Verified_Component_Derated_Capacity_2;

	@FindBy(xpath = "//span[text()=\"Save\"]")
	WebElement PDSRComponent_review_Save_button;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[289].SelectedValue']")
	WebElement PDSR_DBVerifiedCMUConnectionCapacity;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[290].SelectedValue']")
	WebElement PDSR_DBVerifiedCMUDe_RatedCapacity;

	// all fields been correctly completed Radio Button 2

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement PDSRAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button_2;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement PDSRAllfieldsbeencorrectlycompletedRadio_No_Radio_Button_2;

	// DB Check: Have all Documents been successfully supplied

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement PDSRDBCheck_HaveallDocumentsbeensuccessfullysupplied_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement PDSRDBCheck_Haveall_Documents_beensuccessfullysupplied_no_Radio_Button;

	@FindBy(xpath = "//span[@id='select2-Sections[1].AssessmentQuestions[103].SelectedValue-container']")
	WebElement PDSRPrequalification_Decision;

	@FindBy(xpath = "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']")
	WebElement PDSRConditional_Prequalification_Reason;

	@FindBy(xpath = "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']")
	WebElement PDSRPrequalification_Decision_Reasons_Comments;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement PDSRcreditcoverrequired_No_Radio_box;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement PDSRcreditcoverrequired_Yes_Radio_box;

	// Price Taker Price Maker

	@FindBy(xpath = "//span[@id=\"select2-Sections[1].AssessmentQuestions[108].SelectedValue-container\"]")
	WebElement PDSRPrice_Taker_Price_Maker;

	@FindBy(xpath = "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']")
	WebElement PDSRMaximum_Obligation_Period;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement PDSRDB_Check_Have_all_fields_been_correctly_completed_Yes_radionbutton;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement PDSRDB_Check_Have_all_fields_been_correctly_completed_No_radio_button;

	@FindBy(xpath = "//span[@id='select2-Sections[8].AssessmentQuestions[185].SelectedValue-container']")
	WebElement PDSRDB_Check_DB_Check_Is_a_Metering_Test_Required_button;

	// Switch to Application Page

	@FindBy(xpath = "//a[text()='Application Page']")
	WebElement PDSRApplication_Page;

	// Historic Data Information

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='Yes']")
	WebElement PDSRDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='No']")
	WebElement PDSRDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_No_Radiobutton;

	// DB Check: Have all fields been correctly completed

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='Yes']")
	WebElement PDSRDBCheckHaveall_fields_been_correctly_completed_Applicationpage_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='No']")
	WebElement PDSRDBCheckHaveall_fields_been_correctly_completed_Applicationpage_No_Radiobutton;

	// Switch to Credit Cover tab

	@FindBy(xpath = "//a[text()='Credit Cover']")
	WebElement PDSRCredit_Cover_Page;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='Yes']")
	WebElement PDSRHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='No']")
	WebElement PDSRHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_No_Radiobutton;

	// Switch to Price Maker Information

	@FindBy(xpath = "//a[text()='Price Maker Info']")
	WebElement PDSRPrice_maker_page;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='Yes']")
	WebElement PDSRPrice_Maker_Information_Radio_yes;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='No']")
	WebElement PDSRPrice_Maker_Information_Radio_no;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Confirmation of Entry']")
	WebElement PDSR_ConfirmationofEntrytab;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Length of Agreement']")
	WebElement PDSR_Length_of_Agreementtab;

	/////////////////// Unproven DSR CMU//////////////////////////////////////////->
	/////////////////// 6

	@FindBy(xpath = "//a[contains(text(), 'Company and CMU Summary Page')]")
	WebElement UPDSRCompany_and_CMU_Summary_Page;

	// all fields been correctly completed Radio Button

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement UPDSRAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement UPDSRAllfieldsbeencorrectlycompletedRadio_No_Radio_Button;

	// Person submitting the Application an Agent

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement UPDSRPersonsubmittingtheApplicationanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement UPDSRPersonsubmittingtheApplicationanAgent_No_Radio_Button;

	// Has an Agent Nomination Form been submitted if Application from an Agent? *

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement UPDSRHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement UPDSRHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_No_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='Na'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement UPDSRHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Na_Radio_Button;

	// CMU Component review

	@FindBy(xpath = "//input[@data-component-id=\"4465\"]")
	WebElement UPDSRCMU_Component_review;

	@FindBy(xpath = "//input[@id=\"component-4465-question-287\"]")
	WebElement UPDSRDB_Verified_Component_Connection_Capacity;

	@FindBy(xpath = "//input[@id=\"component-4465-question-288\"]")
	WebElement UPDSRDB_Verified_Component_Derated_Capacity_2;

	@FindBy(xpath = "//span[text()=\"Save\"]")
	WebElement UPDSRComponent_review_Save_button;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[289].SelectedValue']")
	WebElement UPDSR_DBVerifiedCMUConnectionCapacity;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[290].SelectedValue']")
	WebElement UPDSR_DBVerifiedCMUDe_RatedCapacity;

	// all fields been correctly completed Radio Button 2

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement UPDSRAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button_2;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement UPDSRAllfieldsbeencorrectlycompletedRadio_No_Radio_Button_2;

	// DB Check: Have all Documents been successfully supplied

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement UPDSRDBCheck_HaveallDocumentsbeensuccessfullysupplied_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement UPDSRDBCheck_Haveall_Documents_beensuccessfullysupplied_no_Radio_Button;

	@FindBy(xpath = "//span[@id='select2-Sections[1].AssessmentQuestions[103].SelectedValue-container']")
	WebElement UPDSRPrequalification_Decision;

	@FindBy(xpath = "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']")
	WebElement UPDSRConditional_Prequalification_Reason;

	@FindBy(xpath = "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']")
	WebElement UPDSRPrequalification_Decision_Reasons_Comments;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement UPDSRcreditcoverrequired_No_Radio_box;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement UPDSRcreditcoverrequired_Yes_Radio_box;

	// Price Taker Price Maker

	@FindBy(xpath = "//span[@id=\"select2-Sections[1].AssessmentQuestions[108].SelectedValue-container\"]")
	WebElement UPDSRPrice_Taker_Price_Maker;

	@FindBy(xpath = "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']")
	WebElement UPDSRMaximum_Obligation_Period;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement UPDSRDB_Check_Have_all_fields_been_correctly_completed_Yes_radionbutton;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement UPDSRDB_Check_Have_all_fields_been_correctly_completed_No_radio_button;

	@FindBy(xpath = "//span[@id='select2-Sections[8].AssessmentQuestions[185].SelectedValue-container']")
	WebElement UPDSRDB_Check_DB_Check_Is_a_Metering_Test_Required_button;

	// Switch to Application Page

	@FindBy(xpath = "//a[text()='Application Page']")
	WebElement UPDSRApplication_Page;

	// Historic Data Information

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='Yes']")
	WebElement UPDSRDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='No']")
	WebElement UPDSRDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_No_Radiobutton;

	// DB Check: Have all fields been correctly completed

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='Yes']")
	WebElement UPDSRDBCheckHaveall_fields_been_correctly_completed_Applicationpage_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='No']")
	WebElement UPDSRDBCheckHaveall_fields_been_correctly_completed_Applicationpage_No_Radiobutton;

	// Switch to Credit Cover tab

	@FindBy(xpath = "//a[text()='Credit Cover']")
	WebElement UPDSRCredit_Cover_Page;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='Yes']")
	WebElement UPDSRHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='No']")
	WebElement UPDSRHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_No_Radiobutton;

	// Switch to Price Maker Information

	@FindBy(xpath = "//a[text()='Price Maker Info']")
	WebElement UPDSRPrice_maker_page;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='Yes']")
	WebElement UPDSRPrice_Maker_Information_Radio_yes;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='No']")
	WebElement UPDSRPrice_Maker_Information_Radio_no;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Confirmation of Entry']")
	WebElement UPDSR_ConfirmationofEntrytab;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Length of Agreement']")
	WebElement UPDSR_Length_of_Agreementtab;

	/////////////////// Refurb Interconnector
	/////////////////// CMU//////////////////////////////////////////-> 7

	@FindBy(xpath = "//a[contains(text(), 'Company and CMU Summary Page')]")
	WebElement RBICompany_and_CMU_Summary_Page;

	// all fields been correctly completed Radio Button

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement RBIAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement RBIAllfieldsbeencorrectlycompletedRadio_No_Radio_Button;

	// Person submitting the Application an Agent

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement RBIPersonsubmittingtheApplicationanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement RBIPersonsubmittingtheApplicationanAgent_No_Radio_Button;

	// Has an Agent Nomination Form been submitted if Application from an Agent? *

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement RBIHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement RBIHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_No_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='Na'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement RBIHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Na_Radio_Button;

	// CMU Component review

	@FindBy(xpath = "//input[@data-component-id=\"4465\"]")
	WebElement RBICMU_Component_review;

	@FindBy(xpath = "//input[@id=\"component-4465-question-287\"]")
	WebElement RBIDB_Verified_Component_Connection_Capacity;

	@FindBy(xpath = "//input[@id=\"component-4465-question-288\"]")
	WebElement RBIDB_Verified_Component_Derated_Capacity_2;

	@FindBy(xpath = "//span[text()=\"Save\"]")
	WebElement RBIComponent_review_Save_button;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[289].SelectedValue']")
	WebElement RBI_DBVerifiedCMUConnectionCapacity;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[290].SelectedValue']")
	WebElement RBI_DBVerifiedCMUDe_RatedCapacity;

	// all fields been correctly completed Radio Button 2

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement RBIAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button_2;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement RBIAllfieldsbeencorrectlycompletedRadio_No_Radio_Button_2;

	// DB Check: Have all Documents been successfully supplied

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement RBIDBCheck_HaveallDocumentsbeensuccessfullysupplied_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement RBIDBCheck_Haveall_Documents_beensuccessfullysupplied_no_Radio_Button;

	@FindBy(xpath = "//span[@id='select2-Sections[1].AssessmentQuestions[103].SelectedValue-container']")
	WebElement RBIPrequalification_Decision;

	@FindBy(xpath = "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']")
	WebElement RBIConditional_Prequalification_Reason;

	@FindBy(xpath = "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']")
	WebElement RBIPrequalification_Decision_Reasons_Comments;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement RBIcreditcoverrequired_No_Radio_box;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement RBIcreditcoverrequired_Yes_Radio_box;

	// Price Taker Price Maker

	@FindBy(xpath = "//span[@id=\"select2-Sections[1].AssessmentQuestions[108].SelectedValue-container\"]")
	WebElement RBIPrice_Taker_Price_Maker;

	@FindBy(xpath = "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']")
	WebElement RBIMaximum_Obligation_Period;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement RBIDB_Check_Have_all_fields_been_correctly_completed_Yes_radionbutton;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement RBIDB_Check_Have_all_fields_been_correctly_completed_No_radio_button;

	@FindBy(xpath = "//span[@id='select2-Sections[8].AssessmentQuestions[185].SelectedValue-container']")
	WebElement RBIDB_Check_DB_Check_Is_a_Metering_Test_Required_button;

	// Switch to Application Page

	@FindBy(xpath = "//a[text()='Application Page']")
	WebElement RBIApplication_Page;

	// Historic Data Information

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='Yes']")
	WebElement RBIDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='No']")
	WebElement RBIDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_No_Radiobutton;

	// DB Check: Have all fields been correctly completed

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='Yes']")
	WebElement RBIDBCheckHaveall_fields_been_correctly_completed_Applicationpage_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='No']")
	WebElement RBIDBCheckHaveall_fields_been_correctly_completed_Applicationpage_No_Radiobutton;

	// Switch to Credit Cover tab

	@FindBy(xpath = "//a[text()='Credit Cover']")
	WebElement RBICredit_Cover_Page;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='Yes']")
	WebElement RBIHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='No']")
	WebElement RBIHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_No_Radiobutton;

	// Switch to Price Maker Information

	@FindBy(xpath = "//a[text()='Price Maker Info']")
	WebElement RBIPrice_maker_page;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='Yes']")
	WebElement RBIPrice_Maker_Information_Radio_yes;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='No']")
	WebElement RBIPrice_Maker_Information_Radio_no;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Confirmation of Entry']")
	WebElement RBI_ConfirmationofEntrytab;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Length of Agreement']")
	WebElement RBI_Length_of_Agreementtab;

	/////////////////// New Build Interconnector
	/////////////////// CMU//////////////////////////////////////////-> 8

	@FindBy(xpath = "//a[contains(text(), 'Company and CMU Summary Page')]")
	WebElement NBICompany_and_CMU_Summary_Page;

	// all fields been correctly completed Radio Button

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement NBIAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']")
	WebElement NBIAllfieldsbeencorrectlycompletedRadio_No_Radio_Button;

	// Person submitting the Application an Agent

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement NBIPersonsubmittingtheApplicationanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']")
	WebElement NBIPersonsubmittingtheApplicationanAgent_No_Radio_Button;

	// Has an Agent Nomination Form been submitted if Application from an Agent? *

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement NBIHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement NBIHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_No_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='Na'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']")
	WebElement NBIHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Na_Radio_Button;

	// CMU Component review

	@FindBy(xpath = "//input[@data-component-id=\"4465\"]")
	WebElement NBICMU_Component_review;

	@FindBy(xpath = "//input[@id=\"component-4465-question-287\"]")
	WebElement NBIDB_Verified_Component_Connection_Capacity;

	@FindBy(xpath = "//input[@id=\"component-4465-question-288\"]")
	WebElement NBIDB_Verified_Component_Derated_Capacity_2;

	@FindBy(xpath = "//span[text()=\"Save\"]")
	WebElement NBIComponent_review_Save_button;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[289].SelectedValue']")
	WebElement NBI_DBVerifiedCMUConnectionCapacity;

	@FindBy(xpath = "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[290].SelectedValue']")
	WebElement NBI_DBVerifiedCMUDe_RatedCapacity;

	// all fields been correctly completed Radio Button 2

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement NBIAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button_2;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']")
	WebElement NBIAllfieldsbeencorrectlycompletedRadio_No_Radio_Button_2;

	// DB Check: Have all Documents been successfully supplied

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement NBIDBCheck_HaveallDocumentsbeensuccessfullysupplied_Yes_Radio_Button;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']")
	WebElement NBIDBCheck_Haveall_Documents_beensuccessfullysupplied_no_Radio_Button;

	@FindBy(xpath = "//span[@id='select2-Sections[1].AssessmentQuestions[103].SelectedValue-container']")
	WebElement NBIPrequalification_Decision;

	@FindBy(xpath = "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']")
	WebElement NBIConditional_Prequalification_Reason;

	@FindBy(xpath = "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']")
	WebElement NBIPrequalification_Decision_Reasons_Comments;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement NBIcreditcoverrequired_No_Radio_box;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']")
	WebElement NBIcreditcoverrequired_Yes_Radio_box;

	// Price Taker Price Maker

	@FindBy(xpath = "//span[@id=\"select2-Sections[1].AssessmentQuestions[108].SelectedValue-container\"]")
	WebElement NBIPrice_Taker_Price_Maker;

	@FindBy(xpath = "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']")
	WebElement NBIMaximum_Obligation_Period;

	@FindBy(xpath = "//input[@type='radio'and @value='Yes'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement NBIDB_Check_Have_all_fields_been_correctly_completed_Yes_radionbutton;

	@FindBy(xpath = "//input[@type='radio'and @value='No'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']")
	WebElement NBIDB_Check_Have_all_fields_been_correctly_completed_No_radio_button;

	@FindBy(xpath = "//span[@id='select2-Sections[8].AssessmentQuestions[185].SelectedValue-container']")
	WebElement NBIDB_Check_DB_Check_Is_a_Metering_Test_Required_button;

	// Switch to Application Page

	@FindBy(xpath = "//a[text()='Application Page']")
	WebElement NBIApplication_Page;

	// Historic Data Information

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='Yes']")
	WebElement NBIDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[19].AssessmentQuestions[110].SelectedValue' and @value='No']")
	WebElement NBIDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_No_Radiobutton;

	// DB Check: Have all fields been correctly completed

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='Yes']")
	WebElement NBIDBCheckHaveall_fields_been_correctly_completed_Applicationpage_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name='Sections[20].AssessmentQuestions[111].SelectedValue' and @value='No']")
	WebElement NBIDBCheckHaveall_fields_been_correctly_completed_Applicationpage_No_Radiobutton;

	// Switch to Credit Cover tab

	@FindBy(xpath = "//a[text()='Credit Cover']")
	WebElement NBICredit_Cover_Page;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='Yes']")
	WebElement NBIHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_Yes_Radiobutton;

	@FindBy(xpath = "//input[@name=\"Sections[5].AssessmentQuestions[191].SelectedValue\" and @value='No']")
	WebElement NBIHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_No_Radiobutton;

	// Switch to Price Maker Information

	@FindBy(xpath = "//a[text()='Price Maker Info']")
	WebElement NBIPrice_maker_page;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='Yes']")
	WebElement NBIPrice_Maker_Information_Radio_yes;

	@FindBy(xpath = "//input[@name='Sections[15].AssessmentQuestions[189].SelectedValue' and @value='No']")
	WebElement NBIPrice_Maker_Information_Radio_no;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Confirmation of Entry']")
	WebElement NBI_ConfirmationofEntrytab;

	// Switch to Confirmation of Entry tab

	@FindBy(xpath = "//a[text()='Length of Agreement']")
	WebElement NBI_Length_of_Agreementtab;

	
	
	
	
	
	
	
	
	//Existing Generating CMU//methods//DB assessment-> 1
	
	public void EXGDbAssessment_stage_1() throws InterruptedException {
		
		EXGCompany_and_CMU_Summary_Page.click();
	
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);",EXGAgent_text);
		Thread.sleep(2000);
		
		EXGAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button.click();
		EXGPersonsubmittingtheApplicationanAgent_Yes_Radio_Button.click();
		
		js.executeScript("arguments[0].scrollIntoView(true);",EXGPersonsubmittingtheApplicationanAgent_Yes_Radio_Button);
		Thread.sleep(2000);
		
		
		EXGHasanAgentNominationFormbeensubmittedifApplicationfromanAgent_Yes_Radio_Button.click();
		
		js.executeScript("arguments[0].scrollIntoView(true);",EXG_DBVerifiedCMUConnectionCapacity);
		Thread.sleep(2000);
		
		//EXGCMU_Component_review.click();
		//EXGDB_Verified_Component_Connection_Capacity.sendKeys("100");
		//EXGDB_Verified_Component_Derated_Capacity_2.sendKeys("80");
		
		EXGComponent_review_Save_button.click();
		EXG_DBVerifiedCMUConnectionCapacity.sendKeys("100");
		EXG_DBVerifiedCMUDe_RatedCapacity.sendKeys("80");

		EXGAllfieldsbeencorrectlycompletedRadio_Yes_Radio_Button_2.click();
		EXGDBCheck_HaveallDocumentsbeensuccessfullysupplied_Yes_Radio_Button.click();
		
		EXGPrequalification_Decision_Reasons_Comments.sendKeys("Test Comments");
		
		EXGcreditcoverrequired_No_Radio_box.click();
		EXGMaximum_Obligation_Period.sendKeys("3");
		EXGDB_Check_Have_all_fields_been_correctly_completed_Yes_radionbutton.click();
		
		
		EXGApplication_Page.click();
		
		EXGDoes_the_Historic_Data_Information_confirm_the_De_Rated_Capacity_of_the_CMU_Yes_Radiobutton.click();
		EXGDBCheckHaveall_fields_been_correctly_completed_Applicationpage_Yes_Radiobutton.click();
		
		EXGCredit_Cover_Page.click();
		EXGHas_the_Credit_Cover_Information_been_correctly_submitted_for_the_CMU_Yes_Radiobutton.click();
		EXGPrice_maker_page.click();
		
		EXGPrice_Maker_Information_Radio_yes.click();
		EXG_ConfirmationofEntrytab.click();
		EXG_Length_of_Agreementtab.click();
		
		
		
		
	}
	
	
	
	
	// Common Methods
	
	public void SearchApplication(String cmuid) throws InterruptedException{
		
		Thread.sleep(6000);
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(3000);
		CMU_Filter_box.clear();
		CMU_Filter_box.sendKeys(cmuid);
		Thread.sleep(4000);
		
		
	}
	
	public void ClickonContinueReview() {
		
		CheckOutButton_Contnue_Review_button.click();
		
		
	}
	
	
	public void Dbassessmentsave() {
		
		Save_button.click();
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * WebElement radio8 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[19].AssessmentQuestions[110].SelectedValue']"
	 * ); radio8.click();
	 * 
	 * js.executeScript("window.scrollBy(0,1050)", "");
	 * 
	 * Thread.sleep(2000);
	 * 
	 * WebElement radio9 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[20].AssessmentQuestions[111].SelectedValue']"
	 * ); radio9.click();
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * Thread.sleep(1500); driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * //
	 * 
	 * // DB assessment stage 2
	 * 
	 * // WebElement filter_box= driver.findElementByXPath(" //
	 * //th[@class='dt-head-left']/input[@type = 'text' and @data-filter-property =
	 * // 'CMU_Identifier' and @placeholder='Filter by CMU']"); //
	 * Thread.sleep(8000);
	 * 
	 * // filter_box.sendKeys(new CharSequence[] { obj2.accessfromfile(2, 1, 4) });
	 * // Thread.sleep(1000); // filter_box.clear(); // filter_box.sendKeys(new
	 * CharSequence[] { obj2.accessfromfile(2, 1, 4) }); // //filter_box.click();
	 * 
	 * driver.findElementByXPath("//div[@class='toast toast-success']").click();
	 * 
	 * Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * driver.findElementByXPath(
	 * "//tr[@class='odd']//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click();
	 * 
	 * js.executeScript("window.scrollBy(0,100)", ""); Thread.sleep(500L);
	 * 
	 * // Click on generate result letter
	 * 
	 * driver.findElementByXPath("//input[@id='btn-generate-results-letter']").click
	 * ();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * js.executeScript("window.scrollBy(0,500)", "");
	 * 
	 * WebElement box5 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[105].SelectedValue']");
	 * box5.sendKeys(new CharSequence[] { "3" });
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * Thread.sleep(1000);
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * }
	 * 
	 * // 2
	 * 
	 * public void selectEi(ChromeDriver driver) throws IOException,
	 * InterruptedException
	 * 
	 * { JavascriptExecutor js = (JavascriptExecutor) driver; Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * System.out.println("Application assessment  case is running"); WebElement
	 * filter_box = driver.findElementByXPath(
	 * " //th[@class='dt-head-left']/input[@type = 'text' and @data-filter-property = 'CMU_Identifier' and @placeholder='Filter by CMU']"
	 * );
	 * 
	 * filter_box.sendKeys(new CharSequence[] { obj2.accessfromfile(2, 2, 4) });
	 * 
	 * Thread.sleep(4000);
	 * 
	 * filter_box.clear(); filter_box.sendKeys(new CharSequence[] {
	 * obj2.accessfromfile(2, 2, 4) });
	 * 
	 * // filter_box.click();
	 * 
	 * Thread.sleep(4000);
	 * 
	 * driver.findElementByXPath(
	 * "//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click(); Thread.sleep(1000); driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * 
	 * Thread.sleep(2000);
	 * 
	 * WebElement radio1 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']"
	 * );
	 * 
	 * js.executeScript("arguments[0].scrollIntoView(true);", radio1);
	 * 
	 * Thread.sleep(2000); js.executeScript("window.scrollBy(0,-100)", "");
	 * 
	 * radio1.click();
	 * 
	 * WebElement radio2 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']"
	 * ); radio2.click();
	 * 
	 * // Has an Agent Nomination Form been submitted if Application from an Agent?
	 * *
	 * 
	 * WebElement radio3 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']"
	 * ); radio3.click();
	 * 
	 * WebElement box1 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[289].SelectedValue']"
	 * );
	 * 
	 * box1.sendKeys(new CharSequence[] { "100" });
	 * 
	 * WebElement box2 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[290].SelectedValue']"
	 * );
	 * 
	 * box2.sendKeys(new CharSequence[] { "100" });
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * 
	 * WebElement radio4 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']"
	 * ); radio4.click();
	 * 
	 * // DB Check: Have all Documents been successfully supplied *
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(2000);
	 * 
	 * WebElement radio5 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']"
	 * ); radio5.click();
	 * 
	 * // Prequalification Decision Not Required
	 * 
	 * // Conditional Prequalification Reason *
	 * 
	 * // WebElement box3=
	 * 
	 * WebElement box21 = driver .findElementByXPath(
	 * "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']"); //
	 * click();
	 * 
	 * box21.sendKeys("Not Applicable");
	 * 
	 * // box21.selectByVisibleText("Not Applicable");
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * WebElement box3 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']");
	 * box3.sendKeys(new CharSequence[] { "100" }); //
	 * driver.FindElement(By.XPath("//ul[@class='dropdown-menu']/li/a")).Click();
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * // credit cover required WebElement radio6 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']"
	 * ); radio6.click();
	 * 
	 * // Maximum Obligation Period js.executeScript("window.scrollBy(0,100)", "");
	 * Thread.sleep(500);
	 * 
	 * WebElement box4 = driver .findElementByXPath(
	 * "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']");
	 * box4.sendKeys(new CharSequence[] { "3" });
	 * 
	 * js.executeScript("window.scrollBy(0,450)", "");
	 * 
	 * Thread.sleep(2000); // DB Check: Have all fields been correctly completed?
	 * 
	 * WebElement radio7 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']"
	 * ); radio7.click();
	 * 
	 * // js.executeScript("window.scrollBy(0,200)", ""); //
	 * 
	 * /// Switch tab
	 * 
	 * driver.findElementByXPath("//*[@id=\"ui-id-4\"]").click();
	 * Thread.sleep(1000);
	 * 
	 * WebElement radio8 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[19].AssessmentQuestions[110].SelectedValue']"
	 * ); radio8.click();
	 * 
	 * js.executeScript("window.scrollBy(0,1050)", "");
	 * 
	 * Thread.sleep(2000);
	 * 
	 * WebElement radio9 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[20].AssessmentQuestions[111].SelectedValue']"
	 * ); radio9.click();
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * Thread.sleep(500); driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * driver.findElementByXPath("//div[@class='toast toast-success']").click();
	 * js.executeScript("window.scrollBy(0,400)", "");
	 * 
	 * Thread.sleep(18000); driver.findElementByXPath(
	 * " //th[@class='dt-head-left']/input[@type = 'text' and @data-filter-property = 'CMU_Identifier' and @placeholder='Filter by CMU']"
	 * ) .click();
	 * 
	 * driver.findElementByXPath("//div[@class='toast toast-success']").click();
	 * 
	 * Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * driver.findElementByXPath(
	 * "//tr[@class='odd']//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click();
	 * 
	 * js.executeScript("window.scrollBy(0,100)", ""); Thread.sleep(500L);
	 * 
	 * // Click on generate result letter
	 * 
	 * driver.findElementByXPath("//input[@id='btn-generate-results-letter']").click
	 * ();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * js.executeScript("window.scrollBy(0,500)", "");
	 * 
	 * WebElement box5 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[105].SelectedValue']");
	 * box5.sendKeys(new CharSequence[] { "3" });
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * Thread.sleep(1000);
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * }
	 * 
	 * //////////////// 3
	 * 
	 * public void selectNBG(ChromeDriver driver) throws IOException,
	 * InterruptedException
	 * 
	 * { JavascriptExecutor js = (JavascriptExecutor) driver; Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * System.out.println("Application assessment  case is running"); WebElement
	 * filter_box = driver.findElementByXPath(
	 * " //th[@class='dt-head-left']/input[@type = 'text' and @data-filter-property = 'CMU_Identifier' and @placeholder='Filter by CMU']"
	 * );
	 * 
	 * filter_box.sendKeys(new CharSequence[] { obj2.accessfromfile(2, 3, 4) });
	 * 
	 * Thread.sleep(4000);
	 * 
	 * filter_box.clear(); filter_box.sendKeys(new CharSequence[] {
	 * obj2.accessfromfile(2, 3, 4) });
	 * 
	 * // filter_box.click();
	 * 
	 * Thread.sleep(4000);
	 * 
	 * driver.findElementByXPath(
	 * "//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click(); Thread.sleep(1000); driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * 
	 * Thread.sleep(2000);
	 * 
	 * WebElement radio1 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']"
	 * );
	 * 
	 * js.executeScript("arguments[0].scrollIntoView(true);", radio1);
	 * 
	 * Thread.sleep(2000); js.executeScript("window.scrollBy(0,-100)", "");
	 * 
	 * radio1.click();
	 * 
	 * WebElement radio2 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']"
	 * ); radio2.click();
	 * 
	 * // Has an Agent Nomination Form been submitted if Application from an Agent?
	 * *
	 * 
	 * WebElement radio3 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']"
	 * ); radio3.click();
	 * 
	 * WebElement box1 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[289].SelectedValue']"
	 * );
	 * 
	 * box1.sendKeys(new CharSequence[] { "100" });
	 * 
	 * WebElement box2 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[290].SelectedValue']"
	 * );
	 * 
	 * box2.sendKeys(new CharSequence[] { "100" });
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * 
	 * WebElement radio4 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']"
	 * ); radio4.click();
	 * 
	 * // DB Check: Have all Documents been successfully supplied *
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(2000);
	 * 
	 * WebElement radio5 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']"
	 * ); radio5.click();
	 * 
	 * // Prequalification Decision Not Required
	 * 
	 * // Conditional Prequalification Reason *
	 * 
	 * // WebElement box3=
	 * 
	 * WebElement box21 = driver .findElementByXPath(
	 * "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']"); //
	 * click();
	 * 
	 * box21.sendKeys("Not Applicable");
	 * 
	 * // box21.selectByVisibleText("Not Applicable");
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * WebElement box3 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']");
	 * box3.sendKeys(new CharSequence[] { "100" }); //
	 * driver.FindElement(By.XPath("//ul[@class='dropdown-menu']/li/a")).Click();
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * // credit cover required WebElement radio6 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']"
	 * ); radio6.click();
	 * 
	 * // Maximum Obligation Period js.executeScript("window.scrollBy(0,100)", "");
	 * Thread.sleep(500);
	 * 
	 * WebElement box4 = driver .findElementByXPath(
	 * "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']");
	 * box4.sendKeys(new CharSequence[] { "3" });
	 * 
	 * js.executeScript("window.scrollBy(0,850)", "");
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * // DB Check: Have all fields been correctly completed? Thread.sleep(500);
	 * 
	 * WebElement radio7 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']"
	 * ); radio7.click();
	 * 
	 * // js.executeScript("window.scrollBy(0,200)", ""); //
	 * 
	 * /// Switch tab
	 * 
	 * driver.findElementByXPath("//*[@id=\"ui-id-4\"]").click();
	 * Thread.sleep(1000);
	 * 
	 * WebElement radio8 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[20].AssessmentQuestions[111].SelectedValue']"
	 * ); radio8.click();
	 * 
	 * js.executeScript("window.scrollBy(0,1050)", "");
	 * 
	 * // Thread.sleep(2000);
	 * 
	 * // WebElement radio9 = driver.findElementByXPath("//input[@type='radio'and
	 * // @value='Yes'and
	 * // @name='Sections[20].AssessmentQuestions[111].SelectedValue']"); //
	 * radio9.click();
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * Thread.sleep(500); driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * driver.findElementByXPath("//div[@class='toast toast-success']").click();
	 * 
	 * Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * driver.findElementByXPath(
	 * "//tr[@class='odd']//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click();
	 * 
	 * Thread.sleep(4000);
	 * 
	 * driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
	 * 
	 * js.executeScript("window.scrollBy(0,100)", ""); Thread.sleep(500L);
	 * 
	 * // Click on generate result letter
	 * 
	 * driver.findElementByXPath("//input[@id='btn-generate-results-letter']").click
	 * ();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * Thread.sleep(4000);
	 * 
	 * driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * js.executeScript("window.scrollBy(0,500)", "");
	 * 
	 * WebElement box5 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[105].SelectedValue']");
	 * box5.sendKeys(new CharSequence[] { "3" });
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * Thread.sleep(1000);
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * }
	 * 
	 * ///////////// 4
	 * 
	 * public void selectRBG(ChromeDriver driver) throws IOException,
	 * InterruptedException
	 * 
	 * { JavascriptExecutor js = (JavascriptExecutor) driver; Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * System.out.println("Application assessment  case is running"); WebElement
	 * filter_box = driver.findElementByXPath(
	 * " //th[@class='dt-head-left']/input[@type = 'text' and @data-filter-property = 'CMU_Identifier' and @placeholder='Filter by CMU']"
	 * );
	 * 
	 * filter_box.sendKeys(new CharSequence[] { obj2.accessfromfile(2, 4, 4) });
	 * 
	 * Thread.sleep(4000);
	 * 
	 * filter_box.clear(); filter_box.sendKeys(new CharSequence[] {
	 * obj2.accessfromfile(2, 4, 4) });
	 * 
	 * // filter_box.click();
	 * 
	 * Thread.sleep(8000);
	 * 
	 * driver.findElementByXPath(
	 * "//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click(); Thread.sleep(1000); driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * 
	 * Thread.sleep(2000);
	 * 
	 * WebElement radio1 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']"
	 * );
	 * 
	 * js.executeScript("arguments[0].scrollIntoView(true);", radio1);
	 * 
	 * Thread.sleep(2000); js.executeScript("window.scrollBy(0,-100)", "");
	 * 
	 * radio1.click();
	 * 
	 * WebElement radio2 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']"
	 * ); radio2.click();
	 * 
	 * // Has an Agent Nomination Form been submitted if Application from an Agent?
	 * *
	 * 
	 * WebElement radio3 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']"
	 * ); radio3.click();
	 * 
	 * js.executeScript("window.scrollBy(0,100)", "");
	 * 
	 * WebElement box1 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[291].SelectedValue']"
	 * );
	 * 
	 * box1.sendKeys(new CharSequence[] { "100" });
	 * 
	 * WebElement box2 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[292].SelectedValue']"
	 * );
	 * 
	 * box2.sendKeys(new CharSequence[] { "100" });
	 * 
	 * WebElement box1_1 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[293].SelectedValue']"
	 * );
	 * 
	 * box1_1.sendKeys(new CharSequence[] { "100" });
	 * 
	 * WebElement box2_2 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[294].SelectedValue']"
	 * );
	 * 
	 * box2_2.sendKeys(new CharSequence[] { "100" });
	 * 
	 * Thread.sleep(1000);
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * js.executeScript("window.scrollBy(0,200)", "");
	 * 
	 * WebElement radio4 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']"
	 * ); radio4.click();
	 * 
	 * // DB Check: Have all Documents been successfully supplied *
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(2000);
	 * 
	 * WebElement radio5 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']"
	 * ); radio5.click();
	 * 
	 * // Prequalification Decision Not Required
	 * 
	 * // Conditional Prequalification Reason *
	 * 
	 * // WebElement box3=
	 * 
	 * WebElement box21 = driver .findElementByXPath(
	 * "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']"); //
	 * click();
	 * 
	 * box21.sendKeys("Not Applicable");
	 * 
	 * // box21.selectByVisibleText("Not Applicable");
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * WebElement box3 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']");
	 * box3.sendKeys(new CharSequence[] { "100" }); //
	 * driver.FindElement(By.XPath("//ul[@class='dropdown-menu']/li/a")).Click();
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * // credit cover required WebElement radio6 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']"
	 * ); radio6.click();
	 * 
	 * // Maximum Obligation Period js.executeScript("window.scrollBy(0,100)", "");
	 * Thread.sleep(500);
	 * 
	 * WebElement box4 = driver .findElementByXPath(
	 * "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']");
	 * box4.sendKeys(new CharSequence[] { "3" });
	 * 
	 * js.executeScript("window.scrollBy(0,550)", "");
	 * 
	 * // DB Check: Have all fields been correctly completed? Thread.sleep(500);
	 * 
	 * WebElement radio7 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[39].AssessmentQuestions[248].SelectedValue']"
	 * );
	 * 
	 * js.executeScript("arguments[0].scrollIntoView(true);", radio7);
	 * js.executeScript("window.scrollBy(0,-100)", "");
	 * 
	 * radio7.click();
	 * 
	 * WebElement radio8 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[40].AssessmentQuestions[249].SelectedValue']"
	 * );
	 * 
	 * js.executeScript("arguments[0].scrollIntoView(true);", radio8); //
	 * js.executeScript("window.scrollBy(0,-100)", "");
	 * 
	 * radio8.click();
	 * 
	 * // js.executeScript("window.scrollBy(0,200)", ""); //
	 * 
	 * /// Switch tab
	 * 
	 * driver.findElementByXPath("//*[@id=\"ui-id-5\"]").click();
	 * Thread.sleep(1000);
	 * 
	 * WebElement radio9 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[19].AssessmentQuestions[110].SelectedValue']"
	 * ); radio9.click();
	 * 
	 * driver.findElementByXPath("//*[@id=\"ui-id-6\"]").click();
	 * Thread.sleep(1000);
	 * 
	 * WebElement radio10 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[27].AssessmentQuestions[186].SelectedValue']"
	 * ); radio10.click();
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * Thread.sleep(500); driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * driver.findElementByXPath("//div[@class='toast toast-success']").click();
	 * 
	 * Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2 // td[@data-dt-row = '0']//a[contains(text(),
	 * \"Check Out\") or contains(text(), // \"Continue Reviewing\")]")
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * // DB assessment stage 2
	 * 
	 * driver.findElementByXPath(
	 * "//tr[@class='odd']//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click();
	 * 
	 * driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
	 * 
	 * js.executeScript("window.scrollBy(0,100)", ""); Thread.sleep(500L);
	 * 
	 * // Click on generate result letter
	 * 
	 * driver.findElementByXPath("//input[@id='btn-generate-results-letter']").click
	 * ();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * Thread.sleep(4000);
	 * 
	 * // filter_box.sendKeys(new CharSequence[] { obj2.accessfromfile(2, 4, 4) });
	 * // Thread.sleep(1000); // filter_box.clear(); // filter_box.sendKeys(new
	 * CharSequence[] { obj2.accessfromfile(2, 4, 4) }); // filter_box.click();
	 * 
	 * Thread.sleep(14000);
	 * 
	 * driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * js.executeScript("window.scrollBy(0,500)", "");
	 * 
	 * WebElement box5 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[105].SelectedValue']");
	 * box5.sendKeys(new CharSequence[] { "3" });
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * Thread.sleep(1000);
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * }
	 * 
	 * ////// 5 public void selectPDSR(ChromeDriver driver) throws IOException,
	 * InterruptedException
	 * 
	 * { JavascriptExecutor js = (JavascriptExecutor) driver; Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * System.out.println("Application assessment  case is running"); WebElement
	 * filter_box = driver.findElementByXPath(
	 * " //th[@class='dt-head-left']/input[@type = 'text' and @data-filter-property = 'CMU_Identifier' and @placeholder='Filter by CMU']"
	 * );
	 * 
	 * filter_box.sendKeys(new CharSequence[] { obj2.accessfromfile(2, 5, 4) });
	 * 
	 * Thread.sleep(4000);
	 * 
	 * filter_box.clear(); filter_box.sendKeys(new CharSequence[] {
	 * obj2.accessfromfile(2, 5, 4) });
	 * 
	 * // filter_box.click();
	 * 
	 * Thread.sleep(4000);
	 * 
	 * driver.findElementByXPath(
	 * "//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click(); Thread.sleep(1000); driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * 
	 * Thread.sleep(2000);
	 * 
	 * WebElement radio1 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']"
	 * );
	 * 
	 * js.executeScript("arguments[0].scrollIntoView(true);", radio1);
	 * 
	 * Thread.sleep(2000); js.executeScript("window.scrollBy(0,-100)", "");
	 * 
	 * radio1.click();
	 * 
	 * WebElement radio2 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']"
	 * ); radio2.click();
	 * 
	 * // Has an Agent Nomination Form been submitted if Application from an Agent?
	 * *
	 * 
	 * WebElement radio3 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']"
	 * ); radio3.click();
	 * 
	 * WebElement box1 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[289].SelectedValue']"
	 * );
	 * 
	 * box1.sendKeys(new CharSequence[] { "100" });
	 * 
	 * WebElement box2 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[290].SelectedValue']"
	 * );
	 * 
	 * box2.sendKeys(new CharSequence[] { "100" });
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * 
	 * WebElement radio4 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']"
	 * ); radio4.click();
	 * 
	 * // DB Check: Have all Documents been successfully supplied *
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(2000);
	 * 
	 * WebElement radio5 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']"
	 * ); radio5.click();
	 * 
	 * // Prequalification Decision Not Required
	 * 
	 * // Conditional Prequalification Reason *
	 * 
	 * // WebElement box3=
	 * 
	 * WebElement box21 = driver .findElementByXPath(
	 * "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']"); //
	 * click();
	 * 
	 * box21.sendKeys("Not Applicable");
	 * 
	 * // box21.selectByVisibleText("Not Applicable");
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * WebElement box3 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']");
	 * box3.sendKeys(new CharSequence[] { "100" }); //
	 * driver.FindElement(By.XPath("//ul[@class='dropdown-menu']/li/a")).Click();
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * // credit cover required WebElement radio6 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']"
	 * ); radio6.click();
	 * 
	 * // Maximum Obligation Period js.executeScript("window.scrollBy(0,100)", "");
	 * Thread.sleep(500);
	 * 
	 * WebElement box4 = driver .findElementByXPath(
	 * "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']");
	 * box4.sendKeys(new CharSequence[] { "3" });
	 * 
	 * // js.executeScript("window.scrollBy(0,850)", ""); //
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * js.executeScript("window.scrollBy(0,250)", ""); // DB Check: Have all fields
	 * been correctly completed? Thread.sleep(500); WebElement radio7 =
	 * driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[34].AssessmentQuestions[193].SelectedValue']"
	 * );
	 * 
	 * // js.executeScript("arguments[0].scrollIntoView(true);", radio7); //
	 * Thread.sleep(1000); radio7.click();
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(500); WebElement
	 * radio8 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']"
	 * );
	 * 
	 * js.executeScript("arguments[0].scrollIntoView(true);", radio8);
	 * 
	 * Thread.sleep(1000);
	 * 
	 * js.executeScript("window.scrollBy(0,-150)", "");
	 * 
	 * radio8.click();
	 * 
	 * // js.executeScript("window.scrollBy(0,200)", ""); //
	 * 
	 * /// Switch tab
	 * 
	 * driver.findElementByXPath("//*[@id=\"ui-id-4\"]").click();
	 * Thread.sleep(1000);
	 * 
	 * WebElement radio10 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[20].AssessmentQuestions[111].SelectedValue']"
	 * ); radio10.click();
	 * 
	 * js.executeScript("window.scrollBy(0,1050)", "");
	 * 
	 * // Thread.sleep(2000);
	 * 
	 * // WebElement radio9 = driver.findElementByXPath("//input[@type='radio'and
	 * // @value='Yes'and
	 * // @name='Sections[20].AssessmentQuestions[111].SelectedValue']"); //
	 * radio9.click();
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * Thread.sleep(500); driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * driver.findElementByXPath("//div[@class='toast toast-success']").click();
	 * 
	 * Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * // Db assessment Stage2
	 * 
	 * // DB assessment stage 2
	 * 
	 * driver.findElementByXPath(
	 * "//tr[@class='odd']//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click();
	 * 
	 * driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
	 * 
	 * js.executeScript("window.scrollBy(0,100)", ""); Thread.sleep(500L);
	 * 
	 * // Click on generate result letter
	 * 
	 * driver.findElementByXPath("//input[@id='btn-generate-results-letter']").click
	 * ();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * Thread.sleep(4000);
	 * 
	 * // filter_box.sendKeys(new CharSequence[] { obj2.accessfromfile(2, 5, 4) });
	 * // Thread.sleep(1000); // filter_box.clear(); // filter_box.sendKeys(new
	 * CharSequence[] { obj2.accessfromfile(2, 5, 4) }); // filter_box.click();
	 * 
	 * Thread.sleep(4000);
	 * 
	 * driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * js.executeScript("window.scrollBy(0,500)", "");
	 * 
	 * WebElement box5 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[105].SelectedValue']");
	 * box5.sendKeys(new CharSequence[] { "3" });
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * Thread.sleep(1000);
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * } ////////////// 6
	 * 
	 * public void selectUPDSR(ChromeDriver driver) throws IOException,
	 * InterruptedException
	 * 
	 * { JavascriptExecutor js = (JavascriptExecutor) driver; Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * System.out.println("Application assessment  case is running"); WebElement
	 * filter_box = driver.findElementByXPath(
	 * " //th[@class='dt-head-left']/input[@type = 'text' and @data-filter-property = 'CMU_Identifier' and @placeholder='Filter by CMU']"
	 * );
	 * 
	 * filter_box.sendKeys(new CharSequence[] { obj2.accessfromfile(2, 6, 4) });
	 * 
	 * Thread.sleep(4000);
	 * 
	 * filter_box.clear(); filter_box.sendKeys(new CharSequence[] {
	 * obj2.accessfromfile(2, 6, 4) });
	 * 
	 * // filter_box.click();
	 * 
	 * Thread.sleep(4000);
	 * 
	 * driver.findElementByXPath(
	 * "//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click(); Thread.sleep(1000); driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * 
	 * Thread.sleep(2000);
	 * 
	 * WebElement radio1 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']"
	 * );
	 * 
	 * js.executeScript("arguments[0].scrollIntoView(true);", radio1);
	 * 
	 * Thread.sleep(2000); js.executeScript("window.scrollBy(0,-100)", "");
	 * 
	 * radio1.click();
	 * 
	 * WebElement radio2 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']"
	 * ); radio2.click();
	 * 
	 * // Has an Agent Nomination Form been submitted if Application from an Agent?
	 * *
	 * 
	 * WebElement radio3 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']"
	 * ); radio3.click();
	 * 
	 * WebElement box1 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[289].SelectedValue']"
	 * );
	 * 
	 * box1.sendKeys(new CharSequence[] { "100" });
	 * 
	 * WebElement box2 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[290].SelectedValue']"
	 * );
	 * 
	 * box2.sendKeys(new CharSequence[] { "100" });
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * 
	 * WebElement radio4 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']"
	 * ); radio4.click();
	 * 
	 * // DB Check: Have all Documents been successfully supplied *
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(2000);
	 * 
	 * WebElement radio5 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']"
	 * ); radio5.click();
	 * 
	 * // Prequalification Decision Not Required
	 * 
	 * // Conditional Prequalification Reason *
	 * 
	 * // WebElement box3=
	 * 
	 * WebElement box21 = driver .findElementByXPath(
	 * "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']"); //
	 * click();
	 * 
	 * box21.sendKeys("Not Applicable");
	 * 
	 * // box21.selectByVisibleText("Not Applicable");
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * WebElement box3 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']");
	 * box3.sendKeys(new CharSequence[] { "100" }); //
	 * driver.FindElement(By.XPath("//ul[@class='dropdown-menu']/li/a")).Click();
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * // credit cover required WebElement radio6 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']"
	 * ); radio6.click();
	 * 
	 * // Maximum Obligation Period js.executeScript("window.scrollBy(0,100)", "");
	 * Thread.sleep(500);
	 * 
	 * WebElement box4 = driver .findElementByXPath(
	 * "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']");
	 * box4.sendKeys(new CharSequence[] { "3" });
	 * 
	 * // js.executeScript("window.scrollBy(0,850)", ""); //
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * js.executeScript("window.scrollBy(0,250)", ""); // DB Check: Have all fields
	 * been correctly completed? Thread.sleep(500); WebElement radio7 =
	 * driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[35].AssessmentQuestions[286].SelectedValue']"
	 * );
	 * 
	 * // js.executeScript("arguments[0].scrollIntoView(true);", radio7); //
	 * Thread.sleep(1000); radio7.click();
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(500); WebElement
	 * radio8 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']"
	 * );
	 * 
	 * js.executeScript("arguments[0].scrollIntoView(true);", radio8);
	 * 
	 * Thread.sleep(1000);
	 * 
	 * js.executeScript("window.scrollBy(0,-150)", "");
	 * 
	 * radio8.click();
	 * 
	 * // js.executeScript("window.scrollBy(0,200)", ""); //
	 * 
	 * /// Switch tab
	 * 
	 * driver.findElementByXPath("//*[@id=\"ui-id-4\"]").click();
	 * Thread.sleep(1000);
	 * 
	 * WebElement radio10 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[20].AssessmentQuestions[111].SelectedValue']"
	 * ); radio10.click();
	 * 
	 * js.executeScript("window.scrollBy(0,1050)", "");
	 * 
	 * // Thread.sleep(2000);
	 * 
	 * // WebElement radio9 = driver.findElementByXPath("//input[@type='radio'and
	 * // @value='Yes'and
	 * // @name='Sections[20].AssessmentQuestions[111].SelectedValue']"); //
	 * radio9.click();
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * Thread.sleep(500); driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * driver.findElementByXPath("//div[@class='toast toast-success']").click();
	 * 
	 * Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * driver.findElementByXPath(
	 * "//tr[@class='odd']//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click();
	 * 
	 * driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
	 * 
	 * js.executeScript("window.scrollBy(0,100)", ""); Thread.sleep(500L);
	 * 
	 * // Click on generate result letter
	 * 
	 * driver.findElementByXPath("//input[@id='btn-generate-results-letter']").click
	 * ();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * Thread.sleep(4000); // filter_box.sendKeys(new CharSequence[] {
	 * obj2.accessfromfile(2, 6, 4) });
	 * 
	 * // Thread.sleep(1000); // filter_box.clear(); // filter_box.sendKeys(new
	 * CharSequence[] { obj2.accessfromfile(2, 6, 4) }); // filter_box.click();
	 * 
	 * driver.
	 * findElementByXPath(" //a[contains(text(), \"Company and CMU Summary Page\")]"
	 * ).click();
	 * 
	 * js.executeScript("window.scrollBy(0,-150)", "");
	 * 
	 * // driver.findElementByXPath("//a[contains(text(), 'Company and CMU Summary
	 * // Page')]").click();
	 * 
	 * js.executeScript("window.scrollBy(0,500)", "");
	 * 
	 * WebElement box5 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[105].SelectedValue']");
	 * box5.sendKeys(new CharSequence[] { "3" });
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * Thread.sleep(1000);
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * }
	 * 
	 * ///////////// 7
	 * 
	 * public void selectRBI(ChromeDriver driver) throws IOException,
	 * InterruptedException
	 * 
	 * { JavascriptExecutor js = (JavascriptExecutor) driver; Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * System.out.println("Application assessment  case is running"); WebElement
	 * filter_box = driver.findElementByXPath(
	 * " //th[@class='dt-head-left']/input[@type = 'text' and @data-filter-property = 'CMU_Identifier' and @placeholder='Filter by CMU']"
	 * );
	 * 
	 * filter_box.sendKeys(new CharSequence[] { obj2.accessfromfile(2, 7, 4) });
	 * 
	 * Thread.sleep(4000);
	 * 
	 * filter_box.clear(); filter_box.sendKeys(new CharSequence[] {
	 * obj2.accessfromfile(2, 7, 4) });
	 * 
	 * // filter_box.click();
	 * 
	 * Thread.sleep(6000);
	 * 
	 * driver.findElementByXPath(
	 * "//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click(); Thread.sleep(1000); driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * 
	 * Thread.sleep(2000);
	 * 
	 * WebElement radio1 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']"
	 * );
	 * 
	 * js.executeScript("arguments[0].scrollIntoView(true);", radio1);
	 * 
	 * Thread.sleep(2000); js.executeScript("window.scrollBy(0,-100)", "");
	 * 
	 * radio1.click();
	 * 
	 * WebElement radio2 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']"
	 * ); radio2.click();
	 * 
	 * // Has an Agent Nomination Form been submitted if Application from an Agent?
	 * *
	 * 
	 * WebElement radio3 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']"
	 * ); radio3.click();
	 * 
	 * js.executeScript("window.scrollBy(0,100)", "");
	 * 
	 * WebElement box1 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[291].SelectedValue']"
	 * );
	 * 
	 * box1.sendKeys(new CharSequence[] { "100" });
	 * 
	 * WebElement box2 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[292].SelectedValue']"
	 * );
	 * 
	 * box2.sendKeys(new CharSequence[] { "100" });
	 * 
	 * WebElement box1_1 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[293].SelectedValue']"
	 * );
	 * 
	 * box1_1.sendKeys(new CharSequence[] { "100" });
	 * 
	 * WebElement box2_2 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[294].SelectedValue']"
	 * );
	 * 
	 * box2_2.sendKeys(new CharSequence[] { "100" });
	 * 
	 * Thread.sleep(1000);
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * js.executeScript("window.scrollBy(0,200)", "");
	 * 
	 * WebElement radio4 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']"
	 * ); radio4.click();
	 * 
	 * // DB Check: Have all Documents been successfully supplied *
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(2000);
	 * 
	 * WebElement radio5 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']"
	 * ); radio5.click();
	 * 
	 * // Prequalification Decision Not Required
	 * 
	 * // Conditional Prequalification Reason *
	 * 
	 * // WebElement box3=
	 * 
	 * WebElement box21 = driver .findElementByXPath(
	 * "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']"); //
	 * click();
	 * 
	 * box21.sendKeys("Not Applicable");
	 * 
	 * // box21.selectByVisibleText("Not Applicable");
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * WebElement box3 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']");
	 * box3.sendKeys(new CharSequence[] { "100" }); //
	 * driver.FindElement(By.XPath("//ul[@class='dropdown-menu']/li/a")).Click();
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * // credit cover required WebElement radio6 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']"
	 * ); radio6.click();
	 * 
	 * // Maximum Obligation Period js.executeScript("window.scrollBy(0,100)", "");
	 * Thread.sleep(500);
	 * 
	 * WebElement box4 = driver .findElementByXPath(
	 * "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']");
	 * box4.sendKeys(new CharSequence[] { "3" });
	 * 
	 * js.executeScript("window.scrollBy(0,550)", "");
	 * 
	 * // DB Check: Have all fields been correctly completed? Thread.sleep(500);
	 * 
	 * WebElement radio7 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[39].AssessmentQuestions[248].SelectedValue']"
	 * );
	 * 
	 * js.executeScript("arguments[0].scrollIntoView(true);", radio7);
	 * js.executeScript("window.scrollBy(0,-100)", "");
	 * 
	 * radio7.click();
	 * 
	 * WebElement radio8 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[40].AssessmentQuestions[249].SelectedValue']"
	 * );
	 * 
	 * js.executeScript("arguments[0].scrollIntoView(true);", radio8); //
	 * js.executeScript("window.scrollBy(0,-100)", "");
	 * 
	 * radio8.click();
	 * 
	 * // js.executeScript("window.scrollBy(0,200)", ""); //
	 * 
	 * /// Switch tab
	 * 
	 * driver.findElementByXPath("//*[@id=\"ui-id-5\"]").click();
	 * Thread.sleep(1000);
	 * 
	 * WebElement radio9 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[19].AssessmentQuestions[110].SelectedValue']"
	 * ); radio9.click();
	 * 
	 * driver.findElementByXPath("//*[@id=\"ui-id-6\"]").click();
	 * Thread.sleep(1000);
	 * 
	 * WebElement radio10 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[27].AssessmentQuestions[186].SelectedValue']"
	 * ); radio10.click();
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * Thread.sleep(500); driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * driver.findElementByXPath("//div[@class='toast toast-success']").click();
	 * 
	 * Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * driver.findElementByXPath(
	 * "//tr[@class='odd']//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click();
	 * 
	 * driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
	 * 
	 * js.executeScript("window.scrollBy(0,100)", ""); Thread.sleep(500L);
	 * 
	 * // Click on generate result letter
	 * 
	 * driver.findElementByXPath("//input[@id='btn-generate-results-letter']").click
	 * ();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * Thread.sleep(4000);
	 * 
	 * // filter_box.sendKeys(new CharSequence[] { obj2.accessfromfile(2, 7, 4) });
	 * 
	 * // Thread.sleep(1000); // filter_box.clear(); // filter_box.sendKeys(new
	 * CharSequence[] { obj2.accessfromfile(2, 7, 4) }); // filter_box.click();
	 * 
	 * //
	 * 
	 * //
	 * 
	 * driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * js.executeScript("window.scrollBy(0,500)", "");
	 * 
	 * WebElement box5 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[105].SelectedValue']");
	 * box5.sendKeys(new CharSequence[] { "3" });
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * Thread.sleep(1000);
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * }
	 * 
	 * ///////////////// 8 public void selectNBI(ChromeDriver driver) throws
	 * IOException, InterruptedException
	 * 
	 * { JavascriptExecutor js = (JavascriptExecutor) driver; Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * System.out.println("Application assessment  case is running"); WebElement
	 * filter_box = driver.findElementByXPath(
	 * " //th[@class='dt-head-left']/input[@type = 'text' and @data-filter-property = 'CMU_Identifier' and @placeholder='Filter by CMU']"
	 * );
	 * 
	 * filter_box.sendKeys(new CharSequence[] { obj2.accessfromfile(2, 8, 4) });
	 * 
	 * Thread.sleep(4000);
	 * 
	 * filter_box.clear(); filter_box.sendKeys(new CharSequence[] {
	 * obj2.accessfromfile(2, 8, 4) });
	 * 
	 * // filter_box.click();
	 * 
	 * Thread.sleep(4000);
	 * 
	 * driver.findElementByXPath(
	 * "//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click(); Thread.sleep(1000); driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * 
	 * Thread.sleep(2000);
	 * 
	 * WebElement radio1 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[194].SelectedValue']"
	 * );
	 * 
	 * js.executeScript("arguments[0].scrollIntoView(true);", radio1);
	 * 
	 * Thread.sleep(2000); js.executeScript("window.scrollBy(0,-100)", "");
	 * 
	 * radio1.click();
	 * 
	 * WebElement radio2 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[195].SelectedValue']"
	 * ); radio2.click();
	 * 
	 * // Has an Agent Nomination Form been submitted if Application from an Agent?
	 * *
	 * 
	 * WebElement radio3 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[32].AssessmentQuestions[196].SelectedValue']"
	 * ); radio3.click();
	 * 
	 * WebElement box1 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[289].SelectedValue']"
	 * );
	 * 
	 * box1.sendKeys(new CharSequence[] { "100" });
	 * 
	 * WebElement box2 = driver.findElementByXPath(
	 * "//input[@type='text'and @name ='Sections[47].AssessmentQuestions[290].SelectedValue']"
	 * );
	 * 
	 * box2.sendKeys(new CharSequence[] { "100" });
	 * 
	 * // DB Check: Have all fields been correctly completed? *
	 * 
	 * WebElement radio4 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[101].SelectedValue']"
	 * ); radio4.click();
	 * 
	 * // DB Check: Have all Documents been successfully supplied *
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(2000);
	 * 
	 * WebElement radio5 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[1].AssessmentQuestions[102].SelectedValue']"
	 * ); radio5.click();
	 * 
	 * // Prequalification Decision Not Required
	 * 
	 * // Conditional Prequalification Reason *
	 * 
	 * // WebElement box3=
	 * 
	 * WebElement box21 = driver .findElementByXPath(
	 * "//select[@id='Sections[1].AssessmentQuestions[199].SelectedValue']"); //
	 * click();
	 * 
	 * box21.sendKeys("Not Applicable");
	 * 
	 * // box21.selectByVisibleText("Not Applicable");
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * WebElement box3 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[104].SelectedValue']");
	 * box3.sendKeys(new CharSequence[] { "100" }); //
	 * driver.FindElement(By.XPath("//ul[@class='dropdown-menu']/li/a")).Click();
	 * 
	 * js.executeScript("window.scrollBy(0,200)", ""); Thread.sleep(1000);
	 * 
	 * // credit cover required WebElement radio6 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='No'and @name='Sections[1].AssessmentQuestions[106].SelectedValue']"
	 * ); radio6.click();
	 * 
	 * // Maximum Obligation Period js.executeScript("window.scrollBy(0,100)", "");
	 * Thread.sleep(500);
	 * 
	 * WebElement box4 = driver .findElementByXPath(
	 * "//input[@name='Sections[1].AssessmentQuestions[109].SelectedValue']");
	 * box4.sendKeys(new CharSequence[] { "3" });
	 * 
	 * js.executeScript("window.scrollBy(0,850)", "");
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * // DB Check: Have all fields been correctly completed? Thread.sleep(500);
	 * 
	 * WebElement radio7 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[8].AssessmentQuestions[184].SelectedValue']"
	 * ); radio7.click();
	 * 
	 * // js.executeScript("window.scrollBy(0,200)", ""); //
	 * 
	 * /// Switch tab
	 * 
	 * driver.findElementByXPath("//*[@id=\"ui-id-4\"]").click();
	 * Thread.sleep(1000);
	 * 
	 * WebElement radio8 = driver.findElementByXPath(
	 * "//input[@type='radio'and @value='Yes'and @name='Sections[20].AssessmentQuestions[111].SelectedValue']"
	 * ); radio8.click();
	 * 
	 * js.executeScript("window.scrollBy(0,1050)", "");
	 * 
	 * // Thread.sleep(2000);
	 * 
	 * // WebElement radio9 = driver.findElementByXPath("//input[@type='radio'and
	 * // @value='Yes'and
	 * // @name='Sections[20].AssessmentQuestions[111].SelectedValue']"); //
	 * radio9.click();
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * Thread.sleep(500); driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * driver.findElementByXPath("//div[@class='toast toast-success']").click();
	 * 
	 * Thread.sleep(25000);
	 * 
	 * // Db assessment Stage2
	 * 
	 * driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	 * 
	 * driver.findElementByXPath(
	 * "//tr[@class='odd']//td[@data-dt-row = '0']//a[contains(text(), \"Check Out\") or contains(text(), \"Continue Reviewing\")]"
	 * ) .click();
	 * 
	 * driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
	 * 
	 * js.executeScript("window.scrollBy(0,100)", ""); Thread.sleep(500L);
	 * 
	 * // Click on generate result letter
	 * 
	 * driver.findElementByXPath("//input[@id='btn-generate-results-letter']").click
	 * ();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * Thread.sleep(4000);
	 * 
	 * driver.
	 * findElementByXPath("//a[contains(text(), 'Company and CMU Summary Page')]").
	 * click();
	 * 
	 * js.executeScript("window.scrollBy(0,500)", "");
	 * 
	 * WebElement box5 = driver .findElementByXPath(
	 * "//textarea[@name='Sections[1].AssessmentQuestions[105].SelectedValue']");
	 * box5.sendKeys(new CharSequence[] { "3" });
	 * 
	 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 * 
	 * Thread.sleep(1000);
	 * 
	 * driver.findElementByXPath("//input[@id='btn-submit']").click();
	 * 
	 * driver.
	 * findElementByXPath("//span[contains(text(),'Yes') and @class='ui-button-text']"
	 * ).click();
	 * 
	 * }
	 * 
	 */

}
