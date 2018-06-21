package advancedReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyTitle 
{
	@Test
	public void title()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		//Extent report 1.4
		ExtentReports logger =  ExtentReports.get(VerifyTitle.class);
		logger.init("E:\\01 for testing\\selinium mukesh\\Reports\\advancedreport1.html", true);
		logger.startTest("Page Title Report");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Browser is up and ready");
		driver.get("http://learn-automation.com/");
		logger.log(LogStatus.INFO, "Application is up and ready");
		String title = driver.getTitle();
		logger.log(LogStatus.INFO, "Title captured");
		System.out.println(title);
		Assert.assertTrue(title.contains("Selenium"));
		logger.log(LogStatus.PASS, "Tite verified");
		logger.endTest();
		
	}
	

}
