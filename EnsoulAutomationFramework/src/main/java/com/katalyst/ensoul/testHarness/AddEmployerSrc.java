package com.katalyst.ensoul.testHarness;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.AddEmployerPage;
import com.katalyst.ensoul.page.RegisterLifeEvent;

public class AddEmployerSrc extends TestBase {

	private static HashMap<String, String> ae_map = new HashMap<>();
	String[] ae_number = new String[5];

	public void createEmployer(String[] createEmployerTestData) throws Exception {
		PageFactory.initElements(driver, AddEmployerPage.class);

		// Test Data
		String EmployerNameTxt = createEmployerTestData[0];
		String TaxIdTxt = createEmployerTestData[1];
		String Street1Txt = createEmployerTestData[2];
		String Street2Txt = createEmployerTestData[3];
		String City = createEmployerTestData[4];
		String Country = createEmployerTestData[5];
		String State = createEmployerTestData[6];
		String Zip = createEmployerTestData[7];
		String DesignationCR = createEmployerTestData[8];
		String FirstNameCR = createEmployerTestData[9];
		String LastNameCR = createEmployerTestData[10];
		String StreetAddress1CR = createEmployerTestData[11];
		String StreetAddress2CR = createEmployerTestData[12];
		String CityCR = createEmployerTestData[13];
		String StateCR = createEmployerTestData[14];
		String ZipCR = createEmployerTestData[15];
		String PhoneCR = createEmployerTestData[16];
		String ExtensionCR = createEmployerTestData[17];
		String CellCR = createEmployerTestData[18];
		String EmailCR = createEmployerTestData[19];
		String UserID = createEmployerTestData[20];
		String CountryLocation = createEmployerTestData[21];
		String MonthlyCalendarName = createEmployerTestData[22];
		String MonthlyPeriodBeginDate = createEmployerTestData[23];
		String MonthlyPeriodEndDate = createEmployerTestData[24];
		String MonthlyPeriodCheckDate = createEmployerTestData[25];
		String CheckDayOfMonth = createEmployerTestData[26];

		waitForElement(AddEmployerPage.getLnk_AddEmployer(), 20);
		click(AddEmployerPage.getLnk_AddEmployer(), "Clicked on Add Employer Icon");
		sendKeys(AddEmployerPage.getTxt_Name(), EmployerNameTxt, "Entered Employer name");
		sendKeys(AddEmployerPage.getTxt_TaxId(), TaxIdTxt, "Entered Tax Id of employer");
		sendKeys(AddEmployerPage.getTxt_Lane(), Street1Txt, "Entered Street 1 of employer");
		sendKeys(AddEmployerPage.getTxt_Street(), Street2Txt, "Entered Street 2 of employer");
		sendKeys(AddEmployerPage.getTxt_City(), City, "Entered City employer");
		selectByVisibleText(AddEmployerPage.getDd_Opn_CountryId(), Country, "select Country");
		selectByVisibleText(AddEmployerPage.getDd_Opn_EmployerStateId(), State, "select State");
		sendKeys(AddEmployerPage.getTxt_Zip(), Zip, "Entered Zip of employer");
		click(AddEmployerPage.getChk_India(), CountryLocation);
		click(AddEmployerPage.getBtn_SaveNextBasicDetails(), "Clicked Save & Next Basic Details Button");
		click(AddEmployerPage.getChk_Immigration(), "Select Immigration Checkbox");
		click(AddEmployerPage.getChk_Timesheet(), "Select Timesheet Checkbox");
		click(AddEmployerPage.getChk_TravelPortal(), "Clicked Travel Portal Checkbox");
		click(AddEmployerPage.getBtn_SaveNextApplications(), "Clicked on Save Next button");
		sendKeys(AddEmployerPage.getTxt_Designation(), DesignationCR, "Entered Client Representative Designation");
		sendKeys(AddEmployerPage.getTxt_FirstName(), FirstNameCR, "Entered Client Representative First Name");
		sendKeys(AddEmployerPage.getTxt_LastName(), LastNameCR, "Entered Client Representative Last Name");
		sendKeys(AddEmployerPage.getTxt_StreetAddress1(), StreetAddress1CR,
				"Entered Client Representative Street Address 1");
		sendKeys(AddEmployerPage.getTxt_StreetAddress2(), StreetAddress2CR,
				"Entered Client Representative Street Address2 ");
		sendKeys(AddEmployerPage.getTxt_RepresentativeCity(), CityCR, "Entered Client Representative City Name");
		selectByVisibleText(AddEmployerPage.getDd_Opn_RepresentativeStateId(), StateCR, "Select State from drop down");
		sendKeys(AddEmployerPage.getTxt_RepresentativeZip(), ZipCR, "Entered Client Representative Zip Name");
		sendKeys(AddEmployerPage.getTxt_phone(), PhoneCR, "Entered Client Representative Phone number");
		sendKeys(AddEmployerPage.getTxt_ext(), ExtensionCR, "Entered Client Representative Extension number");
		sendKeys(AddEmployerPage.getTxt_cell(), CellCR, "Entered Client Representative Cell number");
		sendKeys(AddEmployerPage.getTxt_email(), EmailCR, "Entered Client Representative Email number");
		click(AddEmployerPage.getBtn_CR(), "Clicked Save & Next CR Details button");
		click(AddEmployerPage.getrad_RepId(), "Clicked on user name radio button");
		sendKeys(AddEmployerPage.getTxt_UserId(), UserID, "Entered user id for Employer credential");
		click(AddEmployerPage.getBtn_Verify(), "Click on verify username button");
		waitForElement(AddEmployerPage.getBtn_CreateUser(), 20);
		click(AddEmployerPage.getBtn_CreateUser(), "Click on create user id button");
		waitForElement(AddEmployerPage.getBtn_SkipNext(), 20);
		click(AddEmployerPage.getBtn_SkipNext(), "Click on skip & next button of employer credential ");
		click(AddEmployerPage.getBtnNextGeneralSetup(), "Click on next button general setting ");
		click(AddEmployerPage.getAuthorize(), "Click on authorize button of employer authorization ");
		click(AddEmployerPage.getSkipNextAuthorization(), "Click on skip & next button of employer authorization ");
		click(AddEmployerPage.getSaveFinishReportSetting(), "Click on report setting button of employer ");
		click(AddEmployerPage.getClickHereApplicationConfig(), "Click on Application configuration click here link");
		click(AddEmployerPage.getlnk_AutoBroker(), "Click here for broker limnk");
		click(AddEmployerPage.getBtnSaveRelabel_Employee(), "Click on save relabel employee information in HR lite");
		click(AddEmployerPage.getBtnNextTab1Emp(), "Click on drop down items of employee information in HR lite");
		click(AddEmployerPage.getBtnNextTab2_Employee(),
				"Click on Add fields save and finish button of employee information in HR lite");
		click(AddEmployerPage.getBtnSaveRelabel_Employment(),
				"Click on save relabel button of employment information in HR lite");
		click(AddEmployerPage.getBtnNextTab1Employ(), "Click on Drop down items of employment information in HR lite");
		click(AddEmployerPage.getBtnNextTab2_Employment(),
				"Click on Add fields save and finish of employment information in HR lite");
		click(AddEmployerPage.getBtnNextHomeContact(), "Click on next button of Home contact in HR lite");
		click(AddEmployerPage.getBtnSkipAddFieldsHomeContact(),
				"Click on Skip add fields button of Home contact in HR lite");
		waitForElement(AddEmployerPage.getBtnNextWorkContact(), 20);
		click(AddEmployerPage.getBtnNextWorkContact(),
				"Click on relabel work contact Next button of  contact in HR lite");
		click(AddEmployerPage.getBtnNextTab2_PermContact(),
				"Click on Skip add permenant field of work contact in HR lite");
		click(AddEmployerPage.getBtnSaveLabels6WorkContact(), "Click on Next button of work contact in HR lite");
		click(AddEmployerPage.getBtnSaveFinishNextTab2_Work(),
				"Click on Save & Finish button of workc ontact in HR lite");
		click(AddEmployerPage.getBtnSaveRelabel_Dependent(), "Click on Save dependent relabel info in HR lite");
		click(AddEmployerPage.getBtnNextTab1_Dependent(), "Click on Next dependent Drop down info in HR lite");
		click(AddEmployerPage.getBtnNextTab2_Dependent(),
				"Click on save and finish dependent Drop down info in HR lite");
		click(AddEmployerPage.getBtnNextPayroll(), "Click on Next button relabel info of payroll in HR lite");
		click(AddEmployerPage.getBtnNextDpItemsPayroll(),
				"Click on Next button drop down items info of payroll in HR lite");
		click(AddEmployerPage.getBtnSkipAddFieldsPayroll(),
				"Click on Skip  button add fields info of payroll in HR lite");
		click(AddEmployerPage.getchk_MonthlyPayroll(), "Select Monthly payroll Checkbox");
		sendKeys(AddEmployerPage.getTxt_MonthlyCalendar(), MonthlyCalendarName, "Monthly calendar name");
		waitForElement(AddEmployerPage.getDate_MonthlyStartDate(), 10);
		sendKeys(AddEmployerPage.getDate_MonthlyStartDate(), MonthlyPeriodBeginDate, "Monthly Payroll begin date");
		waitForElement(AddEmployerPage.getDate_MonthlyEndDate(), 10);
		sendKeys(AddEmployerPage.getDate_MonthlyEndDate(), MonthlyPeriodEndDate, "Monthly payroll end date");
		waitForElement(AddEmployerPage.getDate_MonthlyCheckDate(), 10);
		sendKeys(AddEmployerPage.getDate_MonthlyCheckDate(), MonthlyPeriodCheckDate, "Monthly payroll check date");
		waitForElement(AddEmployerPage.getDd_CheckMonthlyDayofMonth(), 10);
		selectByVisibleText(AddEmployerPage.getDd_CheckMonthlyDayofMonth(), CheckDayOfMonth,
				"select Check Day Of Month  from drop down list");
		click(AddEmployerPage.getBtn_SaveFinishPayroll(), "Click on save and finish payroll button");
		click(AddEmployerPage.img_EnsoulLogo(), "Click on EnSoul Logo");

	}

}
