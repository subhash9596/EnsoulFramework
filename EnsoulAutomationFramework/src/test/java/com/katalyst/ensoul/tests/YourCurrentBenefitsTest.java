package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.YourCurrentBenefitsSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class YourCurrentBenefitsTest extends TestBase {

	// Class Object
	YourCurrentBenefitsSrc YourCurrentBenefits = new YourCurrentBenefitsSrc();

	@Test(priority = 1, dataProviderClass = StaticDataProvider.class, dataProvider = "d_YourCurrentBenefitsData", retryAnalyzer = Retry.class)
	public void ClickonYourCurrentBenefits(String YourCurrentBenefitsData[]) throws Exception {
		Reports.test = Reports.extent.createTest("View Your Current Benefits");
		try {
			YourCurrentBenefits.ClicktoYourCurrentBenefits();
			YourCurrentBenefits.ViewYourCurrentBenefits(YourCurrentBenefitsData);
			YourCurrentBenefits.VerifyMessage(YourCurrentBenefitsData);

		} catch (Exception e) {
			Reports.failTest("Error in the AView Your Current Benefits" + e.getMessage());
		}
	}

}
