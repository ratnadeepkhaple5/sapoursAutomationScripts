package generic.utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * This class consists of all basic configuration annotations of testNG
 * to perform common functionalities.
 * 
 * @author Ratnadeep_Khaple
 *
 */
public class BaseClass {

	public WebDriver driver=null;
	public WebdriverUtility wUtil=new WebdriverUtility();
	public PropertyFileUtility pUtil=new PropertyFileUtility();
	public JavaUtility jUtil=new JavaUtility();

	
	@BeforeMethod
	public void bcConfig() throws IOException, InterruptedException{
		//reading data from propertyFiles
		String BROWSER =pUtil.readDataFromPropertyFile("browser") ;
	//	String URL =pUtil.readDataFromPropertyFile("bay");
	//	String URL =pUtil.readDataFromPropertyFile("lulu");
		String URL =pUtil.readDataFromPropertyFile("altannaf");
		
		if (BROWSER.equalsIgnoreCase("chrome")){
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		}
		else if(BROWSER.equalsIgnoreCase("FIREFOX")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge")) {

			driver=new EdgeDriver();
		}
		else{
			System.out.println("invalid browser name");
		}
		
		wUtil.waitForDom(driver);
		wUtil.maximizeWindow(driver);
		driver.get(URL);
		Thread.sleep(4000);
		
	}
	
//	@AfterClass
	@AfterMethod
	public void acConfig() throws InterruptedException {
		Thread.sleep(3000);
	//	driver.quit();
	}
}
