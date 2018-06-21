package objectRepositoryDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumChromeHard
{
	@Test
	public void testChrome() throws Exception
	{
		
		  File src = new File("./Configuration/Config.property");
		  FileInputStream fis = new FileInputStream(src);
		  Properties pro = new Properties();
		  pro.load(fis);
		  String chrompath = pro.getProperty("ChromeDriver");
		  
		  System.out.println("Chrome path is -- "+chrompath);
		  System.setProperty("webdriver.chrome.driver", chrompath);
		  WebDriver driver = new ChromeDriver();
		  String url = pro.getProperty("URL");
		  System.out.println("The url is ---" +url );
		  driver.get(url);
		
		
	}

}
