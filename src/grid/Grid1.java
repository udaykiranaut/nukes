package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid1 {

	public static void main(String[] args) throws MalformedURLException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WINDOWS);
		URL url = new URL("http://localhost:4444/grid/console");
		WebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("http://learn-automation.com");
		System.out.println(driver.getTitle());
		driver.quit() ;

	}

}
