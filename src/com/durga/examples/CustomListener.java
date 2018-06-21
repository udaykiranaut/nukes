package com.durga.examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

public class CustomListener extends TestListenerAdapter
{
	@Test
	public void onTestFailure(ITestResult tr) 
	{
		File scrFile = ((TakesScreenshot)ScreenCapture.driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			FileUtils.copyFile(scrFile, new File("E:\\01 for testing\\selinium mukesh\\0screenshot\\" +tr.getName() +".png"));
		} catch (IOException e) {
			System.out.println("The error is " +e.getMessage());
		}
		
	}

}
