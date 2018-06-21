package headlessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.youtube.com/user/naveenanimation20/playlists");
		System.out.println(driver.getTitle());
		

	}

}
