package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ExpilcitWait
{
	WebDriver driver;
	
	@Test(priority=1)
	public void OpenBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\01 for testing\\selenium web drivers\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/search?q=timer");
		//driver.findElement(By.xpath(".//*[text()='Click me to start timer']")).click();
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		//WebElement element = driver.findElement(By.xpath("//p[text()='WebDriver']"));
		System.out.println(element.getText());
		
		
		boolean status = element.isDisplayed();
		if(status)
		{
			System.out.println("The element is displayed");
			System.out.println(element.getText());
			
		}
		else
		{
			System.out.println("The element is not displayed");
		}
				
	}
	
	
	@AfterClass
	public void quit()
	{
		driver.quit();
	}

}
