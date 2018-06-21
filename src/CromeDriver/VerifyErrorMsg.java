package CromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class VerifyErrorMsg 
{
	WebDriver driver;
	@Test(priority=1)
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
		String error_msg = driver.findElement(By.xpath("//[@id='view_container']/div/div[2]/div/form/div[1]/div/div[2]/div[2]")).getText();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		System.out.println(error_msg);
		String expected_msg="Enter an email or phone number.";
		//Type 1
		Assert.assertEquals(error_msg, expected_msg,"both the messages are not equal");
		System.out.println("both the messages actual and expected are same");
		//Type 2
		//Assert.assertTrue(error_msg.contains("Enter an email"));
		//System.out.println("both the messages actual and expected are same");
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser closed");
	}

}
