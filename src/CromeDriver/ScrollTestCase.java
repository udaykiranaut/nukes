package CromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTestCase {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0,600)");
	}
			
		}

