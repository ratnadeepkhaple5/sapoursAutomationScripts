package bay_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
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

		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 */
	}
	//navigate to each & every page	
	@Test
	public void aboutUsNavigation() throws AWTException, InterruptedException {

		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		Thread.sleep(2000);
		home.clickOnAboutUsLink();
		driver.close();
	}
	@Test
	public void faqNavigation() throws AWTException, InterruptedException {	
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		Thread.sleep(2000);
		home.clickOnFaqLink();
		driver.close();
	}
	@Test
	public void ReturnPolicyNavigation() throws AWTException {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		home.clickOnReturnPolicyLink();	
		driver.close();
	}

	@Test
	public void contactUsLinkNavigation() throws AWTException {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		home.clickOnAboutUsLink();	
		driver.close();
	}
	@Test
	public void HeplLinkNavigation() throws AWTException {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		home.clickOnHelpLink();
		driver.close();
	}
	@Test
	public void StoreLocatorLinkNavigation() throws AWTException {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		home.clickOnStoreLocatorLink();
		driver.close();
	}

	@Test
	public void siteMapLinkNavigation() throws AWTException {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		home.clickOnSiteMapLink();
		driver.close();
	}


	@Test
	public void youTubeLinkNavigation() throws AWTException {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		home.clickOnyouTubeLink();
		driver.close();
	}

	@Test
	public void InstagramLinkNavigation() throws AWTException {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		home.clickOnInstagramLink();
		driver.close();
	}

	@Test
	public void LinkedInLinkNavigation() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		home.clickOnLinkedInLink();
		driver.close();
	}


	@Test
	public void FacebookLinkNavigation() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		home.clickOnFacebookLink();
		driver.close();
	}

	@Test
	public void TwitterLinkNavigation() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		HomePage_EleBAY home=new HomePage_EleBAY(driver);
		home.clickOnTwitterLink();
		driver.close();
	}
}
