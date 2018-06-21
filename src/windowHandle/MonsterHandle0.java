package windowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonsterHandle0 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		System.out.println("Parent window ID is " +parent);
		Set<String> all_windows = driver.getWindowHandles();
		int no = all_windows.size();
		System.out.println("Number of windows are " +no);
		for(String child:all_windows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				System.out.println("child window titile is " +driver.getTitle());
				
				Thread.sleep(6000);
				driver.close();
			}	
			driver.switchTo().window(parent);
			System.out.println("parent window titile is " +driver.getTitle());
		}
	}
}
