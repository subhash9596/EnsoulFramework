package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.testHarness.EmployeeDashboardSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class EmployeeDashboardTest extends TestBase {
	EmployeeDashboardSrc EmpDashboard = new EmployeeDashboardSrc();

	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void ClickToBenefits() throws Exception {
		Reports.test = Reports.extent.createTest("ClickToBenefits");
		try {
			EmpDashboard.clickToBenefits();
		} catch (Exception e) {
			Reports.failTest("Error while clicking on the Benefits icon" + e.getMessage());
			e.printStackTrace();
		}

	}
}
