package extentReport2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import screenCapture.ScreenString;

public class VerifyLink 
{

	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;
	@Test
	public void verifyBlogTitle()
	{
		report=new ExtentReports("E:\\01 for testing\\selinium mukesh\\Reports\\report1\\advreport2.html");
		logger=report.startTest("VerifyBlogTitle");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Browser started ");
		driver.get("http://www.learn-automation.com");
		logger.log(LogStatus.INFO, "Application is up and running");
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Selenium")); 
		logger.log(LogStatus.PASS, "Title verified");
	}
	@AfterMethod
	public void tearDown(ITestResult result)
		{
			if(result.getStatus()==ITestResult.FAILURE)
			{
			String str=ScreenString.captureString(driver, result.getName());
			String img = logger.addScreenCapture(str);
			logger.log(LogStatus.FAIL, "Title verification", img);
			}
			report.endTest(logger);
			report.flush();
			driver.get("E:\\01 for testing\\selinium mukesh\\Reports\\report1\\advreport2.html");
		}
	}
