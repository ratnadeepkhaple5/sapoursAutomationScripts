package practice;

import java.awt.Robot;
import java.awt.desktop.FilesEvent;
import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class Best1 {

	@Test
	public void test() throws Exception  {
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jsapps.ctxzq48eta-easahussa1-s1-public.model-t.cc.commerce.ondemand.com/en/");
	//	driver.get("https://stg.best.com.kw/en/cart");
	/*	
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(4000);
		// to scroll down to end of the page	
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	*/
		Robot rb=new Robot();
//		Thread.sleep(4000);
//		rb.mouseWheel(40);
	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("(//h3[@class='cx-product-name'])[1]"));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		System.out.println(ele.getText());
		ele.click();
		Thread.sleep(2000);
		rb.mouseWheel(5);
		
		driver.findElement(By.xpath("//span[@class='ng-arrow-wrapper']")).click();
		List<WebElement> eles = driver.findElements(By.xpath("//span[@class='ng-option-label ng-star-inserted']"));
		
		Iterator<WebElement> its = eles.iterator();
		
		while (its.hasNext()) {
			System.out.println(its.next().getText());
			Thread.sleep(500);
		}
/*
 * 
	TakesScreenshot ts=(TakesScreenshot)driver;	
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot1"+System.nanoTime()+".png");
	FileHandler.copy(temp, dest);
	Thread.sleep(1500);
*/	

	
//	driver.quit();
		
	}

}
