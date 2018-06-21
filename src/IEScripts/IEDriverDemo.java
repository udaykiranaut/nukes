package IEScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.ie.driver","E:\\01 for testing\\selenium web drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://www.learn-automation.com");
		
		System.out.println(driver.getTitle());
		//driver.quit();
		

	}

}
