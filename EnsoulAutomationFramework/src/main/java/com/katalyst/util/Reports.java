package com.katalyst.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.katalyst.base.TestBase;

public class Reports extends TestBase{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static String reportPath = currentDir + "\\Reports\\" + timeStamp +"_EnsoulReport\\"+ "EnsoulReport.html";
	
	public static void startReport()
	{
		htmlReporter = new ExtentHtmlReporter(reportPath);

		//initialize ExtentReports and attach the HtmlReporter
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		//To add system or environment info by using the setSystemInfo method.
		extent.setSystemInfo("Browser", browser);
		extent.setSystemInfo("Environment", environment);
		extent.setSystemInfo("Project Name", projectName);
		extent.setSystemInfo("Suite", suite);

		//configuration items to change the look and feel
		//add content, manage tests etc
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}

	public static void infoTest(String caseNo, String Description) throws Exception
	{
		String testResult = "Case No : " + caseNo + " &nbsp; <br /> &nbsp; Description : " + Description.substring(0, Math.min(Description.length(), 60)) + "...";
		test.info(MarkupHelper.createLabel(testResult, ExtentColor.BLUE));
	}
	
	public static void passTest(String object) throws Exception
	{
		test.pass(object);
	}

	public static void failTest(String object) throws Exception
	{
		System.out.println(11111);
		String path = currentDir + "\\Reports\\" + timeStamp +"_EnsoulReport\\Screenshots\\" + object;
		String screenshotpath=ScreenShots.getScreenshot(driver,path);
		System.out.println(3333);
		test.addScreenCaptureFromPath(screenshotpath);//add screenshot in report
		System.out.println(4444);
	//	String screenshotpath=Screenshot.getScreenshot(driver,result.getName());
		//test.addScreenCaptureFromPath(screenshotpath);//add screenshot in report
		
	}
	
	/*public static void infoTest(String message) throws Exception
	{
		test.info(message);
	}*/
}
