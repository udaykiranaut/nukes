package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class DatePickerDynamic {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/div/label")).click();
		List<WebElement> dates = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']"));
		int total_nodes = dates.size();
		System.out.println(total_nodes);
		for(int k=0;k<total_nodes;k++)
		{
			String str = dates.get(k).getText();
			System.out.println(str);
			if(str.equalsIgnoreCase("21"))
			{
				dates.get(k).click();
				break;
			}
		}
		

}
}
