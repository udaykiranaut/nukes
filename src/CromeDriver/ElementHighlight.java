package CromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementHighlight {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath(".//*[@id='email']"));
		WebElement element2 = driver.findElement(By.xpath(".//*[@id='pass']"));
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		element.sendKeys("udaykiran");
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element2);
		element2.sendKeys("kiran");
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element2);
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	    }
}
