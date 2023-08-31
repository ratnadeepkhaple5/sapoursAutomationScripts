package al_tannaf;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import generic.utilities.JavaUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class P1 {

	@Test
	public void test1() throws IOException {
	//	ChromeOptions options=new ChromeOptions();
	//	options.addArguments("--remote-allows-origins=*");
	//	WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(/*options*/);
		
		driver.get("https://www.altannaf.com/altannaf-ae/ar/home");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		JavaUtility js=new JavaUtility();
		File dest=new File("./BAYScreenShots/"+"al_dahra_Home"+js.getRandomNumber()+".png");
		
		FileHandler.copy(src, dest);
		System.out.println(dest.getAbsolutePath());
		
	}

}
