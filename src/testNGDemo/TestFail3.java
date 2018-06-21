package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestFail3
{
	public void wordpress()
	{
		Assert.assertTrue(false);
		System.out.println("wordpress workink as expected");
		
	}

}
