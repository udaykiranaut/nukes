package fireFoxScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.quit();
		

	}

}
