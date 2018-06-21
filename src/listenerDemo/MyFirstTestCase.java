package listenerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerDemo.TestNGListener.class)
public class MyFirstTestCase 
{
	
	@Test
	public void googleTitleVerify()
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String s = driver.getTitle();
		System.out.println(s);
		driver.quit();
	}
	@Test
	public void titleMatch()
	{
		System.out.println("dummy cases");
		Assert.assertTrue(false);
	}
}
