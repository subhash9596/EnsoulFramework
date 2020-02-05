package com.katalyst.ensoul.testHarness;

import org.openqa.selenium.support.PageFactory;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.EmployeeDashboard;
import com.katalyst.ensoul.page.LoginPage;
import com.katalyst.ensoul.page.RegisterLifeEvent;

public class RegisterLifeEventSrc extends TestBase {

	private static final String[] RegisterLifeEventData = null;

	public void ClickOnRegisterLifeEvent() throws Exception {

		PageFactory.initElements(driver, EmployeeDashboard.class);

		isDisplayed(EmployeeDashboard.getLnk_RegisterLifeEvent());
		waitForElement(EmployeeDashboard.getLnk_RegisterLifeEvent(), 20);
		click(EmployeeDashboard.getLnk_RegisterLifeEvent(), "Clicked on the Register life event");

	}

	public void AddLifeEvent(String RegisterLifeEventData[]) throws Exception {
		PageFactory.initElements(driver, RegisterLifeEvent.class);

		// Test Data
		String LifeeventDdOpn = RegisterLifeEventData[0];
		String OccuredOnDate = RegisterLifeEventData[1];
		String EffectiveDate = RegisterLifeEventData[2];

		waitForElement(RegisterLifeEvent.getBtn_Add(), 20);
		click(RegisterLifeEvent.getBtn_Add(), "Clicked on the Add button to register life event");
		waitForElement(RegisterLifeEvent.getTxt_header(), 10);
		click(RegisterLifeEvent.getDd_LifeEvents(), "Clicked on the life event dd");
		waitForElement(RegisterLifeEvent.getDd_LifeEvents(), 10);
		selectByVisibleText(RegisterLifeEvent.getDd_LifeEvents(), LifeeventDdOpn, "Entered the ");
		waitForElement(RegisterLifeEvent.getDate_OccuredOnDate(), 10);
		sendKeys(RegisterLifeEvent.getDate_OccuredOnDate(), OccuredOnDate, "Entered the Occured on date");
		waitForElement(RegisterLifeEvent.getDate_EffectiveDate(), 10);
		sendKeys(RegisterLifeEvent.getDate_EffectiveDate(), EffectiveDate, "entered Effective Date");
		waitForElement(RegisterLifeEvent.getBtn_submitLifeevent(), 10);
		click(RegisterLifeEvent.getBtn_submitLifeevent(), "Clicked on the submit button");
	}
}
