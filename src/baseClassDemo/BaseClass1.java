package baseClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass1 
{
	WebDriver driver;
	@BeforeMethod
	public void setUpApp(String url)
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		Reporter.log("---Browser session started ---", true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Reporter.log("---Website link is provided ---", true);
		
	}
	@Test
	public void userDetails(String user,String pass) 
	{
		Reporter.log("---Now entering the details ---", true);
		driver.findElement(By.id("user_login")).sendKeys(user);
		driver.findElement(By.id("user_pass")).sendKeys(pass);
		driver.findElement(By.id("wp-submit")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Reporter.log("---Clicked on login button---", true);	
	}
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
		Reporter.log("---Browser closed---", true);
	}

}
