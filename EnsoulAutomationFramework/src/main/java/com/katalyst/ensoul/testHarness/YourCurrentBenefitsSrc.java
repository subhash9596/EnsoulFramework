package com.katalyst.ensoul.testHarness;

import org.openqa.selenium.support.PageFactory;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.EmployeeDashboard;
import com.katalyst.ensoul.page.LoginPage;
import com.katalyst.ensoul.page.YourCurrentBenefitsPage;

public class YourCurrentBenefitsSrc extends TestBase {

	public void ClicktoYourCurrentBenefits() throws Exception {
		PageFactory.initElements(driver, EmployeeDashboard.class);
		waitForElement(EmployeeDashboard.getImg_logo(), 20);
		click(EmployeeDashboard.getLnk_dashboard(), "Clicked on the Dashborad link");
		waitForElement(EmployeeDashboard.getLnk_benifits(), 20);
		click(EmployeeDashboard.getLnk_benifits(), "Clicked on the benefits");
		waitForElement(EmployeeDashboard.getLnk_YourCurrentBenefits(), 20);
		click(EmployeeDashboard.getLnk_YourCurrentBenefits(), "Clicked on the Your current benefits");
	}

	public void ViewYourCurrentBenefits(String[] YourCurrentBenefitsData) throws Exception {
		PageFactory.initElements(driver, YourCurrentBenefitsPage.class);

		// Test Data
		String EmailAddress = YourCurrentBenefitsData[0];

		waitForElement(YourCurrentBenefitsPage.getBtn_Email(), 20);
		click(YourCurrentBenefitsPage.getBtn_Email(), "Clicked on the Email button");
		clear(YourCurrentBenefitsPage.getTxt_Emailid(), "Cleared the email address field");
		waitForElement(YourCurrentBenefitsPage.getTxt_Emailid(), 20);
		sendKeys(YourCurrentBenefitsPage.getTxt_Emailid(), EmailAddress, "Entered Email Address");
		waitForElement(YourCurrentBenefitsPage.getBtn_SendEmail(), 20);
		click(YourCurrentBenefitsPage.getBtn_SendEmail(), "Clicked on the SendEmail button");
	}

	public void VerifyMessage(String[] YourCurrentBenefitsData) throws Exception {
		// Test Data
		String ExpectedMsg = YourCurrentBenefitsData[1];

		click(YourCurrentBenefitsPage.getMsg_Mailsent(), "Clicked on the successful message ");
		isTextPresent(YourCurrentBenefitsPage.getMsg_Mailsent(), ExpectedMsg,
				"Method called to verify the successful message");
	}

}