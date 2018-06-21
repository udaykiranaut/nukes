package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class verifyTitle 
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifyPageTitle(String browser_name)
	{
		if(browser_name.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
			driver = new FirefoxDriver();
		}else if(browser_name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browser_name.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","E:\\01 for testing\\selenium web drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else if(browser_name.equalsIgnoreCase("opera"))
		{
			driver = new OperaDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
