package log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo1 {

	public static void main(String[] args)
	{
		Logger log1 = Logger.getLogger("LogDemo1");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		log1.info("driver set");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		log1.info("url set");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log1.info("10 seconds wait");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath(".//*[@id='email']"));
		WebElement element2 = driver.findElement(By.xpath(".//*[@id='pass']"));
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		log1.info("1 border highlet");
		element.sendKeys("udaykiran");
		log1.info("1 value sent");
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element2);
		log1.info("2 border highlet");
		element2.sendKeys("kiran");
		log1.info("2 value sent");
		
		try {
			Thread.sleep(5000);
			log1.info(" enetered into try");
		}catch(InterruptedException e) 
		{
			System.out.println(e.getMessage());
			log1.info("entered into catch");
		}
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element2);
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
	    }
	}
