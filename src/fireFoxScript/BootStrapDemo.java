package fireFoxScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrapDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();

		List<WebElement> dd_menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		for(int i=0;i<dd_menu.size();i++)
		{
			WebElement element = dd_menu.get(i);
			String innerhtml = element.getAttribute("innerHTML");
			if(innerhtml.contentEquals("JavaScript")) {
				element.click();
				break;
				
			}
			System.out.println("values from dropdown "+innerhtml );
		}
		//driver.quit();
		
		
		
		
		

	}

}
