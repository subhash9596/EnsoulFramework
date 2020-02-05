package com.katalyst.ensoul.dataProvider;

import org.testng.annotations.DataProvider;

import com.katalyst.base.TestBase;
import com.katalyst.util.ReadExcel;

public class StaticDataProvider extends TestBase{

	static String excel_path= currentDir+"\\src\\test\\resources\\EnsoulTestData.xlsx";

	@DataProvider(name = "d_login")
	public Object[][] LoginData() throws Exception {
		Object[][] testObjArray = ReadExcel.getCellData(excel_path,"Login");
		return testObjArray;
	}

	@DataProvider(name = "d_RegisterLifeEvent")
	public static Object[][] ReceiptPOData() throws Exception {
		Object[][] testObjArray = ReadExcel.getCellData(excel_path, "RegisterLifeEvent");
		return testObjArray;
	}

	@DataProvider(name = "d_YourCurrentBenefitsData")
	public static Object[][] ReceiptASNData() throws Exception {

		Object[][] testObjArray = ReadExcel.getCellData(excel_path, "YourCurrentBenefitsData");
		return testObjArray;
	}

	@DataProvider(name = "d_AddEmployer")
	public Object[][] AddEmployerData() throws Exception {
		Object[][] testObjArray = ReadExcel.getCellData(excel_path, "AddEmployer");
		return testObjArray;
	}

	@DataProvider(name = "d_CR")
	public static Object[][] CRData() throws Exception{
		Object[][] tesObjArray = ReadExcel.getCellData(excel_path, "CR");
		return tesObjArray;
	}

	@DataProvider(name = "d_EmployerAuthorization")
	public static Object[][] EmployerAuthorizationData() throws Exception{
		Object[][] testObjArray = ReadExcel.getCellData(excel_path, "EmployerAuthorization");
		return testObjArray;
	}

	@DataProvider(name = "d_ManagerUser")
	public static Object[][] ManagerUser() throws Exception{
		Object[][] testObjArray = ReadExcel.getCellData(excel_path, "ManagerUser");
		return testObjArray;
	}
}

