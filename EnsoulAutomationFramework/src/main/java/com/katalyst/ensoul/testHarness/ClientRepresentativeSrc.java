package com.katalyst.ensoul.testHarness;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.ClientRepresentative;

public class ClientRepresentativeSrc extends TestBase {

	public static HashMap<String, String> cr_map = new HashMap<>();

	public void createCR(String[] creatCRData) throws Throwable {
		PageFactory.initElements(driver, ClientRepresentative.class);

		// Test Data
		String Designation = creatCRData[0];
		String FName = creatCRData[1];
		String LName = creatCRData[2];
		String Address1 = creatCRData[3];
		String Address2 = creatCRData[4];
		String City = creatCRData[5];
		String Country = creatCRData[6];
		String State = creatCRData[7];
		String Zip = creatCRData[8];
		String Phone = creatCRData[9];
		String Extension = creatCRData[10];
		String Cell = creatCRData[11];
		String Email = creatCRData[12];

		click(ClientRepresentative.getLnk_cr(), "Clicked on CR");
		click(ClientRepresentative.getLnk_addCr(), "Clicked Add CR");
		click(ClientRepresentative.getBtn_submit(), "Clicked on Submit Button");
		sendKeys(ClientRepresentative.getTxt_designation(), Designation, "Designation");
		sendKeys(ClientRepresentative.getTxt_fname(), FName, "First Name");
		sendKeys(ClientRepresentative.getTxt_lname(), LName, "Last Name");
		sendKeys(ClientRepresentative.getTxt_streetadd1(), Address1, "Street Address 1");
		sendKeys(ClientRepresentative.getTxt_streetadd2(), Address2, "Street Address 2");
		sendKeys(ClientRepresentative.getTxt_city(), City, "City");
		selectByVisibleText(ClientRepresentative.getDdl_country(), Country, "select Country");
		selectByVisibleText(ClientRepresentative.getDdl_state(), State, "select State");
		sendKeys(ClientRepresentative.getTxt_zip(), Zip, "Zip");
		sendKeys(ClientRepresentative.getTxt_phone(), Phone, "Phone");
		sendKeys(ClientRepresentative.getTxt_ext(), Extension, "Extension");
		sendKeys(ClientRepresentative.getTxt_cell(), Cell, "Cell");
		sendKeys(ClientRepresentative.getTxt_email(), Email, "Email");
		waitForElement(ClientRepresentative.getBtn_submit(), 10);
		click(ClientRepresentative.getBtn_submit(), "Click on save button for Client Representative");
		waitForElement(ClientRepresentative.getMsg_Confirm(), 10);

	}

}
