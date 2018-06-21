package runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args)
	{
		TestNG runner = new TestNG();
		List<String> list1 = new ArrayList<String>();
		list1.add("E:\\selenium java basics\\SeleniumScripts\\test-output\\Smoke\\testng-failed.xml");
		runner.setTestSuites(list1);
		runner.run();

	}

}
