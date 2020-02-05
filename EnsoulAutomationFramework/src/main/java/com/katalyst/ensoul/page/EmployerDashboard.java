package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployerDashboard {

	// Dashboard link click

	@FindBy(xpath = "//a[@title='CA Technologies Dashboard']")
	private static WebElement lnk_dashboard;

	// Employer Management link click

	@FindBy(xpath = "//a[@title='Employer Management']")
	private static WebElement lnk_employer;

	// Client Representative link click

	@FindBy(xpath = "//li[4]/center[1]/div[@class='prefix' and 1]")
	private static WebElement lnk_cr;

	// Set Authorization link click

	@FindBy(xpath = "//li[8]/center[1]/div[@class='prefix' and 1]")
	private static WebElement lnk_setauth;

	// Manage User link click

	@FindBy(xpath = "//li[9]/center[1]/div[@class='prefix' and 1]")
	private static WebElement lnk_manageuser;

	public static WebElement getLnk_dashboard() {
		return lnk_dashboard;
	}

	public static WebElement getLnk_Employer() {
		return lnk_employer;
	}

	public static WebElement getLnk_CustRep() {
		return lnk_cr;
	}

	public static WebElement getLnk_SetAuth() {
		return lnk_setauth;
	}

	public static WebElement getLnk_ManageUser() {
		return lnk_manageuser;
	}
}
