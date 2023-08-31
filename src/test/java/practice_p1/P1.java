package practice_p1;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.utilities.WebdriverUtility;

public class P1 {

	ChromeDriver driver;
	@BeforeMethod
	public void bcConfig() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("start-maximized");
		driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://best.com.kw/en/");
	}
	@Test
	public void testBay() throws AWTException, InterruptedException {
		WebElement element = driver.findElement(By.xpath("//h2[text()='Laptops ']"));
		WebdriverUtility wUtil=new WebdriverUtility();
		int y=0;
	for(;;) {
		try {
			 y=300;
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,"+y+")", element);
			WebElement lapEl = driver.findElement(By.xpath("//h3[text()=' Lenovo FLEX5/i5-11th/8/512/14\"/W11 ']"));
			lapEl.click();
			break;
		} catch (Exception e) {
			y=y+50;
		}
	}
		driver.findElement(By.xpath("//*[text()=' See Details']")).click();
		WebElement ele = driver.findElement(By.xpath("(//div[@class='main-cnt'])[4]"));
		System.out.println(ele.getText());
	
	}
	@AfterMethod
	public void acConfig() throws InterruptedException {
		Thread.sleep(2000);
	//	driver.quit();
			
	}
}
