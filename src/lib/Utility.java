package lib;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{
	public static void captureScreenShot(WebDriver driver ,String screenshotname) {
		
		try {
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			org.apache.commons.io.FileUtils.copyFile(source, new File("./ScreenShotsPhantomjs/"+screenshotname+".png"));
		} catch (Exception e) {
			
			System.out.println("Exception while taking screen shot" +e.getMessage());
		} 
		}
	}
