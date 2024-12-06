package SeleniumTestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerEg implements ITestListener {
	

	@Override  
	public void onTestStart(ITestResult result) {  
	// TODO Auto-generated method stub  
		
		System.out.println("Execution started the onmashine");
	}  
	  
	@Override  
	public void onTestSuccess(ITestResult result) {  
	
	System.out.println("Success of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onTestFailure(ITestResult result) {  
	  
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onTestSkipped(ITestResult result) {  
	
	System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
	  
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onStart(ITestContext context) {  
	System.out.println("Started with testcase execution");
	}  
	  
	@Override  
	public void onFinish(ITestContext context) {  
	// TODO Auto-generated method stub  
		System.out.println("Finished with the testcase execution");
	}  
	}  
 

