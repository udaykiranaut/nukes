package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGScript
{
	@Test(priority=1,description= "This test case will verify the user")
	public void login()
	{
		System.out.println("This is my first Test");
		Assert.assertEquals(12, 13);
	}
    @Test(priority=2,description="This Test case will open the admin module")
    public void admin() 
    {
    	System.out.println("This is the admin module");
    }
    @Test(priority=-3,description="This test checks the normal user page")
    public void user() {
    	System.out.println("This is the normal user");
    }
}
