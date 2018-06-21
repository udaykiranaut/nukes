package assertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
//HardAssert Demo
public class AssertionScript_Hard1
{
	@Test
	public void test1()
	{
		
		Assert.assertEquals(11, 11);
		System.out.println("succeessfully tested ");
				//HardAssert
	}
	@Test
	public void test2() 
	{
		System.out.println("Test case 2 started");
		Assert.assertEquals(12, 13,"count deosnt match");//prints this message if it fails
		System.out.println("Test case 2 failed");//does not print this line
		//HardAssert
	} 
	@Test
	public void test3()
	{
		System.out.println("Test case 3 started");
		Assert.assertEquals("hello", "hello","words do not match" );
		System.out.println("Test case 3 failed");//prints this line as condition is passed
		
	}
}
