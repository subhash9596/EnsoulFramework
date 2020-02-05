package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.ClientRepresentativeSrc;

public class ClientRepresentativeTest extends TestBase {

	// Class object
	ClientRepresentativeSrc cr = new ClientRepresentativeSrc();

	@Test(dataProviderClass = StaticDataProvider.class, dataProvider = "d_CR", priority = 3, retryAnalyzer = Retry.class)
	public void createCR(String[] creatCRData) throws Throwable {
		Reports.test = Reports.extent.createTest("Client Representative");
		try {
			cr.createCR(creatCRData);
		} catch (Exception e) {
			Reports.failTest("Exception in create Client Representative" + e.getMessage());
		}
	}
}