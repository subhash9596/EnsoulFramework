package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.AddEmployerSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class AddEmployerTest extends TestBase {

	// Class Object
	AddEmployerSrc ae = new AddEmployerSrc();

	// @Test( priority=1,retryAnalyzer = Retry.class)

	@Test(dataProviderClass = StaticDataProvider.class, dataProvider = "d_AddEmployer", priority = 3, retryAnalyzer = Retry.class)
	public void addEmployer(String[] createEmployerTestData) throws Throwable {
		Reports.test = Reports.extent.createTest("addEmployer");
		try {
			ae.createEmployer(createEmployerTestData);
		} catch (Exception e) {
			Reports.failTest("Error while clicking on the Add Employer icon" + e.getMessage());
			e.printStackTrace();
		}

	}

}
