package com.katalyst.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.katalyst.base.TestBase;

public class ScreenShots extends TestBase{

	public static String getScreenshot(WebDriver driver, String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = path+"_Fail.png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	public static void CreateDirectory(String DirectoryName)
	{
		//project directory
		String  dir = DirectoryName;
		
		//create a directory in the path
		File file = new File(dir);

		if (!file.exists()) {
			file.mkdir();
		} else {
			System.out.println("Directory is already exist!");
		}
	}
}
