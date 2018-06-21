package IEScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestIeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","E:\\01 for testing\\selenium web drivers\\Ie driver 32\\IEDriverServer32.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("divUsername")).sendKeys("admin");
		
		

	}

}
