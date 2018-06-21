package assertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo_soft1 {
	@Test(priority=1)
	public void softTest() {
		
		SoftAssert  sf1 = new SoftAssert();
		System.out.println("soft Test  started");
		sf1.assertEquals(12, 14,"both are not equal");
		System.out.println("after assert condition");
		sf1.assertAll();//object.assertAll() should be mandatory kept
		
	}
	@Test(priority=2)
	public void hardTest() {
		
		System.out.println("hard tested started");
		Assert.assertEquals(12, 13,"both are not equal");
		System.out.println("after assert condition");
	}
	@Test(priority=3)
	public void hardTest2() {
		System.out.println("test 3 started");
		Assert.assertEquals(12, 12);
		System.out.println("after assert condition");
	}

}
