package headlessBrowser;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless_withlog {

	public static void main(String[] args) 
	{
		Logger log = Logger.getLogger("Headless1");
		PropertyConfigurator.configure("log4j.properties");
		log.info("Setting The chrome driver");
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		log.info("creating a object for HtmlUnitDriver");
		WebDriver driver = new HtmlUnitDriver();
		log.info("setting the url");
		driver.get("https://www.facebook.com/");
		log.info("copy the page title");
		System.out.println(driver.getTitle());
		log.info("printed the title");
	}

}
