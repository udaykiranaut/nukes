package baseClassDemo;

import org.testng.annotations.Test;

public class WordPressLogin 
{
	@Test
	public void loginData()
	{
		BaseClass1 bs = new BaseClass1();
		bs.setUpApp("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		bs.userDetails("opensourcecms", "opensourcecms");
		bs.closeApp();
		
	}
	
	

}
