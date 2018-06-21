package CromeDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
	     //driver.switchTo().alert().accept();
		Alert alt = driver.switchTo().alert();
		String act = alt.getText();
		System.out.println(act);
		String exp = "Please select start place.";
		Assert.assertEquals(act,exp);
		System.out.println("both strings are matching");
		alt.accept();
		driver.close();
		
		


	}

}
