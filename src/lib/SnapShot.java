package lib;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class SnapShot 
{
	public static String captureScreenShot(WebDriver driver ,ITestResult result)
	{
		
		try {
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String des = "E:\\selenium java basics\\CRM_Automation\\screenshots\\"+result +".png";
			File destination = new File(des);
			FileUtils.copyFile(source, destination);
			System.out.println("screenshot taken");
			return des;
		}
		catch (Exception e) {
			
			System.out.println("Exception while taking screen shot" +e.getMessage());
			return e.getMessage();
		} 
		}
	}
