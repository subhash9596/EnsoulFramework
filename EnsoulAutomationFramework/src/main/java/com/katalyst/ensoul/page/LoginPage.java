package com.katalyst.ensoul.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//This class basically have all the locators of login page and getter methods
public class LoginPage {

	@FindBy(xpath = "//*[@id='UserName']")
	private static WebElement txt_loginUserName;

	@FindBy(xpath = "//input[@id='Password']")
	private static WebElement txt_loginPassword;

	@FindBy(xpath = "//button[@id='Login']")
	private static WebElement btn_logIn;

	@FindBy(xpath = "//input[@id='RememberMe']")
	private static WebElement chk_rememberme;

	@FindBy(xpath = "//div[@id='header-navbar-collapse']/div/div[2]/ul/li[3]/a")
	private static WebElement lnk_user_id;

	@FindBy(xpath = "//a[@href='/Account/LogOff']")
	private static WebElement lnk_logout;

	public static WebElement getTxt_loginUserName() {
		return txt_loginUserName;
	}

	public static WebElement getTxt_loginPassword() {
		return txt_loginPassword;
	}

	public static WebElement getBtn_logIn() {
		return btn_logIn;
	}

	public static WebElement getChk_rememberme() {
		return chk_rememberme;
	}

	public static WebElement getLnk_user_id() {
		return lnk_user_id;
	}

	public static WebElement getLnk_logout() {
		return lnk_logout;
	}

	public static WebElement btn_logIn() {
		return btn_logIn;
	}

}
