package CromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Function;

public class FluentWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
	     System.setProperty("webdriver.chrome.driver", "E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://seleniumpractise.blogspot.in/search?q=wait");
	     System.out.println(driver.getTitle());
	     driver.manage().window().maximize(); // maximize the window
	   //Implicit wait
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	     //
	     org.openqa.selenium.support.ui.FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	     wait.withTimeout(30, TimeUnit.SECONDS);
	     wait.pollingEvery(1, TimeUnit.SECONDS);
	     wait.ignoring(NoSuchElementException.class);
	     
	     WebElement element = wait.until(new Function<WebDriver, WebElement>()
	     {
	    	 public WebElement apply(WebDriver driver)
	    	 {
	    		 return driver.findElement(By.xpath("//p[text()='WebDriver']"));
	    	 }
	    	 
	     }
	     System.out.println("Element is displayed" +element.isDisplayed());
	     
	    /* boolean status = driver.findElement(By.xpath("//p[text()='WebDriver']")).isDisplayed();
	     if(status)
	     {
	    	 System.out.println("Test case passed");
	     }
	     else
	     {
	    	 System.out.println("Test case failed");
	     }*/
	}

	private static void ignoring(Class<NoSuchElementException> class1) {
		// TODO Auto-generated method stub
		
	}

	private static void pollingEvery(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}

	private static void withTimeout(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}

}
