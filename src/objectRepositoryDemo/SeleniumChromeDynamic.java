package objectRepositoryDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import propertyUtility.ConfigReader;

public class SeleniumChromeDynamic 
{
	ConfigReader reader;
	@BeforeTest
	public void setUp()
	{
		reader = new ConfigReader();
		String crm = reader.getChromePath();
		System.setProperty("webdriver.chrome.driver", crm);
		System.out.println(crm);
		System.out.println("===========SETUP READY ===============");
		
	}
	
	@Test
	public void testChrome() throws Exception
	{
		System.out.println("===========TEST READY ===============");
		WebDriver driver = new ChromeDriver();
		//String url = reader.getApplicationUrl();
		//driver.get(url);
		driver.get(reader.getApplicationUrl());
		Thread.sleep(2000);
		driver.close();
		System.out.println("===========TEST CLOSED ===============");
		
		
	}

}
