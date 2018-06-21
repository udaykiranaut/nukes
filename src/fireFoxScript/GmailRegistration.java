package fireFoxScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create an account']")).click();
		 driver.findElement(By.id("FirstName")).sendKeys("uday2");
		 /*WebElement text1 = driver.findElement(By.id("FirstName"));
	        text1.clear();
	        text1.sendKeys("uday2");
*/
		
		driver.findElement(By.xpath("html/body/nav/div/a[3]")).click();
		//driver.findElement(By.id(id));
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("uday");
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/div")).click();
		driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("uday");
		driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys("kiran");
		driver.findElement(By.xpath(".//*[@id='GmailAddress']")).sendKeys("uday.kiran.shq23@gmail.com");
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("987654321#@!Q");
		driver.findElement(By.xpath(".//*[@id='PasswdAgain']")).sendKeys("987654321#@!Q");
		
		
	    Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")));
	    sel1.selectByIndex(5);
	    driver.findElement(By.xpath(".//*[@id='BirthDay']")).sendKeys("07");
	    driver.findElement(By.xpath(".//*[@id='BirthYear']")).sendKeys("1988");
	    Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='Gender']/div")));
	    sel2.selectByIndex(1);
	    driver.findElement(By.xpath(".//*[@id='RecoveryPhoneNumber']")).sendKeys("9160061475");
	    driver.findElement(By.xpath(".//*[@id='RecoveryEmailAddress']")).sendKeys("07udaykiran@gmail.com");
	    Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id=':i']")));
	    sel3.selectByValue("India");
	    
	    
		driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
		
		
	}

}
