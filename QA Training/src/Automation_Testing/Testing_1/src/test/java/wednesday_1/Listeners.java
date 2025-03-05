package wednesday_1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	 
	 public void onStart(ITestContext context) {
		   System.out.println("Test execution is started");
		  }
	 
	 public void onTestStart(ITestResult result) {
		 System.out.println("This test is started");
		  }
	
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("The test is passed");
	  }
	
	 public void onTestFailure(ITestResult result) {
		 	System.out.println("The test is failed");
		  }
	 
	 public void onTestSkipped(ITestResult result) {
		   System.out.println("The test is skipped");
		  }
	 
	 public void onFinish(ITestContext context) {
		   System.out.println("The execution is finished");
		  }

}
