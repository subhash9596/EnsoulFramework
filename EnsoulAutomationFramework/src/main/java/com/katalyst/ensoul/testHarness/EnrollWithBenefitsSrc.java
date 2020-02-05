package com.katalyst.ensoul.testHarness;

import org.openqa.selenium.support.PageFactory;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.EmployeeDashboard;
import com.katalyst.ensoul.page.EnrollWithBenefitsPage;

public class EnrollWithBenefitsSrc extends TestBase {

	public void ClickOnEnrollWithBenefits() throws Exception {
		PageFactory.initElements(driver, EnrollWithBenefitsPage.class);
		PageFactory.initElements(driver, EmployeeDashboard.class);

		waitForElement(EmployeeDashboard.getImg_logo(), 20);
		click(EmployeeDashboard.getImg_logo(), "Clicked on the katalyst logo");
		waitForElement(EmployeeDashboard.getLnk_benifits(), 20);
		click(EmployeeDashboard.getLnk_benifits(), "Clicked on the benefits");
		click(EmployeeDashboard.getLnk_EnrollWithBenefits(), "Clicked on the Enroll With Benefits");
		waitForElement(EmployeeDashboard.getLnk_EnrollWithBenefits(), 20);
		waitForElement(EnrollWithBenefitsPage.getLnk_close(), 30);
		switchTonewWndow(EnrollWithBenefitsPage.getLnk_close(), "Moved to Page Enroll with benefits");
		waitForElement(EnrollWithBenefitsPage.getLnk_close(), 30);
		click(EnrollWithBenefitsPage.getLnk_close(), "Clicked on the close Icon");
	}

}
