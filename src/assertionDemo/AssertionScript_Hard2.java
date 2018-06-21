package assertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
//HardAssert Demo
public class AssertionScript_Hard2
{
	String str = "udaykiran";
	@Test
	public void test1()
	{
		
		Assert.assertTrue(str.contains("uday"));
		System.out.println("test case 1  ");		
	}
	@Test
	public void test2()
	{
		
		Assert.assertTrue(str.contains("kiran"));
		System.out.println("test case 2");
	}
	@Test
	public void test3()
	{
		
		Assert.assertTrue(str.contains("kumar"),"string doesnot match");
		System.out.println("test case 3");
	}
	@Test
	public void test4() {
		Assert.assertTrue(false);
		System.out.println("test case failed");
	}
	
}
