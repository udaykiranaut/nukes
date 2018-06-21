package CromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenWebElement3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		List<WebElement> radio = driver.findElements(By.name("lang"));
		
		System.out.println( "the size of elements are " + radio.size());
		for(int i=0;i<radio.size();i++)
		{
			
			WebElement ele = radio.get(i);
			int x = ele.getLocation().getX();
			if(x!=0)
			{
				System.out.println(radio.get(i));
				System.out.println(" The x axis is " +x);
			    radio.get(i).click();
			    break;
			}
		}
	}
}
