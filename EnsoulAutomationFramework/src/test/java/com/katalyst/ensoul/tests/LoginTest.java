package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.LoginSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class LoginTest extends TestBase {

	// Class objects
	LoginSrc login = new LoginSrc();

	@Test(priority = 1, dataProviderClass = StaticDataProvider.class, dataProvider = "d_login", retryAnalyzer = Retry.class)
	public void LoginToApplication(String LoginData[]) throws Exception {
		Reports.test = Reports.extent.createTest("login To Application");
		try {
			login.LoginToApplication(LoginData);
		} catch (Exception e) {
			Reports.failTest("Error in the login to the application" + e.getMessage());
		}
	}
}
