package LULU_Tests;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.utilities.JavaUtility;
import generic.utilities.WebdriverUtility;

public class Practice1 {

	@Test
	public void eleVisibilityCheckOnPLP() throws Exception {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
	//	EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//go to lulu-India		
		driver.get("https://stghybrisin.lulumea.com/en-in/");
		Thread.sleep(3000);
	for(;;) {
		try {
			WebElement ele = driver.findElement(By.xpath("//*[.='Voltas Inverter Split Air Conditioner 183V DZZ 1.5 Ton 3*']"));
			ele.click();
		//	Thread.sleep(2000);
			WebdriverUtility wutil=new WebdriverUtility();
			JavaUtility jutil=new JavaUtility();
			wutil.takeScreenShot(ele/*driver*/, "VoltasAC"+jutil.getRandomNumber());
			break;
		} catch (Exception e) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,20)");
			Thread.sleep(500);
		}
	}
	driver.quit();
	
//click on login		
	//	driver.findElement(By.xpath("//b[text()='Login']")).click();
//pass credentials
	//	driver.findElement(By.id("emailAddress")).sendKeys("ratan1234@gmail.com");
	//	driver.findElement(By.id("j_password")).sendKeys("test@1234");
//select checkbox
//		driver.findElement(By.xpath("//label[@class='form-check-label eclipsis ']")).click();
	/*
		List<WebElement> eles = driver.findElements(By.xpath("//li[@class='first-level with-dropdown']"));
		Iterator<WebElement> its = eles.iterator();
		while (its.hasNext()) {
			System.out.println(its.next().getText());
		}
		*/
		
		
	}
}
