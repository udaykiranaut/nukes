package fireFoxScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTestCase {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\web drivers\\geckodriver\\geckodriver10.exe");
	WebDriver driver = new 	FirefoxDriver();
	driver.get("http://learn-automation.com");
	driver.manage().window().maximize();
	String s = driver.getTitle();
	System.out.println(s);
	Thread.sleep(5000);
	driver.quit();

	}

}
