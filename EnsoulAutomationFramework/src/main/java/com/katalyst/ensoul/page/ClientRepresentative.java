package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientRepresentative {

	// Client Representative link click
	@FindBy(xpath = "//div[contains(text(),'At')]")
	private static WebElement lnk_cr;

	// Add CR
	@FindBy(xpath = "//a[@href='/ClientRepresentative/CRCreate']")
	private static WebElement lnk_addCr;

	// Designation
	@FindBy(xpath = "//input[@id='RepresentativeDesignation']")
	private static WebElement txt_designation;

	// first name
	@FindBy(xpath = "//input[@id='RepresentativeFirstName']")
	private static WebElement txt_fname;

	// Last name
	@FindBy(xpath = "//input[@id='RepresentativeLastName']")
	private static WebElement txt_lname;

	// Street address 1
	@FindBy(xpath = "//input[@id='RepresentativeLane']")
	private static WebElement txt_streetadd1;

	// Street address 2
	@FindBy(xpath = "//input[@id='RepresentativeStreet']")
	private static WebElement txt_streetadd2;

	// City
	@FindBy(xpath = "//input[@id='RepresentativeCity']")
	private static WebElement txt_city;

	// Country
	@FindBy(xpath = "//select[@id='RepresentativeCountryId']")
	private static WebElement ddl_country;

	// state
	@FindBy(xpath = "//select[@id='RepresentativeStateId']")
	private static WebElement ddl_state;

	// ZIP
	@FindBy(xpath = "//input[@id='RepresentativeZip']")
	private static WebElement txt_zip;

	// Phone
	@FindBy(xpath = "//input[@id='RepresentativePhone']")
	private static WebElement txt_phone;

	// Extension
	@FindBy(xpath = "//input[@id='RepresentativeExtension']")
	private static WebElement txt_ext;

	// Cell number
	@FindBy(xpath = "//input[@id='RepresentativeCell']")
	private static WebElement txt_cell;

	// Email id
	@FindBy(xpath = "//input[@id='RepresentativeEmail']")
	private static WebElement txt_email;

	// Submit button
	@FindBy(xpath = "//input[@id='btnCreate']")
	private static WebElement btn_submit;

	// Cancel button
	@FindBy(xpath = "//input[@id='btnCancel']")
	private static WebElement btn_cancel;

	// Confirmation message
	@FindBy(xpath = "//td[contains(text(),'Client Representative information has been added s')]")
	private static WebElement msg_Confirm;

	public static WebElement getLnk_cr() {
		return lnk_cr;
	}

	public static WebElement getLnk_addCr() {
		return lnk_addCr;
	}

	public static WebElement getTxt_designation() {
		return txt_designation;
	}

	public static WebElement getTxt_fname() {
		return txt_fname;
	}

	public static WebElement getTxt_lname() {
		return txt_lname;
	}

	public static WebElement getTxt_streetadd1() {
		return txt_streetadd1;
	}

	public static WebElement getTxt_streetadd2() {
		return txt_streetadd2;
	}

	public static WebElement getTxt_city() {
		return txt_city;
	}

	public static WebElement getDdl_country() {
		return ddl_country;
	}

	public static WebElement getDdl_state() {
		return ddl_state;
	}

	public static WebElement getTxt_zip() {
		return txt_zip;
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

	public static WebElement getBtn_submit() {
		return btn_submit;
	}

	public static WebElement getBtn_cancel() {
		return btn_cancel;
	}

	public static WebElement getMsg_Confirm() {
		return msg_Confirm;
	}

}
