package baseClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass3 
{
	WebDriver driver;
	@BeforeClass
	public void setUpApp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		Reporter.log("---Browser session started ---", true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Reporter.log("---Website link is provided ---", true);
		
	}
	
	@AfterClass
	public void closeApp()
	{
		driver.quit();
		Reporter.log("---Browser closed---", true);
	}

}
