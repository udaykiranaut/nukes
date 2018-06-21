package baseClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WordLogin3 extends BaseClass3 
{
	@Test(priority=2,description="with valid data")
	public void loginData1() 
	{
		Reporter.log("---Now entering the details ---", true);
		driver.findElement(By.id("user_login")).sendKeys("opensourcecms");
		driver.findElement(By.id("user_pass")).sendKeys("opensourcecms");
		driver.findElement(By.id("wp-submit")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Reporter.log("---Clicked on login button---", true);	
			
	}
	
	@Test(priority=1,description="with invalid data")
	public void loginData2() 
	{
		Reporter.log("---Now entering the details ---", true);
		driver.findElement(By.id("user_login")).sendKeys("opensource");
		driver.findElement(By.id("user_pass")).sendKeys("opensource");
		driver.findElement(By.id("wp-submit")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Reporter.log("---Clicked on login button---", true);	
	}

}
