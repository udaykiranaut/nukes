package handleAuthentication;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationDemo1 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
		WebDriver driver = new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.engprod-charter.net");
		Runtime.getRuntime().exec("C:\\Users\\kiran\\Desktop\\AutoIt scripts\\HandleAuthentication.exe");
		
		

	}

}
