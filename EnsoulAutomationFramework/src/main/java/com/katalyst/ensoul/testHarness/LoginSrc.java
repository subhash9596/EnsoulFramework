package com.katalyst.ensoul.testHarness;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.LoginPage;
import com.katalyst.util.PropertyManager;

public class LoginSrc extends TestBase {
	public static String suite = PropertyManager.getInstance().getSuite();

	public void LoginToApplication(String loginData[]) throws Exception {
		PageFactory.initElements(driver, LoginPage.class);
		String userName = null;
		String password = null;

		if (suite.equalsIgnoreCase("SmokeTest") == true) {
			userName = loginData[0];
			password = loginData[1];
		} else {
			userName = loginData[2];
			password = loginData[3];
		}
		waitForElement(LoginPage.getTxt_loginUserName(), 20);
		sendKeys(LoginPage.getTxt_loginUserName(), userName,"Enter Username");
		waitForElement(LoginPage.getTxt_loginPassword(), 20);
		sendKeys(LoginPage.getTxt_loginPassword(), password,"Enter Password ");
		// click(LoginPage.getChk_rememberme(), "clicked on the Remember me");
		waitForElement(LoginPage.getBtn_logIn(), 20);
		click(LoginPage.getBtn_logIn(), "Clicked on login button");
	}

}
