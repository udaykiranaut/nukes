package CromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailReg2 {

	public static void main(String[] args) {
		System.setProperty("webdrive.chrome.drive","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		

	}

}
