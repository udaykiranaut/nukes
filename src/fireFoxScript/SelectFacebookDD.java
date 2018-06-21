package fireFoxScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFacebookDD {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_dropdown);
		month_dd.selectByIndex(6);
		Thread.sleep(3000);
		month_dd.selectByValue("5");
		Thread.sleep(3000);
		month_dd.selectByVisibleText("Aug");
		WebElement date_dd =  driver.findElement(By.id("day"));
		Select day_d = new Select(date_dd);
		day_d.selectByVisibleText("7");
		Thread.sleep(3000);
		WebElement year_dd = driver.findElement(By.id("year"));
		Select year_d = new Select(year_dd);
		year_d.selectByVisibleText("1989");
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.id("u_0_5"));
		gender.click();
		Thread.sleep(3000);
		driver.quit();

	}

}
