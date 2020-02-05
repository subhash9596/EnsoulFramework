package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLifeEvent {

	@FindBy(xpath = "//a[@class='btn btn-save']")
	private static WebElement btn_Add;

	@FindBy(xpath = "//h3[@class='text-standard']")
	private static WebElement txt_header;

	@FindBy(xpath = "//select[@id='LifeEvents']")
	private static WebElement dd_LifeEvents;

	@FindBy(xpath = "//select[@id='LifeEvents']/" + "option[contains(text(),'Birth of a child or adoption')]")
	private static WebElement dd_Opn_Birthofachild;

	@FindBy(xpath = "//option[contains(text(),'Change in employment')]")
	private static WebElement dd_Opn_Changeinemployment;

	@FindBy(xpath = "//option[contains(text(),'Court ordered dependent coverage')]")
	private static WebElement dd_Opn_dependentCoverage;

	@FindBy(xpath = "//option[contains(text(),'Death of dependent')]")
	private static WebElement dd_Opn_DeathOfDependent;

	@FindBy(xpath = "//option[contains(text(),'Dependent loss of eligibility')]")
	private static WebElement dd_Opn_lossofeligibility;

	@FindBy(xpath = "//option[contains(text(),'Divorce-Annulment')]")
	private static WebElement dd_Opn_Divorce;

	@FindBy(xpath = "//option[contains(text(),'Marriage')]")
	private static WebElement dd_Opn_Marriage;

	@FindBy(xpath = "//option[contains(text(),'Spouse change in employment')]")
	private static WebElement dd_Opn_Spousechangeinemployment;

	@FindBy(xpath = "//option[contains(text(),'Dissolution of domestic partnership')]")
	private static WebElement dd_Opn_Dissolution;

	@FindBy(xpath = "//option[contains(text(),'Dissolution of civil union')]")
	private static WebElement dd_Opn_Dissolutioncivil;

	@FindBy(xpath = "//option[contains(text(),'Civil Union')]")
	private static WebElement dd_Opn_CivilUnion;

	@FindBy(xpath = "//option[contains(text(),\"Change in spouse's plan options/pricing\")]\r\n" + "	")
	private static WebElement dd_Opn_Changespousplan;

	@FindBy(xpath = "//input[@id='OccuredOnDate']")
	private static WebElement date_OccuredOnDate;

	@FindBy(xpath = "//input[@id='EffectiveDate']")
	private static WebElement date_EffectiveDate;

	@FindBy(xpath = "//input[@id='file1']")
	private static WebElement btn_document;

	@FindBy(xpath = "//input[@id='AddOne']")
	private static WebElement btn_AddDoc;

	@FindBy(xpath = "//input[@id='btnCreate']")
	private static WebElement btn_submitLifeevent;

	@FindBy(xpath = "//input[@id='btnCancel']")
	private static WebElement btn_CancelLifeevent;

	public static WebElement getBtn_Add() {
		return btn_Add;
	}

	public static WebElement getTxt_header() {
		return txt_header;
	}

	public static WebElement getDd_LifeEvents() {
		return dd_LifeEvents;
	}

	public static WebElement getDd_Opn_Birthofachild() {
		return dd_Opn_Birthofachild;
	}

	public static WebElement getDd_Opn_Changeinemployment() {
		return dd_Opn_Changeinemployment;
	}

	public static WebElement getDd_Opn_dependentCoverage() {
		return dd_Opn_dependentCoverage;
	}

	public static WebElement getDd_Opn_DeathOfDependent() {
		return dd_Opn_DeathOfDependent;
	}

	public static WebElement getDd_Opn_lossofeligibility() {
		return dd_Opn_lossofeligibility;
	}

	public static WebElement getDd_Opn_Divorce() {
		return dd_Opn_Divorce;
	}

	public static WebElement getDd_Opn_Marriage() {
		return dd_Opn_Marriage;
	}

	public static WebElement getDd_Opn_Spousechangeinemployment() {
		return dd_Opn_Spousechangeinemployment;
	}

	public static WebElement getDd_Opn_Dissolution() {
		return dd_Opn_Dissolution;
	}

	public static WebElement getDd_Opn_Dissolutioncivil() {
		return dd_Opn_Dissolutioncivil;
	}

	public static WebElement getDd_Opn_CivilUnion() {
		return dd_Opn_CivilUnion;
	}

	public static WebElement getDd_Opn_Changespousplan() {
		return dd_Opn_Changespousplan;
	}

	public static WebElement getDate_OccuredOnDate() {
		return date_OccuredOnDate;
	}

	public static WebElement getDate_EffectiveDate() {
		return date_EffectiveDate;
	}

	public static WebElement getBtn_document() {
		return btn_document;
	}

	public static WebElement getBtn_AddDoc() {
		return btn_AddDoc;
	}

	public static WebElement getBtn_submitLifeevent() {
		return btn_submitLifeevent;
	}

	public static WebElement getBtn_CancelLifeevent() {
		return btn_CancelLifeevent;
	}
}
