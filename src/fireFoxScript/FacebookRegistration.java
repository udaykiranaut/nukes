package fireFoxScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\01 for testing\\selenium web drivers\\geckodriver\\geckodriver10.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='u_0_h']")).sendKeys("uday");
		driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("kiran");
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel1.selectByIndex(6);
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel2.selectByValue("6");
		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByValue("1988");
		
		driver.findElement(By.xpath(".//*[@id='u_0_8']")).click();
		//driver.findElement(By.xpath(".//*[@id='u_0_z']")).click();
		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.quit();

	}

}
