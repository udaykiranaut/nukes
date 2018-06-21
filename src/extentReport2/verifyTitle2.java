package extentReport2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import screenCapture.ScreenString;

public class verifyTitle2
{
	ExtentReports report;
	ExtentTest	ext;
	WebDriver driver;
	@Test(priority=1)
	public void title()
	{
		//extent report 2.4
		report = new ExtentReports("E:\\01 for testing\\selinium mukesh\\Reports\\report1\\app_report2.html");
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		ext = report.startTest("Test-title");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		ext.log(LogStatus.INFO, "Browser started");
		
		driver.get("http://learn-automation.com/");
		ext.log(LogStatus.INFO, "Url is set");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Selenium"));
		System.out.println("The page titile is " +title);
		ext.log(LogStatus.PASS, "Title is verified");
	}
	
	/*@AfterMethod
	public void closeBrowser(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String str = ScreenString.captureString(driver, result.getName());
			//String str = SnapShot.captureScreenShot(driver, result);
		    ext.log(LogStatus.FAIL, "Title verification", str);
		}
		report.endTest(ext);
		report.flush();
		driver.get("E:\\01 for testing\\selinium mukesh\\Reports\\report1\\app_report2.html");
		
	}*/

}
