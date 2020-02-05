package com.katalyst.ensoul.testHarness;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.ManageUser;

public class ManageUserSrc extends TestBase {

	public static HashMap<String, String> mu_map = new HashMap<>();

	public void ManageUser(String[] MUserData) throws Throwable {
		PageFactory.initElements(driver, ManageUser.class);

		click(ManageUser.getLnk_ManageUser(), "Clicked on getLnk_ManageUser");

		String UserId = MUserData[0];
		String Password = MUserData[1];
		String Selectcase = MUserData[2];

		if (Selectcase.equals("Custome")) {
			WebElement CustomLnk = driver.findElement(By
					.xpath("//td[contains(text(),'" + UserId + "')]//following-sibling::td//a[contains(.,'Custom')]"));
			click(CustomLnk, "Click on Custom link");
			sendKeys(ManageUser.getTxt_NewPassword(), Password, "New Password");
			sendKeys(ManageUser.getTxt_RetypePassword(), Password, "Retype Password");
			waitForElement(ManageUser.getBtn_Change(), 10);
			click(ManageUser.getBtn_Change(), "Click on save button for Client Representative");
		}

		if (Selectcase.equals("Auto")) {
			WebElement AutoLnk = driver.findElement(
					By.xpath("//td[contains(text(),'" + UserId + "')]//following-sibling::td//a[contains(.,'Auto')]"));
			click(AutoLnk, "Click on Auto link");
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
		}

		if (Selectcase.equals("Resend")) {
			WebElement ResendLnk = driver.findElement(By.xpath("//td[contains(text(),'" + UserId
					+ "')]//preceding-sibling::td//img[@class='mailIcon'][contains(@style,'transparent')]"));
			if (ResendLnk.isDisplayed() != true) {
				click(ResendLnk, "Click on Resend link");
			} else
				System.out.println("Link is disable");
		}

	}

}
