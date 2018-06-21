package CromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileupLoadDemo {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/kiran/Desktop/fileupload.html");
		//driver.findElement(By.cssSelector("html>body>input")).click();
		driver.findElement(By.xpath("html/body/input")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Runtime.getRuntime().exec("C:\\Users\\kiran\\Desktop\\AutoIt scripts\\FileUpload.exe");
	}

}
