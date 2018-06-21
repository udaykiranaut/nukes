package baseClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass2 
{
	WebDriver driver;
	@BeforeMethod
	public void setUpApp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		Reporter.log("---Browser session started ---", true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Reporter.log("---Website link is provided ---", true);
		
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
		Reporter.log("---Browser closed---", true);
	}

}
