package windowHandle;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonsterHandle3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		System.out.println("Parent window ID is " +parent);
		System.out.println(driver.getTitle());
		Set<String> all_windows = driver.getWindowHandles();
		int no = all_windows.size();
		System.out.println("Number of windows are " +no);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> tabs = new ArrayList<>(all_windows);
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.close();
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		driver.close();
	}
}
