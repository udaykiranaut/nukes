package CromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement ele = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		int total_links = links.size();
		System.out.println("Total links are " +total_links);
		for(int i=0;i<total_links;i++)
		{
			WebElement ele2 = links.get(i);
			String text = ele2.getAttribute("innerHTML");
			boolean status = ele2.isEnabled();
			
			System.out.println("The link name is " +text  + "   and the status is " +status);
			if(text.equalsIgnoreCase("Appium"))
			{
				ele2.click();
				break;
			}
		}
		
		
		

	}

}
