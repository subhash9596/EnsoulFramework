package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCurrentBenefitsPage {
	@FindBy(xpath = "//h3[@class='text-standard']")
	private static WebElement txt_header;

	@FindBy(xpath = "//a[@id='EmailTo']")
	private static WebElement btn_Email;

	@FindBy(xpath = "//input[@id='email']")
	private static WebElement txt_Emailid;

	@FindBy(xpath = "//span[contains(text(),'Send Email')]")
	private static WebElement btn_SendEmail;

	@FindBy(xpath = "//div[8]//button[1]//span[1]")
	private static WebElement btn_cancel;

	@FindBy(xpath = "//td[contains(text(),'Mail sent successfully.')]")
	private static WebElement msg_Mailsent;

	public static WebElement getMsg_Mailsent() {
		return msg_Mailsent;
	}

	public static WebElement getTxt_Emailid() {
		return txt_Emailid;
	}

	public static WebElement getBtn_SendEmail() {
		return btn_SendEmail;
	}

	public static WebElement getBtn_cancel() {
		return btn_cancel;
	}

	public static WebElement getTxt_header() {
		return txt_header;
	}

	public static WebElement getBtn_Email() {
		return btn_Email;
	}
}
