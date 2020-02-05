package com.katalyst.ensoul.testHarness;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.SetAuthorization;

public class SetAuthorizationSrc extends TestBase {

	public static HashMap<String, String> sa_map = new HashMap<>();

	public void SetAuthorization(String[] SAUserData) throws Throwable {
		PageFactory.initElements(driver, SetAuthorization.class);

		click(SetAuthorization.getLnk_Sa(), "Clicked on Set Authorization");

		String representative = SAUserData[0];
		String moduleValues = SAUserData[1];
		String[] modules = moduleValues.split(",");

		
		// Select Employer Representatives
		WebElement Emplist = driver.findElement(By.xpath(
				"//table[@class='GridView']//table//tr[last()]//td[contains(.,'" + representative + "')]//input"));
		click(Emplist, "Checked emp list");

		// Select HR Modules
		for (String i : modules) {
			WebElement Modulelist = driver.findElement(
					By.xpath("//table[@class='GridView']//table//tbody//tr//td[contains(.,'" + i + "')]//input"));
			click(Modulelist, "Checked emp list");
		}

		// Select Applications
		List<WebElement> applist = driver
				.findElements(By.xpath("//table[@class='GridView']//td[contains(.,'CMC')]//input"));

		for (int j = 0; j < applist.size(); j++) {
			applist.get(j).click();
		}

		// Select Benefit
		List<WebElement> benifitlist = driver.findElements(By.xpath("//*[@id=\"BenefitEligibilityClassLevelId\"]"));

		for (int j = 0; j < benifitlist.size(); j++) {
			benifitlist.get(j).click();
		}

		// Select Employment Classification
		List<WebElement> employmentlist = driver.findElements(By.xpath("//*[@id=\"EmploymentClassificationId\"]"));

		for (int j = 0; j < employmentlist.size(); j++) {
			employmentlist.get(j).click();
		}

		// Select Location
		List<WebElement> locationlist = driver.findElements(By.xpath("//*[@id=\"VacationEmployerLocationId\"]"));

		for (int j = 0; j < locationlist.size(); j++) {
			locationlist.get(j).click();
		}

		click(SetAuthorization.getBtn_Authorize(), "Authorization Done");

	}

}
