package CromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewIn {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		

	}

}
