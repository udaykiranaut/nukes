package DataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLogin_Hard 
{
	WebDriver driver;
	@Test(dataProvider="wordpress_data")
	public void logintowordpress(String username , String password) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User is not able to login in due to invalid credentials");
		
		System.out.println("page title is verified and user is able to login successfully");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@DataProvider(name="wordpress_data")
	public Object[][] passData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "opensourcecms";
		data[0][1] = "opensourcecm";
		data[1][0] ="opensourcecms";
		data[1][1] ="opensourcecms";
		data[2][0] ="opensourcec";
		data[2][1] = "opensourcecm"	;
		return data;
	}

}
