package certificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CIE_browser {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver","E:\\01 for testing\\selenium web drivers\\IEDriverServer.exe");
		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.cacert.org/");
		driver.navigate ().to ("javascript:document.getElementById('overridelink').click()");
	}
}
