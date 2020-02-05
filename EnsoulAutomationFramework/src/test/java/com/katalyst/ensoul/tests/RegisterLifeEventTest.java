package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.RegisterLifeEventSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class RegisterLifeEventTest extends TestBase {

	RegisterLifeEventSrc RegisterLifeEvent = new RegisterLifeEventSrc();

	@Test(priority = 1, dataProviderClass = StaticDataProvider.class, dataProvider = "d_RegisterLifeEvent", retryAnalyzer = Retry.class)
	public void AddRegisterLifeEvent(String RegisterLifeEventData[]) throws Exception {
		Reports.test = Reports.extent.createTest("Add Register Life Event");
		try {
			RegisterLifeEvent.ClickOnRegisterLifeEvent();
			RegisterLifeEvent.AddLifeEvent(RegisterLifeEventData);

		} catch (Exception e) {
			Reports.failTest("Error in the Add RegisterLifeEvent" + e.getMessage());
		}
	}
}
