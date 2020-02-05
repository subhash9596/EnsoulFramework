package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;
import com.katalyst.base.TestBase;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.SetAuthorizationSrc;

public class SetAuthorizationTest extends TestBase {

	// Class object
	SetAuthorizationSrc sa = new SetAuthorizationSrc();

	@Test(dataProviderClass = StaticDataProvider.class, dataProvider = "d_EmployerAuthorization", priority = 5, retryAnalyzer = Retry.class)
	public void ManageUser(String[] creatSAData) throws Throwable {
		Reports.test = Reports.extent.createTest("Set Authorization");
		try {
			sa.SetAuthorization(creatSAData);
		} catch (Exception e) {
			System.out.println(e);
			Reports.failTest("Exception in Set Authorization" + e.getMessage());
		}
	}
}