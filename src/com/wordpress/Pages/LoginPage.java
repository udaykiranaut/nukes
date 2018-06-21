/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * @author kiran
 *This class will store all the locators and methods of loginpage
 */

public class LoginPage()
{
	WebDriver driver;
	By username = By.id("user_login");
	By password = By.xpath(".//*[@id='user_pass']");
	By LoginButton = By.name("wp-submit");
	@Test
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void loginToWordPress(String user,String pass)
	{
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(LoginButton).click();
	}
	/*public void typeUserName(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	public void typePassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickOnLoginButton()
	{
		driver.findElement(LoginButton).click();
	}*/
}
