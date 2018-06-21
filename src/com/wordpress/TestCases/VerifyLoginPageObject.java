package com.wordpress.TestCases;

import org.openqa.selenium.WebDriver;import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;
import com.wordpress.Pages.LoginPageNew;

import helper.BrowserFactory;

public class VerifyLoginPageObject 
{

	@Test
	public void checkValidUser() throws InterruptedException
	{
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	LoginPageNew log_pg_new = PageFactory.initElements(driver, LoginPageNew.class);
	log_pg_new.login_wordpress("opensourcecms", "opensourcecms");
	System.out.println("one");
	driver.quit();
	
	WebDriver driver2 = BrowserFactory.startBrowser("firefox", "https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	LoginPage log_pg_old = PageFactory.initElements(driver2, LoginPage.class);
	log_pg_old.loginToWordPress("opensourcecms","opensourcecms");
	System.out.println("two");
	driver2.quit();
	
	
		
	}
}
