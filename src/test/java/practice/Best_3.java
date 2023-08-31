package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Best_3 {

	
	@Test
	public void test2() throws InterruptedException, AWTException  {

		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://jsapps.ctxzq48eta-easahussa1-s1-public.model-t.cc.commerce.ondemand.com/en/");

		driver.findElement(By.xpath("//input[@placeholder='Search here...']")).sendKeys("dell laptops");
		
		driver.findElement(By.xpath("//a[text()=' Intel i7-12th Gen, Ram 16GB, Storage 1TB SSD, 2GB Dedi Graphics , Screen14 Inch, WIN 11']")).click();
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,180)");
		
		driver.findElement(By.xpath("//*[@class='ng-arrow-wrapper']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='ng-option-label ng-star-inserted']"));
		
		Iterator<WebElement> it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next().getText());
			
		}
	}
}
