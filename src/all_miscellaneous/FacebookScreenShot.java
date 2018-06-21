package all_miscellaneous;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookScreenShot
{
	WebDriver driver;
	@Test(priority=1)
	public void login() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@name='email']")).sendKeys("07udaykiran@gmail.com");
		driver.findElement(By.xpath(".//*[@name='pass']")).sendKeys("as400yadu231#@!");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("E:\\01 for testing\\selinium mukesh\\0screenshot\\facebook.png"));
		
	}
	@Test(priority=2)
	public void logoff()
	{
		driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		driver.findElement(By.xpath(".//*[@class='_54ni navSubmenu _6398 _64kz __MenuItem']")).click();
	}

}
