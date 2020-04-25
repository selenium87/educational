package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import execution.Base;

public class ListenerClass extends Base  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success of test cases and its details are : " + result.getName());
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failure of test cases and its details are : " + result.getName());
		try {
			screens(result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		try {
			screens(result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Failure of test cases and its details are : " + result.getName());
	}

	public void onStart(ITestResult result) {

	}

	public void onFinish(ITestResult result) {
		
	}
	
}
