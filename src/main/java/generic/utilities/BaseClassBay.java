package generic.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassBay {

	public WebDriver driver=null;

	public WebdriverUtility wUtil=new WebdriverUtility();
	public PropertyFileUtility pUtil=new PropertyFileUtility();
	public JavaUtility jUtil=new JavaUtility();
	public static WebDriver sDriver;

	@BeforeMethod
	public void beforeConfig() throws IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	

		PropertyFileUtility putil=new PropertyFileUtility();
		driver.get(putil.readDataFromPropertyFile("BAY"));
		sDriver=driver;
	}

	@AfterMethod
	public void afterConfig() {

		driver.close();
	}
	/*
	 public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException
	    {
	        TakesScreenshot screenShot = (TakesScreenshot) driver;
	        File source = screenShot.getScreenshotAs(OutputType.FILE);
	        String destinationFile = System.getProperty("user.dir")+"\\reports\\"+ testCaseName +".png";
	        FileUtils.copyFile(source, new File(destinationFile));
	        return destinationFile;
	    }
	 */

	public static String takeScreenShots(String methodname) throws IOException {
		JavaUtility jUtil=new JavaUtility();
		TakesScreenshot ts = (TakesScreenshot)sDriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"./BAYScreenShots/BAY"+jUtil.getRandomNumber()+".png";
		File dest=new File(path);
		FileUtils.copyFile(src, dest);

		return path;
		//return dest.getAbsolutePath();

	}	
}
