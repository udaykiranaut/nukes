package CromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFileUpload {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/kiran/Desktop/fileupload.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/input")).click();
		Runtime.getRuntime().exec("C:\\Users\\kiran\\Desktop\\AutoIt scripts\\FileUpload.exe");
		driver.findElement(By.xpath("html/body/input")).click();
		Thread.sleep(10000);
		Runtime.getRuntime().exec("C:\\Users\\kiran\\Desktop\\AutoIt scripts\\FILE4.EXE");
		
		
		
		
		
		

	}

}
