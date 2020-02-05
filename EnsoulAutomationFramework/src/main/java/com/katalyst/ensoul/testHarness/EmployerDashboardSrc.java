package com.katalyst.ensoul.testHarness;

import org.openqa.selenium.support.PageFactory;
import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.EmployerDashboard;

public class EmployerDashboardSrc extends TestBase {

	public void clickToDashboard() throws Exception {
		PageFactory.initElements(driver, EmployerDashboard.class);

		waitForElement(EmployerDashboard.getLnk_dashboard(), 5);
		click(EmployerDashboard.getLnk_dashboard(), "Clicked on the Employer Dashboard ");
		waitForElement(EmployerDashboard.getLnk_Employer(), 5);
		click(EmployerDashboard.getLnk_Employer(), "Get text of Employer Icon ");
	}
}