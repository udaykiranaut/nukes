package CromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownoadFile {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.seleniumhq.org/download/");
		driver.get("https://goo.gl/UgXCrm");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

	}

}
