package generic.utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import net.bytebuddy.implementation.bytecode.Throw;

public class ListenerImplementationWithExtentReport implements ITestListener{

	public ExtentReports reports;
	public static ExtentTest test;

	public void onTestStart(ITestResult result) {

		test=reports.createTest(result.getMethod().getMethodName()+" : execution started");
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+" : passed/suceed");
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,result.getMethod().getMethodName()+" : FAILed");
		test.log(Status.FAIL, result.getThrowable());
		String path=null;
		WebdriverUtility wutil=new WebdriverUtility();

		try {
			path=wutil.takeScreenShot(BaseClassBay.sDriver, result.getMethod().getMethodName());

		} catch (Exception e) {
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(path);
	}

	public void onStart(ITestContext context) {
		JavaUtility jutil=new JavaUtility();
		PropertyFileUtility putil=new PropertyFileUtility();
		
		//Since execution is started here, we have to configure extent Reports here.
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(System.getProperty("user.dir")+
				"./Reports/BAY_ExReport"+jutil.getSystemDateFormat()+".html");

		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("BAY Sanity Report");
		
		//attach report to exetentReports 
		reports=new ExtentReports();
		reports.attachReporter(reporter);

		reports.setSystemInfo("REPORTER NAME", "RATNADEEP");
		reports.setSystemInfo("Base Environment", "BAY Automation Testing");
		reports.setSystemInfo("platform", "WIndows");
		
		try {
			reports.setSystemInfo("Browser",putil.readDataFromPropertyFile("browser"));
			reports.setSystemInfo("Base URL", putil.readDataFromPropertyFile("BAY"));
		} catch (IOException e) {	
			e.printStackTrace();
		}
		

	}

	public void onFinish(ITestContext context) {
		
	//Mandatory because, this says all the test script execution is complete and final report
	//can be generated.
		reports.flush();
	}

	public void onTestSkipped(ITestResult result) {
		
		  throw new SkipException(result.getMethod().getMethodName()+" : Skipped");
		  
		
	}

}
