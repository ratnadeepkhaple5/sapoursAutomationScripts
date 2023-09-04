package bay_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import generic.utilities.BaseClassBay;
import generic.utilities.WebdriverUtility;
import object_Repo_BAY.HomePage_EleBAY;

public class FooterLinksNavigation extends BaseClassBay{

	@BeforeTest
	public void linkNavigation() throws AWTException, InterruptedException {	
		/*
		//scroll to footer	
		Thread.sleep(2000);
		Robot rb=new Robot();
		rb.mouseWheel(60);
		*/
	}

//navigate to each & every page	
	@Test
	public void aboutUsNavigation() throws AWTException, InterruptedException {
		Robot rb=new Robot();
		rb.mouseWheel(60);
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		Thread.sleep(2000);
		home.clickOnAboutUsLink();
		driver.close();
	}
	@Test
	public void faqNavigation() throws AWTException, InterruptedException {	
		Robot rb=new Robot();
		rb.mouseWheel(60);
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		Thread.sleep(2000);
		home.clickOnFaqLink();
		driver.close();
	}
	@Test
	public void ReturnPolicyNavigation() throws AWTException {
		Robot rb=new Robot();
		rb.mouseWheel(60);
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		home.clickOnReturnPolicyLink();	
		driver.close();
	}
}
