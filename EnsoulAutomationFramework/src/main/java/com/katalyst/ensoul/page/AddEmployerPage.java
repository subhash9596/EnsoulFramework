package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployerPage {

	//EnSoul Logo
	@FindBy(xpath = "//div[@class='logoText']//a")
	private static WebElement img_EnSoulLogo;

	// Add Employer Icon
	@FindBy(xpath = "//img[@class='employer-add-icon']")
	private static WebElement lnk_AddEmployer;

	// Name
	@FindBy(id = "Name")
	private static WebElement txt_Name;

	// TaxId
	@FindBy(id = "TaxId")
	private static WebElement txt_TaxId;

	// Street 1
	@FindBy(id = "Lane")
	private static WebElement txt_Lane;

	// Street 2
	@FindBy(id = "Street")
	private static WebElement txt_Street;

	// City
	@FindBy(id = "City")
	private static WebElement txt_City;

	// CountryId
	@FindBy(id = "CountryId")
	private static WebElement dd_Opn_CountryId;

	// Employer State Id
	@FindBy(id = "ddlEmployerStateId")
	private static WebElement dd_Opn_EmployerStateId;

	// Zip
	@FindBy(id = "Zip")
	private static WebElement txt_Zip;

	// Country Location
	@FindBy(id = "chkIndia")
	private static WebElement chk_India;

	// Save Next Basic Details
	@FindBy(id = "btnCreate")
	private static WebElement btn_SaveNextBasicDetails;

	// Immigration
	@FindBy(xpath = "//input[@value='1']")
	private static WebElement chk_Immigration;

	// Timesheet
	@FindBy(xpath = "//input[@value='2']")
	private static WebElement chk_Timesheet;

	// Travel Portal
	@FindBy(xpath = "//input[@value='7']")
	private static WebElement chk_TravelPortal;

	// Save & Next Applications
	@FindBy(id = "btnCreate")
	private static WebElement btn_SaveNextApplications;

	// Designation
	@FindBy(id = "RepresentativeDesignation")
	private static WebElement txt_Designation;

	// First Name
	@FindBy(id = "RepresentativeFirstName")
	private static WebElement txt_FirstName;

	// Last Name
	@FindBy(id = "RepresentativeLastName")
	private static WebElement txt_LastName;

	// Street Address 1
	@FindBy(id = "RepresentativeLane")
	private static WebElement txt_StreetAddress1;

	// Street Address 2
	@FindBy(id = "RepresentativeStreet")
	private static WebElement txt_StreetAddress2;

	// Representative City
	@FindBy(id = "RepresentativeCity")
	private static WebElement txt_RepresentativeCity;

	// Country
	@FindBy(id = "RepresentativeCountryId")
	private static WebElement ddl_country;

	// Representative State Id
	@FindBy(id = "RepresentativeStateId")
	private static WebElement dd_Opn_RepresentativeStateId;

	// Representative Zip
	@FindBy(id = "RepresentativeZip")
	private static WebElement txt_RepresentativeZip;

	// Phone
	@FindBy(id = "RepresentativePhone")
	private static WebElement txt_phone;

	// Extension
	@FindBy(id = "RepresentativeExtension")
	private static WebElement txt_ext;

	// Cell number
	@FindBy(id = "RepresentativeCell")
	private static WebElement txt_cell;

	// Email id
	@FindBy(id = "RepresentativeEmail")
	private static WebElement txt_email;

	// Submit button
	@FindBy(id = "btnCreate")
	private static WebElement btn_CR;

	@FindBy(id = "btnSaveNew")
	private static WebElement btn_SaveNew;

	// Cancel button
	@FindBy(id = "btnCancel")
	private static WebElement btn_cancel;

	// Select user radio button
	@FindBy(id = "representativeId")
	private static WebElement txt_rad_RepId;

	// User Id
	@FindBy(id = "UserName")
	private static WebElement txt_UserId;

	// Verify button
	@FindBy(id = "Verify")
	private static WebElement btn_Verify;

	// Reset button
	@FindBy(xpath = "//div[@id='idCreateCredential']/input[@value='Reset']")
	private static WebElement btn_Reset;

	// Create User
	@FindBy(id = "CreateUser")
	private static WebElement btn_CreateUser;

	// Skip & Next
	@FindBy(xpath = "//input[@value='Skip & Next']")
	private static WebElement btn_SkipNext;

	// Show Updated By
	@FindBy(id = "btnSave")
	private static WebElement btn_NextGeneralSetup;

	// Authorize
	@FindBy(xpath = "//input[@value='Authorize']")
	private static WebElement btn_Authorize;

	// Skip & Next Authorization
	@FindBy(xpath = "//input[@value='Skip & Next']")
	private static WebElement btn_SkipNextAuthorization;

	// Save and Finish Report Settings
	@FindBy(id = "btnSave")
	private static WebElement btn_SaveFinishReportSetting;

	// Application Configuration
	@FindBy(id = "idBrokerWelcome")
	private static WebElement lk_ClickHereApplicationConfig;

	// SaveRelabel_Employee HR Lite Setup
	@FindBy(id = "btnSaveRelabel_Employee")
	private static WebElement btn_SaveRelabel_Employee;

	// Drop down items of employee HR Lite Setup
	@FindBy(id = "btnNextTab1")
	private static WebElement btn_NextTab1Emp;

	// Add fields items of employee in HR Lite Setup
	@FindBy(id = "btnNextTab2_Employee")
	private static WebElement btn_NextTab2_Employee;

	// Relabel/display of employment items HR Lite Setup
	@FindBy(id = "btnSaveRelabel_Employment")
	private static WebElement btn_SaveRelabel_Employment;

	// Drop down list of employment items HR Lite Setup
	@FindBy(id = "btnNextTab1")
	private static WebElement btn_NextTab1Employ;

	// Add fields of employment items HR Lite Setup
	@FindBy(id = "btnNextTab2_Employment")
	private static WebElement btn_NextTab2_Employment;

	// Home contact HR Lite Setup
	@FindBy(id = "btnSaveLabels2")
	private static WebElement btn_NextHomeContact;

	// Skip add fields Home contact HR Lite Setup
	@FindBy(id = "btnNextTab2_Home")
	private static WebElement btn_SkipAddFieldsHomeContact;

	// Work contact HR Lite Setup
	@FindBy(id = "btnSaveLabels4")
	private static WebElement btn_NextWorkContact;

	// Skip add permenant field Work contact HR Lite Setup
	@FindBy(id = "btnNextTab2_Perm")
	private static WebElement btn_NextTab2_PermContact;

	// Next work contact HR Lite Setup
	@FindBy(id = "btnSaveLabels6")
	private static WebElement btn_SaveLabels6WorkContact;

	// Save & Finish work contact HR Lite Setup
	@FindBy(id = "btnNextTab2_Work")
	private static WebElement btn_SaveFinishNextTab2_Work;

	// Next dependent info HR Lite Setup
	@FindBy(id = "btnSaveRelabel_Dependent")
	private static WebElement btn_SaveRelabel_Dependent;

	// Next dependent info drop down field HR Lite Setup
	@FindBy(id = "btnNextTab1")
	private static WebElement btn_NextTab1_Dependent;

	// Next dependent info drop down field HR Lite Setup
	@FindBy(id = "btnNextTab2_Dependent")
	private static WebElement btn_NextTab2_Dependent;

	// Next ralabel payroll info drop down field HR Lite Setup
	@FindBy(id = "btnSaveLabels3")
	private static WebElement btn_NextPayroll;

	// Next drop down payroll info drop down field HR Lite Setup
	@FindBy(id = "btnNextTab1")
	private static WebElement btn_NextDpItemsPayroll;

	// Skip add fields payroll info drop down field HR Lite Setup
	@FindBy(id = "btnNextTab2_Payroll")
	private static WebElement btn_SkipAddFieldsPayroll;

	// Monthly payroll checkbox info drop down field HR Lite Setup
	@FindBy(id = "chk4")
	private static WebElement chk_MonthlyPayroll;

	// MonthlyCalendar name
	@FindBy(id = "MonthlyCalendarName")
	private static WebElement txt_MonthlyCalendar;

	// Monthly Period Begin Date
	@FindBy(id = "MonthlyPeriodBeginDate")
	private static WebElement date_MonthlyStartDate;

	// Monthly Period End Date
	@FindBy(id = "MonthlyPeriodEndDate")
	private static WebElement date_MonthlyEndDate;

	// Monthly PeriodBegin Date
	@FindBy(id = "MonthlyCheckDate")
	private static WebElement date_MonthlyCheckDate;

	@FindBy(id = "CheckMonthlyDayofMonth")
	private static WebElement dd_CheckMonthlyDayofMonth;

	// Check Day of month
	@FindBy(xpath = "//input[@value='Save & Finish']")
	private static WebElement btn_SaveFinishPayroll;

	// Check Day of month
	@FindBy(xpath = "//div[@id='idBrokerWelcome']//a[1]")
	private static WebElement AutoLnkBroker;

	public static WebElement getLnk_AddEmployer() {
		return lnk_AddEmployer;
	}

	public static WebElement getTxt_Name() {
		return txt_Name;
	}

	public static WebElement getTxt_TaxId() {
		return txt_TaxId;
	}

	public static WebElement getTxt_Lane() {
		return txt_Lane;
	}

	public static WebElement getTxt_Street() {
		return txt_Street;
	}

	public static WebElement getTxt_City() {
		return txt_City;
	}

	public static WebElement getDd_Opn_CountryId() {
		return dd_Opn_CountryId;
	}

	public static WebElement getDd_Opn_EmployerStateId() {
		return dd_Opn_EmployerStateId;
	}

	public static WebElement getTxt_Zip() {
		return txt_Zip;
	}

	public static WebElement getChk_India() {
		return chk_India;
	}

	public static WebElement getBtn_SaveNextBasicDetails() {
		return btn_SaveNextBasicDetails;
	}

	public static WebElement getChk_Immigration() {
		return chk_Immigration;
	}

	public static WebElement getChk_Timesheet() {
		return chk_Timesheet;
	}

	public static WebElement getChk_TravelPortal() {
		return chk_TravelPortal;
	}

	public static WebElement getBtn_SaveNextApplications() {
		return btn_SaveNextApplications;
	}

	public static WebElement getTxt_Designation() {
		return txt_Designation;
	}

	public static WebElement getTxt_FirstName() {
		return txt_FirstName;
	}

	public static WebElement getTxt_LastName() {
		return txt_LastName;
	}

	public static WebElement getTxt_StreetAddress1() {
		return txt_StreetAddress1;
	}

	public static WebElement getTxt_StreetAddress2() {
		return txt_StreetAddress2;
	}

	public static WebElement getTxt_RepresentativeCity() {
		return txt_RepresentativeCity;
	}

	public static WebElement getDd_Opn_RepresentativeCountryId() {
		return ddl_country;
	}

	public static WebElement getDd_Opn_RepresentativeStateId() {
		return dd_Opn_RepresentativeStateId;
	}

	public static WebElement getTxt_RepresentativeZip() {
		return txt_RepresentativeZip;
	}

	public static WebElement getTxt_phone() {
		return txt_phone;
	}

	public static WebElement getTxt_ext() {
		return txt_ext;
	}

	public static WebElement getTxt_cell() {
		return txt_cell;
	}

	public static WebElement getTxt_email() {
		return txt_email;
	}

	public static WebElement getBtn_CR() {
		return btn_CR;
	}

	public static WebElement getBtn_SaveNew() {
		return btn_SaveNew;
	}

	public static WebElement getBtn_cancel() {
		return btn_cancel;
	}

	public static WebElement getTxt_UserId() {
		return txt_UserId;
	}

	public static WebElement getBtn_Verify() {
		return btn_Verify;
	}

	public static WebElement getBtn_Reset() {
		return btn_Reset;
	}

	public static WebElement getBtn_CreateUser() {
		return btn_CreateUser;
	}

	public static WebElement getBtn_SkipNext() {
		return btn_SkipNext;
	}

	public static WebElement getBtnNextGeneralSetup() {
		return btn_NextGeneralSetup;
	}

	public static WebElement getAuthorize() {
		return btn_Authorize;
	}

	public static WebElement getSkipNextAuthorization() {
		return btn_SkipNextAuthorization;
	}

	public static WebElement getSaveFinishReportSetting() {
		return btn_SaveFinishReportSetting;
	}

	public static WebElement getClickHereApplicationConfig() {
		return lk_ClickHereApplicationConfig;
	}

	public static WebElement getrad_RepId() {
		return txt_rad_RepId;
	}

	public static WebElement getBtnSaveRelabel_Employee() {
		return btn_SaveRelabel_Employee;
	}

	public static WebElement getBtnNextTab1Emp() {
		return btn_NextTab1Emp;
	}

	public static WebElement getBtnNextTab2_Employee() {
		return btn_NextTab2_Employee;
	}

	public static WebElement getBtnSaveRelabel_Employment() {
		return btn_SaveRelabel_Employment;
	}

	public static WebElement getBtnNextTab1Employ() {
		return btn_NextTab1Employ;
	}

	public static WebElement getBtnNextTab2_Employment() {
		return btn_NextTab2_Employment;
	}

	public static WebElement getBtnNextHomeContact() {
		return btn_NextHomeContact;
	}

	public static WebElement getBtnSkipAddFieldsHomeContact() {
		return btn_SkipAddFieldsHomeContact;
	}

	public static WebElement getBtnNextWorkContact() {
		return btn_NextWorkContact;
	}

	public static WebElement getBtnNextTab2_PermContact() {
		return btn_NextTab2_PermContact;
	}

	public static WebElement getBtnSaveLabels6WorkContact() {
		return btn_SaveLabels6WorkContact;
	}

	public static WebElement getBtnSaveFinishNextTab2_Work() {
		return btn_SaveFinishNextTab2_Work;
	}

	public static WebElement getBtnSaveRelabel_Dependent() {
		return btn_SaveRelabel_Dependent;
	}

	public static WebElement getBtnNextTab1_Dependent() {
		return btn_NextTab1_Dependent;
	}

	public static WebElement getBtnNextTab2_Dependent() {
		return btn_NextTab2_Dependent;
	}

	public static WebElement getBtnNextPayroll() {
		return btn_NextPayroll;
	}

	public static WebElement getBtnNextDpItemsPayroll() {
		return btn_NextDpItemsPayroll;
	}

	public static WebElement getBtnSkipAddFieldsPayroll() {
		return btn_SkipAddFieldsPayroll;
	}

	public static WebElement getchk_MonthlyPayroll() {
		return chk_MonthlyPayroll;
	}

	public static WebElement getTxt_MonthlyCalendar() {
		return txt_MonthlyCalendar;
	}

	public static WebElement getDate_MonthlyStartDate() {
		return date_MonthlyStartDate;
	}

	public static WebElement getDate_MonthlyEndDate() {
		return date_MonthlyEndDate;
	}

	public static WebElement getDate_MonthlyCheckDate() {
		return date_MonthlyCheckDate;
	}

	public static WebElement getDd_CheckMonthlyDayofMonth() {
		return dd_CheckMonthlyDayofMonth;
	}

	public static WebElement getBtn_SaveFinishPayroll() {
		return btn_SaveFinishPayroll;
	}

	public static WebElement getlnk_AutoBroker() {
		return AutoLnkBroker;				
	}

	public static WebElement img_EnsoulLogo() {
		return img_EnSoulLogo;
	}
}
