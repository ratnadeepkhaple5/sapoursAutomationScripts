package generic.utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

/**
 * This class provides implementation to all the abstract methods present in
 *  ITestListener interface
 *  
 * @author Ratnadeep
 *
 */

public class ListenerImplementationWithTestNGClass implements ITestListener{

	public void onTestStart(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" :Test Execution Started", true);
	}

	public void onTestSuccess(ITestResult result) {

		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+" :Test execution Succeed", true);
	}

	public void onTestFailure(ITestResult result) {
		WebdriverUtility wUtil=new WebdriverUtility();
		JavaUtility jUtil=new JavaUtility();

		String methodName=result.getMethod().getMethodName();

		String screenshotName = methodName+"-"+ jUtil.getSystemDate();

		try {
			wUtil.takeScreenShot(BaseClassBay.sDriver, screenshotName);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Reporter.log(methodName+" :Test Execution Failed", true);
		Reporter.log(result.getThrowable().toString()+" <-Reason of Failure", true);
	}

	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname+" <-is skipped",true);
		Reporter.log(result.getThrowable().toString()+" <-reason for skipped", false);
	}

	public void onStart(ITestContext context) {
		Reporter.log("Test Execution Started", true);
	}

	public void onFinish(ITestContext context) {
		Reporter.log("Test Execution Finished", true);
	}

}
