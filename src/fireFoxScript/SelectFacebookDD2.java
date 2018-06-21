package fireFoxScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFacebookDD2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_dropdown);
		//before selection the value is 
		WebElement unselected_value = month_dd.getFirstSelectedOption();
		System.out.println("Before selection the value is " +unselected_value.getText());
		//after selection the value is 
		month_dd.selectByIndex(6);
		Thread.sleep(3000);
		WebElement selected_value = month_dd.getFirstSelectedOption();
		System.out.println("After selection selected value is " +selected_value.getText());
		driver.quit();
		
		
		

	}

}
