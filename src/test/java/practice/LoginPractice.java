package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginPractice {

	@Test
	public void LoginTest() throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jsapps.ctxzq48eta-easahussa1-s1-public.model-t.cc.commerce.ondemand.com/en/login/register");
		Thread.sleep(3000);
		
	//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	//	WebElement checkEle = driver.findElement(By.xpath("//span[@role='checkbox']"));
	//	WebElement checkEle = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	//	wait.until(ExpectedConditions.elementToBeClickable(checkEle)).click();	
	//	JavascriptExecutor jse=(JavascriptExecutor)driver;
	//	jse.executeScript("arguments[0].click()",checkEle );
	//	Point loc =checkEle.getLocation(); 
	//	System.out.println(loc.x);//53
	//	System.out.println(loc.y);//467
	//	Thread.sleep(3000);
	//	Actions ac=new Actions(driver);
	//ac.moveToElement(checkEle).click().perform();
	
		
		
	}
}
