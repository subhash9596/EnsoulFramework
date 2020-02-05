package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetAuthorization {

	// Set Authorization link click
	@FindBy(xpath = "//div[contains(text(),'At')]")
	private static WebElement lnk_sa;

	// Authorize button
	@FindBy(xpath = "//div[@id='idAuthorization']//input[@name='SubmitButton']")
	private static WebElement btn_authorize;

	public static WebElement getLnk_Sa() {
		return lnk_sa;
	}

	public static WebElement getBtn_Authorize() {
		return btn_authorize;
	}

}
