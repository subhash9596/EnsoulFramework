package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;
import com.katalyst.base.TestBase;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.ManageUserSrc;

public class ManageUserTest extends TestBase {

	// Class object
	ManageUserSrc mu = new ManageUserSrc();

	@Test(dataProviderClass = StaticDataProvider.class, dataProvider = "d_ManagerUser", priority = 4, retryAnalyzer = Retry.class)
	public void ManageUser(String[] creatMUData) throws Throwable {
		Reports.test = Reports.extent.createTest("Manage User");
		try {
			mu.ManageUser(creatMUData);
		} catch (Exception e) {
			Reports.failTest("Exception in Manage User" + e.getMessage());
		}
	}
}