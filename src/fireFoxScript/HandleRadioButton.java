package fireFoxScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleRadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> radio= driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		for(int i=0;i<radio.size();i++)
		{
			WebElement local_radio=radio.get(i);
			String value = local_radio.getAttribute("value");
			System.out.println("values from radio button " +value);
			if(value.equalsIgnoreCase("RUBY"))
			{
				local_radio.click();
				Thread.sleep(5000);
				
			}
		}
		driver.quit();
		

	}

}
