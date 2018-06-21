package all_miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import screenCapture.ScreenVoid;

public class FaceDynamicScreen 
{
	WebDriver driver;
	@Test(priority=1)
	void login() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		ScreenVoid.captureVoid(driver, "url is set");
		driver.findElement(By.xpath(".//*[@name='email']")).sendKeys("07udaykiran@gmail.com");
		driver.findElement(By.xpath(".//*[@name='pass']")).sendKeys("as400yadu231#@!");
		ScreenVoid.captureVoid(driver, "user_name_password_entered");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		Thread.sleep(15000);
		ScreenVoid.captureVoid(driver, "facebook_home_page");
	}
	@Test(priority=2)
	public void logoff()
	{
		driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		ScreenVoid.captureVoid(driver, "before_log_off");
		driver.findElement(By.xpath(".//*[@id='js_3u']/div/div/ul/li[12]/a/span/span")).click();
		ScreenVoid.captureVoid(driver, "after_clicking_logoff");
		driver.quit();
	}

}
