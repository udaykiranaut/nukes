package CromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int i = driver.findElements(By.tagName("iframe")).size();
		System.out.println(i);
		driver.get("file:///C:/Users/kiran/Desktop/myframes.html");
		driver.switchTo().frame("selenium");
		driver.switchTo().defaultContent();
		

	}

}
