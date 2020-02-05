package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrollWithBenefitsPage {
	@FindBy(xpath = "//ul[@id='main-nav']//li//a")
	private static WebElement lnk_close;

	public static WebElement getLnk_close() {
		return lnk_close;
	}
}
