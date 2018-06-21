package fireFoxScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFacebookDD3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_dropdown);
		
		List<WebElement> month_list = month_dd.getOptions();
		int total_month = month_list.size();
		System.out.println("Total month count is " +total_month);
		for(WebElement ele:month_list)
		{
			String month_name = ele.getText();
			System.out.println(month_name);
			
		}
		
		
		
		

	}

}
