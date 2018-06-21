package com.wordpress.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

public class VerifyWordPressLoginParameterized
{
	@Test
	public void verifyValidLogin()
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php?loggedout=true"); 
		LoginPage login = new LoginPage(driver);
		/*login.typeUserName("opensourcecms");
		login.typePassword("opensourcecms");
		login.clickOnLoginButton();*/
		login.loginToWordPress("opensourcecms", "opensourcecms");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.quit();
		
		
	}
	

}
