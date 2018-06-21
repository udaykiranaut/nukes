package all_miscellaneous;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ScreenVoid 
{	
	
	@Test
	public void captureVoid(WebDriver driver,String filename)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(source, new File("E:\\01 for testing\\selinium mukesh\\0screenshot\\"+filename+".png"));
		} catch (Exception e)
		{
			System.out.println("The exception is " +e.getMessage());
			
		}
	}
}
