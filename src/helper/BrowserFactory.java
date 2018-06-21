package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory
{
	static WebDriver driver;
	public static WebDriver startBrowser(String browser_name,String url)
	{
		if(browser_name.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
			driver = new FirefoxDriver();
		}else if(browser_name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
			driver=new ChromeDriver();	
		}else if(browser_name.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","E:\\01 for testing\\selenium web drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
