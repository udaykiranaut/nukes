package windowHandle;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		System.out.println("Parent window ID is " +parent);
		driver.findElement(By.xpath("//a[contains(@href,'www.google.com')]")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[contains(@href,'www.facebook.com')][@name='link1']")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[contains(@href,'www.yahoo.com')][@name='link1']")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath(".//*[@id='post-body-6170641642826198246']/a[4]")).click();
		
		driver.switchTo().parentFrame();
		Set<String> all_windows = driver.getWindowHandles();
		int no = all_windows.size();
		System.out.println("Number of windows are " +no);
		ArrayList<String> tabs = new ArrayList<>(all_windows);
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("password");
		driver.close();
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("selenium");
		driver.close();
		driver.switchTo().window(tabs.get(2));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("udaykiran");
		driver.close();
		
		driver.switchTo().window(tabs.get(3));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//*[@name='q']")).sendKeys("driver");
		driver.close();
		
		
		
		
	}
}
