package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageUser {

	// Client Representative link click
	@FindBy(xpath = "//div[contains(text(),'Ur')]")
	private static WebElement lnk_manageUser;

	// New Password
	@FindBy(id = "idnewPassword")
	private static WebElement txt_newPassword;

	// Confirm Password
	@FindBy(id = "retypePassword")
	private static WebElement txt_retypePassword;

	@FindBy(xpath = "//span[@class='ui-button-text'][contains(text(),'Change')]")
	private static WebElement btn_change;

	public static WebElement getLnk_ManageUser() {
		return lnk_manageUser;
	}

	public static WebElement getTxt_NewPassword() {
		return txt_newPassword;
	}

	public static WebElement getTxt_RetypePassword() {
		return txt_retypePassword;
	}

	public static WebElement getBtn_Change() {
		return btn_change;
	}

}
