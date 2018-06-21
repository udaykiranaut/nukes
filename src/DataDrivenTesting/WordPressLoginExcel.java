package DataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import poiHelper.ExcelDataConfig2;

public class WordPressLoginExcel 
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
		Thread.sleep(2000);
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
		ExcelDataConfig2 config = new ExcelDataConfig2("E:\\selenium java basics\\SeleniumScripts\\TestData\\WordPressData.xlsx");
		int row = config.getRowCount(0);
		System.out.println("The number of rows are --" +row);
		Object[][] data = new Object[row][2];
		for(int i=0;i<row;i++)
		{
		   data[i][0] = config.getData(0, i, 0);
		   data[i][1] = config.getData(0, i, 1);   
		}
		return data;
	}

}
