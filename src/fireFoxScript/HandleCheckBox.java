package fireFoxScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> check  = driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
		for(int i=0;i<check.size();i++)
		{
			WebElement element = check.get(i);
			String element_value = element.getAttribute("id");
			System.out.println("The elements values are -- " +element_value);
			
			if(element_value.equalsIgnoreCase("code")) {
				element.click();
				Thread.sleep(5000);
				break;
				
			}
			
		}
		
		
		
		
		
		

	}

}
