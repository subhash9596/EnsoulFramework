package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeDashboard {

	@FindBy(xpath = "//i[@class='icon-benefits']")
	private static WebElement lnk_benifits;

	@FindBy(xpath = "//p[contains(text(),'Enroll With Benefits')]")
	private static WebElement lnk_EnrollWithBenefits;

	@FindBy(xpath = "//p[contains(text(),'Register Life Event')]")
	private static WebElement lnk_RegisterLifeEvent;

	@FindBy(xpath = "//p[contains(text(),'Your Current Benefits')]")
	private static WebElement lnk_YourCurrentBenefits;
	@FindBy(xpath = "//div[@class='main-logo']//a//img")
	private static WebElement img_logo;

	@FindBy(xpath = "//a[contains(@class,'class93')]")
	private static WebElement lnk_dashboard;

	public static WebElement getLnk_dashboard() {
		return lnk_dashboard;
	}

	public static WebElement getImg_logo() {
		return img_logo;
	}

	public static WebElement getLnk_benifits() {
		return lnk_benifits;
	}

	public static WebElement getLnk_EnrollWithBenefits() {
		return lnk_EnrollWithBenefits;
	}

	public static WebElement getLnk_RegisterLifeEvent() {
		return lnk_RegisterLifeEvent;
	}

	public static WebElement getLnk_YourCurrentBenefits() {
		return lnk_YourCurrentBenefits;
	}
}
