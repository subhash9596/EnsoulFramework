package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.testHarness.EnrollWithBenefitsSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class EnrollWithBenefitsTest extends TestBase {

	EnrollWithBenefitsSrc EnrollWithBenefits = new EnrollWithBenefitsSrc();

	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void ClicktoEnrollWithBenefits() throws Exception {
		Reports.test = Reports.extent.createTest("Enroll With Benefits");
		try {
			EnrollWithBenefits.ClickOnEnrollWithBenefits();
		} catch (Exception e) {
			Reports.failTest("Error while clicking of the Enroll With Benefits" + e.getMessage());
		}
	}
}
