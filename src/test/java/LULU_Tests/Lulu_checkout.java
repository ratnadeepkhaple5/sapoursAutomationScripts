package LULU_Tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import LULU_objectReposiratory.HomePage_lulu;
import generic.utilities.PropertyFileUtility;

public class Lulu_checkout {

	@Test
	public void checkoutTest() throws IOException, InterruptedException {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver drv=new ChromeDriver(options);
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PropertyFileUtility putil=new PropertyFileUtility();
//login
		drv.get(putil.readDataFromPropertyFile("lulu"));

		drv.findElement(By.xpath("//*[text()='Login']")).click();
		drv.findElement(By.id("emailAddress")).sendKeys("salunkepankaj5@gmail.com");

		drv.findElement(By.id("j_password")).sendKeys("Sapours@123");

		drv.findElement(By.xpath("//label[@class='form-check-label eclipsis ']")).click();

		drv.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
//search product
		HomePage_lulu hp=new HomePage_lulu(drv);
		hp.searchTextOnLulu("iphone");
		hp.clickSearchSubmitButton();
		drv.findElement(By.xpath("//*[@title='Apple iPhone 13 256 Starlight MLQ73']")).click();
		drv.findElement(By.id("addToCartButton")).click();
		drv.findElement(By.xpath("//a[@href='/en-in/cart']")).click();
//checkout
		drv.findElement(By.xpath("//input[@id='checkoutitems']")).click();
		Thread.sleep(3000);
		WebElement ele = drv.findElement(By.id("8886222127127-del"));
		JavascriptExecutor jse=(JavascriptExecutor)drv;
		jse.executeScript("arguments[0].click()",ele);
		drv.findElement(By.xpath("//button[@id='checkoutAddressNextBtn']")).click();
//payments		
		//Payubiz,Razorpay,Pine Labs
		drv.findElement(By.xpath("(//span[text()='Payubiz'])[1]")).click();
		Thread.sleep(2000);
		drv.findElement(By.id("redeembtn_credit_debit")).click();
	/*	Thread.sleep(4000);
		drv.findElement(By.xpath("//span[text()='Credit/Debit Card']")).click();

		drv.findElement(By.name("card[number]")).sendKeys("4111111111111111");

		drv.findElement(By.name("card[expiry]")).sendKeys("0224");

		drv.findElement(By.name("card[cvv]")).sendKeys("123");

		drv.findElement(By.name("card[name]")).sendKeys("pankaj Salunke");

		drv.findElement(By.id("pay-now")).click();
		Thread.sleep(3000);
		drv.findElement(By.xpath("//button[text()='Success']")).click();
		*/
	}
}
