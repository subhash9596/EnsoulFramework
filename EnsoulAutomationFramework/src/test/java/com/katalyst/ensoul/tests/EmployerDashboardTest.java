package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;
import com.katalyst.base.TestBase;
import com.katalyst.ensoul.testHarness.EmployerDashboardSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class EmployerDashboardTest extends TestBase {
	EmployerDashboardSrc EmprDashboard = new EmployerDashboardSrc();

	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void ClickToBenefits() throws Exception {
		Reports.test = Reports.extent.createTest("Employer Dashboard");
		try {
			EmprDashboard.clickToDashboard();
		} catch (Exception e) {
			Reports.failTest("Error in Employer Dashboard" + e.getMessage());

		}

	}
}
