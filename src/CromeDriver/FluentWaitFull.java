package CromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import com.google.common.base.Function;
public class FluentWaitFull {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
    driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
    FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
    wait.withTimeout(30, TimeUnit.SECONDS);
    wait.pollingEvery(1, TimeUnit.SECONDS);
    wait.ignoring(NoSuchElementException.class);
    WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	@Override
	public WebElement apply(WebDriver arg0) 
     {
		WebElement ele = arg0.findElement(By.xpath("//p[@id='demo']"));
		String value = ele.getAttribute("innerHTML");
		if (value.equalsIgnoreCase("WebDriver")) 
            {
		System.out.println("Value is >>> " + value);
		return ele;
		}
      else { 
	       System.out.println("Value is >>> " + value);
           return null;
         }
        }
        });
private static void pollingEvery(int i, TimeUnit seconds) {
	// TODO Auto-generated method stub
	
}

private static void withTimeout(int i, TimeUnit seconds) {
	// TODO Auto-generated method stub
	
}
}