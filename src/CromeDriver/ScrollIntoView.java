package CromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com/how-to-scroll-into-view-in-selenium-webdriver/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor je = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath(".//*[@id='comments']/ol/div[1]/div[1]/a"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		System.out.println(element.getText());
		
		
		
	}

}
