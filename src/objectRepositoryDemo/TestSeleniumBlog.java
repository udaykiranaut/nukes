package objectRepositoryDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestSeleniumBlog
{
	@Test
	public void testConfig() throws Exception
	{
		//File src = new File("E:\\selenium java basics\\SeleniumScripts\\Configuration\\Config.property");
		  File src = new File("./Configuration/Config.property");
		  FileInputStream fis = new FileInputStream(src);
		  Properties pro = new Properties();
		  pro.load(fis);
		  String chrompath = pro.getProperty("ChromeDriver");
		  System.out.println("Chrome path is -- "+chrompath);
		  
		  
				
		
	}
}
