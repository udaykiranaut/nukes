package headlessBrowser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class phantomjs1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		File src = new File("E:\\01 for testing\\selinium mukesh\\phantomjs-2.1\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		lib.Utility.captureScreenShot(driver, "title2");
		
	}

}
