package com.katalyst.base;

import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.katalyst.util.Configuration;
import com.katalyst.util.PropertyManager;
import com.katalyst.util.Reports;
import com.katalyst.util.ScreenShots;
import com.katalyst.util.SendEmail;

public class TestBase {

	public static WebDriver driver;
	final static Logger log = Logger.getLogger(TestBase.class);
	Configuration getURL = new Configuration();
	public static String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	public static String currentDir = System.getProperty("user.dir");
	public static String browser = PropertyManager.getInstance().getBrowser();
	public static String projectName = PropertyManager.getInstance().getProject();
	public static String environment = PropertyManager.getInstance().getEnvironment();
	public static String testDataExcelPath = currentDir + "\\src\\test\\resources\\TestData.xlsx";
	public static String LoginSheetName = "Login";
	public static String suite = PropertyManager.getInstance().getSuite();

	/***************************************************************************************/
	/***************************************
	 * Configuration
	 ***********************************/
	/***************************************************************************************/
	@BeforeSuite
	public void setUp() throws Exception {
		openBrowser();
		get(Configuration.getURL());
		ScreenShots.CreateDirectory(currentDir + "\\" + "Reports");
		ScreenShots.CreateDirectory(currentDir + "\\Reports\\" + timeStamp + "_EnsoulReport");
		ScreenShots.CreateDirectory(currentDir + "\\Reports\\" + timeStamp + "_EnsoulReport\\Screenshots");
		Reports.startReport();
	}

	public static WebDriver openBrowser() {
		String browserName = browser;
		System.out.println("Started");
		log.info("Test is Starting");
		if (browserName.equalsIgnoreCase("firefox")) {
			String browser_path = currentDir + "/lib/Geckodriver/24.0/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", browser_path);
			FirefoxOptions options = getFirefoxOptions();
			driver = new FirefoxDriver(options);
		} else if (browserName.equalsIgnoreCase("chrome")) {
			String browser_path = currentDir + "/lib/Chromedriver/75.0/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", browser_path);
			ChromeOptions options = getChromeOptions();
			driver = new ChromeDriver(options);
		} else if (browserName.equalsIgnoreCase("ie")) {
			String browser_path = currentDir + "/lib/IEDriverServer/3.14/IEDriverServer.exe";

			DesiredCapabilities d = DesiredCapabilities.internetExplorer();
			d.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			d.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
			d.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);

			System.setProperty("webdriver.ie.driver", browser_path);
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	// Get Chrome Options
	public static ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-popup-blocking");
		return options;
	}

	// Get Firefox Options
	public static FirefoxOptions getFirefoxOptions() {
		FirefoxOptions options = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		profile.setPreference("network.proxy.type", 0);
		options.setCapability(FirefoxDriver.PROFILE, profile);
		return options;
	}

	@AfterSuite
	public static void tearDown() throws Exception {
		SendEmail.execute(projectName + ".html");
		driver.quit();
	}

	// Generate reports
	@AfterMethod
	public void getResult(ITestResult result) {
			if (result.getStatus() == ITestResult.FAILURE) {
				System.out.println(1);
		    Reports.test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() +" Test Case Failed ", ExtentColor.RED));
		    System.out.println(2);
		    Reports.test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			Reports.test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.GREEN));
		} else {
			Reports.test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED ", ExtentColor.ORANGE));
			Reports.test.skip(result.getThrowable());
		}
		Reports.extent.flush();
	}

	/***************************************************************************************/
	/***************************************
	 * Selenium methods
	 *******************************/
	/**************************************************************************************/

	// This method can Redirects or Navigate to particular URL
	public static void get(String url) throws Exception {
		try {
			if (url != null) {
				driver.get(url);
			}
		} catch (Exception e) {
			Reports.failTest(e.getMessage());
		}
	}

	// This method can Redirects or Navigate to particular URL
	public static void navigate(String url) throws Exception {
		try {
			if (url != null) {
				driver.navigate().to(url);
			}
		} catch (Exception e) {
			Reports.failTest(e.getMessage());
		}
	}

	// This method can click on any web-element
	public static void click(WebElement element, String object) throws Exception {
		try {
			if (isDisplayed(element) == true) {
				element.click();
				Reports.passTest(object);
			} else {
				Reports.failTest(object);
			}
		} catch (Exception e) {
			Reports.failTest(object + e.getMessage());
		}
	}

	// Taken 3 parameter, 1st for locator, 2nd string/text, 3rd for show that object
	// text on report
	public static void sendKeys(WebElement element, String str,String object) throws Exception {
	//	try {
			if (isDisplayed(element) == true) {
				element.sendKeys(str);
			//	Reports.passTest(str + " " + object);
//			} else {
//				Reports.failTest(object);
//			}
//		} catch (Exception e) {
//			Reports.failTest(object + e.getMessage());
		}
	}

	public static void javaScriptClear(WebElement element, String object) throws Exception {
		try {
			if (isDisplayed(element) == true) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].value = '';", element);
				Reports.passTest(object);
			} else {
				Reports.failTest(object);
			}
		} catch (Exception e) {
			Reports.failTest(object + e.getMessage());
		}
	}

	// To Switch to new window

	public static void switchTonewWndow(WebElement element, String object) throws Exception {

		try {
			if (isDisplayed(element) == true) {

				// Store the current window handle
				String winHandleBefore = driver.getWindowHandle();

				// Perform the click operation that opens new window

				// Switch to new window opened
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					Reports.passTest(object);
				}
			} else {
				Reports.failTest(object);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block

			Reports.failTest(object + e.getMessage());
			e.printStackTrace();
		}

	}

	// To verify text is present on screen.

	public static void isTextPresent(WebElement element, String str, String object) throws Exception {
		try {
			if (isDisplayed(element) == true) {

				String ActualResult = element.getText();
				String ExpectedResult = str;

				/*
				 * if(ActualResult.equals(ExpectedResult))
				 * 
				 * { Reports.passTest(object); }
				 */

				int Value = ActualResult.compareTo(ExpectedResult);
				if (Value >= 0) {
					Reports.passTest(object);
				} else {
					Reports.failTest(object);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reports.failTest(object + e.getMessage());

		}
	}

	// Method to clear the text box value

	public static void clear(WebElement element, String object) throws Exception {
		try {
			if (isDisplayed(element) == true) {

				element.clear();
				Reports.passTest(object);
			} else {
				Reports.failTest(object);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reports.failTest(object + e.getMessage());
			e.printStackTrace();
		}

	}

	// Get element text
	public static String getText(WebElement element, String object) throws Exception {
		String text = null;
		try {
			text = element.getText();
			Reports.passTest(object);
		} catch (Exception e) {
			Reports.failTest(object + e.getMessage());
		}
		return text;
	}

	// Get element value
	public static String getValue(WebElement element, String attribute, String object) throws Exception {
		String value = null;
		try {
			value = element.getAttribute(attribute);
			Reports.passTest(object);
		} catch (Exception e) {
			e.printStackTrace();
			Reports.failTest(object);
		}
		return value;
	}

	// Get element page title
	public static String getTitle(String object) throws Exception {
		String title = null;
		try {
			title = driver.getTitle();
			Reports.passTest(object);
		} catch (Exception e) {
			Reports.failTest(object + e.getMessage());
		}
		return title;
	}

	// Mouse over on element
	public static void mouseOver(WebElement element, String object) throws Exception {
		try {
			if (isDisplayed(element) == true) {
				Actions act = new Actions(driver);
				act.moveToElement(element).build().perform();
				Reports.passTest(object);
			} else {
				Reports.failTest(object);
			}
		} catch (Exception e) {
			Reports.failTest(object + e.getMessage());
		}
	}

	// Double click on element
	public static void contextClick(WebElement element, String object) throws Exception {
		try {
			if (isDisplayed(element) == true) {
				Actions act = new Actions(driver);
				act.contextClick(element).build().perform();
				Reports.passTest(object);
			} else {
				Reports.failTest(object);
			}
		} catch (Exception e) {
			Reports.failTest(object + e.getMessage());
		}
	}

	// Click And Hold on element
	public static void clickAndHold(WebElement element, String object) throws Exception {
		try {
			if (isDisplayed(element) == true) {
				Actions act = new Actions(driver);
				act.clickAndHold(element).build().perform();
				Reports.passTest(object);
			} else {
				Reports.failTest(object);
			}
		} catch (Exception e) {
			Reports.failTest(object + e.getMessage());
		}
	}

	// Drag And Drop the element
	public static void dragAndDrop(WebElement element1, WebElement element2, String object) throws Exception {
		try {
			if (isDisplayed(element1) && isDisplayed(element2) == true) {
				Actions act = new Actions(driver);
				act.dragAndDrop(element1, element2).build().perform();
				Reports.passTest(object);
			} else {
				Reports.failTest(object);
			}
		} catch (Exception e) {
			Reports.failTest(object + e.getMessage());
		}
	}

	// Move To Element
	public static void moveToElement(WebElement element, String object) throws Exception {
		try {
			if (isDisplayed(element) == true) {
				Actions act = new Actions(driver);
				act.moveToElement(element).build().perform();
				Reports.passTest(object);
			} else {
				Reports.failTest(object);
			}
		} catch (Exception e) {
			Reports.failTest(object + e.getMessage());
		}
	}

	// Move To Element
	public static void javaScriptMoveToElement(WebElement element, String object) throws Exception {
		try {
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("arguments[0].scrollIntoView()", element);

		} catch (Exception e) {
			Reports.failTest(object + e.getMessage());
		}
	}

	// Accept Alerts
	public static void acceptAlert(String object) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Reports.passTest(object);
		} catch (Exception e) {
			Reports.failTest(object + e.getMessage());
		}
	}

	// Dismiss Alerts
	public static void dismissAlert(String object) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			Reports.passTest(object);
		} catch (Exception e) {
			Reports.failTest(object + e.getMessage());
		}
	}

	// Select drop down element by Text
	public static void selectByVisibleText(WebElement element, String str, String object) throws Exception {

		if (isDisplayed(element) == true) {
			Select select = new Select(element);
			select.selectByVisibleText(str);
			Reports.passTest(object);
		} else {
			Reports.failTest(object);
		}
	}

	// Select drop down element by Value
	public static void selectByValue(WebElement element, String str, String object) throws Exception {

		if (isDisplayed(element) == true) {
			Select select = new Select(element);
			select.selectByValue(str);
			Reports.passTest(object);
		} else {
			Reports.failTest(object);
		}
	}

	// Select drop down element by Index
	public static void selectByIndex(WebElement element, int index, String object) throws Exception {

		if (isDisplayed(element) == true) {
			Select select = new Select(element);
			select.selectByIndex(index);
			Reports.passTest(object);
		} else {
			Reports.failTest(object);
		}
	}

	// Check is element display on web page
	public static boolean isDisplayed(WebElement element) throws Exception {
		boolean visible;
		try {
			element.isDisplayed();
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='2px solid green'", element);
			visible = true;
		} catch (Exception e) {
			visible = false;
		}
		return visible;
	}

	// Check is element Enabled on web page
	public static boolean isEnabled(WebElement element) {
		boolean visible;
		try {
			element.isEnabled();
			visible = true;
		} catch (Exception e) {
			visible = false;
		}
		return visible;
	}

	// Check is element Selected on web page
	public static boolean isSelected(WebElement element) {
		boolean visible;
		try {
			element.isSelected();
			visible = true;
		} catch (Exception e) {
			visible = false;
		}
		return visible;
	}

	// Wait for any element for specific seconds
	public static void waitForElement(WebElement element, int sec) throws Exception {
		Thread.sleep(1000);
		for (int second = 0; second <= sec; second++) {
			if (isDisplayed(element) == true) {
				break;
			}
			Thread.sleep(1000);
		}
	}

	public static void waitInvisibilityOf(WebElement element) throws Exception {
		Thread.sleep(1000);
		for (int second = 0; second <= 60; second++) {
			if (isDisplayed(element) != true) {
				break;
			}
			Thread.sleep(1000);
		}
	}

}
