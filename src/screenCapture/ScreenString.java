package screenCapture;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ScreenString 
{
	@Test
	public static String captureString(WebDriver driver,String name)
	{
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = "E:\\01 for testing\\selinium mukesh\\0screenshot\\scr1\\"+name+".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot Taken");
		return dest;
		}
		catch (Exception e) {
			System.out.println("The exception is " +e.getMessage());
			return e.getMessage();
		}
		
	}

}
