package com.katalyst.ensoul.testHarness;

import org.openqa.selenium.support.PageFactory;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.EmployeeDashboard;
import com.katalyst.ensoul.page.LoginPage;

public class EmployeeDashboardSrc extends TestBase {

	public void clickToBenefits() throws Exception {
		PageFactory.initElements(driver, EmployeeDashboard.class);

		waitForElement(EmployeeDashboard.getLnk_benifits(), 20);
		click(EmployeeDashboard.getLnk_benifits(), "Clicked on the Benefits Icon");
		waitForElement(EmployeeDashboard.getLnk_benifits(), 20);
		getText(EmployeeDashboard.getLnk_benifits(), "Get text of benefits icon");
	}
}
