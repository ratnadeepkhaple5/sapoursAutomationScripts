package generic.utilities;

import java.io.IOException;
import java.time.Duration;

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
}
