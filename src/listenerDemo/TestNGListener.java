package listenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case started the TestCase details are  " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test case success the TestCase - -details are  " +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case filed the details are  " +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped the details are  " +result.getName());
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test case started -- on start -- the details are  " +context.getName());
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
