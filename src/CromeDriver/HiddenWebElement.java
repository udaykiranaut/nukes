package CromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenWebElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@id='male']")).click();
		//driver.findElement(By.id("male")).click();
		int x = driver.findElement(By.id("male")).getLocation().getX();
		int y = driver.findElement(By.id("male")).getLocation().getY();
		System.out.println("X cordinate is " +x);
		System.out.println("y cordinate is " +y);
		

	}

}
