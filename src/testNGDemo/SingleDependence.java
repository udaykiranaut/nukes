package testNGDemo;

import org.testng.annotations.Test;

public class SingleDependence {
	@Test
	public void startApp()
	{
		//Assert.assertEquals(12, 13);
		System.out.println("Starting the application");
	}
	@Test(dependsOnMethods="startApp")
	public void login()
	{
		System.out.println("loging to the application");
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		System.out.println("logout to the application");
	}

}
