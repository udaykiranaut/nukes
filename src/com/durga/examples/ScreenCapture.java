package com.durga.examples;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScreenCapture 
{
	public static WebDriver driver;
	@Test(priority=1)
	public void capture1() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\01 for testing\\selenium web drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		Assert.assertEquals("Test", "Test123");
		
	}
	@Test(priority=2)
	public void capture2() throws Exception
	{
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		Assert.assertEquals("Test", "Test123");
	}
	@Test(priority=3)
	public void capture3()
	{
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Assert.assertEquals("Test", "Test123");
		
	}

}
