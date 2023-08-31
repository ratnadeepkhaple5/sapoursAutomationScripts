package BAY_HomePageScenario;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.utilities.BaseClass;
import generic.utilities.WebdriverUtility;
import object_Repo_BAY.HomePage_EleBAY;

public class LoginPageScenarioTest extends BaseClass {
	@Test
	public void loginToBAY() throws InterruptedException, AWTException {
		wUtil.waitForDom(driver);
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);

		hp.getLoginIcon().click();
		//pass email ID	
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("ratnadeep.khaple@sapours.co.in");
		//Thread.sleep(2000);
		//pass password	
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Bhavani$555");
		/*eckBox
		//select ch
		WebElement ele = driver.findElement(By.xpath("//span[@role='checkbox']"));
		wUtil.mouseHoverOn(driver, ele);
		Thread.sleep(2000);	
		wUtil.clickUsingJSE(driver, ele);
	//click on sign in button
		driver.findElement(By.xpath("//button[text()=' Sign in ']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		 */
	}
	@Test
	public void createAccount() throws InterruptedException {
		HomePage_EleBAY hp=new HomePage_EleBAY(driver);
		hp.getLoginIcon().click();
		//click on create account button
		driver.findElement(By.xpath("//a[text()=' Create an Account ']")).click();
		Thread.sleep(2000);
		//pass email id
		driver.findElement(By.name("email")).sendKeys("dummy123@gmail.com");
		//pass password
		driver.findElement(By.name("password")).sendKeys("Dummy123");
		//pass confirm password
		driver.findElement(By.name("confirmpassword")).sendKeys("Dummy123");
		//pass firstName
		driver.findElement(By.name("firstname")).sendKeys("Dummy");
		//pass Last-name	
		driver.findElement(By.name("lastname")).sendKeys("tummy");
		//select check-box
		driver.findElement(By.name("termsandconditions")).click();
		Thread.sleep(3000);
		WebdriverUtility wutil=new WebdriverUtility();

		try {
		wutil.clickUsingJSE(driver,driver.findElement(By.id("recaptcha-anchor")));

		} catch (Exception e) {
			System.out.println("can not automate captcha");	
		}
	}
}
