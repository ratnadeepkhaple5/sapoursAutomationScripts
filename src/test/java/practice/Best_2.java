package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Best_2 {

	@Test
	public void test2() throws InterruptedException   {
//launch browser
		
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//to go url
		driver.get("https://jsapps.ctxzq48eta-easahussa1-s1-public.model-t.cc.commerce.ondemand.com/en/");
//search product
		driver.findElement(By.xpath("//input[@placeholder='Search here...']")).sendKeys("iphone");
//select sp.product
		driver.findElement(By.xpath("(//a[@class='cx-product-name'])[3]")).click();
//check and validate stock
		String expectedCheckAvailability="In Stock";
		String ActualcheckAvailability = driver.findElement(By.xpath("//span[@class='instock']")).getText();

		//System.out.println(ActualcheckAvailability);

		Assert.assertEquals(ActualcheckAvailability, expectedCheckAvailability);
//add to cart
		driver.findElement(By.xpath("//button[@class='btn add-to-cart-btn btn-block ng-star-inserted']")).click();
//add quantity
		driver.findElement(By.xpath("(//button[@aria-label='Add one more'])[2]")).click();
//proceed to checkout		
		driver.findElement(By.xpath("//*[.='proceed to checkout']")).click();
//continue as guest		
		driver.findElement(By.xpath("//a[text()=' Continue ']")).click();
//pass mobile no.		
		driver.findElement(By.name("mobileNumber")).sendKeys("99999981");
		Thread.sleep(2000);
//pass mail id		
		driver.findElement(By.name("email")).sendKeys("ratnanSingh@gmail.com");
//continue payment	
		driver.findElement(By.xpath("//*[text()=' Continue ']")).click();
//close the window	
		Thread.sleep(2000);
	//	driver.quit();
//pass otp=not possible
//		WebElement ele1 = driver.findElement(By.xpath("//input[@class='otp-input ng-pristine ng-valid ng-star-inserted ng-touched']"));
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].value='1'", ele1);
	}
}
